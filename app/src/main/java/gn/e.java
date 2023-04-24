package gn;

import ln.h;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a */
    public static final ln.h f15545a;

    /* renamed from: b */
    public static final String[] f15546b;

    /* renamed from: c */
    public static final String[] f15547c;

    /* renamed from: d */
    public static final String[] f15548d;

    /* renamed from: e */
    public static final e f15549e = new e();

    static {
        ln.h hVar = ln.h.f20100d;
        f15545a = h.a.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f15546b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f15547c = new String[64];
        String[] strArr = new String[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            gm.l.e(binaryString, "Integer.toBinaryString(it)");
            String replace = an.c.g("%8s", binaryString).replace(' ', '0');
            gm.l.e(replace, "this as java.lang.String…replace(oldChar, newChar)");
            strArr[i10] = replace;
        }
        f15548d = strArr;
        String[] strArr2 = f15547c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i11 = 0; i11 < 1; i11++) {
            int i12 = iArr[i11];
            String[] strArr3 = f15547c;
            strArr3[i12 | 8] = gm.l.k("|PADDED", strArr3[i12]);
        }
        String[] strArr4 = f15547c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            for (int i15 = 0; i15 < 1; i15++) {
                int i16 = iArr[i15];
                String[] strArr5 = f15547c;
                int i17 = i16 | i14;
                strArr5[i17] = strArr5[i16] + "|" + strArr5[i14];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr5[i16]);
                sb2.append("|");
                strArr5[i17 | 8] = androidx.activity.e.b(sb2, strArr5[i14], "|PADDED");
            }
        }
        int length = f15547c.length;
        for (int i18 = 0; i18 < length; i18++) {
            String[] strArr6 = f15547c;
            if (strArr6[i18] == null) {
                strArr6[i18] = f15548d[i18];
            }
        }
    }

    public static String a(int i10, int i11, int i12, int i13, boolean z10) {
        String g10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String[] strArr = f15546b;
        if (i12 < strArr.length) {
            g10 = strArr[i12];
        } else {
            g10 = an.c.g("0x%02x", Integer.valueOf(i12));
        }
        if (i13 == 0) {
            str = "";
        } else {
            if (i12 != 2 && i12 != 3) {
                if (i12 != 4 && i12 != 6) {
                    if (i12 != 7 && i12 != 8) {
                        String[] strArr2 = f15547c;
                        if (i13 < strArr2.length) {
                            str2 = strArr2[i13];
                            gm.l.c(str2);
                        } else {
                            str2 = f15548d[i13];
                        }
                        if (i12 == 5 && (i13 & 4) != 0) {
                            str3 = "HEADERS";
                            str4 = "PUSH_PROMISE";
                        } else if (i12 == 0 && (i13 & 32) != 0) {
                            str3 = "PRIORITY";
                            str4 = "COMPRESSED";
                        } else {
                            str = str2;
                        }
                        str = om.h.Y(str2, str3, str4);
                    }
                } else if (i13 == 1) {
                    str = "ACK";
                } else {
                    str = f15548d[i13];
                }
            }
            str = f15548d[i13];
        }
        if (z10) {
            str5 = "<<";
        } else {
            str5 = ">>";
        }
        return an.c.g("%s 0x%08x %5d %-13s %s", str5, Integer.valueOf(i10), Integer.valueOf(i11), g10, str);
    }
}
