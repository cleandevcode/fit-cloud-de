package om;

import androidx.appcompat.widget.u0;
import ih.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nm.n;
import nm.p;

/* loaded from: classes2.dex */
public class l extends h {
    public static final boolean c0(CharSequence charSequence, String str, boolean z10) {
        gm.l.f(charSequence, "<this>");
        gm.l.f(str, "other");
        return h0(charSequence, str, 0, z10, 2) >= 0;
    }

    public static final int d0(CharSequence charSequence) {
        gm.l.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int e0(int i10, CharSequence charSequence, String str, boolean z10) {
        gm.l.f(charSequence, "<this>");
        gm.l.f(str, "string");
        return (z10 || !(charSequence instanceof String)) ? f0(charSequence, str, i10, charSequence.length(), z10, false) : ((String) charSequence).indexOf(str, i10);
    }

    public static final int f0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        lm.h hVar;
        if (!z11) {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            hVar = new lm.j(i10, i11);
        } else {
            int d02 = d0(charSequence);
            if (i10 > d02) {
                i10 = d02;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            hVar = new lm.h(i10, i11, -1);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i12 = hVar.f20071a;
            int i13 = hVar.f20072b;
            int i14 = hVar.f20073c;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (!h.X(0, (String) charSequence2, (String) charSequence, i12, charSequence2.length(), z10)) {
                    if (i12 != i13) {
                        i12 += i14;
                    }
                }
                return i12;
            }
        } else {
            int i15 = hVar.f20071a;
            int i16 = hVar.f20072b;
            int i17 = hVar.f20073c;
            if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                while (!n0(charSequence2, 0, charSequence, i15, charSequence2.length(), z10)) {
                    if (i15 != i16) {
                        i15 += i17;
                    }
                }
                return i15;
            }
        }
        return -1;
    }

    public static int g0(CharSequence charSequence, char c10, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        gm.l.f(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? i0(i10, charSequence, z10, new char[]{c10}) : ((String) charSequence).indexOf(c10, i10);
    }

    public static /* synthetic */ int h0(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return e0(i10, charSequence, str, z10);
    }

    public static final int i0(int i10, CharSequence charSequence, boolean z10, char[] cArr) {
        boolean z11;
        gm.l.f(charSequence, "<this>");
        gm.l.f(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ul.i.D(cArr), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        lm.i it = new lm.j(i10, d0(charSequence)).iterator();
        while (it.f20076c) {
            int nextInt = it.nextInt();
            char charAt = charSequence.charAt(nextInt);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (v.e(cArr[i11], charAt, z10)) {
                        z11 = true;
                        continue;
                        break;
                    }
                    i11++;
                } else {
                    z11 = false;
                    continue;
                    break;
                }
            }
            if (z11) {
                return nextInt;
            }
        }
        return -1;
    }

    public static int j0(CharSequence charSequence, char c10, int i10, int i11) {
        boolean z10;
        if ((i11 & 2) != 0) {
            i10 = d0(charSequence);
        }
        gm.l.f(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c10};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(ul.i.D(cArr), i10);
            }
            int d02 = d0(charSequence);
            if (i10 > d02) {
                i10 = d02;
            }
            while (-1 < i10) {
                char charAt = charSequence.charAt(i10);
                int i12 = 0;
                while (true) {
                    if (i12 < 1) {
                        if (v.e(cArr[i12], charAt, false)) {
                            z10 = true;
                            break;
                        }
                        i12++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return i10;
                }
                i10--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static int k0(CharSequence charSequence, String str, int i10) {
        int d02 = (i10 & 2) != 0 ? d0(charSequence) : 0;
        gm.l.f(charSequence, "<this>");
        gm.l.f(str, "string");
        return !(charSequence instanceof String) ? f0(charSequence, str, d02, 0, false, true) : ((String) charSequence).lastIndexOf(str, d02);
    }

    public static final List<String> l0(CharSequence charSequence) {
        gm.l.f(charSequence, "<this>");
        return h7.a.u(n.I(new p(m0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new k(charSequence))));
    }

    public static b m0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        p0(i10);
        return new b(charSequence, 0, i10, new j(ul.i.t(strArr), z10));
    }

    public static final boolean n0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        gm.l.f(charSequence, "<this>");
        gm.l.f(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!v.e(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final String o0(String str, String str2) {
        if (h.a0(str2, str, false)) {
            String substring = str2.substring(str.length());
            gm.l.e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str2;
    }

    public static final void p0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(u0.a("Limit must be non-negative, but was ", i10).toString());
    }

    public static final List q0(int i10, CharSequence charSequence, String str, boolean z10) {
        p0(i10);
        int i11 = 0;
        int e02 = e0(0, charSequence, str, z10);
        if (e02 == -1 || i10 == 1) {
            return h7.a.p(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        int i12 = 10;
        if (z11 && i10 <= 10) {
            i12 = i10;
        }
        ArrayList arrayList = new ArrayList(i12);
        do {
            arrayList.add(charSequence.subSequence(i11, e02).toString());
            i11 = str.length() + e02;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            e02 = e0(i11, charSequence, str, z10);
        } while (e02 != -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static List r0(CharSequence charSequence, char[] cArr) {
        gm.l.f(charSequence, "<this>");
        if (cArr.length == 1) {
            return q0(0, charSequence, String.valueOf(cArr[0]), false);
        }
        p0(0);
        nm.l lVar = new nm.l(new b(charSequence, 0, 0, new i(cArr, false)));
        ArrayList arrayList = new ArrayList(ul.l.B(lVar, 10));
        Iterator<Object> it = lVar.iterator();
        while (it.hasNext()) {
            arrayList.add(t0(charSequence, (lm.j) it.next()));
        }
        return arrayList;
    }

    public static List s0(CharSequence charSequence, String[] strArr, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        gm.l.f(charSequence, "<this>");
        boolean z10 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z10 = false;
            }
            if (!z10) {
                return q0(i10, charSequence, str, false);
            }
        }
        nm.l lVar = new nm.l(m0(charSequence, strArr, false, i10));
        ArrayList arrayList = new ArrayList(ul.l.B(lVar, 10));
        Iterator<Object> it = lVar.iterator();
        while (it.hasNext()) {
            arrayList.add(t0(charSequence, (lm.j) it.next()));
        }
        return arrayList;
    }

    public static final String t0(CharSequence charSequence, lm.j jVar) {
        gm.l.f(charSequence, "<this>");
        gm.l.f(jVar, "range");
        return charSequence.subSequence(Integer.valueOf(jVar.f20071a).intValue(), Integer.valueOf(jVar.f20072b).intValue() + 1).toString();
    }

    public static String u0(String str, char c10) {
        int g02 = g0(str, c10, 0, false, 6);
        if (g02 == -1) {
            return str;
        }
        String substring = str.substring(g02 + 1, str.length());
        gm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String v0(String str, String str2) {
        gm.l.f(str2, "delimiter");
        int h02 = h0(str, str2, 0, false, 6);
        if (h02 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + h02, str.length());
        gm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String w0(String str, String str2) {
        gm.l.f(str, "<this>");
        gm.l.f(str2, "missingDelimiterValue");
        int j02 = j0(str, '.', 0, 6);
        if (j02 == -1) {
            return str2;
        }
        String substring = str.substring(j02 + 1, str.length());
        gm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final CharSequence x0(CharSequence charSequence) {
        gm.l.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean h10 = v.h(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!h10) {
                    break;
                }
                length--;
            } else if (h10) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }
}
