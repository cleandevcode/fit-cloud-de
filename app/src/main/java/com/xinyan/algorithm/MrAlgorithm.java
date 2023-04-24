package com.xinyan.algorithm;

/* loaded from: classes2.dex */
public class MrAlgorithm {

    /* loaded from: classes2.dex */
    public interface CallBack {
        void onECGData(int[] iArr);

        void onEvent(int i10, int i11, String str, boolean z10);

        void onHR(int i10);

        void onSummaryInfo(SummaryInfo summaryInfo);
    }

    /* loaded from: classes2.dex */
    public interface Log {
        void println(String str);
    }

    static {
        System.loadLibrary("mralgorithm");
    }

    public native void enableLog(Log log);

    public native String getArrType();

    public native int getHR();

    public native int getRemainCount();

    public native String getToken(String str, String str2);

    public native String init(String str, CallBack callBack);

    public native void pushData(byte[] bArr);

    public native void pushWaveData(int[] iArr);

    public native boolean term();
}
