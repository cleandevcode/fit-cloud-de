package pn;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a */
    public boolean f24446a;

    /* renamed from: b */
    public byte[] f24447b;

    /* renamed from: c */
    public int f24448c;

    /* renamed from: d */
    public boolean f24449d;

    /* renamed from: e */
    public boolean f24450e;

    /* renamed from: f */
    public int f24451f;

    public o() {
        this.f24446a = true;
        this.f24448c = 1;
        this.f24449d = false;
        this.f24450e = false;
        this.f24447b = new byte[0];
    }

    public final void a(int i10) {
        if (this.f24446a) {
            if (i10 >= 0 && i10 <= 2) {
                this.f24448c = i10;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return new String(this.f24447b);
    }

    public o(byte[] bArr) {
        this.f24446a = true;
        this.f24448c = 1;
        this.f24449d = false;
        this.f24450e = false;
        bArr.getClass();
        this.f24447b = bArr;
    }
}
