package yg;

import bi.z0;
import p000do.a;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageManagerImpl$getUserStorage$1", f = "UserStorageManager.kt", l = {241}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c0 extends zl.i implements fm.p<rm.t<? super o>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f31557e;

    /* renamed from: f */
    public /* synthetic */ Object f31558f;

    /* renamed from: g */
    public final /* synthetic */ b0 f31559g;

    /* renamed from: h */
    public final /* synthetic */ long f31560h;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageManagerImpl$getUserStorage$1$1", f = "UserStorageManager.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public final /* synthetic */ rm.t<o> f31561e;

        /* renamed from: f */
        public final /* synthetic */ p f31562f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(rm.t<? super o> tVar, p pVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f31561e = tVar;
            this.f31562f = pVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f31561e, this.f31562f, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            this.f31561e.p(this.f31562f);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.a<tl.l> {

        /* renamed from: b */
        public final /* synthetic */ p f31563b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f31563b = pVar;
        }

        @Override // fm.a
        public final tl.l m() {
            p pVar = this.f31563b;
            pVar.getClass();
            a.b bVar = p000do.a.f13275a;
            bVar.t("userStorage");
            bVar.b("release userId:" + pVar.f31609b, new Object[0]);
            bi.r.m(pVar.f31610c);
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b0 b0Var, long j10, xl.d<? super c0> dVar) {
        super(2, dVar);
        this.f31559g = b0Var;
        this.f31560h = j10;
    }

    @Override // fm.p
    public final Object A(rm.t<? super o> tVar, xl.d<? super tl.l> dVar) {
        return ((c0) p(tVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        c0 c0Var = new c0(this.f31559g, this.f31560h, dVar);
        c0Var.f31558f = obj;
        return c0Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f31557e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            rm.t tVar = (rm.t) this.f31558f;
            b0 b0Var = this.f31559g;
            p pVar = new p(b0Var.f31541a, this.f31560h, b0Var.f31543c);
            z0.g(tVar, null, 0, new a(tVar, pVar, null), 3);
            b bVar = new b(pVar);
            this.f31557e = 1;
            if (rm.r.a(tVar, bVar, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
