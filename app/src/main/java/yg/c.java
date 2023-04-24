package yg;

import bi.z0;
import p000do.a;
import pm.e0;
import pm.g1;
import sm.f1;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$awaitAuthedUserId$2", f = "GlobalStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends zl.i implements fm.p<e0, xl.d<? super g1>, Object> {

    /* renamed from: e */
    public /* synthetic */ Object f31548e;

    /* renamed from: f */
    public final /* synthetic */ b f31549f;

    /* renamed from: g */
    public final /* synthetic */ Long f31550g;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$awaitAuthedUserId$2$1", f = "GlobalStorageImpl.kt", l = {229}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f31551e;

        /* renamed from: f */
        public /* synthetic */ Object f31552f;

        /* renamed from: g */
        public final /* synthetic */ b f31553g;

        /* renamed from: h */
        public final /* synthetic */ Long f31554h;

        /* renamed from: yg.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C0582a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ Long f31555a;

            /* renamed from: b */
            public final /* synthetic */ e0 f31556b;

            public C0582a(Long l10, e0 e0Var) {
                this.f31555a = l10;
                this.f31556b = e0Var;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                Long l10 = (Long) obj;
                a.b bVar = p000do.a.f13275a;
                bVar.t("globalStorage");
                bVar.h("awaitAuthedUserId:" + l10, new Object[0]);
                if (gm.l.a(l10, this.f31555a)) {
                    bi.r.m(this.f31556b);
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, Long l10, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f31553g = bVar;
            this.f31554h = l10;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            return yl.a.COROUTINE_SUSPENDED;
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f31553g, this.f31554h, dVar);
            aVar.f31552f = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f31551e;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mf.a0.k(obj);
            } else {
                mf.a0.k(obj);
                f1<Long> f1Var = this.f31553g.f31487f;
                C0582a c0582a = new C0582a(this.f31554h, (e0) this.f31552f);
                this.f31551e = 1;
                if (f1Var.a(c0582a, this) == aVar) {
                    return aVar;
                }
            }
            throw new u2.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, Long l10, xl.d<? super c> dVar) {
        super(2, dVar);
        this.f31549f = bVar;
        this.f31550g = l10;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super g1> dVar) {
        return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        c cVar = new c(this.f31549f, this.f31550g, dVar);
        cVar.f31548e = obj;
        return cVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        return z0.g((e0) this.f31548e, null, 0, new a(this.f31549f, this.f31550g, null), 3);
    }
}
