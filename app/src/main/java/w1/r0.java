package w1;

import java.util.List;
import java.util.Map;
import w1.g;

/* loaded from: classes.dex */
public final class r0 {
    public static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static final void b(StringBuilder sb2, int i10, String str, Object obj) {
        String obj2;
        String b10;
        if (obj instanceof List) {
            for (Object obj3 : (List) obj) {
                b(sb2, i10, str, obj3);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb2, i10, str, entry);
            }
        } else {
            sb2.append('\n');
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                g.e eVar = g.f29563b;
                b10 = bk.m.b(new g.e(((String) obj).getBytes(y.f29729a)));
            } else if (obj instanceof g) {
                sb2.append(": \"");
                b10 = bk.m.b((g) obj);
            } else {
                if (obj instanceof w) {
                    sb2.append(" {");
                    c((w) obj, sb2, i10 + 2);
                    sb2.append("\n");
                    while (i11 < i10) {
                        sb2.append(' ');
                        i11++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb2.append(" {");
                    Map.Entry entry2 = (Map.Entry) obj;
                    int i13 = i10 + 2;
                    b(sb2, i13, "key", entry2.getKey());
                    b(sb2, i13, "value", entry2.getValue());
                    sb2.append("\n");
                    while (i11 < i10) {
                        sb2.append(' ');
                        i11++;
                    }
                } else {
                    sb2.append(": ");
                    obj2 = obj.toString();
                    sb2.append(obj2);
                    return;
                }
                obj2 = "}";
                sb2.append(obj2);
                return;
            }
            sb2.append(b10);
            sb2.append('\"');
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x01cc, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x01dd, code lost:
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x01ef, code lost:
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x021d, code lost:
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(w1.p0 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.r0.c(w1.p0, java.lang.StringBuilder, int):void");
    }
}
