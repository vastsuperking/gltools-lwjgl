package gltools.gl.lwjgl.glfw;

import glcommon.input.Keyboard;
import glcommon.util.ResourceLocator.ClasspathResourceLocator;
import gltools.gl.GL1;

import org.lwjgl.system.glfw.GLFW;

public class GLFWKeyboard extends Keyboard {
	private static String CONFIG_LOCATION = "Config/Keyboard/glfw_keys.xml";

	private GLFWWindow m_window;
	
	protected GLFWKeyboard(GLFWWindow window) {
		m_window = window;
		try {
			readXMLKeyConfig(CONFIG_LOCATION, new ClasspathResourceLocator());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void poll() {}
	
	protected void character(GLFWWindow window, char c) {}
	protected void key(GLFWWindow window, int keycode, int scancode, 
											int action, int mods) {
		boolean state = false;
		switch (action) {
		case GLFW.GLFW_RELEASE: state = false; break;
		case GLFW.GLFW_PRESS: state = true; break;
		//Ignore holding character
		case GLFW.GLFW_REPEAT: return;
		default: throw new RuntimeException("Action: " + action + " not recognized!");
		}
		updateState(getKey(keycode), state);
	}
}
