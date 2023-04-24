package om;

import ih.v;
import java.util.Collection;
import java.util.Iterator;
import ul.w;

/* loaded from: classes2.dex */
public class h extends g {
    public static final boolean U(String str, String str2, boolean z10) {
        gm.l.f(str, "<this>");
        gm.l.f(str2, "suffix");
        return !z10 ? str.endsWith(str2) : X(str.length() - str2.length(), str, str2, 0, str2.length(), true);
    }

    public static final boolean V(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean W(CharSequence charSequence) {
        boolean z10;
        gm.l.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            lm.j jVar = new lm.j(0, charSequence.length() - 1);
            if (!(jVar instanceof Collection) || !((Collection) jVar).isEmpty()) {
                Iterator<Integer> it = jVar.iterator();
                while (it.hasNext()) {
                    if (!v.h(charSequence.charAt(((w) it).nextInt()))) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public static final boolean X(int i10, String str, String str2, int i11, int i12, boolean z10) {
        gm.l.f(str, "<this>");
        gm.l.f(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static String Y(String str, String str2, String str3) {
        gm.l.f(str, "<this>");
        gm.l.f(str2, "oldValue");
        gm.l.f(str3, "newValue");
        int e02 = l.e0(0, str, str2, false);
        if (e02 < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            int i11 = 0;
            do {
                sb2.append((CharSequence) str, i11, e02);
                sb2.append(str3);
                i11 = e02 + length;
                if (e02 >= str.length()) {
                    break;
                }
                e02 = l.e0(e02 + i10, str, str2, false);
            } while (e02 > 0);
            sb2.append((CharSequence) str, i11, str.length());
            String sb3 = sb2.toString();
            gm.l.e(sb3, "stringBuilder.append(this, i, length).toString()");
            return sb3;
        }
        throw new OutOfMemoryError();
    }

    public static final boolean Z(int i10, String str, String str2, boolean z10) {
        gm.l.f(str, "<this>");
        return !z10 ? str.startsWith(str2, i10) : X(i10, str, str2, 0, str2.length(), z10);
    }

    public static final boolean a0(String str, String str2, boolean z10) {
        gm.l.f(str, "<this>");
        gm.l.f(str2, "prefix");
        return !z10 ? str.startsWith(str2) : X(0, str, str2, 0, str2.length(), z10);
    }
}
