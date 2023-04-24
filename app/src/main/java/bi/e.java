package bi;

import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public final class e implements u6.o {

    /* renamed from: a */
    public final boolean f4273a;

    /* renamed from: b */
    public final boolean f4274b;

    /* renamed from: c */
    public final boolean f4275c;

    /* renamed from: d */
    public final boolean f4276d;

    /* renamed from: e */
    public final boolean f4277e;

    /* renamed from: f */
    public final boolean f4278f;

    /* renamed from: g */
    public final boolean f4279g;

    /* renamed from: h */
    public final boolean f4280h;

    /* renamed from: i */
    public final boolean f4281i;

    /* renamed from: j */
    public final boolean f4282j;

    /* renamed from: k */
    public final boolean f4283k;

    public e(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20) {
        this.f4273a = z10;
        this.f4274b = z11;
        this.f4275c = z12;
        this.f4276d = z13;
        this.f4277e = z14;
        this.f4278f = z15;
        this.f4279g = z16;
        this.f4280h = z17;
        this.f4281i = z18;
        this.f4282j = z19;
        this.f4283k = z20;
    }

    public static e copy$default(e eVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, int i10, Object obj) {
        boolean z21 = (i10 & 1) != 0 ? eVar.f4273a : z10;
        boolean z22 = (i10 & 2) != 0 ? eVar.f4274b : z11;
        boolean z23 = (i10 & 4) != 0 ? eVar.f4275c : z12;
        boolean z24 = (i10 & 8) != 0 ? eVar.f4276d : z13;
        boolean z25 = (i10 & 16) != 0 ? eVar.f4277e : z14;
        boolean z26 = (i10 & 32) != 0 ? eVar.f4278f : z15;
        boolean z27 = (i10 & 64) != 0 ? eVar.f4279g : z16;
        boolean z28 = (i10 & 128) != 0 ? eVar.f4280h : z17;
        boolean z29 = (i10 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? eVar.f4281i : z18;
        boolean z30 = (i10 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) != 0 ? eVar.f4282j : z19;
        boolean z31 = (i10 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? eVar.f4283k : z20;
        eVar.getClass();
        return new e(z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31);
    }

    public final boolean component1() {
        return this.f4273a;
    }

    public final boolean component10() {
        return this.f4282j;
    }

    public final boolean component11() {
        return this.f4283k;
    }

    public final boolean component2() {
        return this.f4274b;
    }

    public final boolean component3() {
        return this.f4275c;
    }

    public final boolean component4() {
        return this.f4276d;
    }

    public final boolean component5() {
        return this.f4277e;
    }

    public final boolean component6() {
        return this.f4278f;
    }

    public final boolean component7() {
        return this.f4279g;
    }

    public final boolean component8() {
        return this.f4280h;
    }

    public final boolean component9() {
        return this.f4281i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f4273a == eVar.f4273a && this.f4274b == eVar.f4274b && this.f4275c == eVar.f4275c && this.f4276d == eVar.f4276d && this.f4277e == eVar.f4277e && this.f4278f == eVar.f4278f && this.f4279g == eVar.f4279g && this.f4280h == eVar.f4280h && this.f4281i == eVar.f4281i && this.f4282j == eVar.f4282j && this.f4283k == eVar.f4283k;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public final int hashCode() {
        boolean z10 = this.f4273a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f4274b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f4275c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        ?? r24 = this.f4276d;
        int i15 = r24;
        if (r24 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        ?? r25 = this.f4277e;
        int i17 = r25;
        if (r25 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        ?? r26 = this.f4278f;
        int i19 = r26;
        if (r26 != 0) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        ?? r27 = this.f4279g;
        int i21 = r27;
        if (r27 != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        ?? r28 = this.f4280h;
        int i23 = r28;
        if (r28 != 0) {
            i23 = 1;
        }
        int i24 = (i22 + i23) * 31;
        ?? r29 = this.f4281i;
        int i25 = r29;
        if (r29 != 0) {
            i25 = 1;
        }
        int i26 = (i24 + i25) * 31;
        ?? r210 = this.f4282j;
        int i27 = r210;
        if (r210 != 0) {
            i27 = 1;
        }
        int i28 = (i26 + i27) * 31;
        boolean z11 = this.f4283k;
        return i28 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("BusinessCardSupport(wechat=");
        a10.append(this.f4273a);
        a10.append(", qq=");
        a10.append(this.f4274b);
        a10.append(", facebook=");
        a10.append(this.f4275c);
        a10.append(", whatsapp=");
        a10.append(this.f4276d);
        a10.append(", twitter=");
        a10.append(this.f4277e);
        a10.append(", instagram=");
        a10.append(this.f4278f);
        a10.append(", line=");
        a10.append(this.f4279g);
        a10.append(", skype=");
        a10.append(this.f4280h);
        a10.append(", email=");
        a10.append(this.f4281i);
        a10.append(", phone=");
        a10.append(this.f4282j);
        a10.append(", linkedin=");
        return l2.o0.a(a10, this.f4283k, ')');
    }
}
