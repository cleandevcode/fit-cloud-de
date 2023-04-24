package ul;

import bi.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class i extends z0 {
    public static final ArrayList A(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> T B(T[] tArr) {
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static String C(Object[] objArr, String str, String str2, fm.l lVar, int i10) {
        int i11;
        String str3;
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = "";
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) == 0) {
            str4 = null;
        }
        if ((i10 & 8) != 0) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        if ((i10 & 16) != 0) {
            str3 = "...";
        } else {
            str3 = null;
        }
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        gm.l.f(str, "separator");
        gm.l.f(str2, "prefix");
        gm.l.f(str4, "postfix");
        gm.l.f(str3, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i12 = 0;
        for (Object obj : objArr) {
            i12++;
            if (i12 > 1) {
                sb2.append((CharSequence) str);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            bi.r.e(sb2, obj, lVar);
        }
        if (i11 >= 0 && i12 > i11) {
            sb2.append((CharSequence) str3);
        }
        sb2.append((CharSequence) str4);
        String sb3 = sb2.toString();
        gm.l.e(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static final char D(char[] cArr) {
        gm.l.f(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final void E(HashSet hashSet, Object[] objArr) {
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static final List<Integer> F(int[] iArr) {
        gm.l.f(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i10 : iArr) {
                    arrayList.add(Integer.valueOf(i10));
                }
                return arrayList;
            }
            return h7.a.p(Integer.valueOf(iArr[0]));
        }
        return s.f28879a;
    }

    public static final <T> List<T> G(T[] tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new f(tArr, false));
            }
            return h7.a.p(tArr[0]);
        }
        return s.f28879a;
    }

    public static final List t(Object[] objArr) {
        gm.l.f(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        gm.l.e(asList, "asList(this)");
        return asList;
    }

    public static final boolean u(Object obj, Object[] objArr) {
        int i10;
        gm.l.f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i10 = 0;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    break;
                }
                i10++;
            }
            i10 = -1;
        } else {
            int length2 = objArr.length;
            for (int i11 = 0; i11 < length2; i11++) {
                if (gm.l.a(obj, objArr[i11])) {
                    i10 = i11;
                    break;
                }
            }
            i10 = -1;
        }
        return i10 >= 0;
    }

    public static final void v(int i10, int i11, int i12, byte[] bArr, byte[] bArr2) {
        gm.l.f(bArr, "<this>");
        gm.l.f(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
    }

    public static final void w(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        gm.l.f(objArr, "<this>");
        gm.l.f(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    public static /* synthetic */ void x(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        w(objArr, objArr2, i10, i11, i12);
    }

    public static final void y(Object[] objArr, int i10, int i11) {
        gm.l.f(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, (Object) null);
    }

    public static void z(Object[] objArr, um.x xVar) {
        int length = objArr.length;
        gm.l.f(objArr, "<this>");
        Arrays.fill(objArr, 0, length, xVar);
    }
}
