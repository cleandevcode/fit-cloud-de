package y3;

import java.util.concurrent.CancellationException;

@zl.e(c = "com.airbnb.mvrx.MavericksRepository$execute$5", f = "MavericksRepository.kt", l = {213}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f31094e;

    /* renamed from: f */
    public final /* synthetic */ fm.l<xl.d<Object>, Object> f31095f;

    /* renamed from: g */
    public final /* synthetic */ u<b0> f31096g;

    /* renamed from: h */
    public final /* synthetic */ fm.p<b0, y3.b<Object>, b0> f31097h;

    /* renamed from: i */
    public final /* synthetic */ mm.f<b0, y3.b<Object>> f31098i;

    /* loaded from: classes.dex */
    public static final class a extends gm.m implements fm.l<b0, b0> {

        /* renamed from: b */
        public final /* synthetic */ fm.p<b0, y3.b<Object>, b0> f31099b;

        /* renamed from: c */
        public final /* synthetic */ Object f31100c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, fm.p pVar) {
            super(1);
            this.f31099b = pVar;
            this.f31100c = obj;
        }

        @Override // fm.l
        public final b0 k(b0 b0Var) {
            b0 b0Var2 = b0Var;
            gm.l.f(b0Var2, "$this$setState");
            return this.f31099b.A(b0Var2, new c1(this.f31100c));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends gm.m implements fm.l<b0, b0> {

        /* renamed from: b */
        public final /* synthetic */ fm.p<b0, y3.b<Object>, b0> f31101b;

        /* renamed from: c */
        public final /* synthetic */ Throwable f31102c;

        /* renamed from: d */
        public final /* synthetic */ mm.f<b0, y3.b<Object>> f31103d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(fm.p<b0, ? super y3.b<Object>, b0> pVar, Throwable th2, mm.f<b0, ? extends y3.b<Object>> fVar) {
            super(1);
            this.f31101b = pVar;
            this.f31102c = th2;
            this.f31103d = fVar;
        }

        @Override // fm.l
        public final b0 k(b0 b0Var) {
            y3.b<Object> bVar;
            b0 b0Var2 = b0Var;
            gm.l.f(b0Var2, "$this$setState");
            fm.p<b0, y3.b<Object>, b0> pVar = this.f31101b;
            Throwable th2 = this.f31102c;
            mm.f<b0, y3.b<Object>> fVar = this.f31103d;
            return pVar.A(b0Var2, new j((fVar == null || (bVar = fVar.get(b0Var2)) == null) ? null : bVar.a(), th2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(fm.l<? super xl.d<Object>, ? extends Object> lVar, u<b0> uVar, fm.p<b0, ? super y3.b<Object>, b0> pVar, mm.f<b0, ? extends y3.b<Object>> fVar, xl.d<? super z> dVar) {
        super(2, dVar);
        this.f31095f = lVar;
        this.f31096g = uVar;
        this.f31097h = pVar;
        this.f31098i = fVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((z) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new z(this.f31095f, this.f31096g, this.f31097h, this.f31098i, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f31094e;
        try {
            if (i10 == 0) {
                mf.a0.k(obj);
                fm.l<xl.d<Object>, Object> lVar = this.f31095f;
                this.f31094e = 1;
                obj = lVar.k(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                mf.a0.k(obj);
            }
            this.f31096g.a(new a(obj, this.f31097h));
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            this.f31096g.a(new b(this.f31097h, th2, this.f31098i));
        }
        return tl.l.f28297a;
    }
}
