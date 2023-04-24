package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
public final class Zb implements InterfaceC0660ec {
    private static char a(char c10, char c11) {
        if (C0672hc.b(c10) && C0672hc.b(c11)) {
            return (char) ((c11 - '0') + ((c10 - '0') * 10) + 130);
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("not digits: ");
            sb2.append(c10);
            sb2.append(c11);
            throw new IllegalArgumentException(sb2.toString());
        } catch (Exception e10) {
            throw e10;
        }
    }

    public int a() {
        return 0;
    }

    @Override // com.huawei.hms.scankit.p.InterfaceC0660ec
    public void a(C0664fc c0664fc) {
        int i10;
        char c10;
        if (C0672hc.a(c0664fc.d(), c0664fc.f7895f) >= 2) {
            c0664fc.a(a(c0664fc.d().charAt(c0664fc.f7895f), c0664fc.d().charAt(c0664fc.f7895f + 1)));
            i10 = c0664fc.f7895f + 2;
        } else {
            char c11 = c0664fc.c();
            int a10 = C0672hc.a(c0664fc.d(), c0664fc.f7895f, a());
            if (a10 != a()) {
                if (a10 == 1) {
                    c0664fc.a((char) 230);
                    c0664fc.b(1);
                    return;
                } else if (a10 == 2) {
                    c0664fc.a((char) 239);
                    c0664fc.b(2);
                    return;
                } else {
                    int i11 = 3;
                    if (a10 != 3) {
                        i11 = 4;
                        if (a10 != 4) {
                            if (a10 == 5) {
                                c0664fc.a((char) 231);
                                c0664fc.b(5);
                                return;
                            }
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Illegal mode: ");
                                sb2.append(a10);
                                throw new IllegalStateException(sb2.toString());
                            } catch (Exception e10) {
                                throw e10;
                            }
                        }
                        c10 = 240;
                    } else {
                        c10 = 238;
                    }
                    c0664fc.a(c10);
                    c0664fc.b(i11);
                    return;
                }
            }
            boolean c12 = C0672hc.c(c11);
            int i12 = c11;
            if (c12) {
                c0664fc.a((char) 235);
                i12 = c11 - 128;
            }
            c0664fc.a((char) (i12 + 1));
            i10 = c0664fc.f7895f + 1;
        }
        c0664fc.f7895f = i10;
    }
}
