package com.huawei.hms.scankit.p;

import java.util.Formatter;

/* renamed from: com.huawei.hms.scankit.p.ma */
/* loaded from: classes.dex */
class C0690ma {

    /* renamed from: a */
    private final C0670ha f7995a;

    /* renamed from: b */
    private final C0674ia[] f7996b;

    public C0690ma(C0670ha c0670ha) {
        this.f7995a = new C0670ha(c0670ha);
        this.f7996b = new C0674ia[(c0670ha.d() - c0670ha.f()) + 1];
    }

    public final C0670ha a() {
        return this.f7995a;
    }

    public final C0674ia a(int i10) {
        return this.f7996b[c(i10)];
    }

    public final void a(int i10, C0674ia c0674ia) {
        this.f7996b[c(i10)] = c0674ia;
    }

    public final C0674ia b(int i10) {
        C0674ia c0674ia;
        C0674ia c0674ia2;
        C0674ia a10 = a(i10);
        if (a10 != null) {
            return a10;
        }
        for (int i11 = 1; i11 < 5; i11++) {
            int c10 = c(i10) - i11;
            if (c10 >= 0 && (c0674ia2 = this.f7996b[c10]) != null) {
                return c0674ia2;
            }
            int c11 = c(i10) + i11;
            C0674ia[] c0674iaArr = this.f7996b;
            if (c11 < c0674iaArr.length && (c0674ia = c0674iaArr[c11]) != null) {
                return c0674ia;
            }
        }
        return null;
    }

    public final C0674ia[] b() {
        return this.f7996b;
    }

    public final int c(int i10) {
        return i10 - this.f7995a.f();
    }

    public String toString() {
        C0674ia[] c0674iaArr;
        Formatter formatter = new Formatter();
        try {
            int i10 = 0;
            for (C0674ia c0674ia : this.f7996b) {
                if (c0674ia == null) {
                    int i11 = i10 + 1;
                    formatter.format("%3d:    |   %n", Integer.valueOf(i10));
                    i10 = i11;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i10), Integer.valueOf(c0674ia.c()), Integer.valueOf(c0674ia.e()));
                    i10++;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    formatter.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }
}
