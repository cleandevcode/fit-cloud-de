package i4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class g implements t {

    /* renamed from: a */
    public final Method f16446a;

    /* renamed from: b */
    public final Class f16447b;

    public g(Method method) {
        this.f16446a = method;
        this.f16447b = method.getParameterTypes()[0];
    }

    @Override // i4.t
    public final int b() {
        return 0;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        try {
            return (T) this.f16446a.invoke(null, aVar.P(null, this.f16447b));
        } catch (IllegalAccessException e10) {
            throw new e4.d("parse enum error", e10);
        } catch (InvocationTargetException e11) {
            throw new e4.d("parse enum error", e11);
        }
    }
}
