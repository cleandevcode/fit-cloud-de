package i4;

import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p implements t {

    /* renamed from: a */
    public static final p f16464a = new p();

    @Override // i4.t
    public final int b() {
        return 12;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof TypeVariable) {
                genericComponentType = ((TypeVariable) genericComponentType).getBounds()[0];
            }
            ArrayList arrayList = new ArrayList();
            aVar.F(genericComponentType, arrayList, null);
            T t10 = (T) ((Object[]) Array.newInstance(n4.n.P(genericComponentType), arrayList.size()));
            arrayList.toArray(t10);
            return t10;
        } else if ((type instanceof Class) && type != Object.class && type != Serializable.class && type != Cloneable.class && type != Closeable.class && type != Comparable.class) {
            return (T) aVar.P(null, type);
        } else {
            return (T) aVar.E(obj);
        }
    }
}
