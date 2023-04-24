package w1;

import java.util.Map;
import w1.i0;

/* loaded from: classes.dex */
public final class l0 implements k0 {
    @Override // w1.k0
    public final j0 a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        j0 j0Var2 = (j0) obj2;
        if (!j0Var2.isEmpty()) {
            if (!j0Var.f29620a) {
                j0Var = j0Var.d();
            }
            j0Var.c();
            if (!j0Var2.isEmpty()) {
                j0Var.putAll(j0Var2);
            }
        }
        return j0Var;
    }

    @Override // w1.k0
    public final int b(Object obj, Object obj2, int i10) {
        j0 j0Var = (j0) obj;
        i0 i0Var = (i0) obj2;
        int i11 = 0;
        if (!j0Var.isEmpty()) {
            for (Map.Entry entry : j0Var.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                i0Var.getClass();
                int d02 = k.d0(i10);
                int a10 = i0.a(i0Var.f29608a, key, value);
                i11 += k.f0(a10) + a10 + d02;
            }
        }
        return i11;
    }

    @Override // w1.k0
    public final Object c(Object obj) {
        ((j0) obj).f29620a = false;
        return obj;
    }

    @Override // w1.k0
    public final i0.a<?, ?> d(Object obj) {
        return ((i0) obj).f29608a;
    }

    @Override // w1.k0
    public final j0 e() {
        return j0.f29619b.d();
    }

    @Override // w1.k0
    public final j0 f(Object obj) {
        return (j0) obj;
    }

    @Override // w1.k0
    public final boolean g(Object obj) {
        return !((j0) obj).f29620a;
    }

    @Override // w1.k0
    public final j0 h(Object obj) {
        return (j0) obj;
    }
}
