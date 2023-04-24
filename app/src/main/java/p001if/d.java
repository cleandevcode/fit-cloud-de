package p001if;

import fm.q;
import i2.u;
import i2.v;
import java.util.Iterator;
import java.util.Locale;
import nm.j;
import sm.f;
import sm.g;
import sm.p0;
import tm.l;
import tm.n;
import yl.a;

/* renamed from: if.d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final char[] f16806a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    public static int b(int i10, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            return -1;
        }
        int i11 = 0;
        int length = iArr.length - 1;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            int i13 = iArr[i12];
            if (i13 < i10) {
                i11 = i12 + 1;
            } else if (i13 <= i10) {
                return i12;
            } else {
                length = i12 - 1;
            }
        }
        return ~i11;
    }

    public static final Object c(xl.d dVar, q qVar, g gVar, f[] fVarArr) {
        l lVar = new l(null, p0.f27281b, qVar, gVar, fVarArr);
        n nVar = new n(dVar, dVar.e());
        Object d10 = gm.f.d(nVar, nVar, lVar);
        if (d10 == a.COROUTINE_SUSPENDED) {
            return d10;
        }
        return tl.l.f28297a;
    }

    public static String d(int i10, int i11, int i12) {
        return i10 <= 0 ? String.valueOf(i11) : i12 == 1 ? String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i11 & 255), Integer.valueOf((i11 >> 8) & 255), Integer.valueOf((i11 >> 16) & 255), Integer.valueOf((i11 >> 24) & 255)) : i12 == 2 ? String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((i11 >> 24) & 255), Integer.valueOf((i11 >> 16) & 255), Integer.valueOf((i11 >> 8) & 255), Integer.valueOf(i11 & 255)) : i12 == 3 ? String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i11 & 15), Integer.valueOf((i11 >> 4) & 255), Integer.valueOf((i11 >> 12) & 32767), Integer.valueOf((i11 >> 27) & 31)) : i12 == 5 ? String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i11 & 15), Integer.valueOf((i11 >> 4) & 255), Integer.valueOf((i11 >> 12) & 511), Integer.valueOf((i11 >> 21) & 2047)) : i12 == 515 ? String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((i11 >> 24) & 255), Integer.valueOf((i11 >> 16) & 255), Integer.valueOf((i11 >> 8) & 255), Integer.valueOf(i11 & 255)) : (i12 == 4 || i12 == 7 || i12 != 514) ? String.valueOf(i11) : String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((i11 >> 8) & 255), Integer.valueOf(i11 & 255), Integer.valueOf((i11 >> 24) & 255), Integer.valueOf((i11 >> 16) & 255));
    }

    public static final boolean e(v vVar, int i10) {
        boolean z10;
        gm.l.f(vVar, "<this>");
        int i11 = v.f16402j;
        Iterator it = j.H(vVar, u.f16401b).iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            if (((v) it.next()).f16410h == i10) {
                z10 = true;
                continue;
            }
        } while (!z10);
        return true;
    }
}
