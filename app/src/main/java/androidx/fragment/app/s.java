package androidx.fragment.app;

/* loaded from: classes.dex */
public final class s implements o.a<Void, androidx.activity.result.g> {

    /* renamed from: a */
    public final /* synthetic */ r f2562a;

    public s(r rVar) {
        this.f2562a = rVar;
    }

    @Override // o.a
    public final androidx.activity.result.g apply(Void r32) {
        r rVar = this.f2562a;
        d0<?> d0Var = rVar.f2535t;
        if (d0Var instanceof androidx.activity.result.h) {
            return ((androidx.activity.result.h) d0Var).o();
        }
        return rVar.T0().f706i;
    }
}
