package mf;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class t<T> {

    /* loaded from: classes.dex */
    public interface a {
        t<?> a(Type type, Set<? extends Annotation> set, h0 h0Var);
    }

    public final T a(String str) {
        ln.e eVar = new ln.e();
        eVar.p0(str);
        b0 b0Var = new b0(eVar);
        T b10 = b(b0Var);
        if (!c() && b0Var.F() != 10) {
            throw new v("JSON document was not fully consumed.");
        }
        return b10;
    }

    public abstract T b(y yVar);

    public boolean c() {
        return this instanceof r;
    }

    public final t<T> d() {
        return this instanceof nf.a ? this : new nf.a(this);
    }

    public final String e(T t10) {
        ln.e eVar = new ln.e();
        try {
            f(new c0(eVar), t10);
            return eVar.L();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract void f(e0 e0Var, T t10);
}
