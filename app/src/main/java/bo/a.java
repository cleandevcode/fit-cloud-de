package bo;

import ao.d0;
import ao.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import mf.h0;
import mf.q;
import mf.r;
import mf.s;
import mf.x;
import zm.c0;

/* loaded from: classes2.dex */
public final class a extends f.a {

    /* renamed from: a */
    public final h0 f4487a;

    /* renamed from: b */
    public final boolean f4488b = false;

    /* renamed from: c */
    public final boolean f4489c = false;

    /* renamed from: d */
    public final boolean f4490d = false;

    public a(h0 h0Var) {
        this.f4487a = h0Var;
    }

    public static Set<? extends Annotation> c(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(x.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    @Override // ao.f.a
    public final f a(Type type, Annotation[] annotationArr) {
        s c10 = this.f4487a.c(type, c(annotationArr), null);
        if (this.f4488b) {
            c10 = new r(c10);
        }
        if (this.f4489c) {
            c10 = new s(c10);
        }
        if (this.f4490d) {
            c10 = new q(c10);
        }
        return new b(c10);
    }

    @Override // ao.f.a
    public final f<c0, ?> b(Type type, Annotation[] annotationArr, d0 d0Var) {
        s c10 = this.f4487a.c(type, c(annotationArr), null);
        if (this.f4488b) {
            c10 = new r(c10);
        }
        if (this.f4489c) {
            c10 = new s(c10);
        }
        if (this.f4490d) {
            c10 = new q(c10);
        }
        return new c(c10);
    }
}
