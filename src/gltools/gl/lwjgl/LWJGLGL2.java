package gltools.gl.lwjgl;

import org.lwjgl.opengl.GL21;
import org.lwjgl.opengl.GL20;
import gltools.gl.GL2;
import gltools.gl.PointerBuffer;

public class LWJGLGL2 extends LWJGLGL1 implements GL2 {
	public void glAttachShader(int program, int shader) {
		GL20.glAttachShader(program, shader);
	}
	public void glBindAttribLocation(int program, int index, java.nio.ByteBuffer name) {
		GL20.glBindAttribLocation(program, index, name);
	}
	public void glBindAttribLocation(int program, int index, java.lang.CharSequence name) {
		GL20.glBindAttribLocation(program, index, name);
	}
	public void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
		GL20.glBlendEquationSeparate(modeRGB, modeAlpha);
	}
	public void glCompileShader(int shader) {
		GL20.glCompileShader(shader);
	}
	public int glCreateProgram() {
		return GL20.glCreateProgram();
	}
	public int glCreateShader(int type) {
		return GL20.glCreateShader(type);
	}
	public void glDeleteProgram(int program) {
		GL20.glDeleteProgram(program);
	}
	public void glDeleteShader(int shader) {
		GL20.glDeleteShader(shader);
	}
	public void glDetachShader(int program, int shader) {
		GL20.glDetachShader(program, shader);
	}
	public void glDisableVertexAttribArray(int index) {
		GL20.glDisableVertexAttribArray(index);
	}
	public void glDrawBuffers(int buf) {
		GL20.glDrawBuffers(buf);
	}
	public void glDrawBuffers(java.nio.IntBuffer bufs) {
		GL20.glDrawBuffers(bufs);
	}
	public void glDrawBuffers(int n, java.nio.ByteBuffer bufs) {
		GL20.glDrawBuffers(n, bufs);
	}
	public void glEnableVertexAttribArray(int index) {
		GL20.glEnableVertexAttribArray(index);
	}
	public java.lang.String glGetActiveAttrib(int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type) {
		return GL20.glGetActiveAttrib(program, index, size, type);
	}
	public void glGetActiveAttrib(int program, int index, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, java.nio.ByteBuffer name) {
		GL20.glGetActiveAttrib(program, index, length, size, type, name);
	}
	public void glGetActiveAttrib(int program, int index, int maxLength, java.nio.ByteBuffer length, java.nio.ByteBuffer size, java.nio.ByteBuffer type, java.nio.ByteBuffer name) {
		GL20.glGetActiveAttrib(program, index, maxLength, length, size, type, name);
	}
	public java.lang.String glGetActiveAttrib(int program, int index, int maxLength, java.nio.IntBuffer size, java.nio.IntBuffer type) {
		return GL20.glGetActiveAttrib(program, index, maxLength, size, type);
	}
	public java.lang.String glGetActiveUniform(int program, int index, java.nio.IntBuffer size, java.nio.IntBuffer type) {
		return GL20.glGetActiveUniform(program, index, size, type);
	}
	public void glGetActiveUniform(int program, int index, java.nio.IntBuffer length, java.nio.IntBuffer size, java.nio.IntBuffer type, java.nio.ByteBuffer name) {
		GL20.glGetActiveUniform(program, index, length, size, type, name);
	}
	public void glGetActiveUniform(int program, int index, int maxLength, java.nio.ByteBuffer length, java.nio.ByteBuffer size, java.nio.ByteBuffer type, java.nio.ByteBuffer name) {
		GL20.glGetActiveUniform(program, index, maxLength, length, size, type, name);
	}
	public java.lang.String glGetActiveUniform(int program, int index, int maxLength, java.nio.IntBuffer size, java.nio.IntBuffer type) {
		return GL20.glGetActiveUniform(program, index, maxLength, size, type);
	}
	public java.nio.IntBuffer glGetAttachedShaders(int program) {
		return GL20.glGetAttachedShaders(program);
	}
	public java.nio.IntBuffer glGetAttachedShaders(int program, int maxCount) {
		return GL20.glGetAttachedShaders(program, maxCount);
	}
	public void glGetAttachedShaders(int program, java.nio.IntBuffer count, java.nio.IntBuffer shaders) {
		GL20.glGetAttachedShaders(program, count, shaders);
	}
	public void glGetAttachedShaders(int program, int maxCount, java.nio.ByteBuffer count, java.nio.ByteBuffer shaders) {
		GL20.glGetAttachedShaders(program, maxCount, count, shaders);
	}
	public int glGetAttribLocation(int program, java.nio.ByteBuffer name) {
		return GL20.glGetAttribLocation(program, name);
	}
	public int glGetAttribLocation(int program, java.lang.CharSequence name) {
		return GL20.glGetAttribLocation(program, name);
	}
	public void glGetProgram(int program, int pname, java.nio.IntBuffer params) {
		GL20.glGetProgram(program, pname, params);
	}
	public int glGetProgrami(int program, int pname) {
		return GL20.glGetProgrami(program, pname);
	}
	public void glGetProgrami(int program, int pname, java.nio.ByteBuffer params) {
		GL20.glGetProgrami(program, pname, params);
	}
	public java.lang.String glGetProgramInfoLog(int program) {
		return GL20.glGetProgramInfoLog(program);
	}
	public java.lang.String glGetProgramInfoLog(int program, int maxLength) {
		return GL20.glGetProgramInfoLog(program, maxLength);
	}
	public void glGetProgramInfoLog(int program, java.nio.IntBuffer length, java.nio.ByteBuffer infoLog) {
		GL20.glGetProgramInfoLog(program, length, infoLog);
	}
	public void glGetProgramInfoLog(int program, int maxLength, java.nio.ByteBuffer length, java.nio.ByteBuffer infoLog) {
		GL20.glGetProgramInfoLog(program, maxLength, length, infoLog);
	}
	public void glGetShader(int shader, int pname, java.nio.IntBuffer params) {
		GL20.glGetShader(shader, pname, params);
	}
	public int glGetShaderi(int shader, int pname) {
		return GL20.glGetShaderi(shader, pname);
	}
	public void glGetShaderi(int shader, int pname, java.nio.ByteBuffer params) {
		GL20.glGetShaderi(shader, pname, params);
	}
	public java.lang.String glGetShaderInfoLog(int shader) {
		return GL20.glGetShaderInfoLog(shader);
	}
	public java.lang.String glGetShaderInfoLog(int shader, int maxLength) {
		return GL20.glGetShaderInfoLog(shader, maxLength);
	}
	public void glGetShaderInfoLog(int shader, java.nio.IntBuffer length, java.nio.ByteBuffer infoLog) {
		GL20.glGetShaderInfoLog(shader, length, infoLog);
	}
	public void glGetShaderInfoLog(int shader, int maxLength, java.nio.ByteBuffer length, java.nio.ByteBuffer infoLog) {
		GL20.glGetShaderInfoLog(shader, maxLength, length, infoLog);
	}
	public java.lang.String glGetShaderSource(int shader) {
		return GL20.glGetShaderSource(shader);
	}
	public java.lang.String glGetShaderSource(int shader, int maxLength) {
		return GL20.glGetShaderSource(shader, maxLength);
	}
	public void glGetShaderSource(int shader, java.nio.IntBuffer length, java.nio.ByteBuffer source) {
		GL20.glGetShaderSource(shader, length, source);
	}
	public void glGetShaderSource(int shader, int maxLength, java.nio.ByteBuffer length, java.nio.ByteBuffer source) {
		GL20.glGetShaderSource(shader, maxLength, length, source);
	}
	public void glGetUniform(int program, int location, java.nio.FloatBuffer params) {
		GL20.glGetUniform(program, location, params);
	}
	public void glGetUniform(int program, int location, java.nio.IntBuffer params) {
		GL20.glGetUniform(program, location, params);
	}
	public float glGetUniformf(int program, int location) {
		return GL20.glGetUniformf(program, location);
	}
	public void glGetUniformf(int program, int location, java.nio.ByteBuffer params) {
		GL20.glGetUniformf(program, location, params);
	}
	public int glGetUniformi(int program, int location) {
		return GL20.glGetUniformi(program, location);
	}
	public void glGetUniformi(int program, int location, java.nio.ByteBuffer params) {
		GL20.glGetUniformi(program, location, params);
	}
	public int glGetUniformLocation(int program, java.nio.ByteBuffer name) {
		return GL20.glGetUniformLocation(program, name);
	}
	public int glGetUniformLocation(int program, java.lang.CharSequence name) {
		return GL20.glGetUniformLocation(program, name);
	}
	public void glGetVertexAttrib(int index, int pname, java.nio.DoubleBuffer params) {
		GL20.glGetVertexAttrib(index, pname, params);
	}
	public void glGetVertexAttrib(int index, int pname, java.nio.FloatBuffer params) {
		GL20.glGetVertexAttrib(index, pname, params);
	}
	public void glGetVertexAttrib(int index, int pname, java.nio.IntBuffer params) {
		GL20.glGetVertexAttrib(index, pname, params);
	}
	public void glGetVertexAttribd(int index, int pname, java.nio.ByteBuffer params) {
		GL20.glGetVertexAttribd(index, pname, params);
	}
	public void glGetVertexAttribf(int index, int pname, java.nio.ByteBuffer params) {
		GL20.glGetVertexAttribf(index, pname, params);
	}
	public int glGetVertexAttribi(int index, int pname) {
		return GL20.glGetVertexAttribi(index, pname);
	}
	public void glGetVertexAttribi(int index, int pname, java.nio.ByteBuffer params) {
		GL20.glGetVertexAttribi(index, pname, params);
	}
	public long glGetVertexAttribPointer(int index, int pname) {
		return GL20.glGetVertexAttribPointer(index, pname);
	}
	public void glGetVertexAttribPointer(int index, int pname, java.nio.ByteBuffer pointer) {
		GL20.glGetVertexAttribPointer(index, pname, pointer);
	}
	public void glGetVertexAttribPointer(int index, int pname, PointerBuffer pointer) {
		GL20.glGetVertexAttribPointer(index, pname, LWJGLUtils.s_wrapPointerBuffer(pointer));
	}
	public void glLinkProgram(int program) {
		GL20.glLinkProgram(program);
	}
	public void glShaderSource(int shader, java.lang.CharSequence string) {
		GL20.glShaderSource(shader, string);
	}
	public void glShaderSource(int shader, java.lang.CharSequence[] strings) {
		GL20.glShaderSource(shader, strings);
	}
	public void glShaderSource(int shader, int count, java.nio.ByteBuffer strings, java.nio.ByteBuffer length) {
		GL20.glShaderSource(shader, count, strings, length);
	}
	public void glShaderSource(int shader, PointerBuffer strings, java.nio.IntBuffer length) {
		GL20.glShaderSource(shader, LWJGLUtils.s_wrapPointerBuffer(strings), length);
	}
	public void glStencilFuncSeparate(int face, int func, int ref, int mask) {
		GL20.glStencilFuncSeparate(face, func, ref, mask);
	}
	public void glStencilMaskSeparate(int face, int mask) {
		GL20.glStencilMaskSeparate(face, mask);
	}
	public void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
		GL20.glStencilOpSeparate(face, sfail, dpfail, dppass);
	}
	public void glUniform1(int location, java.nio.FloatBuffer value) {
		GL20.glUniform1(location, value);
	}
	public void glUniform1(int location, java.nio.IntBuffer value) {
		GL20.glUniform1(location, value);
	}
	public void glUniform1f(int location, float v0) {
		GL20.glUniform1f(location, v0);
	}
	public void glUniform1f(int location, int count, java.nio.ByteBuffer value) {
		GL20.glUniform1f(location, count, value);
	}
	public void glUniform1i(int location, int v0) {
		GL20.glUniform1i(location, v0);
	}
	public void glUniform1i(int location, int count, java.nio.ByteBuffer value) {
		GL20.glUniform1i(location, count, value);
	}
	public void glUniform2(int location, java.nio.FloatBuffer value) {
		GL20.glUniform2(location, value);
	}
	public void glUniform2(int location, java.nio.IntBuffer value) {
		GL20.glUniform2(location, value);
	}
	public void glUniform2f(int location, float v0, float v1) {
		GL20.glUniform2f(location, v0, v1);
	}
	public void glUniform2f(int location, int count, java.nio.ByteBuffer value) {
		GL20.glUniform2f(location, count, value);
	}
	public void glUniform2i(int location, int count, java.nio.ByteBuffer value) {
		GL20.glUniform2i(location, count, value);
	}
	public void glUniform2i(int location, int v0, int v1) {
		GL20.glUniform2i(location, v0, v1);
	}
	public void glUniform3(int location, java.nio.FloatBuffer value) {
		GL20.glUniform3(location, value);
	}
	public void glUniform3(int location, java.nio.IntBuffer value) {
		GL20.glUniform3(location, value);
	}
	public void glUniform3f(int location, float v0, float v1, float v2) {
		GL20.glUniform3f(location, v0, v1, v2);
	}
	public void glUniform3f(int location, int count, java.nio.ByteBuffer value) {
		GL20.glUniform3f(location, count, value);
	}
	public void glUniform3i(int location, int count, java.nio.ByteBuffer value) {
		GL20.glUniform3i(location, count, value);
	}
	public void glUniform3i(int location, int v0, int v1, int v2) {
		GL20.glUniform3i(location, v0, v1, v2);
	}
	public void glUniform4(int location, java.nio.FloatBuffer value) {
		GL20.glUniform4(location, value);
	}
	public void glUniform4(int location, java.nio.IntBuffer value) {
		GL20.glUniform4(location, value);
	}
	public void glUniform4f(int location, float v0, float v1, float v2, float v3) {
		GL20.glUniform4f(location, v0, v1, v2, v3);
	}
	public void glUniform4f(int location, int count, java.nio.ByteBuffer value) {
		GL20.glUniform4f(location, count, value);
	}
	public void glUniform4i(int location, int count, java.nio.ByteBuffer value) {
		GL20.glUniform4i(location, count, value);
	}
	public void glUniform4i(int location, int v0, int v1, int v2, int v3) {
		GL20.glUniform4i(location, v0, v1, v2, v3);
	}
	public void glUniformMatrix2(int location, boolean transpose, java.nio.FloatBuffer value) {
		GL20.glUniformMatrix2(location, transpose, value);
	}
	public void glUniformMatrix2f(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL20.glUniformMatrix2f(location, count, transpose, value);
	}
	public void glUniformMatrix3(int location, boolean transpose, java.nio.FloatBuffer value) {
		GL20.glUniformMatrix3(location, transpose, value);
	}
	public void glUniformMatrix3f(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL20.glUniformMatrix3f(location, count, transpose, value);
	}
	public void glUniformMatrix4(int location, boolean transpose, java.nio.FloatBuffer value) {
		GL20.glUniformMatrix4(location, transpose, value);
	}
	public void glUniformMatrix4f(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL20.glUniformMatrix4f(location, count, transpose, value);
	}
	public void glUseProgram(int program) {
		GL20.glUseProgram(program);
	}
	public void glValidateProgram(int program) {
		GL20.glValidateProgram(program);
	}
	public void glVertexAttrib1(int index, java.nio.DoubleBuffer v) {
		GL20.glVertexAttrib1(index, v);
	}
	public void glVertexAttrib1(int index, java.nio.FloatBuffer v) {
		GL20.glVertexAttrib1(index, v);
	}
	public void glVertexAttrib1(int index, java.nio.ShortBuffer v) {
		GL20.glVertexAttrib1(index, v);
	}
	public void glVertexAttrib1d(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib1d(index, v);
	}
	public void glVertexAttrib1d(int index, double v0) {
		GL20.glVertexAttrib1d(index, v0);
	}
	public void glVertexAttrib1f(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib1f(index, v);
	}
	public void glVertexAttrib1f(int index, float v0) {
		GL20.glVertexAttrib1f(index, v0);
	}
	public void glVertexAttrib1s(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib1s(index, v);
	}
	public void glVertexAttrib1s(int index, short v0) {
		GL20.glVertexAttrib1s(index, v0);
	}
	public void glVertexAttrib2(int index, java.nio.DoubleBuffer v) {
		GL20.glVertexAttrib2(index, v);
	}
	public void glVertexAttrib2(int index, java.nio.FloatBuffer v) {
		GL20.glVertexAttrib2(index, v);
	}
	public void glVertexAttrib2(int index, java.nio.ShortBuffer v) {
		GL20.glVertexAttrib2(index, v);
	}
	public void glVertexAttrib2d(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib2d(index, v);
	}
	public void glVertexAttrib2d(int index, double v0, double v1) {
		GL20.glVertexAttrib2d(index, v0, v1);
	}
	public void glVertexAttrib2f(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib2f(index, v);
	}
	public void glVertexAttrib2f(int index, float v0, float v1) {
		GL20.glVertexAttrib2f(index, v0, v1);
	}
	public void glVertexAttrib2s(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib2s(index, v);
	}
	public void glVertexAttrib2s(int index, short v0, short v1) {
		GL20.glVertexAttrib2s(index, v0, v1);
	}
	public void glVertexAttrib3(int index, java.nio.DoubleBuffer v) {
		GL20.glVertexAttrib3(index, v);
	}
	public void glVertexAttrib3(int index, java.nio.FloatBuffer v) {
		GL20.glVertexAttrib3(index, v);
	}
	public void glVertexAttrib3(int index, java.nio.ShortBuffer v) {
		GL20.glVertexAttrib3(index, v);
	}
	public void glVertexAttrib3d(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib3d(index, v);
	}
	public void glVertexAttrib3d(int index, double v0, double v1, double v2) {
		GL20.glVertexAttrib3d(index, v0, v1, v2);
	}
	public void glVertexAttrib3f(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib3f(index, v);
	}
	public void glVertexAttrib3f(int index, float v0, float v1, float v2) {
		GL20.glVertexAttrib3f(index, v0, v1, v2);
	}
	public void glVertexAttrib3s(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib3s(index, v);
	}
	public void glVertexAttrib3s(int index, short v0, short v1, short v2) {
		GL20.glVertexAttrib3s(index, v0, v1, v2);
	}
	public void glVertexAttrib4(int index, java.nio.DoubleBuffer v) {
		GL20.glVertexAttrib4(index, v);
	}
	public void glVertexAttrib4(int index, java.nio.FloatBuffer v) {
		GL20.glVertexAttrib4(index, v);
	}
	public void glVertexAttrib4(int index, java.nio.IntBuffer v) {
		GL20.glVertexAttrib4(index, v);
	}
	public void glVertexAttrib4(int index, java.nio.ShortBuffer v) {
		GL20.glVertexAttrib4(index, v);
	}
	public void glVertexAttrib4b(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib4b(index, v);
	}
	public void glVertexAttrib4d(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib4d(index, v);
	}
	public void glVertexAttrib4d(int index, double v0, double v1, double v2, double v3) {
		GL20.glVertexAttrib4d(index, v0, v1, v2, v3);
	}
	public void glVertexAttrib4f(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib4f(index, v);
	}
	public void glVertexAttrib4f(int index, float v0, float v1, float v2, float v3) {
		GL20.glVertexAttrib4f(index, v0, v1, v2, v3);
	}
	public void glVertexAttrib4i(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib4i(index, v);
	}
	public void glVertexAttrib4N(int index, java.nio.IntBuffer v) {
		GL20.glVertexAttrib4N(index, v);
	}
	public void glVertexAttrib4N(int index, java.nio.ShortBuffer v) {
		GL20.glVertexAttrib4N(index, v);
	}
	public void glVertexAttrib4Nb(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib4Nb(index, v);
	}
	public void glVertexAttrib4Ni(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib4Ni(index, v);
	}
	public void glVertexAttrib4Ns(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib4Ns(index, v);
	}
	public void glVertexAttrib4Nu(int index, java.nio.IntBuffer v) {
		GL20.glVertexAttrib4Nu(index, v);
	}
	public void glVertexAttrib4Nu(int index, java.nio.ShortBuffer v) {
		GL20.glVertexAttrib4Nu(index, v);
	}
	public void glVertexAttrib4Nub(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib4Nub(index, v);
	}
	public void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
		GL20.glVertexAttrib4Nub(index, x, y, z, w);
	}
	public void glVertexAttrib4Nui(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib4Nui(index, v);
	}
	public void glVertexAttrib4Nus(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib4Nus(index, v);
	}
	public void glVertexAttrib4s(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib4s(index, v);
	}
	public void glVertexAttrib4s(int index, short v0, short v1, short v2, short v3) {
		GL20.glVertexAttrib4s(index, v0, v1, v2, v3);
	}
	public void glVertexAttrib4u(int index, java.nio.IntBuffer v) {
		GL20.glVertexAttrib4u(index, v);
	}
	public void glVertexAttrib4u(int index, java.nio.ShortBuffer v) {
		GL20.glVertexAttrib4u(index, v);
	}
	public void glVertexAttrib4ub(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib4ub(index, v);
	}
	public void glVertexAttrib4ui(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib4ui(index, v);
	}
	public void glVertexAttrib4us(int index, java.nio.ByteBuffer v) {
		GL20.glVertexAttrib4us(index, v);
	}
	public void glVertexAttribPointer(int index, int size, boolean normalized, int stride, java.nio.DoubleBuffer pointer) {
		GL20.glVertexAttribPointer(index, size, normalized, stride, pointer);
	}
	public void glVertexAttribPointer(int index, int size, boolean normalized, int stride, java.nio.FloatBuffer pointer) {
		GL20.glVertexAttribPointer(index, size, normalized, stride, pointer);
	}
	public void glVertexAttribPointer(int index, int size, boolean normalized, int stride, java.nio.IntBuffer pointer) {
		GL20.glVertexAttribPointer(index, size, normalized, stride, pointer);
	}
	public void glVertexAttribPointer(int index, int size, boolean normalized, int stride, java.nio.ShortBuffer pointer) {
		GL20.glVertexAttribPointer(index, size, normalized, stride, pointer);
	}
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, java.nio.ByteBuffer pointer) {
		GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
	}
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointerOffset) {
		GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointerOffset);
	}
	public void glUniformMatrix2x3(int location, boolean transpose, java.nio.FloatBuffer value) {
		GL21.glUniformMatrix2x3(location, transpose, value);
	}
	public void glUniformMatrix2x3f(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL21.glUniformMatrix2x3f(location, count, transpose, value);
	}
	public void glUniformMatrix2x4(int location, boolean transpose, java.nio.FloatBuffer value) {
		GL21.glUniformMatrix2x4(location, transpose, value);
	}
	public void glUniformMatrix2x4f(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL21.glUniformMatrix2x4f(location, count, transpose, value);
	}
	public void glUniformMatrix3x2(int location, boolean transpose, java.nio.FloatBuffer value) {
		GL21.glUniformMatrix3x2(location, transpose, value);
	}
	public void glUniformMatrix3x2f(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL21.glUniformMatrix3x2f(location, count, transpose, value);
	}
	public void glUniformMatrix3x4(int location, boolean transpose, java.nio.FloatBuffer value) {
		GL21.glUniformMatrix3x4(location, transpose, value);
	}
	public void glUniformMatrix3x4f(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL21.glUniformMatrix3x4f(location, count, transpose, value);
	}
	public void glUniformMatrix4x2(int location, boolean transpose, java.nio.FloatBuffer value) {
		GL21.glUniformMatrix4x2(location, transpose, value);
	}
	public void glUniformMatrix4x2f(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL21.glUniformMatrix4x2f(location, count, transpose, value);
	}
	public void glUniformMatrix4x3(int location, boolean transpose, java.nio.FloatBuffer value) {
		GL21.glUniformMatrix4x3(location, transpose, value);
	}
	public void glUniformMatrix4x3f(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL21.glUniformMatrix4x3f(location, count, transpose, value);
	}
}
