package sm;

/* loaded from: classes2.dex */
public final class m0 implements f<Object> {

    /* renamed from: a */
    public final /* synthetic */ f[] f27253a;

    /* renamed from: b */
    public final /* synthetic */ fm.r f27254b;

    @zl.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {333, 333}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.q<g<Object>, Object[], xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f27255e;

        /* renamed from: f */
        public /* synthetic */ g f27256f;

        /* renamed from: g */
        public /* synthetic */ Object[] f27257g;

        /* renamed from: h */
        public final /* synthetic */ fm.r f27258h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d dVar, fm.r rVar) {
            super(3, dVar);
            this.f27258h = rVar;
        }

        @Override // fm.q
        public final Object j(g<Object> gVar, Object[] objArr, xl.d<? super tl.l> dVar) {
            a aVar = new a(dVar, this.f27258h);
            aVar.f27256f = gVar;
            aVar.f27257g = objArr;
            return aVar.t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            g gVar;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f27255e;
            if (i10 == 0) {
                mf.a0.k(obj);
                gVar = this.f27256f;
                Object[] objArr = this.f27257g;
                fm.r rVar = this.f27258h;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.f27256f = gVar;
                this.f27255e = 1;
                obj = rVar.s(obj2, obj3, obj4, this);
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
                gVar = this.f27256f;
                mf.a0.k(obj);
            }
            this.f27256f = null;
            this.f27255e = 2;
            if (gVar.n(obj, this) == aVar) {
                return aVar;
            }
            return tl.l.f28297a;
        }
    }

    public m0(f[] fVarArr, fm.r rVar) {
        this.f27253a = fVarArr;
        this.f27254b = rVar;
    }

    @Override // sm.f
    public final Object a(g<? super Object> gVar, xl.d dVar) {
        Object c10 = p001if.d.c(dVar, new a(null, this.f27254b), gVar, this.f27253a);
        return c10 == yl.a.COROUTINE_SUSPENDED ? c10 : tl.l.f28297a;
    }
}
