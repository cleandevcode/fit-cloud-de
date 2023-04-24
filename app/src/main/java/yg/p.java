package yg;

import ah.e;
import android.content.Context;
import bi.z0;
import ch.b;
import p000do.a;
import pm.e0;
import tg.i;
import v1.d;
import xl.f;
import yg.b0;

/* loaded from: classes2.dex */
public final class p implements o {

    /* renamed from: g */
    public static final /* synthetic */ mm.h<Object>[] f31599g;

    /* renamed from: h */
    public static final d.a<Integer> f31600h;

    /* renamed from: i */
    public static final d.a<Long> f31601i;

    /* renamed from: j */
    public static final d.a<Long> f31602j;

    /* renamed from: k */
    public static final d.a<Integer> f31603k;

    /* renamed from: l */
    public static final d.a<Long> f31604l;

    /* renamed from: m */
    public static final d.a<Boolean> f31605m;

    /* renamed from: n */
    public static final d.a<Integer> f31606n;

    /* renamed from: o */
    public static final d.a<Integer> f31607o;

    /* renamed from: a */
    public final Context f31608a;

    /* renamed from: b */
    public final long f31609b;

    /* renamed from: c */
    public final um.f f31610c;

    /* renamed from: d */
    public volatile boolean f31611d;

    /* renamed from: e */
    public volatile int f31612e;

    /* renamed from: f */
    public final u1.c f31613f;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageImpl$1", f = "UserStorage.kt", l = {88, 89}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public p f31614e;

        /* renamed from: f */
        public int f31615f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            p.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            p pVar;
            p pVar2;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f31615f;
            try {
            } catch (Exception e10) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("userStorage");
                bVar.q(e10);
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        pVar2 = this.f31614e;
                        mf.a0.k(obj);
                        pVar2.f31612e = ((Number) obj).intValue();
                        return tl.l.f28297a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = this.f31614e;
                mf.a0.k(obj);
            } else {
                mf.a0.k(obj);
                pVar = p.this;
                s1.i<v1.d> x10 = pVar.x(pVar.f31608a);
                d.a<Boolean> aVar2 = p.f31605m;
                Boolean bool = Boolean.FALSE;
                this.f31614e = pVar;
                this.f31615f = 1;
                obj = yg.a.a(x10, aVar2, bool, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            pVar.f31611d = ((Boolean) obj).booleanValue();
            p pVar3 = p.this;
            s1.i<v1.d> x11 = pVar3.x(pVar3.f31608a);
            d.a<Integer> aVar3 = p.f31606n;
            Integer num = new Integer(0);
            this.f31614e = pVar3;
            this.f31615f = 2;
            Object a10 = yg.a.a(x11, aVar3, num, this);
            if (a10 == aVar) {
                return aVar;
            }
            pVar2 = pVar3;
            obj = a10;
            pVar2.f31612e = ((Number) obj).intValue();
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageImpl", f = "UserStorage.kt", l = {210, 219}, m = "disabledWomenHealth")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public p f31617d;

        /* renamed from: e */
        public /* synthetic */ Object f31618e;

        /* renamed from: g */
        public int f31620g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            p.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f31618e = obj;
            this.f31620g |= Integer.MIN_VALUE;
            return p.this.q(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageImpl", f = "UserStorage.kt", l = {200, 206}, m = "enabledWomenHealth")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public p f31621d;

        /* renamed from: e */
        public /* synthetic */ Object f31622e;

        /* renamed from: g */
        public int f31624g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            p.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f31622e = obj;
            this.f31624g |= Integer.MIN_VALUE;
            return p.this.h(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageImpl", f = "UserStorage.kt", l = {154}, m = "getRecordDataUpdateTime")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f31625d;

        /* renamed from: f */
        public int f31627f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            p.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f31625d = obj;
            this.f31627f |= Integer.MIN_VALUE;
            return p.this.w(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageImpl", f = "UserStorage.kt", l = {165, 166}, m = "getRecordDataUploadAttempts")
    /* loaded from: classes2.dex */
    public static final class e extends zl.c {

        /* renamed from: d */
        public p f31628d;

        /* renamed from: e */
        public d.a f31629e;

        /* renamed from: f */
        public int f31630f;

        /* renamed from: g */
        public /* synthetic */ Object f31631g;

        /* renamed from: i */
        public int f31633i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(dVar);
            p.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f31631g = obj;
            this.f31633i |= Integer.MIN_VALUE;
            return p.this.g(null, this);
        }
    }

    static {
        gm.v vVar = new gm.v(p.class, "userDataStore", "getUserDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        gm.b0.f15488a.getClass();
        f31599g = new mm.h[]{vVar};
        f31600h = rm.l.k("hour_style");
        f31601i = new d.a<>("last_sync_time");
        f31602j = new d.a<>("f_msg_update_time");
        f31603k = rm.l.k("f_msg_unread_count");
        f31604l = new d.a<>("f_msg_read_time");
        f31605m = new d.a<>("n_screen_off");
        f31606n = rm.l.k("n_common_flags");
        f31607o = rm.l.k("women_health_mode");
    }

    public p(Context context, long j10, pm.b0 b0Var) {
        gm.l.f(context, "context");
        gm.l.f(b0Var, "ioDispatcher");
        this.f31608a = context;
        this.f31609b = j10;
        um.f b10 = bi.r.b(f.a.a(b0Var, z0.a()));
        this.f31610c = b10;
        this.f31613f = n6.a0.m("userStorage:" + j10, b10);
        z0.g(b10, null, 0, new a(null), 3);
        a.b bVar = p000do.a.f13275a;
        bVar.t("userStorage");
        bVar.b("init userId:" + j10, new Object[0]);
    }

    @Override // yg.o
    public final Object a(boolean z10, xl.d<? super tl.l> dVar) {
        this.f31611d = z10;
        Object c10 = yg.a.c(x(this.f31608a), f31605m, Boolean.valueOf(z10), dVar);
        if (c10 == yl.a.COROUTINE_SUSPENDED) {
            return c10;
        }
        return tl.l.f28297a;
    }

    @Override // yg.o
    public final boolean b() {
        return this.f31611d;
    }

    @Override // yg.o
    public final Object c(int i10, xl.d<? super tl.l> dVar) {
        this.f31612e = i10;
        Object c10 = yg.a.c(x(this.f31608a), f31606n, new Integer(i10), dVar);
        if (c10 == yl.a.COROUTINE_SUSPENDED) {
            return c10;
        }
        return tl.l.f28297a;
    }

    @Override // yg.o
    public final int d() {
        return this.f31612e;
    }

    @Override // yg.o
    public final Object e(int i10, xl.d<? super tl.l> dVar) {
        Object c10 = yg.a.c(x(this.f31608a), f31600h, new Integer(i10), dVar);
        if (c10 == yl.a.COROUTINE_SUSPENDED) {
            return c10;
        }
        return tl.l.f28297a;
    }

    @Override // yg.o
    public final r f() {
        return new r(x(this.f31608a).getData());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    @Override // yg.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(yg.n r7, xl.d<? super java.lang.Integer> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof yg.p.e
            if (r0 == 0) goto L13
            r0 = r8
            yg.p$e r0 = (yg.p.e) r0
            int r1 = r0.f31633i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31633i = r1
            goto L18
        L13:
            yg.p$e r0 = new yg.p$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f31631g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f31633i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            int r7 = r0.f31630f
            mf.a0.k(r8)
            goto L95
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            v1.d$a r7 = r0.f31629e
            yg.p r2 = r0.f31628d
            mf.a0.k(r8)
            goto L72
        L3c:
            mf.a0.k(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = r7.name()
            r8.append(r7)
            java.lang.String r7 = "_upload_attempts"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            v1.d$a r7 = rm.l.k(r7)
            android.content.Context r8 = r6.f31608a
            s1.i r8 = r6.x(r8)
            r2 = 0
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r2)
            r0.f31628d = r6
            r0.f31629e = r7
            r0.f31633i = r4
            java.lang.Object r8 = yg.a.a(r8, r7, r5, r0)
            if (r8 != r1) goto L71
            return r1
        L71:
            r2 = r6
        L72:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r8 = r8 + r4
            android.content.Context r4 = r2.f31608a
            s1.i r2 = r2.x(r4)
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r8)
            r5 = 0
            r0.f31628d = r5
            r0.f31629e = r5
            r0.f31630f = r8
            r0.f31633i = r3
            java.lang.Object r7 = yg.a.c(r2, r7, r4, r0)
            if (r7 != r1) goto L94
            return r1
        L94:
            r7 = r8
        L95:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.p.g(yg.n, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0074 A[RETURN] */
    @Override // yg.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(xl.d<? super tl.l> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof yg.p.c
            if (r0 == 0) goto L13
            r0 = r8
            yg.p$c r0 = (yg.p.c) r0
            int r1 = r0.f31624g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31624g = r1
            goto L18
        L13:
            yg.p$c r0 = new yg.p$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f31622e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f31624g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            mf.a0.k(r8)
            goto L75
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            yg.p r2 = r0.f31621d
            mf.a0.k(r8)
            goto L50
        L39:
            mf.a0.k(r8)
            android.content.Context r8 = r7.f31608a
            s1.i r8 = r7.x(r8)
            v1.d$a<java.lang.Integer> r2 = yg.p.f31607o
            r0.f31621d = r7
            r0.f31624g = r4
            java.lang.Object r8 = yg.a.b(r8, r2, r5, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            r2 = r7
        L50:
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 != 0) goto L55
            goto L5d
        L55:
            int r8 = r8.intValue()
            int r4 = java.lang.Math.abs(r8)
        L5d:
            android.content.Context r8 = r2.f31608a
            s1.i r8 = r2.x(r8)
            v1.d$a<java.lang.Integer> r2 = yg.p.f31607o
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            r0.f31621d = r5
            r0.f31624g = r3
            java.lang.Object r8 = yg.a.c(r8, r2, r6, r0)
            if (r8 != r1) goto L75
            return r1
        L75:
            tl.l r8 = tl.l.f28297a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.p.h(xl.d):java.lang.Object");
    }

    @Override // yg.o
    public final Object i(int i10, xl.d<? super tl.l> dVar) {
        Object c10 = yg.a.c(x(this.f31608a), f31603k, new Integer(i10), dVar);
        if (c10 == yl.a.COROUTINE_SUSPENDED) {
            return c10;
        }
        return tl.l.f28297a;
    }

    @Override // yg.o
    public final q j() {
        return new q(x(this.f31608a).getData());
    }

    @Override // yg.o
    public final Object k(int i10, e.C0006e c0006e) {
        Object c10 = yg.a.c(x(this.f31608a), f31607o, new Integer(i10), c0006e);
        if (c10 == yl.a.COROUTINE_SUSPENDED) {
            return c10;
        }
        return tl.l.f28297a;
    }

    @Override // yg.o
    public final Object l(long j10, b.C0072b c0072b) {
        Object c10 = yg.a.c(x(this.f31608a), f31601i, new Long(j10), c0072b);
        if (c10 == yl.a.COROUTINE_SUSPENDED) {
            return c10;
        }
        return tl.l.f28297a;
    }

    @Override // yg.o
    public final Object m(b0.a aVar) {
        return yg.a.a(x(this.f31608a), f31600h, new Integer(0), aVar);
    }

    @Override // yg.o
    public final long n() {
        return this.f31609b;
    }

    @Override // yg.o
    public final Object o(long j10, n nVar, xl.d dVar) {
        Object c10 = yg.a.c(x(this.f31608a), rm.l.w(nVar.name() + "_update_condition"), String.valueOf(j10), dVar);
        return c10 == yl.a.COROUTINE_SUSPENDED ? c10 : tl.l.f28297a;
    }

    @Override // yg.o
    public final Object p(xl.d<? super Long> dVar) {
        return yg.a.a(x(this.f31608a), f31602j, new Long(0L), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0076 A[RETURN] */
    @Override // yg.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(xl.d<? super tl.l> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof yg.p.b
            if (r0 == 0) goto L13
            r0 = r7
            yg.p$b r0 = (yg.p.b) r0
            int r1 = r0.f31620g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31620g = r1
            goto L18
        L13:
            yg.p$b r0 = new yg.p$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31618e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f31620g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            mf.a0.k(r7)
            goto L77
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            yg.p r2 = r0.f31617d
            mf.a0.k(r7)
            goto L50
        L39:
            mf.a0.k(r7)
            android.content.Context r7 = r6.f31608a
            s1.i r7 = r6.x(r7)
            v1.d$a<java.lang.Integer> r2 = yg.p.f31607o
            r0.f31617d = r6
            r0.f31620g = r4
            java.lang.Object r7 = yg.a.b(r7, r2, r5, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r2 = r6
        L50:
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L56
            r4 = r5
            goto L64
        L56:
            int r7 = r7.intValue()
            int r7 = java.lang.Math.abs(r7)
            int r7 = -r7
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
        L64:
            android.content.Context r7 = r2.f31608a
            s1.i r7 = r2.x(r7)
            v1.d$a<java.lang.Integer> r2 = yg.p.f31607o
            r0.f31617d = r5
            r0.f31620g = r3
            java.lang.Object r7 = yg.a.c(r7, r2, r4, r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            tl.l r7 = tl.l.f28297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.p.q(xl.d):java.lang.Object");
    }

    @Override // yg.o
    public final Object r(long j10, xl.d<? super tl.l> dVar) {
        Object c10 = yg.a.c(x(this.f31608a), f31602j, new Long(j10), dVar);
        if (c10 == yl.a.COROUTINE_SUSPENDED) {
            return c10;
        }
        return tl.l.f28297a;
    }

    @Override // yg.o
    public final Object s(i.c cVar) {
        return yg.a.a(x(this.f31608a), f31604l, new Long(0L), cVar);
    }

    @Override // yg.o
    public final s t() {
        return new s(x(this.f31608a).getData());
    }

    @Override // yg.o
    public final Object u(long j10, i.c cVar) {
        Object c10 = yg.a.c(x(this.f31608a), f31604l, new Long(j10), cVar);
        if (c10 == yl.a.COROUTINE_SUSPENDED) {
            return c10;
        }
        return tl.l.f28297a;
    }

    @Override // yg.o
    public final t v() {
        return new t(x(this.f31608a).getData());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
    @Override // yg.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(yg.n r5, xl.d<? super java.lang.Long> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof yg.p.d
            if (r0 == 0) goto L13
            r0 = r6
            yg.p$d r0 = (yg.p.d) r0
            int r1 = r0.f31627f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31627f = r1
            goto L18
        L13:
            yg.p$d r0 = new yg.p$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f31625d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f31627f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r6)
            goto L5b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            mf.a0.k(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.name()
            r6.append(r5)
            java.lang.String r5 = "_update_condition"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            v1.d$a r5 = rm.l.w(r5)
            android.content.Context r6 = r4.f31608a
            s1.i r6 = r4.x(r6)
            r2 = 0
            r0.f31627f = r3
            java.lang.Object r6 = yg.a.b(r6, r5, r2, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L6a
            java.lang.Long r5 = om.g.T(r6)
            if (r5 == 0) goto L6a
            long r5 = r5.longValue()
            goto L6c
        L6a:
            r5 = 0
        L6c:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.p.w(yg.n, xl.d):java.lang.Object");
    }

    public final s1.i<v1.d> x(Context context) {
        return (s1.i) this.f31613f.a(context, f31599g[0]);
    }
}
