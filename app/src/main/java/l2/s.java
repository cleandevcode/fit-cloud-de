package l2;

/* loaded from: classes.dex */
public final class s<T> implements sm.g<T> {

    /* renamed from: a */
    public final rm.z<T> f19239a;

    public s(z2 z2Var) {
        gm.l.f(z2Var, "channel");
        this.f19239a = z2Var;
    }

    @Override // sm.g
    public final Object n(T t10, xl.d<? super tl.l> dVar) {
        Object d10 = this.f19239a.d(t10, dVar);
        if (d10 == yl.a.COROUTINE_SUSPENDED) {
            return d10;
        }
        return tl.l.f28297a;
    }
}
