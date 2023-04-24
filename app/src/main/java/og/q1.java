package og;

import android.content.Context;
import com.topstep.fitcloud.pro.model.sport.push.SportPacket;
import java.util.List;

/* loaded from: classes2.dex */
public final class q1 implements p1 {

    /* renamed from: a */
    public final t f23456a;

    /* renamed from: b */
    public final vg.d f23457b;

    /* renamed from: c */
    public String f23458c;

    /* renamed from: d */
    public List<SportPacket> f23459d;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.SportPushRepositoryImpl", f = "SportPushRepository.kt", l = {31}, m = "getRemoteSportPacket")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public q1 f23460d;

        /* renamed from: e */
        public String f23461e;

        /* renamed from: f */
        public /* synthetic */ Object f23462f;

        /* renamed from: h */
        public int f23464h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            q1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23462f = obj;
            this.f23464h |= Integer.MIN_VALUE;
            return q1.this.b(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.SportPushRepositoryImpl", f = "SportPushRepository.kt", l = {51, 52, 53}, m = "getSportPushParams")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public Object f23465d;

        /* renamed from: e */
        public Object f23466e;

        /* renamed from: f */
        public Object f23467f;

        /* renamed from: g */
        public /* synthetic */ Object f23468g;

        /* renamed from: i */
        public int f23470i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            q1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23468g = obj;
            this.f23470i |= Integer.MIN_VALUE;
            return q1.this.a(this);
        }
    }

    public q1(Context context, t tVar, vg.d dVar) {
        gm.l.f(tVar, "deviceManager");
        this.f23456a = tVar;
        this.f23457b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143 A[LOOP:0: B:105:0x013d->B:107:0x0143, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0115  */
    @Override // og.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(xl.d<? super bg.a> r13) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: og.q1.a(xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, xl.d<? super java.util.List<com.topstep.fitcloud.pro.model.sport.push.SportPacket>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof og.q1.a
            if (r0 == 0) goto L13
            r0 = r6
            og.q1$a r0 = (og.q1.a) r0
            int r1 = r0.f23464h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23464h = r1
            goto L18
        L13:
            og.q1$a r0 = new og.q1$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23462f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f23464h
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.f23461e
            og.q1 r0 = r0.f23460d
            mf.a0.k(r6)
            goto L53
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            mf.a0.k(r6)
            java.util.List<com.topstep.fitcloud.pro.model.sport.push.SportPacket> r6 = r4.f23459d
            if (r6 == 0) goto L43
            java.lang.String r2 = r4.f23458c
            boolean r2 = gm.l.a(r5, r2)
            if (r2 == 0) goto L43
            goto L61
        L43:
            vg.d r6 = r4.f23457b
            r0.f23460d = r4
            r0.f23461e = r5
            r0.f23464h = r3
            java.lang.Object r6 = r6.n0(r5, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            r0 = r4
        L53:
            vg.i r6 = (vg.i) r6
            java.util.List r6 = r6.a()
            if (r6 != 0) goto L5d
            ul.s r6 = ul.s.f28879a
        L5d:
            r0.f23458c = r5
            r0.f23459d = r6
        L61:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: og.q1.b(java.lang.String, xl.d):java.lang.Object");
    }
}
