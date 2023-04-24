package hb;

import androidx.activity.i;
import za.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final int[][] f16077a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    public static final int[][] f16078b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    public static final int[][] f16079c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    public static final int[][] f16080d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARN: Removed duplicated region for block: B:262:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(bb.a r20, int r21, gb.c r22, int r23, hb.b r24) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.d.a(bb.a, int, gb.c, int, hb.b):void");
    }

    public static int b(int i10, int i11) {
        if (i11 != 0) {
            int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i11);
            int i12 = i10 << (numberOfLeadingZeros - 1);
            while (32 - Integer.numberOfLeadingZeros(i12) >= numberOfLeadingZeros) {
                i12 ^= i11 << ((32 - Integer.numberOfLeadingZeros(i12)) - numberOfLeadingZeros);
            }
            return i12;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static void c(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!f(bVar.a(i13, i11))) {
                throw new g();
            }
            bVar.b(i13, i11, 0);
        }
    }

    public static void d(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f16077a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                bVar.b(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void e(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!f(bVar.a(i10, i13))) {
                throw new g();
            }
            bVar.b(i10, i13, 0);
        }
    }

    public static boolean f(int i10) {
        return i10 == -1;
    }

    public static String g(int i10) {
        switch (i10) {
            case 514:
                return "OP CODE NOT SUPPORTED";
            case 515:
                return "INVALID PARAM";
            case 516:
                return "INSUFFICIENT RESOURCES";
            case 517:
                return "INVALID OBJECT";
            case 518:
            case 521:
            default:
                return i.a("UNKNOWN (", i10, ")");
            case 519:
                return "UNSUPPORTED TYPE";
            case 520:
                return "OPERATION NOT PERMITTED";
            case 522:
                return "OPERATION FAILED";
            case 523:
                return "EXTENDED ERROR";
        }
    }

    public static String h(int i10) {
        if (i10 != 2050) {
            if (i10 != 2052) {
                return i.a("UNKNOWN (", i10, ")");
            }
            return "OPERATION FAILED";
        }
        return "OP CODE NOT SUPPORTED";
    }

    public static String i(int i10) {
        switch (i10) {
            case 1026:
                return "Wrong command format";
            case 1027:
                return "Unknown command";
            case 1028:
                return "Init command invalid";
            case 1029:
                return "FW version failure";
            case 1030:
                return "HW version failure";
            case 1031:
                return "SD version failure";
            case 1032:
                return "Signature mismatch";
            case 1033:
                return "Wrong hash type";
            case 1034:
                return "Hash failed";
            case 1035:
                return "Wrong signature type";
            case 1036:
                return "Verification failed";
            case 1037:
                return "Insufficient space";
            default:
                return "Reserved for future use";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0110 A[LOOP:1: B:114:0x010a->B:116:0x0110, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList j(long r18, java.lang.String r20, oj.o r21, uf.c r22) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.d.j(long, java.lang.String, oj.o, uf.c):java.util.ArrayList");
    }
}
