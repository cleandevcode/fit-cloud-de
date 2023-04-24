package com.realsil.sdk.dfu.utils;

import ge.b;

/* loaded from: classes.dex */
public class AesJni {
    static {
        try {
            b.n("AesJni: V1.0.0.1");
            System.loadLibrary("RtkAesJni");
        } catch (Exception e10) {
            b.p(e10.toString());
        }
    }

    public final byte[] a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        byte[] bArr3 = new byte[i11];
        try {
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            aes_encrypt(bArr2, bArr3);
        } catch (Exception e10) {
            b.p(e10.toString());
        }
        return bArr3;
    }

    public native boolean aesInit(int i10, byte[] bArr);

    public native void aes_encrypt(byte[] bArr, byte[] bArr2);
}
