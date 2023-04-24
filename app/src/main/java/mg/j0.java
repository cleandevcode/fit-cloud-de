package mg;

import ch.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class j0 {

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.CityDao", f = "CityDao.kt", l = {67}, m = "checkAndClear")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f21138d;

        /* renamed from: f */
        public int f21140f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            j0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21138d = obj;
            this.f21140f |= Integer.MIN_VALUE;
            return j0.this.a(null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.CityDao", f = "CityDao.kt", l = {125, 126}, m = "deleteCityAndKeys$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public j0 f21141d;

        /* renamed from: e */
        public String f21142e;

        /* renamed from: f */
        public /* synthetic */ Object f21143f;

        /* renamed from: h */
        public int f21145h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            j0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21143f = obj;
            this.f21145h |= Integer.MIN_VALUE;
            return j0.e(j0.this, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.CityDao", f = "CityDao.kt", l = {109, 115}, m = "saveCity$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public j0 f21146d;

        /* renamed from: e */
        public pg.b f21147e;

        /* renamed from: f */
        public List f21148f;

        /* renamed from: g */
        public /* synthetic */ Object f21149g;

        /* renamed from: i */
        public int f21151i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            j0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21149g = obj;
            this.f21151i |= Integer.MIN_VALUE;
            return j0.m(j0.this, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0068 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object e(mg.j0 r6, java.lang.String r7, xl.d<? super tl.l> r8) {
        /*
            boolean r0 = r8 instanceof mg.j0.b
            if (r0 == 0) goto L13
            r0 = r8
            mg.j0$b r0 = (mg.j0.b) r0
            int r1 = r0.f21145h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21145h = r1
            goto L18
        L13:
            mg.j0$b r0 = new mg.j0$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f21143f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f21145h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r7 = r0.f21142e
            mg.j0 r6 = r0.f21141d
            mf.a0.k(r8)
            goto L5b
        L3a:
            mf.a0.k(r8)
            do.a$b r8 = p000do.a.f13275a
            java.lang.String r2 = "Weather"
            r8.t(r2)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r5 = 0
            r2[r5] = r7
            java.lang.String r5 = "deleteCityAndKeys:%s"
            r8.h(r5, r2)
            r0.f21141d = r6
            r0.f21142e = r7
            r0.f21145h = r4
            java.lang.Object r8 = r6.c(r7, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r8 = 0
            r0.f21141d = r8
            r0.f21142e = r8
            r0.f21145h = r3
            java.lang.Object r6 = r6.f(r7, r0)
            if (r6 != r1) goto L69
            return r1
        L69:
            tl.l r6 = tl.l.f28297a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.j0.e(mg.j0, java.lang.String, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0098 A[LOOP:0: B:58:0x0092->B:60:0x0098, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m(mg.j0 r9, pg.b r10, java.util.List<java.lang.String> r11, xl.d<? super tl.l> r12) {
        /*
            boolean r0 = r12 instanceof mg.j0.c
            if (r0 == 0) goto L13
            r0 = r12
            mg.j0$c r0 = (mg.j0.c) r0
            int r1 = r0.f21151i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21151i = r1
            goto L18
        L13:
            mg.j0$c r0 = new mg.j0$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f21149g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f21151i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            mf.a0.k(r12)
            goto Lb9
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.util.List r11 = r0.f21148f
            pg.b r10 = r0.f21147e
            mg.j0 r9 = r0.f21146d
            mf.a0.k(r12)
            goto L7f
        L3d:
            mf.a0.k(r12)
            do.a$b r12 = p000do.a.f13275a
            java.lang.String r2 = "Weather"
            r12.t(r2)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r10
            java.lang.String r7 = "save city:%s"
            r12.h(r7, r5)
            java.util.Iterator r12 = r11.iterator()
        L55:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L70
            java.lang.Object r5 = r12.next()
            java.lang.String r5 = (java.lang.String) r5
            do.a$b r7 = p000do.a.f13275a
            r7.t(r2)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r6] = r5
            java.lang.String r5 = "save key:%s"
            r7.h(r5, r8)
            goto L55
        L70:
            r0.f21146d = r9
            r0.f21147e = r10
            r0.f21148f = r11
            r0.f21151i = r4
            java.lang.Object r12 = r9.g(r10, r0)
            if (r12 != r1) goto L7f
            return r1
        L7f:
            long r4 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r12 = new java.util.ArrayList
            r2 = 10
            int r2 = ul.l.B(r11, r2)
            r12.<init>(r2)
            java.util.Iterator r11 = r11.iterator()
        L92:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto La9
            java.lang.Object r2 = r11.next()
            java.lang.String r2 = (java.lang.String) r2
            pg.c r6 = new pg.c
            java.lang.String r7 = r10.f24019a
            r6.<init>(r2, r4, r7)
            r12.add(r6)
            goto L92
        La9:
            r10 = 0
            r0.f21146d = r10
            r0.f21147e = r10
            r0.f21148f = r10
            r0.f21151i = r3
            java.lang.Object r9 = r9.h(r12, r0)
            if (r9 != r1) goto Lb9
            return r1
        Lb9:
            tl.l r9 = tl.l.f28297a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.j0.m(mg.j0, pg.b, java.util.List, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(pg.c r5, xl.d<? super tl.l> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.j0.a
            if (r0 == 0) goto L13
            r0 = r6
            mg.j0$a r0 = (mg.j0.a) r0
            int r1 = r0.f21140f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21140f = r1
            goto L18
        L13:
            mg.j0$a r0 = new mg.j0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f21138d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f21140f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            mf.a0.k(r6)
            java.lang.String r5 = r5.f24025b
            r0.f21140f = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            java.lang.Number r6 = (java.lang.Number) r6
            int r5 = r6.intValue()
            do.a$b r6 = p000do.a.f13275a
            java.lang.String r0 = "Weather"
            r6.t(r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            r0[r1] = r2
            java.lang.String r5 = "checkAndClear count:%d"
            r6.h(r5, r0)
            tl.l r5 = tl.l.f28297a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.j0.a(pg.c, xl.d):java.lang.Object");
    }

    public abstract Object b(String str, a aVar);

    public abstract Object c(String str, b bVar);

    public Object d(String str, d.C0073d c0073d) {
        return e(this, str, c0073d);
    }

    public abstract Object f(String str, b bVar);

    public abstract Object g(pg.b bVar, c cVar);

    public abstract Object h(ArrayList arrayList, c cVar);

    public abstract Object i(String str, k0 k0Var);

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0076, code lost:
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0071 -> B:64:0x0074). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.util.ArrayList r9, xl.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof mg.k0
            if (r0 == 0) goto L13
            r0 = r10
            mg.k0 r0 = (mg.k0) r0
            int r1 = r0.f21184h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21184h = r1
            goto L18
        L13:
            mg.k0 r0 = new mg.k0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f21182f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f21184h
            r3 = 2
            r4 = 3
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L52
            if (r2 == r5) goto L46
            if (r2 == r3) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r9 = r0.f21180d
            pg.c r9 = (pg.c) r9
            mf.a0.k(r10)
            goto L98
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.Object r9 = r0.f21181e
            pg.c r9 = (pg.c) r9
            java.lang.Object r2 = r0.f21180d
            mg.j0 r2 = (mg.j0) r2
            mf.a0.k(r10)
            goto L89
        L46:
            java.lang.Object r9 = r0.f21181e
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r2 = r0.f21180d
            mg.j0 r2 = (mg.j0) r2
            mf.a0.k(r10)
            goto L74
        L52:
            mf.a0.k(r10)
            java.util.Iterator r9 = r9.iterator()
            r2 = r8
            r10 = r6
        L5b:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto L78
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            r0.f21180d = r2
            r0.f21181e = r9
            r0.f21184h = r5
            java.lang.Object r10 = r2.k(r10, r0)
            if (r10 != r1) goto L74
            return r1
        L74:
            pg.c r10 = (pg.c) r10
            if (r10 == 0) goto L5b
        L78:
            if (r10 != 0) goto L7b
            return r6
        L7b:
            r0.f21180d = r2
            r0.f21181e = r10
            r0.f21184h = r3
            java.lang.Object r9 = r2.a(r10, r0)
            if (r9 != r1) goto L88
            return r1
        L88:
            r9 = r10
        L89:
            java.lang.String r10 = r9.f24025b
            r0.f21180d = r9
            r0.f21181e = r6
            r0.f21184h = r4
            java.lang.Object r10 = r2.i(r10, r0)
            if (r10 != r1) goto L98
            return r1
        L98:
            pg.b r10 = (pg.b) r10
            r0 = 0
            java.lang.String r1 = "Weather"
            if (r10 != 0) goto Lb0
            do.a$b r2 = p000do.a.f13275a
            r2.t(r1)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r9 = r9.f24025b
            r1[r0] = r9
            java.lang.String r9 = "found city:error %s not exist"
            r2.p(r9, r1)
            goto Lbe
        Lb0:
            do.a$b r9 = p000do.a.f13275a
            r9.t(r1)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r0] = r10
            java.lang.String r0 = "found city:%s"
            r9.h(r0, r1)
        Lbe:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.j0.j(java.util.ArrayList, xl.d):java.lang.Object");
    }

    public abstract Object k(String str, k0 k0Var);

    public Object l(pg.b bVar, List list, d.a aVar) {
        return m(this, bVar, list, aVar);
    }

    public abstract Object n(int i10, String str, d.C0073d c0073d);
}
