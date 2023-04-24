package okhttp3.internal.publicsuffix;

import an.c;
import gm.l;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.Metadata;
import ln.n;
import ln.o;
import ln.s;
import ln.z;
import mf.a0;
import ul.q;

@Metadata
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f23615e;

    /* renamed from: f */
    public static final List<String> f23616f;

    /* renamed from: g */
    public static final PublicSuffixDatabase f23617g;

    /* renamed from: a */
    public final AtomicBoolean f23618a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f23619b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f23620c;

    /* renamed from: d */
    public byte[] f23621d;

    /* loaded from: classes2.dex */
    public static final class a {
        public static final String a(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int i12;
            int i13;
            byte[] bArr3 = PublicSuffixDatabase.f23615e;
            int length = bArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = (i14 + length) / 2;
                while (i15 > -1 && bArr[i15] != ((byte) 10)) {
                    i15--;
                }
                int i16 = i15 + 1;
                int i17 = 1;
                while (true) {
                    i11 = i16 + i17;
                    if (bArr[i11] == ((byte) 10)) {
                        break;
                    }
                    i17++;
                }
                int i18 = i11 - i16;
                int i19 = i10;
                boolean z11 = false;
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    if (z11) {
                        i12 = 46;
                        z10 = false;
                    } else {
                        byte b10 = bArr2[i19][i20];
                        byte[] bArr4 = c.f635a;
                        int i22 = b10 & 255;
                        z10 = z11;
                        i12 = i22;
                    }
                    byte b11 = bArr[i16 + i21];
                    byte[] bArr5 = c.f635a;
                    i13 = i12 - (b11 & 255);
                    if (i13 != 0) {
                        break;
                    }
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    } else if (bArr2[i19].length == i20) {
                        if (i19 == bArr2.length - 1) {
                            break;
                        }
                        i19++;
                        z11 = true;
                        i20 = -1;
                    } else {
                        z11 = z10;
                    }
                }
                if (i13 >= 0) {
                    if (i13 <= 0) {
                        int i23 = i18 - i21;
                        int length2 = bArr2[i19].length - i20;
                        int length3 = bArr2.length;
                        for (int i24 = i19 + 1; i24 < length3; i24++) {
                            length2 += bArr2[i24].length;
                        }
                        if (length2 >= i23) {
                            if (length2 <= i23) {
                                Charset charset = StandardCharsets.UTF_8;
                                l.e(charset, "UTF_8");
                                return new String(bArr, i16, i18, charset);
                            }
                        }
                    }
                    i14 = i11 + 1;
                }
                length = i16 - 1;
            }
            return null;
        }
    }

    static {
        new a();
        f23615e = new byte[]{(byte) 42};
        f23616f = h7.a.p("*");
        f23617g = new PublicSuffixDatabase();
    }

    public static List c(String str) {
        List r02 = om.l.r0(str, new char[]{'.'});
        if (l.a((String) q.N(r02), "")) {
            int size = r02.size() - 1;
            return q.V(r02, size >= 0 ? size : 0);
        }
        return r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0023, code lost:
        if (r1 != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0039, code lost:
        if (r1 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x003b, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x00af, code lost:
        if (r1 <= 1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x00b1, code lost:
        r5 = (byte[][]) r4.clone();
        r9 = r5.length - 1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x00ba, code lost:
        if (r10 >= r9) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x00bc, code lost:
        r5[r10] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f23615e;
        r11 = r12.f23620c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x00c2, code lost:
        if (r11 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x00c4, code lost:
        r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r11, r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x00c8, code lost:
        if (r11 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00cb, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00ce, code lost:
        gm.l.l("publicSuffixListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00d1, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00d2, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00d3, code lost:
        if (r11 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00d5, code lost:
        r1 = r1 - 1;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00d7, code lost:
        if (r5 >= r1) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00d9, code lost:
        r6 = r12.f23621d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00db, code lost:
        if (r6 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00dd, code lost:
        r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r6, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x00e1, code lost:
        if (r6 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x00e4, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00e7, code lost:
        gm.l.l("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x00ec, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x00ed, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x00f2, code lost:
        if (r6 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x00f4, code lost:
        r1 = om.l.r0('!' + r6, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x010c, code lost:
        if (r8 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x010e, code lost:
        if (r11 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0110, code lost:
        r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f23616f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0113, code lost:
        if (r8 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0115, code lost:
        r5 = om.l.r0(r8, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x011e, code lost:
        r5 = ul.s.f28879a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0120, code lost:
        if (r11 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0122, code lost:
        r1 = om.l.r0(r11, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x012b, code lost:
        r1 = ul.s.f28879a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0135, code lost:
        if (r5.size() <= r1.size()) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0137, code lost:
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0140, code lost:
        if (r0.size() != r1.size()) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x014c, code lost:
        if (r1.get(0).charAt(0) == '!') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x014e, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x014f, code lost:
        r5 = r1.get(0).charAt(0);
        r0 = r0.size();
        r1 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0161, code lost:
        if (r5 != '!') goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0164, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0166, code lost:
        r0 = r0 - r1;
        r1 = new ul.p(c(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0170, code lost:
        if (r0 < 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0172, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0174, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0175, code lost:
        if (r13 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0177, code lost:
        if (r0 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x017c, code lost:
        if ((r1 instanceof nm.c) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x017e, code lost:
        r1 = ((nm.c) r1).a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0185, code lost:
        r1 = new nm.b(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x018b, code lost:
        gm.l.f(r1, "<this>");
        r0 = new java.lang.StringBuilder();
        r0.append((java.lang.CharSequence) "");
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01a2, code lost:
        if (r1.hasNext() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01a4, code lost:
        r4 = r1.next();
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01a9, code lost:
        if (r2 <= 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01ab, code lost:
        r0.append((java.lang.CharSequence) ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01b0, code lost:
        bi.r.e(r0, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01b4, code lost:
        r0.append((java.lang.CharSequence) "");
        r13 = r0.toString();
        gm.l.e(r13, "joinTo(StringBuilder(), …ed, transform).toString()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01c0, code lost:
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01d2, code lost:
        throw new java.lang.IllegalArgumentException(androidx.activity.i.a("Requested element count ", r0, " is less than zero.").toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            Logger logger = o.f20118a;
            s sVar = new s(new ln.l(new n(resourceAsStream, new z())));
            try {
                long readInt = sVar.readInt();
                sVar.B0(readInt);
                byte[] F = sVar.f20127a.F(readInt);
                long readInt2 = sVar.readInt();
                sVar.B0(readInt2);
                byte[] F2 = sVar.f20127a.F(readInt2);
                tl.l lVar = tl.l.f28297a;
                a0.d(sVar, null);
                synchronized (this) {
                    this.f23620c = F;
                    this.f23621d = F2;
                }
                this.f23619b.countDown();
            } finally {
            }
        }
    }
}
