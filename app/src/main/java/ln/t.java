package ln;

import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a */
    public final byte[] f20131a;

    /* renamed from: b */
    public int f20132b;

    /* renamed from: c */
    public int f20133c;

    /* renamed from: d */
    public boolean f20134d;

    /* renamed from: e */
    public boolean f20135e;

    /* renamed from: f */
    public t f20136f;

    /* renamed from: g */
    public t f20137g;

    public t() {
        this.f20131a = new byte[DfuBaseService.ERROR_REMOTE_MASK];
        this.f20135e = true;
        this.f20134d = false;
    }

    public t(int i10, int i11, boolean z10, byte[] bArr) {
        gm.l.f(bArr, "data");
        this.f20131a = bArr;
        this.f20132b = i10;
        this.f20133c = i11;
        this.f20134d = z10;
        this.f20135e = false;
    }

    public final t a() {
        t tVar = this.f20136f;
        if (tVar == this) {
            tVar = null;
        }
        t tVar2 = this.f20137g;
        gm.l.c(tVar2);
        tVar2.f20136f = this.f20136f;
        t tVar3 = this.f20136f;
        gm.l.c(tVar3);
        tVar3.f20137g = this.f20137g;
        this.f20136f = null;
        this.f20137g = null;
        return tVar;
    }

    public final void b(t tVar) {
        tVar.f20137g = this;
        tVar.f20136f = this.f20136f;
        t tVar2 = this.f20136f;
        gm.l.c(tVar2);
        tVar2.f20137g = tVar;
        this.f20136f = tVar;
    }

    public final t c() {
        this.f20134d = true;
        return new t(this.f20132b, this.f20133c, true, this.f20131a);
    }

    public final void d(t tVar, int i10) {
        if (tVar.f20135e) {
            int i11 = tVar.f20133c;
            int i12 = i11 + i10;
            if (i12 > 8192) {
                if (!tVar.f20134d) {
                    int i13 = tVar.f20132b;
                    if (i12 - i13 <= 8192) {
                        byte[] bArr = tVar.f20131a;
                        ul.i.v(0, i13, i11, bArr, bArr);
                        tVar.f20133c -= tVar.f20132b;
                        tVar.f20132b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f20131a;
            byte[] bArr3 = tVar.f20131a;
            int i14 = tVar.f20133c;
            int i15 = this.f20132b;
            ul.i.v(i14, i15, i15 + i10, bArr2, bArr3);
            tVar.f20133c += i10;
            this.f20132b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
}
