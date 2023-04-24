package j4;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class x0 implements t0, i4.t {

    /* renamed from: a */
    public static final x0 f17472a = new x0();

    @Override // i4.t
    public final int b() {
        return 12;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Object P = aVar.P(null, parameterizedType.getActualTypeArguments()[0]);
        Type rawType = parameterizedType.getRawType();
        if (rawType == AtomicReference.class) {
            return (T) new AtomicReference(P);
        }
        if (rawType == WeakReference.class) {
            return (T) new WeakReference(P);
        }
        if (rawType == SoftReference.class) {
            return (T) new SoftReference(P);
        }
        throw new UnsupportedOperationException(rawType.toString());
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        i0Var.s(obj instanceof AtomicReference ? ((AtomicReference) obj).get() : ((Reference) obj).get());
    }
}
