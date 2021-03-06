/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Vixen;

public class Transformer extends Engine {
  private long swigCPtr;

  public Transformer(long cPtr, boolean cMemoryOwn) {
    super(VixenLibJNI.Transformer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Transformer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        VixenLibJNI.delete_Transformer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Transformer() {
    this(VixenLibJNI.new_Transformer__SWIG_0(), true);
  }

  public Transformer(Matrix trans) {
    this(VixenLibJNI.new_Transformer__SWIG_1(Matrix.getCPtr(trans), trans), true);
  }

  public Vec3 GetPosition() {
    return new Vec3(VixenLibJNI.Transformer_GetPosition(swigCPtr, this), false);
  }

  public Quat GetRotation() {
    return new Quat(VixenLibJNI.Transformer_GetRotation(swigCPtr, this), false);
  }

  public Vec3 GetScale() {
    return new Vec3(VixenLibJNI.Transformer_GetScale(swigCPtr, this), false);
  }

  public Matrix GetTransform() {
    long cPtr = VixenLibJNI.Transformer_GetTransform(swigCPtr, this);
    return (cPtr == 0) ? null : new Matrix(cPtr, false);
  }

  public Quat GetLookRotation() {
    return new Quat(VixenLibJNI.Transformer_GetLookRotation(swigCPtr, this), false);
  }

  public Matrix GetTotalTransform() {
    long cPtr = VixenLibJNI.Transformer_GetTotalTransform(swigCPtr, this);
    return (cPtr == 0) ? null : new Matrix(cPtr, false);
  }

  public void SetOptions(int opts) {
    VixenLibJNI.Transformer_SetOptions(swigCPtr, this, opts);
  }

  public int GetOptions() {
    return VixenLibJNI.Transformer_GetOptions(swigCPtr, this);
  }

  public void SetBoneIndex(int i) {
    VixenLibJNI.Transformer_SetBoneIndex(swigCPtr, this, i);
  }

  public int GetBoneIndex() {
    return VixenLibJNI.Transformer_GetBoneIndex(swigCPtr, this);
  }

  public void SetPosition(Vec3 arg0) {
    VixenLibJNI.Transformer_SetPosition__SWIG_0(swigCPtr, this, Vec3.getCPtr(arg0), arg0);
  }

  public void SetPosition(float x, float y, float z) {
    VixenLibJNI.Transformer_SetPosition__SWIG_1(swigCPtr, this, x, y, z);
  }

  public void SetScale(Vec3 arg0) {
    VixenLibJNI.Transformer_SetScale__SWIG_0(swigCPtr, this, Vec3.getCPtr(arg0), arg0);
  }

  public void SetScale(float x, float y, float z) {
    VixenLibJNI.Transformer_SetScale__SWIG_1(swigCPtr, this, x, y, z);
  }

  public void SetRotation(Quat arg0) {
    VixenLibJNI.Transformer_SetRotation__SWIG_0(swigCPtr, this, Quat.getCPtr(arg0), arg0);
  }

  public void SetRotation(Vec3 axis, float angle) {
    VixenLibJNI.Transformer_SetRotation__SWIG_1(swigCPtr, this, Vec3.getCPtr(axis), axis, angle);
  }

  public void SetLocalPosition(Vec3 arg0) {
    VixenLibJNI.Transformer_SetLocalPosition(swigCPtr, this, Vec3.getCPtr(arg0), arg0);
  }

  public void SetLookRotation(Quat arg0) {
    VixenLibJNI.Transformer_SetLookRotation(swigCPtr, this, Quat.getCPtr(arg0), arg0);
  }

  public void Reset() {
    VixenLibJNI.Transformer_Reset(swigCPtr, this);
  }

  public void SetTransform(Matrix trans) {
    VixenLibJNI.Transformer_SetTransform(swigCPtr, this, Matrix.getCPtr(trans), trans);
  }

  public Matrix CalcMatrix() {
    long cPtr = VixenLibJNI.Transformer_CalcMatrix(swigCPtr, this);
    return (cPtr == 0) ? null : new Matrix(cPtr, false);
  }

  public void Compute(float time) {
    VixenLibJNI.Transformer_Compute(swigCPtr, this, time);
  }

  public void SetTarget(SharedObj target) {
    VixenLibJNI.Transformer_SetTarget(swigCPtr, this, SharedObj.getCPtr(target), target);
  }

  public boolean Copy(SharedObj arg0) {
    return VixenLibJNI.Transformer_Copy(swigCPtr, this, SharedObj.getCPtr(arg0), arg0);
  }

  public final static int LOCAL = VixenLibJNI.Transformer_LOCAL_get();
  public final static int WORLD = VixenLibJNI.Transformer_WORLD_get();

}
