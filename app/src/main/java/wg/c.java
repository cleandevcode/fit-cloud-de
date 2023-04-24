package wg;

import gm.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;
import mf.h0;
import mf.t;

/* loaded from: classes2.dex */
public final class c implements t.a {

    /* renamed from: a */
    public static final c f29814a = new c();

    @Override // mf.t.a
    public final t<?> a(Type type, Set<? extends Annotation> set, h0 h0Var) {
        l.f(type, "type");
        l.f(set, "annotations");
        l.f(h0Var, "moshi");
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (l.a(parameterizedType.getRawType(), vg.h.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                l.e(actualTypeArguments, "type.actualTypeArguments");
                return new b(h0Var, actualTypeArguments).d();
            }
            return null;
        }
        return null;
    }
}
