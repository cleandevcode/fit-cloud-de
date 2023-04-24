package sa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* loaded from: classes.dex */
public final class h implements p<Object> {

    /* renamed from: a */
    public final /* synthetic */ Type f26758a;

    public h(Type type) {
        this.f26758a = type;
    }

    @Override // sa.p
    public final Object a() {
        Type type = this.f26758a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            StringBuilder a10 = android.support.v4.media.d.a("Invalid EnumMap type: ");
            a10.append(this.f26758a.toString());
            throw new qa.m(a10.toString());
        }
        StringBuilder a11 = android.support.v4.media.d.a("Invalid EnumMap type: ");
        a11.append(this.f26758a.toString());
        throw new qa.m(a11.toString());
    }
}
