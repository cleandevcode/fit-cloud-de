package yg;

import p000do.a;
import pm.e0;
import sm.f1;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageManagerImpl$flowUserStorage$1", f = "UserStorageManager.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z extends zl.i implements fm.p<e0, xl.d<? super f1<? extends o>>, Object> {

    /* renamed from: e */
    public int f31674e;

    /* renamed from: f */
    public final /* synthetic */ j f31675f;

    /* renamed from: g */
    public final /* synthetic */ b0 f31676g;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.p<Long, Long, Boolean> {

        /* renamed from: b */
        public static final a f31677b = new a();

        public a() {
            super(2);
        }

        @Override // fm.p
        public final Boolean A(Long l10, Long l11) {
            return Boolean.valueOf(gm.l.a(l10, l11));
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageManagerImpl$flowUserStorage$1$3", f = "UserStorageManager.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<o, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f31678e;

        public b(xl.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // fm.p
        public final Object A(o oVar, xl.d<? super tl.l> dVar) {
            return ((b) p(oVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f31678e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            a.b bVar = p000do.a.f13275a;
            bVar.t("UserStorageManager");
            bVar.h("flowUserStorage:" + ((o) this.f31678e), new Object[0]);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageManagerImpl$flowUserStorage$1$invokeSuspend$$inlined$flatMapLatest$1", f = "UserStorageManager.kt", l = {190}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements fm.q<sm.g<? super o>, Long, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f31679e;

        /* renamed from: f */
        public /* synthetic */ sm.g f31680f;

        /* renamed from: g */
        public /* synthetic */ Object f31681g;

        /* renamed from: h */
        public final /* synthetic */ b0 f31682h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b0 b0Var, xl.d dVar) {
            super(3, dVar);
            this.f31682h = b0Var;
        }

        @Override // fm.q
        public final Object j(sm.g<? super o> gVar, Long l10, xl.d<? super tl.l> dVar) {
            c cVar = new c(this.f31682h, dVar);
            cVar.f31680f = gVar;
            cVar.f31681g = l10;
            return cVar.t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            sm.f l10;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f31679e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                sm.g gVar = this.f31680f;
                Long l11 = (Long) this.f31681g;
                if (l11 == null) {
                    l10 = new sm.i(null);
                } else {
                    b0 b0Var = this.f31682h;
                    long longValue = l11.longValue();
                    b0Var.getClass();
                    l10 = bi.r.l(new c0(b0Var, longValue, null));
                }
                this.f31679e = 1;
                if (bi.r.v(this, l10, gVar) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(j jVar, b0 b0Var, xl.d<? super z> dVar) {
        super(2, dVar);
        this.f31675f = jVar;
        this.f31676g = b0Var;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super f1<? extends o>> dVar) {
        return ((z) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new z(this.f31675f, this.f31676g, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0033, code lost:
        if (r4.f27150c == r1) goto L15;
     */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r7) {
        /*
            r6 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r6.f31674e
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            mf.a0.k(r7)
            goto L5f
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            mf.a0.k(r7)
            yg.j r7 = r6.f31675f
            sm.f1 r7 = r7.h()
            yg.z$a r1 = yg.z.a.f31677b
            r3 = 2
            gm.e0.c(r3, r1)
            sm.l r3 = sm.l.f27244b
            boolean r4 = r7 instanceof sm.e
            if (r4 == 0) goto L36
            r4 = r7
            sm.e r4 = (sm.e) r4
            fm.l<T, java.lang.Object> r5 = r4.f27149b
            if (r5 != r3) goto L36
            fm.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r3 = r4.f27150c
            if (r3 != r1) goto L36
            goto L3c
        L36:
            sm.e r3 = new sm.e
            r3.<init>(r7, r1)
            r7 = r3
        L3c:
            yg.b0 r1 = r6.f31676g
            yg.z$c r3 = new yg.z$c
            r4 = 0
            r3.<init>(r1, r4)
            tm.j r7 = bi.r.O(r7, r3)
            yg.z$b r1 = new yg.z$b
            r1.<init>(r4)
            sm.k0 r3 = new sm.k0
            r3.<init>(r1, r7)
            yg.b0 r7 = r6.f31676g
            pm.e0 r7 = r7.f31542b
            r6.f31674e = r2
            java.lang.Object r7 = bi.r.L(r3, r7, r6)
            if (r7 != r0) goto L5f
            return r0
        L5f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.z.t(java.lang.Object):java.lang.Object");
    }
}
