package yb;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public int f31275a;

    /* renamed from: b */
    public Serializable f31276b;

    public /* synthetic */ b(int i10, String str) {
        this.f31275a = i10;
        this.f31276b = str;
    }

    public final jj.h a() {
        int i10 = this.f31275a;
        byte[] bArr = (byte[]) this.f31276b;
        jj.h hVar = null;
        if (i10 >= bArr.length) {
            return null;
        }
        int i11 = i10 + 1;
        this.f31275a = i11;
        byte b10 = bArr[i10];
        if (i11 >= bArr.length) {
            return null;
        }
        int i12 = i11 + 1;
        this.f31275a = i12;
        int i13 = bArr[i11] & 255;
        if (i13 > 0 && bArr.length >= i12 + i13) {
            byte[] bArr2 = new byte[i13];
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            hVar = new jj.h(b10, bArr2);
        }
        this.f31275a += i13;
        return hVar;
    }
}
