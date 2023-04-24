package yg;

import bi.z0;
import p000do.a;
import pm.e0;
import pm.g1;
import sm.f1;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageManagerImpl$awaitAuthedUserId$2", f = "UserStorageManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v extends zl.i implements fm.p<e0, xl.d<? super g1>, Object> {

    /* renamed from: e */
    public /* synthetic */ Object f31654e;

    /* renamed from: f */
    public final /* synthetic */ b0 f31655f;

    /* renamed from: g */
    public final /* synthetic */ Long f31656g;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageManagerImpl$awaitAuthedUserId$2$1", f = "UserStorageManager.kt", l = {112}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f31657e;

        /* renamed from: f */
        public /* synthetic */ Object f31658f;

        /* renamed from: g */
        public final /* synthetic */ b0 f31659g;

        /* renamed from: h */
        public final /* synthetic */ Long f31660h;

        /* renamed from: yg.v$a$a */
        /* loaded from: classes2.dex */
        public static final class C0590a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ Long f31661a;

            /* renamed from: b */
            public final /* synthetic */ e0 f31662b;

            public C0590a(Long l10, e0 e0Var) {
                this.f31661a = l10;
                this.f31662b = e0Var;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                Long l10;
                o oVar = (o) obj;
                a.b bVar = p000do.a.f13275a;
                bVar.t("UserStorageManager");
                bVar.h("awaitAuthedUserId:" + oVar, new Object[0]);
                if (oVar != null) {
                    l10 = new Long(oVar.n());
                } else {
                    l10 = null;
                }
                if (gm.l.a(l10, this.f31661a)) {
                    bi.r.m(this.f31662b);
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var, Long l10, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f31659g = b0Var;
            this.f31660h = l10;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            return yl.a.COROUTINE_SUSPENDED;
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f31659g, this.f31660h, dVar);
            aVar.f31658f = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f31657e;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mf.a0.k(obj);
            } else {
                mf.a0.k(obj);
                f1<o> f1Var = this.f31659g.f31544d;
                C0590a c0590a = new C0590a(this.f31660h, (e0) this.f31658f);
                this.f31657e = 1;
                if (f1Var.a(c0590a, this) == aVar) {
                    return aVar;
                }
            }
            throw new u2.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b0 b0Var, Long l10, xl.d<? super v> dVar) {
        super(2, dVar);
        this.f31655f = b0Var;
        this.f31656g = l10;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super g1> dVar) {
        return ((v) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        v vVar = new v(this.f31655f, this.f31656g, dVar);
        vVar.f31654e = obj;
        return vVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        return z0.g((e0) this.f31654e, null, 0, new a(this.f31655f, this.f31656g, null), 3);
    }
}
