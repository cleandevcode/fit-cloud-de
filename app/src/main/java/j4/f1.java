package j4;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class f1 implements t0, i4.t {

    /* renamed from: a */
    public static f1 f17400a = new f1();

    public static String f(h4.a aVar) {
        String I0;
        h4.c cVar = aVar.f15774f;
        if (cVar.h0() == 4) {
            I0 = cVar.W();
        } else if (cVar.h0() == 2) {
            I0 = cVar.I0();
        } else {
            Object E = aVar.E(null);
            if (E == null) {
                return null;
            }
            return E.toString();
        }
        cVar.J(16);
        return I0;
    }

    @Override // i4.t
    public final int b() {
        return 4;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        if (type == StringBuffer.class) {
            h4.c cVar = aVar.f15774f;
            if (cVar.h0() == 4) {
                String W = cVar.W();
                cVar.J(16);
                return (T) new StringBuffer(W);
            }
            Object E = aVar.E(null);
            if (E == null) {
                return null;
            }
            return (T) new StringBuffer(E.toString());
        } else if (type == StringBuilder.class) {
            h4.c cVar2 = aVar.f15774f;
            if (cVar2.h0() == 4) {
                String W2 = cVar2.W();
                cVar2.J(16);
                return (T) new StringBuilder(W2);
            }
            Object E2 = aVar.E(null);
            if (E2 == null) {
                return null;
            }
            return (T) new StringBuilder(E2.toString());
        } else {
            return (T) f(aVar);
        }
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        String str = (String) obj;
        d1 d1Var = i0Var.f17406j;
        if (str == null) {
            d1Var.X(e1.WriteNullStringAsEmpty);
        } else {
            d1Var.Z(str);
        }
    }
}
