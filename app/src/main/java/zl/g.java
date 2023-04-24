package zl;

/* loaded from: classes2.dex */
public abstract class g extends a {
    public g(xl.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.e() == xl.g.f30632a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // xl.d
    public final xl.f e() {
        return xl.g.f30632a;
    }
}
