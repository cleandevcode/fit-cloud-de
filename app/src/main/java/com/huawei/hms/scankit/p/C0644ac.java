package com.huawei.hms.scankit.p;

import no.nordicsemi.android.dfu.DfuBaseService;

/* renamed from: com.huawei.hms.scankit.p.ac */
/* loaded from: classes.dex */
public class C0644ac implements InterfaceC0660ec {
    private int a(C0664fc c0664fc, StringBuilder sb2, StringBuilder sb3, int i10) {
        int length = sb2.length();
        sb2.delete(length - i10, length);
        c0664fc.f7895f--;
        int a10 = a(c0664fc.c(), sb3);
        c0664fc.j();
        return a10;
    }

    private static String a(CharSequence charSequence, int i10) {
        int charAt = (charSequence.charAt(i10 + 1) * '(') + (charSequence.charAt(i10) * 1600) + charSequence.charAt(i10 + 2) + 1;
        return new String(new char[]{(char) (charAt / DfuBaseService.ERROR_REMOTE_TYPE_LEGACY), (char) (charAt % DfuBaseService.ERROR_REMOTE_TYPE_LEGACY)});
    }

    public static void b(C0664fc c0664fc, StringBuilder sb2) {
        c0664fc.a(a(sb2, 0));
        sb2.delete(0, 3);
    }

    public int a() {
        return 1;
    }

    public int a(char c10, StringBuilder sb2) {
        int i10;
        int i11;
        char c11;
        if (c10 == ' ') {
            c11 = 3;
        } else {
            if (c10 >= '0' && c10 <= '9') {
                i11 = (c10 - '0') + 4;
            } else if (c10 < 'A' || c10 > 'Z') {
                if (c10 < ' ') {
                    sb2.append((char) 0);
                } else {
                    char c12 = '!';
                    if (c10 < '!' || c10 > '/') {
                        if (c10 >= ':' && c10 <= '@') {
                            sb2.append((char) 1);
                            i10 = (c10 - ':') + 15;
                        } else if (c10 < '[' || c10 > '_') {
                            c12 = '`';
                            if (c10 < '`' || c10 > 127) {
                                sb2.append("\u0001\u001e");
                                return a((char) (c10 - 128), sb2) + 2;
                            }
                            sb2.append((char) 2);
                        } else {
                            sb2.append((char) 1);
                            i10 = (c10 - '[') + 22;
                        }
                        c10 = (char) i10;
                    } else {
                        sb2.append((char) 1);
                    }
                    i10 = c10 - c12;
                    c10 = (char) i10;
                }
                sb2.append(c10);
                return 2;
            } else {
                i11 = (c10 - 'A') + 14;
            }
            c11 = (char) i11;
        }
        sb2.append(c11);
        return 1;
    }

    @Override // com.huawei.hms.scankit.p.InterfaceC0660ec
    public void a(C0664fc c0664fc) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!c0664fc.h()) {
                break;
            }
            char c10 = c0664fc.c();
            c0664fc.f7895f++;
            int a10 = a(c10, sb2);
            int a11 = c0664fc.a() + ((sb2.length() / 3) * 2);
            c0664fc.c(a11);
            int a12 = c0664fc.g().a() - a11;
            if (!c0664fc.h()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (a12 < 2 || a12 > 2)) {
                    a10 = a(c0664fc, sb2, sb3, a10);
                }
                while (sb2.length() % 3 == 1) {
                    if (a10 <= 3 && a12 != 1) {
                        a10 = a(c0664fc, sb2, sb3, a10);
                    } else if (a10 <= 3) {
                        break;
                    } else {
                        a10 = a(c0664fc, sb2, sb3, a10);
                    }
                }
            } else if (sb2.length() % 3 == 0 && C0672hc.a(c0664fc.d(), c0664fc.f7895f, a()) != a()) {
                c0664fc.b(0);
                break;
            }
        }
        a(c0664fc, sb2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0035, code lost:
        if (r7.h() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006b, code lost:
        if (r7.h() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.huawei.hms.scankit.p.C0664fc r7, java.lang.StringBuilder r8) {
        /*
            r6 = this;
            int r0 = r8.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 2
            int r0 = r0 * 2
            int r3 = r8.length()
            int r3 = r3 % r1
            int r4 = r7.a()
            int r4 = r4 + r0
            r7.c(r4)
            com.huawei.hms.scankit.p.ic r0 = r7.g()
            int r0 = r0.a()
            int r0 = r0 - r4
            r4 = 0
            r5 = 254(0xfe, float:3.56E-43)
            if (r3 != r2) goto L3b
            r8.append(r4)
        L27:
            int r0 = r8.length()
            if (r0 < r1) goto L31
            b(r7, r8)
            goto L27
        L31:
            boolean r8 = r7.h()
            if (r8 == 0) goto L7d
        L37:
            r7.a(r5)
            goto L7d
        L3b:
            r2 = 1
            if (r0 != r2) goto L59
            if (r3 != r2) goto L59
        L40:
            int r0 = r8.length()
            if (r0 < r1) goto L4a
            b(r7, r8)
            goto L40
        L4a:
            boolean r8 = r7.h()
            if (r8 == 0) goto L53
            r7.a(r5)
        L53:
            int r8 = r7.f7895f
            int r8 = r8 - r2
            r7.f7895f = r8
            goto L7d
        L59:
            if (r3 != 0) goto L6e
        L5b:
            int r2 = r8.length()
            if (r2 < r1) goto L65
            b(r7, r8)
            goto L5b
        L65:
            if (r0 > 0) goto L37
            boolean r8 = r7.h()
            if (r8 == 0) goto L7d
            goto L37
        L6e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L76
            java.lang.String r0 = "Unexpected case. Please report!"
            r8.<init>(r0)     // Catch: java.lang.Exception -> L76
            throw r8     // Catch: java.lang.Exception -> L76
        L76:
            java.lang.String r8 = "exception"
            java.lang.String r0 = "Exception"
            com.huawei.hms.scankit.util.a.b(r8, r0)
        L7d:
            r7.b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.C0644ac.a(com.huawei.hms.scankit.p.fc, java.lang.StringBuilder):void");
    }
}
