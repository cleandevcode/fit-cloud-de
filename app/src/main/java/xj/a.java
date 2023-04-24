package xj;

import bj.b;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
public final class a {
    public static b a(int i10, int i11, boolean z10) {
        byte[] bArr = new byte[4];
        if (z10) {
            bArr[0] = (byte) ((i10 >> 8) & 255);
            bArr[1] = (byte) (i10 & 255);
        }
        if (i10 == 16) {
            bArr[2] = 1;
            bArr[3] = 1;
        } else {
            bArr[2] = 5;
            bArr[3] = (byte) i11;
        }
        return new b((byte) 5, (byte) 35, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x004f, code lost:
        if (r6 != false) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00f7 A[Catch: Exception -> 0x020a, TryCatch #1 {Exception -> 0x020a, blocks: (B:186:0x00b5, B:190:0x00bc, B:195:0x00f7, B:205:0x011c, B:207:0x0126, B:209:0x012e, B:201:0x010b, B:191:0x00cd), top: B:300:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0126 A[Catch: Exception -> 0x020a, TryCatch #1 {Exception -> 0x020a, blocks: (B:186:0x00b5, B:190:0x00bc, B:195:0x00f7, B:205:0x011c, B:207:0x0126, B:209:0x012e, B:201:0x010b, B:191:0x00cd), top: B:300:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0344  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static sj.b b(bj.b r45, sj.e r46, nj.c r47) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xj.a.b(bj.b, sj.e, nj.c):sj.b");
    }

    public static byte[] c(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        int i10 = calendar.get(2) + 1;
        int i11 = calendar.get(5);
        int i12 = calendar.get(11);
        int i13 = calendar.get(12);
        return new byte[]{(byte) (((calendar.get(1) - 2000) << 2) | (i10 >> 2)), (byte) ((i10 << 6) | (i11 << 1) | (i12 >> 4)), (byte) ((i12 << 4) | (i13 >> 2)), (byte) ((i13 << 6) | calendar.get(13))};
    }

    public static long d(byte[] bArr, int i10, GregorianCalendar gregorianCalendar) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = (bArr[i10 + 3] & 255) | ((bArr[i10 + 2] & 255) << 8);
        gregorianCalendar.set(1, ((i11 & 126) >> 1) + 2000);
        gregorianCalendar.set(2, (((i11 & 1) << 3) | ((i12 >> 5) & 7)) - 1);
        gregorianCalendar.set(5, i12 & 31);
        gregorianCalendar.set(11, i13 / 60);
        gregorianCalendar.set(12, i13 % 60);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static long e(byte[] bArr, int i10, GregorianCalendar gregorianCalendar) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        gregorianCalendar.set(1, ((i11 & 252) >> 2) + 2000);
        gregorianCalendar.set(2, (((i11 & 3) << 2) | ((i12 & 192) >> 6)) - 1);
        gregorianCalendar.set(5, (i12 & 62) >> 1);
        gregorianCalendar.set(11, ((i12 & 1) << 4) | ((i13 & 240) >> 4));
        gregorianCalendar.set(12, ((i14 & 192) >> 6) | ((i13 & 15) << 2));
        gregorianCalendar.set(13, i14 & 63);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }
}
