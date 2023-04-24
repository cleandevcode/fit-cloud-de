package j4;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class f implements t0 {

    /* renamed from: a */
    public final Class<?> f17397a;

    /* renamed from: b */
    public final t0 f17398b;

    public f(t0 t0Var, Class cls) {
        this.f17397a = cls;
        this.f17398b = t0Var;
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        t0 l10;
        d1 d1Var = i0Var.f17406j;
        if (obj == null) {
            d1Var.X(e1.WriteNullListAsEmpty);
            return;
        }
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        y0 y0Var = i0Var.f17411o;
        i0Var.q(y0Var, obj, obj2);
        try {
            d1Var.write(91);
            for (int i11 = 0; i11 < length; i11++) {
                if (i11 != 0) {
                    d1Var.write(44);
                }
                Object obj3 = objArr[i11];
                if (obj3 == null) {
                    if (d1Var.q(e1.WriteNullStringAsEmpty) && (obj instanceof String[])) {
                        d1Var.Z("");
                    } else {
                        d1Var.b("null");
                    }
                } else {
                    if (obj3.getClass() == this.f17397a) {
                        l10 = this.f17398b;
                    } else {
                        l10 = i0Var.l(obj3.getClass());
                    }
                    l10.e(i0Var, obj3, Integer.valueOf(i11), null, 0);
                }
            }
            d1Var.write(93);
        } finally {
            i0Var.f17411o = y0Var;
        }
    }
}
