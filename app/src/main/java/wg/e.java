package wg;

import gm.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;
import mf.h0;
import mf.t;

/* loaded from: classes2.dex */
public final class e implements t.a {

    /* renamed from: a */
    public static final e f29819a = new e();

    @Override // mf.t.a
    public final t<?> a(Type type, Set<? extends Annotation> set, h0 h0Var) {
        l.f(type, "type");
        l.f(set, "annotations");
        l.f(h0Var, "moshi");
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (l.a(parameterizedType.getRawType(), vg.i.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                l.e(actualTypeArguments, "type.actualTypeArguments");
                return new d(h0Var, actualTypeArguments).d();
            }
            return null;
        }
        return null;
    }
}
