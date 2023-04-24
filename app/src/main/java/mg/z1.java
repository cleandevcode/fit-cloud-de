package mg;

import com.topstep.fitcloud.pro.shared.data.bean.data.HeartRateRecordBean;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import lg.d;

/* loaded from: classes2.dex */
public abstract class z1 {

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.HeartRateDao", f = "HeartRateDao.kt", l = {98, 99, 100}, m = "deleteAccount")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public z1 f21740d;

        /* renamed from: e */
        public long f21741e;

        /* renamed from: f */
        public /* synthetic */ Object f21742f;

        /* renamed from: h */
        public int f21744h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            z1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21742f = obj;
            this.f21744h |= Integer.MIN_VALUE;
            return z1.this.a(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.HeartRateDao", f = "HeartRateDao.kt", l = {210, 216}, m = "queryDetail")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public Object f21745d;

        /* renamed from: e */
        public Date f21746e;

        /* renamed from: f */
        public long f21747f;

        /* renamed from: g */
        public /* synthetic */ Object f21748g;

        /* renamed from: i */
        public int f21750i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            z1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21748g = obj;
            this.f21750i |= Integer.MIN_VALUE;
            return z1.this.j(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.HeartRateDao", f = "HeartRateDao.kt", l = {109, 125, 139}, m = "saveDeviceData$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public z1 f21751d;

        /* renamed from: e */
        public List f21752e;

        /* renamed from: f */
        public Calendar f21753f;

        /* renamed from: g */
        public Date f21754g;

        /* renamed from: h */
        public Iterator f21755h;

        /* renamed from: i */
        public Date f21756i;

        /* renamed from: j */
        public long f21757j;

        /* renamed from: k */
        public /* synthetic */ Object f21758k;

        /* renamed from: m */
        public int f21760m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            z1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21758k = obj;
            this.f21760m |= Integer.MIN_VALUE;
            return z1.t(z1.this, 0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.HeartRateDao", f = "HeartRateDao.kt", l = {145, 149, 160, 173, 181}, m = "saveRemoteData$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public z1 f21761d;

        /* renamed from: e */
        public Iterator f21762e;

        /* renamed from: f */
        public HeartRateRecordBean f21763f;

        /* renamed from: g */
        public rg.g f21764g;

        /* renamed from: h */
        public long f21765h;

        /* renamed from: i */
        public /* synthetic */ Object f21766i;

        /* renamed from: k */
        public int f21768k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            z1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21766i = obj;
            this.f21768k |= Integer.MIN_VALUE;
            return z1.v(z1.this, 0L, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5 A[LOOP:1: B:88:0x00ef->B:90:0x00f5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.Serializable p(mg.z1 r7, long r8, java.util.Calendar r10, java.util.Date r11, int r12, xl.d r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.z1.p(mg.z1, long, java.util.Calendar, java.util.Date, int, xl.d):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c3, code lost:
        if (r7 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x00c3 -> B:88:0x0116). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x00f5 -> B:87:0x00fc). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object t(mg.z1 r27, long r28, java.util.List<rg.f> r30, xl.d<? super tl.l> r31) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.z1.t(mg.z1, long, java.util.List, xl.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01bc, code lost:
        if (r5 < r4.f9948c) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x0119 -> B:120:0x011e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x01e4 -> B:142:0x01e8). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object v(mg.z1 r28, long r29, java.util.List<com.topstep.fitcloud.pro.shared.data.bean.data.HeartRateRecordBean> r31, xl.d<? super tl.l> r32) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.z1.v(mg.z1, long, java.util.List, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r7, xl.d<? super tl.l> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof mg.z1.a
            if (r0 == 0) goto L13
            r0 = r9
            mg.z1$a r0 = (mg.z1.a) r0
            int r1 = r0.f21744h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21744h = r1
            goto L18
        L13:
            mg.z1$a r0 = new mg.z1$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f21742f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f21744h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            mf.a0.k(r9)
            goto L6f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            long r7 = r0.f21741e
            mg.z1 r2 = r0.f21740d
            mf.a0.k(r9)
            goto L63
        L3d:
            long r7 = r0.f21741e
            mg.z1 r2 = r0.f21740d
            mf.a0.k(r9)
            goto L56
        L45:
            mf.a0.k(r9)
            r0.f21740d = r6
            r0.f21741e = r7
            r0.f21744h = r5
            java.lang.Object r9 = r6.b(r7, r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r0.f21740d = r2
            r0.f21741e = r7
            r0.f21744h = r4
            java.lang.Object r9 = r2.c(r7, r0)
            if (r9 != r1) goto L63
            return r1
        L63:
            r9 = 0
            r0.f21740d = r9
            r0.f21744h = r3
            java.lang.Object r7 = r2.d(r7, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            tl.l r7 = tl.l.f28297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.z1.a(long, xl.d):java.lang.Object");
    }

    public abstract Object b(long j10, a aVar);

    public abstract Object c(long j10, a aVar);

    public abstract Object d(long j10, a aVar);

    public abstract sm.u0 e(long j10, Date date, Date date2);

    public abstract Object f(List list, zl.c cVar);

    public abstract Object g(rg.g gVar, d dVar);

    public abstract Object h(ArrayList arrayList, c cVar);

    public abstract Object i(rg.h hVar, d.u uVar);

    /* JADX WARN: Removed duplicated region for block: B:46:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(long r10, java.util.Date r12, xl.d<? super vf.f> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof mg.z1.b
            if (r0 == 0) goto L13
            r0 = r13
            mg.z1$b r0 = (mg.z1.b) r0
            int r1 = r0.f21750i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21750i = r1
            goto L18
        L13:
            mg.z1$b r0 = new mg.z1$b
            r0.<init>(r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.f21748g
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r6.f21750i
            r2 = 2
            r3 = 1
            r7 = 0
            if (r1 == 0) goto L44
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r10 = r6.f21745d
            rg.g r10 = (rg.g) r10
            mf.a0.k(r13)
            goto L7f
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            long r10 = r6.f21747f
            java.util.Date r12 = r6.f21746e
            java.lang.Object r1 = r6.f21745d
            mg.z1 r1 = (mg.z1) r1
            mf.a0.k(r13)
            goto L57
        L44:
            mf.a0.k(r13)
            r6.f21745d = r9
            r6.f21746e = r12
            r6.f21747f = r10
            r6.f21750i = r3
            java.lang.Object r13 = r9.m(r10, r12, r6)
            if (r13 != r0) goto L56
            return r0
        L56:
            r1 = r9
        L57:
            rg.g r13 = (rg.g) r13
            if (r13 != 0) goto L5c
            return r7
        L5c:
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            java.lang.String r4 = "calendar"
            gm.l.e(r3, r4)
            r4 = 0
            java.util.Date r4 = hh.c.d(r3, r12, r4)
            java.util.Date r5 = hh.c.c(r3, r12)
            r6.f21745d = r13
            r6.f21746e = r7
            r6.f21750i = r2
            r2 = r10
            java.lang.Object r10 = r1.k(r2, r4, r5, r6)
            if (r10 != r0) goto L7c
            return r0
        L7c:
            r8 = r13
            r13 = r10
            r10 = r8
        L7f:
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto Lab
            java.util.ArrayList r7 = new java.util.ArrayList
            r11 = 10
            int r11 = ul.l.B(r13, r11)
            r7.<init>(r11)
            java.util.Iterator r11 = r13.iterator()
        L92:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lab
            java.lang.Object r12 = r11.next()
            rg.f r12 = (rg.f) r12
            vf.e r13 = new vf.e
            java.util.Date r0 = r12.f10068b
            int r12 = r12.f25624f
            r13.<init>(r12, r0)
            r7.add(r13)
            goto L92
        Lab:
            vf.f r11 = new vf.f
            java.util.Date r12 = r10.f25622b
            int r10 = r10.f25625d
            r11.<init>(r12, r10, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.z1.j(long, java.util.Date, xl.d):java.lang.Object");
    }

    public abstract Object k(long j10, Date date, Date date2, b bVar);

    public abstract Object l(long j10, Date date, Date date2, zl.c cVar);

    public abstract Object m(long j10, Date date, zl.c cVar);

    public abstract Object n(long j10, Date date, d.u uVar);

    public Object o(long j10, Calendar calendar, Date date, int i10, d.l0 l0Var) {
        return p(this, j10, calendar, date, i10, l0Var);
    }

    public abstract Object q(long j10, Date date, a2 a2Var);

    public abstract Object r(long j10, Date date, d.v vVar);

    public Object s(long j10, ArrayList arrayList, og.r0 r0Var) {
        return t(this, j10, arrayList, r0Var);
    }

    public Object u(long j10, List<HeartRateRecordBean> list, xl.d<? super tl.l> dVar) {
        return v(this, j10, list, dVar);
    }

    public abstract Object w(long j10, Date date, int i10, a2 a2Var);

    public abstract Object x(long j10, Date date, int i10, d.l0 l0Var);
}
