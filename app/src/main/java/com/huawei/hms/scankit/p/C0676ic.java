package com.huawei.hms.scankit.p;

/* renamed from: com.huawei.hms.scankit.p.ic */
/* loaded from: classes.dex */
public class C0676ic {

    /* renamed from: a */
    public static final C0676ic[] f7957a;

    /* renamed from: b */
    private static C0676ic[] f7958b;

    /* renamed from: c */
    private final boolean f7959c;

    /* renamed from: d */
    private final int f7960d;

    /* renamed from: e */
    private final int f7961e;

    /* renamed from: f */
    public final int f7962f;

    /* renamed from: g */
    public final int f7963g;

    /* renamed from: h */
    private final int f7964h;

    /* renamed from: i */
    private final int f7965i;

    /* renamed from: j */
    private final int f7966j;

    static {
        C0676ic[] c0676icArr = {new C0676ic(false, 3, 5, 8, 8, 1), new C0676ic(false, 5, 7, 10, 10, 1), new C0676ic(true, 5, 7, 16, 6, 1), new C0676ic(false, 8, 10, 12, 12, 1), new C0676ic(true, 10, 11, 14, 6, 2), new C0676ic(false, 12, 12, 14, 14, 1), new C0676ic(true, 16, 14, 24, 10, 1), new C0676ic(false, 18, 14, 16, 16, 1), new C0676ic(false, 22, 18, 18, 18, 1), new C0676ic(true, 22, 18, 16, 10, 2), new C0676ic(false, 30, 20, 20, 20, 1), new C0676ic(true, 32, 24, 16, 14, 2), new C0676ic(false, 36, 24, 22, 22, 1), new C0676ic(false, 44, 28, 24, 24, 1), new C0676ic(true, 49, 28, 22, 14, 2), new C0676ic(false, 62, 36, 14, 14, 4), new C0676ic(false, 86, 42, 16, 16, 4), new C0676ic(false, 114, 48, 18, 18, 4), new C0676ic(false, 144, 56, 20, 20, 4), new C0676ic(false, 174, 68, 22, 22, 4), new C0676ic(false, 204, 84, 24, 24, 4, 102, 42), new C0676ic(false, 280, 112, 14, 14, 16, 140, 56), new C0676ic(false, 368, 144, 16, 16, 16, 92, 36), new C0676ic(false, 456, 192, 18, 18, 16, 114, 48), new C0676ic(false, 576, 224, 20, 20, 16, 144, 56), new C0676ic(false, 696, 272, 22, 22, 16, 174, 68), new C0676ic(false, 816, 336, 24, 24, 16, 136, 56), new C0676ic(false, 1050, 408, 18, 18, 36, 175, 68), new C0676ic(false, 1304, 496, 20, 20, 36, 163, 62), new C0648bc()};
        f7957a = c0676icArr;
        f7958b = c0676icArr;
    }

    public C0676ic(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(z10, i10, i11, i12, i13, i14, i10, i11);
    }

    public C0676ic(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f7959c = z10;
        this.f7960d = i10;
        this.f7961e = i11;
        this.f7962f = i12;
        this.f7963g = i13;
        this.f7964h = i14;
        this.f7965i = i15;
        this.f7966j = i16;
    }

    public static C0676ic a(int i10, EnumC0680jc enumC0680jc, Mb mb2, Mb mb3, boolean z10) {
        C0676ic[] c0676icArr;
        for (C0676ic c0676ic : f7958b) {
            if (!(enumC0680jc == EnumC0680jc.FORCE_SQUARE && c0676ic.f7959c) && ((enumC0680jc != EnumC0680jc.FORCE_RECTANGLE || c0676ic.f7959c) && ((mb2 == null || (c0676ic.g() >= mb2.b() && c0676ic.f() >= mb2.a())) && ((mb3 == null || (c0676ic.g() <= mb3.b() && c0676ic.f() <= mb3.a())) && i10 <= c0676ic.f7960d)))) {
                return c0676ic;
            }
        }
        if (z10) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't find a symbol arrangement that matches the message. Data codewords: ");
                sb2.append(i10);
                throw new IllegalArgumentException(sb2.toString());
            } catch (Exception e10) {
                throw e10;
            }
        }
        return null;
    }

    private int h() {
        int i10 = this.f7964h;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 4) {
                if (i10 != 16) {
                    if (i10 == 36) {
                        return 6;
                    }
                    try {
                        throw new IllegalStateException("Cannot handle this number of data regions");
                    } catch (Exception e10) {
                        throw e10;
                    }
                }
                return 4;
            }
        }
        return i11;
    }

    private int i() {
        int i10 = this.f7964h;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 != 4) {
            if (i10 != 16) {
                if (i10 == 36) {
                    return 6;
                }
                try {
                    throw new IllegalStateException("Cannot handle this number of data regions");
                } catch (Exception e10) {
                    throw e10;
                }
            }
            return 4;
        }
        return 2;
    }

    public final int a() {
        return this.f7960d;
    }

    public int a(int i10) {
        return this.f7965i;
    }

    public final int b() {
        return this.f7961e;
    }

    public final int b(int i10) {
        return this.f7966j;
    }

    public int c() {
        return this.f7960d / this.f7965i;
    }

    public final int d() {
        return i() * this.f7963g;
    }

    public final int e() {
        return h() * this.f7962f;
    }

    public final int f() {
        return (i() * 2) + d();
    }

    public final int g() {
        return (h() * 2) + e();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7959c ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.f7962f);
        sb2.append('x');
        sb2.append(this.f7963g);
        sb2.append(", symbol size ");
        sb2.append(g());
        sb2.append('x');
        sb2.append(f());
        sb2.append(", symbol data size ");
        sb2.append(e());
        sb2.append('x');
        sb2.append(d());
        sb2.append(", codewords ");
        sb2.append(this.f7960d);
        sb2.append('+');
        sb2.append(this.f7961e);
        return sb2.toString();
    }
}
