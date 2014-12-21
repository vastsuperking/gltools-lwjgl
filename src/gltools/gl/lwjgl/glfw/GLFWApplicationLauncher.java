package gltools.gl.lwjgl.glfw;

import glcommon.input.Keyboard;
import glcommon.input.Mouse;
import glcommon.util.Timer;
import gltools.display.GLApplication;
import gltools.display.ResizeListener;
import gltools.gl.GL;

public class GLFWApplicationLauncher implements Runnable {
	private GLApplication m_application;
	
	public GLFWApplicationLauncher(GLApplication app) {
		m_application = app;
	}
	
	public void run() {
		GLFWWindow display = new GLFWWindow(1024, 1024, "Renderer2DTest");
		display.setResizable(true);
		display.setVisible(true);
		display.init();
		
		Keyboard keyboard = display.getKeyboard();
		Mouse mouse = display.getMouse();
		
		final GL gl = display.getGL();
		gl.makeCurrent();
		
		m_application.init(gl, mouse, keyboard, display.getWidth(), display.getHeight());
		
		display.addResizedListener(new ResizeListener() {
			public void onResize(int width, int height) {
				m_application.resize(gl, width, height);
			}
		});
		
		Timer timer = new Timer();
		
		timer.mark();
		while (!keyboard.isKeyPressed(keyboard.getKey("ESCAPE")) && !display.closeRequested()) {
			gl.glViewport(0, 0, display.getWidth(), display.getHeight());
			m_application.render(gl);
			timer.mark();
			mouse.poll();
			keyboard.poll();
			m_application.update(timer.getDeltaMillis());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			display.update();
		}
		display.destroy();
	}
}
