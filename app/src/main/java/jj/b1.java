package jj;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class b1 extends gm.m implements fm.l<bj.b, List<? extends rj.a>> {

    /* renamed from: b */
    public static final b1 f17878b = new b1();

    public b1() {
        super(1);
    }

    @Override // fm.l
    public final List<? extends rj.a> k(bj.b bVar) {
        int i10;
        boolean z10;
        String str;
        bj.b bVar2 = bVar;
        ArrayList arrayList = new ArrayList(5);
        byte[] bArr = bVar2.f4399c;
        if (bArr != 0 && bArr.length > 0) {
            int i11 = 0;
            int i12 = 0;
            while (i12 < bArr.length) {
                int i13 = i12 + 1;
                int i14 = bArr[i12];
                if (i14 >= 5 && (i10 = i14 + i13) <= bArr.length) {
                    byte[] bArr2 = new byte[i14];
                    System.arraycopy(bArr, i13, bArr2, i11, i14);
                    byte b10 = bArr2[i11];
                    int i15 = (b10 >> 2) & 63;
                    byte b11 = bArr2[1];
                    int i16 = ((b10 << 2) & 15) | ((b11 >> 6) & 3);
                    int i17 = (b11 >> 1) & 31;
                    byte b12 = bArr2[2];
                    int i18 = ((b11 << 4) & 16) | ((b12 >> 4) & 15);
                    byte b13 = bArr2[3];
                    int i19 = ((b12 << 2) & 63) | ((b13 >> 6) & 3);
                    int i20 = (b13 >> 3) & 7;
                    byte b14 = bArr2[4];
                    if (((b14 >> 7) & 1) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i21 = b14 & Byte.MAX_VALUE;
                    if (i14 > 5) {
                        str = new String(bArr2, 5, i14 - 5);
                    } else {
                        str = null;
                    }
                    rj.a aVar = new rj.a(i20);
                    aVar.f25763g = i21;
                    aVar.f25764h = z10;
                    aVar.f25758b = i15 + 2000;
                    aVar.f25759c = i16 - 1;
                    aVar.f25760d = i17;
                    aVar.f25761e = i18;
                    aVar.f25762f = i19;
                    aVar.f25765i = str;
                    arrayList.add(aVar);
                    i12 = i10;
                    i11 = 0;
                } else {
                    throw new yi.f(bVar2);
                }
            }
        }
        return arrayList;
    }
}
