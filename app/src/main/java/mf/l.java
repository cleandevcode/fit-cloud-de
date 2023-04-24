package mf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import mf.t;

/* loaded from: classes.dex */
public abstract class l<C extends Collection<T>, T> extends t<C> {

    /* renamed from: b */
    public static final a f20622b = new a();

    /* renamed from: a */
    public final t<T> f20623a;

    /* loaded from: classes.dex */
    public class a implements t.a {
        @Override // mf.t.a
        public final t<?> a(Type type, Set<? extends Annotation> set, h0 h0Var) {
            t mVar;
            Class<?> c10 = l0.c(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (c10 != List.class && c10 != Collection.class) {
                if (c10 != Set.class) {
                    return null;
                }
                mVar = new n(h0Var.b(l0.a(Collection.class, type)));
            } else {
                mVar = new m(h0Var.b(l0.a(Collection.class, type)));
            }
            return mVar.d();
        }
    }

    public l(t tVar) {
        this.f20623a = tVar;
    }

    public final String toString() {
        return this.f20623a + ".collection()";
    }
}
