package jj;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class j1 extends gm.m implements fm.l<bj.b, List<? extends uj.a>> {

    /* renamed from: b */
    public static final j1 f17911b = new j1();

    public j1() {
        super(1);
    }

    @Override // fm.l
    public final List<? extends uj.a> k(bj.b bVar) {
        boolean z10;
        boolean z11;
        bj.b bVar2 = bVar;
        byte[] bArr = bVar2.f4399c;
        if (bArr != null) {
            if (bArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i10 = bArr[0] & 255;
                ArrayList arrayList = new ArrayList(i10);
                if (i10 > 0) {
                    if (bArr.length >= (i10 * 3) + 1) {
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            int i13 = i12 * 3;
                            int i14 = bi.r.i(bArr, i13 + 1, 2);
                            if (bArr[i13 + 3] > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            byte b10 = (byte) (i11 + 208);
                            if (z11) {
                                i11++;
                            }
                            arrayList.add(new uj.a(i14, z11, b10));
                        }
                    } else {
                        throw new yi.f(bVar2);
                    }
                }
                return arrayList;
            }
        }
        throw new yi.f(bVar2);
    }
}
