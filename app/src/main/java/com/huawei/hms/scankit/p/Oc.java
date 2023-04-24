package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
public final class Oc {

    /* renamed from: a */
    private Va f7628a;

    /* renamed from: b */
    private Pa f7629b;

    /* renamed from: c */
    private Ya f7630c;

    /* renamed from: d */
    private int f7631d = -1;

    /* renamed from: e */
    private Ic f7632e;

    public static boolean a(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public Ic a() {
        return this.f7632e;
    }

    public void a(Ic ic2) {
        this.f7632e = ic2;
    }

    public void a(Pa pa2) {
        this.f7629b = pa2;
    }

    public void a(Va va2) {
        this.f7628a = va2;
    }

    public void a(Ya ya2) {
        this.f7630c = ya2;
    }

    public void b(int i10) {
        this.f7631d = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f7628a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f7629b);
        sb2.append("\n version: ");
        sb2.append(this.f7630c);
        sb2.append("\n maskPattern: ");
        return a0.q.b(sb2, this.f7631d, ">>\n");
    }
}
