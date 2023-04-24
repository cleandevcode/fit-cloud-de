package pm;

import android.util.Log;
import java.lang.reflect.Array;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public class g0 implements com.bumptech.glide.manager.h, db.c, za.f, ge.a {
    public static bb.b e(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        int length = bArr.length + i11;
        bb.b bVar = new bb.b(bArr[0].length + i11, length);
        int length2 = bVar.f4131d.length;
        for (int i12 = 0; i12 < length2; i12++) {
            bVar.f4131d[i12] = 0;
        }
        int i13 = (length - i10) - 1;
        int i14 = 0;
        while (i14 < bArr.length) {
            byte[] bArr2 = bArr[i14];
            for (int i15 = 0; i15 < bArr[0].length; i15++) {
                if (bArr2[i15] == 1) {
                    bVar.b(i15 + i10, i13);
                }
            }
            i14++;
            i13--;
        }
        return bVar;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static byte[][] l(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, bArr[0].length, bArr.length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    public static final String m(xl.d dVar) {
        String str;
        if (dVar instanceof um.g) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + j(dVar);
        } catch (Throwable th2) {
            str = mf.a0.f(th2);
        }
        Throwable a10 = tl.g.a(str);
        String str2 = str;
        if (a10 != null) {
            str2 = dVar.getClass().getName() + '@' + j(dVar);
        }
        return (String) str2;
    }

    public static void n(db.d dVar, StringBuilder sb2) {
        int charAt = (sb2.charAt(1) * '(') + (sb2.charAt(0) * 1600) + sb2.charAt(2) + 1;
        dVar.f12974e.append(new String(new char[]{(char) (charAt / DfuBaseService.ERROR_REMOTE_TYPE_LEGACY), (char) (charAt % DfuBaseService.ERROR_REMOTE_TYPE_LEGACY)}));
        sb2.delete(0, 3);
    }

    @Override // ge.a
    public final void a(int i10, String str, String str2) {
        switch (i10) {
            case 1:
                Log.v(str, str2);
                return;
            case 2:
                Log.d(str, str2);
                return;
            case 3:
                Log.i(str, str2);
                return;
            case 4:
                Log.w(str, str2);
                return;
            case 5:
                Log.e(str, str2);
                return;
            case 6:
                Log.wtf(str, str2);
                return;
            default:
                return;
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void b() {
    }

    public final int c(db.d dVar, StringBuilder sb2, StringBuilder sb3, int i10) {
        int length = sb2.length();
        sb2.delete(length - i10, length);
        dVar.f12975f--;
        int f10 = f(dVar.b(), sb3);
        dVar.f12977h = null;
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:482:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0427 A[LOOP:14: B:519:0x0425->B:520:0x0427, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x04cd  */
    @Override // za.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final bb.b d(java.lang.String r23, za.a r24, java.util.EnumMap r25) {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.g0.d(java.lang.String, za.a, java.util.EnumMap):bb.b");
    }

    public int f(char c10, StringBuilder sb2) {
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
                                return f((char) (c10 - 128), sb2) + 2;
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

    public void g(float f10, float f11, ga.l lVar) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0050, code lost:
        if (r2 != 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0052, code lost:
        if (r1 > 3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0050 -> B:52:0x0054). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0052 -> B:52:0x0054). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(db.d r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            boolean r1 = r9.c()
            if (r1 == 0) goto L75
            char r1 = r9.b()
            int r2 = r9.f12975f
            r3 = 1
            int r2 = r2 + r3
            r9.f12975f = r2
            int r1 = r8.f(r1, r0)
            int r2 = r0.length()
            r4 = 3
            int r2 = r2 / r4
            int r2 = r2 << r3
            int r5 = r9.a()
            int r5 = r5 + r2
            r9.d(r5)
            db.f r2 = r9.f12977h
            int r2 = r2.f12985b
            int r2 = r2 - r5
            boolean r5 = r9.c()
            if (r5 != 0) goto L59
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r0.length()
            int r6 = r6 % r4
            r7 = 2
            if (r6 != r7) goto L46
            if (r2 < r7) goto L44
            if (r2 <= r7) goto L46
        L44:
            r6 = r8
            goto L54
        L46:
            r6 = r8
        L47:
            int r7 = r0.length()
            int r7 = r7 % r4
            if (r7 != r3) goto L76
            if (r1 > r4) goto L52
            if (r2 != r3) goto L54
        L52:
            if (r1 <= r4) goto L76
        L54:
            int r1 = r6.c(r9, r0, r5, r1)
            goto L47
        L59:
            int r1 = r0.length()
            int r1 = r1 % r4
            if (r1 != 0) goto L5
            java.lang.String r1 = r9.f12970a
            int r2 = r9.f12975f
            int r3 = r8.i()
            int r1 = rm.l.o(r1, r2, r3)
            int r2 = r8.i()
            if (r1 == r2) goto L5
            r1 = 0
            r9.f12976g = r1
        L75:
            r6 = r8
        L76:
            r6.k(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.g0.h(db.d):void");
    }

    public int i() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0031, code lost:
        if (r8.c() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0063, code lost:
        if (r8.c() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(db.d r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 1
            int r0 = r0 << r2
            int r3 = r9.length()
            int r3 = r3 % r1
            int r4 = r8.a()
            int r4 = r4 + r0
            r8.d(r4)
            db.f r0 = r8.f12977h
            int r0 = r0.f12985b
            int r0 = r0 - r4
            r4 = 2
            r5 = 0
            r6 = 254(0xfe, float:3.56E-43)
            if (r3 != r4) goto L34
            r9.append(r5)
        L23:
            int r0 = r9.length()
            if (r0 < r1) goto L2d
            n(r8, r9)
            goto L23
        L2d:
            boolean r9 = r8.c()
            if (r9 == 0) goto L68
            goto L65
        L34:
            if (r0 != r2) goto L51
            if (r3 != r2) goto L51
        L38:
            int r0 = r9.length()
            if (r0 < r1) goto L42
            n(r8, r9)
            goto L38
        L42:
            boolean r9 = r8.c()
            if (r9 == 0) goto L4b
            r8.e(r6)
        L4b:
            int r9 = r8.f12975f
            int r9 = r9 - r2
            r8.f12975f = r9
            goto L68
        L51:
            if (r3 != 0) goto L6b
        L53:
            int r2 = r9.length()
            if (r2 < r1) goto L5d
            n(r8, r9)
            goto L53
        L5d:
            if (r0 > 0) goto L65
            boolean r9 = r8.c()
            if (r9 == 0) goto L68
        L65:
            r8.e(r6)
        L68:
            r8.f12976g = r5
            return
        L6b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unexpected case. Please report!"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.g0.k(db.d, java.lang.StringBuilder):void");
    }
}
