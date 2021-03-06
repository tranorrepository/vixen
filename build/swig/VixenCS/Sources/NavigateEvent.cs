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

public class NavigateEvent : Event {
  private HandleRef swigCPtr;

  internal NavigateEvent(IntPtr cPtr, bool cMemoryOwn) : base(VixenLibPINVOKE.NavigateEvent_SWIGUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(NavigateEvent obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~NavigateEvent() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          VixenLibPINVOKE.delete_NavigateEvent(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public NavigateEvent() : this(VixenLibPINVOKE.new_NavigateEvent__SWIG_0(), true) {
  }

  public NavigateEvent(NavigateEvent src) : this(VixenLibPINVOKE.new_NavigateEvent__SWIG_1(NavigateEvent.getCPtr(src)), true) {
    if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
  }

  public int Flags {
    set {
      VixenLibPINVOKE.NavigateEvent_Flags_set(swigCPtr, value);
    } 
    get {
      int ret = VixenLibPINVOKE.NavigateEvent_Flags_get(swigCPtr);
      return ret;
    } 
  }

  public Vec3 Pos {
    set {
      VixenLibPINVOKE.NavigateEvent_Pos_set(swigCPtr, Vec3.getCPtr(value));
      if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      Vec3 ret = new Vec3(VixenLibPINVOKE.NavigateEvent_Pos_get(swigCPtr), false);
      if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public Quat Rot {
    set {
      VixenLibPINVOKE.NavigateEvent_Rot_set(swigCPtr, Quat.getCPtr(value));
      if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      Quat ret = new Quat(VixenLibPINVOKE.NavigateEvent_Rot_get(swigCPtr), false);
      if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public Quat Look {
    set {
      VixenLibPINVOKE.NavigateEvent_Look_set(swigCPtr, Quat.getCPtr(value));
      if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      Quat ret = new Quat(VixenLibPINVOKE.NavigateEvent_Look_get(swigCPtr), false);
      if (VixenLibPINVOKE.SWIGPendingException.Pending) throw VixenLibPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public static readonly int CENTER = VixenLibPINVOKE.NavigateEvent_CENTER_get();
  public static readonly int POSITION = VixenLibPINVOKE.NavigateEvent_POSITION_get();
  public static readonly int ROTATION = VixenLibPINVOKE.NavigateEvent_ROTATION_get();
  public static readonly int LOOK = VixenLibPINVOKE.NavigateEvent_LOOK_get();
  public static readonly int SCALE = VixenLibPINVOKE.NavigateEvent_SCALE_get();
  public static readonly int LOCAL_POS = VixenLibPINVOKE.NavigateEvent_LOCAL_POS_get();
  public static readonly int ABSOLUTE = VixenLibPINVOKE.NavigateEvent_ABSOLUTE_get();
  public static readonly int XROTATION = VixenLibPINVOKE.NavigateEvent_XROTATION_get();
  public static readonly int YROTATION = VixenLibPINVOKE.NavigateEvent_YROTATION_get();
  public static readonly int ZROTATION = VixenLibPINVOKE.NavigateEvent_ZROTATION_get();
  public static readonly int EVENT_PENDING = VixenLibPINVOKE.NavigateEvent_EVENT_PENDING_get();

}

}
