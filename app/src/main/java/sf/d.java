package sf;

import mf.a0;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.function.CoreMonitor$4", f = "CoreMonitor.kt", l = {105, 106}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f26917e;

    /* renamed from: f */
    public final /* synthetic */ i f26918f;

    @zl.e(c = "com.topstep.fitcloud.pro.function.CoreMonitor$4$1", f = "CoreMonitor.kt", l = {107}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<gg.b, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f26919e;

        /* renamed from: f */
        public /* synthetic */ Object f26920f;

        /* renamed from: g */
        public final /* synthetic */ i f26921g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f26921g = iVar;
        }

        @Override // fm.p
        public final Object A(gg.b bVar, xl.d<? super tl.l> dVar) {
            return ((a) p(bVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f26921g, dVar);
            aVar.f26920f = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:127:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x014f  */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 934
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: sf.d.a.t(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, xl.d<? super d> dVar) {
        super(2, dVar);
        this.f26918f = iVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new d(this.f26918f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f26917e;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    a0.k(obj);
                    return tl.l.f28297a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.k(obj);
        } else {
            a0.k(obj);
            this.f26917e = 1;
            if (a0.g(3000L, this) == aVar) {
                return aVar;
            }
        }
        sm.t u10 = bi.r.u(this.f26918f.f26937g.a(), 1);
        a aVar2 = new a(this.f26918f, null);
        this.f26917e = 2;
        if (bi.r.o(u10, aVar2, this) == aVar) {
            return aVar;
        }
        return tl.l.f28297a;
    }
}
