/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Vixen;

public class TimeInterp extends FloatInterp {
  private long swigCPtr;

  public TimeInterp(long cPtr, boolean cMemoryOwn) {
    super(VixenLibJNI.TimeInterp_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TimeInterp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        VixenLibJNI.delete_TimeInterp(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TimeInterp() {
    this(VixenLibJNI.new_TimeInterp(), true);
  }

}
