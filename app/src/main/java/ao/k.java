package ao;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a */
    public final Method f3832a;

    /* renamed from: b */
    public final List<?> f3833b;

    public k(Method method, ArrayList arrayList) {
        this.f3832a = method;
        this.f3833b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f3832a.getDeclaringClass().getName(), this.f3832a.getName(), this.f3833b);
    }
}
