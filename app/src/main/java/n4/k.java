package n4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k implements ParameterizedType {

    /* renamed from: a */
    public final Type[] f22006a;

    /* renamed from: b */
    public final Type f22007b;

    /* renamed from: c */
    public final Type f22008c;

    public k(Type type, Type type2, Type[] typeArr) {
        this.f22006a = typeArr;
        this.f22007b = type;
        this.f22008c = type2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (Arrays.equals(this.f22006a, kVar.f22006a)) {
            Type type = this.f22007b;
            if (type == null ? kVar.f22007b == null : type.equals(kVar.f22007b)) {
                Type type2 = this.f22008c;
                Type type3 = kVar.f22008c;
                return type2 != null ? type2.equals(type3) : type3 == null;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f22006a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f22007b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f22008c;
    }

    public final int hashCode() {
        Type[] typeArr = this.f22006a;
        int hashCode = (typeArr != null ? Arrays.hashCode(typeArr) : 0) * 31;
        Type type = this.f22007b;
        int hashCode2 = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        Type type2 = this.f22008c;
        return hashCode2 + (type2 != null ? type2.hashCode() : 0);
    }
}
