package sm;

@zl.e(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {373, 380, 383}, m = "collect$suspendImpl")
/* loaded from: classes2.dex */
public final class x0 extends zl.c {

    /* renamed from: d */
    public w0 f27339d;

    /* renamed from: e */
    public g f27340e;

    /* renamed from: f */
    public y0 f27341f;

    /* renamed from: g */
    public pm.g1 f27342g;

    /* renamed from: h */
    public /* synthetic */ Object f27343h;

    /* renamed from: i */
    public final /* synthetic */ w0<Object> f27344i;

    /* renamed from: j */
    public int f27345j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(w0<Object> w0Var, xl.d<? super x0> dVar) {
        super(dVar);
        this.f27344i = w0Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        this.f27343h = obj;
        this.f27345j |= Integer.MIN_VALUE;
        w0.k(this.f27344i, null, this);
        return yl.a.COROUTINE_SUSPENDED;
    }
}
