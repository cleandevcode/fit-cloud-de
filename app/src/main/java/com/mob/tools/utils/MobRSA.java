package com.mob.tools.utils;

import com.mob.commons.C0744r;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.math.BigInteger;

/* loaded from: classes.dex */
public class MobRSA implements PublicMemberKeeper {

    /* renamed from: a */
    private int f9330a;

    public MobRSA(int i10) {
        this.f9330a = i10;
    }

    private byte[] a(byte[] bArr, int i10) {
        if (bArr.length <= i10 - 1) {
            byte[] bArr2 = new byte[i10];
            bArr2[0] = 1;
            int length = bArr.length;
            bArr2[1] = (byte) (length >> 24);
            bArr2[2] = (byte) (length >> 16);
            bArr2[3] = (byte) (length >> 8);
            bArr2[4] = (byte) length;
            System.arraycopy(bArr, 0, bArr2, i10 - length, length);
            return bArr2;
        }
        throw new Throwable("Message too large");
    }

    private byte[] a(byte[] bArr, int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2, int i12) {
        if (bArr.length != i11 || i10 != 0) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            bArr = bArr2;
        }
        BigInteger bigInteger3 = new BigInteger(a(bArr, i12));
        if (bigInteger3.compareTo(bigInteger2) <= 0) {
            return bigInteger3.modPow(bigInteger, bigInteger2).toByteArray();
        }
        throw new Throwable("the message must be smaller than the modulue");
    }

    public byte[] encode(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        int i10 = this.f9330a / 8;
        int i11 = i10 - 11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
            int i12 = 0;
            while (bArr.length > i12) {
                try {
                    int min = Math.min(bArr.length - i12, i11);
                    byte[] a10 = a(bArr, i12, min, bigInteger, bigInteger2, i10);
                    dataOutputStream2.writeInt(a10.length);
                    dataOutputStream2.write(a10);
                    i12 += min;
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    C0744r.a(dataOutputStream);
                    throw th;
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C0744r.a(dataOutputStream2);
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
