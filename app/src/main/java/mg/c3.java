package mg;

import ah.e;
import bh.b;
import bh.c;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig;
import java.util.Calendar;
import java.util.Date;
import jg.b;

/* loaded from: classes2.dex */
public abstract class c3 {

    /* renamed from: a */
    public final mf.h0 f20732a;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.MenstruationTimelineDao", f = "MenstruationTimelineDao.kt", l = {71, 72}, m = "getMenstruationSegment$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public Object f20733d;

        /* renamed from: e */
        public Object f20734e;

        /* renamed from: f */
        public long f20735f;

        /* renamed from: g */
        public /* synthetic */ Object f20736g;

        /* renamed from: i */
        public int f20738i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            c3.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20736g = obj;
            this.f20738i |= Integer.MIN_VALUE;
            return c3.g(c3.this, 0L, null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.MenstruationTimelineDao", f = "MenstruationTimelineDao.kt", l = {47}, m = "hasData")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f20739d;

        /* renamed from: f */
        public int f20741f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            c3.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20739d = obj;
            this.f20741f |= Integer.MIN_VALUE;
            return c3.this.h(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.MenstruationTimelineDao", f = "MenstruationTimelineDao.kt", l = {58, 66}, m = "saveMenstruationConfig$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public c3 f20742d;

        /* renamed from: e */
        public WhMenstruationConfig f20743e;

        /* renamed from: f */
        public long f20744f;

        /* renamed from: g */
        public /* synthetic */ Object f20745g;

        /* renamed from: i */
        public int f20747i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            c3.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20745g = obj;
            this.f20747i |= Integer.MIN_VALUE;
            return c3.n(c3.this, 0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.MenstruationTimelineDao", f = "MenstruationTimelineDao.kt", l = {78, 86}, m = "setMenstruationEndDate$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public c3 f20748d;

        /* renamed from: e */
        public Date f20749e;

        /* renamed from: f */
        public long f20750f;

        /* renamed from: g */
        public /* synthetic */ Object f20751g;

        /* renamed from: i */
        public int f20753i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            c3.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20751g = obj;
            this.f20753i |= Integer.MIN_VALUE;
            return c3.p(c3.this, 0L, null, null, null, this);
        }
    }

    public c3(AppDatabase appDatabase) {
        gm.l.f(appDatabase, "database");
        mf.h0 h0Var = appDatabase.f10052m;
        if (h0Var != null) {
            this.f20732a = h0Var;
        } else {
            gm.l.l("moshi");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object g(mg.c3 r6, long r7, java.util.Date r9, java.util.Calendar r10, xl.d<? super bh.c> r11) {
        /*
            boolean r0 = r11 instanceof mg.c3.a
            if (r0 == 0) goto L13
            r0 = r11
            mg.c3$a r0 = (mg.c3.a) r0
            int r1 = r0.f20738i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20738i = r1
            goto L18
        L13:
            mg.c3$a r0 = new mg.c3$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f20736g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20738i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f20734e
            com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig r6 = (com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig) r6
            java.lang.Object r7 = r0.f20733d
            java.util.Calendar r7 = (java.util.Calendar) r7
            mf.a0.k(r11)
            r1 = r7
            goto L7a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            long r7 = r0.f20735f
            java.lang.Object r6 = r0.f20734e
            r10 = r6
            java.util.Calendar r10 = (java.util.Calendar) r10
            java.lang.Object r6 = r0.f20733d
            mg.c3 r6 = (mg.c3) r6
            mf.a0.k(r11)
            goto L5c
        L4a:
            mf.a0.k(r11)
            r0.f20733d = r6
            r0.f20734e = r10
            r0.f20735f = r7
            r0.f20738i = r4
            java.lang.Object r11 = r6.j(r7, r9, r0)
            if (r11 != r1) goto L5c
            return r1
        L5c:
            pg.g r11 = (pg.g) r11
            if (r11 == 0) goto L8a
            mf.h0 r9 = r6.f20732a
            com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig r9 = r11.a(r9)
            if (r9 != 0) goto L69
            goto L8a
        L69:
            java.util.Date r11 = r9.f10106c
            r0.f20733d = r10
            r0.f20734e = r9
            r0.f20738i = r3
            java.lang.Object r11 = r6.k(r7, r11, r0)
            if (r11 != r1) goto L78
            return r1
        L78:
            r6 = r9
            r1 = r10
        L7a:
            r3 = r11
            java.util.Date r3 = (java.util.Date) r3
            bh.c r7 = new bh.c
            java.util.Date r2 = r6.f10106c
            int r4 = r6.f10105b
            int r5 = r6.f10104a
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
        L8a:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c3.g(mg.c3, long, java.util.Date, java.util.Calendar, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object n(mg.c3 r17, long r18, com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig r20, xl.d<? super tl.l> r21) {
        /*
            r0 = r17
            r1 = r18
            r3 = r20
            r4 = r21
            boolean r5 = r4 instanceof mg.c3.c
            if (r5 == 0) goto L1b
            r5 = r4
            mg.c3$c r5 = (mg.c3.c) r5
            int r6 = r5.f20747i
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1b
            int r6 = r6 - r7
            r5.f20747i = r6
            goto L20
        L1b:
            mg.c3$c r5 = new mg.c3$c
            r5.<init>(r4)
        L20:
            java.lang.Object r4 = r5.f20745g
            yl.a r6 = yl.a.COROUTINE_SUSPENDED
            int r7 = r5.f20747i
            r8 = 2
            r9 = 1
            if (r7 == 0) goto L46
            if (r7 == r9) goto L3a
            if (r7 != r8) goto L32
            mf.a0.k(r4)
            goto L81
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            long r0 = r5.f20744f
            com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig r2 = r5.f20743e
            mg.c3 r3 = r5.f20742d
            mf.a0.k(r4)
            r12 = r0
            r0 = r3
            goto L5c
        L46:
            mf.a0.k(r4)
            java.util.Date r4 = r3.f10106c
            r5.f20742d = r0
            r5.f20743e = r3
            r5.f20744f = r1
            r5.f20747i = r9
            java.lang.Object r4 = r0.c(r1, r4, r5)
            if (r4 != r6) goto L5a
            return r6
        L5a:
            r12 = r1
            r2 = r3
        L5c:
            pg.g r1 = new pg.g
            r10 = 0
            java.util.Date r14 = r2.f10106c
            r15 = 0
            mf.h0 r3 = r0.f20732a
            java.lang.Class<com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig> r4 = com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig.class
            mf.t r3 = r3.a(r4)
            java.lang.String r16 = r3.e(r2)
            r9 = r1
            r9.<init>(r10, r12, r14, r15, r16)
            r2 = 0
            r5.f20742d = r2
            r5.f20743e = r2
            r5.f20747i = r8
            java.lang.Object r0 = r0.l(r1, r5)
            if (r0 != r6) goto L81
            return r6
        L81:
            tl.l r0 = tl.l.f28297a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c3.n(mg.c3, long, com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object p(mg.c3 r18, long r19, java.util.Date r21, java.util.Date r22, java.util.Date r23, xl.d<? super tl.l> r24) {
        /*
            r6 = r18
            r0 = r24
            boolean r1 = r0 instanceof mg.c3.d
            if (r1 == 0) goto L17
            r1 = r0
            mg.c3$d r1 = (mg.c3.d) r1
            int r2 = r1.f20753i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f20753i = r2
            goto L1c
        L17:
            mg.c3$d r1 = new mg.c3$d
            r1.<init>(r0)
        L1c:
            r7 = r1
            java.lang.Object r0 = r7.f20751g
            yl.a r8 = yl.a.COROUTINE_SUSPENDED
            int r1 = r7.f20753i
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L43
            if (r1 == r2) goto L37
            if (r1 != r9) goto L2f
            mf.a0.k(r0)
            goto L7f
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            long r1 = r7.f20750f
            java.util.Date r3 = r7.f20749e
            mg.c3 r4 = r7.f20748d
            mf.a0.k(r0)
            r13 = r1
            r15 = r3
            goto L65
        L43:
            mf.a0.k(r0)
            r7.f20748d = r6
            r10 = r21
            r7.f20749e = r10
            r11 = r19
            r7.f20750f = r11
            r7.f20753i = r2
            r0 = r18
            r1 = r19
            r3 = r22
            r4 = r23
            r5 = r7
            java.lang.Object r0 = r0.b(r1, r3, r4, r5)
            if (r0 != r8) goto L62
            return r8
        L62:
            r4 = r6
            r15 = r10
            r13 = r11
        L65:
            pg.g r0 = new pg.g
            r11 = 0
            r16 = 1
            r17 = 0
            r10 = r0
            r10.<init>(r11, r13, r15, r16, r17)
            r1 = 0
            r7.f20748d = r1
            r7.f20749e = r1
            r7.f20753i = r9
            java.lang.Object r0 = r4.l(r0, r7)
            if (r0 != r8) goto L7f
            return r8
        L7f:
            tl.l r0 = tl.l.f28297a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c3.p(mg.c3, long, java.util.Date, java.util.Date, java.util.Date, xl.d):java.lang.Object");
    }

    public abstract Object a(long j10, b.C0309b c0309b);

    public abstract Object b(long j10, Date date, Date date2, zl.c cVar);

    public abstract Object c(long j10, Date date, c cVar);

    public abstract sm.u0 d(long j10);

    public abstract Object e(long j10, b bVar);

    public Object f(long j10, Calendar calendar, Date date, xl.d dVar) {
        return g(this, j10, date, calendar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(long r5, xl.d<? super java.lang.Boolean> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof mg.c3.b
            if (r0 == 0) goto L13
            r0 = r7
            mg.c3$b r0 = (mg.c3.b) r0
            int r1 = r0.f20741f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20741f = r1
            goto L18
        L13:
            mg.c3$b r0 = new mg.c3$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20739d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20741f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            mf.a0.k(r7)
            r0.f20741f = r3
            java.lang.Object r7 = r4.e(r5, r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            java.lang.Number r7 = (java.lang.Number) r7
            int r5 = r7.intValue()
            if (r5 <= 0) goto L44
            goto L45
        L44:
            r3 = 0
        L45:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c3.h(long, xl.d):java.lang.Object");
    }

    public abstract Object i(long j10, Date date, Date date2, c.a aVar);

    public abstract Object j(long j10, Date date, a aVar);

    public abstract Object k(long j10, Date date, a aVar);

    public abstract Object l(pg.g gVar, zl.c cVar);

    public Object m(long j10, WhMenstruationConfig whMenstruationConfig, e.C0006e c0006e) {
        return n(this, j10, whMenstruationConfig, c0006e);
    }

    public Object o(long j10, Date date, Date date2, Date date3, b.a aVar) {
        return p(this, j10, date, date2, date3, aVar);
    }
}
