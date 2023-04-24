package lg;

import android.content.Context;
import bi.z0;
import com.topstep.fitcloud.pro.model.data.SportGoal;
import com.topstep.fitcloud.pro.model.data.SportRecord;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import com.topstep.fitcloud.pro.shared.data.entity.data.SportGoalCache;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import l2.a2;
import l2.l2;
import l2.z1;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public final class r0 implements j0 {

    /* renamed from: a */
    public final yg.j f19892a;

    /* renamed from: b */
    public final AppDatabase f19893b;

    /* renamed from: c */
    public final pm.e0 f19894c;

    /* renamed from: d */
    public final yg.u f19895d;

    /* renamed from: e */
    public final vg.d f19896e;

    /* renamed from: f */
    public final mf.h0 f19897f;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl", f = "SportRepository.kt", l = {163, 169}, m = "getNewDataCount")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public r0 f19898d;

        /* renamed from: e */
        public long f19899e;

        /* renamed from: f */
        public int f19900f;

        /* renamed from: g */
        public /* synthetic */ Object f19901g;

        /* renamed from: i */
        public int f19903i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            r0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19901g = obj;
            this.f19903i |= Integer.MIN_VALUE;
            return r0.this.e(0L, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.a<l2<Integer, SportRecord>> {

        /* renamed from: b */
        public final /* synthetic */ long f19904b;

        /* renamed from: c */
        public final /* synthetic */ r0 f19905c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, r0 r0Var) {
            super(0);
            this.f19904b = j10;
            this.f19905c = r0Var;
        }

        @Override // fm.a
        public final l2<Integer, SportRecord> m() {
            return new h0(this.f19904b, this.f19905c.f19893b);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl", f = "SportRepository.kt", l = {120, 122, 128, 130}, m = "requestDetail")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public Object f19906d;

        /* renamed from: e */
        public UUID f19907e;

        /* renamed from: f */
        public /* synthetic */ Object f19908f;

        /* renamed from: h */
        public int f19910h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            r0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19908f = obj;
            this.f19910h |= Integer.MIN_VALUE;
            return r0.this.c(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl", f = "SportRepository.kt", l = {268, DfuBaseService.NOTIFICATION_ID}, m = "setGoal")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public r0 f19911d;

        /* renamed from: e */
        public SportGoal f19912e;

        /* renamed from: f */
        public long f19913f;

        /* renamed from: g */
        public /* synthetic */ Object f19914g;

        /* renamed from: i */
        public int f19916i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            r0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19914g = obj;
            this.f19916i |= Integer.MIN_VALUE;
            return r0.this.a(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl", f = "SportRepository.kt", l = {226, 227, 233, 234}, m = "syncGoals")
    /* loaded from: classes2.dex */
    public static final class e extends zl.c {

        /* renamed from: d */
        public r0 f19917d;

        /* renamed from: e */
        public SportGoalCache f19918e;

        /* renamed from: f */
        public long f19919f;

        /* renamed from: g */
        public long f19920g;

        /* renamed from: h */
        public /* synthetic */ Object f19921h;

        /* renamed from: j */
        public int f19923j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(dVar);
            r0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19921h = obj;
            this.f19923j |= Integer.MIN_VALUE;
            return r0.this.h(0L, null, 0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl", f = "SportRepository.kt", l = {175, 177}, m = "uploadData")
    /* loaded from: classes2.dex */
    public static final class f extends zl.c {

        /* renamed from: d */
        public r0 f19924d;

        /* renamed from: e */
        public long f19925e;

        /* renamed from: f */
        public /* synthetic */ Object f19926f;

        /* renamed from: h */
        public int f19928h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(dVar);
            r0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19926f = obj;
            this.f19928h |= Integer.MIN_VALUE;
            return r0.this.i(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl", f = "SportRepository.kt", l = {213, 218}, m = "uploadGoals")
    /* loaded from: classes2.dex */
    public static final class g extends zl.c {

        /* renamed from: d */
        public r0 f19929d;

        /* renamed from: e */
        public long f19930e;

        /* renamed from: f */
        public /* synthetic */ Object f19931f;

        /* renamed from: h */
        public int f19933h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(dVar);
            r0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19931f = obj;
            this.f19933h |= Integer.MIN_VALUE;
            return r0.this.j(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl", f = "SportRepository.kt", l = {183, 194, 197, 200, 207, 207}, m = "uploadRecords")
    /* loaded from: classes2.dex */
    public static final class h extends zl.c {

        /* renamed from: d */
        public Object f19934d;

        /* renamed from: e */
        public mf.t f19935e;

        /* renamed from: f */
        public gm.z f19936f;

        /* renamed from: g */
        public gm.y f19937g;

        /* renamed from: h */
        public Iterator f19938h;

        /* renamed from: i */
        public Object f19939i;

        /* renamed from: j */
        public Object f19940j;

        /* renamed from: k */
        public Iterator f19941k;

        /* renamed from: l */
        public rg.r f19942l;

        /* renamed from: m */
        public Collection f19943m;

        /* renamed from: n */
        public long f19944n;

        /* renamed from: o */
        public /* synthetic */ Object f19945o;

        /* renamed from: q */
        public int f19947q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(xl.d<? super h> dVar) {
            super(dVar);
            r0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19945o = obj;
            this.f19947q |= Integer.MIN_VALUE;
            return r0.this.k(0L, this);
        }
    }

    public r0(Context context, yg.b bVar, AppDatabase appDatabase, pm.e0 e0Var, yg.b0 b0Var, vg.d dVar, mf.h0 h0Var) {
        gm.l.f(appDatabase, "appDatabase");
        gm.l.f(e0Var, "applicationScope");
        gm.l.f(h0Var, "moshi");
        this.f19892a = bVar;
        this.f19893b = appDatabase;
        this.f19894c = e0Var;
        this.f19895d = b0Var;
        this.f19896e = dVar;
        this.f19897f = h0Var;
        z0.g(e0Var, null, 0, new k0(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f0 A[RETURN] */
    @Override // lg.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.topstep.fitcloud.pro.model.data.SportGoal r18, xl.d<? super tl.l> r19) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.r0.a(com.topstep.fitcloud.pro.model.data.SportGoal, xl.d):java.lang.Object");
    }

    @Override // lg.j0
    public final tm.j b() {
        return bi.r.O(this.f19892a.h(), new o0(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f0  */
    @Override // lg.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.UUID r12, xl.d<? super com.topstep.fitcloud.pro.model.data.SportRecord> r13) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.r0.c(java.util.UUID, xl.d):java.lang.Object");
    }

    public final tm.j d(int i10) {
        return bi.r.O(this.f19892a.h(), new l0(null, i10, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(long r7, xl.d<? super java.lang.Integer> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof lg.r0.a
            if (r0 == 0) goto L13
            r0 = r9
            lg.r0$a r0 = (lg.r0.a) r0
            int r1 = r0.f19903i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19903i = r1
            goto L18
        L13:
            lg.r0$a r0 = new lg.r0$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19901g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f19903i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            int r7 = r0.f19900f
            mf.a0.k(r9)
            goto L7d
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            long r7 = r0.f19899e
            lg.r0 r2 = r0.f19898d
            mf.a0.k(r9)
            goto L5e
        L3c:
            mf.a0.k(r9)
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r9 = r6.f19893b
            mg.d9 r9 = r9.E()
            r2 = 2003(0x7d3, float:2.807E-42)
            sm.u0 r2 = r9.b(r2, r7)
            mg.y8 r5 = new mg.y8
            r5.<init>(r2, r9)
            r0.f19898d = r6
            r0.f19899e = r7
            r0.f19903i = r4
            java.lang.Object r9 = bi.r.y(r5, r0)
            if (r9 != r1) goto L5d
            return r1
        L5d:
            r2 = r6
        L5e:
            com.topstep.fitcloud.pro.shared.data.entity.data.SportGoalCache r9 = (com.topstep.fitcloud.pro.shared.data.entity.data.SportGoalCache) r9
            if (r9 == 0) goto L67
            int r9 = r9.f10073b
            if (r9 != r4) goto L67
            goto L68
        L67:
            r4 = 0
        L68:
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r9 = r2.f19893b
            mg.d7 r9 = r9.C()
            r2 = 0
            r0.f19898d = r2
            r0.f19900f = r4
            r0.f19903i = r3
            java.lang.Object r9 = r9.s(r7, r0)
            if (r9 != r1) goto L7c
            return r1
        L7c:
            r7 = r4
        L7d:
            java.lang.Number r9 = (java.lang.Number) r9
            int r8 = r9.intValue()
            int r8 = r8 + r7
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.r0.e(long, xl.d):java.lang.Object");
    }

    public final z1<Integer, SportRecord> f(long j10) {
        return new z1<>(new a2(), hh.b.f(j10) ? null : new i0(j10, this.f19893b, this.f19896e, this.f19892a, this.f19895d), new b(j10, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(long r10, java.util.ArrayList r12, xl.d r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof lg.s0
            if (r0 == 0) goto L13
            r0 = r13
            lg.s0 r0 = (lg.s0) r0
            int r1 = r0.f19958i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19958i = r1
            goto L18
        L13:
            lg.s0 r0 = new lg.s0
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f19956g
            yl.a r7 = yl.a.COROUTINE_SUSPENDED
            int r1 = r0.f19958i
            r8 = 1
            if (r1 == 0) goto L36
            if (r1 != r8) goto L2e
            long r10 = r0.f19955f
            java.util.Iterator r12 = r0.f19954e
            lg.r0 r1 = r0.f19953d
            mf.a0.k(r13)
            r13 = r1
            goto L3e
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            mf.a0.k(r13)
            java.util.Iterator r12 = r12.iterator()
            r13 = r9
        L3e:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r12.next()
            r4 = r1
            oj.j r4 = (oj.j) r4
            int r1 = r4.f23590c
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 > r2) goto L52
            goto L3e
        L52:
            int r1 = r4.f23589b
            int r1 = com.topstep.fitcloud.pro.model.data.SportRecord.a.a(r1)
            if (r1 != 0) goto L5c
            r5 = 1
            goto L5e
        L5c:
            r1 = 0
            r5 = 0
        L5e:
            if (r5 == 0) goto L6a
            float r1 = r4.f23591d
            r2 = 1036831949(0x3dcccccd, float:0.1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L73
            goto L3e
        L6a:
            float r1 = r4.f23592e
            r2 = 1084227584(0x40a00000, float:5.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L73
            goto L3e
        L73:
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r1 = r13.f19893b
            mg.d7 r1 = r1.C()
            r0.f19953d = r13
            r0.f19954e = r12
            r0.f19955f = r10
            r0.f19958i = r8
            r2 = r10
            r6 = r0
            java.lang.Object r1 = r1.v(r2, r4, r5, r6)
            if (r1 != r7) goto L3e
            return r7
        L8a:
            tl.l r10 = tl.l.f28297a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.r0.g(long, java.util.ArrayList, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00da A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(long r10, com.topstep.fitcloud.pro.shared.data.entity.data.SportGoalCache r12, long r13, xl.d<? super tl.l> r15) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.r0.h(long, com.topstep.fitcloud.pro.shared.data.entity.data.SportGoalCache, long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(long r9, xl.d<? super tl.l> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof lg.r0.f
            if (r0 == 0) goto L13
            r0 = r11
            lg.r0$f r0 = (lg.r0.f) r0
            int r1 = r0.f19928h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19928h = r1
            goto L18
        L13:
            lg.r0$f r0 = new lg.r0$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f19926f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f19928h
            r3 = 0
            java.lang.String r4 = "SportRepository"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            mf.a0.k(r11)
            goto L66
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            long r9 = r0.f19925e
            lg.r0 r2 = r0.f19924d
            mf.a0.k(r11)
            goto L5a
        L3d:
            mf.a0.k(r11)
            do.a$b r11 = p000do.a.f13275a
            r11.t(r4)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r7 = "uploadSport start"
            r11.h(r7, r2)
            r0.f19924d = r8
            r0.f19925e = r9
            r0.f19928h = r6
            java.lang.Object r11 = r8.k(r9, r0)
            if (r11 != r1) goto L59
            return r1
        L59:
            r2 = r8
        L5a:
            r11 = 0
            r0.f19924d = r11
            r0.f19928h = r5
            java.lang.Object r9 = r2.j(r9, r0)
            if (r9 != r1) goto L66
            return r1
        L66:
            do.a$b r9 = p000do.a.f13275a
            r9.t(r4)
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r11 = "uploadSport finish"
            r9.h(r11, r10)
            tl.l r9 = tl.l.f28297a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.r0.i(long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(long r9, xl.d<? super tl.l> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof lg.r0.g
            if (r0 == 0) goto L13
            r0 = r11
            lg.r0$g r0 = (lg.r0.g) r0
            int r1 = r0.f19933h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19933h = r1
            goto L18
        L13:
            lg.r0$g r0 = new lg.r0$g
            r0.<init>(r11)
        L18:
            r7 = r0
            java.lang.Object r11 = r7.f19931f
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r7.f19933h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            mf.a0.k(r11)
            goto L7a
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            long r9 = r7.f19930e
            lg.r0 r1 = r7.f19929d
            mf.a0.k(r11)
            goto L5d
        L3b:
            mf.a0.k(r11)
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r11 = r8.f19893b
            mg.d9 r11 = r11.E()
            r1 = 2003(0x7d3, float:2.807E-42)
            sm.u0 r1 = r11.b(r1, r9)
            mg.y8 r4 = new mg.y8
            r4.<init>(r1, r11)
            r7.f19929d = r8
            r7.f19930e = r9
            r7.f19933h = r3
            java.lang.Object r11 = bi.r.y(r4, r7)
            if (r11 != r0) goto L5c
            return r0
        L5c:
            r1 = r8
        L5d:
            r4 = r11
            com.topstep.fitcloud.pro.shared.data.entity.data.SportGoalCache r4 = (com.topstep.fitcloud.pro.shared.data.entity.data.SportGoalCache) r4
            if (r4 == 0) goto L7d
            int r11 = r4.f10073b
            if (r11 != 0) goto L67
            goto L7d
        L67:
            yg.j r11 = r1.f19892a
            long r5 = yg.l.d(r11, r9)
            r11 = 0
            r7.f19929d = r11
            r7.f19933h = r2
            r2 = r9
            java.lang.Object r9 = r1.h(r2, r4, r5, r7)
            if (r9 != r0) goto L7a
            return r0
        L7a:
            tl.l r9 = tl.l.f28297a
            return r9
        L7d:
            tl.l r9 = tl.l.f28297a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.r0.j(long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x010a A[Catch: all -> 0x021f, TRY_LEAVE, TryCatch #4 {all -> 0x021f, blocks: (B:176:0x0210, B:170:0x01bd, B:172:0x01c3, B:150:0x0104, B:152:0x010a), top: B:206:0x0210 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0135 A[Catch: all -> 0x022b, TRY_LEAVE, TryCatch #2 {all -> 0x022b, blocks: (B:154:0x012f, B:156:0x0135, B:164:0x0182), top: B:202:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0182 A[Catch: all -> 0x022b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x022b, blocks: (B:154:0x012f, B:156:0x0135, B:164:0x0182), top: B:202:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01c3 A[Catch: all -> 0x021f, TryCatch #4 {all -> 0x021f, blocks: (B:176:0x0210, B:170:0x01bd, B:172:0x01c3, B:150:0x0104, B:152:0x010a), top: B:206:0x0210 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0287 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0288  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x0178 -> B:202:0x012f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x01b4 -> B:170:0x01bd). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x020e -> B:206:0x0210). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(long r20, xl.d<? super tl.l> r22) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.r0.k(long, xl.d):java.lang.Object");
    }
}
