package pm;

/* loaded from: classes2.dex */
public final class f2 extends b0 {

    /* renamed from: c */
    public static final /* synthetic */ int f24340c = 0;

    static {
        new f2();
    }

    @Override // pm.b0
    public final void l0(xl.f fVar, Runnable runnable) {
        i2 i2Var = (i2) fVar.b(i2.f24348c);
        if (i2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        i2Var.f24349b = true;
    }

    @Override // pm.b0
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
