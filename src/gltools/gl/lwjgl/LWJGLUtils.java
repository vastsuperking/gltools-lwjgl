package gltools.gl.lwjgl;

import gltools.gl.DebugCallback;
import gltools.gl.Pointer;
import gltools.gl.PointerBuffer;

import org.lwjgl.opengl.DEBUGPROC;
import org.lwjgl.system.MemoryUtil;

public class LWJGLUtils {
	public static String s_toString(long pointer) {
		return MemoryUtil.memDecodeUTF8(MemoryUtil.memByteBufferNT1(pointer));
	}
	public static DEBUGPROC s_wrapDebugCallback(DebugCallback callback) {
		return new LWJGLDEBUGPROC(callback.getHandler());
	}
	public static org.lwjgl.Pointer s_wrapPointer(Pointer p) {
		return new LWJGLPointer(p.getPointer());
	}
	public static org.lwjgl.PointerBuffer s_wrapPointerBuffer(PointerBuffer pb) {
		org.lwjgl.PointerBuffer lpb = new org.lwjgl.PointerBuffer(pb.getPointerBuffer());
		return lpb;
	}
	
	
	public static class LWJGLPointer implements org.lwjgl.Pointer {
		private final long m_pointer;
		
		public LWJGLPointer(long pointer) {
			m_pointer = pointer;
		}
		
		@Override
		public long getPointer() {
			return m_pointer;
		}
		
	}
	public static class LWJGLDEBUGPROC implements org.lwjgl.opengl.DEBUGPROC {
		private final DebugCallback.Handler m_handler;
		
		public LWJGLDEBUGPROC(DebugCallback.Handler handler) { m_handler = handler; }
		
		@Override
		public void invoke(int source, int type, int id, int severity, int length, long message) {
			m_handler.handleMessage(source, type, id, severity, s_toString(message));
		}
	}
}
