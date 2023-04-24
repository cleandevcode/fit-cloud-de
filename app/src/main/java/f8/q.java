package f8;

import android.os.RemoteException;
import android.util.Log;
import i8.k1;
import i8.m0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class q extends k1 {

    /* renamed from: a */
    public final int f14189a;

    public q(byte[] bArr) {
        if (!(bArr.length == 25)) {
            throw new IllegalArgumentException();
        }
        this.f14189a = Arrays.hashCode(bArr);
    }

    public static byte[] a0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        p8.c n10;
        if (obj != null && (obj instanceof m0)) {
            try {
                m0 m0Var = (m0) obj;
                if (m0Var.v0() == this.f14189a && (n10 = m0Var.n()) != null) {
                    return Arrays.equals(f0(), (byte[]) p8.c.f0(n10));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public abstract byte[] f0();

    public final int hashCode() {
        return this.f14189a;
    }

    @Override // i8.m0
    public final p8.c n() {
        return new p8.c(f0());
    }

    @Override // i8.m0
    public final int v0() {
        return this.f14189a;
    }
}
