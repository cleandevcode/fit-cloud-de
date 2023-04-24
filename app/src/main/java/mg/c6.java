package mg;

import com.topstep.fitcloud.pro.shared.data.bean.data.SleepRecordBean;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lg.d;

/* loaded from: classes2.dex */
public abstract class c6 {

    /* renamed from: a */
    public final SimpleDateFormat f20760a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.SleepDao", f = "SleepDao.kt", l = {85, 86}, m = "deleteAccount")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public c6 f20761d;

        /* renamed from: e */
        public long f20762e;

        /* renamed from: f */
        public /* synthetic */ Object f20763f;

        /* renamed from: h */
        public int f20765h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            c6.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20763f = obj;
            this.f20765h |= Integer.MIN_VALUE;
            return c6.this.a(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.SleepDao", f = "SleepDao.kt", l = {222, 224}, m = "queryUnUploadData$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public Object f20766d;

        /* renamed from: e */
        public Date f20767e;

        /* renamed from: f */
        public long f20768f;

        /* renamed from: g */
        public int f20769g;

        /* renamed from: h */
        public /* synthetic */ Object f20770h;

        /* renamed from: j */
        public int f20772j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            c6.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20770h = obj;
            this.f20772j |= Integer.MIN_VALUE;
            return c6.n(c6.this, 0L, null, 0, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.SleepDao", f = "SleepDao.kt", l = {106, 121, 132}, m = "saveDeviceData$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public c6 f20773d;

        /* renamed from: e */
        public ArrayList f20774e;

        /* renamed from: f */
        public Date f20775f;

        /* renamed from: g */
        public rg.o f20776g;

        /* renamed from: h */
        public int[] f20777h;

        /* renamed from: i */
        public long f20778i;

        /* renamed from: j */
        public long f20779j;

        /* renamed from: k */
        public /* synthetic */ Object f20780k;

        /* renamed from: m */
        public int f20782m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            c6.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20780k = obj;
            this.f20782m |= Integer.MIN_VALUE;
            return c6.r(c6.this, 0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.SleepDao", f = "SleepDao.kt", l = {190, 192, 207}, m = "saveRemoteDetailData$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public c6 f20783d;

        /* renamed from: e */
        public SleepRecordBean f20784e;

        /* renamed from: f */
        public long f20785f;

        /* renamed from: g */
        public /* synthetic */ Object f20786g;

        /* renamed from: i */
        public int f20788i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            c6.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20786g = obj;
            this.f20788i |= Integer.MIN_VALUE;
            return c6.t(c6.this, 0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.SleepDao", f = "SleepDao.kt", l = {159, 164, 181}, m = "saveRemoteListData$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class e extends zl.c {

        /* renamed from: d */
        public c6 f20789d;

        /* renamed from: e */
        public Iterator f20790e;

        /* renamed from: f */
        public SleepRecordBean f20791f;

        /* renamed from: g */
        public rg.o f20792g;

        /* renamed from: h */
        public long f20793h;

        /* renamed from: i */
        public /* synthetic */ Object f20794i;

        /* renamed from: k */
        public int f20796k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(dVar);
            c6.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20794i = obj;
            this.f20796k |= Integer.MIN_VALUE;
            return c6.v(c6.this, 0L, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object n(mg.c6 r22, long r23, java.util.Date r25, int r26, xl.d<? super java.util.List<com.topstep.fitcloud.pro.shared.data.bean.data.SleepRecordBean>> r27) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c6.n(mg.c6, long, java.util.Date, int, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0243 A[LOOP:0: B:138:0x023d->B:140:0x0243, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object r(mg.c6 r27, long r28, oj.h r30, xl.d<? super java.lang.Boolean> r31) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c6.r(mg.c6, long, oj.h, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object t(mg.c6 r24, long r25, com.topstep.fitcloud.pro.shared.data.bean.data.SleepRecordBean r27, xl.d<? super tl.l> r28) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c6.t(mg.c6, long, com.topstep.fitcloud.pro.shared.data.bean.data.SleepRecordBean, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0130 -> B:105:0x0135). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0133 -> B:104:0x0134). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x00af -> B:73:0x0076). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object v(mg.c6 r21, long r22, java.util.List<com.topstep.fitcloud.pro.shared.data.bean.data.SleepRecordBean> r24, xl.d<? super tl.l> r25) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c6.v(mg.c6, long, java.util.List, xl.d):java.lang.Object");
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
            boolean r0 = r8 instanceof mg.c6.a
            if (r0 == 0) goto L13
            r0 = r8
            mg.c6$a r0 = (mg.c6.a) r0
            int r1 = r0.f20765h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20765h = r1
            goto L18
        L13:
            mg.c6$a r0 = new mg.c6$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f20763f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20765h
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
            long r6 = r0.f20762e
            mg.c6 r2 = r0.f20761d
            mf.a0.k(r8)
            goto L4b
        L3a:
            mf.a0.k(r8)
            r0.f20761d = r5
            r0.f20762e = r6
            r0.f20765h = r4
            java.lang.Object r8 = r5.d(r6, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            r8 = 0
            r0.f20761d = r8
            r0.f20765h = r3
            java.lang.Object r6 = r2.e(r6, r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            tl.l r6 = tl.l.f28297a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.c6.a(long, xl.d):java.lang.Object");
    }

    public abstract Object b(long j10, Date date, e eVar);

    public abstract Object c(long j10, Date date, d dVar);

    public abstract Object d(long j10, a aVar);

    public abstract Object e(long j10, a aVar);

    public abstract sm.u0 f(long j10, Date date);

    public abstract sm.u0 g(long j10, Date date, Date date2);

    public abstract Object h(rg.o oVar, c cVar);

    public abstract Object i(rg.o oVar, d dVar);

    public abstract Object j(rg.p pVar, zl.c cVar);

    public abstract Object k(long j10, Date date, zl.c cVar);

    public abstract Object l(long j10, Date date, d.y yVar);

    public Object m(long j10, Date date, int i10, d.o0 o0Var) {
        return n(this, j10, date, i10, o0Var);
    }

    public abstract Object o(long j10, Date date, b bVar);

    public abstract Object p(long j10, Date date, d.v vVar);

    public Object q(long j10, oj.h hVar, d.g0 g0Var) {
        return r(this, j10, hVar, g0Var);
    }

    public Object s(long j10, SleepRecordBean sleepRecordBean, d.y yVar) {
        return t(this, j10, sleepRecordBean, yVar);
    }

    public Object u(long j10, List<SleepRecordBean> list, xl.d<? super tl.l> dVar) {
        return v(this, j10, list, dVar);
    }

    public abstract Object w(long j10, Date date, int i10, b bVar);

    public abstract Object x(long j10, Date date, int i10, d.o0 o0Var);
}
