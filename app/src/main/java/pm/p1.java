package pm;

/* loaded from: classes2.dex */
public abstract class p1 extends b0 {
    public abstract p1 q0();

    @Override // pm.b0
    public String toString() {
        p1 p1Var;
        String str;
        wm.c cVar = o0.f24381a;
        p1 p1Var2 = um.q.f28935a;
        if (this == p1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                p1Var = p1Var2.q0();
            } catch (UnsupportedOperationException unused) {
                p1Var = null;
            }
            if (this == p1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            return getClass().getSimpleName() + '@' + g0.j(this);
        }
        return str;
    }
}
