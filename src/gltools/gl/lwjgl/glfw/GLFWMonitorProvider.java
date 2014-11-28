package gltools.gl.lwjgl.glfw;

import gltools.display.Monitor;
import gltools.display.MonitorProvider;

public class GLFWMonitorProvider implements MonitorProvider {
	@Override
	public Monitor getPrimaryMonitor() {
		return GLFWMonitor.s_getPrimaryMonitor();
	}
	
}
