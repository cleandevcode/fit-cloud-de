package u6;

@zl.e(c = "com.github.airbnb.mvrx.MavericksViewModelExtensionsKt$_internalSF$1", f = "MavericksViewModelExtensions.kt", l = {128, 130}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w extends zl.i implements fm.p<a<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28628e;

    /* renamed from: f */
    public /* synthetic */ Object f28629f;

    /* renamed from: g */
    public final /* synthetic */ fm.p<Object, xl.d<? super tl.l>, Object> f28630g;

    /* renamed from: h */
    public final /* synthetic */ fm.p<Throwable, xl.d<? super tl.l>, Object> f28631h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(fm.p<Object, ? super xl.d<? super tl.l>, ? extends Object> pVar, fm.p<? super Throwable, ? super xl.d<? super tl.l>, ? extends Object> pVar2, xl.d<? super w> dVar) {
        super(2, dVar);
        this.f28630g = pVar;
        this.f28631h = pVar2;
    }

    @Override // fm.p
    public final Object A(a<Object> aVar, xl.d<? super tl.l> dVar) {
        return ((w) p(aVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        w wVar = new w(this.f28630g, this.f28631h, dVar);
        wVar.f28629f = obj;
        return wVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28628e;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mf.a0.k(obj);
        } else {
            mf.a0.k(obj);
            a aVar2 = (a) this.f28629f;
            fm.p<Object, xl.d<? super tl.l>, Object> pVar = this.f28630g;
            if (pVar != null && (aVar2 instanceof a0)) {
                Object obj2 = ((a0) aVar2).f28523c;
                this.f28628e = 1;
                if (pVar.A(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                fm.p<Throwable, xl.d<? super tl.l>, Object> pVar2 = this.f28631h;
                if (pVar2 != null && (aVar2 instanceof g)) {
                    Throwable th2 = ((g) aVar2).f28543c;
                    this.f28628e = 2;
                    if (pVar2.A(th2, this) == aVar) {
                        return aVar;
                    }
                }
            }
        }
        return tl.l.f28297a;
    }
}
