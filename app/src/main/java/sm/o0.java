package sm;

@zl.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {33, 33}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o0 extends zl.i implements fm.q<g<Object>, Object[], xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f27277e;

    /* renamed from: f */
    public /* synthetic */ g f27278f;

    /* renamed from: g */
    public /* synthetic */ Object[] f27279g;

    /* renamed from: h */
    public final /* synthetic */ fm.q<Object, Object, xl.d<Object>, Object> f27280h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(fm.q<Object, Object, ? super xl.d<Object>, ? extends Object> qVar, xl.d<? super o0> dVar) {
        super(3, dVar);
        this.f27280h = qVar;
    }

    @Override // fm.q
    public final Object j(g<Object> gVar, Object[] objArr, xl.d<? super tl.l> dVar) {
        o0 o0Var = new o0(this.f27280h, dVar);
        o0Var.f27278f = gVar;
        o0Var.f27279g = objArr;
        return o0Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        g gVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f27277e;
        if (i10 == 0) {
            mf.a0.k(obj);
            gVar = this.f27278f;
            Object[] objArr = this.f27279g;
            fm.q<Object, Object, xl.d<Object>, Object> qVar = this.f27280h;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.f27278f = gVar;
            this.f27277e = 1;
            obj = qVar.j(obj2, obj3, this);
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
            gVar = this.f27278f;
            mf.a0.k(obj);
        }
        this.f27278f = null;
        this.f27277e = 2;
        if (gVar.n(obj, this) == aVar) {
            return aVar;
        }
        return tl.l.f28297a;
    }
}
