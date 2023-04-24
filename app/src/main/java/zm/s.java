package zm;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a */
    public final String f32678a;

    /* renamed from: b */
    public final String f32679b;

    /* renamed from: c */
    public final String[] f32680c;

    /* renamed from: f */
    public static final a f32677f = new a();

    /* renamed from: d */
    public static final Pattern f32675d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    public static final Pattern f32676e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* loaded from: classes2.dex */
    public static final class a {
        public static s a(String str) {
            gm.l.f(str, "$this$toMediaType");
            Matcher matcher = s.f32675d.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                gm.l.e(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                gm.l.e(locale, "Locale.US");
                String lowerCase = group.toLowerCase(locale);
                gm.l.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                gm.l.e(group2, "typeSubtype.group(2)");
                gm.l.e(group2.toLowerCase(locale), "(this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = s.f32676e.matcher(str);
                for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 != null) {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (om.h.a0(group4, "'", false) && om.h.U(group4, "'", false) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                gm.l.e(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                        }
                    } else {
                        StringBuilder a10 = android.support.v4.media.d.a("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        gm.l.e(substring, "(this as java.lang.String).substring(startIndex)");
                        a10.append(substring);
                        a10.append("\" for: \"");
                        a10.append(str);
                        a10.append('\"');
                        throw new IllegalArgumentException(a10.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    return new s(str, lowerCase, (String[]) array);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
    }

    public s(String str, String str2, String[] strArr) {
        this.f32678a = str;
        this.f32679b = str2;
        this.f32680c = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.nio.charset.Charset a(java.nio.charset.Charset r6) {
        /*
            r5 = this;
            java.lang.String[] r0 = r5.f32680c
            java.lang.String r1 = "<this>"
            gm.l.f(r0, r1)
            lm.j r1 = new lm.j
            int r0 = r0.length
            int r0 = r0 + (-1)
            r2 = 0
            r1.<init>(r2, r0)
            r0 = 2
            lm.h r0 = h7.a.x(r1, r0)
            int r1 = r0.f20071a
            int r2 = r0.f20072b
            int r0 = r0.f20073c
            if (r0 < 0) goto L20
            if (r1 > r2) goto L39
            goto L22
        L20:
            if (r1 < r2) goto L39
        L22:
            java.lang.String[] r3 = r5.f32680c
            r3 = r3[r1]
            java.lang.String r4 = "charset"
            boolean r3 = om.h.V(r3, r4)
            if (r3 == 0) goto L35
            java.lang.String[] r0 = r5.f32680c
            int r1 = r1 + 1
            r0 = r0[r1]
            goto L3a
        L35:
            if (r1 == r2) goto L39
            int r1 = r1 + r0
            goto L22
        L39:
            r0 = 0
        L3a:
            if (r0 == 0) goto L40
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L40
        L40:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.s.a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && gm.l.a(((s) obj).f32678a, this.f32678a);
    }

    public final int hashCode() {
        return this.f32678a.hashCode();
    }

    public final String toString() {
        return this.f32678a;
    }
}
