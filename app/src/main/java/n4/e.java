package n4;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class e implements GenericArrayType {

    /* renamed from: a */
    public final Type f21966a;

    public e(Type type) {
        this.f21966a = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return this.f21966a.equals(((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f21966a;
    }

    public final int hashCode() {
        return this.f21966a.hashCode();
    }

    public final String toString() {
        String obj;
        Type type = this.f21966a;
        StringBuilder sb2 = new StringBuilder();
        if (type instanceof Class) {
            obj = ((Class) type).getName();
        } else {
            obj = type.toString();
        }
        sb2.append(obj);
        sb2.append("[]");
        return sb2.toString();
    }
}
