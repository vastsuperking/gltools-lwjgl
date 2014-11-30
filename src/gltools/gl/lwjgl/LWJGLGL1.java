package gltools.gl.lwjgl;

import gltools.gl.GL1;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import gltools.gl.PointerBuffer;

public class LWJGLGL1 implements GL1 {
	public void glAccum(int op, float value) {
		GL11.glAccum(op, value);
	}
	public void glAlphaFunc(int func, float ref) {
		GL11.glAlphaFunc(func, ref);
	}
	public boolean glAreTexturesResident(java.nio.IntBuffer textures, java.nio.ByteBuffer residences) {
		return GL11.glAreTexturesResident(textures, residences);
	}
	public boolean glAreTexturesResident(int texture, java.nio.ByteBuffer residences) {
		return GL11.glAreTexturesResident(texture, residences);
	}
	public boolean glAreTexturesResident(int n, java.nio.ByteBuffer textures, java.nio.ByteBuffer residences) {
		return GL11.glAreTexturesResident(n, textures, residences);
	}
	public void glArrayElement(int i) {
		GL11.glArrayElement(i);
	}
	public void glBegin(int mode) {
		GL11.glBegin(mode);
	}
	public void glBindTexture(int target, int texture) {
		GL11.glBindTexture(target, texture);
	}
	public void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, java.nio.ByteBuffer data) {
		GL11.glBitmap(w, h, xOrig, yOrig, xInc, yInc, data);
	}
	public void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long dataOffset) {
		GL11.glBitmap(w, h, xOrig, yOrig, xInc, yInc, dataOffset);
	}
	public void glBlendFunc(int sfactor, int dfactor) {
		GL11.glBlendFunc(sfactor, dfactor);
	}
	public void glCallList(int list) {
		GL11.glCallList(list);
	}
	public void glCallLists(java.nio.ByteBuffer lists) {
		GL11.glCallLists(lists);
	}
	public void glCallLists(java.nio.IntBuffer lists) {
		GL11.glCallLists(lists);
	}
	public void glCallLists(int type, java.nio.ByteBuffer lists) {
		GL11.glCallLists(type, lists);
	}
	public void glCallLists(int n, int type, java.nio.ByteBuffer lists) {
		GL11.glCallLists(n, type, lists);
	}
	public void glCallLists(java.nio.ShortBuffer lists) {
		GL11.glCallLists(lists);
	}
	public void glClear(int mask) {
		GL11.glClear(mask);
	}
	public void glClearAccum(float red, float green, float blue, float alpha) {
		GL11.glClearAccum(red, green, blue, alpha);
	}
	public void glClearColor(float red, float green, float blue, float alpha) {
		GL11.glClearColor(red, green, blue, alpha);
	}
	public void glClearDepth(double depth) {
		GL11.glClearDepth(depth);
	}
	public void glClearStencil(int s) {
		GL11.glClearStencil(s);
	}
	public void glClipPlane(int plane, java.nio.ByteBuffer equation) {
		GL11.glClipPlane(plane, equation);
	}
	public void glClipPlane(int plane, java.nio.DoubleBuffer equation) {
		GL11.glClipPlane(plane, equation);
	}
	public void glColor3(java.nio.DoubleBuffer v) {
		GL11.glColor3(v);
	}
	public void glColor3(java.nio.FloatBuffer v) {
		GL11.glColor3(v);
	}
	public void glColor3(java.nio.IntBuffer v) {
		GL11.glColor3(v);
	}
	public void glColor3(java.nio.ShortBuffer v) {
		GL11.glColor3(v);
	}
	public void glColor3b(java.nio.ByteBuffer v) {
		GL11.glColor3b(v);
	}
	public void glColor3b(byte red, byte green, byte blue) {
		GL11.glColor3b(red, green, blue);
	}
	public void glColor3d(java.nio.ByteBuffer v) {
		GL11.glColor3d(v);
	}
	public void glColor3d(double red, double green, double blue) {
		GL11.glColor3d(red, green, blue);
	}
	public void glColor3f(java.nio.ByteBuffer v) {
		GL11.glColor3f(v);
	}
	public void glColor3f(float red, float green, float blue) {
		GL11.glColor3f(red, green, blue);
	}
	public void glColor3i(java.nio.ByteBuffer v) {
		GL11.glColor3i(v);
	}
	public void glColor3i(int red, int green, int blue) {
		GL11.glColor3i(red, green, blue);
	}
	public void glColor3s(java.nio.ByteBuffer v) {
		GL11.glColor3s(v);
	}
	public void glColor3s(short red, short green, short blue) {
		GL11.glColor3s(red, green, blue);
	}
	public void glColor3u(java.nio.IntBuffer v) {
		GL11.glColor3u(v);
	}
	public void glColor3u(java.nio.ShortBuffer v) {
		GL11.glColor3u(v);
	}
	public void glColor3ub(java.nio.ByteBuffer v) {
		GL11.glColor3ub(v);
	}
	public void glColor3ub(byte red, byte green, byte blue) {
		GL11.glColor3ub(red, green, blue);
	}
	public void glColor3ui(java.nio.ByteBuffer v) {
		GL11.glColor3ui(v);
	}
	public void glColor3ui(int red, int green, int blue) {
		GL11.glColor3ui(red, green, blue);
	}
	public void glColor3us(java.nio.ByteBuffer v) {
		GL11.glColor3us(v);
	}
	public void glColor3us(short red, short green, short blue) {
		GL11.glColor3us(red, green, blue);
	}
	public void glColor4(java.nio.DoubleBuffer v) {
		GL11.glColor4(v);
	}
	public void glColor4(java.nio.FloatBuffer v) {
		GL11.glColor4(v);
	}
	public void glColor4(java.nio.IntBuffer v) {
		GL11.glColor4(v);
	}
	public void glColor4(java.nio.ShortBuffer v) {
		GL11.glColor4(v);
	}
	public void glColor4b(java.nio.ByteBuffer v) {
		GL11.glColor4b(v);
	}
	public void glColor4b(byte red, byte green, byte blue, byte alpha) {
		GL11.glColor4b(red, green, blue, alpha);
	}
	public void glColor4d(java.nio.ByteBuffer v) {
		GL11.glColor4d(v);
	}
	public void glColor4d(double red, double green, double blue, double alpha) {
		GL11.glColor4d(red, green, blue, alpha);
	}
	public void glColor4f(java.nio.ByteBuffer v) {
		GL11.glColor4f(v);
	}
	public void glColor4f(float red, float green, float blue, float alpha) {
		GL11.glColor4f(red, green, blue, alpha);
	}
	public void glColor4i(java.nio.ByteBuffer v) {
		GL11.glColor4i(v);
	}
	public void glColor4i(int red, int green, int blue, int alpha) {
		GL11.glColor4i(red, green, blue, alpha);
	}
	public void glColor4s(java.nio.ByteBuffer v) {
		GL11.glColor4s(v);
	}
	public void glColor4s(short red, short green, short blue, short alpha) {
		GL11.glColor4s(red, green, blue, alpha);
	}
	public void glColor4u(java.nio.IntBuffer v) {
		GL11.glColor4u(v);
	}
	public void glColor4u(java.nio.ShortBuffer v) {
		GL11.glColor4u(v);
	}
	public void glColor4ub(java.nio.ByteBuffer v) {
		GL11.glColor4ub(v);
	}
	public void glColor4ub(byte red, byte green, byte blue, byte alpha) {
		GL11.glColor4ub(red, green, blue, alpha);
	}
	public void glColor4ui(java.nio.ByteBuffer v) {
		GL11.glColor4ui(v);
	}
	public void glColor4ui(int red, int green, int blue, int alpha) {
		GL11.glColor4ui(red, green, blue, alpha);
	}
	public void glColor4us(java.nio.ByteBuffer v) {
		GL11.glColor4us(v);
	}
	public void glColor4us(short red, short green, short blue, short alpha) {
		GL11.glColor4us(red, green, blue, alpha);
	}
	public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
		GL11.glColorMask(red, green, blue, alpha);
	}
	public void glColorMaterial(int face, int mode) {
		GL11.glColorMaterial(face, mode);
	}
	public void glColorPointer(int size, boolean unsigned, int stride, java.nio.ByteBuffer pointer) {
		GL11.glColorPointer(size, unsigned, stride, pointer);
	}
	public void glColorPointer(int size, int stride, java.nio.FloatBuffer pointer) {
		GL11.glColorPointer(size, stride, pointer);
	}
	public void glColorPointer(int size, int type, int stride, java.nio.ByteBuffer pointer) {
		GL11.glColorPointer(size, type, stride, pointer);
	}
	public void glColorPointer(int size, int type, int stride, long pointerOffset) {
		GL11.glColorPointer(size, type, stride, pointerOffset);
	}
	public void glCopyPixels(int x, int y, int width, int height, int type) {
		GL11.glCopyPixels(x, y, width, height, type);
	}
	public void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border) {
		GL11.glCopyTexImage1D(target, level, internalFormat, x, y, width, border);
	}
	public void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border) {
		GL11.glCopyTexImage2D(target, level, internalFormat, x, y, width, height, border);
	}
	public void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
		GL11.glCopyTexSubImage1D(target, level, xoffset, x, y, width);
	}
	public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
		GL11.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
	}
	public void glCullFace(int mode) {
		GL11.glCullFace(mode);
	}
	public void glDeleteLists(int list, int range) {
		GL11.glDeleteLists(list, range);
	}
	public void glDeleteTextures(int texture) {
		GL11.glDeleteTextures(texture);
	}
	public void glDeleteTextures(java.nio.IntBuffer textures) {
		GL11.glDeleteTextures(textures);
	}
	public void glDeleteTextures(int n, java.nio.ByteBuffer textures) {
		GL11.glDeleteTextures(n, textures);
	}
	public void glDepthFunc(int func) {
		GL11.glDepthFunc(func);
	}
	public void glDepthMask(boolean flag) {
		GL11.glDepthMask(flag);
	}
	public void glDepthRange(double zNear, double zFar) {
		GL11.glDepthRange(zNear, zFar);
	}
	public void glDisable(int target) {
		GL11.glDisable(target);
	}
	public void glDisableClientState(int array) {
		GL11.glDisableClientState(array);
	}
	public void glDrawArrays(int mode, int first, int count) {
		GL11.glDrawArrays(mode, first, count);
	}
	public void glDrawBuffer(int buf) {
		GL11.glDrawBuffer(buf);
	}
	public void glDrawElements(int mode, java.nio.ByteBuffer indices) {
		GL11.glDrawElements(mode, indices);
	}
	public void glDrawElements(int mode, java.nio.IntBuffer indices) {
		GL11.glDrawElements(mode, indices);
	}
	public void glDrawElements(int mode, int type, java.nio.ByteBuffer indices) {
		GL11.glDrawElements(mode, type, indices);
	}
	public void glDrawElements(int mode, int count, int type, java.nio.ByteBuffer indices) {
		GL11.glDrawElements(mode, count, type, indices);
	}
	public void glDrawElements(int mode, int count, int type, long indicesOffset) {
		GL11.glDrawElements(mode, count, type, indicesOffset);
	}
	public void glDrawElements(int mode, java.nio.ShortBuffer indices) {
		GL11.glDrawElements(mode, indices);
	}
	public void glDrawPixels(int width, int height, int format, int type, java.nio.ByteBuffer pixels) {
		GL11.glDrawPixels(width, height, format, type, pixels);
	}
	public void glDrawPixels(int width, int height, int format, int type, java.nio.FloatBuffer pixels) {
		GL11.glDrawPixels(width, height, format, type, pixels);
	}
	public void glDrawPixels(int width, int height, int format, int type, java.nio.IntBuffer pixels) {
		GL11.glDrawPixels(width, height, format, type, pixels);
	}
	public void glDrawPixels(int width, int height, int format, int type, long pixelsOffset) {
		GL11.glDrawPixels(width, height, format, type, pixelsOffset);
	}
	public void glDrawPixels(int width, int height, int format, int type, java.nio.ShortBuffer pixels) {
		GL11.glDrawPixels(width, height, format, type, pixels);
	}
	public void glEdgeFlag(boolean flag) {
		GL11.glEdgeFlag(flag);
	}
	public void glEdgeFlag(java.nio.ByteBuffer flag) {
		GL11.glEdgeFlag(flag);
	}
	public void glEdgeFlagPointer(int stride, java.nio.ByteBuffer pointer) {
		GL11.glEdgeFlagPointer(stride, pointer);
	}
	public void glEdgeFlagPointer(int stride, long pointerOffset) {
		GL11.glEdgeFlagPointer(stride, pointerOffset);
	}
	public void glEnable(int target) {
		GL11.glEnable(target);
	}
	public void glEnableClientState(int array) {
		GL11.glEnableClientState(array);
	}
	public void glEnd() {
		GL11.glEnd();
	}
	public void glEndList() {
		GL11.glEndList();
	}
	public void glEvalCoord1(java.nio.DoubleBuffer u) {
		GL11.glEvalCoord1(u);
	}
	public void glEvalCoord1(java.nio.FloatBuffer u) {
		GL11.glEvalCoord1(u);
	}
	public void glEvalCoord1d(java.nio.ByteBuffer u) {
		GL11.glEvalCoord1d(u);
	}
	public void glEvalCoord1d(double u) {
		GL11.glEvalCoord1d(u);
	}
	public void glEvalCoord1f(java.nio.ByteBuffer u) {
		GL11.glEvalCoord1f(u);
	}
	public void glEvalCoord1f(float u) {
		GL11.glEvalCoord1f(u);
	}
	public void glEvalCoord2(java.nio.DoubleBuffer u) {
		GL11.glEvalCoord2(u);
	}
	public void glEvalCoord2(java.nio.FloatBuffer u) {
		GL11.glEvalCoord2(u);
	}
	public void glEvalCoord2d(java.nio.ByteBuffer u) {
		GL11.glEvalCoord2d(u);
	}
	public void glEvalCoord2d(double u, double v) {
		GL11.glEvalCoord2d(u, v);
	}
	public void glEvalCoord2f(java.nio.ByteBuffer u) {
		GL11.glEvalCoord2f(u);
	}
	public void glEvalCoord2f(float u, float v) {
		GL11.glEvalCoord2f(u, v);
	}
	public void glEvalMesh1(int mode, int i1, int i2) {
		GL11.glEvalMesh1(mode, i1, i2);
	}
	public void glEvalMesh2(int mode, int i1, int i2, int j1, int j2) {
		GL11.glEvalMesh2(mode, i1, i2, j1, j2);
	}
	public void glEvalPoint1(int i) {
		GL11.glEvalPoint1(i);
	}
	public void glEvalPoint2(int i, int j) {
		GL11.glEvalPoint2(i, j);
	}
	public void glFeedbackBuffer(int type, java.nio.FloatBuffer buffer) {
		GL11.glFeedbackBuffer(type, buffer);
	}
	public void glFeedbackBuffer(int size, int type, java.nio.ByteBuffer buffer) {
		GL11.glFeedbackBuffer(size, type, buffer);
	}
	public void glFinish() {
		GL11.glFinish();
	}
	public void glFlush() {
		GL11.glFlush();
	}
	public void glFog(int pname, java.nio.FloatBuffer params) {
		GL11.glFog(pname, params);
	}
	public void glFog(int pname, java.nio.IntBuffer params) {
		GL11.glFog(pname, params);
	}
	public void glFogf(int pname, java.nio.ByteBuffer params) {
		GL11.glFogf(pname, params);
	}
	public void glFogf(int pname, float param) {
		GL11.glFogf(pname, param);
	}
	public void glFogi(int pname, java.nio.ByteBuffer params) {
		GL11.glFogi(pname, params);
	}
	public void glFogi(int pname, int param) {
		GL11.glFogi(pname, param);
	}
	public void glFrontFace(int dir) {
		GL11.glFrontFace(dir);
	}
	public void glFrustum(double l, double r, double b, double t, double n, double f) {
		GL11.glFrustum(l, r, b, t, n, f);
	}
	public int glGenLists(int s) {
		return GL11.glGenLists(s);
	}
	public int glGenTextures() {
		return GL11.glGenTextures();
	}
	public void glGenTextures(java.nio.IntBuffer textures) {
		GL11.glGenTextures(textures);
	}
	public void glGenTextures(int n, java.nio.ByteBuffer textures) {
		GL11.glGenTextures(n, textures);
	}
	public boolean glGetBoolean(int pname) {
		return GL11.glGetBoolean(pname);
	}
	public void glGetBoolean(int pname, java.nio.ByteBuffer params) {
		GL11.glGetBoolean(pname, params);
	}
	public void glGetClipPlane(int plane, java.nio.ByteBuffer equation) {
		GL11.glGetClipPlane(plane, equation);
	}
	public void glGetClipPlane(int plane, java.nio.DoubleBuffer equation) {
		GL11.glGetClipPlane(plane, equation);
	}
	public double glGetDouble(int pname) {
		return GL11.glGetDouble(pname);
	}
	public void glGetDouble(int pname, java.nio.ByteBuffer params) {
		GL11.glGetDouble(pname, params);
	}
	public void glGetDouble(int pname, java.nio.DoubleBuffer params) {
		GL11.glGetDouble(pname, params);
	}
	public int glGetError() {
		return GL11.glGetError();
	}
	public float glGetFloat(int pname) {
		return GL11.glGetFloat(pname);
	}
	public void glGetFloat(int pname, java.nio.ByteBuffer params) {
		GL11.glGetFloat(pname, params);
	}
	public void glGetFloat(int pname, java.nio.FloatBuffer params) {
		GL11.glGetFloat(pname, params);
	}
	public int glGetInteger(int pname) {
		return GL11.glGetInteger(pname);
	}
	public void glGetInteger(int pname, java.nio.ByteBuffer params) {
		GL11.glGetInteger(pname, params);
	}
	public void glGetInteger(int pname, java.nio.IntBuffer params) {
		GL11.glGetInteger(pname, params);
	}
	public void glGetLight(int light, int pname, java.nio.FloatBuffer data) {
		GL11.glGetLight(light, pname, data);
	}
	public void glGetLight(int light, int pname, java.nio.IntBuffer data) {
		GL11.glGetLight(light, pname, data);
	}
	public float glGetLightf(int light, int pname) {
		return GL11.glGetLightf(light, pname);
	}
	public void glGetLightf(int light, int pname, java.nio.ByteBuffer data) {
		GL11.glGetLightf(light, pname, data);
	}
	public int glGetLighti(int light, int pname) {
		return GL11.glGetLighti(light, pname);
	}
	public void glGetLighti(int light, int pname, java.nio.ByteBuffer data) {
		GL11.glGetLighti(light, pname, data);
	}
	public void glGetMap(int target, int query, java.nio.DoubleBuffer data) {
		GL11.glGetMap(target, query, data);
	}
	public void glGetMap(int target, int query, java.nio.FloatBuffer data) {
		GL11.glGetMap(target, query, data);
	}
	public void glGetMap(int target, int query, java.nio.IntBuffer data) {
		GL11.glGetMap(target, query, data);
	}
	public double glGetMapd(int target, int query) {
		return GL11.glGetMapd(target, query);
	}
	public void glGetMapd(int target, int query, java.nio.ByteBuffer data) {
		GL11.glGetMapd(target, query, data);
	}
	public float glGetMapf(int target, int query) {
		return GL11.glGetMapf(target, query);
	}
	public void glGetMapf(int target, int query, java.nio.ByteBuffer data) {
		GL11.glGetMapf(target, query, data);
	}
	public int glGetMapi(int target, int query) {
		return GL11.glGetMapi(target, query);
	}
	public void glGetMapi(int target, int query, java.nio.ByteBuffer data) {
		GL11.glGetMapi(target, query, data);
	}
	public void glGetMaterial(int face, int pname, java.nio.FloatBuffer data) {
		GL11.glGetMaterial(face, pname, data);
	}
	public void glGetMaterial(int face, int pname, java.nio.IntBuffer data) {
		GL11.glGetMaterial(face, pname, data);
	}
	public void glGetMaterialf(int face, int pname, java.nio.ByteBuffer data) {
		GL11.glGetMaterialf(face, pname, data);
	}
	public void glGetMateriali(int face, int pname, java.nio.ByteBuffer data) {
		GL11.glGetMateriali(face, pname, data);
	}
	public void glGetPixelMap(int map, java.nio.FloatBuffer data) {
		GL11.glGetPixelMap(map, data);
	}
	public void glGetPixelMapf(int map, java.nio.ByteBuffer data) {
		GL11.glGetPixelMapf(map, data);
	}
	public void glGetPixelMapf(int map, long dataOffset) {
		GL11.glGetPixelMapf(map, dataOffset);
	}
	public void glGetPixelMapu(int map, java.nio.IntBuffer data) {
		GL11.glGetPixelMapu(map, data);
	}
	public void glGetPixelMapu(int map, java.nio.ShortBuffer data) {
		GL11.glGetPixelMapu(map, data);
	}
	public void glGetPixelMapui(int map, java.nio.ByteBuffer data) {
		GL11.glGetPixelMapui(map, data);
	}
	public void glGetPixelMapui(int map, long dataOffset) {
		GL11.glGetPixelMapui(map, dataOffset);
	}
	public void glGetPixelMapus(int map, java.nio.ByteBuffer data) {
		GL11.glGetPixelMapus(map, data);
	}
	public void glGetPixelMapus(int map, long dataOffset) {
		GL11.glGetPixelMapus(map, dataOffset);
	}
	public long glGetPointer(int pname) {
		return GL11.glGetPointer(pname);
	}
	public void glGetPointer(int pname, java.nio.ByteBuffer params) {
		GL11.glGetPointer(pname, params);
	}
	public void glGetPointer(int pname, PointerBuffer params) {
		GL11.glGetPointer(pname, LWJGLUtils.s_wrapPointerBuffer(params));
	}
	public void glGetPolygonStipple(java.nio.ByteBuffer pattern) {
		GL11.glGetPolygonStipple(pattern);
	}
	public void glGetPolygonStipple(long patternOffset) {
		GL11.glGetPolygonStipple(patternOffset);
	}
	public java.lang.String glGetString(int name) {
		return GL11.glGetString(name);
	}
	public void glGetTexEnv(int env, int pname, java.nio.FloatBuffer data) {
		GL11.glGetTexEnv(env, pname, data);
	}
	public void glGetTexEnv(int env, int pname, java.nio.IntBuffer data) {
		GL11.glGetTexEnv(env, pname, data);
	}
	public float glGetTexEnvf(int env, int pname) {
		return GL11.glGetTexEnvf(env, pname);
	}
	public void glGetTexEnvf(int env, int pname, java.nio.ByteBuffer data) {
		GL11.glGetTexEnvf(env, pname, data);
	}
	public int glGetTexEnvi(int env, int pname) {
		return GL11.glGetTexEnvi(env, pname);
	}
	public void glGetTexEnvi(int env, int pname, java.nio.ByteBuffer data) {
		GL11.glGetTexEnvi(env, pname, data);
	}
	public void glGetTexGen(int coord, int pname, java.nio.DoubleBuffer data) {
		GL11.glGetTexGen(coord, pname, data);
	}
	public void glGetTexGen(int coord, int pname, java.nio.FloatBuffer data) {
		GL11.glGetTexGen(coord, pname, data);
	}
	public void glGetTexGen(int coord, int pname, java.nio.IntBuffer data) {
		GL11.glGetTexGen(coord, pname, data);
	}
	public double glGetTexGend(int coord, int pname) {
		return GL11.glGetTexGend(coord, pname);
	}
	public void glGetTexGend(int coord, int pname, java.nio.ByteBuffer data) {
		GL11.glGetTexGend(coord, pname, data);
	}
	public float glGetTexGenf(int coord, int pname) {
		return GL11.glGetTexGenf(coord, pname);
	}
	public void glGetTexGenf(int coord, int pname, java.nio.ByteBuffer data) {
		GL11.glGetTexGenf(coord, pname, data);
	}
	public int glGetTexGeni(int coord, int pname) {
		return GL11.glGetTexGeni(coord, pname);
	}
	public void glGetTexGeni(int coord, int pname, java.nio.ByteBuffer data) {
		GL11.glGetTexGeni(coord, pname, data);
	}
	public void glGetTexImage(int tex, int level, int format, int type, java.nio.ByteBuffer pixels) {
		GL11.glGetTexImage(tex, level, format, type, pixels);
	}
	public void glGetTexImage(int tex, int level, int format, int type, java.nio.DoubleBuffer pixels) {
		GL11.glGetTexImage(tex, level, format, type, pixels);
	}
	public void glGetTexImage(int tex, int level, int format, int type, java.nio.FloatBuffer pixels) {
		GL11.glGetTexImage(tex, level, format, type, pixels);
	}
	public void glGetTexImage(int tex, int level, int format, int type, java.nio.IntBuffer pixels) {
		GL11.glGetTexImage(tex, level, format, type, pixels);
	}
	public void glGetTexImage(int tex, int level, int format, int type, long pixelsOffset) {
		GL11.glGetTexImage(tex, level, format, type, pixelsOffset);
	}
	public void glGetTexImage(int tex, int level, int format, int type, java.nio.ShortBuffer pixels) {
		GL11.glGetTexImage(tex, level, format, type, pixels);
	}
	public void glGetTexLevelParameter(int target, int level, int pname, java.nio.FloatBuffer params) {
		GL11.glGetTexLevelParameter(target, level, pname, params);
	}
	public void glGetTexLevelParameter(int target, int level, int pname, java.nio.IntBuffer params) {
		GL11.glGetTexLevelParameter(target, level, pname, params);
	}
	public float glGetTexLevelParameterf(int target, int level, int pname) {
		return GL11.glGetTexLevelParameterf(target, level, pname);
	}
	public void glGetTexLevelParameterf(int target, int level, int pname, java.nio.ByteBuffer params) {
		GL11.glGetTexLevelParameterf(target, level, pname, params);
	}
	public int glGetTexLevelParameteri(int target, int level, int pname) {
		return GL11.glGetTexLevelParameteri(target, level, pname);
	}
	public void glGetTexLevelParameteri(int target, int level, int pname, java.nio.ByteBuffer params) {
		GL11.glGetTexLevelParameteri(target, level, pname, params);
	}
	public void glGetTexParameter(int target, int pname, java.nio.FloatBuffer params) {
		GL11.glGetTexParameter(target, pname, params);
	}
	public void glGetTexParameter(int target, int pname, java.nio.IntBuffer params) {
		GL11.glGetTexParameter(target, pname, params);
	}
	public float glGetTexParameterf(int target, int pname) {
		return GL11.glGetTexParameterf(target, pname);
	}
	public void glGetTexParameterf(int target, int pname, java.nio.ByteBuffer params) {
		GL11.glGetTexParameterf(target, pname, params);
	}
	public int glGetTexParameteri(int target, int pname) {
		return GL11.glGetTexParameteri(target, pname);
	}
	public void glGetTexParameteri(int target, int pname, java.nio.ByteBuffer params) {
		GL11.glGetTexParameteri(target, pname, params);
	}
	public void glHint(int target, int hint) {
		GL11.glHint(target, hint);
	}
	public void glInitNames() {
		GL11.glInitNames();
	}
	public void glInterleavedArrays(int format, int stride, java.nio.ByteBuffer pointer) {
		GL11.glInterleavedArrays(format, stride, pointer);
	}
	public void glInterleavedArrays(int format, int stride, java.nio.DoubleBuffer pointer) {
		GL11.glInterleavedArrays(format, stride, pointer);
	}
	public void glInterleavedArrays(int format, int stride, java.nio.FloatBuffer pointer) {
		GL11.glInterleavedArrays(format, stride, pointer);
	}
	public void glInterleavedArrays(int format, int stride, java.nio.IntBuffer pointer) {
		GL11.glInterleavedArrays(format, stride, pointer);
	}
	public void glInterleavedArrays(int format, int stride, long pointerOffset) {
		GL11.glInterleavedArrays(format, stride, pointerOffset);
	}
	public void glInterleavedArrays(int format, int stride, java.nio.ShortBuffer pointer) {
		GL11.glInterleavedArrays(format, stride, pointer);
	}
	public boolean glIsEnabled(int cap) {
		return GL11.glIsEnabled(cap);
	}
	public boolean glIsList(int list) {
		return GL11.glIsList(list);
	}
	public boolean glIsTexture(int texture) {
		return GL11.glIsTexture(texture);
	}
	public void glLight(int light, int pname, java.nio.FloatBuffer params) {
		GL11.glLight(light, pname, params);
	}
	public void glLight(int light, int pname, java.nio.IntBuffer params) {
		GL11.glLight(light, pname, params);
	}
	public void glLightf(int light, int pname, java.nio.ByteBuffer params) {
		GL11.glLightf(light, pname, params);
	}
	public void glLightf(int light, int pname, float param) {
		GL11.glLightf(light, pname, param);
	}
	public void glLighti(int light, int pname, java.nio.ByteBuffer params) {
		GL11.glLighti(light, pname, params);
	}
	public void glLighti(int light, int pname, int param) {
		GL11.glLighti(light, pname, param);
	}
	public void glLightModel(int pname, java.nio.FloatBuffer params) {
		GL11.glLightModel(pname, params);
	}
	public void glLightModel(int pname, java.nio.IntBuffer params) {
		GL11.glLightModel(pname, params);
	}
	public void glLightModelf(int pname, java.nio.ByteBuffer params) {
		GL11.glLightModelf(pname, params);
	}
	public void glLightModelf(int pname, float param) {
		GL11.glLightModelf(pname, param);
	}
	public void glLightModeli(int pname, java.nio.ByteBuffer params) {
		GL11.glLightModeli(pname, params);
	}
	public void glLightModeli(int pname, int param) {
		GL11.glLightModeli(pname, param);
	}
	public void glLineStipple(int factor, short pattern) {
		GL11.glLineStipple(factor, pattern);
	}
	public void glLineWidth(float width) {
		GL11.glLineWidth(width);
	}
	public void glListBase(int base) {
		GL11.glListBase(base);
	}
	public void glLoadIdentity() {
		GL11.glLoadIdentity();
	}
	public void glLoadMatrix(java.nio.DoubleBuffer m) {
		GL11.glLoadMatrix(m);
	}
	public void glLoadMatrix(java.nio.FloatBuffer m) {
		GL11.glLoadMatrix(m);
	}
	public void glLoadMatrixd(java.nio.ByteBuffer m) {
		GL11.glLoadMatrixd(m);
	}
	public void glLoadMatrixf(java.nio.ByteBuffer m) {
		GL11.glLoadMatrixf(m);
	}
	public void glLoadName(int name) {
		GL11.glLoadName(name);
	}
	public void glLogicOp(int op) {
		GL11.glLogicOp(op);
	}
	public void glMap1(int target, double u1, double u2, int stride, int order, java.nio.DoubleBuffer points) {
		GL11.glMap1(target, u1, u2, stride, order, points);
	}
	public void glMap1(int target, float u1, float u2, int stride, int order, java.nio.FloatBuffer points) {
		GL11.glMap1(target, u1, u2, stride, order, points);
	}
	public void glMap1d(int target, double u1, double u2, int stride, int order, java.nio.ByteBuffer points) {
		GL11.glMap1d(target, u1, u2, stride, order, points);
	}
	public void glMap1f(int target, float u1, float u2, int stride, int order, java.nio.ByteBuffer points) {
		GL11.glMap1f(target, u1, u2, stride, order, points);
	}
	public void glMap2(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, java.nio.DoubleBuffer points) {
		GL11.glMap2(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
	}
	public void glMap2(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, java.nio.FloatBuffer points) {
		GL11.glMap2(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
	}
	public void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, java.nio.ByteBuffer points) {
		GL11.glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
	}
	public void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, java.nio.ByteBuffer points) {
		GL11.glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
	}
	public void glMapGrid1d(int n, double u1, double u2) {
		GL11.glMapGrid1d(n, u1, u2);
	}
	public void glMapGrid1f(int n, float u1, float u2) {
		GL11.glMapGrid1f(n, u1, u2);
	}
	public void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2) {
		GL11.glMapGrid2d(un, u1, u2, vn, v1, v2);
	}
	public void glMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2) {
		GL11.glMapGrid2f(un, u1, u2, vn, v1, v2);
	}
	public void glMaterial(int face, int pname, java.nio.FloatBuffer params) {
		GL11.glMaterial(face, pname, params);
	}
	public void glMaterial(int face, int pname, java.nio.IntBuffer params) {
		GL11.glMaterial(face, pname, params);
	}
	public void glMaterialf(int face, int pname, java.nio.ByteBuffer params) {
		GL11.glMaterialf(face, pname, params);
	}
	public void glMaterialf(int face, int pname, float param) {
		GL11.glMaterialf(face, pname, param);
	}
	public void glMateriali(int face, int pname, java.nio.ByteBuffer params) {
		GL11.glMateriali(face, pname, params);
	}
	public void glMateriali(int face, int pname, int param) {
		GL11.glMateriali(face, pname, param);
	}
	public void glMatrixMode(int mode) {
		GL11.glMatrixMode(mode);
	}
	public void glMultMatrix(java.nio.DoubleBuffer m) {
		GL11.glMultMatrix(m);
	}
	public void glMultMatrix(java.nio.FloatBuffer m) {
		GL11.glMultMatrix(m);
	}
	public void glMultMatrixd(java.nio.ByteBuffer m) {
		GL11.glMultMatrixd(m);
	}
	public void glMultMatrixf(java.nio.ByteBuffer m) {
		GL11.glMultMatrixf(m);
	}
	public void glNewList(int n, int mode) {
		GL11.glNewList(n, mode);
	}
	public void glNormal3(java.nio.DoubleBuffer v) {
		GL11.glNormal3(v);
	}
	public void glNormal3(java.nio.FloatBuffer v) {
		GL11.glNormal3(v);
	}
	public void glNormal3(java.nio.IntBuffer v) {
		GL11.glNormal3(v);
	}
	public void glNormal3(java.nio.ShortBuffer v) {
		GL11.glNormal3(v);
	}
	public void glNormal3b(java.nio.ByteBuffer v) {
		GL11.glNormal3b(v);
	}
	public void glNormal3b(byte nx, byte ny, byte nz) {
		GL11.glNormal3b(nx, ny, nz);
	}
	public void glNormal3d(java.nio.ByteBuffer v) {
		GL11.glNormal3d(v);
	}
	public void glNormal3d(double nx, double ny, double nz) {
		GL11.glNormal3d(nx, ny, nz);
	}
	public void glNormal3f(java.nio.ByteBuffer v) {
		GL11.glNormal3f(v);
	}
	public void glNormal3f(float nx, float ny, float nz) {
		GL11.glNormal3f(nx, ny, nz);
	}
	public void glNormal3i(java.nio.ByteBuffer v) {
		GL11.glNormal3i(v);
	}
	public void glNormal3i(int nx, int ny, int nz) {
		GL11.glNormal3i(nx, ny, nz);
	}
	public void glNormal3s(java.nio.ByteBuffer v) {
		GL11.glNormal3s(v);
	}
	public void glNormal3s(short nx, short ny, short nz) {
		GL11.glNormal3s(nx, ny, nz);
	}
	public void glNormalPointer(int stride, java.nio.ByteBuffer pointer) {
		GL11.glNormalPointer(stride, pointer);
	}
	public void glNormalPointer(int stride, java.nio.FloatBuffer pointer) {
		GL11.glNormalPointer(stride, pointer);
	}
	public void glNormalPointer(int type, int stride, java.nio.ByteBuffer pointer) {
		GL11.glNormalPointer(type, stride, pointer);
	}
	public void glNormalPointer(int type, int stride, long pointerOffset) {
		GL11.glNormalPointer(type, stride, pointerOffset);
	}
	public void glNormalPointer(int stride, java.nio.ShortBuffer pointer) {
		GL11.glNormalPointer(stride, pointer);
	}
	public void glOrtho(double l, double r, double b, double t, double n, double f) {
		GL11.glOrtho(l, r, b, t, n, f);
	}
	public void glPassThrough(float token) {
		GL11.glPassThrough(token);
	}
	public void glPixelMap(int map, java.nio.FloatBuffer values) {
		GL11.glPixelMap(map, values);
	}
	public void glPixelMapf(int map, int size, java.nio.ByteBuffer values) {
		GL11.glPixelMapf(map, size, values);
	}
	public void glPixelMapf(int map, int size, long valuesOffset) {
		GL11.glPixelMapf(map, size, valuesOffset);
	}
	public void glPixelMapu(int map, java.nio.IntBuffer values) {
		GL11.glPixelMapu(map, values);
	}
	public void glPixelMapu(int map, java.nio.ShortBuffer values) {
		GL11.glPixelMapu(map, values);
	}
	public void glPixelMapui(int map, int size, java.nio.ByteBuffer values) {
		GL11.glPixelMapui(map, size, values);
	}
	public void glPixelMapui(int map, int size, long valuesOffset) {
		GL11.glPixelMapui(map, size, valuesOffset);
	}
	public void glPixelMapus(int map, int size, java.nio.ByteBuffer values) {
		GL11.glPixelMapus(map, size, values);
	}
	public void glPixelMapus(int map, int size, long valuesOffset) {
		GL11.glPixelMapus(map, size, valuesOffset);
	}
	public void glPixelStoref(int pname, int param) {
		GL11.glPixelStoref(pname, param);
	}
	public void glPixelStorei(int pname, int param) {
		GL11.glPixelStorei(pname, param);
	}
	public void glPixelTransferf(int pname, float param) {
		GL11.glPixelTransferf(pname, param);
	}
	public void glPixelTransferi(int pname, int param) {
		GL11.glPixelTransferi(pname, param);
	}
	public void glPixelZoom(float xfactor, float yfactor) {
		GL11.glPixelZoom(xfactor, yfactor);
	}
	public void glPointSize(float size) {
		GL11.glPointSize(size);
	}
	public void glPolygonMode(int face, int mode) {
		GL11.glPolygonMode(face, mode);
	}
	public void glPolygonOffset(float factor, float units) {
		GL11.glPolygonOffset(factor, units);
	}
	public void glPolygonStipple(java.nio.ByteBuffer pattern) {
		GL11.glPolygonStipple(pattern);
	}
	public void glPolygonStipple(long patternOffset) {
		GL11.glPolygonStipple(patternOffset);
	}
	public void glPopAttrib() {
		GL11.glPopAttrib();
	}
	public void glPopClientAttrib() {
		GL11.glPopClientAttrib();
	}
	public void glPopMatrix() {
		GL11.glPopMatrix();
	}
	public void glPopName() {
		GL11.glPopName();
	}
	public void glPrioritizeTextures(java.nio.IntBuffer textures, java.nio.FloatBuffer priorities) {
		GL11.glPrioritizeTextures(textures, priorities);
	}
	public void glPrioritizeTextures(int n, java.nio.ByteBuffer textures, java.nio.ByteBuffer priorities) {
		GL11.glPrioritizeTextures(n, textures, priorities);
	}
	public void glPushAttrib(int mask) {
		GL11.glPushAttrib(mask);
	}
	public void glPushClientAttrib(int mask) {
		GL11.glPushClientAttrib(mask);
	}
	public void glPushMatrix() {
		GL11.glPushMatrix();
	}
	public void glPushName(int name) {
		GL11.glPushName(name);
	}
	public void glRasterPos2(java.nio.DoubleBuffer coords) {
		GL11.glRasterPos2(coords);
	}
	public void glRasterPos2(java.nio.FloatBuffer coords) {
		GL11.glRasterPos2(coords);
	}
	public void glRasterPos2(java.nio.IntBuffer coords) {
		GL11.glRasterPos2(coords);
	}
	public void glRasterPos2(java.nio.ShortBuffer coords) {
		GL11.glRasterPos2(coords);
	}
	public void glRasterPos2d(java.nio.ByteBuffer coords) {
		GL11.glRasterPos2d(coords);
	}
	public void glRasterPos2d(double x, double y) {
		GL11.glRasterPos2d(x, y);
	}
	public void glRasterPos2f(java.nio.ByteBuffer coords) {
		GL11.glRasterPos2f(coords);
	}
	public void glRasterPos2f(float x, float y) {
		GL11.glRasterPos2f(x, y);
	}
	public void glRasterPos2i(java.nio.ByteBuffer coords) {
		GL11.glRasterPos2i(coords);
	}
	public void glRasterPos2i(int x, int y) {
		GL11.glRasterPos2i(x, y);
	}
	public void glRasterPos2s(java.nio.ByteBuffer coords) {
		GL11.glRasterPos2s(coords);
	}
	public void glRasterPos2s(short x, short y) {
		GL11.glRasterPos2s(x, y);
	}
	public void glRasterPos3(java.nio.DoubleBuffer coords) {
		GL11.glRasterPos3(coords);
	}
	public void glRasterPos3(java.nio.FloatBuffer coords) {
		GL11.glRasterPos3(coords);
	}
	public void glRasterPos3(java.nio.IntBuffer coords) {
		GL11.glRasterPos3(coords);
	}
	public void glRasterPos3(java.nio.ShortBuffer coords) {
		GL11.glRasterPos3(coords);
	}
	public void glRasterPos3d(java.nio.ByteBuffer coords) {
		GL11.glRasterPos3d(coords);
	}
	public void glRasterPos3d(double x, double y, double z) {
		GL11.glRasterPos3d(x, y, z);
	}
	public void glRasterPos3f(java.nio.ByteBuffer coords) {
		GL11.glRasterPos3f(coords);
	}
	public void glRasterPos3f(float x, float y, float z) {
		GL11.glRasterPos3f(x, y, z);
	}
	public void glRasterPos3i(java.nio.ByteBuffer coords) {
		GL11.glRasterPos3i(coords);
	}
	public void glRasterPos3i(int x, int y, int z) {
		GL11.glRasterPos3i(x, y, z);
	}
	public void glRasterPos3s(java.nio.ByteBuffer coords) {
		GL11.glRasterPos3s(coords);
	}
	public void glRasterPos3s(short x, short y, short z) {
		GL11.glRasterPos3s(x, y, z);
	}
	public void glRasterPos4(java.nio.DoubleBuffer coords) {
		GL11.glRasterPos4(coords);
	}
	public void glRasterPos4(java.nio.FloatBuffer coords) {
		GL11.glRasterPos4(coords);
	}
	public void glRasterPos4(java.nio.IntBuffer coords) {
		GL11.glRasterPos4(coords);
	}
	public void glRasterPos4(java.nio.ShortBuffer coords) {
		GL11.glRasterPos4(coords);
	}
	public void glRasterPos4d(java.nio.ByteBuffer coords) {
		GL11.glRasterPos4d(coords);
	}
	public void glRasterPos4d(double x, double y, double z, double w) {
		GL11.glRasterPos4d(x, y, z, w);
	}
	public void glRasterPos4f(java.nio.ByteBuffer coords) {
		GL11.glRasterPos4f(coords);
	}
	public void glRasterPos4f(float x, float y, float z, float w) {
		GL11.glRasterPos4f(x, y, z, w);
	}
	public void glRasterPos4i(java.nio.ByteBuffer coords) {
		GL11.glRasterPos4i(coords);
	}
	public void glRasterPos4i(int x, int y, int z, int w) {
		GL11.glRasterPos4i(x, y, z, w);
	}
	public void glRasterPos4s(java.nio.ByteBuffer coords) {
		GL11.glRasterPos4s(coords);
	}
	public void glRasterPos4s(short x, short y, short z, short w) {
		GL11.glRasterPos4s(x, y, z, w);
	}
	public void glReadBuffer(int src) {
		GL11.glReadBuffer(src);
	}
	public void glReadPixels(int x, int y, int width, int height, int format, int type, java.nio.ByteBuffer pixels) {
		GL11.glReadPixels(x, y, width, height, format, type, pixels);
	}
	public void glReadPixels(int x, int y, int width, int height, int format, int type, java.nio.FloatBuffer pixels) {
		GL11.glReadPixels(x, y, width, height, format, type, pixels);
	}
	public void glReadPixels(int x, int y, int width, int height, int format, int type, java.nio.IntBuffer pixels) {
		GL11.glReadPixels(x, y, width, height, format, type, pixels);
	}
	public void glReadPixels(int x, int y, int width, int height, int format, int type, long pixelsOffset) {
		GL11.glReadPixels(x, y, width, height, format, type, pixelsOffset);
	}
	public void glReadPixels(int x, int y, int width, int height, int format, int type, java.nio.ShortBuffer pixels) {
		GL11.glReadPixels(x, y, width, height, format, type, pixels);
	}
	public void glRect(java.nio.DoubleBuffer v1, java.nio.DoubleBuffer v2) {
		GL11.glRect(v1, v2);
	}
	public void glRect(java.nio.FloatBuffer v1, java.nio.FloatBuffer v2) {
		GL11.glRect(v1, v2);
	}
	public void glRect(java.nio.IntBuffer v1, java.nio.IntBuffer v2) {
		GL11.glRect(v1, v2);
	}
	public void glRect(java.nio.ShortBuffer v1, java.nio.ShortBuffer v2) {
		GL11.glRect(v1, v2);
	}
	public void glRectd(java.nio.ByteBuffer v1, java.nio.ByteBuffer v2) {
		GL11.glRectd(v1, v2);
	}
	public void glRectd(double x1, double y1, double x2, double y2) {
		GL11.glRectd(x1, y1, x2, y2);
	}
	public void glRectf(java.nio.ByteBuffer v1, java.nio.ByteBuffer v2) {
		GL11.glRectf(v1, v2);
	}
	public void glRectf(float x1, float y1, float x2, float y2) {
		GL11.glRectf(x1, y1, x2, y2);
	}
	public void glRecti(java.nio.ByteBuffer v1, java.nio.ByteBuffer v2) {
		GL11.glRecti(v1, v2);
	}
	public void glRecti(int x1, int y1, int x2, int y2) {
		GL11.glRecti(x1, y1, x2, y2);
	}
	public void glRects(java.nio.ByteBuffer v1, java.nio.ByteBuffer v2) {
		GL11.glRects(v1, v2);
	}
	public void glRects(short x1, short y1, short x2, short y2) {
		GL11.glRects(x1, y1, x2, y2);
	}
	public int glRenderMode(int mode) {
		return GL11.glRenderMode(mode);
	}
	public void glRotated(double angle, double x, double y, double z) {
		GL11.glRotated(angle, x, y, z);
	}
	public void glRotatef(float angle, float x, float y, float z) {
		GL11.glRotatef(angle, x, y, z);
	}
	public void glScaled(double x, double y, double z) {
		GL11.glScaled(x, y, z);
	}
	public void glScalef(float x, float y, float z) {
		GL11.glScalef(x, y, z);
	}
	public void glScissor(int x, int y, int width, int height) {
		GL11.glScissor(x, y, width, height);
	}
	public void glSelectBuffer(java.nio.IntBuffer buffer) {
		GL11.glSelectBuffer(buffer);
	}
	public void glSelectBuffer(int size, java.nio.ByteBuffer buffer) {
		GL11.glSelectBuffer(size, buffer);
	}
	public void glShadeModel(int mode) {
		GL11.glShadeModel(mode);
	}
	public void glStencilFunc(int func, int ref, int mask) {
		GL11.glStencilFunc(func, ref, mask);
	}
	public void glStencilMask(int mask) {
		GL11.glStencilMask(mask);
	}
	public void glStencilOp(int sfail, int dpfail, int dppass) {
		GL11.glStencilOp(sfail, dpfail, dppass);
	}
	public void glTexCoord1(java.nio.DoubleBuffer v) {
		GL11.glTexCoord1(v);
	}
	public void glTexCoord1(java.nio.FloatBuffer v) {
		GL11.glTexCoord1(v);
	}
	public void glTexCoord1(java.nio.IntBuffer v) {
		GL11.glTexCoord1(v);
	}
	public void glTexCoord1(java.nio.ShortBuffer v) {
		GL11.glTexCoord1(v);
	}
	public void glTexCoord1d(java.nio.ByteBuffer v) {
		GL11.glTexCoord1d(v);
	}
	public void glTexCoord1d(double s) {
		GL11.glTexCoord1d(s);
	}
	public void glTexCoord1f(java.nio.ByteBuffer v) {
		GL11.glTexCoord1f(v);
	}
	public void glTexCoord1f(float s) {
		GL11.glTexCoord1f(s);
	}
	public void glTexCoord1i(java.nio.ByteBuffer v) {
		GL11.glTexCoord1i(v);
	}
	public void glTexCoord1i(int s) {
		GL11.glTexCoord1i(s);
	}
	public void glTexCoord1s(java.nio.ByteBuffer v) {
		GL11.glTexCoord1s(v);
	}
	public void glTexCoord1s(short s) {
		GL11.glTexCoord1s(s);
	}
	public void glTexCoord2(java.nio.DoubleBuffer v) {
		GL11.glTexCoord2(v);
	}
	public void glTexCoord2(java.nio.FloatBuffer v) {
		GL11.glTexCoord2(v);
	}
	public void glTexCoord2(java.nio.IntBuffer v) {
		GL11.glTexCoord2(v);
	}
	public void glTexCoord2(java.nio.ShortBuffer v) {
		GL11.glTexCoord2(v);
	}
	public void glTexCoord2d(java.nio.ByteBuffer v) {
		GL11.glTexCoord2d(v);
	}
	public void glTexCoord2d(double s, double t) {
		GL11.glTexCoord2d(s, t);
	}
	public void glTexCoord2f(java.nio.ByteBuffer v) {
		GL11.glTexCoord2f(v);
	}
	public void glTexCoord2f(float s, float t) {
		GL11.glTexCoord2f(s, t);
	}
	public void glTexCoord2i(java.nio.ByteBuffer v) {
		GL11.glTexCoord2i(v);
	}
	public void glTexCoord2i(int s, int t) {
		GL11.glTexCoord2i(s, t);
	}
	public void glTexCoord2s(java.nio.ByteBuffer v) {
		GL11.glTexCoord2s(v);
	}
	public void glTexCoord2s(short s, short t) {
		GL11.glTexCoord2s(s, t);
	}
	public void glTexCoord3(java.nio.DoubleBuffer v) {
		GL11.glTexCoord3(v);
	}
	public void glTexCoord3(java.nio.FloatBuffer v) {
		GL11.glTexCoord3(v);
	}
	public void glTexCoord3(java.nio.IntBuffer v) {
		GL11.glTexCoord3(v);
	}
	public void glTexCoord3(java.nio.ShortBuffer v) {
		GL11.glTexCoord3(v);
	}
	public void glTexCoord3d(java.nio.ByteBuffer v) {
		GL11.glTexCoord3d(v);
	}
	public void glTexCoord3d(double s, double t, double r) {
		GL11.glTexCoord3d(s, t, r);
	}
	public void glTexCoord3f(java.nio.ByteBuffer v) {
		GL11.glTexCoord3f(v);
	}
	public void glTexCoord3f(float s, float t, float r) {
		GL11.glTexCoord3f(s, t, r);
	}
	public void glTexCoord3i(java.nio.ByteBuffer v) {
		GL11.glTexCoord3i(v);
	}
	public void glTexCoord3i(int s, int t, int r) {
		GL11.glTexCoord3i(s, t, r);
	}
	public void glTexCoord3s(java.nio.ByteBuffer v) {
		GL11.glTexCoord3s(v);
	}
	public void glTexCoord3s(short s, short t, short r) {
		GL11.glTexCoord3s(s, t, r);
	}
	public void glTexCoord4(java.nio.DoubleBuffer v) {
		GL11.glTexCoord4(v);
	}
	public void glTexCoord4(java.nio.FloatBuffer v) {
		GL11.glTexCoord4(v);
	}
	public void glTexCoord4(java.nio.IntBuffer v) {
		GL11.glTexCoord4(v);
	}
	public void glTexCoord4(java.nio.ShortBuffer v) {
		GL11.glTexCoord4(v);
	}
	public void glTexCoord4d(java.nio.ByteBuffer v) {
		GL11.glTexCoord4d(v);
	}
	public void glTexCoord4d(double s, double t, double r, double q) {
		GL11.glTexCoord4d(s, t, r, q);
	}
	public void glTexCoord4f(java.nio.ByteBuffer v) {
		GL11.glTexCoord4f(v);
	}
	public void glTexCoord4f(float s, float t, float r, float q) {
		GL11.glTexCoord4f(s, t, r, q);
	}
	public void glTexCoord4i(java.nio.ByteBuffer v) {
		GL11.glTexCoord4i(v);
	}
	public void glTexCoord4i(int s, int t, int r, int q) {
		GL11.glTexCoord4i(s, t, r, q);
	}
	public void glTexCoord4s(java.nio.ByteBuffer v) {
		GL11.glTexCoord4s(v);
	}
	public void glTexCoord4s(short s, short t, short r, short q) {
		GL11.glTexCoord4s(s, t, r, q);
	}
	public void glTexCoordPointer(int size, int stride, java.nio.FloatBuffer pointer) {
		GL11.glTexCoordPointer(size, stride, pointer);
	}
	public void glTexCoordPointer(int size, int type, int stride, java.nio.ByteBuffer pointer) {
		GL11.glTexCoordPointer(size, type, stride, pointer);
	}
	public void glTexCoordPointer(int size, int type, int stride, long pointerOffset) {
		GL11.glTexCoordPointer(size, type, stride, pointerOffset);
	}
	public void glTexCoordPointer(int size, int stride, java.nio.ShortBuffer pointer) {
		GL11.glTexCoordPointer(size, stride, pointer);
	}
	public void glTexEnv(int target, int pname, java.nio.FloatBuffer params) {
		GL11.glTexEnv(target, pname, params);
	}
	public void glTexEnv(int target, int pname, java.nio.IntBuffer params) {
		GL11.glTexEnv(target, pname, params);
	}
	public void glTexEnvf(int target, int pname, java.nio.ByteBuffer params) {
		GL11.glTexEnvf(target, pname, params);
	}
	public void glTexEnvf(int target, int pname, float param) {
		GL11.glTexEnvf(target, pname, param);
	}
	public void glTexEnvi(int target, int pname, java.nio.ByteBuffer params) {
		GL11.glTexEnvi(target, pname, params);
	}
	public void glTexEnvi(int target, int pname, int param) {
		GL11.glTexEnvi(target, pname, param);
	}
	public void glTexGen(int coord, int pname, java.nio.DoubleBuffer params) {
		GL11.glTexGen(coord, pname, params);
	}
	public void glTexGen(int coord, int pname, java.nio.FloatBuffer params) {
		GL11.glTexGen(coord, pname, params);
	}
	public void glTexGen(int coord, int pname, java.nio.IntBuffer params) {
		GL11.glTexGen(coord, pname, params);
	}
	public void glTexGend(int coord, int pname, java.nio.ByteBuffer params) {
		GL11.glTexGend(coord, pname, params);
	}
	public void glTexGend(int coord, int pname, double param) {
		GL11.glTexGend(coord, pname, param);
	}
	public void glTexGenf(int coord, int pname, java.nio.ByteBuffer params) {
		GL11.glTexGenf(coord, pname, params);
	}
	public void glTexGenf(int coord, int pname, float param) {
		GL11.glTexGenf(coord, pname, param);
	}
	public void glTexGeni(int coord, int pname, java.nio.ByteBuffer params) {
		GL11.glTexGeni(coord, pname, params);
	}
	public void glTexGeni(int coord, int pname, int param) {
		GL11.glTexGeni(coord, pname, param);
	}
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, java.nio.ByteBuffer pixels) {
		GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
	}
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, java.nio.DoubleBuffer pixels) {
		GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
	}
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, java.nio.FloatBuffer pixels) {
		GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
	}
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, java.nio.IntBuffer pixels) {
		GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
	}
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixelsOffset) {
		GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixelsOffset);
	}
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, java.nio.ShortBuffer pixels) {
		GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
	}
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.ByteBuffer pixels) {
		GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
	}
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.DoubleBuffer pixels) {
		GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
	}
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.FloatBuffer pixels) {
		GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
	}
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.IntBuffer pixels) {
		GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
	}
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixelsOffset) {
		GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixelsOffset);
	}
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.ShortBuffer pixels) {
		GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
	}
	public void glTexParameter(int target, int pname, java.nio.FloatBuffer params) {
		GL11.glTexParameter(target, pname, params);
	}
	public void glTexParameter(int target, int pname, java.nio.IntBuffer params) {
		GL11.glTexParameter(target, pname, params);
	}
	public void glTexParameterf(int target, int pname, java.nio.ByteBuffer params) {
		GL11.glTexParameterf(target, pname, params);
	}
	public void glTexParameterf(int target, int pname, float param) {
		GL11.glTexParameterf(target, pname, param);
	}
	public void glTexParameteri(int target, int pname, java.nio.ByteBuffer params) {
		GL11.glTexParameteri(target, pname, params);
	}
	public void glTexParameteri(int target, int pname, int param) {
		GL11.glTexParameteri(target, pname, param);
	}
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, java.nio.ByteBuffer pixels) {
		GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
	}
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, java.nio.DoubleBuffer pixels) {
		GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
	}
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, java.nio.FloatBuffer pixels) {
		GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
	}
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, java.nio.IntBuffer pixels) {
		GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
	}
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixelsOffset) {
		GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixelsOffset);
	}
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, java.nio.ShortBuffer pixels) {
		GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
	}
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.ByteBuffer pixels) {
		GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
	}
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.DoubleBuffer pixels) {
		GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
	}
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.FloatBuffer pixels) {
		GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
	}
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.IntBuffer pixels) {
		GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
	}
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixelsOffset) {
		GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixelsOffset);
	}
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.ShortBuffer pixels) {
		GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
	}
	public void glTranslated(double x, double y, double z) {
		GL11.glTranslated(x, y, z);
	}
	public void glTranslatef(float x, float y, float z) {
		GL11.glTranslatef(x, y, z);
	}
	public void glVertex2(java.nio.DoubleBuffer coords) {
		GL11.glVertex2(coords);
	}
	public void glVertex2(java.nio.FloatBuffer coords) {
		GL11.glVertex2(coords);
	}
	public void glVertex2(java.nio.IntBuffer coords) {
		GL11.glVertex2(coords);
	}
	public void glVertex2(java.nio.ShortBuffer coords) {
		GL11.glVertex2(coords);
	}
	public void glVertex2d(java.nio.ByteBuffer coords) {
		GL11.glVertex2d(coords);
	}
	public void glVertex2d(double x, double y) {
		GL11.glVertex2d(x, y);
	}
	public void glVertex2f(java.nio.ByteBuffer coords) {
		GL11.glVertex2f(coords);
	}
	public void glVertex2f(float x, float y) {
		GL11.glVertex2f(x, y);
	}
	public void glVertex2i(java.nio.ByteBuffer coords) {
		GL11.glVertex2i(coords);
	}
	public void glVertex2i(int x, int y) {
		GL11.glVertex2i(x, y);
	}
	public void glVertex2s(java.nio.ByteBuffer coords) {
		GL11.glVertex2s(coords);
	}
	public void glVertex2s(short x, short y) {
		GL11.glVertex2s(x, y);
	}
	public void glVertex3(java.nio.DoubleBuffer coords) {
		GL11.glVertex3(coords);
	}
	public void glVertex3(java.nio.FloatBuffer coords) {
		GL11.glVertex3(coords);
	}
	public void glVertex3(java.nio.IntBuffer coords) {
		GL11.glVertex3(coords);
	}
	public void glVertex3(java.nio.ShortBuffer coords) {
		GL11.glVertex3(coords);
	}
	public void glVertex3d(java.nio.ByteBuffer coords) {
		GL11.glVertex3d(coords);
	}
	public void glVertex3d(double x, double y, double z) {
		GL11.glVertex3d(x, y, z);
	}
	public void glVertex3f(java.nio.ByteBuffer coords) {
		GL11.glVertex3f(coords);
	}
	public void glVertex3f(float x, float y, float z) {
		GL11.glVertex3f(x, y, z);
	}
	public void glVertex3i(java.nio.ByteBuffer coords) {
		GL11.glVertex3i(coords);
	}
	public void glVertex3i(int x, int y, int z) {
		GL11.glVertex3i(x, y, z);
	}
	public void glVertex3s(java.nio.ByteBuffer coords) {
		GL11.glVertex3s(coords);
	}
	public void glVertex3s(short x, short y, short z) {
		GL11.glVertex3s(x, y, z);
	}
	public void glVertex4(java.nio.DoubleBuffer coords) {
		GL11.glVertex4(coords);
	}
	public void glVertex4(java.nio.FloatBuffer coords) {
		GL11.glVertex4(coords);
	}
	public void glVertex4(java.nio.IntBuffer coords) {
		GL11.glVertex4(coords);
	}
	public void glVertex4(java.nio.ShortBuffer coords) {
		GL11.glVertex4(coords);
	}
	public void glVertex4d(java.nio.ByteBuffer coords) {
		GL11.glVertex4d(coords);
	}
	public void glVertex4d(double x, double y, double z, double w) {
		GL11.glVertex4d(x, y, z, w);
	}
	public void glVertex4f(java.nio.ByteBuffer coords) {
		GL11.glVertex4f(coords);
	}
	public void glVertex4f(float x, float y, float z, float w) {
		GL11.glVertex4f(x, y, z, w);
	}
	public void glVertex4i(java.nio.ByteBuffer coords) {
		GL11.glVertex4i(coords);
	}
	public void glVertex4i(int x, int y, int z, int w) {
		GL11.glVertex4i(x, y, z, w);
	}
	public void glVertex4s(java.nio.ByteBuffer coords) {
		GL11.glVertex4s(coords);
	}
	public void glVertex4s(short x, short y, short z, short w) {
		GL11.glVertex4s(x, y, z, w);
	}
	public void glVertexPointer(int size, int stride, java.nio.DoubleBuffer pointer) {
		GL11.glVertexPointer(size, stride, pointer);
	}
	public void glVertexPointer(int size, int stride, java.nio.FloatBuffer pointer) {
		GL11.glVertexPointer(size, stride, pointer);
	}
	public void glVertexPointer(int size, int stride, java.nio.IntBuffer pointer) {
		GL11.glVertexPointer(size, stride, pointer);
	}
	public void glVertexPointer(int size, int type, int stride, java.nio.ByteBuffer pointer) {
		GL11.glVertexPointer(size, type, stride, pointer);
	}
	public void glVertexPointer(int size, int type, int stride, long pointerOffset) {
		GL11.glVertexPointer(size, type, stride, pointerOffset);
	}
	public void glVertexPointer(int size, int stride, java.nio.ShortBuffer pointer) {
		GL11.glVertexPointer(size, stride, pointer);
	}
	public void glViewport(int x, int y, int w, int h) {
		GL11.glViewport(x, y, w, h);
	}
	public void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
		GL12.glCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
	}
	public void glDrawRangeElements(int mode, int start, int end, java.nio.ByteBuffer indices) {
		GL12.glDrawRangeElements(mode, start, end, indices);
	}
	public void glDrawRangeElements(int mode, int start, int end, java.nio.IntBuffer indices) {
		GL12.glDrawRangeElements(mode, start, end, indices);
	}
	public void glDrawRangeElements(int mode, int start, int end, int type, java.nio.ByteBuffer indices) {
		GL12.glDrawRangeElements(mode, start, end, type, indices);
	}
	public void glDrawRangeElements(int mode, int start, int end, int count, int type, java.nio.ByteBuffer indices) {
		GL12.glDrawRangeElements(mode, start, end, count, type, indices);
	}
	public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indicesOffset) {
		GL12.glDrawRangeElements(mode, start, end, count, type, indicesOffset);
	}
	public void glDrawRangeElements(int mode, int start, int end, java.nio.ShortBuffer indices) {
		GL12.glDrawRangeElements(mode, start, end, indices);
	}
	public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, java.nio.ByteBuffer pixels) {
		GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
	}
	public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, java.nio.DoubleBuffer pixels) {
		GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
	}
	public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, java.nio.FloatBuffer pixels) {
		GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
	}
	public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, java.nio.IntBuffer pixels) {
		GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
	}
	public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixelsOffset) {
		GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixelsOffset);
	}
	public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, java.nio.ShortBuffer pixels) {
		GL12.glTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
	}
	public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.ByteBuffer pixels) {
		GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}
	public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.DoubleBuffer pixels) {
		GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}
	public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.FloatBuffer pixels) {
		GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}
	public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.IntBuffer pixels) {
		GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}
	public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixelsOffset) {
		GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixelsOffset);
	}
	public void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.ShortBuffer pixels) {
		GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}
	public void glActiveTexture(int texture) {
		GL13.glActiveTexture(texture);
	}
	public void glClientActiveTexture(int texture) {
		GL13.glClientActiveTexture(texture);
	}
	public void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, java.nio.ByteBuffer data) {
		GL13.glCompressedTexImage1D(target, level, internalformat, width, border, data);
	}
	public void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, java.nio.ByteBuffer data) {
		GL13.glCompressedTexImage1D(target, level, internalformat, width, border, imageSize, data);
	}
	public void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, long dataOffset) {
		GL13.glCompressedTexImage1D(target, level, internalformat, width, border, imageSize, dataOffset);
	}
	public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, java.nio.ByteBuffer data) {
		GL13.glCompressedTexImage2D(target, level, internalformat, width, height, border, data);
	}
	public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, java.nio.ByteBuffer data) {
		GL13.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
	}
	public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long dataOffset) {
		GL13.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, dataOffset);
	}
	public void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, java.nio.ByteBuffer data) {
		GL13.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, data);
	}
	public void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, java.nio.ByteBuffer data) {
		GL13.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
	}
	public void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long dataOffset) {
		GL13.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, dataOffset);
	}
	public void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, java.nio.ByteBuffer data) {
		GL13.glCompressedTexSubImage1D(target, level, xoffset, width, format, data);
	}
	public void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, java.nio.ByteBuffer data) {
		GL13.glCompressedTexSubImage1D(target, level, xoffset, width, format, imageSize, data);
	}
	public void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, long dataOffset) {
		GL13.glCompressedTexSubImage1D(target, level, xoffset, width, format, imageSize, dataOffset);
	}
	public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, java.nio.ByteBuffer data) {
		GL13.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data);
	}
	public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, java.nio.ByteBuffer data) {
		GL13.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
	}
	public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long dataOffset) {
		GL13.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, dataOffset);
	}
	public void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, java.nio.ByteBuffer data) {
		GL13.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
	}
	public void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, java.nio.ByteBuffer data) {
		GL13.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}
	public void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long dataOffset) {
		GL13.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, dataOffset);
	}
	public void glGetCompressedTexImage(int target, int level, java.nio.ByteBuffer pixels) {
		GL13.glGetCompressedTexImage(target, level, pixels);
	}
	public void glGetCompressedTexImage(int target, int level, long pixelsOffset) {
		GL13.glGetCompressedTexImage(target, level, pixelsOffset);
	}
	public void glLoadTransposeMatrix(java.nio.DoubleBuffer m) {
		GL13.glLoadTransposeMatrix(m);
	}
	public void glLoadTransposeMatrix(java.nio.FloatBuffer m) {
		GL13.glLoadTransposeMatrix(m);
	}
	public void glLoadTransposeMatrixd(java.nio.ByteBuffer m) {
		GL13.glLoadTransposeMatrixd(m);
	}
	public void glLoadTransposeMatrixf(java.nio.ByteBuffer m) {
		GL13.glLoadTransposeMatrixf(m);
	}
	public void glMultiTexCoord1(int texture, java.nio.DoubleBuffer v) {
		GL13.glMultiTexCoord1(texture, v);
	}
	public void glMultiTexCoord1(int texture, java.nio.FloatBuffer v) {
		GL13.glMultiTexCoord1(texture, v);
	}
	public void glMultiTexCoord1(int texture, java.nio.IntBuffer v) {
		GL13.glMultiTexCoord1(texture, v);
	}
	public void glMultiTexCoord1(int texture, java.nio.ShortBuffer v) {
		GL13.glMultiTexCoord1(texture, v);
	}
	public void glMultiTexCoord1d(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord1d(texture, v);
	}
	public void glMultiTexCoord1d(int texture, double s) {
		GL13.glMultiTexCoord1d(texture, s);
	}
	public void glMultiTexCoord1f(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord1f(texture, v);
	}
	public void glMultiTexCoord1f(int texture, float s) {
		GL13.glMultiTexCoord1f(texture, s);
	}
	public void glMultiTexCoord1i(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord1i(texture, v);
	}
	public void glMultiTexCoord1i(int texture, int s) {
		GL13.glMultiTexCoord1i(texture, s);
	}
	public void glMultiTexCoord1s(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord1s(texture, v);
	}
	public void glMultiTexCoord1s(int texture, short s) {
		GL13.glMultiTexCoord1s(texture, s);
	}
	public void glMultiTexCoord2(int texture, java.nio.DoubleBuffer v) {
		GL13.glMultiTexCoord2(texture, v);
	}
	public void glMultiTexCoord2(int texture, java.nio.FloatBuffer v) {
		GL13.glMultiTexCoord2(texture, v);
	}
	public void glMultiTexCoord2(int texture, java.nio.IntBuffer v) {
		GL13.glMultiTexCoord2(texture, v);
	}
	public void glMultiTexCoord2(int texture, java.nio.ShortBuffer v) {
		GL13.glMultiTexCoord2(texture, v);
	}
	public void glMultiTexCoord2d(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord2d(texture, v);
	}
	public void glMultiTexCoord2d(int texture, double s, double t) {
		GL13.glMultiTexCoord2d(texture, s, t);
	}
	public void glMultiTexCoord2f(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord2f(texture, v);
	}
	public void glMultiTexCoord2f(int texture, float s, float t) {
		GL13.glMultiTexCoord2f(texture, s, t);
	}
	public void glMultiTexCoord2i(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord2i(texture, v);
	}
	public void glMultiTexCoord2i(int texture, int s, int t) {
		GL13.glMultiTexCoord2i(texture, s, t);
	}
	public void glMultiTexCoord2s(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord2s(texture, v);
	}
	public void glMultiTexCoord2s(int texture, short s, short t) {
		GL13.glMultiTexCoord2s(texture, s, t);
	}
	public void glMultiTexCoord3(int texture, java.nio.DoubleBuffer v) {
		GL13.glMultiTexCoord3(texture, v);
	}
	public void glMultiTexCoord3(int texture, java.nio.FloatBuffer v) {
		GL13.glMultiTexCoord3(texture, v);
	}
	public void glMultiTexCoord3(int texture, java.nio.IntBuffer v) {
		GL13.glMultiTexCoord3(texture, v);
	}
	public void glMultiTexCoord3(int texture, java.nio.ShortBuffer v) {
		GL13.glMultiTexCoord3(texture, v);
	}
	public void glMultiTexCoord3d(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord3d(texture, v);
	}
	public void glMultiTexCoord3d(int texture, double s, double t, double r) {
		GL13.glMultiTexCoord3d(texture, s, t, r);
	}
	public void glMultiTexCoord3f(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord3f(texture, v);
	}
	public void glMultiTexCoord3f(int texture, float s, float t, float r) {
		GL13.glMultiTexCoord3f(texture, s, t, r);
	}
	public void glMultiTexCoord3i(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord3i(texture, v);
	}
	public void glMultiTexCoord3i(int texture, int s, int t, int r) {
		GL13.glMultiTexCoord3i(texture, s, t, r);
	}
	public void glMultiTexCoord3s(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord3s(texture, v);
	}
	public void glMultiTexCoord3s(int texture, short s, short t, short r) {
		GL13.glMultiTexCoord3s(texture, s, t, r);
	}
	public void glMultiTexCoord4(int texture, java.nio.DoubleBuffer v) {
		GL13.glMultiTexCoord4(texture, v);
	}
	public void glMultiTexCoord4(int texture, java.nio.FloatBuffer v) {
		GL13.glMultiTexCoord4(texture, v);
	}
	public void glMultiTexCoord4(int texture, java.nio.IntBuffer v) {
		GL13.glMultiTexCoord4(texture, v);
	}
	public void glMultiTexCoord4(int texture, java.nio.ShortBuffer v) {
		GL13.glMultiTexCoord4(texture, v);
	}
	public void glMultiTexCoord4d(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord4d(texture, v);
	}
	public void glMultiTexCoord4d(int texture, double s, double t, double r, double q) {
		GL13.glMultiTexCoord4d(texture, s, t, r, q);
	}
	public void glMultiTexCoord4f(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord4f(texture, v);
	}
	public void glMultiTexCoord4f(int texture, float s, float t, float r, float q) {
		GL13.glMultiTexCoord4f(texture, s, t, r, q);
	}
	public void glMultiTexCoord4i(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord4i(texture, v);
	}
	public void glMultiTexCoord4i(int texture, int s, int t, int r, int q) {
		GL13.glMultiTexCoord4i(texture, s, t, r, q);
	}
	public void glMultiTexCoord4s(int texture, java.nio.ByteBuffer v) {
		GL13.glMultiTexCoord4s(texture, v);
	}
	public void glMultiTexCoord4s(int texture, short s, short t, short r, short q) {
		GL13.glMultiTexCoord4s(texture, s, t, r, q);
	}
	public void glMultTransposeMatrix(java.nio.DoubleBuffer m) {
		GL13.glMultTransposeMatrix(m);
	}
	public void glMultTransposeMatrix(java.nio.FloatBuffer m) {
		GL13.glMultTransposeMatrix(m);
	}
	public void glMultTransposeMatrixd(java.nio.ByteBuffer m) {
		GL13.glMultTransposeMatrixd(m);
	}
	public void glMultTransposeMatrixf(java.nio.ByteBuffer m) {
		GL13.glMultTransposeMatrixf(m);
	}
	public void glSampleCoverage(float value, boolean invert) {
		GL13.glSampleCoverage(value, invert);
	}
	public void glBlendColor(float red, float green, float blue, float alpha) {
		GL14.glBlendColor(red, green, blue, alpha);
	}
	public void glBlendEquation(int mode) {
		GL14.glBlendEquation(mode);
	}
	public void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		GL14.glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
	}
	public void glFogCoord(java.nio.DoubleBuffer coord) {
		GL14.glFogCoord(coord);
	}
	public void glFogCoord(java.nio.FloatBuffer coord) {
		GL14.glFogCoord(coord);
	}
	public void glFogCoordd(java.nio.ByteBuffer coord) {
		GL14.glFogCoordd(coord);
	}
	public void glFogCoordd(double coord) {
		GL14.glFogCoordd(coord);
	}
	public void glFogCoordf(java.nio.ByteBuffer coord) {
		GL14.glFogCoordf(coord);
	}
	public void glFogCoordf(float coord) {
		GL14.glFogCoordf(coord);
	}
	public void glFogCoordPointer(int stride, java.nio.FloatBuffer pointer) {
		GL14.glFogCoordPointer(stride, pointer);
	}
	public void glFogCoordPointer(int type, int stride, java.nio.ByteBuffer pointer) {
		GL14.glFogCoordPointer(type, stride, pointer);
	}
	public void glFogCoordPointer(int type, int stride, long pointerOffset) {
		GL14.glFogCoordPointer(type, stride, pointerOffset);
	}
	public void glMultiDrawArrays(int mode, java.nio.ByteBuffer first, java.nio.ByteBuffer count, int primcount) {
		GL14.glMultiDrawArrays(mode, first, count, primcount);
	}
	public void glMultiDrawArrays(int mode, java.nio.IntBuffer first, java.nio.IntBuffer count) {
		GL14.glMultiDrawArrays(mode, first, count);
	}
	public void glMultiDrawElements(int mode, java.nio.ByteBuffer count, int type, java.nio.ByteBuffer indices, int primcount) {
		GL14.glMultiDrawElements(mode, count, type, indices, primcount);
	}
	public void glMultiDrawElements(int mode, java.nio.IntBuffer count, int type, PointerBuffer indices) {
		GL14.glMultiDrawElements(mode, count, type, LWJGLUtils.s_wrapPointerBuffer(indices));
	}
	public void glPointParameter(int pname, java.nio.FloatBuffer params) {
		GL14.glPointParameter(pname, params);
	}
	public void glPointParameter(int pname, java.nio.IntBuffer params) {
		GL14.glPointParameter(pname, params);
	}
	public void glPointParameterf(int pname, java.nio.ByteBuffer params) {
		GL14.glPointParameterf(pname, params);
	}
	public void glPointParameterf(int pname, float param) {
		GL14.glPointParameterf(pname, param);
	}
	public void glPointParameteri(int pname, java.nio.ByteBuffer params) {
		GL14.glPointParameteri(pname, params);
	}
	public void glPointParameteri(int pname, int param) {
		GL14.glPointParameteri(pname, param);
	}
	public void glSecondaryColor3(java.nio.DoubleBuffer v) {
		GL14.glSecondaryColor3(v);
	}
	public void glSecondaryColor3(java.nio.FloatBuffer v) {
		GL14.glSecondaryColor3(v);
	}
	public void glSecondaryColor3(java.nio.IntBuffer v) {
		GL14.glSecondaryColor3(v);
	}
	public void glSecondaryColor3(java.nio.ShortBuffer v) {
		GL14.glSecondaryColor3(v);
	}
	public void glSecondaryColor3b(java.nio.ByteBuffer v) {
		GL14.glSecondaryColor3b(v);
	}
	public void glSecondaryColor3b(byte red, byte green, byte blue) {
		GL14.glSecondaryColor3b(red, green, blue);
	}
	public void glSecondaryColor3d(java.nio.ByteBuffer v) {
		GL14.glSecondaryColor3d(v);
	}
	public void glSecondaryColor3d(double red, double green, double blue) {
		GL14.glSecondaryColor3d(red, green, blue);
	}
	public void glSecondaryColor3f(java.nio.ByteBuffer v) {
		GL14.glSecondaryColor3f(v);
	}
	public void glSecondaryColor3f(float red, float green, float blue) {
		GL14.glSecondaryColor3f(red, green, blue);
	}
	public void glSecondaryColor3i(java.nio.ByteBuffer v) {
		GL14.glSecondaryColor3i(v);
	}
	public void glSecondaryColor3i(int red, int green, int blue) {
		GL14.glSecondaryColor3i(red, green, blue);
	}
	public void glSecondaryColor3s(java.nio.ByteBuffer v) {
		GL14.glSecondaryColor3s(v);
	}
	public void glSecondaryColor3s(short red, short green, short blue) {
		GL14.glSecondaryColor3s(red, green, blue);
	}
	public void glSecondaryColor3u(java.nio.IntBuffer v) {
		GL14.glSecondaryColor3u(v);
	}
	public void glSecondaryColor3u(java.nio.ShortBuffer v) {
		GL14.glSecondaryColor3u(v);
	}
	public void glSecondaryColor3ub(java.nio.ByteBuffer v) {
		GL14.glSecondaryColor3ub(v);
	}
	public void glSecondaryColor3ub(byte red, byte green, byte blue) {
		GL14.glSecondaryColor3ub(red, green, blue);
	}
	public void glSecondaryColor3ui(java.nio.ByteBuffer v) {
		GL14.glSecondaryColor3ui(v);
	}
	public void glSecondaryColor3ui(int red, int green, int blue) {
		GL14.glSecondaryColor3ui(red, green, blue);
	}
	public void glSecondaryColor3us(java.nio.ByteBuffer v) {
		GL14.glSecondaryColor3us(v);
	}
	public void glSecondaryColor3us(short red, short green, short blue) {
		GL14.glSecondaryColor3us(red, green, blue);
	}
	public void glSecondaryColorPointer(int size, boolean unsigned, int stride, java.nio.ByteBuffer pointer) {
		GL14.glSecondaryColorPointer(size, unsigned, stride, pointer);
	}
	public void glSecondaryColorPointer(int size, int stride, java.nio.FloatBuffer pointer) {
		GL14.glSecondaryColorPointer(size, stride, pointer);
	}
	public void glSecondaryColorPointer(int size, int type, int stride, java.nio.ByteBuffer pointer) {
		GL14.glSecondaryColorPointer(size, type, stride, pointer);
	}
	public void glSecondaryColorPointer(int size, int type, int stride, long pointerOffset) {
		GL14.glSecondaryColorPointer(size, type, stride, pointerOffset);
	}
	public void glWindowPos2(java.nio.DoubleBuffer p) {
		GL14.glWindowPos2(p);
	}
	public void glWindowPos2(java.nio.FloatBuffer p) {
		GL14.glWindowPos2(p);
	}
	public void glWindowPos2(java.nio.IntBuffer p) {
		GL14.glWindowPos2(p);
	}
	public void glWindowPos2(java.nio.ShortBuffer p) {
		GL14.glWindowPos2(p);
	}
	public void glWindowPos2d(java.nio.ByteBuffer p) {
		GL14.glWindowPos2d(p);
	}
	public void glWindowPos2d(double x, double y) {
		GL14.glWindowPos2d(x, y);
	}
	public void glWindowPos2f(java.nio.ByteBuffer p) {
		GL14.glWindowPos2f(p);
	}
	public void glWindowPos2f(float x, float y) {
		GL14.glWindowPos2f(x, y);
	}
	public void glWindowPos2i(java.nio.ByteBuffer p) {
		GL14.glWindowPos2i(p);
	}
	public void glWindowPos2i(int x, int y) {
		GL14.glWindowPos2i(x, y);
	}
	public void glWindowPos2s(java.nio.ByteBuffer p) {
		GL14.glWindowPos2s(p);
	}
	public void glWindowPos2s(short x, short y) {
		GL14.glWindowPos2s(x, y);
	}
	public void glWindowPos3(java.nio.DoubleBuffer p) {
		GL14.glWindowPos3(p);
	}
	public void glWindowPos3(java.nio.FloatBuffer p) {
		GL14.glWindowPos3(p);
	}
	public void glWindowPos3(java.nio.IntBuffer p) {
		GL14.glWindowPos3(p);
	}
	public void glWindowPos3(java.nio.ShortBuffer p) {
		GL14.glWindowPos3(p);
	}
	public void glWindowPos3d(java.nio.ByteBuffer p) {
		GL14.glWindowPos3d(p);
	}
	public void glWindowPos3d(double x, double y, double z) {
		GL14.glWindowPos3d(x, y, z);
	}
	public void glWindowPos3f(java.nio.ByteBuffer p) {
		GL14.glWindowPos3f(p);
	}
	public void glWindowPos3f(float x, float y, float z) {
		GL14.glWindowPos3f(x, y, z);
	}
	public void glWindowPos3i(java.nio.ByteBuffer p) {
		GL14.glWindowPos3i(p);
	}
	public void glWindowPos3i(int x, int y, int z) {
		GL14.glWindowPos3i(x, y, z);
	}
	public void glWindowPos3s(java.nio.ByteBuffer p) {
		GL14.glWindowPos3s(p);
	}
	public void glWindowPos3s(short x, short y, short z) {
		GL14.glWindowPos3s(x, y, z);
	}
	public void glBeginQuery(int target, int id) {
		GL15.glBeginQuery(target, id);
	}
	public void glBindBuffer(int target, int buffer) {
		GL15.glBindBuffer(target, buffer);
	}
	public void glBufferData(int target, java.nio.ByteBuffer data, int usage) {
		GL15.glBufferData(target, data, usage);
	}
	public void glBufferData(int target, java.nio.DoubleBuffer data, int usage) {
		GL15.glBufferData(target, data, usage);
	}
	public void glBufferData(int target, java.nio.FloatBuffer data, int usage) {
		GL15.glBufferData(target, data, usage);
	}
	public void glBufferData(int target, java.nio.IntBuffer data, int usage) {
		GL15.glBufferData(target, data, usage);
	}
	public void glBufferData(int target, long size, java.nio.ByteBuffer data, int usage) {
		GL15.glBufferData(target, size, data, usage);
	}
	public void glBufferData(int target, long size, int usage) {
		GL15.glBufferData(target, size, usage);
	}
	public void glBufferData(int target, java.nio.ShortBuffer data, int usage) {
		GL15.glBufferData(target, data, usage);
	}
	public void glBufferSubData(int target, long offset, java.nio.ByteBuffer data) {
		GL15.glBufferSubData(target, offset, data);
	}
	public void glBufferSubData(int target, long offset, java.nio.DoubleBuffer data) {
		GL15.glBufferSubData(target, offset, data);
	}
	public void glBufferSubData(int target, long offset, java.nio.FloatBuffer data) {
		GL15.glBufferSubData(target, offset, data);
	}
	public void glBufferSubData(int target, long offset, java.nio.IntBuffer data) {
		GL15.glBufferSubData(target, offset, data);
	}
	public void glBufferSubData(int target, long offset, long size, java.nio.ByteBuffer data) {
		GL15.glBufferSubData(target, offset, size, data);
	}
	public void glBufferSubData(int target, long offset, java.nio.ShortBuffer data) {
		GL15.glBufferSubData(target, offset, data);
	}
	public void glDeleteBuffers(int buffer) {
		GL15.glDeleteBuffers(buffer);
	}
	public void glDeleteBuffers(java.nio.IntBuffer buffers) {
		GL15.glDeleteBuffers(buffers);
	}
	public void glDeleteBuffers(int n, java.nio.ByteBuffer buffers) {
		GL15.glDeleteBuffers(n, buffers);
	}
	public void glDeleteQueries(int id) {
		GL15.glDeleteQueries(id);
	}
	public void glDeleteQueries(java.nio.IntBuffer ids) {
		GL15.glDeleteQueries(ids);
	}
	public void glDeleteQueries(int n, java.nio.ByteBuffer ids) {
		GL15.glDeleteQueries(n, ids);
	}
	public void glEndQuery(int target) {
		GL15.glEndQuery(target);
	}
	public int glGenBuffers() {
		return GL15.glGenBuffers();
	}
	public void glGenBuffers(java.nio.IntBuffer buffers) {
		GL15.glGenBuffers(buffers);
	}
	public void glGenBuffers(int n, java.nio.ByteBuffer buffers) {
		GL15.glGenBuffers(n, buffers);
	}
	public int glGenQueries() {
		return GL15.glGenQueries();
	}
	public void glGenQueries(java.nio.IntBuffer ids) {
		GL15.glGenQueries(ids);
	}
	public void glGenQueries(int n, java.nio.ByteBuffer ids) {
		GL15.glGenQueries(n, ids);
	}
	public void glGetBufferParameter(int target, int pname, java.nio.IntBuffer params) {
		GL15.glGetBufferParameter(target, pname, params);
	}
	public int glGetBufferParameteri(int target, int pname) {
		return GL15.glGetBufferParameteri(target, pname);
	}
	public void glGetBufferParameteri(int target, int pname, java.nio.ByteBuffer params) {
		GL15.glGetBufferParameteri(target, pname, params);
	}
	public long glGetBufferPointer(int target, int pname) {
		return GL15.glGetBufferPointer(target, pname);
	}
	public void glGetBufferPointer(int target, int pname, java.nio.ByteBuffer params) {
		GL15.glGetBufferPointer(target, pname, params);
	}
	public void glGetBufferPointer(int target, int pname, PointerBuffer params) {
		GL15.glGetBufferPointer(target, pname, LWJGLUtils.s_wrapPointerBuffer(params));
	}
	public void glGetBufferSubData(int target, long offset, java.nio.ByteBuffer data) {
		GL15.glGetBufferSubData(target, offset, data);
	}
	public void glGetBufferSubData(int target, long offset, java.nio.DoubleBuffer data) {
		GL15.glGetBufferSubData(target, offset, data);
	}
	public void glGetBufferSubData(int target, long offset, java.nio.FloatBuffer data) {
		GL15.glGetBufferSubData(target, offset, data);
	}
	public void glGetBufferSubData(int target, long offset, java.nio.IntBuffer data) {
		GL15.glGetBufferSubData(target, offset, data);
	}
	public void glGetBufferSubData(int target, long offset, long size, java.nio.ByteBuffer data) {
		GL15.glGetBufferSubData(target, offset, size, data);
	}
	public void glGetBufferSubData(int target, long offset, java.nio.ShortBuffer data) {
		GL15.glGetBufferSubData(target, offset, data);
	}
	public void glGetQuery(int target, int pname, java.nio.IntBuffer params) {
		GL15.glGetQuery(target, pname, params);
	}
	public int glGetQueryi(int target, int pname) {
		return GL15.glGetQueryi(target, pname);
	}
	public void glGetQueryi(int target, int pname, java.nio.ByteBuffer params) {
		GL15.glGetQueryi(target, pname, params);
	}
	public void glGetQueryObject(int id, int pname, java.nio.IntBuffer params) {
		GL15.glGetQueryObject(id, pname, params);
	}
	public int glGetQueryObjecti(int id, int pname) {
		return GL15.glGetQueryObjecti(id, pname);
	}
	public void glGetQueryObjecti(int id, int pname, java.nio.ByteBuffer params) {
		GL15.glGetQueryObjecti(id, pname, params);
	}
	public void glGetQueryObjectu(int id, int pname, java.nio.IntBuffer params) {
		GL15.glGetQueryObjectu(id, pname, params);
	}
	public int glGetQueryObjectui(int id, int pname) {
		return GL15.glGetQueryObjectui(id, pname);
	}
	public void glGetQueryObjectui(int id, int pname, java.nio.ByteBuffer params) {
		GL15.glGetQueryObjectui(id, pname, params);
	}
	public boolean glIsBuffer(int buffer) {
		return GL15.glIsBuffer(buffer);
	}
	public boolean glIsQuery(int id) {
		return GL15.glIsQuery(id);
	}
	public java.nio.ByteBuffer glMapBuffer(int target, int access) {
		return GL15.glMapBuffer(target, access);
	}
	public java.nio.ByteBuffer glMapBuffer(int target, int access, java.nio.ByteBuffer old_buffer) {
		return GL15.glMapBuffer(target, access, old_buffer);
	}
	public java.nio.ByteBuffer glMapBuffer(int target, int access, int length, java.nio.ByteBuffer old_buffer) {
		return GL15.glMapBuffer(target, access, length, old_buffer);
	}
	public boolean glUnmapBuffer(int target) {
		return GL15.glUnmapBuffer(target);
	}
	public LWJGLGL m_gl;
	public LWJGLGL1(LWJGLGL gl) {
		m_gl = gl;
	}
	public LWJGLGL getContext() {
		return m_gl;
	}
}
