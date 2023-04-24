package ab;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: c */
    public final short f436c;

    /* renamed from: d */
    public final short f437d;

    public a(g gVar, int i10, int i11) {
        super(gVar);
        this.f436c = (short) i10;
        this.f437d = (short) i11;
    }

    @Override // ab.g
    public final void a(bb.a aVar, byte[] bArr) {
        int i10;
        int i11 = 0;
        while (true) {
            short s10 = this.f437d;
            if (i11 >= s10) {
                return;
            }
            if (i11 == 0 || (i11 == 31 && s10 <= 62)) {
                int i12 = 5;
                aVar.b(31, 5);
                short s11 = this.f437d;
                if (s11 > 62) {
                    i10 = s11 - 31;
                    i12 = 16;
                } else if (i11 == 0) {
                    aVar.b(Math.min((int) s11, 31), 5);
                } else {
                    i10 = s11 - 31;
                }
                aVar.b(i10, i12);
            }
            aVar.b(bArr[this.f436c + i11], 8);
            i11++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append((int) this.f436c);
        sb2.append("::");
        sb2.append((this.f436c + this.f437d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
