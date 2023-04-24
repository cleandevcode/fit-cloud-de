package m2;

import bi.z0;
import pm.e0;
import pm.g1;
import pm.j1;
import xl.e;
import xl.f;

/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ pm.i<xl.e> f20292a;

    /* renamed from: b */
    public final /* synthetic */ g1 f20293b;

    @zl.e(c = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", f = "RoomDatabaseExt.kt", l = {125}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f20294e;

        /* renamed from: f */
        public /* synthetic */ Object f20295f;

        /* renamed from: g */
        public final /* synthetic */ pm.i<xl.e> f20296g;

        /* renamed from: h */
        public final /* synthetic */ g1 f20297h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(pm.i<? super xl.e> iVar, g1 g1Var, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f20296g = iVar;
            this.f20297h = g1Var;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f20296g, this.f20297h, dVar);
            aVar.f20295f = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f20294e;
            if (i10 == 0) {
                mf.a0.k(obj);
                pm.i<xl.e> iVar = this.f20296g;
                xl.f E = ((e0) this.f20295f).E();
                int i11 = xl.e.f30629b0;
                f.b b10 = E.b(e.a.f30630a);
                gm.l.c(b10);
                iVar.l(b10);
                g1 g1Var = this.f20297h;
                this.f20294e = 1;
                if (g1Var.R(this) == aVar) {
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

    public v(pm.j jVar, j1 j1Var) {
        this.f20292a = jVar;
        this.f20293b = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z0.n(new a(this.f20292a, this.f20293b, null));
    }
}
