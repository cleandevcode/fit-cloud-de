package s1;

import s1.q;
import sm.g1;
import sm.k1;

@zl.e(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u extends zl.i implements fm.p<sm.g<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f26498e;

    /* renamed from: f */
    public /* synthetic */ Object f26499f;

    /* renamed from: g */
    public final /* synthetic */ q<Object> f26500g;

    @zl.e(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.p<b0<Object>, xl.d<? super Boolean>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f26501e;

        /* renamed from: f */
        public final /* synthetic */ b0<Object> f26502f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0<Object> b0Var, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f26502f = b0Var;
        }

        @Override // fm.p
        public final Object A(b0<Object> b0Var, xl.d<? super Boolean> dVar) {
            return ((a) p(b0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f26502f, dVar);
            aVar.f26501e = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            b0<Object> b0Var = (b0) this.f26501e;
            b0<Object> b0Var2 = this.f26502f;
            boolean z10 = false;
            if (!(b0Var2 instanceof c) && !(b0Var2 instanceof j) && b0Var == b0Var2) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q<Object> qVar, xl.d<? super u> dVar) {
        super(2, dVar);
        this.f26500g = qVar;
    }

    @Override // fm.p
    public final Object A(sm.g<Object> gVar, xl.d<? super tl.l> dVar) {
        return ((u) p(gVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        u uVar = new u(this.f26500g, dVar);
        uVar.f26499f = obj;
        return uVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f26498e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = (sm.g) this.f26499f;
            b0 b0Var = (b0) this.f26500g.f26446h.getValue();
            if (!(b0Var instanceof c)) {
                this.f26500g.f26448j.a(new q.a.C0466a(b0Var));
            }
            g1 g1Var = this.f26500g.f26446h;
            a aVar2 = new a(b0Var, null);
            this.f26498e = 1;
            if (!(gVar instanceof k1)) {
                Object a10 = g1Var.a(new sm.w(new gm.x(), new v(gVar), aVar2), this);
                if (a10 != aVar) {
                    a10 = tl.l.f28297a;
                }
                if (a10 != aVar) {
                    a10 = tl.l.f28297a;
                }
                if (a10 != aVar) {
                    a10 = tl.l.f28297a;
                }
                if (a10 == aVar) {
                    return aVar;
                }
            } else {
                throw ((k1) gVar).f27243a;
            }
        }
        return tl.l.f28297a;
    }
}
