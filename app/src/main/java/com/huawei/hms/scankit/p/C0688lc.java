package com.huawei.hms.scankit.p;

/* renamed from: com.huawei.hms.scankit.p.lc */
/* loaded from: classes.dex */
public final class C0688lc extends C0644ac {
    @Override // com.huawei.hms.scankit.p.C0644ac
    public int a() {
        return 3;
    }

    @Override // com.huawei.hms.scankit.p.C0644ac
    public int a(char c10, StringBuilder sb2) {
        char c11;
        int i10;
        if (c10 == '\r') {
            c11 = 0;
        } else if (c10 == ' ') {
            c11 = 3;
        } else if (c10 == '*') {
            sb2.append((char) 1);
            return 1;
        } else if (c10 != '>') {
            if (c10 >= '0' && c10 <= '9') {
                i10 = (c10 - '0') + 4;
            } else if (c10 < 'A' || c10 > 'Z') {
                C0672hc.a(c10);
                throw null;
            } else {
                i10 = (c10 - 'A') + 14;
            }
            c11 = (char) i10;
        } else {
            c11 = 2;
        }
        sb2.append(c11);
        return 1;
    }

    @Override // com.huawei.hms.scankit.p.C0644ac, com.huawei.hms.scankit.p.InterfaceC0660ec
    public void a(C0664fc c0664fc) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!c0664fc.h()) {
                break;
            }
            char c10 = c0664fc.c();
            c0664fc.f7895f++;
            a(c10, sb2);
            if (sb2.length() % 3 == 0) {
                C0644ac.b(c0664fc, sb2);
                if (C0672hc.a(c0664fc.d(), c0664fc.f7895f, a()) != a()) {
                    c0664fc.b(0);
                    break;
                }
            }
        }
        a(c0664fc, sb2);
    }

    @Override // com.huawei.hms.scankit.p.C0644ac
    public void a(C0664fc c0664fc, StringBuilder sb2) {
        c0664fc.k();
        int a10 = c0664fc.g().a() - c0664fc.a();
        c0664fc.f7895f -= sb2.length();
        if (c0664fc.f() > 1 || a10 > 1 || c0664fc.f() != a10) {
            c0664fc.a((char) 254);
        }
        if (c0664fc.e() < 0) {
            c0664fc.b(0);
        }
    }
}
