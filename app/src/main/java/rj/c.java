package rj;

import gm.l;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public final String f25769a;

    /* renamed from: b */
    public final String f25770b;

    /* loaded from: classes2.dex */
    public static final class a {
        public static String a(String str, int i10) {
            if (str != null) {
                if (!(str.length() == 0) && i10 > 0) {
                    byte[] bytes = str.getBytes(om.a.f23623a);
                    l.e(bytes, "this as java.lang.String).getBytes(charset)");
                    if (bytes.length < i10) {
                        return str;
                    }
                    int length = str.length();
                    int i11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        byte[] bytes2 = String.valueOf(str.charAt(i12)).getBytes(om.a.f23623a);
                        l.e(bytes2, "this as java.lang.String).getBytes(charset)");
                        i11 += bytes2.length;
                        if (i11 == i10) {
                            String substring = str.substring(0, i12 + 1);
                            l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            return substring;
                        } else if (i11 > i10) {
                            if (i12 == 0) {
                                return null;
                            }
                            String substring2 = str.substring(0, i12);
                            l.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            return substring2;
                        }
                    }
                    return str;
                }
            }
            return null;
        }
    }

    public c(String str, String str2) {
        this.f25769a = str;
        this.f25770b = str2;
    }
}
