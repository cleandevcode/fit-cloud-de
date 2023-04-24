package l2;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a */
    public static final Object f18875a = new Object();

    @zl.e(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", l = {86}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a<R> extends zl.i implements fm.p<z2<R>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f18876e;

        /* renamed from: f */
        public /* synthetic */ Object f18877f;

        /* renamed from: g */
        public final /* synthetic */ sm.f<T> f18878g;

        /* renamed from: h */
        public final /* synthetic */ fm.q<sm.g<? super R>, T, xl.d<? super tl.l>, Object> f18879h;

        @zl.e(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", l = {87}, m = "invokeSuspend")
        /* renamed from: l2.f0$a$a */
        /* loaded from: classes.dex */
        public static final class C0329a<T> extends zl.i implements fm.p<T, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f18880e;

            /* renamed from: f */
            public /* synthetic */ Object f18881f;

            /* renamed from: g */
            public final /* synthetic */ fm.q<sm.g<? super R>, T, xl.d<? super tl.l>, Object> f18882g;

            /* renamed from: h */
            public final /* synthetic */ s<R> f18883h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0329a(fm.q<? super sm.g<? super R>, ? super T, ? super xl.d<? super tl.l>, ? extends Object> qVar, s<R> sVar, xl.d<? super C0329a> dVar) {
                super(2, dVar);
                this.f18882g = qVar;
                this.f18883h = sVar;
            }

            @Override // fm.p
            public final Object A(Object obj, xl.d<? super tl.l> dVar) {
                return ((C0329a) p(obj, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                C0329a c0329a = new C0329a(this.f18882g, this.f18883h, dVar);
                c0329a.f18881f = obj;
                return c0329a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f18880e;
                if (i10 == 0) {
                    mf.a0.k(obj);
                    Object obj2 = this.f18881f;
                    s<R> sVar = this.f18883h;
                    this.f18880e = 1;
                    if (this.f18882g.j(sVar, obj2, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    mf.a0.k(obj);
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(sm.f<? extends T> fVar, fm.q<? super sm.g<? super R>, ? super T, ? super xl.d<? super tl.l>, ? extends Object> qVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f18878g = fVar;
            this.f18879h = qVar;
        }

        @Override // fm.p
        public final Object A(Object obj, xl.d<? super tl.l> dVar) {
            return ((a) p((z2) obj, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f18878g, this.f18879h, dVar);
            aVar.f18877f = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f18876e;
            if (i10 == 0) {
                mf.a0.k(obj);
                sm.f<T> fVar = this.f18878g;
                C0329a c0329a = new C0329a(this.f18879h, new s((z2) this.f18877f), null);
                this.f18876e = 1;
                if (bi.r.o(fVar, c0329a, this) == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                mf.a0.k(obj);
            }
            return tl.l.f28297a;
        }
    }

    public static final <T, R> sm.f<R> a(sm.f<? extends T> fVar, fm.q<? super sm.g<? super R>, ? super T, ? super xl.d<? super tl.l>, ? extends Object> qVar) {
        return y2.a(new a(fVar, qVar, null));
    }
}
