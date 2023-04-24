package v6;

import fm.p;
import gm.m;
import java.util.concurrent.CancellationException;
import pm.e0;
import tl.l;
import u6.a0;
import u6.g;
import u6.o;
import zl.i;

@zl.e(c = "com.github.kilnn.mvrx.MavericksViewModel$execute$3", f = "MavericksViewModel.kt", l = {185}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f29138e;

    /* renamed from: f */
    public final /* synthetic */ fm.l<xl.d<Object>, Object> f29139f;

    /* renamed from: g */
    public final /* synthetic */ v6.b<o> f29140g;

    /* renamed from: h */
    public final /* synthetic */ p<o, u6.a<Object>, o> f29141h;

    /* renamed from: i */
    public final /* synthetic */ mm.f<o, u6.a<Object>> f29142i;

    /* loaded from: classes.dex */
    public static final class a extends m implements fm.l<o, o> {

        /* renamed from: b */
        public final /* synthetic */ p<o, u6.a<Object>, o> f29143b;

        /* renamed from: c */
        public final /* synthetic */ Object f29144c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, p pVar) {
            super(1);
            this.f29143b = pVar;
            this.f29144c = obj;
        }

        @Override // fm.l
        public final o k(o oVar) {
            o oVar2 = oVar;
            gm.l.f(oVar2, "$this$setState");
            return this.f29143b.A(oVar2, new a0(this.f29144c));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends m implements fm.l<o, o> {

        /* renamed from: b */
        public final /* synthetic */ p<o, u6.a<Object>, o> f29145b;

        /* renamed from: c */
        public final /* synthetic */ Throwable f29146c;

        /* renamed from: d */
        public final /* synthetic */ mm.f<o, u6.a<Object>> f29147d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(p<o, ? super u6.a<Object>, o> pVar, Throwable th2, mm.f<o, ? extends u6.a<Object>> fVar) {
            super(1);
            this.f29145b = pVar;
            this.f29146c = th2;
            this.f29147d = fVar;
        }

        @Override // fm.l
        public final o k(o oVar) {
            u6.a<Object> aVar;
            o oVar2 = oVar;
            gm.l.f(oVar2, "$this$setState");
            p<o, u6.a<Object>, o> pVar = this.f29145b;
            Throwable th2 = this.f29146c;
            mm.f<o, u6.a<Object>> fVar = this.f29147d;
            return pVar.A(oVar2, new g((fVar == null || (aVar = fVar.get(oVar2)) == null) ? null : aVar.a(), th2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(fm.l<? super xl.d<Object>, ? extends Object> lVar, v6.b<o> bVar, p<o, ? super u6.a<Object>, o> pVar, mm.f<o, ? extends u6.a<Object>> fVar, xl.d<? super d> dVar) {
        super(2, dVar);
        this.f29139f = lVar;
        this.f29140g = bVar;
        this.f29141h = pVar;
        this.f29142i = fVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((d) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new d(this.f29139f, this.f29140g, this.f29141h, this.f29142i, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f29138e;
        try {
            if (i10 == 0) {
                mf.a0.k(obj);
                fm.l<xl.d<Object>, Object> lVar = this.f29139f;
                this.f29138e = 1;
                obj = lVar.k(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                mf.a0.k(obj);
            }
            this.f29140g.h(new a(obj, this.f29141h));
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            this.f29140g.h(new b(this.f29141h, th2, this.f29142i));
        }
        return l.f28297a;
    }
}
