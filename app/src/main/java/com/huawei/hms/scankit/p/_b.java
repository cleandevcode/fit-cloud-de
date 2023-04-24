package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
public final class _b implements InterfaceC0660ec {
    private static char a(char c10, int i10) {
        int i11 = ((i10 * 149) % 255) + 1 + c10;
        return i11 <= 255 ? (char) i11 : (char) (i11 - 256);
    }

    public int a() {
        return 5;
    }

    @Override // com.huawei.hms.scankit.p.InterfaceC0660ec
    public void a(C0664fc c0664fc) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            if (!c0664fc.h()) {
                break;
            }
            sb2.append(c0664fc.c());
            c0664fc.f7895f++;
            if (C0672hc.a(c0664fc.d(), c0664fc.f7895f, a()) != a()) {
                c0664fc.b(0);
                break;
            }
        }
        int length = sb2.length() - 1;
        int a10 = c0664fc.a() + length + 1;
        c0664fc.c(a10);
        boolean z10 = c0664fc.g().a() - a10 > 0;
        if (c0664fc.h() || z10) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else if (length > 1555) {
                try {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Message length not in valid ranges: ");
                    sb3.append(length);
                    throw new IllegalStateException(sb3.toString());
                } catch (Exception e10) {
                    throw e10;
                }
            } else {
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb2.length();
        for (int i10 = 0; i10 < length2; i10++) {
            c0664fc.a(a(sb2.charAt(i10), c0664fc.a() + 1));
        }
    }
}
