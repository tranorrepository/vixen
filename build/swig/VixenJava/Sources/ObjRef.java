/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Vixen;

public class ObjRef extends RefPtr {
  private long swigCPtr;

  public ObjRef(long cPtr, boolean cMemoryOwn) {
    super(VixenLibJNI.ObjRef_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ObjRef obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        VixenLibJNI.delete_ObjRef(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ObjRef(RefObj p) {
    this(VixenLibJNI.new_ObjRef__SWIG_0(RefObj.getCPtr(p), p), true);
  }

  public ObjRef() {
    this(VixenLibJNI.new_ObjRef__SWIG_1(), true);
  }

  public ObjRef(ObjRef src) {
    this(VixenLibJNI.new_ObjRef__SWIG_2(ObjRef.getCPtr(src), src), true);
  }

  public ObjRef(SharedObj p) {
    this(VixenLibJNI.new_ObjRef__SWIG_3(SharedObj.getCPtr(p), p), true);
  }

  public SharedObj __ref__() 
	{
		jlong ptr = VixenLibJNI.ObjRef___ref__(swigCPtr, this);
		return (SharedObj)  SharedObj.MakeObject(ptr, true);
	}


  public ObjRef Assign(ObjRef arg0) {
    return new ObjRef(VixenLibJNI.ObjRef_Assign__SWIG_0(swigCPtr, this, ObjRef.getCPtr(arg0), arg0), false);
  }

  public ObjRef Assign(SharedObj arg0) {
    return new ObjRef(VixenLibJNI.ObjRef_Assign__SWIG_1(swigCPtr, this, SharedObj.getCPtr(arg0), arg0), false);
  }

  public boolean Equal(ObjRef arg0) {
    return VixenLibJNI.ObjRef_Equal__SWIG_0(swigCPtr, this, ObjRef.getCPtr(arg0), arg0);
  }

  public boolean NotEqual(ObjRef arg0) {
    return VixenLibJNI.ObjRef_NotEqual__SWIG_0(swigCPtr, this, ObjRef.getCPtr(arg0), arg0);
  }

  public boolean Equal(SharedObj arg0) {
    return VixenLibJNI.ObjRef_Equal__SWIG_1(swigCPtr, this, SharedObj.getCPtr(arg0), arg0);
  }

  public boolean NotEqual(SharedObj arg0) {
    return VixenLibJNI.ObjRef_NotEqual__SWIG_1(swigCPtr, this, SharedObj.getCPtr(arg0), arg0);
  }

  public static ObjRef getNull() {
    long cPtr = VixenLibJNI.ObjRef_Null_get();
    return (cPtr == 0) ? null : new ObjRef(cPtr, false);
  }

}