package com.bumptech.glide.manager;

import android.view.View;
import k1.j2;

/* loaded from: classes.dex */
public class g implements h, db.c, za.f, j2 {
    public static String f(StringBuilder sb2) {
        int length = sb2.length() - 0;
        if (length != 0) {
            int charAt = (sb2.charAt(0) << 18) + ((length >= 2 ? sb2.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb2.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb2.charAt(3) : (char) 0);
            char c10 = (char) ((charAt >> 8) & 255);
            char c11 = (char) (charAt & 255);
            StringBuilder sb3 = new StringBuilder(3);
            sb3.append((char) ((charAt >> 16) & 255));
            if (length >= 2) {
                sb3.append(c10);
            }
            if (length >= 3) {
                sb3.append(c11);
            }
            return sb3.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    public void a(View view) {
    }

    @Override // com.bumptech.glide.manager.h
    public void b() {
    }

    public void c() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:629:0x00c0, code lost:
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:934:0x063d, code lost:
        if (r0 != false) goto L293;
     */
    /* JADX WARN: Removed duplicated region for block: B:1005:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:1032:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:609:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0154 A[LOOP:1: B:653:0x0126->B:667:0x0154, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:703:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x034e A[LOOP:3: B:775:0x034c->B:776:0x034e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:778:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:789:0x037e  */
    @Override // za.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bb.b d(java.lang.String r26, za.a r27, java.util.EnumMap r28) {
        /*
            Method dump skipped, instructions count: 2101
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.g.d(java.lang.String, za.a, java.util.EnumMap):bb.b");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00a4, code lost:
        if ((!r11.c()) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00a6, code lost:
        if (r1 > 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00a9, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00aa, code lost:
        if (r1 > 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ac, code lost:
        r11.d(r11.a() + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00be, code lost:
        if ((r11.f12977h.f12985b - r11.a()) < 3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00c0, code lost:
        r11.d(r11.a() + r0.length());
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00cd, code lost:
        if (r2 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00cf, code lost:
        r11.f12977h = null;
        r11.f12975f -= r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d7, code lost:
        r11.f12974e.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00de, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00e6, code lost:
        throw new java.lang.IllegalStateException("Count must not exceed 4");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00e8, code lost:
        r11.f12976g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00ea, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0052, code lost:
        r0.append((char) 31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0057, code lost:
        r1 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x005b, code lost:
        if (r1 != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0062, code lost:
        if (r1 != 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0064, code lost:
        r11.d(r11.a());
        r7 = r11.f12977h.f12985b - r11.a();
        r8 = (r11.f12970a.length() - r11.f12978i) - r11.f12975f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0080, code lost:
        if (r8 <= r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0082, code lost:
        r11.d(r11.a() + 1);
        r7 = r11.f12977h.f12985b - r11.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0093, code lost:
        if (r8 > r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0095, code lost:
        if (r7 > 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0098, code lost:
        if (r1 > 4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x009a, code lost:
        r1 = r1 - 1;
        r0 = f(r0);
     */
    @Override // db.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(db.d r11) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.g.h(db.d):void");
    }
}
