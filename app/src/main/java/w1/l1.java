package w1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l1 extends j1<k1, k1> {
    @Override // w1.j1
    public final void a(int i10, int i11, Object obj) {
        ((k1) obj).b((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // w1.j1
    public final void b(k1 k1Var, int i10, long j10) {
        k1Var.b((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // w1.j1
    public final void c(Object obj, Object obj2, int i10) {
        ((k1) obj).b((i10 << 3) | 3, (k1) obj2);
    }

    @Override // w1.j1
    public final void d(k1 k1Var, int i10, g gVar) {
        k1Var.b((i10 << 3) | 2, gVar);
    }

    @Override // w1.j1
    public final void e(k1 k1Var, int i10, long j10) {
        k1Var.b((i10 << 3) | 0, Long.valueOf(j10));
    }

    @Override // w1.j1
    public final k1 f(Object obj) {
        w wVar = (w) obj;
        k1 k1Var = wVar.unknownFields;
        if (k1Var == k1.f29631f) {
            k1 k1Var2 = new k1();
            wVar.unknownFields = k1Var2;
            return k1Var2;
        }
        return k1Var;
    }

    @Override // w1.j1
    public final k1 g(Object obj) {
        return ((w) obj).unknownFields;
    }

    @Override // w1.j1
    public final int h(k1 k1Var) {
        return k1Var.a();
    }

    @Override // w1.j1
    public final int i(k1 k1Var) {
        k1 k1Var2 = k1Var;
        int i10 = k1Var2.f29635d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < k1Var2.f29632a; i12++) {
                int e02 = k.e0(2, k1Var2.f29633b[i12] >>> 3);
                i11 += k.I(3, (g) k1Var2.f29634c[i12]) + e02 + (k.d0(1) * 2);
            }
            k1Var2.f29635d = i11;
            return i11;
        }
        return i10;
    }

    @Override // w1.j1
    public final void j(Object obj) {
        ((w) obj).unknownFields.f29636e = false;
    }

    @Override // w1.j1
    public final k1 k(Object obj, Object obj2) {
        k1 k1Var = (k1) obj;
        k1 k1Var2 = (k1) obj2;
        if (!k1Var2.equals(k1.f29631f)) {
            int i10 = k1Var.f29632a + k1Var2.f29632a;
            int[] copyOf = Arrays.copyOf(k1Var.f29633b, i10);
            System.arraycopy(k1Var2.f29633b, 0, copyOf, k1Var.f29632a, k1Var2.f29632a);
            Object[] copyOf2 = Arrays.copyOf(k1Var.f29634c, i10);
            System.arraycopy(k1Var2.f29634c, 0, copyOf2, k1Var.f29632a, k1Var2.f29632a);
            return new k1(i10, copyOf, copyOf2, true);
        }
        return k1Var;
    }

    @Override // w1.j1
    public final k1 m() {
        return new k1();
    }

    @Override // w1.j1
    public final void n(Object obj, k1 k1Var) {
        ((w) obj).unknownFields = k1Var;
    }

    @Override // w1.j1
    public final void o(Object obj, k1 k1Var) {
        ((w) obj).unknownFields = k1Var;
    }

    @Override // w1.j1
    public final void p() {
    }

    @Override // w1.j1
    public final k1 q(Object obj) {
        k1 k1Var = (k1) obj;
        k1Var.f29636e = false;
        return k1Var;
    }

    @Override // w1.j1
    public final void r(Object obj, l lVar) {
        k1 k1Var = (k1) obj;
        k1Var.getClass();
        lVar.getClass();
        for (int i10 = 0; i10 < k1Var.f29632a; i10++) {
            lVar.l(k1Var.f29633b[i10] >>> 3, k1Var.f29634c[i10]);
        }
    }

    @Override // w1.j1
    public final void s(Object obj, l lVar) {
        ((k1) obj).c(lVar);
    }
}
