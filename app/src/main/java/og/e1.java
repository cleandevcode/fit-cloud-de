package og;

import a0.a2;
import android.content.Context;
import android.util.SparseArray;
import com.topstep.fitcloud.pro.model.dial.DialPacket;
import com.topstep.fitcloud.pro.shared.data.bean.DialPacketComplexBean;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.List;

/* loaded from: classes2.dex */
public final class e1 implements d1 {

    /* renamed from: a */
    public final Context f23303a;

    /* renamed from: b */
    public final mf.h0 f23304b;

    /* renamed from: c */
    public final t f23305c;

    /* renamed from: d */
    public final vg.d f23306d;

    /* renamed from: e */
    public final AppDatabase f23307e;

    /* renamed from: f */
    public a f23308f;

    /* renamed from: g */
    public List<DialPacket> f23309g;

    /* renamed from: h */
    public final SparseArray<DialPacketComplexBean> f23310h;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final String f23311a;

        /* renamed from: b */
        public final int f23312b;

        /* renamed from: c */
        public final String f23313c;

        public a(String str, int i10, String str2) {
            gm.l.f(str, "hardwareInfo");
            gm.l.f(str2, "toolVersion");
            this.f23311a = str;
            this.f23312b = i10;
            this.f23313c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return gm.l.a(this.f23311a, aVar.f23311a) && this.f23312b == aVar.f23312b && gm.l.a(this.f23313c, aVar.f23313c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f23313c.hashCode() + (((this.f23311a.hashCode() * 31) + this.f23312b) * 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("RemoteCacheKey(hardwareInfo=");
            a10.append(this.f23311a);
            a10.append(", lcd=");
            a10.append(this.f23312b);
            a10.append(", toolVersion=");
            return a2.a(a10, this.f23313c, ')');
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public String f23314a;

        /* renamed from: b */
        public int f23315b;

        public b(String str, int i10) {
            this.f23314a = str;
            this.f23315b = i10;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DialRepositoryImpl", f = "DialRepository.kt", l = {309, 331}, m = "getDialCustomParams")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public Object f23316d;

        /* renamed from: e */
        public /* synthetic */ Object f23317e;

        /* renamed from: g */
        public int f23319g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            e1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23317e = obj;
            this.f23319g |= Integer.MIN_VALUE;
            return e1.this.d(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DialRepositoryImpl", f = "DialRepository.kt", l = {142, 161}, m = "getDialPushParams")
    /* loaded from: classes2.dex */
    public static final class d extends zl.c {

        /* renamed from: d */
        public e1 f23320d;

        /* renamed from: e */
        public nj.c f23321e;

        /* renamed from: f */
        public sj.b f23322f;

        /* renamed from: g */
        public List f23323g;

        /* renamed from: h */
        public boolean f23324h;

        /* renamed from: i */
        public boolean f23325i;

        /* renamed from: j */
        public /* synthetic */ Object f23326j;

        /* renamed from: l */
        public int f23328l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(dVar);
            e1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23326j = obj;
            this.f23328l |= Integer.MIN_VALUE;
            return e1.this.c(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DialRepositoryImpl", f = "DialRepository.kt", l = {62}, m = "getRemoteDialPacket")
    /* loaded from: classes2.dex */
    public static final class e extends zl.c {

        /* renamed from: d */
        public e1 f23329d;

        /* renamed from: e */
        public a f23330e;

        /* renamed from: f */
        public /* synthetic */ Object f23331f;

        /* renamed from: h */
        public int f23333h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(dVar);
            e1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23331f = obj;
            this.f23333h |= Integer.MIN_VALUE;
            return e1.this.e(null, this);
        }
    }

    public e1(Context context, mf.h0 h0Var, t tVar, vg.d dVar, AppDatabase appDatabase) {
        gm.l.f(h0Var, "moshi");
        gm.l.f(tVar, "deviceManager");
        gm.l.f(appDatabase, "appDatabase");
        this.f23303a = context;
        this.f23304b = h0Var;
        this.f23305c = tVar;
        this.f23306d = dVar;
        this.f23307e = appDatabase;
        this.f23310h = new SparseArray<>();
    }

    @Override // og.d1
    public final Object a(int i10, String str, xl.d dVar) {
        Object c10 = this.f23307e.G().c(i10, str, dVar);
        return c10 == yl.a.COROUTINE_SUSPENDED ? c10 : tl.l.f28297a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    @Override // og.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable b(com.topstep.fitcloud.pro.model.dial.DialPushParams r17, xl.d r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof og.g1
            if (r2 == 0) goto L17
            r2 = r1
            og.g1 r2 = (og.g1) r2
            int r3 = r2.f23354f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f23354f = r3
            goto L1c
        L17:
            og.g1 r2 = new og.g1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f23352d
            yl.a r3 = yl.a.COROUTINE_SUSPENDED
            int r4 = r2.f23354f
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            mf.a0.k(r1)
            goto L51
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            mf.a0.k(r1)
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r1 = r0.f23307e
            mg.ma r1 = r1.G()
            java.lang.String r4 = r17.getProjectNum()
            int r6 = r17.getLcd()
            java.lang.String r7 = r17.getToolVersion()
            r2.f23354f = r5
            java.lang.Object r1 = r1.b(r4, r6, r7, r2)
            if (r1 != r3) goto L51
            return r3
        L51:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L91
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = ul.l.B(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L93
            java.lang.Object r3 = r1.next()
            pg.l r3 = (pg.l) r3
            com.topstep.fitcloud.pro.model.dial.DialPacket r15 = new com.topstep.fitcloud.pro.model.dial.DialPacket
            int r5 = r3.f24061b
            int r6 = r3.f24062c
            java.lang.String r7 = r3.f24063d
            int r8 = r3.f24064e
            java.lang.String r9 = r3.f24065f
            java.lang.String r10 = r3.f24066g
            java.lang.String r11 = r3.f24067h
            java.lang.String r12 = r3.f24068i
            long r13 = r3.f24069j
            r3 = 0
            r4 = r15
            r0 = r15
            r15 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
            r2.add(r0)
            r0 = r16
            goto L64
        L91:
            ul.s r2 = ul.s.f28879a
        L93:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: og.e1.b(com.topstep.fitcloud.pro.model.dial.DialPushParams, xl.d):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02f9  */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.List] */
    @Override // og.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(xl.d<? super com.topstep.fitcloud.pro.model.dial.DialPushParams> r42) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: og.e1.c(xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ca  */
    @Override // og.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.topstep.fitcloud.pro.model.dial.DialPushParams r13, xl.d<? super xf.a> r14) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: og.e1.d(com.topstep.fitcloud.pro.model.dial.DialPushParams, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007b  */
    @Override // og.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(com.topstep.fitcloud.pro.model.dial.DialPushParams r8, xl.d<? super java.util.List<com.topstep.fitcloud.pro.model.dial.DialPacket>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof og.e1.e
            if (r0 == 0) goto L13
            r0 = r9
            og.e1$e r0 = (og.e1.e) r0
            int r1 = r0.f23333h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23333h = r1
            goto L18
        L13:
            og.e1$e r0 = new og.e1$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f23331f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f23333h
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            og.e1$a r8 = r0.f23330e
            og.e1 r0 = r0.f23329d
            mf.a0.k(r9)
            goto L73
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            mf.a0.k(r9)
            og.e1$a r9 = new og.e1$a
            java.lang.String r2 = r8.getHardwareInfo()
            int r4 = r8.getLcd()
            java.lang.String r5 = r8.getToolVersion()
            r9.<init>(r2, r4, r5)
            java.util.List<com.topstep.fitcloud.pro.model.dial.DialPacket> r2 = r7.f23309g
            if (r2 == 0) goto L54
            og.e1$a r4 = r7.f23308f
            boolean r4 = gm.l.a(r9, r4)
            if (r4 == 0) goto L54
            goto L82
        L54:
            vg.d r2 = r7.f23306d
            java.lang.String r4 = r8.getHardwareInfo()
            int r5 = r8.getLcd()
            java.lang.String r8 = r8.getToolVersion()
            r0.f23329d = r7
            r0.f23330e = r9
            r0.f23333h = r3
            java.lang.Object r8 = r2.M(r4, r5, r8, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r0 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L73:
            vg.i r9 = (vg.i) r9
            java.util.List r9 = r9.a()
            if (r9 != 0) goto L7d
            ul.s r9 = ul.s.f28879a
        L7d:
            r2 = r9
            r0.f23308f = r8
            r0.f23309g = r2
        L82:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: og.e1.e(com.topstep.fitcloud.pro.model.dial.DialPushParams, xl.d):java.lang.Object");
    }

    @Override // og.d1
    public final Object f(String str, DialPacket dialPacket, xl.d<? super tl.l> dVar) {
        Object a10 = this.f23307e.G().a(new pg.l(str, dialPacket.getDialNum(), dialPacket.getLcd(), dialPacket.getToolVersion(), dialPacket.getBinVersion(), dialPacket.getImgUrl(), dialPacket.getDeviceImgUrl(), dialPacket.getBinUrl(), dialPacket.getName(), dialPacket.getBinSize()), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b5 A[LOOP:0: B:76:0x00af->B:78:0x00b5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable g(java.util.HashSet r8, xl.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof og.f1
            if (r0 == 0) goto L13
            r0 = r9
            og.f1 r0 = (og.f1) r0
            int r1 = r0.f23347h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23347h = r1
            goto L18
        L13:
            og.f1 r0 = new og.f1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f23345f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f23347h
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.util.ArrayList r8 = r0.f23344e
            og.e1 r0 = r0.f23343d
            mf.a0.k(r9)
            goto La1
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            mf.a0.k(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            int r2 = r8.size()
            r9.<init>(r2)
            android.util.SparseArray<com.topstep.fitcloud.pro.shared.data.bean.DialPacketComplexBean> r2 = r7.f23310h
            int r2 = r2.size()
            if (r2 <= 0) goto L77
            java.util.Iterator r2 = r8.iterator()
            java.lang.String r4 = "dialNumbers.iterator()"
            gm.l.e(r2, r4)
        L51:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L77
            java.lang.Object r4 = r2.next()
            java.lang.String r5 = "iterator.next()"
            gm.l.e(r4, r5)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            android.util.SparseArray<com.topstep.fitcloud.pro.shared.data.bean.DialPacketComplexBean> r5 = r7.f23310h
            java.lang.Object r4 = r5.get(r4)
            com.topstep.fitcloud.pro.shared.data.bean.DialPacketComplexBean r4 = (com.topstep.fitcloud.pro.shared.data.bean.DialPacketComplexBean) r4
            if (r4 == 0) goto L51
            r9.add(r4)
            r2.remove()
            goto L51
        L77:
            boolean r2 = r8.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto Lc7
            vg.d r2 = r7.f23306d
            mf.h0 r4 = r7.f23304b
            int[] r8 = ul.q.X(r8)
            r0.f23343d = r7
            r0.f23344e = r9
            r0.f23347h = r3
            java.lang.Class<int[]> r3 = int[].class
            mf.t r3 = r4.a(r3)
            java.lang.String r8 = r3.e(r8)
            java.lang.Object r8 = r2.j(r8, r0)
            if (r8 != r1) goto L9d
            return r1
        L9d:
            r0 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        La1:
            vg.i r9 = (vg.i) r9
            java.util.List r9 = r9.a()
            if (r9 != 0) goto Lab
            ul.s r9 = ul.s.f28879a
        Lab:
            java.util.Iterator r1 = r9.iterator()
        Laf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc3
            java.lang.Object r2 = r1.next()
            com.topstep.fitcloud.pro.shared.data.bean.DialPacketComplexBean r2 = (com.topstep.fitcloud.pro.shared.data.bean.DialPacketComplexBean) r2
            android.util.SparseArray<com.topstep.fitcloud.pro.shared.data.bean.DialPacketComplexBean> r3 = r0.f23310h
            int r4 = r2.f9777a
            r3.put(r4, r2)
            goto Laf
        Lc3:
            r8.addAll(r9)
            r9 = r8
        Lc7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: og.e1.g(java.util.HashSet, xl.d):java.io.Serializable");
    }
}
