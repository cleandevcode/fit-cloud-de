package com.huawei.hms.scankit.p;

import java.nio.charset.StandardCharsets;

/* renamed from: com.huawei.hms.scankit.p.fc */
/* loaded from: classes.dex */
final class C0664fc {

    /* renamed from: a */
    private final String f7890a;

    /* renamed from: b */
    private EnumC0680jc f7891b;

    /* renamed from: c */
    private Mb f7892c;

    /* renamed from: d */
    private Mb f7893d;

    /* renamed from: e */
    private final StringBuilder f7894e;

    /* renamed from: f */
    public int f7895f;

    /* renamed from: g */
    private int f7896g;

    /* renamed from: h */
    private C0676ic f7897h;

    /* renamed from: i */
    private int f7898i;

    public C0664fc(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 == '?' && str.charAt(i10) != '?') {
                try {
                    throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
                } catch (Exception e10) {
                    throw e10;
                }
            }
            sb2.append(c10);
        }
        this.f7890a = sb2.toString();
        this.f7891b = EnumC0680jc.FORCE_NONE;
        this.f7894e = new StringBuilder(str.length());
        this.f7896g = -1;
    }

    private int l() {
        return this.f7890a.length() - this.f7898i;
    }

    public int a() {
        return this.f7894e.length();
    }

    public void a(char c10) {
        this.f7894e.append(c10);
    }

    public void a(int i10) {
        this.f7898i = i10;
    }

    public void a(Mb mb2, Mb mb3) {
        this.f7892c = mb2;
        this.f7893d = mb3;
    }

    public void a(EnumC0680jc enumC0680jc) {
        this.f7891b = enumC0680jc;
    }

    public void a(String str) {
        this.f7894e.append(str);
    }

    public StringBuilder b() {
        return this.f7894e;
    }

    public void b(int i10) {
        this.f7896g = i10;
    }

    public char c() {
        return this.f7890a.charAt(this.f7895f);
    }

    public void c(int i10) {
        C0676ic c0676ic = this.f7897h;
        if (c0676ic == null || i10 > c0676ic.a()) {
            this.f7897h = C0676ic.a(i10, this.f7891b, this.f7892c, this.f7893d, true);
        }
    }

    public String d() {
        return this.f7890a;
    }

    public int e() {
        return this.f7896g;
    }

    public int f() {
        return l() - this.f7895f;
    }

    public C0676ic g() {
        return this.f7897h;
    }

    public boolean h() {
        return this.f7895f < l();
    }

    public void i() {
        this.f7896g = -1;
    }

    public void j() {
        this.f7897h = null;
    }

    public void k() {
        c(a());
    }
}
