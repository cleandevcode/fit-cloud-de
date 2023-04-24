package w1;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import w1.s;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a */
    public static final Class<?> f29553a;

    /* renamed from: b */
    public static final j1<?, ?> f29554b;

    /* renamed from: c */
    public static final j1<?, ?> f29555c;

    /* renamed from: d */
    public static final l1 f29556d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f29553a = cls;
        f29554b = z(false);
        f29555c = z(true);
        f29556d = new l1();
    }

    public static <T, FT extends s.a<FT>> void A(p<FT> pVar, T t10, T t11) {
        s<FT> c10 = pVar.c(t11);
        if (c10.i()) {
            return;
        }
        s<FT> d10 = pVar.d(t10);
        d10.getClass();
        for (int i10 = 0; i10 < c10.f29681a.e(); i10++) {
            d10.m(c10.f29681a.d(i10));
        }
        for (Map.Entry<FT, Object> entry : c10.f29681a.f()) {
            d10.m(entry);
        }
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB C(int i10, int i11, UB ub2, j1<UT, UB> j1Var) {
        if (ub2 == null) {
            ub2 = (UB) j1Var.m();
        }
        j1Var.e(ub2, i10, i11);
        return ub2;
    }

    public static void D(int i10, List list, l lVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                lVar.f29637a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).booleanValue();
                    Logger logger = k.f29621b;
                    i12++;
                }
                lVar.f29637a.C0(i12);
                while (i11 < list.size()) {
                    lVar.f29637a.j0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                    i11++;
                }
                return;
            }
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f29637a.k0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public static void E(int i10, List list, l lVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            lVar.f29637a.m0(i10, (g) list.get(i11));
        }
    }

    public static void F(int i10, List list, l lVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                lVar.f29637a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).doubleValue();
                    Logger logger = k.f29621b;
                    i12 += 8;
                }
                lVar.f29637a.C0(i12);
                while (i11 < list.size()) {
                    k kVar = lVar.f29637a;
                    double doubleValue = ((Double) list.get(i11)).doubleValue();
                    kVar.getClass();
                    kVar.r0(Double.doubleToRawLongBits(doubleValue));
                    i11++;
                }
                return;
            }
            lVar.getClass();
            while (i11 < list.size()) {
                k kVar2 = lVar.f29637a;
                double doubleValue2 = ((Double) list.get(i11)).doubleValue();
                kVar2.getClass();
                kVar2.q0(i10, Double.doubleToRawLongBits(doubleValue2));
                i11++;
            }
        }
    }

    public static void G(int i10, List list, l lVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                lVar.f29637a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += k.Q(((Integer) list.get(i13)).intValue());
                }
                lVar.f29637a.C0(i12);
                while (i11 < list.size()) {
                    lVar.f29637a.t0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f29637a.s0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void H(int i10, List list, l lVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                lVar.f29637a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = k.f29621b;
                    i12 += 4;
                }
                lVar.f29637a.C0(i12);
                while (i11 < list.size()) {
                    lVar.f29637a.p0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f29637a.o0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void I(int i10, List list, l lVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                lVar.f29637a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = k.f29621b;
                    i12 += 8;
                }
                lVar.f29637a.C0(i12);
                while (i11 < list.size()) {
                    lVar.f29637a.r0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f29637a.q0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void J(int i10, List list, l lVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                lVar.f29637a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).floatValue();
                    Logger logger = k.f29621b;
                    i12 += 4;
                }
                lVar.f29637a.C0(i12);
                while (i11 < list.size()) {
                    k kVar = lVar.f29637a;
                    float floatValue = ((Float) list.get(i11)).floatValue();
                    kVar.getClass();
                    kVar.p0(Float.floatToRawIntBits(floatValue));
                    i11++;
                }
                return;
            }
            lVar.getClass();
            while (i11 < list.size()) {
                k kVar2 = lVar.f29637a;
                float floatValue2 = ((Float) list.get(i11)).floatValue();
                kVar2.getClass();
                kVar2.o0(i10, Float.floatToRawIntBits(floatValue2));
                i11++;
            }
        }
    }

    public static void K(int i10, List list, l lVar, d1 d1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            lVar.h(i10, d1Var, list.get(i11));
        }
    }

    public static void L(int i10, List list, l lVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                lVar.f29637a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += k.Q(((Integer) list.get(i13)).intValue());
                }
                lVar.f29637a.C0(i12);
                while (i11 < list.size()) {
                    lVar.f29637a.t0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f29637a.s0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void M(int i10, List list, l lVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                lVar.f29637a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += k.h0(((Long) list.get(i13)).longValue());
                }
                lVar.f29637a.C0(i12);
                while (i11 < list.size()) {
                    lVar.f29637a.E0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f29637a.D0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void N(int i10, List list, l lVar, d1 d1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        lVar.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            lVar.k(i10, d1Var, list.get(i11));
        }
    }

    public static void O(int i10, List list, l lVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                lVar.f29637a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = k.f29621b;
                    i12 += 4;
                }
                lVar.f29637a.C0(i12);
                while (i11 < list.size()) {
                    lVar.f29637a.p0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f29637a.o0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void P(int i10, List list, l lVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                lVar.f29637a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = k.f29621b;
                    i12 += 8;
                }
                lVar.f29637a.C0(i12);
                while (i11 < list.size()) {
                    lVar.f29637a.r0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f29637a.q0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void Q(int i10, List list, l lVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                lVar.f29637a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += k.f0((intValue >> 31) ^ (intValue << 1));
                }
                lVar.f29637a.C0(i12);
                while (i11 < list.size()) {
                    k kVar = lVar.f29637a;
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    kVar.C0((intValue2 >> 31) ^ (intValue2 << 1));
                    i11++;
                }
                return;
            }
            lVar.getClass();
            while (i11 < list.size()) {
                k kVar2 = lVar.f29637a;
                int intValue3 = ((Integer) list.get(i11)).intValue();
                kVar2.B0(i10, (intValue3 >> 31) ^ (intValue3 << 1));
                i11++;
            }
        }
    }

    public static void R(int i10, List list, l lVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                lVar.f29637a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += k.h0((longValue >> 63) ^ (longValue << 1));
                }
                lVar.f29637a.C0(i12);
                while (i11 < list.size()) {
                    k kVar = lVar.f29637a;
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    kVar.E0((longValue2 >> 63) ^ (longValue2 << 1));
                    i11++;
                }
                return;
            }
            lVar.getClass();
            while (i11 < list.size()) {
                k kVar2 = lVar.f29637a;
                long longValue3 = ((Long) list.get(i11)).longValue();
                kVar2.D0(i10, (longValue3 >> 63) ^ (longValue3 << 1));
                i11++;
            }
        }
    }

    public static void S(int i10, List list, l lVar) {
        if (list != null && !list.isEmpty()) {
            lVar.getClass();
            int i11 = 0;
            if (list instanceof e0) {
                e0 e0Var = (e0) list;
                while (i11 < list.size()) {
                    Object l10 = e0Var.l(i11);
                    if (l10 instanceof String) {
                        lVar.f29637a.y0(i10, (String) l10);
                    } else {
                        lVar.f29637a.m0(i10, (g) l10);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                lVar.f29637a.y0(i10, (String) list.get(i11));
                i11++;
            }
        }
    }

    public static void T(int i10, List list, l lVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                lVar.f29637a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += k.f0(((Integer) list.get(i13)).intValue());
                }
                lVar.f29637a.C0(i12);
                while (i11 < list.size()) {
                    lVar.f29637a.C0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f29637a.B0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void U(int i10, List list, l lVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                lVar.f29637a.A0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += k.h0(((Long) list.get(i13)).longValue());
                }
                lVar.f29637a.C0(i12);
                while (i11 < list.size()) {
                    lVar.f29637a.E0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            lVar.getClass();
            while (i11 < list.size()) {
                lVar.f29637a.D0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k.H(i10) * size;
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(int i10, List<g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int d02 = k.d0(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int size2 = list.get(i11).size();
            d02 += k.f0(size2) + size2;
        }
        return d02;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.d0(i10) * size) + e(list);
    }

    public static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i10 = 0;
            while (i11 < size) {
                xVar.f(i11);
                i10 += k.Q(xVar.f29727b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.Q(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k.L(i10) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k.M(i10) * size;
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i10, List<p0> list, d1 d1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += k.O(i10, list.get(i12), d1Var);
        }
        return i11;
    }

    public static int k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.d0(i10) * size) + l(list);
    }

    public static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i10 = 0;
            while (i11 < size) {
                xVar.f(i11);
                i10 += k.Q(xVar.f29727b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.Q(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (k.d0(i10) * list.size()) + n(list);
    }

    public static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            i10 = 0;
            while (i11 < size) {
                g0Var.f(i11);
                i10 += k.h0(g0Var.f29567b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.h0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int o(int i10, d1 d1Var, Object obj) {
        if (obj instanceof c0) {
            return k.S((c0) obj) + k.d0(i10);
        }
        int d02 = k.d0(i10);
        int i11 = ((a) ((p0) obj)).i(d1Var);
        return k.f0(i11) + i11 + d02;
    }

    public static int p(int i10, List<?> list, d1 d1Var) {
        int f02;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int d02 = k.d0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof c0) {
                f02 = k.S((c0) obj);
            } else {
                int i12 = ((a) ((p0) obj)).i(d1Var);
                f02 = i12 + k.f0(i12);
            }
            d02 += f02;
        }
        return d02;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.d0(i10) * size) + r(list);
    }

    public static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i10 = 0;
            while (i11 < size) {
                xVar.f(i11);
                int i12 = xVar.f29727b[i11];
                i10 += k.f0((i12 >> 31) ^ (i12 << 1));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i10 += k.f0((intValue >> 31) ^ (intValue << 1));
                i11++;
            }
        }
        return i10;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.d0(i10) * size) + t(list);
    }

    public static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            i10 = 0;
            while (i11 < size) {
                g0Var.f(i11);
                long j10 = g0Var.f29567b[i11];
                i10 += k.h0((j10 >> 63) ^ (j10 << 1));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i10 += k.h0((longValue >> 63) ^ (longValue << 1));
                i11++;
            }
        }
        return i10;
    }

    public static int u(int i10, List<?> list) {
        int c02;
        int c03;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int d02 = k.d0(i10) * size;
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            while (i11 < size) {
                Object l10 = e0Var.l(i11);
                if (l10 instanceof g) {
                    int size2 = ((g) l10).size();
                    c03 = k.f0(size2) + size2;
                } else {
                    c03 = k.c0((String) l10);
                }
                d02 += c03;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof g) {
                    int size3 = ((g) obj).size();
                    c02 = k.f0(size3) + size3;
                } else {
                    c02 = k.c0((String) obj);
                }
                d02 += c02;
                i11++;
            }
        }
        return d02;
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.d0(i10) * size) + w(list);
    }

    public static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            i10 = 0;
            while (i11 < size) {
                xVar.f(i11);
                i10 += k.f0(xVar.f29727b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.f0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.d0(i10) * size) + y(list);
    }

    public static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            i10 = 0;
            while (i11 < size) {
                g0Var.f(i11);
                i10 += k.h0(g0Var.f29567b[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += k.h0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static j1<?, ?> z(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (j1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
