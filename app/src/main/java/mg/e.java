package mg;

import com.topstep.fitcloud.pro.shared.data.bean.data.BloodPressureRecordBean;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import lg.d;

/* loaded from: classes2.dex */
public abstract class e {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final int f20918a;

        /* renamed from: b */
        public final int f20919b;

        public a(int i10, int i11) {
            this.f20918a = i10;
            this.f20919b = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f20918a == aVar.f20918a && this.f20919b == aVar.f20919b;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f20918a * 31) + this.f20919b;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("AvgData(avgSbp=");
            a10.append(this.f20918a);
            a10.append(", avgDbp=");
            return a1.b.a(a10, this.f20919b, ')');
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.BloodPressureDao", f = "BloodPressureDao.kt", l = {104, 105, 106}, m = "deleteAccount")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public e f20920d;

        /* renamed from: e */
        public long f20921e;

        /* renamed from: f */
        public /* synthetic */ Object f20922f;

        /* renamed from: h */
        public int f20924h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20922f = obj;
            this.f20924h |= Integer.MIN_VALUE;
            return e.this.a(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.BloodPressureDao", f = "BloodPressureDao.kt", l = {220, 226}, m = "queryDetail")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public Object f20925d;

        /* renamed from: e */
        public Date f20926e;

        /* renamed from: f */
        public long f20927f;

        /* renamed from: g */
        public /* synthetic */ Object f20928g;

        /* renamed from: i */
        public int f20930i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20928g = obj;
            this.f20930i |= Integer.MIN_VALUE;
            return e.this.j(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.BloodPressureDao", f = "BloodPressureDao.kt", l = {115, 131, 146}, m = "saveDeviceData$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public e f20931d;

        /* renamed from: e */
        public List f20932e;

        /* renamed from: f */
        public Calendar f20933f;

        /* renamed from: g */
        public Date f20934g;

        /* renamed from: h */
        public Iterator f20935h;

        /* renamed from: i */
        public Date f20936i;

        /* renamed from: j */
        public long f20937j;

        /* renamed from: k */
        public /* synthetic */ Object f20938k;

        /* renamed from: m */
        public int f20940m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20938k = obj;
            this.f20940m |= Integer.MIN_VALUE;
            return e.t(e.this, 0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.BloodPressureDao", f = "BloodPressureDao.kt", l = {152, 156, 168, 182, 190}, m = "saveRemoteData$suspendImpl")
    /* renamed from: mg.e$e */
    /* loaded from: classes2.dex */
    public static final class C0377e extends zl.c {

        /* renamed from: d */
        public e f20941d;

        /* renamed from: e */
        public Iterator f20942e;

        /* renamed from: f */
        public BloodPressureRecordBean f20943f;

        /* renamed from: g */
        public rg.b f20944g;

        /* renamed from: h */
        public long f20945h;

        /* renamed from: i */
        public /* synthetic */ Object f20946i;

        /* renamed from: k */
        public int f20948k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0377e(xl.d<? super C0377e> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20946i = obj;
            this.f20948k |= Integer.MIN_VALUE;
            return e.v(e.this, 0L, null, this);
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
    public static java.io.Serializable p(mg.e r7, long r8, java.util.Calendar r10, java.util.Date r11, int r12, xl.d r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.e.p(mg.e, long, java.util.Calendar, java.util.Date, int, xl.d):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c3, code lost:
        if (r7 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x00c3 -> B:88:0x011a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x00f5 -> B:87:0x00fc). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object t(mg.e r28, long r29, java.util.List<rg.a> r31, xl.d<? super tl.l> r32) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.e.t(mg.e, long, java.util.List, xl.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01c5, code lost:
        if (r6 < r4.f9895d) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0124 -> B:97:0x009d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x01f5 -> B:144:0x01f8). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object v(mg.e r29, long r30, java.util.List<com.topstep.fitcloud.pro.shared.data.bean.data.BloodPressureRecordBean> r32, xl.d<? super tl.l> r33) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.e.v(mg.e, long, java.util.List, xl.d):java.lang.Object");
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
            boolean r0 = r9 instanceof mg.e.b
            if (r0 == 0) goto L13
            r0 = r9
            mg.e$b r0 = (mg.e.b) r0
            int r1 = r0.f20924h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20924h = r1
            goto L18
        L13:
            mg.e$b r0 = new mg.e$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f20922f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20924h
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
            long r7 = r0.f20921e
            mg.e r2 = r0.f20920d
            mf.a0.k(r9)
            goto L63
        L3d:
            long r7 = r0.f20921e
            mg.e r2 = r0.f20920d
            mf.a0.k(r9)
            goto L56
        L45:
            mf.a0.k(r9)
            r0.f20920d = r6
            r0.f20921e = r7
            r0.f20924h = r5
            java.lang.Object r9 = r6.b(r7, r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r0.f20920d = r2
            r0.f20921e = r7
            r0.f20924h = r4
            java.lang.Object r9 = r2.c(r7, r0)
            if (r9 != r1) goto L63
            return r1
        L63:
            r9 = 0
            r0.f20920d = r9
            r0.f20924h = r3
            java.lang.Object r7 = r2.d(r7, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            tl.l r7 = tl.l.f28297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.e.a(long, xl.d):java.lang.Object");
    }

    public abstract Object b(long j10, b bVar);

    public abstract Object c(long j10, b bVar);

    public abstract Object d(long j10, b bVar);

    public abstract sm.u0 e(long j10, Date date, Date date2);

    public abstract Object f(List list, zl.c cVar);

    public abstract Object g(rg.b bVar, C0377e c0377e);

    public abstract Object h(ArrayList arrayList, d dVar);

    public abstract Object i(rg.c cVar, d.r rVar);

    /* JADX WARN: Removed duplicated region for block: B:46:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(long r10, java.util.Date r12, xl.d<? super vf.c> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof mg.e.c
            if (r0 == 0) goto L13
            r0 = r13
            mg.e$c r0 = (mg.e.c) r0
            int r1 = r0.f20930i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20930i = r1
            goto L18
        L13:
            mg.e$c r0 = new mg.e$c
            r0.<init>(r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.f20928g
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r6.f20930i
            r2 = 2
            r3 = 1
            r7 = 0
            if (r1 == 0) goto L44
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r10 = r6.f20925d
            rg.b r10 = (rg.b) r10
            mf.a0.k(r13)
            goto L7f
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            long r10 = r6.f20927f
            java.util.Date r12 = r6.f20926e
            java.lang.Object r1 = r6.f20925d
            mg.e r1 = (mg.e) r1
            mf.a0.k(r13)
            goto L57
        L44:
            mf.a0.k(r13)
            r6.f20925d = r9
            r6.f20926e = r12
            r6.f20927f = r10
            r6.f20930i = r3
            java.lang.Object r13 = r9.m(r10, r12, r6)
            if (r13 != r0) goto L56
            return r0
        L56:
            r1 = r9
        L57:
            rg.b r13 = (rg.b) r13
            if (r13 != 0) goto L5c
            return r7
        L5c:
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            java.lang.String r4 = "calendar"
            gm.l.e(r3, r4)
            r4 = 0
            java.util.Date r4 = hh.c.d(r3, r12, r4)
            java.util.Date r5 = hh.c.c(r3, r12)
            r6.f20925d = r13
            r6.f20926e = r7
            r6.f20930i = r2
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
            if (r13 == 0) goto Lad
            java.util.ArrayList r7 = new java.util.ArrayList
            r11 = 10
            int r11 = ul.l.B(r13, r11)
            r7.<init>(r11)
            java.util.Iterator r11 = r13.iterator()
        L92:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lad
            java.lang.Object r12 = r11.next()
            rg.a r12 = (rg.a) r12
            vf.b r13 = new vf.b
            java.util.Date r0 = r12.f10068b
            int r1 = r12.f25606f
            int r12 = r12.f25607g
            r13.<init>(r1, r12, r0)
            r7.add(r13)
            goto L92
        Lad:
            vf.c r11 = new vf.c
            java.util.Date r12 = r10.f25622b
            int r13 = r10.f25608d
            int r10 = r10.f25609e
            r11.<init>(r12, r13, r10, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.e.j(long, java.util.Date, xl.d):java.lang.Object");
    }

    public abstract Object k(long j10, Date date, Date date2, c cVar);

    public abstract Object l(long j10, Date date, Date date2, zl.c cVar);

    public abstract Object m(long j10, Date date, zl.c cVar);

    public abstract Object n(long j10, Date date, d.r rVar);

    public Object o(long j10, Calendar calendar, Date date, int i10, d.i0 i0Var) {
        return p(this, j10, calendar, date, i10, i0Var);
    }

    public abstract Object q(long j10, Date date, f fVar);

    public abstract Object r(long j10, Date date, d.v vVar);

    public Object s(long j10, ArrayList arrayList, og.r0 r0Var) {
        return t(this, j10, arrayList, r0Var);
    }

    public Object u(long j10, List<BloodPressureRecordBean> list, xl.d<? super tl.l> dVar) {
        return v(this, j10, list, dVar);
    }

    public abstract Object w(long j10, Date date, int i10, f fVar);

    public abstract Object x(long j10, Date date, int i10, d.i0 i0Var);
}
