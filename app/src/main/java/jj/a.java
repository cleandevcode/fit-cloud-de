package jj;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final boolean f17870a;

    /* renamed from: b */
    public final boolean f17871b;

    /* renamed from: c */
    public final boolean f17872c;

    /* renamed from: d */
    public final boolean f17873d;

    /* renamed from: e */
    public final int f17874e;

    public a() {
        this(false, false, false, 31);
    }

    public a(boolean z10, boolean z11, boolean z12, int i10) {
        z10 = (i10 & 1) != 0 ? false : z10;
        z11 = (i10 & 2) != 0 ? false : z11;
        z12 = (i10 & 8) != 0 ? false : z12;
        this.f17870a = z10;
        this.f17871b = z11;
        this.f17872c = false;
        this.f17873d = z12;
        this.f17874e = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f17870a == aVar.f17870a && this.f17871b == aVar.f17871b && this.f17872c == aVar.f17872c && this.f17873d == aVar.f17873d && this.f17874e == aVar.f17874e;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public final int hashCode() {
        boolean z10 = this.f17870a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f17871b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f17872c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z11 = this.f17873d;
        return this.f17874e + ((i14 + (z11 ? 1 : z11 ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder c10 = jh.v.c("FcBuiltInFeatures(autoSetLanguage=");
        c10.append(this.f17870a);
        c10.append(", mediaControl=");
        c10.append(this.f17871b);
        c10.append(", telephonyControl=");
        c10.append(this.f17872c);
        c10.append(", musicControl=");
        c10.append(this.f17873d);
        c10.append(", cacheFlags=");
        return jh.v.b(c10, this.f17874e, ')');
    }
}
