package sa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* loaded from: classes.dex */
public final class g implements p<Object> {

    /* renamed from: a */
    public final /* synthetic */ Type f26757a;

    public g(Type type) {
        this.f26757a = type;
    }

    @Override // sa.p
    public final Object a() {
        Type type = this.f26757a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            StringBuilder a10 = android.support.v4.media.d.a("Invalid EnumSet type: ");
            a10.append(this.f26757a.toString());
            throw new qa.m(a10.toString());
        }
        StringBuilder a11 = android.support.v4.media.d.a("Invalid EnumSet type: ");
        a11.append(this.f26757a.toString());
        throw new qa.m(a11.toString());
    }
}
