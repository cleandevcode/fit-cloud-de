package i4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: c */
    public final Type f16441c;

    /* renamed from: d */
    public int f16442d;

    /* renamed from: e */
    public t f16443e;

    public c(Class cls, n4.c cVar) {
        super(cls, cVar);
        Type type;
        Type type2 = cVar.f21952f;
        if (type2 instanceof ParameterizedType) {
            type = ((ParameterizedType) type2).getActualTypeArguments()[0];
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                if (upperBounds.length == 1) {
                    type = upperBounds[0];
                }
            }
        } else {
            type = Object.class;
        }
        this.f16441c = type;
    }

    @Override // i4.l
    public final int b() {
        return 14;
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01e1  */
    @Override // i4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(h4.a r19, java.lang.Object r20, java.lang.reflect.Type r21, java.util.HashMap r22) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.c.c(h4.a, java.lang.Object, java.lang.reflect.Type, java.util.HashMap):void");
    }
}
