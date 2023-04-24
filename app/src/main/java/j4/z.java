package j4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Enumeration;

/* loaded from: classes.dex */
public final class z implements t0 {

    /* renamed from: a */
    public static z f17479a = new z();

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        d1 d1Var = i0Var.f17406j;
        if (obj == null) {
            d1Var.X(e1.WriteNullListAsEmpty);
            return;
        }
        Type type2 = null;
        int i11 = 0;
        if (d1Var.q(e1.WriteClassName) && (type instanceof ParameterizedType)) {
            type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        }
        Enumeration enumeration = (Enumeration) obj;
        y0 y0Var = i0Var.f17411o;
        i0Var.q(y0Var, obj, obj2);
        try {
            d1Var.write(91);
            while (enumeration.hasMoreElements()) {
                Object nextElement = enumeration.nextElement();
                int i12 = i11 + 1;
                if (i11 != 0) {
                    d1Var.write(44);
                }
                if (nextElement == null) {
                    d1Var.R();
                } else {
                    i0Var.l(nextElement.getClass()).e(i0Var, nextElement, Integer.valueOf(i12 - 1), type2, 0);
                }
                i11 = i12;
            }
            d1Var.write(93);
        } finally {
            i0Var.f17411o = y0Var;
        }
    }
}
