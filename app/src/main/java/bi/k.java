package bi;

/* loaded from: classes2.dex */
public final class k implements u6.o {

    /* renamed from: a */
    public final boolean f4316a;

    /* renamed from: b */
    public final boolean f4317b;

    /* renamed from: c */
    public final boolean f4318c;

    /* renamed from: d */
    public final boolean f4319d;

    /* renamed from: e */
    public final boolean f4320e;

    /* renamed from: f */
    public final boolean f4321f;

    /* renamed from: g */
    public final boolean f4322g;

    /* renamed from: h */
    public final boolean f4323h;

    public k(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f4316a = z10;
        this.f4317b = z11;
        this.f4318c = z12;
        this.f4319d = z13;
        this.f4320e = z14;
        this.f4321f = z15;
        this.f4322g = z16;
        this.f4323h = z17;
    }

    public static k copy$default(k kVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i10, Object obj) {
        boolean z18 = (i10 & 1) != 0 ? kVar.f4316a : z10;
        boolean z19 = (i10 & 2) != 0 ? kVar.f4317b : z11;
        boolean z20 = (i10 & 4) != 0 ? kVar.f4318c : z12;
        boolean z21 = (i10 & 8) != 0 ? kVar.f4319d : z13;
        boolean z22 = (i10 & 16) != 0 ? kVar.f4320e : z14;
        boolean z23 = (i10 & 32) != 0 ? kVar.f4321f : z15;
        boolean z24 = (i10 & 64) != 0 ? kVar.f4322g : z16;
        boolean z25 = (i10 & 128) != 0 ? kVar.f4323h : z17;
        kVar.getClass();
        return new k(z18, z19, z20, z21, z22, z23, z24, z25);
    }

    public final boolean component1() {
        return this.f4316a;
    }

    public final boolean component2() {
        return this.f4317b;
    }

    public final boolean component3() {
        return this.f4318c;
    }

    public final boolean component4() {
        return this.f4319d;
    }

    public final boolean component5() {
        return this.f4320e;
    }

    public final boolean component6() {
        return this.f4321f;
    }

    public final boolean component7() {
        return this.f4322g;
    }

    public final boolean component8() {
        return this.f4323h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return this.f4316a == kVar.f4316a && this.f4317b == kVar.f4317b && this.f4318c == kVar.f4318c && this.f4319d == kVar.f4319d && this.f4320e == kVar.f4320e && this.f4321f == kVar.f4321f && this.f4322g == kVar.f4322g && this.f4323h == kVar.f4323h;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public final int hashCode() {
        boolean z10 = this.f4316a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f4317b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f4318c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        ?? r24 = this.f4319d;
        int i15 = r24;
        if (r24 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        ?? r25 = this.f4320e;
        int i17 = r25;
        if (r25 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        ?? r26 = this.f4321f;
        int i19 = r26;
        if (r26 != 0) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        ?? r27 = this.f4322g;
        int i21 = r27;
        if (r27 != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        boolean z11 = this.f4323h;
        return i22 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CollectionCodeSupport(qq=");
        a10.append(this.f4316a);
        a10.append(", wechat=");
        a10.append(this.f4317b);
        a10.append(", alipay=");
        a10.append(this.f4318c);
        a10.append(", paypal=");
        a10.append(this.f4319d);
        a10.append(", paytm=");
        a10.append(this.f4320e);
        a10.append(", phonePe=");
        a10.append(this.f4321f);
        a10.append(", gpay=");
        a10.append(this.f4322g);
        a10.append(", bhim=");
        return l2.o0.a(a10, this.f4323h, ')');
    }
}
