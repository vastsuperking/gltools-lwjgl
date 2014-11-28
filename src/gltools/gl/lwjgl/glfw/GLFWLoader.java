package gltools.gl.lwjgl.glfw;

import org.lwjgl.opengl.GL11;
import org.lwjgl.system.glfw.ErrorCallback;
import org.lwjgl.system.glfw.GLFW;

public class GLFWLoader {
	private static boolean s_initialized = false;
	
	
	public static void s_ensureIntialized() {
		if (!s_initialized) {
			GLFW.glfwSetErrorCallback(ErrorCallback.Util.getDefault());
			if (GLFW.glfwInit() != GL11.GL_TRUE) {
				throw new IllegalStateException("Unable to initialize GLFW");
			}
			
			s_initialized = true;
		}
	}
}
