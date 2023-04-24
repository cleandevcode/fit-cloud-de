package ab;

/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: c */
    public final short f444c;

    /* renamed from: d */
    public final short f445d;

    public e(g gVar, int i10, int i11) {
        super(gVar);
        this.f444c = (short) i10;
        this.f445d = (short) i11;
    }

    @Override // ab.g
    public final void a(bb.a aVar, byte[] bArr) {
        aVar.b(this.f444c, this.f445d);
    }

    public final String toString() {
        short s10 = this.f444c;
        short s11 = this.f445d;
        int i10 = (s10 & ((1 << s11) - 1)) | (1 << s11);
        return "<" + Integer.toBinaryString(i10 | (1 << this.f445d)).substring(1) + '>';
    }
}
