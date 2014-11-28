package gltools.gl.lwjgl;

import gltools.gl.GL;
import gltools.gl.GL1;
import gltools.gl.GL2;
import gltools.gl.GL3;
import gltools.gl.GL4;
import gltools.gl.GLVersion;

import java.io.File;

import org.lwjgl.opengl.GLContext;

public class LWJGLGL extends LWJGLGL4 implements GL {
	private GLContext m_context;
	
	public LWJGLGL() {}
	
	public void init() {
		if (!LWJGLNativesLoader.isLoaded()) LWJGLNativesLoader.load(new File(System.getProperty("user.home") + "/.gltools/lwjgl"));
		m_context = GLContext.createFromCurrent();
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
