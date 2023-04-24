package g4;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public int f14958a;

    /* renamed from: b */
    public final int f14959b;

    /* renamed from: c */
    public final int f14960c;

    /* renamed from: d */
    public Object f14961d;

    public /* synthetic */ c(int i10, int i11) {
        this.f14961d = new fb.a[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            ((fb.a[]) this.f14961d)[i12] = new fb.a(((i11 + 4) * 17) + 1);
        }
        this.f14960c = i11 * 17;
        this.f14959b = i10;
        this.f14958a = -1;
    }

    public /* synthetic */ c(b bVar, String str, String str2) {
        if (bVar.f14954n == null) {
            bVar.f14954n = this;
        } else {
            bVar.f14955o.f14961d = this;
        }
        bVar.f14955o = this;
        this.f14958a = 1;
        this.f14959b = bVar.d(str);
        this.f14960c = bVar.d(str2);
    }

    public final fb.a a() {
        return ((fb.a[]) this.f14961d)[this.f14958a];
    }

    public final byte[][] b(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, this.f14959b * i11, this.f14960c * i10);
        int i12 = this.f14959b * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i12 - i13) - 1;
            fb.a aVar = ((fb.a[]) this.f14961d)[i13 / i11];
            int length = ((byte[]) aVar.f14219a).length * i10;
            byte[] bArr2 = new byte[length];
            for (int i15 = 0; i15 < length; i15++) {
                bArr2[i15] = ((byte[]) aVar.f14219a)[i15 / i10];
            }
            bArr[i14] = bArr2;
        }
        return bArr;
    }
}
