package com.huawei.hms.scankit.p;

/* renamed from: com.huawei.hms.scankit.p.ia */
/* loaded from: classes.dex */
final class C0674ia {

    /* renamed from: a */
    private final int f7923a;

    /* renamed from: b */
    private final int f7924b;

    /* renamed from: c */
    private final int f7925c;

    /* renamed from: d */
    private final int f7926d;

    /* renamed from: e */
    private int f7927e = -1;

    public C0674ia(int i10, int i11, int i12, int i13) {
        this.f7923a = i10;
        this.f7924b = i11;
        this.f7925c = i12;
        this.f7926d = i13;
    }

    public int a() {
        return this.f7925c;
    }

    public boolean a(int i10) {
        return i10 != -1 && this.f7925c == (i10 % 3) * 3;
    }

    public int b() {
        return this.f7924b;
    }

    public void b(int i10) {
        this.f7927e = i10;
    }

    public int c() {
        return this.f7927e;
    }

    public int d() {
        return this.f7923a;
    }

    public int e() {
        return this.f7926d;
    }

    public int f() {
        return this.f7924b - this.f7923a;
    }

    public boolean g() {
        return a(this.f7927e);
    }

    public void h() {
        this.f7927e = (this.f7925c / 3) + ((this.f7926d / 30) * 3);
    }

    public String toString() {
        return this.f7927e + "|" + this.f7926d;
    }
}
