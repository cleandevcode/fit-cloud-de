package mn;

import gm.l;
import ln.e;
import ln.t;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public static final byte[] f21894a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(om.a.f23623a);
        l.e(bytes, "(this as java.lang.String).getBytes(charset)");
        f21894a = bytes;
    }

    public static final boolean a(t tVar, int i10, byte[] bArr, int i11) {
        int i12 = tVar.f20133c;
        byte[] bArr2 = tVar.f20131a;
        for (int i13 = 1; i13 < i11; i13++) {
            if (i10 == i12) {
                tVar = tVar.f20136f;
                l.c(tVar);
                byte[] bArr3 = tVar.f20131a;
                bArr2 = bArr3;
                i10 = tVar.f20132b;
                i12 = tVar.f20133c;
            }
            if (bArr2[i10] != bArr[i13]) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static final String b(e eVar, long j10) {
        String P;
        l.f(eVar, "$this$readUtf8Line");
        long j11 = 1;
        if (j10 > 0) {
            long j12 = j10 - 1;
            if (eVar.y(j12) == ((byte) 13)) {
                P = eVar.P(j12);
                j11 = 2;
                eVar.skip(j11);
                return P;
            }
        }
        P = eVar.P(j10);
        eVar.skip(j11);
        return P;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x005b, code lost:
        if (r19 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x005d, code lost:
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x005e, code lost:
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(ln.e r17, ln.p r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mn.a.c(ln.e, ln.p, boolean):int");
    }
}
