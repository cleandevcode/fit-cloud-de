package ao;

import ao.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* loaded from: classes2.dex */
public final class t extends f.a {

    /* renamed from: a */
    public static final t f3860a = new t();

    @IgnoreJRERequirement
    /* loaded from: classes2.dex */
    public static final class a<T> implements f<zm.c0, Optional<T>> {

        /* renamed from: a */
        public final f<zm.c0, T> f3861a;

        public a(f<zm.c0, T> fVar) {
            this.f3861a = fVar;
        }

        @Override // ao.f
        public final Object a(zm.c0 c0Var) {
            return Optional.ofNullable(this.f3861a.a(c0Var));
        }
    }

    @Override // ao.f.a
    public final f<zm.c0, ?> b(Type type, Annotation[] annotationArr, d0 d0Var) {
        if (h0.f(type) != Optional.class) {
            return null;
        }
        return new a(d0Var.d(h0.e(0, (ParameterizedType) type), annotationArr));
    }
}
