package com.realsil.sdk.bbpro;

import android.support.v4.media.d;
import ge.b;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class DspConfig {

    /* loaded from: classes.dex */
    public static class SigProcEQ_T {
    }

    static {
        try {
            System.loadLibrary("DspConfig");
        } catch (UnsatisfiedLinkError e10) {
            b.p(e10.toString());
            PrintStream printStream = System.err;
            StringBuilder a10 = d.a("Cannot load libDspConfig:\n ");
            a10.append(e10.toString());
            printStream.println(a10.toString());
        }
    }

    public native byte[] calculateEq(double d10, int i10, double[] dArr, double[] dArr2, double[] dArr3, int[] iArr);

    public native SigProcEQ_T parseEq(byte[] bArr, int i10);
}
