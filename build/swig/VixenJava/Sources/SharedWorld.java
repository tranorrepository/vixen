/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Vixen;

public class SharedWorld extends World3D {
  private long swigCPtr;

  public SharedWorld(long cPtr, boolean cMemoryOwn) {
    super(VixenLibJNI.SharedWorld_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SharedWorld obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        VixenLibJNI.delete_SharedWorld(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

			public static Scene MainScene { get { return VixenLib.GetMainScene(); } }			
		
  public SharedWorld() {
    this(VixenLibJNI.new_SharedWorld(), true);
  }

  public static SharedWorld Get() 
	{
		jlong ptr = VixenLibJNI.SharedWorld_Get();
		return (SharedWorld)  SharedObj.MakeObject(ptr, true);
	}


  public void SetMediaDir(String dir) {
    VixenLibJNI.SharedWorld_SetMediaDir(swigCPtr, this, dir);
  }

  public String GetMediaDir() {
    return VixenLibJNI.SharedWorld_GetMediaDir(swigCPtr, this);
  }

  public void OnExit() {
    VixenLibJNI.SharedWorld_OnExit(swigCPtr, this);
  }

  public void StopEvents() {
    VixenLibJNI.SharedWorld_StopEvents(swigCPtr, this);
  }

  public Event NextEvent() {
    long cPtr = VixenLibJNI.SharedWorld_NextEvent(swigCPtr, this);
    return (cPtr == 0) ? null : new Event(cPtr, false);
  }

  public void Observe(int eventcode, SharedObj observer, SharedObj sender) {
    VixenLibJNI.SharedWorld_Observe__SWIG_0(swigCPtr, this, eventcode, SharedObj.getCPtr(observer), observer, SharedObj.getCPtr(sender), sender);
  }

  public void Observe(int eventcode, SharedObj observer) {
    VixenLibJNI.SharedWorld_Observe__SWIG_1(swigCPtr, this, eventcode, SharedObj.getCPtr(observer), observer);
  }

  public void Observe(int eventcode) {
    VixenLibJNI.SharedWorld_Observe__SWIG_2(swigCPtr, this, eventcode);
  }

  public void OnMouse(int xpos, int ypos, int flags, float time) {
    VixenLibJNI.SharedWorld_OnMouse(swigCPtr, this, xpos, ypos, flags, time);
  }

  public void SuspendScene() {
    VixenLibJNI.SharedWorld_SuspendScene(swigCPtr, this);
  }

  public void ResumeScene() {
    VixenLibJNI.SharedWorld_ResumeScene(swigCPtr, this);
  }

  public boolean SaveAsVix(SharedObj obj, String filename) {
    return VixenLibJNI.SharedWorld_SaveAsVix(swigCPtr, this, SharedObj.getCPtr(obj), obj, filename);
  }

  public static void LogError(String s) {
    VixenLibJNI.SharedWorld_LogError(s);
  }

  public static void Trace(String s) {
    VixenLibJNI.SharedWorld_Trace(s);
  }

  public static void SetDebugLevel(int debug) {
    VixenLibJNI.SharedWorld_SetDebugLevel(debug);
  }

}
