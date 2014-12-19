package gltools.gl.lwjgl.glfw;

import gltools.display.FileDropListener;
import gltools.display.Monitor;
import gltools.display.MoveListener;
import gltools.display.ResizeListener;
import gltools.display.Window;
import gltools.display.WindowStateListener;
import gltools.gl.lwjgl.LWJGLGL;
import gltools.gl.lwjgl.LWJGLNativesLoader;

import java.io.File;
import java.util.HashSet;

import org.lwjgl.PointerBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.glfw.GLFW;
import org.lwjgl.system.glfw.WindowCallback;


public class GLFWWindow implements Window {
	private int m_width = 1;
	private int m_height = 1;
	private int m_x = 0;
	private int m_y = 0;
	
	private long m_id = -1;
	
	private boolean m_fullscreen = false;
	private boolean m_resizable = false;
	private boolean m_visible = false;
	
	private String m_title;
	
	//Monitor for fullscreen
	private GLFWMonitor m_monitor = null;
	
	private HashSet<ResizeListener> m_resizeListeners = new HashSet<ResizeListener>();
	private HashSet<FileDropListener> m_fileListeners = new HashSet<FileDropListener>();
	private HashSet<MoveListener> m_moveListeners = new HashSet<MoveListener>();
	private HashSet<WindowStateListener> m_stateListeners = new HashSet<WindowStateListener>();
	
	private GLFWKeyboard m_keyboard;
	private GLFWMouse m_mouse;
	
	private LWJGLGL m_context;
	
	
	static {
		if (!LWJGLNativesLoader.isLoaded()) LWJGLNativesLoader.load(new File(System.getProperty("user.home") + "/.gltools/lwjgl"));
		GLFWLoader.s_ensureIntialized();
	}
	
	public GLFWWindow(int width, int height, String title) {
		m_width = width;
		m_height = height;
		m_title = title;

		m_keyboard = new GLFWKeyboard(this);
		m_mouse = new GLFWMouse(this);
	}
	public GLFWWindow(int width, int height) {
		this(width, height, "");
	}
	public GLFWWindow() {
		m_keyboard = new GLFWKeyboard(this);
		m_mouse = new GLFWMouse(this);
	}

	public long getID() { return m_id; }

	@Override
	public int getWidth() { return m_width; }
	@Override
	public int getHeight() { return m_height; }
	@Override
	public int getX() { return m_x; }
	@Override
	public int getY() { return m_y; }
	@Override
	public LWJGLGL getGL() { return m_context; }
	@Override
	public GLFWMouse getMouse() { return m_mouse; }
	@Override
	public GLFWKeyboard getKeyboard() { return m_keyboard; }
	@Override
	public GLFWMonitorProvider getMonitorProvider() { return new GLFWMonitorProvider(); }
	@Override
	public boolean isResizable() { return m_resizable; }
	@Override
	public boolean isFullscreen() { return m_fullscreen; }
	@Override
	public boolean isVisible() { return m_visible; }
	@Override
	public boolean isInitialized() { return m_id != -1; }
	@Override
	public String getTitle() { return m_title; }
	
	
	
	@Override
	public void useFullscreen(Monitor monitor) {
		if (m_id != -1) throw new RuntimeException("Cannot set to fullscreen after init()");
		if (!(monitor instanceof GLFWMonitor)) throw new RuntimeException("Not a GLFWMonitor");
		m_monitor = (GLFWMonitor) monitor;
	}
	@Override
	public void setResizable(boolean resizable) {
		m_resizable = resizable;
		if (m_id != -1) GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE,  m_resizable ? GL11.GL_TRUE : GL11.GL_FALSE);
	}
	@Override
	public void setVisible(boolean visible) {
		m_visible = visible;
		if (m_id != -1) {
			if (visible) GLFW.glfwShowWindow(m_id);
			else GLFW.glfwHideWindow(m_id);
		}
	}
	@Override
	public void setTitle(String title) { 
		m_title = title;
		if (m_id != -1) GLFW.glfwSetWindowTitle(m_id, m_title == null ? "" : m_title);
	}
	@Override
	public void setX(int x) {
		if (m_x == x) return;
		m_x = x;
		GLFW.glfwSetWindowPos(m_id, m_x, m_y);
		synchronized(m_moveListeners) {
			for (MoveListener l : m_moveListeners) {
				l.windowMoved(this, m_x, m_y);
			}
		}
	}
	@Override
	public void setY(int y) {
		if (m_y == y) return;
		m_y = y;
		GLFW.glfwSetWindowPos(m_id, m_x, m_y);
		synchronized(m_moveListeners) {
			for (MoveListener l : m_moveListeners) {
				l.windowMoved(this, m_x, m_y);
			}
		}
	}
	@Override
	public void setPosition(int x, int y) {
		if (m_x == x && m_y == y) return;
		m_x = x;
		m_y = y;
		GLFW.glfwSetWindowPos(m_id, m_x, m_y);
		synchronized(m_moveListeners) {
			for (MoveListener l : m_moveListeners) {
				l.windowMoved(this, m_x, m_y);
			}
		}
	}
	@Override
	public void setSize(int width, int height) {
		m_width = width;
		m_height = height;
		if (m_id != -1) {
			GLFW.glfwSetWindowSize(m_id, width, height);
			synchronized(m_resizeListeners) {
				for (ResizeListener rl : m_resizeListeners) {
					rl.onResize(width, height);
				}
			}
		}
	}



	@Override
	public void addResizedListener(ResizeListener l) {
		synchronized(m_resizeListeners) {
			m_resizeListeners.add(l);
		}
	}
	@Override
	public void addFileDropListener(FileDropListener l) {
		synchronized(m_fileListeners) {
			m_fileListeners.add(l);
		}
	}
	@Override
	public void addMoveListener(MoveListener l) {
		synchronized(m_moveListeners) {
			m_moveListeners.add(l);
		}
	}
	@Override
	public void addStateListener(WindowStateListener l) {
		synchronized(m_stateListeners) {
			m_stateListeners.add(l);
		}
	}
	
	@Override
	public void init() {
		GLFW.glfwDefaultWindowHints();
		GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE,  m_resizable ? GL11.GL_TRUE : GL11.GL_FALSE);
		
		long monitor = m_monitor == null ? MemoryUtil.NULL : m_monitor.getID();
		
		if (m_title == null) m_title = "";
		m_id = GLFW.glfwCreateWindow(m_width, m_height, m_title, monitor, MemoryUtil.NULL);
		if (m_id == MemoryUtil.NULL) throw new RuntimeException("Failed to create window");
		
		WindowCallback.set(m_id, new WindowCallback() {
			@Override
			public void windowPos(long window, int xpos, int ypos) {
				m_x = xpos;
				m_y = ypos;
				synchronized(m_moveListeners) {
					for (MoveListener l : m_moveListeners) {
						l.windowMoved(GLFWWindow.this, m_x, m_y);
					}
				}
			}

			@Override
			public void windowSize(long window, int width, int height) {
				//On resize
				m_width = width;
				m_height = height;
				synchronized(m_resizeListeners) {
					for (ResizeListener rl : m_resizeListeners) {
						rl.onResize(width, height);
					}
				}
			}

			@Override
			public void windowClose(long window) {
				synchronized(m_stateListeners) {
					for (WindowStateListener l : m_stateListeners) {
						l.windowClosed(GLFWWindow.this);
					}
				}
			}

			@Override
			public void windowRefresh(long window) {
				synchronized(m_stateListeners) {
					for (WindowStateListener l : m_stateListeners) {
						l.windowRefresh(GLFWWindow.this);
					}
				}
			}

			@Override
			public void windowFocus(long window, int focused) {
				synchronized(m_stateListeners) {
					for (WindowStateListener l : m_stateListeners) {
						if (focused != 0 ) l.windowFocused(GLFWWindow.this);
						else l.windowUnfocused(GLFWWindow.this);
					}
				}
			}

			@Override
			public void windowIconify(long window, int iconified) {
				synchronized(m_stateListeners) {
					for (WindowStateListener l : m_stateListeners) {
						if (iconified != 0 ) {
							l.windowMinimized(GLFWWindow.this);
						}else l.windowMaximized(GLFWWindow.this);
					}
				}				
			}

			@Override
			public void framebufferSize(long window, int width, int height) {}

			@Override
			public void key(long window, int key, int scancode, int action, int mods) {
				m_keyboard.key(GLFWWindow.this, key, scancode, action, mods);
			}

			@Override
			public void character(long window, int codepoint) {
				m_keyboard.character(GLFWWindow.this, Character.toChars(codepoint)[0]);
			}

			@Override
			public void charMods(long window, int codepoint, int mods) {}

			@Override
			public void mouseButton(long window, int button, int action, int mods) {
				m_mouse.mouseButton(GLFWWindow.this, button, action, mods);
			}

			@Override
			public void cursorPos(long window, double xpos, double ypos) {
				m_mouse.cursorPos(GLFWWindow.this, (float) xpos, (float) ypos);
			}

			@Override
			public void cursorEnter(long window, int entered) {
				m_mouse.cursorEnter(GLFWWindow.this, entered == 1);
			}

			@Override
			public void scroll(long window, double xoffset, double yoffset) {
				m_mouse.scroll(GLFWWindow.this, (float) xoffset, (float) yoffset);
			}

			@Override
			public void drop(long window, int count, long names) {
				File[] files = new File[count];

				PointerBuffer nameBuffer = MemoryUtil.memPointerBuffer(names, count);
				for ( int i = 0; i < count; i++ ) {
					String filePath = MemoryUtil.memDecodeUTF8(MemoryUtil.memByteBufferNT1(nameBuffer.get(i)));
					files[i] = new File(filePath);
				}
				synchronized(m_fileListeners) {
					for (FileDropListener l : m_fileListeners) {
						l.filesDropped(GLFWWindow.this, files);
					}
				}
			}
		});
		
		m_context = new LWJGLGL(this);
		//Will call GLFW.glfwMakeContextCurrent()
		m_context.init();

		GLFW.glfwSwapInterval(1);
		
		//Init will make context current, so we want to release
		//the context b/c the user doesn't expect init() to set the context
		m_context.releaseCurrent();
		m_visible = true;
	}
	
	@Override
	public void destroy() {
		GLFW.glfwDestroyWindow(m_id);
	}

	@Override
	public boolean closeRequested() {
		if (m_id != -1) return GLFW.glfwWindowShouldClose(m_id) == GL11.GL_TRUE;
		else return false;
	}

	public void makeCurrent() {
		GLFW.glfwMakeContextCurrent(m_id);
	}
	public void releaseCurrent() {
		GLFW.glfwMakeContextCurrent(MemoryUtil.NULL);
	}
	
	@Override
	public void update() {
		GLFW.glfwPollEvents();
		GLFW.glfwSwapBuffers(m_id);
	}
}
