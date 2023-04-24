package tg;

import android.content.Context;
import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class b implements tg.a {

    /* renamed from: a */
    public final Context f28087a;

    /* renamed from: b */
    public final yg.j f28088b;

    /* renamed from: c */
    public final vg.d f28089c;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendDataRepositoryImpl", f = "FriendDataRepository.kt", l = {228}, m = "getEcgReportUrl")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public String f28090d;

        /* renamed from: e */
        public /* synthetic */ Object f28091e;

        /* renamed from: g */
        public int f28093g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28091e = obj;
            this.f28093g |= Integer.MIN_VALUE;
            return b.this.e(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendDataRepositoryImpl", f = "FriendDataRepository.kt", l = {168}, m = "requestBloodPressureDetail")
    /* renamed from: tg.b$b */
    /* loaded from: classes2.dex */
    public static final class C0502b extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f28094d;

        /* renamed from: f */
        public int f28096f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0502b(xl.d<? super C0502b> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28094d = obj;
            this.f28096f |= Integer.MIN_VALUE;
            return b.this.k(0L, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return bi.r.q(((vf.c) t10).f29268a, ((vf.c) t11).f29268a);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendDataRepositoryImpl", f = "FriendDataRepository.kt", l = {161}, m = "requestBloodPressureList")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f28097d;

        /* renamed from: f */
        public int f28099f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28097d = obj;
            this.f28099f |= Integer.MIN_VALUE;
            return b.this.c(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendDataRepositoryImpl", f = "FriendDataRepository.kt", l = {212}, m = "requestEcgDetail")
    /* loaded from: classes2.dex */
    public static final class e extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f28100d;

        /* renamed from: f */
        public int f28102f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28100d = obj;
            this.f28102f |= Integer.MIN_VALUE;
            return b.this.m(0L, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return bi.r.q(((SimpleEcgRecord) t11).f9596b, ((SimpleEcgRecord) t10).f9596b);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendDataRepositoryImpl", f = "FriendDataRepository.kt", l = {206}, m = "requestEcgList")
    /* loaded from: classes2.dex */
    public static final class g extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f28103d;

        /* renamed from: f */
        public int f28105f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28103d = obj;
            this.f28105f |= Integer.MIN_VALUE;
            return b.this.f(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendDataRepositoryImpl", f = "FriendDataRepository.kt", l = {138}, m = "requestHeartRateDetail")
    /* loaded from: classes2.dex */
    public static final class h extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f28106d;

        /* renamed from: f */
        public int f28108f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(xl.d<? super h> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28106d = obj;
            this.f28108f |= Integer.MIN_VALUE;
            return b.this.i(0L, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return bi.r.q(((vf.f) t10).f29279a, ((vf.f) t11).f29279a);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendDataRepositoryImpl", f = "FriendDataRepository.kt", l = {131}, m = "requestHeartRateList")
    /* loaded from: classes2.dex */
    public static final class j extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f28109d;

        /* renamed from: f */
        public int f28111f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(xl.d<? super j> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28109d = obj;
            this.f28111f |= Integer.MIN_VALUE;
            return b.this.h(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendDataRepositoryImpl", f = "FriendDataRepository.kt", l = {153}, m = "requestOxygenDetail")
    /* loaded from: classes2.dex */
    public static final class k extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f28112d;

        /* renamed from: f */
        public int f28114f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(xl.d<? super k> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28112d = obj;
            this.f28114f |= Integer.MIN_VALUE;
            return b.this.g(0L, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return bi.r.q(((vf.k) t10).f29287a, ((vf.k) t11).f29287a);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendDataRepositoryImpl", f = "FriendDataRepository.kt", l = {146}, m = "requestOxygenList")
    /* loaded from: classes2.dex */
    public static final class m extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f28115d;

        /* renamed from: f */
        public int f28117f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(xl.d<? super m> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28115d = obj;
            this.f28117f |= Integer.MIN_VALUE;
            return b.this.j(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendDataRepositoryImpl", f = "FriendDataRepository.kt", l = {198}, m = "requestPressureDetail")
    /* loaded from: classes2.dex */
    public static final class n extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f28118d;

        /* renamed from: f */
        public int f28120f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(xl.d<? super n> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28118d = obj;
            this.f28120f |= Integer.MIN_VALUE;
            return b.this.l(0L, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return bi.r.q(((vf.m) t10).f29295a, ((vf.m) t11).f29295a);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendDataRepositoryImpl", f = "FriendDataRepository.kt", l = {191}, m = "requestPressureList")
    /* loaded from: classes2.dex */
    public static final class p extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f28121d;

        /* renamed from: f */
        public int f28123f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(xl.d<? super p> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28121d = obj;
            this.f28123f |= Integer.MIN_VALUE;
            return b.this.n(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendDataRepositoryImpl", f = "FriendDataRepository.kt", l = {183}, m = "requestTemperatureDetail")
    /* loaded from: classes2.dex */
    public static final class q extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f28124d;

        /* renamed from: f */
        public int f28126f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(xl.d<? super q> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28124d = obj;
            this.f28126f |= Integer.MIN_VALUE;
            return b.this.d(0L, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return bi.r.q(((vf.r) t10).f29322a, ((vf.r) t11).f29322a);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendDataRepositoryImpl", f = "FriendDataRepository.kt", l = {176}, m = "requestTemperatureList")
    /* loaded from: classes2.dex */
    public static final class s extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f28127d;

        /* renamed from: f */
        public int f28129f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(xl.d<? super s> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28127d = obj;
            this.f28129f |= Integer.MIN_VALUE;
            return b.this.a(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendDataRepositoryImpl", f = "FriendDataRepository.kt", l = {50}, m = "requestTotalData")
    /* loaded from: classes2.dex */
    public static final class t extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f28130d;

        /* renamed from: f */
        public int f28132f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(xl.d<? super t> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28130d = obj;
            this.f28132f |= Integer.MIN_VALUE;
            return b.this.b(0L, this);
        }
    }

    public b(Context context, yg.b bVar, vg.d dVar) {
        this.f28087a = context;
        this.f28088b = bVar;
        this.f28089c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // tg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r12, xl.d<? super java.util.List<vf.r>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof tg.b.s
            if (r0 == 0) goto L13
            r0 = r14
            tg.b$s r0 = (tg.b.s) r0
            int r1 = r0.f28129f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28129f = r1
            goto L18
        L13:
            tg.b$s r0 = new tg.b$s
            r0.<init>(r14)
        L18:
            r9 = r0
            java.lang.Object r14 = r9.f28127d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f28129f
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            mf.a0.k(r14)
            goto L50
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            mf.a0.k(r14)
            yg.j r14 = r11.f28088b
            java.lang.Long r14 = yg.l.a(r14)
            if (r14 == 0) goto L8b
            long r3 = r14.longValue()
            vg.d r1 = r11.f28089c
            r6 = 0
            r7 = 0
            r8 = 0
            r9.f28129f = r2
            r2 = r3
            r4 = r12
            java.lang.Object r14 = r1.g(r2, r4, r6, r7, r8, r9)
            if (r14 != r0) goto L50
            return r0
        L50:
            vg.i r14 = (vg.i) r14
            java.util.List r12 = r14.a()
            if (r12 == 0) goto L8b
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = ul.l.B(r12, r14)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L67:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L82
            java.lang.Object r14 = r12.next()
            com.topstep.fitcloud.pro.shared.data.bean.data.TemperatureRecordBean r14 = (com.topstep.fitcloud.pro.shared.data.bean.data.TemperatureRecordBean) r14
            vf.r r0 = new vf.r
            java.util.Date r1 = r14.f10016a
            float r2 = r14.f10017b
            float r14 = r14.f10018c
            r0.<init>(r1, r2, r14, r10)
            r13.add(r0)
            goto L67
        L82:
            tg.b$r r12 = new tg.b$r
            r12.<init>()
            java.util.List r10 = ul.q.U(r13, r12)
        L8b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.a(long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01af  */
    @Override // tg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r22, xl.d<? super yf.a> r24) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.b(long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // tg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r12, xl.d<? super java.util.List<vf.c>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof tg.b.d
            if (r0 == 0) goto L13
            r0 = r14
            tg.b$d r0 = (tg.b.d) r0
            int r1 = r0.f28099f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28099f = r1
            goto L18
        L13:
            tg.b$d r0 = new tg.b$d
            r0.<init>(r14)
        L18:
            r9 = r0
            java.lang.Object r14 = r9.f28097d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f28099f
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            mf.a0.k(r14)
            goto L50
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            mf.a0.k(r14)
            yg.j r14 = r11.f28088b
            java.lang.Long r14 = yg.l.a(r14)
            if (r14 == 0) goto L8b
            long r3 = r14.longValue()
            vg.d r1 = r11.f28089c
            r6 = 0
            r7 = 0
            r8 = 0
            r9.f28099f = r2
            r2 = r3
            r4 = r12
            java.lang.Object r14 = r1.H(r2, r4, r6, r7, r8, r9)
            if (r14 != r0) goto L50
            return r0
        L50:
            vg.i r14 = (vg.i) r14
            java.util.List r12 = r14.a()
            if (r12 == 0) goto L8b
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = ul.l.B(r12, r14)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L67:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L82
            java.lang.Object r14 = r12.next()
            com.topstep.fitcloud.pro.shared.data.bean.data.BloodPressureRecordBean r14 = (com.topstep.fitcloud.pro.shared.data.bean.data.BloodPressureRecordBean) r14
            vf.c r0 = new vf.c
            java.util.Date r1 = r14.f9892a
            int r2 = r14.f9893b
            int r14 = r14.f9894c
            r0.<init>(r1, r2, r14, r10)
            r13.add(r0)
            goto L67
        L82:
            tg.b$c r12 = new tg.b$c
            r12.<init>()
            java.util.List r10 = ul.q.U(r13, r12)
        L8b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.c(long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0076  */
    @Override // tg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r12, java.util.Date r14, xl.d<? super vf.r> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof tg.b.q
            if (r0 == 0) goto L13
            r0 = r15
            tg.b$q r0 = (tg.b.q) r0
            int r1 = r0.f28126f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28126f = r1
            goto L18
        L13:
            tg.b$q r0 = new tg.b$q
            r0.<init>(r15)
        L18:
            r9 = r0
            java.lang.Object r15 = r9.f28124d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f28126f
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            mf.a0.k(r15)
            goto L5b
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            mf.a0.k(r15)
            yg.j r15 = r11.f28088b
            java.lang.Long r15 = yg.l.a(r15)
            if (r15 == 0) goto La6
            long r3 = r15.longValue()
            vg.d r1 = r11.f28089c
            java.lang.String r15 = "date"
            gm.l.f(r14, r15)
            java.lang.String r6 = dg.a.a(r14)
            java.lang.String r7 = dg.a.a(r14)
            r8 = 1
            r9.f28126f = r2
            r2 = r3
            r4 = r12
            java.lang.Object r15 = r1.g(r2, r4, r6, r7, r8, r9)
            if (r15 != r0) goto L5b
            return r0
        L5b:
            vg.i r15 = (vg.i) r15
            java.util.List r12 = r15.a()
            if (r12 == 0) goto La6
            java.lang.Object r12 = ul.q.I(r12)
            com.topstep.fitcloud.pro.shared.data.bean.data.TemperatureRecordBean r12 = (com.topstep.fitcloud.pro.shared.data.bean.data.TemperatureRecordBean) r12
            if (r12 != 0) goto L6c
            goto La6
        L6c:
            java.util.Date r13 = r12.f10016a
            float r14 = r12.f10017b
            float r15 = r12.f10018c
            java.util.List<com.topstep.fitcloud.pro.shared.data.bean.data.TemperatureItemBean> r12 = r12.f10020e
            if (r12 == 0) goto La0
            java.util.ArrayList r10 = new java.util.ArrayList
            r0 = 10
            int r0 = ul.l.B(r12, r0)
            r10.<init>(r0)
            java.util.Iterator r12 = r12.iterator()
        L85:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r12.next()
            com.topstep.fitcloud.pro.shared.data.bean.data.TemperatureItemBean r0 = (com.topstep.fitcloud.pro.shared.data.bean.data.TemperatureItemBean) r0
            vf.q r1 = new vf.q
            java.util.Date r2 = r0.f10010a
            float r3 = r0.f10011b
            float r0 = r0.f10012c
            r1.<init>(r2, r3, r0)
            r10.add(r1)
            goto L85
        La0:
            vf.r r12 = new vf.r
            r12.<init>(r13, r14, r15, r10)
            return r12
        La6:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.d(long, java.util.Date, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // tg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r12, java.util.UUID r14, xl.d<? super java.lang.String> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof tg.b.a
            if (r0 == 0) goto L13
            r0 = r15
            tg.b$a r0 = (tg.b.a) r0
            int r1 = r0.f28093g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28093g = r1
            goto L18
        L13:
            tg.b$a r0 = new tg.b$a
            r0.<init>(r15)
        L18:
            r8 = r0
            java.lang.Object r15 = r8.f28091e
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r8.f28093g
            r9 = 0
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.String r12 = r8.f28090d
            mf.a0.k(r15)
            goto L79
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            mf.a0.k(r15)
            yg.j r15 = r11.f28088b
            java.lang.Long r15 = yg.l.a(r15)
            if (r15 == 0) goto L8e
            long r3 = r15.longValue()
            com.topstep.fitcloud.pro.model.data.EcgReport$b r15 = com.topstep.fitcloud.pro.model.data.EcgReport.Companion
            android.content.Context r1 = r11.f28087a
            r15.getClass()
            java.lang.String r15 = com.topstep.fitcloud.pro.model.data.EcgReport.b.b(r1)
            vg.d r1 = r11.f28089c
            java.lang.String r14 = r14.toString()
            java.lang.String r5 = "ecgId.toString()"
            gm.l.e(r14, r5)
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r6 = "US"
            gm.l.e(r5, r6)
            java.lang.String r6 = r14.toUpperCase(r5)
            java.lang.String r14 = "this as java.lang.String).toUpperCase(locale)"
            gm.l.e(r6, r14)
            r8.f28090d = r15
            r8.f28093g = r2
            r2 = r3
            r4 = r12
            r7 = r15
            java.lang.Object r12 = r1.l0(r2, r4, r6, r7, r8)
            if (r12 != r0) goto L76
            return r0
        L76:
            r10 = r15
            r15 = r12
            r12 = r10
        L79:
            vg.i r15 = (vg.i) r15
            java.util.List r13 = r15.a()
            com.topstep.fitcloud.pro.model.data.EcgReport$b r14 = com.topstep.fitcloud.pro.model.data.EcgReport.Companion
            r14.getClass()
            com.topstep.fitcloud.pro.model.data.EcgReport r12 = com.topstep.fitcloud.pro.model.data.EcgReport.b.a(r12, r13)
            if (r12 == 0) goto L8e
            java.lang.String r9 = r12.getUrl()
        L8e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.e(long, java.util.UUID, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // tg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(long r11, xl.d<? super java.util.List<com.topstep.fitcloud.pro.model.data.SimpleEcgRecord>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof tg.b.g
            if (r0 == 0) goto L13
            r0 = r13
            tg.b$g r0 = (tg.b.g) r0
            int r1 = r0.f28105f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28105f = r1
            goto L18
        L13:
            tg.b$g r0 = new tg.b$g
            r0.<init>(r13)
        L18:
            r8 = r0
            java.lang.Object r13 = r8.f28103d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r8.f28105f
            r9 = 0
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            mf.a0.k(r13)
            goto L4f
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            mf.a0.k(r13)
            yg.j r13 = r10.f28088b
            java.lang.Long r13 = yg.l.a(r13)
            if (r13 == 0) goto L60
            long r3 = r13.longValue()
            vg.d r1 = r10.f28089c
            r6 = 0
            r7 = 0
            r8.f28105f = r2
            r2 = r3
            r4 = r11
            java.lang.Object r13 = r1.t(r2, r4, r6, r7, r8)
            if (r13 != r0) goto L4f
            return r0
        L4f:
            vg.i r13 = (vg.i) r13
            java.util.List r11 = r13.a()
            if (r11 == 0) goto L60
            tg.b$f r12 = new tg.b$f
            r12.<init>()
            java.util.List r9 = ul.q.U(r11, r12)
        L60:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.f(long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0074  */
    @Override // tg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(long r12, java.util.Date r14, xl.d<? super vf.k> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof tg.b.k
            if (r0 == 0) goto L13
            r0 = r15
            tg.b$k r0 = (tg.b.k) r0
            int r1 = r0.f28114f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28114f = r1
            goto L18
        L13:
            tg.b$k r0 = new tg.b$k
            r0.<init>(r15)
        L18:
            r9 = r0
            java.lang.Object r15 = r9.f28112d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f28114f
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            mf.a0.k(r15)
            goto L5b
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            mf.a0.k(r15)
            yg.j r15 = r11.f28088b
            java.lang.Long r15 = yg.l.a(r15)
            if (r15 == 0) goto La2
            long r3 = r15.longValue()
            vg.d r1 = r11.f28089c
            java.lang.String r15 = "date"
            gm.l.f(r14, r15)
            java.lang.String r6 = dg.a.a(r14)
            java.lang.String r7 = dg.a.a(r14)
            r8 = 1
            r9.f28114f = r2
            r2 = r3
            r4 = r12
            java.lang.Object r15 = r1.J(r2, r4, r6, r7, r8, r9)
            if (r15 != r0) goto L5b
            return r0
        L5b:
            vg.i r15 = (vg.i) r15
            java.util.List r12 = r15.a()
            if (r12 == 0) goto La2
            java.lang.Object r12 = ul.q.I(r12)
            com.topstep.fitcloud.pro.shared.data.bean.data.OxygenRecordBean r12 = (com.topstep.fitcloud.pro.shared.data.bean.data.OxygenRecordBean) r12
            if (r12 != 0) goto L6c
            goto La2
        L6c:
            java.util.Date r13 = r12.f9961a
            int r14 = r12.f9962b
            java.util.List<com.topstep.fitcloud.pro.shared.data.bean.data.OxygenItemBean> r12 = r12.f9964d
            if (r12 == 0) goto L9c
            java.util.ArrayList r10 = new java.util.ArrayList
            r15 = 10
            int r15 = ul.l.B(r12, r15)
            r10.<init>(r15)
            java.util.Iterator r12 = r12.iterator()
        L83:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L9c
            java.lang.Object r15 = r12.next()
            com.topstep.fitcloud.pro.shared.data.bean.data.OxygenItemBean r15 = (com.topstep.fitcloud.pro.shared.data.bean.data.OxygenItemBean) r15
            vf.j r0 = new vf.j
            java.util.Date r1 = r15.f9956a
            int r15 = r15.f9957b
            r0.<init>(r15, r1)
            r10.add(r0)
            goto L83
        L9c:
            vf.k r12 = new vf.k
            r12.<init>(r13, r14, r10)
            return r12
        La2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.g(long, java.util.Date, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // tg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(long r12, xl.d<? super java.util.List<vf.f>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof tg.b.j
            if (r0 == 0) goto L13
            r0 = r14
            tg.b$j r0 = (tg.b.j) r0
            int r1 = r0.f28111f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28111f = r1
            goto L18
        L13:
            tg.b$j r0 = new tg.b$j
            r0.<init>(r14)
        L18:
            r9 = r0
            java.lang.Object r14 = r9.f28109d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f28111f
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            mf.a0.k(r14)
            goto L50
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            mf.a0.k(r14)
            yg.j r14 = r11.f28088b
            java.lang.Long r14 = yg.l.a(r14)
            if (r14 == 0) goto L89
            long r3 = r14.longValue()
            vg.d r1 = r11.f28089c
            r6 = 0
            r7 = 0
            r8 = 0
            r9.f28111f = r2
            r2 = r3
            r4 = r12
            java.lang.Object r14 = r1.h(r2, r4, r6, r7, r8, r9)
            if (r14 != r0) goto L50
            return r0
        L50:
            vg.i r14 = (vg.i) r14
            java.util.List r12 = r14.a()
            if (r12 == 0) goto L89
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = ul.l.B(r12, r14)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L67:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L80
            java.lang.Object r14 = r12.next()
            com.topstep.fitcloud.pro.shared.data.bean.data.HeartRateRecordBean r14 = (com.topstep.fitcloud.pro.shared.data.bean.data.HeartRateRecordBean) r14
            vf.f r0 = new vf.f
            java.util.Date r1 = r14.f9946a
            int r14 = r14.f9947b
            r0.<init>(r1, r14, r10)
            r13.add(r0)
            goto L67
        L80:
            tg.b$i r12 = new tg.b$i
            r12.<init>()
            java.util.List r10 = ul.q.U(r13, r12)
        L89:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.h(long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0074  */
    @Override // tg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(long r12, java.util.Date r14, xl.d<? super vf.f> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof tg.b.h
            if (r0 == 0) goto L13
            r0 = r15
            tg.b$h r0 = (tg.b.h) r0
            int r1 = r0.f28108f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28108f = r1
            goto L18
        L13:
            tg.b$h r0 = new tg.b$h
            r0.<init>(r15)
        L18:
            r9 = r0
            java.lang.Object r15 = r9.f28106d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f28108f
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            mf.a0.k(r15)
            goto L5b
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            mf.a0.k(r15)
            yg.j r15 = r11.f28088b
            java.lang.Long r15 = yg.l.a(r15)
            if (r15 == 0) goto La2
            long r3 = r15.longValue()
            vg.d r1 = r11.f28089c
            java.lang.String r15 = "date"
            gm.l.f(r14, r15)
            java.lang.String r6 = dg.a.a(r14)
            java.lang.String r7 = dg.a.a(r14)
            r8 = 1
            r9.f28108f = r2
            r2 = r3
            r4 = r12
            java.lang.Object r15 = r1.h(r2, r4, r6, r7, r8, r9)
            if (r15 != r0) goto L5b
            return r0
        L5b:
            vg.i r15 = (vg.i) r15
            java.util.List r12 = r15.a()
            if (r12 == 0) goto La2
            java.lang.Object r12 = ul.q.I(r12)
            com.topstep.fitcloud.pro.shared.data.bean.data.HeartRateRecordBean r12 = (com.topstep.fitcloud.pro.shared.data.bean.data.HeartRateRecordBean) r12
            if (r12 != 0) goto L6c
            goto La2
        L6c:
            java.util.Date r13 = r12.f9946a
            int r14 = r12.f9947b
            java.util.List<com.topstep.fitcloud.pro.shared.data.bean.data.HeartRateItemBean> r12 = r12.f9949d
            if (r12 == 0) goto L9c
            java.util.ArrayList r10 = new java.util.ArrayList
            r15 = 10
            int r15 = ul.l.B(r12, r15)
            r10.<init>(r15)
            java.util.Iterator r12 = r12.iterator()
        L83:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L9c
            java.lang.Object r15 = r12.next()
            com.topstep.fitcloud.pro.shared.data.bean.data.HeartRateItemBean r15 = (com.topstep.fitcloud.pro.shared.data.bean.data.HeartRateItemBean) r15
            vf.e r0 = new vf.e
            java.util.Date r1 = r15.f9941a
            int r15 = r15.f9942b
            r0.<init>(r15, r1)
            r10.add(r0)
            goto L83
        L9c:
            vf.f r12 = new vf.f
            r12.<init>(r13, r14, r10)
            return r12
        La2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.i(long, java.util.Date, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // tg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(long r12, xl.d<? super java.util.List<vf.k>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof tg.b.m
            if (r0 == 0) goto L13
            r0 = r14
            tg.b$m r0 = (tg.b.m) r0
            int r1 = r0.f28117f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28117f = r1
            goto L18
        L13:
            tg.b$m r0 = new tg.b$m
            r0.<init>(r14)
        L18:
            r9 = r0
            java.lang.Object r14 = r9.f28115d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f28117f
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            mf.a0.k(r14)
            goto L50
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            mf.a0.k(r14)
            yg.j r14 = r11.f28088b
            java.lang.Long r14 = yg.l.a(r14)
            if (r14 == 0) goto L89
            long r3 = r14.longValue()
            vg.d r1 = r11.f28089c
            r6 = 0
            r7 = 0
            r8 = 0
            r9.f28117f = r2
            r2 = r3
            r4 = r12
            java.lang.Object r14 = r1.J(r2, r4, r6, r7, r8, r9)
            if (r14 != r0) goto L50
            return r0
        L50:
            vg.i r14 = (vg.i) r14
            java.util.List r12 = r14.a()
            if (r12 == 0) goto L89
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = ul.l.B(r12, r14)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L67:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L80
            java.lang.Object r14 = r12.next()
            com.topstep.fitcloud.pro.shared.data.bean.data.OxygenRecordBean r14 = (com.topstep.fitcloud.pro.shared.data.bean.data.OxygenRecordBean) r14
            vf.k r0 = new vf.k
            java.util.Date r1 = r14.f9961a
            int r14 = r14.f9962b
            r0.<init>(r1, r14, r10)
            r13.add(r0)
            goto L67
        L80:
            tg.b$l r12 = new tg.b$l
            r12.<init>()
            java.util.List r10 = ul.q.U(r13, r12)
        L89:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.j(long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0076  */
    @Override // tg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(long r12, java.util.Date r14, xl.d<? super vf.c> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof tg.b.C0502b
            if (r0 == 0) goto L13
            r0 = r15
            tg.b$b r0 = (tg.b.C0502b) r0
            int r1 = r0.f28096f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28096f = r1
            goto L18
        L13:
            tg.b$b r0 = new tg.b$b
            r0.<init>(r15)
        L18:
            r9 = r0
            java.lang.Object r15 = r9.f28094d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f28096f
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            mf.a0.k(r15)
            goto L5b
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            mf.a0.k(r15)
            yg.j r15 = r11.f28088b
            java.lang.Long r15 = yg.l.a(r15)
            if (r15 == 0) goto La6
            long r3 = r15.longValue()
            vg.d r1 = r11.f28089c
            java.lang.String r15 = "date"
            gm.l.f(r14, r15)
            java.lang.String r6 = dg.a.a(r14)
            java.lang.String r7 = dg.a.a(r14)
            r8 = 1
            r9.f28096f = r2
            r2 = r3
            r4 = r12
            java.lang.Object r15 = r1.H(r2, r4, r6, r7, r8, r9)
            if (r15 != r0) goto L5b
            return r0
        L5b:
            vg.i r15 = (vg.i) r15
            java.util.List r12 = r15.a()
            if (r12 == 0) goto La6
            java.lang.Object r12 = ul.q.I(r12)
            com.topstep.fitcloud.pro.shared.data.bean.data.BloodPressureRecordBean r12 = (com.topstep.fitcloud.pro.shared.data.bean.data.BloodPressureRecordBean) r12
            if (r12 != 0) goto L6c
            goto La6
        L6c:
            java.util.Date r13 = r12.f9892a
            int r14 = r12.f9893b
            int r15 = r12.f9894c
            java.util.List<com.topstep.fitcloud.pro.shared.data.bean.data.BloodPressureItemBean> r12 = r12.f9896e
            if (r12 == 0) goto La0
            java.util.ArrayList r10 = new java.util.ArrayList
            r0 = 10
            int r0 = ul.l.B(r12, r0)
            r10.<init>(r0)
            java.util.Iterator r12 = r12.iterator()
        L85:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r12.next()
            com.topstep.fitcloud.pro.shared.data.bean.data.BloodPressureItemBean r0 = (com.topstep.fitcloud.pro.shared.data.bean.data.BloodPressureItemBean) r0
            vf.b r1 = new vf.b
            java.util.Date r2 = r0.f9886a
            int r3 = r0.f9887b
            int r0 = r0.f9888c
            r1.<init>(r3, r0, r2)
            r10.add(r1)
            goto L85
        La0:
            vf.c r12 = new vf.c
            r12.<init>(r13, r14, r15, r10)
            return r12
        La6:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.k(long, java.util.Date, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0074  */
    @Override // tg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(long r12, java.util.Date r14, xl.d<? super vf.m> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof tg.b.n
            if (r0 == 0) goto L13
            r0 = r15
            tg.b$n r0 = (tg.b.n) r0
            int r1 = r0.f28120f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28120f = r1
            goto L18
        L13:
            tg.b$n r0 = new tg.b$n
            r0.<init>(r15)
        L18:
            r9 = r0
            java.lang.Object r15 = r9.f28118d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f28120f
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            mf.a0.k(r15)
            goto L5b
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            mf.a0.k(r15)
            yg.j r15 = r11.f28088b
            java.lang.Long r15 = yg.l.a(r15)
            if (r15 == 0) goto La2
            long r3 = r15.longValue()
            vg.d r1 = r11.f28089c
            java.lang.String r15 = "date"
            gm.l.f(r14, r15)
            java.lang.String r6 = dg.a.a(r14)
            java.lang.String r7 = dg.a.a(r14)
            r8 = 1
            r9.f28120f = r2
            r2 = r3
            r4 = r12
            java.lang.Object r15 = r1.p0(r2, r4, r6, r7, r8, r9)
            if (r15 != r0) goto L5b
            return r0
        L5b:
            vg.i r15 = (vg.i) r15
            java.util.List r12 = r15.a()
            if (r12 == 0) goto La2
            java.lang.Object r12 = ul.q.I(r12)
            com.topstep.fitcloud.pro.shared.data.bean.data.PressureRecordBean r12 = (com.topstep.fitcloud.pro.shared.data.bean.data.PressureRecordBean) r12
            if (r12 != 0) goto L6c
            goto La2
        L6c:
            java.util.Date r13 = r12.f9976a
            int r14 = r12.f9977b
            java.util.List<com.topstep.fitcloud.pro.shared.data.bean.data.PressureItemBean> r12 = r12.f9979d
            if (r12 == 0) goto L9c
            java.util.ArrayList r10 = new java.util.ArrayList
            r15 = 10
            int r15 = ul.l.B(r12, r15)
            r10.<init>(r15)
            java.util.Iterator r12 = r12.iterator()
        L83:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L9c
            java.lang.Object r15 = r12.next()
            com.topstep.fitcloud.pro.shared.data.bean.data.PressureItemBean r15 = (com.topstep.fitcloud.pro.shared.data.bean.data.PressureItemBean) r15
            vf.l r0 = new vf.l
            java.util.Date r1 = r15.f9971a
            int r15 = r15.f9972b
            r0.<init>(r15, r1)
            r10.add(r0)
            goto L83
        L9c:
            vf.m r12 = new vf.m
            r12.<init>(r13, r14, r10)
            return r12
        La2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.l(long, java.util.Date, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    @Override // tg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(long r21, java.util.UUID r23, xl.d<? super com.topstep.fitcloud.pro.model.data.EcgRecord> r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r24
            boolean r2 = r1 instanceof tg.b.e
            if (r2 == 0) goto L17
            r2 = r1
            tg.b$e r2 = (tg.b.e) r2
            int r3 = r2.f28102f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f28102f = r3
            goto L1c
        L17:
            tg.b$e r2 = new tg.b$e
            r2.<init>(r1)
        L1c:
            r9 = r2
            java.lang.Object r1 = r9.f28100d
            yl.a r2 = yl.a.COROUTINE_SUSPENDED
            int r3 = r9.f28102f
            r10 = 0
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            mf.a0.k(r1)
            goto L6b
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            mf.a0.k(r1)
            yg.j r1 = r0.f28088b
            java.lang.Long r1 = yg.l.a(r1)
            if (r1 == 0) goto L95
            long r5 = r1.longValue()
            vg.d r3 = r0.f28089c
            java.lang.String r1 = r23.toString()
            java.lang.String r7 = "ecgId.toString()"
            gm.l.e(r1, r7)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r8 = "US"
            gm.l.e(r7, r8)
            java.lang.String r8 = r1.toUpperCase(r7)
            java.lang.String r1 = "this as java.lang.String).toUpperCase(locale)"
            gm.l.e(r8, r1)
            r9.f28102f = r4
            r4 = r5
            r6 = r21
            java.lang.Object r1 = r3.e0(r4, r6, r8, r9)
            if (r1 != r2) goto L6b
            return r2
        L6b:
            vg.l r1 = (vg.l) r1
            java.lang.Object r1 = r1.a()
            com.topstep.fitcloud.pro.shared.data.bean.data.EcgRecordBean r1 = (com.topstep.fitcloud.pro.shared.data.bean.data.EcgRecordBean) r1
            if (r1 != 0) goto L76
            return r10
        L76:
            com.topstep.fitcloud.pro.model.data.EcgRecord r2 = new com.topstep.fitcloud.pro.model.data.EcgRecord
            java.util.UUID r12 = r1.f9903a
            java.util.Date r13 = r1.f9904b
            int r14 = r1.f9905c
            int r15 = r1.f9906d
            int r3 = r1.f9907e
            java.lang.String r4 = r1.f9909g
            java.util.List<java.lang.Integer> r5 = r1.f9910h
            java.util.List<com.topstep.fitcloud.pro.model.data.EcgReport> r1 = r1.f9911i
            r11 = r2
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return r2
        L95:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.m(long, java.util.UUID, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // tg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(long r12, xl.d<? super java.util.List<vf.m>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof tg.b.p
            if (r0 == 0) goto L13
            r0 = r14
            tg.b$p r0 = (tg.b.p) r0
            int r1 = r0.f28123f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28123f = r1
            goto L18
        L13:
            tg.b$p r0 = new tg.b$p
            r0.<init>(r14)
        L18:
            r9 = r0
            java.lang.Object r14 = r9.f28121d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f28123f
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            mf.a0.k(r14)
            goto L50
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            mf.a0.k(r14)
            yg.j r14 = r11.f28088b
            java.lang.Long r14 = yg.l.a(r14)
            if (r14 == 0) goto L89
            long r3 = r14.longValue()
            vg.d r1 = r11.f28089c
            r6 = 0
            r7 = 0
            r8 = 0
            r9.f28123f = r2
            r2 = r3
            r4 = r12
            java.lang.Object r14 = r1.p0(r2, r4, r6, r7, r8, r9)
            if (r14 != r0) goto L50
            return r0
        L50:
            vg.i r14 = (vg.i) r14
            java.util.List r12 = r14.a()
            if (r12 == 0) goto L89
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = ul.l.B(r12, r14)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L67:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L80
            java.lang.Object r14 = r12.next()
            com.topstep.fitcloud.pro.shared.data.bean.data.PressureRecordBean r14 = (com.topstep.fitcloud.pro.shared.data.bean.data.PressureRecordBean) r14
            vf.m r0 = new vf.m
            java.util.Date r1 = r14.f9976a
            int r14 = r14.f9977b
            r0.<init>(r1, r14, r10)
            r13.add(r0)
            goto L67
        L80:
            tg.b$o r12 = new tg.b$o
            r12.<init>()
            java.util.List r10 = ul.q.U(r13, r12)
        L89:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.b.n(long, xl.d):java.lang.Object");
    }
}
