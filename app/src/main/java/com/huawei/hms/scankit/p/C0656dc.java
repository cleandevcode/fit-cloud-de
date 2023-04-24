package com.huawei.hms.scankit.p;

/* renamed from: com.huawei.hms.scankit.p.dc */
/* loaded from: classes.dex */
public final class C0656dc implements InterfaceC0660ec {
    private static String a(CharSequence charSequence, int i10) {
        int length = charSequence.length() - i10;
        if (length == 0) {
            try {
                throw new IllegalStateException("StringBuilder must not be empty");
            } catch (Exception e10) {
                throw e10;
            }
        }
        int charAt = (charSequence.charAt(i10) << 18) + ((length >= 2 ? charSequence.charAt(i10 + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i10 + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i10 + 3) : (char) 0);
        char c10 = (char) ((charAt >> 8) & 255);
        char c11 = (char) (charAt & 255);
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append((char) ((charAt >> 16) & 255));
        if (length >= 2) {
            sb2.append(c10);
        }
        if (length >= 3) {
            sb2.append(c11);
        }
        return sb2.toString();
    }

    private static void a(char c10, StringBuilder sb2) {
        if (c10 < ' ' || c10 > '?') {
            if (c10 < '@' || c10 > '^') {
                C0672hc.a(c10);
                throw null;
            }
            c10 = (char) (c10 - '@');
        }
        sb2.append(c10);
    }

    private static void a(C0664fc c0664fc, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z10 = true;
            if (length == 1) {
                c0664fc.k();
                int a10 = c0664fc.g().a() - c0664fc.a();
                int f10 = c0664fc.f();
                if (f10 > a10) {
                    c0664fc.c(c0664fc.a() + 1);
                    a10 = c0664fc.g().a() - c0664fc.a();
                }
                if (f10 <= a10 && a10 <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i10 = length - 1;
            String a11 = a(charSequence, 0);
            if (!(!c0664fc.h()) || i10 > 2) {
                z10 = false;
            }
            if (i10 <= 2) {
                c0664fc.c(c0664fc.a() + i10);
                if (c0664fc.g().a() - c0664fc.a() >= 3) {
                    c0664fc.c(c0664fc.a() + a11.length());
                    z10 = false;
                }
            }
            if (z10) {
                c0664fc.j();
                c0664fc.f7895f -= i10;
            } else {
                c0664fc.a(a11);
            }
        } finally {
            c0664fc.b(0);
        }
    }

    public int a() {
        return 4;
    }

    @Override // com.huawei.hms.scankit.p.InterfaceC0660ec
    public void a(C0664fc c0664fc) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!c0664fc.h()) {
                break;
            }
            a(c0664fc.c(), sb2);
            c0664fc.f7895f++;
            if (sb2.length() >= 4) {
                c0664fc.a(a(sb2, 0));
                sb2.delete(0, 4);
                if (C0672hc.a(c0664fc.d(), c0664fc.f7895f, a()) != a()) {
                    c0664fc.b(0);
                    break;
                }
            }
        }
        sb2.append((char) 31);
        a(c0664fc, sb2);
    }
}
