package gltools.gl.lwjgl;

import gltools.gl.CurrentGL;
import gltools.gl.GL;
import gltools.gl.GL1;
import gltools.gl.GL2;
import gltools.gl.GL3;
import gltools.gl.GL4;
import gltools.gl.GLVersion;
import gltools.gl.lwjgl.glfw.GLFWWindow;

import java.io.File;

import org.lwjgl.opengl.GLContext;

public class LWJGLGL extends LWJGLGL4 implements GL {
	private GLContext m_context;
	private GLFWWindow m_window;
	
	public LWJGLGL(GLFWWindow window) {
		//Super null and then override getContext() - cannot use this
		super(null);
		m_window = window;
	}
	
	@Override
	public LWJGLGL getContext() {
		return this;
	}
	
	public void init() {
		if (!m_window.isInitialized())
			throw new RuntimeException("Window not initialized!");
		if (!LWJGLNativesLoader.isLoaded()) LWJGLNativesLoader.load(new File(System.getProperty("user.home") + "/.gltools/lwjgl"));
		CurrentGL.s_makeCurrent(this);
		m_window.makeCurrent();
		m_context = GLContext.createFromCurrent();
	}
	
	public void destroy() {
		
	}
	
	public void makeCurrent() {
		if (!m_window.isInitialized())
			throw new RuntimeException("Window not initialized!");
		CurrentGL.s_makeCurrent(this);
		m_window.makeCurrent();
		org.lwjgl.opengl.GL.setCurrent(m_context);
	}
	public void releaseCurrent() {
		m_window.releaseCurrent();
		org.lwjgl.opengl.GL.setCurrent(null);
		CurrentGL.s_releaseCurrent(this);
	}
	public boolean isCurrent() {
		return CurrentGL.s_isCurrent(this);
	}
	
	@Override
	public GLVersion getGLVersion() {
		String version = getGL1().glGetString(GL1.GL_VERSION);
		String[] parts = version.split(".");
		int major = Integer.parseInt(parts[0]);
		int minor = Integer.parseInt(parts[1]);
		return new GLVersion(major, minor);
	}

	@Override
	public GL1 getGL1() {
		return this;
	}

	@Override
	public GL2 getGL2() {
		return this;
	}

	@Override
	public GL3 getGL3() {
		return this;
	}

	@Override
	public GL4 getGL4() {
		return this;
	}
	
}
