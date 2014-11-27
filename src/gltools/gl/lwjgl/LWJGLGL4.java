package gltools.gl.lwjgl;

import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GL42;
import org.lwjgl.opengl.GL41;
import gltools.gl.DebugCallback;
import org.lwjgl.opengl.GL40;
import org.lwjgl.opengl.GL45;
import org.lwjgl.opengl.GL44;
import gltools.gl.GL4;
import gltools.gl.PointerBuffer;

public class LWJGLGL4 extends LWJGLGL3 implements GL4 {
	public void glBeginQueryIndexed(int target, int index, int id) {
		GL40.glBeginQueryIndexed(target, index, id);
	}
	public void glBindTransformFeedback(int target, int id) {
		GL40.glBindTransformFeedback(target, id);
	}
	public void glBlendEquationi(int buf, int mode) {
		GL40.glBlendEquationi(buf, mode);
	}
	public void glBlendEquationSeparatei(int buf, int modeRGB, int modeAlpha) {
		GL40.glBlendEquationSeparatei(buf, modeRGB, modeAlpha);
	}
	public void glBlendFunci(int buf, int sfactor, int dfactor) {
		GL40.glBlendFunci(buf, sfactor, dfactor);
	}
	public void glBlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
		GL40.glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
	}
	public void glDeleteTransformFeedbacks(int id) {
		GL40.glDeleteTransformFeedbacks(id);
	}
	public void glDeleteTransformFeedbacks(java.nio.IntBuffer ids) {
		GL40.glDeleteTransformFeedbacks(ids);
	}
	public void glDeleteTransformFeedbacks(int n, java.nio.ByteBuffer ids) {
		GL40.glDeleteTransformFeedbacks(n, ids);
	}
	public void glDrawArraysIndirect(int mode, java.nio.ByteBuffer indirect) {
		GL40.glDrawArraysIndirect(mode, indirect);
	}
	public void glDrawArraysIndirect(int mode, java.nio.IntBuffer indirect) {
		GL40.glDrawArraysIndirect(mode, indirect);
	}
	public void glDrawArraysIndirect(int mode, long indirectOffset) {
		GL40.glDrawArraysIndirect(mode, indirectOffset);
	}
	public void glDrawElementsIndirect(int mode, int type, java.nio.ByteBuffer indirect) {
		GL40.glDrawElementsIndirect(mode, type, indirect);
	}
	public void glDrawElementsIndirect(int mode, int type, java.nio.IntBuffer indirect) {
		GL40.glDrawElementsIndirect(mode, type, indirect);
	}
	public void glDrawElementsIndirect(int mode, int type, long indirectOffset) {
		GL40.glDrawElementsIndirect(mode, type, indirectOffset);
	}
	public void glDrawTransformFeedback(int mode, int id) {
		GL40.glDrawTransformFeedback(mode, id);
	}
	public void glDrawTransformFeedbackStream(int mode, int id, int stream) {
		GL40.glDrawTransformFeedbackStream(mode, id, stream);
	}
	public void glEndQueryIndexed(int target, int index) {
		GL40.glEndQueryIndexed(target, index);
	}
	public int glGenTransformFeedbacks() {
		return GL40.glGenTransformFeedbacks();
	}
	public void glGenTransformFeedbacks(java.nio.IntBuffer ids) {
		GL40.glGenTransformFeedbacks(ids);
	}
	public void glGenTransformFeedbacks(int n, java.nio.ByteBuffer ids) {
		GL40.glGenTransformFeedbacks(n, ids);
	}
	public java.lang.String glGetActiveSubroutineName(int program, int shadertype, int index) {
		return GL40.glGetActiveSubroutineName(program, shadertype, index);
	}
	public java.lang.String glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize) {
		return GL40.glGetActiveSubroutineName(program, shadertype, index, bufsize);
	}
	public void glGetActiveSubroutineName(int program, int shadertype, int index, java.nio.IntBuffer length, java.nio.ByteBuffer name) {
		GL40.glGetActiveSubroutineName(program, shadertype, index, length, name);
	}
	public void glGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, java.nio.ByteBuffer length, java.nio.ByteBuffer name) {
		GL40.glGetActiveSubroutineName(program, shadertype, index, bufsize, length, name);
	}
	public void glGetActiveSubroutineUniform(int program, int shadertype, int index, int pname, java.nio.IntBuffer values) {
		GL40.glGetActiveSubroutineUniform(program, shadertype, index, pname, values);
	}
	public int glGetActiveSubroutineUniformi(int program, int shadertype, int index, int pname) {
		return GL40.glGetActiveSubroutineUniformi(program, shadertype, index, pname);
	}
	public void glGetActiveSubroutineUniformi(int program, int shadertype, int index, int pname, java.nio.ByteBuffer values) {
		GL40.glGetActiveSubroutineUniformi(program, shadertype, index, pname, values);
	}
	public java.lang.String glGetActiveSubroutineUniformName(int program, int shadertype, int index) {
		return GL40.glGetActiveSubroutineUniformName(program, shadertype, index);
	}
	public java.lang.String glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize) {
		return GL40.glGetActiveSubroutineUniformName(program, shadertype, index, bufsize);
	}
	public void glGetActiveSubroutineUniformName(int program, int shadertype, int index, java.nio.IntBuffer length, java.nio.ByteBuffer name) {
		GL40.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
	}
	public void glGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, java.nio.ByteBuffer length, java.nio.ByteBuffer name) {
		GL40.glGetActiveSubroutineUniformName(program, shadertype, index, bufsize, length, name);
	}
	public void glGetProgramStage(int program, int shadertype, int pname, java.nio.IntBuffer values) {
		GL40.glGetProgramStage(program, shadertype, pname, values);
	}
	public int glGetProgramStagei(int program, int shadertype, int pname) {
		return GL40.glGetProgramStagei(program, shadertype, pname);
	}
	public void glGetProgramStagei(int program, int shadertype, int pname, java.nio.ByteBuffer values) {
		GL40.glGetProgramStagei(program, shadertype, pname, values);
	}
	public void glGetQueryIndexed(int target, int index, int pname, java.nio.IntBuffer params) {
		GL40.glGetQueryIndexed(target, index, pname, params);
	}
	public int glGetQueryIndexedi(int target, int index, int pname) {
		return GL40.glGetQueryIndexedi(target, index, pname);
	}
	public void glGetQueryIndexedi(int target, int index, int pname, java.nio.ByteBuffer params) {
		GL40.glGetQueryIndexedi(target, index, pname, params);
	}
	public int glGetSubroutineIndex(int program, int shadertype, java.nio.ByteBuffer name) {
		return GL40.glGetSubroutineIndex(program, shadertype, name);
	}
	public int glGetSubroutineIndex(int program, int shadertype, java.lang.CharSequence name) {
		return GL40.glGetSubroutineIndex(program, shadertype, name);
	}
	public int glGetSubroutineUniformLocation(int program, int shadertype, java.nio.ByteBuffer name) {
		return GL40.glGetSubroutineUniformLocation(program, shadertype, name);
	}
	public int glGetSubroutineUniformLocation(int program, int shadertype, java.lang.CharSequence name) {
		return GL40.glGetSubroutineUniformLocation(program, shadertype, name);
	}
	public void glGetUniform(int program, int location, java.nio.DoubleBuffer params) {
		GL40.glGetUniform(program, location, params);
	}
	public double glGetUniformd(int program, int location) {
		return GL40.glGetUniformd(program, location);
	}
	public void glGetUniformd(int program, int location, java.nio.ByteBuffer params) {
		GL40.glGetUniformd(program, location, params);
	}
	public void glGetUniformSubroutineu(int shadertype, int location, java.nio.IntBuffer params) {
		GL40.glGetUniformSubroutineu(shadertype, location, params);
	}
	public int glGetUniformSubroutineui(int shadertype, int location) {
		return GL40.glGetUniformSubroutineui(shadertype, location);
	}
	public void glGetUniformSubroutineui(int shadertype, int location, java.nio.ByteBuffer params) {
		GL40.glGetUniformSubroutineui(shadertype, location, params);
	}
	public boolean glIsTransformFeedback(int id) {
		return GL40.glIsTransformFeedback(id);
	}
	public void glMinSampleShading(float value) {
		GL40.glMinSampleShading(value);
	}
	public void glPatchParameter(int pname, java.nio.FloatBuffer values) {
		GL40.glPatchParameter(pname, values);
	}
	public void glPatchParameterf(int pname, java.nio.ByteBuffer values) {
		GL40.glPatchParameterf(pname, values);
	}
	public void glPatchParameteri(int pname, int value) {
		GL40.glPatchParameteri(pname, value);
	}
	public void glPauseTransformFeedback() {
		GL40.glPauseTransformFeedback();
	}
	public void glResumeTransformFeedback() {
		GL40.glResumeTransformFeedback();
	}
	public void glUniform1(int location, java.nio.DoubleBuffer value) {
		GL40.glUniform1(location, value);
	}
	public void glUniform1d(int location, double x) {
		GL40.glUniform1d(location, x);
	}
	public void glUniform1d(int location, int count, java.nio.ByteBuffer value) {
		GL40.glUniform1d(location, count, value);
	}
	public void glUniform2(int location, java.nio.DoubleBuffer value) {
		GL40.glUniform2(location, value);
	}
	public void glUniform2d(int location, double x, double y) {
		GL40.glUniform2d(location, x, y);
	}
	public void glUniform2d(int location, int count, java.nio.ByteBuffer value) {
		GL40.glUniform2d(location, count, value);
	}
	public void glUniform3(int location, java.nio.DoubleBuffer value) {
		GL40.glUniform3(location, value);
	}
	public void glUniform3d(int location, double x, double y, double z) {
		GL40.glUniform3d(location, x, y, z);
	}
	public void glUniform3d(int location, int count, java.nio.ByteBuffer value) {
		GL40.glUniform3d(location, count, value);
	}
	public void glUniform4(int location, java.nio.DoubleBuffer value) {
		GL40.glUniform4(location, value);
	}
	public void glUniform4d(int location, double x, double y, double z, double w) {
		GL40.glUniform4d(location, x, y, z, w);
	}
	public void glUniform4d(int location, int count, java.nio.ByteBuffer value) {
		GL40.glUniform4d(location, count, value);
	}
	public void glUniformMatrix2(int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL40.glUniformMatrix2(location, transpose, value);
	}
	public void glUniformMatrix2d(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL40.glUniformMatrix2d(location, count, transpose, value);
	}
	public void glUniformMatrix2x3(int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL40.glUniformMatrix2x3(location, transpose, value);
	}
	public void glUniformMatrix2x3d(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL40.glUniformMatrix2x3d(location, count, transpose, value);
	}
	public void glUniformMatrix2x4(int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL40.glUniformMatrix2x4(location, transpose, value);
	}
	public void glUniformMatrix2x4d(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL40.glUniformMatrix2x4d(location, count, transpose, value);
	}
	public void glUniformMatrix3(int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL40.glUniformMatrix3(location, transpose, value);
	}
	public void glUniformMatrix3d(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL40.glUniformMatrix3d(location, count, transpose, value);
	}
	public void glUniformMatrix3x2(int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL40.glUniformMatrix3x2(location, transpose, value);
	}
	public void glUniformMatrix3x2d(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL40.glUniformMatrix3x2d(location, count, transpose, value);
	}
	public void glUniformMatrix3x4(int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL40.glUniformMatrix3x4(location, transpose, value);
	}
	public void glUniformMatrix3x4d(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL40.glUniformMatrix3x4d(location, count, transpose, value);
	}
	public void glUniformMatrix4(int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL40.glUniformMatrix4(location, transpose, value);
	}
	public void glUniformMatrix4d(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL40.glUniformMatrix4d(location, count, transpose, value);
	}
	public void glUniformMatrix4x2(int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL40.glUniformMatrix4x2(location, transpose, value);
	}
	public void glUniformMatrix4x2d(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL40.glUniformMatrix4x2d(location, count, transpose, value);
	}
	public void glUniformMatrix4x3(int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL40.glUniformMatrix4x3(location, transpose, value);
	}
	public void glUniformMatrix4x3d(int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL40.glUniformMatrix4x3d(location, count, transpose, value);
	}
	public void glUniformSubroutinesu(int shadertype, java.nio.IntBuffer indices) {
		GL40.glUniformSubroutinesu(shadertype, indices);
	}
	public void glUniformSubroutinesui(int shadertype, int index) {
		GL40.glUniformSubroutinesui(shadertype, index);
	}
	public void glUniformSubroutinesui(int shadertype, int count, java.nio.ByteBuffer indices) {
		GL40.glUniformSubroutinesui(shadertype, count, indices);
	}
	public void glActiveShaderProgram(int pipeline, int program) {
		GL41.glActiveShaderProgram(pipeline, program);
	}
	public void glBindProgramPipeline(int pipeline) {
		GL41.glBindProgramPipeline(pipeline);
	}
	public void glClearDepthf(float depth) {
		GL41.glClearDepthf(depth);
	}
	public int glCreateShaderProgram(int type, java.lang.CharSequence string) {
		return GL41.glCreateShaderProgram(type, string);
	}
	public int glCreateShaderProgram(int type, java.lang.CharSequence[] strings) {
		return GL41.glCreateShaderProgram(type, strings);
	}
	public int glCreateShaderProgram(int type, int count, java.nio.ByteBuffer strings) {
		return GL41.glCreateShaderProgram(type, count, strings);
	}
	public int glCreateShaderProgram(int type, PointerBuffer strings) {
		return GL41.glCreateShaderProgram(type, LWJGLUtils.s_wrapPointerBuffer(strings));
	}
	public void glDeleteProgramPipelines(int pipeline) {
		GL41.glDeleteProgramPipelines(pipeline);
	}
	public void glDeleteProgramPipelines(java.nio.IntBuffer pipelines) {
		GL41.glDeleteProgramPipelines(pipelines);
	}
	public void glDeleteProgramPipelines(int n, java.nio.ByteBuffer pipelines) {
		GL41.glDeleteProgramPipelines(n, pipelines);
	}
	public void glDepthRangeArray(int first, java.nio.DoubleBuffer v) {
		GL41.glDepthRangeArray(first, v);
	}
	public void glDepthRangeArray(int first, int count, java.nio.ByteBuffer v) {
		GL41.glDepthRangeArray(first, count, v);
	}
	public void glDepthRangef(float zNear, float zFar) {
		GL41.glDepthRangef(zNear, zFar);
	}
	public void glDepthRangeIndexed(int index, double zNear, double zFar) {
		GL41.glDepthRangeIndexed(index, zNear, zFar);
	}
	public int glGenProgramPipelines() {
		return GL41.glGenProgramPipelines();
	}
	public void glGenProgramPipelines(java.nio.IntBuffer pipelines) {
		GL41.glGenProgramPipelines(pipelines);
	}
	public void glGenProgramPipelines(int n, java.nio.ByteBuffer pipelines) {
		GL41.glGenProgramPipelines(n, pipelines);
	}
	public double glGetDoublei(int target, int index) {
		return GL41.glGetDoublei(target, index);
	}
	public void glGetDoublei(int target, int index, java.nio.ByteBuffer data) {
		GL41.glGetDoublei(target, index, data);
	}
	public void glGetDoublei(int target, int index, java.nio.DoubleBuffer data) {
		GL41.glGetDoublei(target, index, data);
	}
	public float glGetFloati(int target, int index) {
		return GL41.glGetFloati(target, index);
	}
	public void glGetFloati(int target, int index, java.nio.ByteBuffer data) {
		GL41.glGetFloati(target, index, data);
	}
	public void glGetFloati(int target, int index, java.nio.FloatBuffer data) {
		GL41.glGetFloati(target, index, data);
	}
	public java.nio.ByteBuffer glGetProgramBinary(int program, java.nio.IntBuffer binaryFormat) {
		return GL41.glGetProgramBinary(program, binaryFormat);
	}
	public void glGetProgramBinary(int program, java.nio.IntBuffer length, java.nio.IntBuffer binaryFormat, java.nio.ByteBuffer binary) {
		GL41.glGetProgramBinary(program, length, binaryFormat, binary);
	}
	public void glGetProgramBinary(int program, int bufSize, java.nio.ByteBuffer length, java.nio.ByteBuffer binaryFormat, java.nio.ByteBuffer binary) {
		GL41.glGetProgramBinary(program, bufSize, length, binaryFormat, binary);
	}
	public java.nio.ByteBuffer glGetProgramBinary(int program, int bufSize, java.nio.IntBuffer binaryFormat) {
		return GL41.glGetProgramBinary(program, bufSize, binaryFormat);
	}
	public void glGetProgramPipeline(int pipeline, int pname, java.nio.IntBuffer params) {
		GL41.glGetProgramPipeline(pipeline, pname, params);
	}
	public int glGetProgramPipelinei(int pipeline, int pname) {
		return GL41.glGetProgramPipelinei(pipeline, pname);
	}
	public void glGetProgramPipelinei(int pipeline, int pname, java.nio.ByteBuffer params) {
		GL41.glGetProgramPipelinei(pipeline, pname, params);
	}
	public java.lang.String glGetProgramPipelineInfoLog(int pipeline) {
		return GL41.glGetProgramPipelineInfoLog(pipeline);
	}
	public java.lang.String glGetProgramPipelineInfoLog(int pipeline, int bufSize) {
		return GL41.glGetProgramPipelineInfoLog(pipeline, bufSize);
	}
	public void glGetProgramPipelineInfoLog(int pipeline, java.nio.IntBuffer length, java.nio.ByteBuffer infoLog) {
		GL41.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
	}
	public void glGetProgramPipelineInfoLog(int pipeline, int bufSize, java.nio.ByteBuffer length, java.nio.ByteBuffer infoLog) {
		GL41.glGetProgramPipelineInfoLog(pipeline, bufSize, length, infoLog);
	}
	public void glGetShaderPrecisionFormat(int shadertype, int precisiontype, java.nio.ByteBuffer range, java.nio.ByteBuffer precision) {
		GL41.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
	}
	public int glGetShaderPrecisionFormat(int shadertype, int precisiontype, java.nio.IntBuffer range) {
		return GL41.glGetShaderPrecisionFormat(shadertype, precisiontype, range);
	}
	public void glGetShaderPrecisionFormat(int shadertype, int precisiontype, java.nio.IntBuffer range, java.nio.IntBuffer precision) {
		GL41.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
	}
	public void glGetVertexAttribL(int index, int pname, java.nio.DoubleBuffer params) {
		GL41.glGetVertexAttribL(index, pname, params);
	}
	public void glGetVertexAttribLd(int index, int pname, java.nio.ByteBuffer params) {
		GL41.glGetVertexAttribLd(index, pname, params);
	}
	public boolean glIsProgramPipeline(int pipeline) {
		return GL41.glIsProgramPipeline(pipeline);
	}
	public void glProgramBinary(int program, int binaryFormat, java.nio.ByteBuffer binary) {
		GL41.glProgramBinary(program, binaryFormat, binary);
	}
	public void glProgramBinary(int program, int binaryFormat, java.nio.ByteBuffer binary, int length) {
		GL41.glProgramBinary(program, binaryFormat, binary, length);
	}
	public void glProgramParameteri(int program, int pname, int value) {
		GL41.glProgramParameteri(program, pname, value);
	}
	public void glProgramUniform1(int program, int location, java.nio.DoubleBuffer value) {
		GL41.glProgramUniform1(program, location, value);
	}
	public void glProgramUniform1(int program, int location, java.nio.FloatBuffer value) {
		GL41.glProgramUniform1(program, location, value);
	}
	public void glProgramUniform1(int program, int location, java.nio.IntBuffer value) {
		GL41.glProgramUniform1(program, location, value);
	}
	public void glProgramUniform1d(int program, int location, double x) {
		GL41.glProgramUniform1d(program, location, x);
	}
	public void glProgramUniform1d(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform1d(program, location, count, value);
	}
	public void glProgramUniform1f(int program, int location, float x) {
		GL41.glProgramUniform1f(program, location, x);
	}
	public void glProgramUniform1f(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform1f(program, location, count, value);
	}
	public void glProgramUniform1i(int program, int location, int x) {
		GL41.glProgramUniform1i(program, location, x);
	}
	public void glProgramUniform1i(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform1i(program, location, count, value);
	}
	public void glProgramUniform1u(int program, int location, java.nio.IntBuffer value) {
		GL41.glProgramUniform1u(program, location, value);
	}
	public void glProgramUniform1ui(int program, int location, int x) {
		GL41.glProgramUniform1ui(program, location, x);
	}
	public void glProgramUniform1ui(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform1ui(program, location, count, value);
	}
	public void glProgramUniform2(int program, int location, java.nio.DoubleBuffer value) {
		GL41.glProgramUniform2(program, location, value);
	}
	public void glProgramUniform2(int program, int location, java.nio.FloatBuffer value) {
		GL41.glProgramUniform2(program, location, value);
	}
	public void glProgramUniform2(int program, int location, java.nio.IntBuffer value) {
		GL41.glProgramUniform2(program, location, value);
	}
	public void glProgramUniform2d(int program, int location, double x, double y) {
		GL41.glProgramUniform2d(program, location, x, y);
	}
	public void glProgramUniform2d(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform2d(program, location, count, value);
	}
	public void glProgramUniform2f(int program, int location, float x, float y) {
		GL41.glProgramUniform2f(program, location, x, y);
	}
	public void glProgramUniform2f(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform2f(program, location, count, value);
	}
	public void glProgramUniform2i(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform2i(program, location, count, value);
	}
	public void glProgramUniform2i(int program, int location, int x, int y) {
		GL41.glProgramUniform2i(program, location, x, y);
	}
	public void glProgramUniform2u(int program, int location, java.nio.IntBuffer value) {
		GL41.glProgramUniform2u(program, location, value);
	}
	public void glProgramUniform2ui(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform2ui(program, location, count, value);
	}
	public void glProgramUniform2ui(int program, int location, int x, int y) {
		GL41.glProgramUniform2ui(program, location, x, y);
	}
	public void glProgramUniform3(int program, int location, java.nio.DoubleBuffer value) {
		GL41.glProgramUniform3(program, location, value);
	}
	public void glProgramUniform3(int program, int location, java.nio.FloatBuffer value) {
		GL41.glProgramUniform3(program, location, value);
	}
	public void glProgramUniform3(int program, int location, java.nio.IntBuffer value) {
		GL41.glProgramUniform3(program, location, value);
	}
	public void glProgramUniform3d(int program, int location, double x, double y, double z) {
		GL41.glProgramUniform3d(program, location, x, y, z);
	}
	public void glProgramUniform3d(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform3d(program, location, count, value);
	}
	public void glProgramUniform3f(int program, int location, float x, float y, float z) {
		GL41.glProgramUniform3f(program, location, x, y, z);
	}
	public void glProgramUniform3f(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform3f(program, location, count, value);
	}
	public void glProgramUniform3i(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform3i(program, location, count, value);
	}
	public void glProgramUniform3i(int program, int location, int x, int y, int z) {
		GL41.glProgramUniform3i(program, location, x, y, z);
	}
	public void glProgramUniform3u(int program, int location, java.nio.IntBuffer value) {
		GL41.glProgramUniform3u(program, location, value);
	}
	public void glProgramUniform3ui(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform3ui(program, location, count, value);
	}
	public void glProgramUniform3ui(int program, int location, int x, int y, int z) {
		GL41.glProgramUniform3ui(program, location, x, y, z);
	}
	public void glProgramUniform4(int program, int location, java.nio.DoubleBuffer value) {
		GL41.glProgramUniform4(program, location, value);
	}
	public void glProgramUniform4(int program, int location, java.nio.FloatBuffer value) {
		GL41.glProgramUniform4(program, location, value);
	}
	public void glProgramUniform4(int program, int location, java.nio.IntBuffer value) {
		GL41.glProgramUniform4(program, location, value);
	}
	public void glProgramUniform4d(int program, int location, double x, double y, double z, double w) {
		GL41.glProgramUniform4d(program, location, x, y, z, w);
	}
	public void glProgramUniform4d(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform4d(program, location, count, value);
	}
	public void glProgramUniform4f(int program, int location, float x, float y, float z, float w) {
		GL41.glProgramUniform4f(program, location, x, y, z, w);
	}
	public void glProgramUniform4f(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform4f(program, location, count, value);
	}
	public void glProgramUniform4i(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform4i(program, location, count, value);
	}
	public void glProgramUniform4i(int program, int location, int x, int y, int z, int w) {
		GL41.glProgramUniform4i(program, location, x, y, z, w);
	}
	public void glProgramUniform4u(int program, int location, java.nio.IntBuffer value) {
		GL41.glProgramUniform4u(program, location, value);
	}
	public void glProgramUniform4ui(int program, int location, int count, java.nio.ByteBuffer value) {
		GL41.glProgramUniform4ui(program, location, count, value);
	}
	public void glProgramUniform4ui(int program, int location, int x, int y, int z, int w) {
		GL41.glProgramUniform4ui(program, location, x, y, z, w);
	}
	public void glProgramUniformMatrix2(int program, int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL41.glProgramUniformMatrix2(program, location, transpose, value);
	}
	public void glProgramUniformMatrix2(int program, int location, boolean transpose, java.nio.FloatBuffer value) {
		GL41.glProgramUniformMatrix2(program, location, transpose, value);
	}
	public void glProgramUniformMatrix2d(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix2d(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix2f(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix2f(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix2x3(int program, int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL41.glProgramUniformMatrix2x3(program, location, transpose, value);
	}
	public void glProgramUniformMatrix2x3(int program, int location, boolean transpose, java.nio.FloatBuffer value) {
		GL41.glProgramUniformMatrix2x3(program, location, transpose, value);
	}
	public void glProgramUniformMatrix2x3d(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix2x3d(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix2x3f(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix2x3f(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix2x4(int program, int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL41.glProgramUniformMatrix2x4(program, location, transpose, value);
	}
	public void glProgramUniformMatrix2x4(int program, int location, boolean transpose, java.nio.FloatBuffer value) {
		GL41.glProgramUniformMatrix2x4(program, location, transpose, value);
	}
	public void glProgramUniformMatrix2x4d(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix2x4d(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix2x4f(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix2x4f(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix3(int program, int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL41.glProgramUniformMatrix3(program, location, transpose, value);
	}
	public void glProgramUniformMatrix3(int program, int location, boolean transpose, java.nio.FloatBuffer value) {
		GL41.glProgramUniformMatrix3(program, location, transpose, value);
	}
	public void glProgramUniformMatrix3d(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix3d(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix3f(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix3f(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix3x2(int program, int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL41.glProgramUniformMatrix3x2(program, location, transpose, value);
	}
	public void glProgramUniformMatrix3x2(int program, int location, boolean transpose, java.nio.FloatBuffer value) {
		GL41.glProgramUniformMatrix3x2(program, location, transpose, value);
	}
	public void glProgramUniformMatrix3x2d(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix3x2d(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix3x2f(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix3x2f(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix3x4(int program, int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL41.glProgramUniformMatrix3x4(program, location, transpose, value);
	}
	public void glProgramUniformMatrix3x4(int program, int location, boolean transpose, java.nio.FloatBuffer value) {
		GL41.glProgramUniformMatrix3x4(program, location, transpose, value);
	}
	public void glProgramUniformMatrix3x4d(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix3x4d(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix3x4f(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix3x4f(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix4(int program, int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL41.glProgramUniformMatrix4(program, location, transpose, value);
	}
	public void glProgramUniformMatrix4(int program, int location, boolean transpose, java.nio.FloatBuffer value) {
		GL41.glProgramUniformMatrix4(program, location, transpose, value);
	}
	public void glProgramUniformMatrix4d(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix4d(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix4f(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix4f(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix4x2(int program, int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL41.glProgramUniformMatrix4x2(program, location, transpose, value);
	}
	public void glProgramUniformMatrix4x2(int program, int location, boolean transpose, java.nio.FloatBuffer value) {
		GL41.glProgramUniformMatrix4x2(program, location, transpose, value);
	}
	public void glProgramUniformMatrix4x2d(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix4x2d(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix4x2f(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix4x2f(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix4x3(int program, int location, boolean transpose, java.nio.DoubleBuffer value) {
		GL41.glProgramUniformMatrix4x3(program, location, transpose, value);
	}
	public void glProgramUniformMatrix4x3(int program, int location, boolean transpose, java.nio.FloatBuffer value) {
		GL41.glProgramUniformMatrix4x3(program, location, transpose, value);
	}
	public void glProgramUniformMatrix4x3d(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix4x3d(program, location, count, transpose, value);
	}
	public void glProgramUniformMatrix4x3f(int program, int location, int count, boolean transpose, java.nio.ByteBuffer value) {
		GL41.glProgramUniformMatrix4x3f(program, location, count, transpose, value);
	}
	public void glReleaseShaderCompiler() {
		GL41.glReleaseShaderCompiler();
	}
	public void glScissorArray(int first, java.nio.IntBuffer v) {
		GL41.glScissorArray(first, v);
	}
	public void glScissorArray(int first, int count, java.nio.ByteBuffer v) {
		GL41.glScissorArray(first, count, v);
	}
	public void glScissorIndexed(int index, java.nio.ByteBuffer v) {
		GL41.glScissorIndexed(index, v);
	}
	public void glScissorIndexed(int index, java.nio.IntBuffer v) {
		GL41.glScissorIndexed(index, v);
	}
	public void glScissorIndexed(int index, int left, int bottom, int width, int height) {
		GL41.glScissorIndexed(index, left, bottom, width, height);
	}
	public void glShaderBinary(java.nio.IntBuffer shaders, int binaryformat, java.nio.ByteBuffer binary) {
		GL41.glShaderBinary(shaders, binaryformat, binary);
	}
	public void glShaderBinary(int count, java.nio.ByteBuffer shaders, int binaryformat, java.nio.ByteBuffer binary, int length) {
		GL41.glShaderBinary(count, shaders, binaryformat, binary, length);
	}
	public void glUseProgramStages(int pipeline, int stages, int program) {
		GL41.glUseProgramStages(pipeline, stages, program);
	}
	public void glValidateProgramPipeline(int pipeline) {
		GL41.glValidateProgramPipeline(pipeline);
	}
	public void glVertexAttribL1(int index, java.nio.DoubleBuffer v) {
		GL41.glVertexAttribL1(index, v);
	}
	public void glVertexAttribL1d(int index, java.nio.ByteBuffer v) {
		GL41.glVertexAttribL1d(index, v);
	}
	public void glVertexAttribL1d(int index, double x) {
		GL41.glVertexAttribL1d(index, x);
	}
	public void glVertexAttribL2(int index, java.nio.DoubleBuffer v) {
		GL41.glVertexAttribL2(index, v);
	}
	public void glVertexAttribL2d(int index, java.nio.ByteBuffer v) {
		GL41.glVertexAttribL2d(index, v);
	}
	public void glVertexAttribL2d(int index, double x, double y) {
		GL41.glVertexAttribL2d(index, x, y);
	}
	public void glVertexAttribL3(int index, java.nio.DoubleBuffer v) {
		GL41.glVertexAttribL3(index, v);
	}
	public void glVertexAttribL3d(int index, java.nio.ByteBuffer v) {
		GL41.glVertexAttribL3d(index, v);
	}
	public void glVertexAttribL3d(int index, double x, double y, double z) {
		GL41.glVertexAttribL3d(index, x, y, z);
	}
	public void glVertexAttribL4(int index, java.nio.DoubleBuffer v) {
		GL41.glVertexAttribL4(index, v);
	}
	public void glVertexAttribL4d(int index, java.nio.ByteBuffer v) {
		GL41.glVertexAttribL4d(index, v);
	}
	public void glVertexAttribL4d(int index, double x, double y, double z, double w) {
		GL41.glVertexAttribL4d(index, x, y, z, w);
	}
	public void glVertexAttribLPointer(int index, int size, int stride, java.nio.DoubleBuffer pointer) {
		GL41.glVertexAttribLPointer(index, size, stride, pointer);
	}
	public void glVertexAttribLPointer(int index, int size, int type, int stride, java.nio.ByteBuffer pointer) {
		GL41.glVertexAttribLPointer(index, size, type, stride, pointer);
	}
	public void glVertexAttribLPointer(int index, int size, int type, int stride, long pointerOffset) {
		GL41.glVertexAttribLPointer(index, size, type, stride, pointerOffset);
	}
	public void glViewportArray(int first, java.nio.FloatBuffer v) {
		GL41.glViewportArray(first, v);
	}
	public void glViewportArray(int first, int count, java.nio.ByteBuffer v) {
		GL41.glViewportArray(first, count, v);
	}
	public void glViewportIndexed(int index, java.nio.FloatBuffer v) {
		GL41.glViewportIndexed(index, v);
	}
	public void glViewportIndexedf(int index, java.nio.ByteBuffer v) {
		GL41.glViewportIndexedf(index, v);
	}
	public void glViewportIndexedf(int index, float x, float y, float w, float h) {
		GL41.glViewportIndexedf(index, x, y, w, h);
	}
	public void glBindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
		GL42.glBindImageTexture(unit, texture, level, layered, layer, access, format);
	}
	public void glDrawArraysInstancedBaseInstance(int mode, int first, int count, int primcount, int baseinstance) {
		GL42.glDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance);
	}
	public void glDrawElementsInstancedBaseInstance(int mode, java.nio.ByteBuffer indices, int primcount, int baseinstance) {
		GL42.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
	}
	public void glDrawElementsInstancedBaseInstance(int mode, java.nio.IntBuffer indices, int primcount, int baseinstance) {
		GL42.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
	}
	public void glDrawElementsInstancedBaseInstance(int mode, int type, java.nio.ByteBuffer indices, int primcount, int baseinstance) {
		GL42.glDrawElementsInstancedBaseInstance(mode, type, indices, primcount, baseinstance);
	}
	public void glDrawElementsInstancedBaseInstance(int mode, int count, int type, java.nio.ByteBuffer indices, int primcount, int baseinstance) {
		GL42.glDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
	}
	public void glDrawElementsInstancedBaseInstance(int mode, int count, int type, long indicesOffset, int primcount, int baseinstance) {
		GL42.glDrawElementsInstancedBaseInstance(mode, count, type, indicesOffset, primcount, baseinstance);
	}
	public void glDrawElementsInstancedBaseInstance(int mode, java.nio.ShortBuffer indices, int primcount, int baseinstance) {
		GL42.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
	}
	public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, java.nio.ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
		GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
	}
	public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, java.nio.IntBuffer indices, int primcount, int basevertex, int baseinstance) {
		GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
	}
	public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int type, java.nio.ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
		GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, type, indices, primcount, basevertex, baseinstance);
	}
	public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, java.nio.ByteBuffer indices, int primcount, int basevertex, int baseinstance) {
		GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
	}
	public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indicesOffset, int primcount, int basevertex, int baseinstance) {
		GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indicesOffset, primcount, basevertex, baseinstance);
	}
	public void glDrawElementsInstancedBaseVertexBaseInstance(int mode, java.nio.ShortBuffer indices, int primcount, int basevertex, int baseinstance) {
		GL42.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
	}
	public void glDrawTransformFeedbackInstanced(int mode, int id, int primcount) {
		GL42.glDrawTransformFeedbackInstanced(mode, id, primcount);
	}
	public void glDrawTransformFeedbackStreamInstanced(int mode, int id, int stream, int primcount) {
		GL42.glDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount);
	}
	public void glGetActiveAtomicCounterBuffer(int program, int bufferIndex, int pname, java.nio.IntBuffer params) {
		GL42.glGetActiveAtomicCounterBuffer(program, bufferIndex, pname, params);
	}
	public int glGetActiveAtomicCounterBufferi(int program, int bufferIndex, int pname) {
		return GL42.glGetActiveAtomicCounterBufferi(program, bufferIndex, pname);
	}
	public void glGetActiveAtomicCounterBufferi(int program, int bufferIndex, int pname, java.nio.ByteBuffer params) {
		GL42.glGetActiveAtomicCounterBufferi(program, bufferIndex, pname, params);
	}
	public void glGetInternalformat(int target, int internalformat, int pname, java.nio.IntBuffer params) {
		GL42.glGetInternalformat(target, internalformat, pname, params);
	}
	public int glGetInternalformati(int target, int internalformat, int pname) {
		return GL42.glGetInternalformati(target, internalformat, pname);
	}
	public void glGetInternalformati(int target, int internalformat, int pname, int bufSize, java.nio.ByteBuffer params) {
		GL42.glGetInternalformati(target, internalformat, pname, bufSize, params);
	}
	public void glMemoryBarrier(int barriers) {
		GL42.glMemoryBarrier(barriers);
	}
	public void glTexStorage1D(int target, int levels, int internalformat, int width) {
		GL42.glTexStorage1D(target, levels, internalformat, width);
	}
	public void glTexStorage2D(int target, int levels, int internalformat, int width, int height) {
		GL42.glTexStorage2D(target, levels, internalformat, width, height);
	}
	public void glTexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
		GL42.glTexStorage3D(target, levels, internalformat, width, height, depth);
	}
	public void glBindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
		GL43.glBindVertexBuffer(bindingindex, buffer, offset, stride);
	}
	public void glClearBufferData(int target, int internalformat, int format, int type, java.nio.ByteBuffer data) {
		GL43.glClearBufferData(target, internalformat, format, type, data);
	}
	public void glClearBufferData(int target, int internalformat, int format, int type, java.nio.FloatBuffer data) {
		GL43.glClearBufferData(target, internalformat, format, type, data);
	}
	public void glClearBufferData(int target, int internalformat, int format, int type, java.nio.IntBuffer data) {
		GL43.glClearBufferData(target, internalformat, format, type, data);
	}
	public void glClearBufferData(int target, int internalformat, int format, int type, java.nio.ShortBuffer data) {
		GL43.glClearBufferData(target, internalformat, format, type, data);
	}
	public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, java.nio.ByteBuffer data) {
		GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
	}
	public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, java.nio.FloatBuffer data) {
		GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
	}
	public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, java.nio.IntBuffer data) {
		GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
	}
	public void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, java.nio.ShortBuffer data) {
		GL43.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
	}
	public void glCopyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
		GL43.glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
	}
	public void glDebugMessageCallback(DebugCallback callback) {
		GL43.glDebugMessageCallback(LWJGLUtils.s_wrapDebugCallback(callback));
	}
	public void glDebugMessageCallback(long callback, long userParam) {
		GL43.glDebugMessageCallback(callback, userParam);
	}
	public void glDebugMessageControl(int source, int type, int severity, int id, boolean enabled) {
		GL43.glDebugMessageControl(source, type, severity, id, enabled);
	}
	public void glDebugMessageControl(int source, int type, int severity, java.nio.IntBuffer ids, boolean enabled) {
		GL43.glDebugMessageControl(source, type, severity, ids, enabled);
	}
	public void glDebugMessageControl(int source, int type, int severity, int count, java.nio.ByteBuffer ids, boolean enabled) {
		GL43.glDebugMessageControl(source, type, severity, count, ids, enabled);
	}
	public void glDebugMessageInsert(int source, int type, int id, int severity, java.nio.ByteBuffer message) {
		GL43.glDebugMessageInsert(source, type, id, severity, message);
	}
	public void glDebugMessageInsert(int source, int type, int id, int severity, java.lang.CharSequence message) {
		GL43.glDebugMessageInsert(source, type, id, severity, message);
	}
	public void glDebugMessageInsert(int source, int type, int id, int severity, int length, java.nio.ByteBuffer message) {
		GL43.glDebugMessageInsert(source, type, id, severity, length, message);
	}
	public void glDispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
		GL43.glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
	}
	public void glDispatchComputeIndirect(long indirect) {
		GL43.glDispatchComputeIndirect(indirect);
	}
	public void glFramebufferParameteri(int target, int pname, int param) {
		GL43.glFramebufferParameteri(target, pname, param);
	}
	public int glGetDebugMessageLog(int count, java.nio.IntBuffer sources, java.nio.IntBuffer types, java.nio.IntBuffer ids, java.nio.IntBuffer severities, java.nio.IntBuffer lengths, java.nio.ByteBuffer messageLog) {
		return GL43.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
	}
	public int glGetDebugMessageLog(int count, java.nio.IntBuffer sources, java.nio.IntBuffer types, java.nio.IntBuffer ids, java.nio.IntBuffer severities, java.nio.IntBuffer lengths, java.lang.CharSequence messageLog) {
		return GL43.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
	}
	public int glGetDebugMessageLog(int count, int bufsize, java.nio.ByteBuffer sources, java.nio.ByteBuffer types, java.nio.ByteBuffer ids, java.nio.ByteBuffer severities, java.nio.ByteBuffer lengths, java.nio.ByteBuffer messageLog) {
		return GL43.glGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog);
	}
	public void glGetFramebufferParameter(int target, int pname, java.nio.IntBuffer params) {
		GL43.glGetFramebufferParameter(target, pname, params);
	}
	public int glGetFramebufferParameteri(int target, int pname) {
		return GL43.glGetFramebufferParameteri(target, pname);
	}
	public void glGetFramebufferParameteri(int target, int pname, java.nio.ByteBuffer params) {
		GL43.glGetFramebufferParameteri(target, pname, params);
	}
	public void glGetInternalformat(int target, int internalformat, int pname, java.nio.LongBuffer params) {
		GL43.glGetInternalformat(target, internalformat, pname, params);
	}
	public long glGetInternalformati64(int target, int internalformat, int pname) {
		return GL43.glGetInternalformati64(target, internalformat, pname);
	}
	public void glGetInternalformati64(int target, int internalformat, int pname, int bufSize, java.nio.ByteBuffer params) {
		GL43.glGetInternalformati64(target, internalformat, pname, bufSize, params);
	}
	public java.lang.String glGetObjectLabel(int identifier, int name) {
		return GL43.glGetObjectLabel(identifier, name);
	}
	public java.lang.String glGetObjectLabel(int identifier, int name, int bufSize) {
		return GL43.glGetObjectLabel(identifier, name, bufSize);
	}
	public void glGetObjectLabel(int identifier, int name, java.nio.IntBuffer length, java.nio.ByteBuffer label) {
		GL43.glGetObjectLabel(identifier, name, length, label);
	}
	public void glGetObjectLabel(int identifier, int name, int bufSize, java.nio.ByteBuffer length, java.nio.ByteBuffer label) {
		GL43.glGetObjectLabel(identifier, name, bufSize, length, label);
	}
	public java.lang.String glGetObjectPtrLabel(long ptr) {
		return GL43.glGetObjectPtrLabel(ptr);
	}
	public java.lang.String glGetObjectPtrLabel(long ptr, int bufSize) {
		return GL43.glGetObjectPtrLabel(ptr, bufSize);
	}
	public void glGetObjectPtrLabel(long ptr, java.nio.IntBuffer length, java.nio.ByteBuffer label) {
		GL43.glGetObjectPtrLabel(ptr, length, label);
	}
	public void glGetObjectPtrLabel(long ptr, int bufSize, java.nio.ByteBuffer length, java.nio.ByteBuffer label) {
		GL43.glGetObjectPtrLabel(ptr, bufSize, length, label);
	}
	public void glGetProgramInterface(int program, int programInterface, int pname, java.nio.IntBuffer params) {
		GL43.glGetProgramInterface(program, programInterface, pname, params);
	}
	public int glGetProgramInterfacei(int program, int programInterface, int pname) {
		return GL43.glGetProgramInterfacei(program, programInterface, pname);
	}
	public void glGetProgramInterfacei(int program, int programInterface, int pname, java.nio.ByteBuffer params) {
		GL43.glGetProgramInterfacei(program, programInterface, pname, params);
	}
	public void glGetProgramResource(int program, int programInterface, int index, java.nio.IntBuffer props, java.nio.IntBuffer length, java.nio.IntBuffer params) {
		GL43.glGetProgramResource(program, programInterface, index, props, length, params);
	}
	public java.nio.IntBuffer glGetProgramResourcei(int program, int programInterface, int index, java.nio.IntBuffer props, int bufSize) {
		return GL43.glGetProgramResourcei(program, programInterface, index, props, bufSize);
	}
	public void glGetProgramResourcei(int program, int programInterface, int index, int propCount, java.nio.ByteBuffer props, int bufSize, java.nio.ByteBuffer length, java.nio.ByteBuffer params) {
		GL43.glGetProgramResourcei(program, programInterface, index, propCount, props, bufSize, length, params);
	}
	public int glGetProgramResourceIndex(int program, int programInterface, java.nio.ByteBuffer name) {
		return GL43.glGetProgramResourceIndex(program, programInterface, name);
	}
	public int glGetProgramResourceIndex(int program, int programInterface, java.lang.CharSequence name) {
		return GL43.glGetProgramResourceIndex(program, programInterface, name);
	}
	public int glGetProgramResourceLocation(int program, int programInterface, java.nio.ByteBuffer name) {
		return GL43.glGetProgramResourceLocation(program, programInterface, name);
	}
	public int glGetProgramResourceLocation(int program, int programInterface, java.lang.CharSequence name) {
		return GL43.glGetProgramResourceLocation(program, programInterface, name);
	}
	public int glGetProgramResourceLocationIndex(int program, int programInterface, java.nio.ByteBuffer name) {
		return GL43.glGetProgramResourceLocationIndex(program, programInterface, name);
	}
	public int glGetProgramResourceLocationIndex(int program, int programInterface, java.lang.CharSequence name) {
		return GL43.glGetProgramResourceLocationIndex(program, programInterface, name);
	}
	public java.lang.String glGetProgramResourceName(int program, int programInterface, int index) {
		return GL43.glGetProgramResourceName(program, programInterface, index);
	}
	public java.lang.String glGetProgramResourceName(int program, int programInterface, int index, int bufSize) {
		return GL43.glGetProgramResourceName(program, programInterface, index, bufSize);
	}
	public void glGetProgramResourceName(int program, int programInterface, int index, java.nio.IntBuffer length, java.nio.ByteBuffer name) {
		GL43.glGetProgramResourceName(program, programInterface, index, length, name);
	}
	public void glGetProgramResourceName(int program, int programInterface, int index, int bufSize, java.nio.ByteBuffer length, java.nio.ByteBuffer name) {
		GL43.glGetProgramResourceName(program, programInterface, index, bufSize, length, name);
	}
	public void glInvalidateBufferData(int buffer) {
		GL43.glInvalidateBufferData(buffer);
	}
	public void glInvalidateBufferSubData(int buffer, long offset, long length) {
		GL43.glInvalidateBufferSubData(buffer, offset, length);
	}
	public void glInvalidateFramebuffer(int target, int attachment) {
		GL43.glInvalidateFramebuffer(target, attachment);
	}
	public void glInvalidateFramebuffer(int target, java.nio.IntBuffer attachments) {
		GL43.glInvalidateFramebuffer(target, attachments);
	}
	public void glInvalidateFramebuffer(int target, int numAttachments, java.nio.ByteBuffer attachments) {
		GL43.glInvalidateFramebuffer(target, numAttachments, attachments);
	}
	public void glInvalidateSubFramebuffer(int target, java.nio.IntBuffer attachments, int x, int y, int width, int height) {
		GL43.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
	}
	public void glInvalidateSubFramebuffer(int target, int numAttachments, java.nio.ByteBuffer attachments, int x, int y, int width, int height) {
		GL43.glInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height);
	}
	public void glInvalidateSubFramebuffer(int target, int attachment, int x, int y, int width, int height) {
		GL43.glInvalidateSubFramebuffer(target, attachment, x, y, width, height);
	}
	public void glInvalidateTexImage(int texture, int level) {
		GL43.glInvalidateTexImage(texture, level);
	}
	public void glInvalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth) {
		GL43.glInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth);
	}
	public void glMultiDrawArraysIndirect(int mode, java.nio.ByteBuffer indirect, int primcount, int stride) {
		GL43.glMultiDrawArraysIndirect(mode, indirect, primcount, stride);
	}
	public void glMultiDrawArraysIndirect(int mode, java.nio.IntBuffer indirect, int primcount, int stride) {
		GL43.glMultiDrawArraysIndirect(mode, indirect, primcount, stride);
	}
	public void glMultiDrawArraysIndirect(int mode, long indirectOffset, int primcount, int stride) {
		GL43.glMultiDrawArraysIndirect(mode, indirectOffset, primcount, stride);
	}
	public void glMultiDrawElementsIndirect(int mode, int type, java.nio.ByteBuffer indirect, int primcount, int stride) {
		GL43.glMultiDrawElementsIndirect(mode, type, indirect, primcount, stride);
	}
	public void glMultiDrawElementsIndirect(int mode, int type, java.nio.IntBuffer indirect, int primcount, int stride) {
		GL43.glMultiDrawElementsIndirect(mode, type, indirect, primcount, stride);
	}
	public void glMultiDrawElementsIndirect(int mode, int type, long indirectOffset, int primcount, int stride) {
		GL43.glMultiDrawElementsIndirect(mode, type, indirectOffset, primcount, stride);
	}
	public void glObjectLabel(int identifier, int name, java.nio.ByteBuffer label) {
		GL43.glObjectLabel(identifier, name, label);
	}
	public void glObjectLabel(int identifier, int name, java.lang.CharSequence label) {
		GL43.glObjectLabel(identifier, name, label);
	}
	public void glObjectLabel(int identifier, int name, int length, java.nio.ByteBuffer label) {
		GL43.glObjectLabel(identifier, name, length, label);
	}
	public void glObjectPtrLabel(long ptr, java.nio.ByteBuffer label) {
		GL43.glObjectPtrLabel(ptr, label);
	}
	public void glObjectPtrLabel(long ptr, java.lang.CharSequence label) {
		GL43.glObjectPtrLabel(ptr, label);
	}
	public void glObjectPtrLabel(long ptr, int length, java.nio.ByteBuffer label) {
		GL43.glObjectPtrLabel(ptr, length, label);
	}
	public void glPopDebugGroup() {
		GL43.glPopDebugGroup();
	}
	public void glPushDebugGroup(int source, int id, java.nio.ByteBuffer message) {
		GL43.glPushDebugGroup(source, id, message);
	}
	public void glPushDebugGroup(int source, int id, java.lang.CharSequence message) {
		GL43.glPushDebugGroup(source, id, message);
	}
	public void glPushDebugGroup(int source, int id, int length, java.nio.ByteBuffer message) {
		GL43.glPushDebugGroup(source, id, length, message);
	}
	public void glShaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding) {
		GL43.glShaderStorageBlockBinding(program, storageBlockIndex, storageBlockBinding);
	}
	public void glTexBufferRange(int target, int internalformat, int buffer, long offset, long size) {
		GL43.glTexBufferRange(target, internalformat, buffer, offset, size);
	}
	public void glTexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
		GL43.glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
	}
	public void glTexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
		GL43.glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
	}
	public void glTextureView(int texture, int target, int origtexture, int internalformat, int minlevel, int numlevels, int minlayer, int numlayers) {
		GL43.glTextureView(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
	}
	public void glVertexAttribBinding(int attribindex, int bindingindex) {
		GL43.glVertexAttribBinding(attribindex, bindingindex);
	}
	public void glVertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
		GL43.glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
	}
	public void glVertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
		GL43.glVertexAttribIFormat(attribindex, size, type, relativeoffset);
	}
	public void glVertexAttribLFormat(int attribindex, int size, int type, int relativeoffset) {
		GL43.glVertexAttribLFormat(attribindex, size, type, relativeoffset);
	}
	public void glVertexBindingDivisor(int bindingindex, int divisor) {
		GL43.glVertexBindingDivisor(bindingindex, divisor);
	}
	public void glBindBuffersBase(int target, int first, java.nio.IntBuffer buffers) {
		GL44.glBindBuffersBase(target, first, buffers);
	}
	public void glBindBuffersBase(int target, int first, int count, java.nio.ByteBuffer buffers) {
		GL44.glBindBuffersBase(target, first, count, buffers);
	}
	public void glBindBuffersRange(int target, int first, java.nio.IntBuffer buffers, PointerBuffer offsets, PointerBuffer sizes) {
		GL44.glBindBuffersRange(target, first, buffers, LWJGLUtils.s_wrapPointerBuffer(offsets), LWJGLUtils.s_wrapPointerBuffer(sizes));
	}
	public void glBindBuffersRange(int target, int first, int count, java.nio.ByteBuffer buffers, java.nio.ByteBuffer offsets, java.nio.ByteBuffer sizes) {
		GL44.glBindBuffersRange(target, first, count, buffers, offsets, sizes);
	}
	public void glBindImageTextures(int first, java.nio.IntBuffer textures) {
		GL44.glBindImageTextures(first, textures);
	}
	public void glBindImageTextures(int first, int count, java.nio.ByteBuffer textures) {
		GL44.glBindImageTextures(first, count, textures);
	}
	public void glBindSamplers(int first, java.nio.IntBuffer samplers) {
		GL44.glBindSamplers(first, samplers);
	}
	public void glBindSamplers(int first, int count, java.nio.ByteBuffer samplers) {
		GL44.glBindSamplers(first, count, samplers);
	}
	public void glBindTextures(int first, java.nio.IntBuffer textures) {
		GL44.glBindTextures(first, textures);
	}
	public void glBindTextures(int first, int count, java.nio.ByteBuffer textures) {
		GL44.glBindTextures(first, count, textures);
	}
	public void glBindVertexBuffers(int first, java.nio.IntBuffer buffers, PointerBuffer offsets, java.nio.IntBuffer strides) {
		GL44.glBindVertexBuffers(first, buffers, LWJGLUtils.s_wrapPointerBuffer(offsets), strides);
	}
	public void glBindVertexBuffers(int first, int count, java.nio.ByteBuffer buffers, java.nio.ByteBuffer offsets, java.nio.ByteBuffer strides) {
		GL44.glBindVertexBuffers(first, count, buffers, offsets, strides);
	}
	public void glBufferStorage(int target, java.nio.ByteBuffer data, int flags) {
		GL44.glBufferStorage(target, data, flags);
	}
	public void glBufferStorage(int target, java.nio.DoubleBuffer data, int flags) {
		GL44.glBufferStorage(target, data, flags);
	}
	public void glBufferStorage(int target, java.nio.FloatBuffer data, int flags) {
		GL44.glBufferStorage(target, data, flags);
	}
	public void glBufferStorage(int target, java.nio.IntBuffer data, int flags) {
		GL44.glBufferStorage(target, data, flags);
	}
	public void glBufferStorage(int target, long size, java.nio.ByteBuffer data, int flags) {
		GL44.glBufferStorage(target, size, data, flags);
	}
	public void glBufferStorage(int target, long size, int flags) {
		GL44.glBufferStorage(target, size, flags);
	}
	public void glBufferStorage(int target, java.nio.ShortBuffer data, int flags) {
		GL44.glBufferStorage(target, data, flags);
	}
	public void glClearTexImage(int texture, int level, int format, int type, java.nio.ByteBuffer data) {
		GL44.glClearTexImage(texture, level, format, type, data);
	}
	public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.ByteBuffer data) {
		GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
	}
	public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.DoubleBuffer data) {
		GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
	}
	public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.FloatBuffer data) {
		GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
	}
	public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.IntBuffer data) {
		GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
	}
	public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.ShortBuffer data) {
		GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
	}
	public void glBindTextureUnit(int unit, int texture) {
		GL45.glBindTextureUnit(unit, texture);
	}
	public void glBlitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		GL45.glBlitNamedFramebuffer(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
	}
	public int glCheckNamedFramebufferStatus(int framebuffer, int target) {
		return GL45.glCheckNamedFramebufferStatus(framebuffer, target);
	}
	public void glClearNamedBufferData(int buffer, int internalformat, int format, int type, java.nio.ByteBuffer data) {
		GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
	}
	public void glClearNamedBufferData(int buffer, int internalformat, int format, int type, java.nio.FloatBuffer data) {
		GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
	}
	public void glClearNamedBufferData(int buffer, int internalformat, int format, int type, java.nio.IntBuffer data) {
		GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
	}
	public void glClearNamedBufferData(int buffer, int internalformat, int format, int type, java.nio.ShortBuffer data) {
		GL45.glClearNamedBufferData(buffer, internalformat, format, type, data);
	}
	public void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, java.nio.ByteBuffer data) {
		GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
	}
	public void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, java.nio.FloatBuffer data) {
		GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
	}
	public void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, java.nio.IntBuffer data) {
		GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
	}
	public void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, java.nio.ShortBuffer data) {
		GL45.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
	}
	public void glClearNamedFramebuffer(int framebuffer, int buffer, int drawbuffer, java.nio.FloatBuffer value) {
		GL45.glClearNamedFramebuffer(framebuffer, buffer, drawbuffer, value);
	}
	public void glClearNamedFramebuffer(int framebuffer, int buffer, int drawbuffer, java.nio.IntBuffer value) {
		GL45.glClearNamedFramebuffer(framebuffer, buffer, drawbuffer, value);
	}
	public void glClearNamedFramebufferf(int framebuffer, int buffer, int drawbuffer, java.nio.ByteBuffer value) {
		GL45.glClearNamedFramebufferf(framebuffer, buffer, drawbuffer, value);
	}
	public void glClearNamedFramebufferfi(int framebuffer, int buffer, float depth, int stencil) {
		GL45.glClearNamedFramebufferfi(framebuffer, buffer, depth, stencil);
	}
	public void glClearNamedFramebufferi(int framebuffer, int buffer, int drawbuffer, java.nio.ByteBuffer value) {
		GL45.glClearNamedFramebufferi(framebuffer, buffer, drawbuffer, value);
	}
	public void glClearNamedFramebufferu(int framebuffer, int buffer, int drawbuffer, java.nio.IntBuffer value) {
		GL45.glClearNamedFramebufferu(framebuffer, buffer, drawbuffer, value);
	}
	public void glClearNamedFramebufferui(int framebuffer, int buffer, int drawbuffer, java.nio.ByteBuffer value) {
		GL45.glClearNamedFramebufferui(framebuffer, buffer, drawbuffer, value);
	}
	public void glClipControl(int origin, int depth) {
		GL45.glClipControl(origin, depth);
	}
	public void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, java.nio.ByteBuffer data) {
		GL45.glCompressedTextureSubImage1D(texture, level, xoffset, width, format, data);
	}
	public void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, java.nio.ByteBuffer data) {
		GL45.glCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
	}
	public void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long dataOffset) {
		GL45.glCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, dataOffset);
	}
	public void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, java.nio.ByteBuffer data) {
		GL45.glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, data);
	}
	public void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, java.nio.ByteBuffer data) {
		GL45.glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
	}
	public void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long dataOffset) {
		GL45.glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, dataOffset);
	}
	public void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, java.nio.ByteBuffer data) {
		GL45.glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
	}
	public void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, java.nio.ByteBuffer data) {
		GL45.glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}
	public void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long dataOffset) {
		GL45.glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, dataOffset);
	}
	public void glCopyNamedBufferSubData(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
		GL45.glCopyNamedBufferSubData(readBuffer, writeBuffer, readOffset, writeOffset, size);
	}
	public void glCopyTextureSubImage1D(int texture, int level, int xoffset, int x, int y, int width) {
		GL45.glCopyTextureSubImage1D(texture, level, xoffset, x, y, width);
	}
	public void glCopyTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
		GL45.glCopyTextureSubImage2D(texture, level, xoffset, yoffset, x, y, width, height);
	}
	public void glCopyTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
		GL45.glCopyTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, x, y, width, height);
	}
	public int glCreateBuffers() {
		return GL45.glCreateBuffers();
	}
	public void glCreateBuffers(java.nio.IntBuffer buffers) {
		GL45.glCreateBuffers(buffers);
	}
	public void glCreateBuffers(int n, java.nio.ByteBuffer buffers) {
		GL45.glCreateBuffers(n, buffers);
	}
	public int glCreateFramebuffers() {
		return GL45.glCreateFramebuffers();
	}
	public void glCreateFramebuffers(java.nio.IntBuffer framebuffers) {
		GL45.glCreateFramebuffers(framebuffers);
	}
	public void glCreateFramebuffers(int n, java.nio.ByteBuffer framebuffers) {
		GL45.glCreateFramebuffers(n, framebuffers);
	}
	public int glCreateProgramPipelines() {
		return GL45.glCreateProgramPipelines();
	}
	public void glCreateProgramPipelines(java.nio.IntBuffer pipelines) {
		GL45.glCreateProgramPipelines(pipelines);
	}
	public void glCreateProgramPipelines(int n, java.nio.ByteBuffer pipelines) {
		GL45.glCreateProgramPipelines(n, pipelines);
	}
	public int glCreateQueries(int target) {
		return GL45.glCreateQueries(target);
	}
	public void glCreateQueries(int target, java.nio.IntBuffer ids) {
		GL45.glCreateQueries(target, ids);
	}
	public void glCreateQueries(int target, int n, java.nio.ByteBuffer ids) {
		GL45.glCreateQueries(target, n, ids);
	}
	public int glCreateRenderbuffers() {
		return GL45.glCreateRenderbuffers();
	}
	public void glCreateRenderbuffers(java.nio.IntBuffer renderbuffers) {
		GL45.glCreateRenderbuffers(renderbuffers);
	}
	public void glCreateRenderbuffers(int n, java.nio.ByteBuffer renderbuffers) {
		GL45.glCreateRenderbuffers(n, renderbuffers);
	}
	public int glCreateSamplers() {
		return GL45.glCreateSamplers();
	}
	public void glCreateSamplers(java.nio.IntBuffer samplers) {
		GL45.glCreateSamplers(samplers);
	}
	public void glCreateSamplers(int n, java.nio.ByteBuffer samplers) {
		GL45.glCreateSamplers(n, samplers);
	}
	public int glCreateTextures(int target) {
		return GL45.glCreateTextures(target);
	}
	public void glCreateTextures(int target, java.nio.IntBuffer textures) {
		GL45.glCreateTextures(target, textures);
	}
	public void glCreateTextures(int target, int n, java.nio.ByteBuffer textures) {
		GL45.glCreateTextures(target, n, textures);
	}
	public int glCreateTransformFeedbacks() {
		return GL45.glCreateTransformFeedbacks();
	}
	public void glCreateTransformFeedbacks(java.nio.IntBuffer ids) {
		GL45.glCreateTransformFeedbacks(ids);
	}
	public void glCreateTransformFeedbacks(int n, java.nio.ByteBuffer ids) {
		GL45.glCreateTransformFeedbacks(n, ids);
	}
	public int glCreateVertexArrays() {
		return GL45.glCreateVertexArrays();
	}
	public void glCreateVertexArrays(java.nio.IntBuffer arrays) {
		GL45.glCreateVertexArrays(arrays);
	}
	public void glCreateVertexArrays(int n, java.nio.ByteBuffer arrays) {
		GL45.glCreateVertexArrays(n, arrays);
	}
	public void glDisableVertexArrayAttrib(int vaobj, int index) {
		GL45.glDisableVertexArrayAttrib(vaobj, index);
	}
	public void glEnableVertexArrayAttrib(int vaobj, int index) {
		GL45.glEnableVertexArrayAttrib(vaobj, index);
	}
	public void glFlushMappedNamedBufferRange(int buffer, long offset, long length) {
		GL45.glFlushMappedNamedBufferRange(buffer, offset, length);
	}
	public void glGenerateTextureMipmap(int texture) {
		GL45.glGenerateTextureMipmap(texture);
	}
	public void glGetCompressedTextureImage(int texture, int level, java.nio.ByteBuffer pixels) {
		GL45.glGetCompressedTextureImage(texture, level, pixels);
	}
	public void glGetCompressedTextureImage(int texture, int level, int bufSize, java.nio.ByteBuffer pixels) {
		GL45.glGetCompressedTextureImage(texture, level, bufSize, pixels);
	}
	public void glGetCompressedTextureImage(int texture, int level, int bufSize, long pixelsOffset) {
		GL45.glGetCompressedTextureImage(texture, level, bufSize, pixelsOffset);
	}
	public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, java.nio.DoubleBuffer pixels) {
		GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
	}
	public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, java.nio.FloatBuffer pixels) {
		GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
	}
	public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, java.nio.IntBuffer pixels) {
		GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
	}
	public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, java.nio.ByteBuffer pixels) {
		GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
	}
	public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixelsOffset) {
		GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixelsOffset);
	}
	public void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, java.nio.ShortBuffer pixels) {
		GL45.glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels);
	}
	public int glGetGraphicsResetStatus() {
		return GL45.glGetGraphicsResetStatus();
	}
	public void glGetNamedBufferParameter(int buffer, int pname, java.nio.IntBuffer params) {
		GL45.glGetNamedBufferParameter(buffer, pname, params);
	}
	public void glGetNamedBufferParameter(int buffer, int pname, java.nio.LongBuffer params) {
		GL45.glGetNamedBufferParameter(buffer, pname, params);
	}
	public int glGetNamedBufferParameteri(int buffer, int pname) {
		return GL45.glGetNamedBufferParameteri(buffer, pname);
	}
	public void glGetNamedBufferParameteri(int buffer, int pname, java.nio.ByteBuffer params) {
		GL45.glGetNamedBufferParameteri(buffer, pname, params);
	}
	public long glGetNamedBufferParameteri64(int buffer, int pname) {
		return GL45.glGetNamedBufferParameteri64(buffer, pname);
	}
	public void glGetNamedBufferParameteri64(int buffer, int pname, java.nio.ByteBuffer params) {
		GL45.glGetNamedBufferParameteri64(buffer, pname, params);
	}
	public long glGetNamedBufferPointer(int buffer, int pname) {
		return GL45.glGetNamedBufferPointer(buffer, pname);
	}
	public void glGetNamedBufferPointer(int buffer, int pname, java.nio.ByteBuffer params) {
		GL45.glGetNamedBufferPointer(buffer, pname, params);
	}
	public void glGetNamedBufferPointer(int buffer, int pname, PointerBuffer params) {
		GL45.glGetNamedBufferPointer(buffer, pname, LWJGLUtils.s_wrapPointerBuffer(params));
	}
	public void glGetNamedBufferSubData(int buffer, long offset, java.nio.ByteBuffer data) {
		GL45.glGetNamedBufferSubData(buffer, offset, data);
	}
	public void glGetNamedBufferSubData(int buffer, long offset, java.nio.DoubleBuffer data) {
		GL45.glGetNamedBufferSubData(buffer, offset, data);
	}
	public void glGetNamedBufferSubData(int buffer, long offset, java.nio.FloatBuffer data) {
		GL45.glGetNamedBufferSubData(buffer, offset, data);
	}
	public void glGetNamedBufferSubData(int buffer, long offset, java.nio.IntBuffer data) {
		GL45.glGetNamedBufferSubData(buffer, offset, data);
	}
	public void glGetNamedBufferSubData(int buffer, long offset, long size, java.nio.ByteBuffer data) {
		GL45.glGetNamedBufferSubData(buffer, offset, size, data);
	}
	public void glGetNamedBufferSubData(int buffer, long offset, java.nio.ShortBuffer data) {
		GL45.glGetNamedBufferSubData(buffer, offset, data);
	}
	public void glGetNamedFramebufferAttachmentParameter(int framebuffer, int attachment, int pname, java.nio.IntBuffer params) {
		GL45.glGetNamedFramebufferAttachmentParameter(framebuffer, attachment, pname, params);
	}
	public int glGetNamedFramebufferAttachmentParameteri(int framebuffer, int attachment, int pname) {
		return GL45.glGetNamedFramebufferAttachmentParameteri(framebuffer, attachment, pname);
	}
	public void glGetNamedFramebufferAttachmentParameteri(int framebuffer, int attachment, int pname, java.nio.ByteBuffer params) {
		GL45.glGetNamedFramebufferAttachmentParameteri(framebuffer, attachment, pname, params);
	}
	public void glGetNamedFramebufferParameter(int framebuffer, int pname, java.nio.IntBuffer params) {
		GL45.glGetNamedFramebufferParameter(framebuffer, pname, params);
	}
	public int glGetNamedFramebufferParameteri(int framebuffer, int pname) {
		return GL45.glGetNamedFramebufferParameteri(framebuffer, pname);
	}
	public void glGetNamedFramebufferParameteri(int framebuffer, int pname, java.nio.ByteBuffer params) {
		GL45.glGetNamedFramebufferParameteri(framebuffer, pname, params);
	}
	public void glGetNamedRenderbufferParameter(int renderbuffer, int pname, java.nio.IntBuffer params) {
		GL45.glGetNamedRenderbufferParameter(renderbuffer, pname, params);
	}
	public int glGetNamedRenderbufferParameteri(int renderbuffer, int pname) {
		return GL45.glGetNamedRenderbufferParameteri(renderbuffer, pname);
	}
	public void glGetNamedRenderbufferParameteri(int renderbuffer, int pname, java.nio.ByteBuffer params) {
		GL45.glGetNamedRenderbufferParameteri(renderbuffer, pname, params);
	}
	public void glGetnUniform(int program, int location, java.nio.FloatBuffer params) {
		GL45.glGetnUniform(program, location, params);
	}
	public void glGetnUniformf(int program, int location, int bufSize, java.nio.ByteBuffer params) {
		GL45.glGetnUniformf(program, location, bufSize, params);
	}
	public void glGetnUniformi(int program, int location, java.nio.FloatBuffer params) {
		GL45.glGetnUniformi(program, location, params);
	}
	public void glGetnUniformi(int program, int location, int bufSize, java.nio.ByteBuffer params) {
		GL45.glGetnUniformi(program, location, bufSize, params);
	}
	public void glGetnUniformui(int program, int location, java.nio.FloatBuffer params) {
		GL45.glGetnUniformui(program, location, params);
	}
	public void glGetnUniformui(int program, int location, int bufSize, java.nio.ByteBuffer params) {
		GL45.glGetnUniformui(program, location, bufSize, params);
	}
	public void glGetTextureImage(int texture, int level, int format, int type, java.nio.DoubleBuffer pixels) {
		GL45.glGetTextureImage(texture, level, format, type, pixels);
	}
	public void glGetTextureImage(int texture, int level, int format, int type, java.nio.FloatBuffer pixels) {
		GL45.glGetTextureImage(texture, level, format, type, pixels);
	}
	public void glGetTextureImage(int texture, int level, int format, int type, java.nio.IntBuffer pixels) {
		GL45.glGetTextureImage(texture, level, format, type, pixels);
	}
	public void glGetTextureImage(int texture, int level, int format, int type, int bufSize, java.nio.ByteBuffer pixels) {
		GL45.glGetTextureImage(texture, level, format, type, bufSize, pixels);
	}
	public void glGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixelsOffset) {
		GL45.glGetTextureImage(texture, level, format, type, bufSize, pixelsOffset);
	}
	public void glGetTextureImage(int texture, int level, int format, int type, java.nio.ShortBuffer pixels) {
		GL45.glGetTextureImage(texture, level, format, type, pixels);
	}
	public void glGetTextureLevelParameter(int texture, int level, int pname, java.nio.FloatBuffer params) {
		GL45.glGetTextureLevelParameter(texture, level, pname, params);
	}
	public void glGetTextureLevelParameter(int texture, int level, int pname, java.nio.IntBuffer params) {
		GL45.glGetTextureLevelParameter(texture, level, pname, params);
	}
	public float glGetTextureLevelParameterf(int texture, int level, int pname) {
		return GL45.glGetTextureLevelParameterf(texture, level, pname);
	}
	public void glGetTextureLevelParameterf(int texture, int level, int pname, java.nio.ByteBuffer params) {
		GL45.glGetTextureLevelParameterf(texture, level, pname, params);
	}
	public int glGetTextureLevelParameteri(int texture, int level, int pname) {
		return GL45.glGetTextureLevelParameteri(texture, level, pname);
	}
	public void glGetTextureLevelParameteri(int texture, int level, int pname, java.nio.ByteBuffer params) {
		GL45.glGetTextureLevelParameteri(texture, level, pname, params);
	}
	public void glGetTextureParameter(int texture, int pname, java.nio.FloatBuffer params) {
		GL45.glGetTextureParameter(texture, pname, params);
	}
	public void glGetTextureParameter(int texture, int pname, java.nio.IntBuffer params) {
		GL45.glGetTextureParameter(texture, pname, params);
	}
	public float glGetTextureParameterf(int texture, int pname) {
		return GL45.glGetTextureParameterf(texture, pname);
	}
	public void glGetTextureParameterf(int texture, int pname, java.nio.ByteBuffer params) {
		GL45.glGetTextureParameterf(texture, pname, params);
	}
	public int glGetTextureParameteri(int texture, int pname) {
		return GL45.glGetTextureParameteri(texture, pname);
	}
	public void glGetTextureParameteri(int texture, int pname, java.nio.ByteBuffer params) {
		GL45.glGetTextureParameteri(texture, pname, params);
	}
	public void glGetTextureParameterI(int texture, int pname, java.nio.IntBuffer params) {
		GL45.glGetTextureParameterI(texture, pname, params);
	}
	public int glGetTextureParameterIi(int texture, int pname) {
		return GL45.glGetTextureParameterIi(texture, pname);
	}
	public void glGetTextureParameterIi(int texture, int pname, java.nio.ByteBuffer params) {
		GL45.glGetTextureParameterIi(texture, pname, params);
	}
	public void glGetTextureParameterIu(int texture, int pname, java.nio.IntBuffer params) {
		GL45.glGetTextureParameterIu(texture, pname, params);
	}
	public int glGetTextureParameterIui(int texture, int pname) {
		return GL45.glGetTextureParameterIui(texture, pname);
	}
	public void glGetTextureParameterIui(int texture, int pname, java.nio.ByteBuffer params) {
		GL45.glGetTextureParameterIui(texture, pname, params);
	}
	public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.DoubleBuffer pixels) {
		GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}
	public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.FloatBuffer pixels) {
		GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}
	public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.IntBuffer pixels) {
		GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}
	public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, java.nio.ByteBuffer pixels) {
		GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
	}
	public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixelsOffset) {
		GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixelsOffset);
	}
	public void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.ShortBuffer pixels) {
		GL45.glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}
	public void glGetTransformFeedback(int xfb, int pname, java.nio.IntBuffer param) {
		GL45.glGetTransformFeedback(xfb, pname, param);
	}
	public void glGetTransformFeedback(int xfb, int pname, int index, java.nio.IntBuffer param) {
		GL45.glGetTransformFeedback(xfb, pname, index, param);
	}
	public void glGetTransformFeedback(int xfb, int pname, int index, java.nio.LongBuffer param) {
		GL45.glGetTransformFeedback(xfb, pname, index, param);
	}
	public int glGetTransformFeedbacki(int xfb, int pname) {
		return GL45.glGetTransformFeedbacki(xfb, pname);
	}
	public void glGetTransformFeedbacki(int xfb, int pname, java.nio.ByteBuffer param) {
		GL45.glGetTransformFeedbacki(xfb, pname, param);
	}
	public int glGetTransformFeedbacki(int xfb, int pname, int index) {
		return GL45.glGetTransformFeedbacki(xfb, pname, index);
	}
	public void glGetTransformFeedbacki(int xfb, int pname, int index, java.nio.ByteBuffer param) {
		GL45.glGetTransformFeedbacki(xfb, pname, index, param);
	}
	public long glGetTransformFeedbacki64(int xfb, int pname, int index) {
		return GL45.glGetTransformFeedbacki64(xfb, pname, index);
	}
	public void glGetTransformFeedbacki64(int xfb, int pname, int index, java.nio.ByteBuffer param) {
		GL45.glGetTransformFeedbacki64(xfb, pname, index, param);
	}
	public void glGetVertexArray(int vaobj, int pname, java.nio.IntBuffer param) {
		GL45.glGetVertexArray(vaobj, pname, param);
	}
	public int glGetVertexArrayi(int vaobj, int pname) {
		return GL45.glGetVertexArrayi(vaobj, pname);
	}
	public void glGetVertexArrayi(int vaobj, int pname, java.nio.ByteBuffer param) {
		GL45.glGetVertexArrayi(vaobj, pname, param);
	}
	public void glGetVertexArrayIndexed(int vaobj, int index, int pname, java.nio.IntBuffer param) {
		GL45.glGetVertexArrayIndexed(vaobj, index, pname, param);
	}
	public long glGetVertexArrayIndexed64i(int vaobj, int index, int pname) {
		return GL45.glGetVertexArrayIndexed64i(vaobj, index, pname);
	}
	public void glGetVertexArrayIndexed64i(int vaobj, int index, int pname, java.nio.ByteBuffer param) {
		GL45.glGetVertexArrayIndexed64i(vaobj, index, pname, param);
	}
	public void glGetVertexArrayIndexed64i(int vaobj, int index, int pname, java.nio.LongBuffer param) {
		GL45.glGetVertexArrayIndexed64i(vaobj, index, pname, param);
	}
	public int glGetVertexArrayIndexedi(int vaobj, int index, int pname) {
		return GL45.glGetVertexArrayIndexedi(vaobj, index, pname);
	}
	public void glGetVertexArrayIndexedi(int vaobj, int index, int pname, java.nio.ByteBuffer param) {
		GL45.glGetVertexArrayIndexedi(vaobj, index, pname, param);
	}
	public void glInvalidateNamedFramebufferData(int framebuffer, int attachment) {
		GL45.glInvalidateNamedFramebufferData(framebuffer, attachment);
	}
	public void glInvalidateNamedFramebufferData(int framebuffer, java.nio.IntBuffer attachments) {
		GL45.glInvalidateNamedFramebufferData(framebuffer, attachments);
	}
	public void glInvalidateNamedFramebufferData(int framebuffer, int numAttachments, java.nio.ByteBuffer attachments) {
		GL45.glInvalidateNamedFramebufferData(framebuffer, numAttachments, attachments);
	}
	public void glInvalidateNamedFramebufferSubData(int framebuffer, java.nio.IntBuffer attachments, int x, int y, int width, int height) {
		GL45.glInvalidateNamedFramebufferSubData(framebuffer, attachments, x, y, width, height);
	}
	public void glInvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, java.nio.ByteBuffer attachments, int x, int y, int width, int height) {
		GL45.glInvalidateNamedFramebufferSubData(framebuffer, numAttachments, attachments, x, y, width, height);
	}
	public void glInvalidateNamedFramebufferSubData(int framebuffer, int attachment, int x, int y, int width, int height) {
		GL45.glInvalidateNamedFramebufferSubData(framebuffer, attachment, x, y, width, height);
	}
	public java.nio.ByteBuffer glMapNamedBuffer(int buffer, int access) {
		return GL45.glMapNamedBuffer(buffer, access);
	}
	public java.nio.ByteBuffer glMapNamedBuffer(int buffer, int access, java.nio.ByteBuffer old_buffer) {
		return GL45.glMapNamedBuffer(buffer, access, old_buffer);
	}
	public java.nio.ByteBuffer glMapNamedBuffer(int buffer, int access, int length, java.nio.ByteBuffer old_buffer) {
		return GL45.glMapNamedBuffer(buffer, access, length, old_buffer);
	}
	public java.nio.ByteBuffer glMapNamedBufferRange(int buffer, long offset, long length, int access) {
		return GL45.glMapNamedBufferRange(buffer, offset, length, access);
	}
	public java.nio.ByteBuffer glMapNamedBufferRange(int buffer, long offset, long length, int access, java.nio.ByteBuffer old_buffer) {
		return GL45.glMapNamedBufferRange(buffer, offset, length, access, old_buffer);
	}
	public void glMemoryBarrierByRegion(int barriers) {
		GL45.glMemoryBarrierByRegion(barriers);
	}
	public void glNamedBufferData(int buffer, java.nio.ByteBuffer data, int usage) {
		GL45.glNamedBufferData(buffer, data, usage);
	}
	public void glNamedBufferData(int buffer, java.nio.DoubleBuffer data, int usage) {
		GL45.glNamedBufferData(buffer, data, usage);
	}
	public void glNamedBufferData(int buffer, java.nio.FloatBuffer data, int usage) {
		GL45.glNamedBufferData(buffer, data, usage);
	}
	public void glNamedBufferData(int buffer, java.nio.IntBuffer data, int usage) {
		GL45.glNamedBufferData(buffer, data, usage);
	}
	public void glNamedBufferData(int buffer, long size, java.nio.ByteBuffer data, int usage) {
		GL45.glNamedBufferData(buffer, size, data, usage);
	}
	public void glNamedBufferData(int buffer, long size, int usage) {
		GL45.glNamedBufferData(buffer, size, usage);
	}
	public void glNamedBufferData(int buffer, java.nio.ShortBuffer data, int usage) {
		GL45.glNamedBufferData(buffer, data, usage);
	}
	public void glNamedBufferStorage(int buffer, java.nio.ByteBuffer data, int flags) {
		GL45.glNamedBufferStorage(buffer, data, flags);
	}
	public void glNamedBufferStorage(int buffer, java.nio.DoubleBuffer data, int flags) {
		GL45.glNamedBufferStorage(buffer, data, flags);
	}
	public void glNamedBufferStorage(int buffer, java.nio.FloatBuffer data, int flags) {
		GL45.glNamedBufferStorage(buffer, data, flags);
	}
	public void glNamedBufferStorage(int buffer, java.nio.IntBuffer data, int flags) {
		GL45.glNamedBufferStorage(buffer, data, flags);
	}
	public void glNamedBufferStorage(int buffer, long size, java.nio.ByteBuffer data, int flags) {
		GL45.glNamedBufferStorage(buffer, size, data, flags);
	}
	public void glNamedBufferStorage(int buffer, long size, int flags) {
		GL45.glNamedBufferStorage(buffer, size, flags);
	}
	public void glNamedBufferStorage(int buffer, java.nio.ShortBuffer data, int flags) {
		GL45.glNamedBufferStorage(buffer, data, flags);
	}
	public void glNamedBufferSubData(int buffer, long offset, java.nio.ByteBuffer data) {
		GL45.glNamedBufferSubData(buffer, offset, data);
	}
	public void glNamedBufferSubData(int buffer, long offset, java.nio.DoubleBuffer data) {
		GL45.glNamedBufferSubData(buffer, offset, data);
	}
	public void glNamedBufferSubData(int buffer, long offset, java.nio.FloatBuffer data) {
		GL45.glNamedBufferSubData(buffer, offset, data);
	}
	public void glNamedBufferSubData(int buffer, long offset, java.nio.IntBuffer data) {
		GL45.glNamedBufferSubData(buffer, offset, data);
	}
	public void glNamedBufferSubData(int buffer, long offset, long size, java.nio.ByteBuffer data) {
		GL45.glNamedBufferSubData(buffer, offset, size, data);
	}
	public void glNamedBufferSubData(int buffer, long offset, java.nio.ShortBuffer data) {
		GL45.glNamedBufferSubData(buffer, offset, data);
	}
	public void glNamedFramebufferDrawBuffer(int framebuffer, int buf) {
		GL45.glNamedFramebufferDrawBuffer(framebuffer, buf);
	}
	public void glNamedFramebufferDrawBuffers(int framebuffer, int buf) {
		GL45.glNamedFramebufferDrawBuffers(framebuffer, buf);
	}
	public void glNamedFramebufferDrawBuffers(int framebuffer, java.nio.IntBuffer bufs) {
		GL45.glNamedFramebufferDrawBuffers(framebuffer, bufs);
	}
	public void glNamedFramebufferDrawBuffers(int framebuffer, int n, java.nio.ByteBuffer bufs) {
		GL45.glNamedFramebufferDrawBuffers(framebuffer, n, bufs);
	}
	public void glNamedFramebufferParameteri(int framebuffer, int pname, int param) {
		GL45.glNamedFramebufferParameteri(framebuffer, pname, param);
	}
	public void glNamedFramebufferReadBuffer(int framebuffer, int src) {
		GL45.glNamedFramebufferReadBuffer(framebuffer, src);
	}
	public void glNamedFramebufferRenderbuffer(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) {
		GL45.glNamedFramebufferRenderbuffer(framebuffer, attachment, renderbuffertarget, renderbuffer);
	}
	public void glNamedFramebufferTexture(int framebuffer, int attachment, int texture, int level) {
		GL45.glNamedFramebufferTexture(framebuffer, attachment, texture, level);
	}
	public void glNamedFramebufferTextureLayer(int framebuffer, int attachment, int texture, int level, int layer) {
		GL45.glNamedFramebufferTextureLayer(framebuffer, attachment, texture, level, layer);
	}
	public void glNamedRenderbufferStorage(int renderbuffer, int internalformat, int width, int height) {
		GL45.glNamedRenderbufferStorage(renderbuffer, internalformat, width, height);
	}
	public void glNamedRenderbufferStorageMultisample(int renderbuffer, int samples, int internalformat, int width, int height) {
		GL45.glNamedRenderbufferStorageMultisample(renderbuffer, samples, internalformat, width, height);
	}
	public void glReadnPixels(int x, int y, int width, int height, int format, int type, java.nio.FloatBuffer pixels) {
		GL45.glReadnPixels(x, y, width, height, format, type, pixels);
	}
	public void glReadnPixels(int x, int y, int width, int height, int format, int type, java.nio.IntBuffer pixels) {
		GL45.glReadnPixels(x, y, width, height, format, type, pixels);
	}
	public void glReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, java.nio.ByteBuffer pixels) {
		GL45.glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
	}
	public void glReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixelsOffset) {
		GL45.glReadnPixels(x, y, width, height, format, type, bufSize, pixelsOffset);
	}
	public void glReadnPixels(int x, int y, int width, int height, int format, int type, java.nio.ShortBuffer pixels) {
		GL45.glReadnPixels(x, y, width, height, format, type, pixels);
	}
	public void glTextureBarrier() {
		GL45.glTextureBarrier();
	}
	public void glTextureBuffer(int texture, int internalformat, int buffer) {
		GL45.glTextureBuffer(texture, internalformat, buffer);
	}
	public void glTextureBufferRange(int texture, int internalformat, int buffer, long offset, long size) {
		GL45.glTextureBufferRange(texture, internalformat, buffer, offset, size);
	}
	public void glTextureParameter(int texture, int pname, java.nio.FloatBuffer params) {
		GL45.glTextureParameter(texture, pname, params);
	}
	public void glTextureParameter(int texture, int pname, java.nio.IntBuffer params) {
		GL45.glTextureParameter(texture, pname, params);
	}
	public void glTextureParameterf(int texture, int pname, java.nio.ByteBuffer params) {
		GL45.glTextureParameterf(texture, pname, params);
	}
	public void glTextureParameterf(int texture, int pname, float param) {
		GL45.glTextureParameterf(texture, pname, param);
	}
	public void glTextureParameteri(int texture, int pname, java.nio.ByteBuffer params) {
		GL45.glTextureParameteri(texture, pname, params);
	}
	public void glTextureParameteri(int texture, int pname, int param) {
		GL45.glTextureParameteri(texture, pname, param);
	}
	public void glTextureParameterI(int texture, int pname, java.nio.IntBuffer params) {
		GL45.glTextureParameterI(texture, pname, params);
	}
	public void glTextureParameterIi(int texture, int pname, java.nio.ByteBuffer params) {
		GL45.glTextureParameterIi(texture, pname, params);
	}
	public void glTextureParameterIi(int texture, int pname, int param) {
		GL45.glTextureParameterIi(texture, pname, param);
	}
	public void glTextureParameterIu(int texture, int pname, java.nio.IntBuffer params) {
		GL45.glTextureParameterIu(texture, pname, params);
	}
	public void glTextureParameterIui(int texture, int pname, java.nio.ByteBuffer params) {
		GL45.glTextureParameterIui(texture, pname, params);
	}
	public void glTextureParameterIui(int texture, int pname, int param) {
		GL45.glTextureParameterIui(texture, pname, param);
	}
	public void glTextureStorage1D(int texture, int levels, int internalformat, int width) {
		GL45.glTextureStorage1D(texture, levels, internalformat, width);
	}
	public void glTextureStorage2D(int texture, int levels, int internalformat, int width, int height) {
		GL45.glTextureStorage2D(texture, levels, internalformat, width, height);
	}
	public void glTextureStorage2DMultisample(int texture, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
		GL45.glTextureStorage2DMultisample(texture, samples, internalformat, width, height, fixedsamplelocations);
	}
	public void glTextureStorage3D(int texture, int levels, int internalformat, int width, int height, int depth) {
		GL45.glTextureStorage3D(texture, levels, internalformat, width, height, depth);
	}
	public void glTextureStorage3DMultisample(int texture, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
		GL45.glTextureStorage3DMultisample(texture, samples, internalformat, width, height, depth, fixedsamplelocations);
	}
	public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, java.nio.ByteBuffer pixels) {
		GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
	}
	public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, java.nio.DoubleBuffer pixels) {
		GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
	}
	public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, java.nio.FloatBuffer pixels) {
		GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
	}
	public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, java.nio.IntBuffer pixels) {
		GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
	}
	public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixelsOffset) {
		GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixelsOffset);
	}
	public void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, java.nio.ShortBuffer pixels) {
		GL45.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
	}
	public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.ByteBuffer pixels) {
		GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}
	public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.DoubleBuffer pixels) {
		GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}
	public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.FloatBuffer pixels) {
		GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}
	public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.IntBuffer pixels) {
		GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}
	public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixelsOffset) {
		GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixelsOffset);
	}
	public void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, java.nio.ShortBuffer pixels) {
		GL45.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}
	public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.ByteBuffer pixels) {
		GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}
	public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.DoubleBuffer pixels) {
		GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}
	public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.FloatBuffer pixels) {
		GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}
	public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.IntBuffer pixels) {
		GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}
	public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixelsOffset) {
		GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixelsOffset);
	}
	public void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, java.nio.ShortBuffer pixels) {
		GL45.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}
	public void glTransformFeedbackBufferBase(int xfb, int index, int buffer) {
		GL45.glTransformFeedbackBufferBase(xfb, index, buffer);
	}
	public void glTransformFeedbackBufferRange(int xfb, int index, int buffer, long offset, long size) {
		GL45.glTransformFeedbackBufferRange(xfb, index, buffer, offset, size);
	}
	public boolean glUnmapNamedBuffer(int buffer) {
		return GL45.glUnmapNamedBuffer(buffer);
	}
	public void glVertexArrayAttribBinding(int vaobj, int attribindex, int bindingindex) {
		GL45.glVertexArrayAttribBinding(vaobj, attribindex, bindingindex);
	}
	public void glVertexArrayAttribFormat(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset) {
		GL45.glVertexArrayAttribFormat(vaobj, attribindex, size, type, normalized, relativeoffset);
	}
	public void glVertexArrayAttribIFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) {
		GL45.glVertexArrayAttribIFormat(vaobj, attribindex, size, type, relativeoffset);
	}
	public void glVertexArrayAttribLFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) {
		GL45.glVertexArrayAttribLFormat(vaobj, attribindex, size, type, relativeoffset);
	}
	public void glVertexArrayBindingDivisor(int vaobj, int bindingindex, int divisor) {
		GL45.glVertexArrayBindingDivisor(vaobj, bindingindex, divisor);
	}
	public void glVertexArrayElementBuffer(int vaobj, int buffer) {
		GL45.glVertexArrayElementBuffer(vaobj, buffer);
	}
	public void glVertexArrayVertexBuffer(int vaobj, int bindingindex, int buffer, long offset, int stride) {
		GL45.glVertexArrayVertexBuffer(vaobj, bindingindex, buffer, offset, stride);
	}
	public void glVertexArrayVertexBuffers(int vaobj, int first, java.nio.IntBuffer buffers, PointerBuffer offsets, java.nio.IntBuffer strides) {
		GL45.glVertexArrayVertexBuffers(vaobj, first, buffers, LWJGLUtils.s_wrapPointerBuffer(offsets), strides);
	}
	public void glVertexArrayVertexBuffers(int vaobj, int first, int count, java.nio.ByteBuffer buffers, java.nio.ByteBuffer offsets, java.nio.ByteBuffer strides) {
		GL45.glVertexArrayVertexBuffers(vaobj, first, count, buffers, offsets, strides);
	}
}
