package j4;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class r implements t0, i4.t {

    /* renamed from: a */
    public static final r f17464a = new r();

    @Override // i4.t
    public final int b() {
        return 4;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        Object E = aVar.E(null);
        if (E == null) {
            return null;
        }
        return (T) n4.n.i(E);
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        d1 d1Var = i0Var.f17406j;
        Character ch2 = (Character) obj;
        if (ch2 == null) {
            d1Var.Z("");
        } else {
            d1Var.Z(ch2.charValue() == 0 ? "\u0000" : ch2.toString());
        }
    }
}
