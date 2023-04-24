package jj;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class h1 extends gm.m implements fm.l<bj.b, List<? extends tj.a>> {

    /* renamed from: b */
    public static final h1 f17903b = new h1();

    public h1() {
        super(1);
    }

    @Override // fm.l
    public final List<? extends tj.a> k(bj.b bVar) {
        boolean z10;
        bj.b bVar2 = bVar;
        byte[] bArr = bVar2.f4399c;
        if (bArr != null) {
            int i10 = 1;
            if (bArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i11 = bArr[0] & 255;
                if (i11 <= 0) {
                    return ul.s.f28879a;
                }
                if (bArr.length >= (i11 * 5) + 1) {
                    ArrayList arrayList = new ArrayList(i11);
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList.add(new tj.a((byte) (i12 + 192), bArr[i10] & 255, bi.r.i(bArr, i10 + 1, 3), (bArr[i10 + 4] & 255) * 32));
                        i10 += 5;
                    }
                    return arrayList;
                }
                throw new yi.f(bVar2);
            }
        }
        throw new yi.f(bVar2);
    }
}
