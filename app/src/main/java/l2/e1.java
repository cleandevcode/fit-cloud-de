package l2;

@zl.e(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", l = {188}, m = "generateNewPagingSource")
/* loaded from: classes.dex */
public final class e1 extends zl.c {

    /* renamed from: d */
    public c1 f18867d;

    /* renamed from: e */
    public l2 f18868e;

    /* renamed from: f */
    public /* synthetic */ Object f18869f;

    /* renamed from: g */
    public final /* synthetic */ c1<Object, Object> f18870g;

    /* renamed from: h */
    public int f18871h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(c1<Object, Object> c1Var, xl.d<? super e1> dVar) {
        super(dVar);
        this.f18870g = c1Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        this.f18869f = obj;
        this.f18871h |= Integer.MIN_VALUE;
        return c1.a(this.f18870g, null, this);
    }
}
