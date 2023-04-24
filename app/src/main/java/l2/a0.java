package l2;

@zl.e(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {262}, m = "getStateAsEvents")
/* loaded from: classes.dex */
public final class a0 extends zl.c {

    /* renamed from: d */
    public b0 f18696d;

    /* renamed from: e */
    public ym.c f18697e;

    /* renamed from: f */
    public /* synthetic */ Object f18698f;

    /* renamed from: g */
    public final /* synthetic */ b0<Object> f18699g;

    /* renamed from: h */
    public int f18700h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0<Object> b0Var, xl.d<? super a0> dVar) {
        super(dVar);
        this.f18699g = b0Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        this.f18698f = obj;
        this.f18700h |= Integer.MIN_VALUE;
        return this.f18699g.a(this);
    }
}
