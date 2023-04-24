package mg;

import com.topstep.fitcloud.pro.model.data.SportRecord;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import lg.h0;
import lg.r0;

/* loaded from: classes2.dex */
public abstract class d7 {

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.SportDao", f = "SportDao.kt", l = {85, 88, 91}, m = "deleteAccount")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public d7 f20839d;

        /* renamed from: e */
        public Iterator f20840e;

        /* renamed from: f */
        public long f20841f;

        /* renamed from: g */
        public /* synthetic */ Object f20842g;

        /* renamed from: i */
        public int f20844i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            d7.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20842g = obj;
            this.f20844i |= Integer.MIN_VALUE;
            return d7.this.b(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.SportDao", f = "SportDao.kt", l = {70, 71}, m = "deleteExpireData$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public d7 f20845d;

        /* renamed from: e */
        public Date f20846e;

        /* renamed from: f */
        public /* synthetic */ Object f20847f;

        /* renamed from: h */
        public int f20849h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            d7.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20847f = obj;
            this.f20849h |= Integer.MIN_VALUE;
            return d7.e(d7.this, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.SportDao", f = "SportDao.kt", l = {96, 111}, m = "saveNewAppRecord$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public d7 f20850d;

        /* renamed from: e */
        public SportRecord f20851e;

        /* renamed from: f */
        public /* synthetic */ Object f20852f;

        /* renamed from: h */
        public int f20854h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            d7.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20852f = obj;
            this.f20854h |= Integer.MIN_VALUE;
            return d7.u(d7.this, 0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.SportDao", f = "SportDao.kt", l = {130, 148}, m = "saveNewDeviceRecord$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public d7 f20855d;

        /* renamed from: e */
        public oj.j f20856e;

        /* renamed from: f */
        public UUID f20857f;

        /* renamed from: g */
        public Date f20858g;

        /* renamed from: h */
        public /* synthetic */ Object f20859h;

        /* renamed from: j */
        public int f20861j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            d7.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20859h = obj;
            this.f20861j |= Integer.MIN_VALUE;
            return d7.w(d7.this, 0L, null, false, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0072 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object e(mg.d7 r6, xl.d<? super tl.l> r7) {
        /*
            boolean r0 = r7 instanceof mg.d7.b
            if (r0 == 0) goto L13
            r0 = r7
            mg.d7$b r0 = (mg.d7.b) r0
            int r1 = r0.f20849h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20849h = r1
            goto L18
        L13:
            mg.d7$b r0 = new mg.d7$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20847f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20849h
            java.lang.String r3 = "expireTime"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            mf.a0.k(r7)
            goto L73
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.util.Date r6 = r0.f20846e
            mg.d7 r2 = r0.f20845d
            mf.a0.k(r7)
            goto L62
        L3c:
            mf.a0.k(r7)
            java.util.GregorianCalendar r7 = new java.util.GregorianCalendar
            r7.<init>()
            int r2 = r7.get(r5)
            int r2 = r2 - r5
            r7.set(r5, r2)
            java.util.Date r7 = r7.getTime()
            gm.l.e(r7, r3)
            r0.f20845d = r6
            r0.f20846e = r7
            r0.f20849h = r5
            java.lang.Object r2 = r6.g(r7, r0)
            if (r2 != r1) goto L60
            return r1
        L60:
            r2 = r6
            r6 = r7
        L62:
            gm.l.e(r6, r3)
            r7 = 0
            r0.f20845d = r7
            r0.f20846e = r7
            r0.f20849h = r4
            java.lang.Object r6 = r2.f(r6, r0)
            if (r6 != r1) goto L73
            return r1
        L73:
            tl.l r6 = tl.l.f28297a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d7.e(mg.d7, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object u(mg.d7 r22, long r23, com.topstep.fitcloud.pro.model.data.SportRecord r25, xl.d<? super tl.l> r26) {
        /*
            r0 = r22
            r1 = r25
            r2 = r26
            boolean r3 = r2 instanceof mg.d7.c
            if (r3 == 0) goto L19
            r3 = r2
            mg.d7$c r3 = (mg.d7.c) r3
            int r4 = r3.f20854h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f20854h = r4
            goto L1e
        L19:
            mg.d7$c r3 = new mg.d7$c
            r3.<init>(r2)
        L1e:
            java.lang.Object r2 = r3.f20852f
            yl.a r4 = yl.a.COROUTINE_SUSPENDED
            int r5 = r3.f20854h
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L45
            if (r5 == r7) goto L38
            if (r5 != r6) goto L30
            mf.a0.k(r2)
            goto L94
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            com.topstep.fitcloud.pro.model.data.SportRecord r0 = r3.f20851e
            mg.d7 r1 = r3.f20850d
            mf.a0.k(r2)
            r21 = r1
            r1 = r0
            r0 = r21
            goto L79
        L45:
            mf.a0.k(r2)
            rg.r r2 = new rg.r
            java.util.UUID r11 = r1.f9627a
            java.util.Date r12 = r1.f9628b
            int r13 = r1.f9629c
            float r14 = r1.f9630d
            float r15 = r1.f9631e
            int r5 = r1.f9632f
            float r9 = r1.f9633g
            int r10 = r1.f9634h
            int r8 = r1.f9635i
            r20 = 0
            r19 = r8
            r8 = r2
            r17 = r9
            r18 = r10
            r9 = r23
            r16 = r5
            r8.<init>(r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3.f20850d = r0
            r3.f20851e = r1
            r3.f20854h = r7
            java.lang.Object r2 = r0.k(r2, r3)
            if (r2 != r4) goto L79
            return r4
        L79:
            rg.q r2 = new rg.q
            java.util.UUID r5 = r1.f9627a
            java.util.Date r7 = r1.f9628b
            java.util.List<com.topstep.fitcloud.pro.model.data.SportLatLng> r8 = r1.f9636j
            java.util.List<com.topstep.fitcloud.pro.model.data.SportHeartRate> r1 = r1.f9637k
            r2.<init>(r5, r7, r8, r1)
            r1 = 0
            r3.f20850d = r1
            r3.f20851e = r1
            r3.f20854h = r6
            java.lang.Object r0 = r0.j(r2, r3)
            if (r0 != r4) goto L94
            return r4
        L94:
            tl.l r0 = tl.l.f28297a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d7.u(mg.d7, long, com.topstep.fitcloud.pro.model.data.SportRecord, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object w(mg.d7 r23, long r24, oj.j r26, boolean r27, xl.d<? super tl.l> r28) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d7.w(mg.d7, long, oj.j, boolean, xl.d):java.lang.Object");
    }

    public abstract Object a(long j10, xl.d<? super tl.l> dVar);

    /* JADX WARN: Removed duplicated region for block: B:53:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0095 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r8, xl.d<? super tl.l> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof mg.d7.a
            if (r0 == 0) goto L13
            r0 = r10
            mg.d7$a r0 = (mg.d7.a) r0
            int r1 = r0.f20844i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20844i = r1
            goto L18
        L13:
            mg.d7$a r0 = new mg.d7$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f20842g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20844i
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            mf.a0.k(r10)
            goto L96
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            long r8 = r0.f20841f
            java.util.Iterator r2 = r0.f20840e
            mg.d7 r5 = r0.f20839d
            mf.a0.k(r10)
            goto L6c
        L3f:
            long r8 = r0.f20841f
            mg.d7 r2 = r0.f20839d
            mf.a0.k(r10)
            goto L58
        L47:
            mf.a0.k(r10)
            r0.f20839d = r7
            r0.f20841f = r8
            r0.f20844i = r5
            java.lang.Object r10 = r7.o(r8, r0)
            if (r10 != r1) goto L57
            return r1
        L57:
            r2 = r7
        L58:
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L5f
            tl.l r8 = tl.l.f28297a
            return r8
        L5f:
            boolean r6 = r10.isEmpty()
            r5 = r5 ^ r6
            if (r5 == 0) goto L88
            java.util.Iterator r10 = r10.iterator()
            r5 = r2
            r2 = r10
        L6c:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L87
            java.lang.Object r10 = r2.next()
            java.util.UUID r10 = (java.util.UUID) r10
            r0.f20839d = r5
            r0.f20840e = r2
            r0.f20841f = r8
            r0.f20844i = r4
            java.lang.Object r10 = r5.c(r10, r0)
            if (r10 != r1) goto L6c
            return r1
        L87:
            r2 = r5
        L88:
            r10 = 0
            r0.f20839d = r10
            r0.f20840e = r10
            r0.f20844i = r3
            java.lang.Object r8 = r2.h(r8, r0)
            if (r8 != r1) goto L96
            return r1
        L96:
            tl.l r8 = tl.l.f28297a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d7.b(long, xl.d):java.lang.Object");
    }

    public abstract Object c(UUID uuid, a aVar);

    public Object d(xl.d<? super tl.l> dVar) {
        return e(this, dVar);
    }

    public abstract Object f(Date date, b bVar);

    public abstract Object g(Date date, b bVar);

    public abstract Object h(long j10, a aVar);

    public abstract sm.u0 i(long j10);

    public abstract Object j(rg.q qVar, zl.c cVar);

    public abstract Object k(rg.r rVar, zl.c cVar);

    public abstract Object l(List<rg.r> list, xl.d<? super tl.l> dVar);

    public abstract Object m(UUID uuid, zl.c cVar);

    public abstract Object n(UUID uuid, r0.c cVar);

    public abstract Object o(long j10, a aVar);

    public abstract Object p(long j10, xl.d<? super Integer> dVar);

    public abstract Object q(long j10, int i10, int i11, h0.b bVar);

    public abstract Object r(long j10, r0.h hVar);

    public abstract Object s(long j10, r0.a aVar);

    public Object t(long j10, SportRecord sportRecord, xl.d<? super tl.l> dVar) {
        return u(this, j10, sportRecord, dVar);
    }

    public Object v(long j10, oj.j jVar, boolean z10, lg.s0 s0Var) {
        return w(this, j10, jVar, z10, s0Var);
    }

    public abstract Object x(UUID uuid, r0.h hVar);
}
