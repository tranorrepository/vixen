/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Vixen;

public class IntArray extends SharedIntArray {
  private long swigCPtr;

  public IntArray(long cPtr, boolean cMemoryOwn) {
    super(VixenLibJNI.IntArray_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IntArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        VixenLibJNI.delete_IntArray(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IntArray(long size) {
    this(VixenLibJNI.new_IntArray__SWIG_0(size), true);
  }

  public IntArray() {
    this(VixenLibJNI.new_IntArray__SWIG_1(), true);
  }

}