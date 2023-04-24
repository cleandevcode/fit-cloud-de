package l2;

@zl.e(c = "androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1", f = "Separators.kt", l = {580}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w2 extends zl.i implements fm.q<Object, Object, xl.d<Object>, Object> {

    /* renamed from: e */
    public int f19342e;

    /* renamed from: f */
    public /* synthetic */ Object f19343f;

    /* renamed from: g */
    public /* synthetic */ Object f19344g;

    /* renamed from: h */
    public final /* synthetic */ fm.q<Object, Object, xl.d<Object>, Object> f19345h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w2(fm.q<Object, Object, ? super xl.d<Object>, ? extends Object> qVar, xl.d<? super w2> dVar) {
        super(3, dVar);
        this.f19345h = qVar;
    }

    @Override // fm.q
    public final Object j(Object obj, Object obj2, xl.d<Object> dVar) {
        w2 w2Var = new w2(this.f19345h, dVar);
        w2Var.f19343f = obj;
        w2Var.f19344g = obj2;
        return w2Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19342e;
        if (i10 == 0) {
            mf.a0.k(obj);
            Object obj2 = this.f19343f;
            Object obj3 = this.f19344g;
            fm.q<Object, Object, xl.d<Object>, Object> qVar = this.f19345h;
            this.f19343f = null;
            this.f19342e = 1;
            obj = qVar.j(obj2, obj3, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            mf.a0.k(obj);
        }
        return obj;
    }
}
