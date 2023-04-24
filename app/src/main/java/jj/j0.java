package jj;

import java.util.List;

/* loaded from: classes2.dex */
public final class j0 extends gm.m implements fm.l<bj.b, List<? extends byte[]>> {

    /* renamed from: b */
    public static final j0 f17910b = new j0();

    public j0() {
        super(1);
    }

    @Override // fm.l
    public final List<? extends byte[]> k(bj.b bVar) {
        byte[][] bArr = new byte[2];
        int i10 = 0;
        bArr[0] = bVar.f4399c;
        long currentTimeMillis = System.currentTimeMillis();
        byte[] bArr2 = new byte[8];
        while (i10 < 8) {
            int i11 = i10 + 1;
            bArr2[i10] = (byte) ((currentTimeMillis >> (64 - (i11 * 8))) & 255);
            i10 = i11;
        }
        bArr[1] = bArr2;
        return h7.a.f(bArr);
    }
}
