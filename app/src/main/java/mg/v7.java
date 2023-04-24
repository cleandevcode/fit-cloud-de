package mg;

import com.topstep.fitcloud.pro.shared.data.bean.data.StepRecordBean;
import com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import lg.d;

/* loaded from: classes2.dex */
public abstract class v7 {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final Date f21510a;

        /* renamed from: b */
        public int f21511b;

        /* renamed from: c */
        public float f21512c;

        /* renamed from: d */
        public float f21513d;

        public a(Date date) {
            this.f21510a = date;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public final int f21514a;

        /* renamed from: b */
        public final float f21515b;

        /* renamed from: c */
        public final float f21516c;

        public b(float f10, float f11, int i10) {
            this.f21514a = i10;
            this.f21515b = f10;
            this.f21516c = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f21514a == bVar.f21514a && Float.compare(this.f21515b, bVar.f21515b) == 0 && Float.compare(this.f21516c, bVar.f21516c) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f21516c) + t0.e.b(this.f21515b, this.f21514a * 31, 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("TotalData(step=");
            a10.append(this.f21514a);
            a10.append(", distance=");
            a10.append(this.f21515b);
            a10.append(", calorie=");
            a10.append(this.f21516c);
            a10.append(')');
            return a10.toString();
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StepDao", f = "StepDao.kt", l = {91, 92}, m = "deleteAccount")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public v7 f21517d;

        /* renamed from: e */
        public long f21518e;

        /* renamed from: f */
        public /* synthetic */ Object f21519f;

        /* renamed from: h */
        public int f21521h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            v7.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21519f = obj;
            this.f21521h |= Integer.MIN_VALUE;
            return v7.this.a(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StepDao", f = "StepDao.kt", l = {195, 202}, m = "queryDetail")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public v7 f21522d;

        /* renamed from: e */
        public Object f21523e;

        /* renamed from: f */
        public Calendar f21524f;

        /* renamed from: g */
        public long f21525g;

        /* renamed from: h */
        public /* synthetic */ Object f21526h;

        /* renamed from: j */
        public int f21528j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            v7.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21526h = obj;
            this.f21528j |= Integer.MIN_VALUE;
            return v7.this.k(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StepDao", f = "StepDao.kt", l = {179, 190}, m = "queryUnUploadData$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class e extends zl.c {

        /* renamed from: d */
        public Object f21529d;

        /* renamed from: e */
        public Date f21530e;

        /* renamed from: f */
        public long f21531f;

        /* renamed from: g */
        public int f21532g;

        /* renamed from: h */
        public /* synthetic */ Object f21533h;

        /* renamed from: j */
        public int f21535j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(dVar);
            v7.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21533h = obj;
            this.f21535j |= Integer.MIN_VALUE;
            return v7.p(v7.this, 0L, null, 0, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StepDao", f = "StepDao.kt", l = {97}, m = "saveDeviceData$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class f extends zl.c {

        /* renamed from: d */
        public v7 f21536d;

        /* renamed from: e */
        public StepRecordEntity f21537e;

        /* renamed from: f */
        public long f21538f;

        /* renamed from: g */
        public /* synthetic */ Object f21539g;

        /* renamed from: i */
        public int f21541i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(dVar);
            v7.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21539g = obj;
            this.f21541i |= Integer.MIN_VALUE;
            return v7.u(v7.this, 0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StepDao", f = "StepDao.kt", l = {108, 150}, m = "saveDeviceData$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class g extends zl.c {

        /* renamed from: d */
        public v7 f21542d;

        /* renamed from: e */
        public List f21543e;

        /* renamed from: f */
        public long f21544f;

        /* renamed from: g */
        public /* synthetic */ Object f21545g;

        /* renamed from: i */
        public int f21547i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(dVar);
            v7.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21545g = obj;
            this.f21547i |= Integer.MIN_VALUE;
            return v7.v(v7.this, 0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StepDao", f = "StepDao.kt", l = {156, 161}, m = "saveRemoteData$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class h extends zl.c {

        /* renamed from: d */
        public v7 f21548d;

        /* renamed from: e */
        public Iterator f21549e;

        /* renamed from: f */
        public StepRecordBean f21550f;

        /* renamed from: g */
        public long f21551g;

        /* renamed from: h */
        public /* synthetic */ Object f21552h;

        /* renamed from: j */
        public int f21554j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(xl.d<? super h> dVar) {
            super(dVar);
            v7.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21552h = obj;
            this.f21554j |= Integer.MIN_VALUE;
            return v7.x(v7.this, 0L, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object p(mg.v7 r23, long r24, java.util.Date r26, int r27, xl.d<? super java.util.List<com.topstep.fitcloud.pro.shared.data.bean.data.StepRecordBean>> r28) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.v7.p(mg.v7, long, java.util.Date, int, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object u(mg.v7 r4, long r5, com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity r7, xl.d<? super tl.l> r8) {
        /*
            boolean r0 = r8 instanceof mg.v7.f
            if (r0 == 0) goto L13
            r0 = r8
            mg.v7$f r0 = (mg.v7.f) r0
            int r1 = r0.f21541i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21541i = r1
            goto L18
        L13:
            mg.v7$f r0 = new mg.v7$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f21539g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f21541i
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r5 = r0.f21538f
            com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity r7 = r0.f21537e
            mg.v7 r4 = r0.f21536d
            mf.a0.k(r8)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            mf.a0.k(r8)
            r0.f21536d = r4
            r0.f21537e = r7
            r0.f21538f = r5
            r0.f21541i = r3
            java.lang.Object r8 = r4.i(r7, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            java.util.Calendar r8 = java.util.Calendar.getInstance()
            int r0 = r7.f10096e
            if (r0 != 0) goto L64
            java.lang.String r0 = "calendar"
            gm.l.e(r8, r0)
            java.util.Date r0 = r7.f25622b
            r1 = 0
            java.util.Date r0 = hh.c.d(r8, r0, r1)
            java.util.Date r7 = r7.f25622b
            java.util.Date r7 = hh.c.c(r8, r7)
            r4.c(r5, r0, r7)
        L64:
            tl.l r4 = tl.l.f28297a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.v7.u(mg.v7, long, com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0075  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, mg.v7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object v(mg.v7 r25, long r26, java.util.List<com.topstep.fitcloud.pro.shared.data.entity.data.StepItemEntity> r28, xl.d<? super tl.l> r29) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.v7.v(mg.v7, long, java.util.List, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x009b -> B:55:0x0065). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x00d7 -> B:73:0x00db). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object x(mg.v7 r24, long r25, java.util.List<com.topstep.fitcloud.pro.shared.data.bean.data.StepRecordBean> r27, xl.d<? super tl.l> r28) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.v7.x(mg.v7, long, java.util.List, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0056 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r6, xl.d<? super tl.l> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof mg.v7.c
            if (r0 == 0) goto L13
            r0 = r8
            mg.v7$c r0 = (mg.v7.c) r0
            int r1 = r0.f21521h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21521h = r1
            goto L18
        L13:
            mg.v7$c r0 = new mg.v7$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f21519f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f21521h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r8)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            long r6 = r0.f21518e
            mg.v7 r2 = r0.f21517d
            mf.a0.k(r8)
            goto L4b
        L3a:
            mf.a0.k(r8)
            r0.f21517d = r5
            r0.f21518e = r6
            r0.f21521h = r4
            java.lang.Object r8 = r5.b(r6, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            r8 = 0
            r0.f21517d = r8
            r0.f21521h = r3
            java.lang.Object r6 = r2.e(r6, r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            tl.l r6 = tl.l.f28297a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.v7.a(long, xl.d):java.lang.Object");
    }

    public abstract Object b(long j10, c cVar);

    public abstract void c(long j10, Date date, Date date2);

    public abstract void d(long j10, String str, Date date, Date date2);

    public abstract Object e(long j10, c cVar);

    public abstract sm.u0 f(long j10, Date date);

    public abstract sm.u0 g(long j10, Date date, Date date2);

    public abstract Object h(List list, g gVar);

    public abstract Object i(StepRecordEntity stepRecordEntity, zl.c cVar);

    public abstract Object j(ArrayList arrayList, g gVar);

    /* JADX WARN: Removed duplicated region for block: B:77:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(long r22, java.util.Date r24, xl.d<? super vf.p> r25) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.v7.k(long, java.util.Date, xl.d):java.lang.Object");
    }

    public abstract Object l(long j10, Date date, Date date2, d dVar);

    public abstract b m(long j10, Date date, Date date2);

    public abstract Object n(long j10, Date date, zl.c cVar);

    public Object o(long j10, Date date, int i10, d.p0 p0Var) {
        return p(this, j10, date, i10, p0Var);
    }

    public abstract Object q(long j10, Date date, e eVar);

    public abstract Object r(long j10, Date date, d.v vVar);

    public Object s(long j10, StepRecordEntity stepRecordEntity, xl.d<? super tl.l> dVar) {
        return u(this, j10, stepRecordEntity, dVar);
    }

    public Object t(long j10, ArrayList arrayList, og.r0 r0Var) {
        return v(this, j10, arrayList, r0Var);
    }

    public Object w(long j10, List<StepRecordBean> list, xl.d<? super tl.l> dVar) {
        return x(this, j10, list, dVar);
    }

    public abstract Object y(long j10, Date date, int i10, e eVar);

    public abstract Object z(long j10, Date date, int i10, d.p0 p0Var);
}
