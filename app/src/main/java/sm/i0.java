package sm;

import pm.g1;

@zl.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {340}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f27204e;

    /* renamed from: f */
    public /* synthetic */ Object f27205f;

    /* renamed from: g */
    public final /* synthetic */ f<Object> f27206g;

    /* renamed from: h */
    public final /* synthetic */ pm.q<f1<Object>> f27207h;

    /* loaded from: classes2.dex */
    public static final class a<T> implements g {

        /* renamed from: a */
        public final /* synthetic */ gm.a0<r0<T>> f27208a;

        /* renamed from: b */
        public final /* synthetic */ pm.e0 f27209b;

        /* renamed from: c */
        public final /* synthetic */ pm.q<f1<T>> f27210c;

        public a(gm.a0<r0<T>> a0Var, pm.e0 e0Var, pm.q<f1<T>> qVar) {
            this.f27208a = a0Var;
            this.f27209b = e0Var;
            this.f27210c = qVar;
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [T, sm.g1] */
        @Override // sm.g
        public final Object n(T t10, xl.d<? super tl.l> dVar) {
            tl.l lVar;
            r0<T> r0Var = this.f27208a.f15485a;
            if (r0Var != null) {
                r0Var.setValue(t10);
                lVar = tl.l.f28297a;
            } else {
                lVar = null;
            }
            if (lVar == null) {
                pm.e0 e0Var = this.f27209b;
                gm.a0<r0<T>> a0Var = this.f27208a;
                pm.q<f1<T>> qVar = this.f27210c;
                ?? r52 = (T) bi.r.c(t10);
                xl.f E = e0Var.E();
                pm.g1 g1Var = (pm.g1) E.b(g1.b.f24341a);
                if (g1Var != null) {
                    qVar.P(new t0(r52, g1Var));
                    a0Var.f15485a = r52;
                } else {
                    throw new IllegalStateException(("Current context doesn't contain Job in it: " + E).toString());
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f<Object> fVar, pm.q<f1<Object>> qVar, xl.d<? super i0> dVar) {
        super(2, dVar);
        this.f27206g = fVar;
        this.f27207h = qVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((i0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        i0 i0Var = new i0(this.f27206g, this.f27207h, dVar);
        i0Var.f27205f = obj;
        return i0Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f27204e;
        try {
            if (i10 == 0) {
                mf.a0.k(obj);
                pm.e0 e0Var = (pm.e0) this.f27205f;
                gm.a0 a0Var = new gm.a0();
                f<Object> fVar = this.f27206g;
                a aVar2 = new a(a0Var, e0Var, this.f27207h);
                this.f27204e = 1;
                if (fVar.a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                mf.a0.k(obj);
            }
            return tl.l.f28297a;
        } catch (Throwable th2) {
            this.f27207h.J(th2);
            throw th2;
        }
    }
}
