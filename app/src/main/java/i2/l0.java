package i2;

/* loaded from: classes.dex */
public final class l0 {
    public static final um.f0 a(fm.l lVar, Object obj, um.f0 f0Var) {
        try {
            lVar.k(obj);
        } catch (Throwable th2) {
            if (f0Var != null && f0Var.getCause() != th2) {
                ih.v.b(f0Var, th2);
            } else {
                return new um.f0(g4.g.a("Exception in undelivered element handler for ", obj), th2);
            }
        }
        return f0Var;
    }
}
