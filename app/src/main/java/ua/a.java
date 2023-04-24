package ua;

import android.support.v4.media.d;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final TimeZone f28645a = TimeZone.getTimeZone("UTC");

    public static boolean a(char c10, int i10, String str) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x00e5 A[Catch: IllegalArgumentException -> 0x01d4, NumberFormatException -> 0x01d6, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d8, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d8, blocks: (B:112:0x0004, B:114:0x0016, B:115:0x0018, B:117:0x0024, B:118:0x0026, B:120:0x0036, B:122:0x003c, B:126:0x0054, B:128:0x0064, B:129:0x0066, B:131:0x0072, B:132:0x0074, B:134:0x007a, B:138:0x0084, B:143:0x0094, B:145:0x009c, B:146:0x00a0, B:148:0x00a6, B:153:0x00b3, B:155:0x00ba, B:166:0x00df, B:168:0x00e5, B:170:0x00ec, B:195:0x019b, B:175:0x00f8, B:176:0x0113, B:177:0x0114, B:181:0x0130, B:183:0x013d, B:186:0x0146, B:188:0x0165, B:191:0x0174, B:192:0x0196, B:194:0x0199, B:180:0x011f, B:197:0x01cc, B:198:0x01d3, B:159:0x00ca, B:160:0x00cd, B:154:0x00b6), top: B:214:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01cc A[Catch: IllegalArgumentException -> 0x01d4, NumberFormatException -> 0x01d6, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d8, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d8, blocks: (B:112:0x0004, B:114:0x0016, B:115:0x0018, B:117:0x0024, B:118:0x0026, B:120:0x0036, B:122:0x003c, B:126:0x0054, B:128:0x0064, B:129:0x0066, B:131:0x0072, B:132:0x0074, B:134:0x007a, B:138:0x0084, B:143:0x0094, B:145:0x009c, B:146:0x00a0, B:148:0x00a6, B:153:0x00b3, B:155:0x00ba, B:166:0x00df, B:168:0x00e5, B:170:0x00ec, B:195:0x019b, B:175:0x00f8, B:176:0x0113, B:177:0x0114, B:181:0x0130, B:183:0x013d, B:186:0x0146, B:188:0x0165, B:191:0x0174, B:192:0x0196, B:194:0x0199, B:180:0x011f, B:197:0x01cc, B:198:0x01d3, B:159:0x00ca, B:160:0x00cd, B:154:0x00b6), top: B:214:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i10, int i11, String str) {
        int i12;
        int i13;
        if (i10 >= 0 && i11 <= str.length() && i10 <= i11) {
            if (i10 < i11) {
                i13 = i10 + 1;
                int digit = Character.digit(str.charAt(i10), 10);
                if (digit >= 0) {
                    i12 = -digit;
                } else {
                    StringBuilder a10 = d.a("Invalid number: ");
                    a10.append(str.substring(i10, i11));
                    throw new NumberFormatException(a10.toString());
                }
            } else {
                i12 = 0;
                i13 = i10;
            }
            while (i13 < i11) {
                int i14 = i13 + 1;
                int digit2 = Character.digit(str.charAt(i13), 10);
                if (digit2 >= 0) {
                    i12 = (i12 * 10) - digit2;
                    i13 = i14;
                } else {
                    StringBuilder a11 = d.a("Invalid number: ");
                    a11.append(str.substring(i10, i11));
                    throw new NumberFormatException(a11.toString());
                }
            }
            return -i12;
        }
        throw new NumberFormatException(str);
    }
}
