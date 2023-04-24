package om;

import bi.r;
import ih.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ul.q;

/* loaded from: classes2.dex */
public class d extends r {
    public static final String Q(String str) {
        Comparable comparable;
        int i10;
        String str2;
        boolean z10;
        gm.l.f(str, "<this>");
        List<String> l02 = l.l0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : l02) {
            if (!h.W((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ul.l.B(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            int i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length = str3.length();
            while (true) {
                if (i11 < length) {
                    if (!v.h(str3.charAt(i11))) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 == -1) {
                i11 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i11));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        int size = (l02.size() * 0) + str.length();
        int k10 = h7.a.k(l02);
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        for (Object obj2 : l02) {
            int i13 = i12 + 1;
            if (i12 >= 0) {
                String str4 = (String) obj2;
                if ((i12 == 0 || i12 == k10) && h.W(str4)) {
                    str2 = null;
                } else {
                    gm.l.f(str4, "<this>");
                    if (i10 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int length2 = str4.length();
                        if (i10 <= length2) {
                            length2 = i10;
                        }
                        str2 = str4.substring(length2);
                        gm.l.e(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new IllegalArgumentException(androidx.activity.i.a("Requested character count ", i10, " is less than zero.").toString());
                    }
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
                i12 = i13;
            } else {
                h7.a.z();
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder(size);
        q.K(arrayList3, sb2, "\n", "", "", -1, "...", null);
        String sb3 = sb2.toString();
        gm.l.e(sb3, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb3;
    }

    public static String R(String str) {
        gm.l.f(str, "<this>");
        if (!h.W("|")) {
            List<String> l02 = l.l0(str);
            int size = (l02.size() * 0) + str.length();
            int k10 = h7.a.k(l02);
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (Object obj : l02) {
                int i11 = i10 + 1;
                String str2 = null;
                if (i10 >= 0) {
                    String str3 = (String) obj;
                    if ((i10 != 0 && i10 != k10) || !h.W(str3)) {
                        int length = str3.length();
                        int i12 = 0;
                        while (true) {
                            if (i12 < length) {
                                if (!v.h(str3.charAt(i12))) {
                                    break;
                                }
                                i12++;
                            } else {
                                i12 = -1;
                                break;
                            }
                        }
                        if (i12 != -1 && h.Z(i12, str3, "|", false)) {
                            str2 = str3.substring(i12 + 1);
                            gm.l.e(str2, "this as java.lang.String).substring(startIndex)");
                        }
                        if (str2 == null) {
                            str2 = str3;
                        }
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i10 = i11;
                } else {
                    h7.a.z();
                    throw null;
                }
            }
            StringBuilder sb2 = new StringBuilder(size);
            q.K(arrayList, sb2, "\n", "", "", -1, "...", null);
            String sb3 = sb2.toString();
            gm.l.e(sb3, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb3;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }
}
