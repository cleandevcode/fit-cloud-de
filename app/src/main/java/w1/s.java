package w1;

import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import w1.b0;
import w1.p0;
import w1.s.a;
import w1.w;
import w1.y;

/* loaded from: classes.dex */
public final class s<T extends a<T>> {

    /* renamed from: d */
    public static final s f29680d = new s(0);

    /* renamed from: a */
    public final g1<T, Object> f29681a;

    /* renamed from: b */
    public boolean f29682b;

    /* renamed from: c */
    public boolean f29683c;

    /* loaded from: classes.dex */
    public interface a<T extends a<T>> extends Comparable<T> {
        void A();

        void o();

        void q();

        void r();

        w.a s(p0.a aVar, p0 p0Var);

        q1 z();
    }

    public s() {
        int i10 = g1.f29569g;
        this.f29681a = new f1(16);
    }

    public static Object b(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public static int c(p1 p1Var, int i10, Object obj) {
        int d02 = k.d0(i10);
        if (p1Var == p1.f29662d) {
            d02 *= 2;
        }
        return d(p1Var, obj) + d02;
    }

    public static int d(p1 p1Var, Object obj) {
        switch (p1Var.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = k.f29621b;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = k.f29621b;
                return 4;
            case 2:
                return k.h0(((Long) obj).longValue());
            case 3:
                return k.h0(((Long) obj).longValue());
            case 4:
                return k.Q(((Integer) obj).intValue());
            case 5:
            case 15:
                ((Long) obj).longValue();
                Logger logger3 = k.f29621b;
                return 8;
            case 6:
            case 14:
                ((Integer) obj).intValue();
                Logger logger22 = k.f29621b;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger4 = k.f29621b;
                return 1;
            case 8:
                if (obj instanceof g) {
                    Logger logger5 = k.f29621b;
                    int size = ((g) obj).size();
                    return k.f0(size) + size;
                }
                return k.c0((String) obj);
            case 9:
                Logger logger6 = k.f29621b;
                return ((p0) obj).e();
            case 10:
                if (obj instanceof b0) {
                    return k.S((b0) obj);
                }
                Logger logger7 = k.f29621b;
                int e10 = ((p0) obj).e();
                return k.f0(e10) + e10;
            case 11:
                if (obj instanceof g) {
                    Logger logger8 = k.f29621b;
                    int size2 = ((g) obj).size();
                    return k.f0(size2) + size2;
                }
                Logger logger9 = k.f29621b;
                int length = ((byte[]) obj).length;
                return k.f0(length) + length;
            case 12:
                return k.f0(((Integer) obj).intValue());
            case 13:
                if (obj instanceof y.a) {
                    return k.Q(((y.a) obj).o());
                }
                return k.Q(((Integer) obj).intValue());
            case 16:
                int intValue = ((Integer) obj).intValue();
                return k.f0((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return k.h0((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(a<?> aVar, Object obj) {
        aVar.r();
        aVar.o();
        aVar.q();
        return c(null, 0, obj);
    }

    public static int g(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (aVar.z() == q1.f29675j) {
            aVar.q();
            aVar.A();
            boolean z10 = value instanceof b0;
            ((a) entry.getKey()).o();
            if (z10) {
                return k.S((b0) value) + k.d0(3) + k.e0(2, 0) + (k.d0(1) * 2);
            }
            int e02 = k.e0(2, 0) + (k.d0(1) * 2);
            int d02 = k.d0(3);
            int e10 = ((p0) value).e();
            return k.f0(e10) + e10 + d02 + e02;
        }
        return e(aVar, value);
    }

    public static <T extends a<T>> boolean k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.z() == q1.f29675j) {
            key.q();
            Object value = entry.getValue();
            if (!(value instanceof p0)) {
                if (value instanceof b0) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else if (!((p0) value).g()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0016, code lost:
        if ((r2 instanceof w1.b0) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x001f, code lost:
        if ((r2 instanceof w1.y.a) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0028, code lost:
        if ((r2 instanceof byte[]) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(w1.p1 r1, java.lang.Object r2) {
        /*
            java.nio.charset.Charset r0 = w1.y.f29729a
            r2.getClass()
            w1.q1 r1 = r1.f29665a
            int r1 = r1.ordinal()
            r0 = 0
            switch(r1) {
                case 0: goto L3c;
                case 1: goto L39;
                case 2: goto L36;
                case 3: goto L33;
                case 4: goto L30;
                case 5: goto L2d;
                case 6: goto L22;
                case 7: goto L19;
                case 8: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L3e
        L10:
            boolean r1 = r2 instanceof w1.p0
            if (r1 != 0) goto L2a
            boolean r1 = r2 instanceof w1.b0
            if (r1 == 0) goto L3e
            goto L2a
        L19:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L2a
            boolean r1 = r2 instanceof w1.y.a
            if (r1 == 0) goto L3e
            goto L2a
        L22:
            boolean r1 = r2 instanceof w1.g
            if (r1 != 0) goto L2a
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L3e
        L2a:
            r1 = 1
            r0 = 1
            goto L3e
        L2d:
            boolean r0 = r2 instanceof java.lang.String
            goto L3e
        L30:
            boolean r0 = r2 instanceof java.lang.Boolean
            goto L3e
        L33:
            boolean r0 = r2 instanceof java.lang.Double
            goto L3e
        L36:
            boolean r0 = r2 instanceof java.lang.Float
            goto L3e
        L39:
            boolean r0 = r2 instanceof java.lang.Long
            goto L3e
        L3c:
            boolean r0 = r2 instanceof java.lang.Integer
        L3e:
            if (r0 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.s.o(w1.p1, java.lang.Object):void");
    }

    public static void p(k kVar, p1 p1Var, int i10, Object obj) {
        int intValue;
        if (p1Var == p1.f29662d) {
            kVar.A0(i10, 3);
            ((p0) obj).d(kVar);
            kVar.A0(i10, 4);
            return;
        }
        kVar.A0(i10, p1Var.f29666b);
        switch (p1Var.ordinal()) {
            case 0:
                kVar.r0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                kVar.p0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                kVar.E0(((Long) obj).longValue());
                return;
            case 3:
                kVar.E0(((Long) obj).longValue());
                return;
            case 4:
                kVar.t0(((Integer) obj).intValue());
                return;
            case 5:
                kVar.r0(((Long) obj).longValue());
                return;
            case 6:
                kVar.p0(((Integer) obj).intValue());
                return;
            case 7:
                kVar.j0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (!(obj instanceof g)) {
                    kVar.z0((String) obj);
                    return;
                }
                break;
            case 9:
                ((p0) obj).d(kVar);
                return;
            case 10:
                kVar.v0((p0) obj);
                return;
            case 11:
                if (!(obj instanceof g)) {
                    byte[] bArr = (byte[]) obj;
                    kVar.l0(bArr, bArr.length);
                    return;
                }
                break;
            case 12:
                kVar.C0(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof y.a) {
                    intValue = ((y.a) obj).o();
                } else {
                    intValue = ((Integer) obj).intValue();
                }
                kVar.t0(intValue);
                return;
            case 14:
                kVar.p0(((Integer) obj).intValue());
                return;
            case 15:
                kVar.r0(((Long) obj).longValue());
                return;
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                kVar.C0((intValue2 >> 31) ^ (intValue2 << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                kVar.E0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
        kVar.n0((g) obj);
    }

    /* renamed from: a */
    public final s<T> clone() {
        s<T> sVar = new s<>();
        for (int i10 = 0; i10 < this.f29681a.e(); i10++) {
            Map.Entry<T, Object> d10 = this.f29681a.d(i10);
            sVar.n(d10.getKey(), d10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f29681a.f()) {
            sVar.n(entry.getKey(), entry.getValue());
        }
        sVar.f29683c = this.f29683c;
        return sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f29681a.equals(((s) obj).f29681a);
        }
        return false;
    }

    public final Object f(T t10) {
        Object obj = this.f29681a.get(t10);
        return obj instanceof b0 ? ((b0) obj).a(null) : obj;
    }

    public final int h() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f29681a.e(); i11++) {
            Map.Entry<T, Object> d10 = this.f29681a.d(i11);
            i10 += e(d10.getKey(), d10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f29681a.f()) {
            i10 += e(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public final int hashCode() {
        return this.f29681a.hashCode();
    }

    public final boolean i() {
        return this.f29681a.isEmpty();
    }

    public final boolean j() {
        for (int i10 = 0; i10 < this.f29681a.e(); i10++) {
            if (!k(this.f29681a.d(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f29681a.f()) {
            if (!k(entry)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<T, Object>> l() {
        return this.f29683c ? new b0.b(this.f29681a.entrySet().iterator()) : this.f29681a.entrySet().iterator();
    }

    public final void m(Map.Entry<T, Object> entry) {
        g1<T, Object> g1Var;
        Object b10;
        Object f10;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof b0) {
            value = ((b0) value).a(null);
        }
        key.q();
        if (key.z() == q1.f29675j && (f10 = f(key)) != null) {
            b10 = key.s(((p0) f10).a(), (p0) value).h();
            g1Var = this.f29681a;
        } else {
            g1Var = this.f29681a;
            b10 = b(value);
        }
        g1Var.put(key, b10);
    }

    public final void n(T t10, Object obj) {
        t10.q();
        t10.r();
        o(null, obj);
        if (obj instanceof b0) {
            this.f29683c = true;
        }
        this.f29681a.put(t10, obj);
    }

    public s(int i10) {
        int i11 = g1.f29569g;
        f1 f1Var = new f1(0);
        this.f29681a = f1Var;
        if (!this.f29682b) {
            f1Var.h();
            this.f29682b = true;
        }
        if (this.f29682b) {
            return;
        }
        f1Var.h();
        this.f29682b = true;
    }
}
