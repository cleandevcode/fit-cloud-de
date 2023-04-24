package sm;

@zl.e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {214, 214}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z extends zl.i implements fm.q<g<Object>, Object, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f27355e;

    /* renamed from: f */
    public /* synthetic */ g f27356f;

    /* renamed from: g */
    public /* synthetic */ Object f27357g;

    /* renamed from: h */
    public final /* synthetic */ fm.p<Object, xl.d<Object>, Object> f27358h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(fm.p<Object, ? super xl.d<Object>, ? extends Object> pVar, xl.d<? super z> dVar) {
        super(3, dVar);
        this.f27358h = pVar;
    }

    @Override // fm.q
    public final Object j(g<Object> gVar, Object obj, xl.d<? super tl.l> dVar) {
        z zVar = new z(this.f27358h, dVar);
        zVar.f27356f = gVar;
        zVar.f27357g = obj;
        return zVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        g gVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f27355e;
        if (i10 == 0) {
            mf.a0.k(obj);
            gVar = this.f27356f;
            Object obj2 = this.f27357g;
            fm.p<Object, xl.d<Object>, Object> pVar = this.f27358h;
            this.f27356f = gVar;
            this.f27355e = 1;
            obj = pVar.A(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                mf.a0.k(obj);
                return tl.l.f28297a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            gVar = this.f27356f;
            mf.a0.k(obj);
        }
        this.f27356f = null;
        this.f27355e = 2;
        if (gVar.n(obj, this) == aVar) {
            return aVar;
        }
        return tl.l.f28297a;
    }
}
