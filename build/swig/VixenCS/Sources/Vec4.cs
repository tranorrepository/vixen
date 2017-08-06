/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace Vixen {

using System;
using System.Runtime.InteropServices;

public class Vec4 : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal Vec4(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(Vec4 obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~Vec4() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          VixenLibPINVOKE.delete_Vec4(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

		public static Vec4 operator +(Vec4 arg1, Vec4 arg2)	{ return arg1.Add(arg2); }
		public static Vec4 operator -(Vec4 arg1, Vec4 arg2)	{ return arg1.Sub(arg2); }
		public static Vec4 operator *(Vec4 vec, float val)	{ return vec.Mul(val); }
		public static Vec4 operator /(Vec4 vec, float val)	{ return vec.Div(val); }
	
  public float x {
    set {
      VixenLibPINVOKE.Vec4_x_set(swigCPtr, value);
    } 
    get {
      float ret = VixenLibPINVOKE.Vec4_x_get(swigCPtr);
      return ret;
    } 
  }

  public float y {
    set {
      VixenLibPINVOKE.Vec4_y_set(swigCPtr, value);
    } 
    get {
      float ret = VixenLibPINVOKE.Vec4_y_get(swigCPtr);
      return ret;
    } 
  }

  public float z {
    set {
      VixenLibPINVOKE.Vec4_z_set(swigCPtr, value);
    } 
    get {
      float ret = VixenLibPINVOKE.Vec4_z_get(swigCPtr);
      return ret;
    } 
  }

  public float w {
    set {
      VixenLibPINVOKE.Vec4_w_set(swigCPtr, value);
    } 
    get {
      float ret = VixenLibPINVOKE.Vec4_w_get(swigCPtr);
      return ret;
    } 
  }

  public Vec4() : this(VixenLibPINVOKE.new_Vec4__SWIG_0(), true) {
  }

  public Vec4(float[] floatArray) : this(VixenLibPINVOKE.new_Vec4__SWIG_1(floatArray), true) {
  }

  public Vec4(Vec3 arg0) : this(VixenLibPINVOKE.new_Vec4__SWIG_2(Vec3.getCPtr(arg0)), true) {
    if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
  }

  public Vec4(Vec4 arg0) : this(VixenLibPINVOKE.new_Vec4__SWIG_3(Vec4.getCPtr(arg0)), true) {
    if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
  }

  public Vec4(float x, float y, float z, float w) : this(VixenLibPINVOKE.new_Vec4__SWIG_4(x, y, z, w), true) {
  }

  public void Set(float x, float y, float z, float w) {
    VixenLibPINVOKE.Vec4_Set(swigCPtr, x, y, z, w);
  }

  public bool Equals(Vec4 arg0) {
    bool ret = VixenLibPINVOKE.Vec4_Equals(swigCPtr, Vec4.getCPtr(arg0));
    if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public Vec4 Sub(Vec4 arg0) {
    Vec4 ret = new Vec4(VixenLibPINVOKE.Vec4_Sub(swigCPtr, Vec4.getCPtr(arg0)), true);
    if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public Vec4 Add(Vec4 arg0) {
    Vec4 ret = new Vec4(VixenLibPINVOKE.Vec4_Add(swigCPtr, Vec4.getCPtr(arg0)), true);
    if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public Vec4 Mul(float arg0) {
    Vec4 ret = new Vec4(VixenLibPINVOKE.Vec4_Mul(swigCPtr, arg0), true);
    return ret;
  }

  public Vec4 Div(float arg0) {
    Vec4 ret = new Vec4(VixenLibPINVOKE.Vec4_Div(swigCPtr, arg0), true);
    return ret;
  }

  public bool IsEmpty() {
    bool ret = VixenLibPINVOKE.Vec4_IsEmpty(swigCPtr);
    return ret;
  }

  public Vec4 Negate() {
    Vec4 ret = new Vec4(VixenLibPINVOKE.Vec4_Negate(swigCPtr), false);
    return ret;
  }

  public float Normalize() {
    float ret = VixenLibPINVOKE.Vec4_Normalize(swigCPtr);
    return ret;
  }

  public float Dot(Vec4 arg0) {
    float ret = VixenLibPINVOKE.Vec4_Dot__SWIG_0(swigCPtr, Vec4.getCPtr(arg0));
    if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public float Dot(float[] floatArray) {
    float ret = VixenLibPINVOKE.Vec4_Dot__SWIG_1(swigCPtr, floatArray);
    return ret;
  }

  public float Distance(Vec4 arg0) {
    float ret = VixenLibPINVOKE.Vec4_Distance(swigCPtr, Vec4.getCPtr(arg0));
    if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public float DistanceSquared(Vec4 v) {
    float ret = VixenLibPINVOKE.Vec4_DistanceSquared(swigCPtr, Vec4.getCPtr(v));
    if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void Transform(Matrix arg0, Vec4 arg1) {
    VixenLibPINVOKE.Vec4_Transform(swigCPtr, Matrix.getCPtr(arg0), Vec4.getCPtr(arg1));
    if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
  }

  public float Length {
    set {
      VixenLibPINVOKE.Vec4_Length_set(swigCPtr, value);
    } 
    get {
      float ret = VixenLibPINVOKE.Vec4_Length_get(swigCPtr);
      return ret;
    } 
  }

  [System.ComponentModel.Browsable(false)]
  public float LengthSquared {
    set {
      VixenLibPINVOKE.Vec4_LengthSquared_set(swigCPtr, value);
    } 
    get {
      float ret = VixenLibPINVOKE.Vec4_LengthSquared_get(swigCPtr);
      return ret;
    } 
  }

}

}