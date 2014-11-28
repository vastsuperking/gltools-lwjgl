package gltools.gl.lwjgl.glfw;

import org.lwjgl.system.glfw.GLFW;

import gltools.display.Monitor;

public class GLFWMonitor implements Monitor {
	private static GLFWMonitor s_primary = null;
	
	private long m_id;
	
	static {
		GLFWLoader.s_ensureIntialized();
	}
	
	public GLFWMonitor(long id) {
		m_id = id;
	}
	
	public long getID() {
		return m_id;
	}
	
	public static GLFWMonitor s_getPrimaryMonitor() {
		if (s_primary == null) {
			s_primary = new GLFWMonitor(GLFW.glfwGetPrimaryMonitor());
		}
		return s_primary;
	}
}
