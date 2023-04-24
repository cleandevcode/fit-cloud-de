package u6;

@zl.e(c = "com.github.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$2", f = "MavericksViewModelExtensions.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v extends zl.i implements fm.p<r<Object, Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28625e;

    /* renamed from: f */
    public /* synthetic */ Object f28626f;

    /* renamed from: g */
    public final /* synthetic */ fm.q<Object, Object, xl.d<? super tl.l>, Object> f28627g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(fm.q<Object, Object, ? super xl.d<? super tl.l>, ? extends Object> qVar, xl.d<? super v> dVar) {
        super(2, dVar);
        this.f28627g = qVar;
    }

    @Override // fm.p
    public final Object A(r<Object, Object> rVar, xl.d<? super tl.l> dVar) {
        return ((v) p(rVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        v vVar = new v(this.f28627g, dVar);
        vVar.f28626f = obj;
        return vVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28625e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            r rVar = (r) this.f28626f;
            Object obj2 = rVar.f28604a;
            Object obj3 = rVar.f28605b;
            fm.q<Object, Object, xl.d<? super tl.l>, Object> qVar = this.f28627g;
            this.f28625e = 1;
            if (qVar.j(obj2, obj3, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
