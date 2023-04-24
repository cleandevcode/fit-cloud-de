package mg;

import android.net.Uri;
import java.util.Date;
import jg.b;
import kg.f;
import kg.m;

/* loaded from: classes2.dex */
public abstract class hb {

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.UserDao", f = "UserDao.kt", l = {73, 94}, m = "saveModifyUser$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public hb f21080d;

        /* renamed from: e */
        public Date f21081e;

        /* renamed from: f */
        public Integer f21082f;

        /* renamed from: g */
        public Float f21083g;

        /* renamed from: h */
        public Float f21084h;

        /* renamed from: i */
        public Uri f21085i;

        /* renamed from: j */
        public String f21086j;

        /* renamed from: k */
        public /* synthetic */ Object f21087k;

        /* renamed from: m */
        public int f21089m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            hb.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21087k = obj;
            this.f21089m |= Integer.MIN_VALUE;
            return hb.k(hb.this, 0L, null, null, null, null, null, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.UserDao", f = "UserDao.kt", l = {57, 59}, m = "saveSyncUser$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public hb f21090d;

        /* renamed from: e */
        public pg.m f21091e;

        /* renamed from: f */
        public pg.m f21092f;

        /* renamed from: g */
        public /* synthetic */ Object f21093g;

        /* renamed from: i */
        public int f21095i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            hb.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21093g = obj;
            this.f21095i |= Integer.MIN_VALUE;
            return hb.m(hb.this, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object k(mg.hb r31, long r32, java.util.Date r34, java.lang.Integer r35, java.lang.Float r36, java.lang.Float r37, android.net.Uri r38, java.lang.String r39, xl.d<? super tl.l> r40) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.hb.k(mg.hb, long, java.util.Date, java.lang.Integer, java.lang.Float, java.lang.Float, android.net.Uri, java.lang.String, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m(mg.hb r9, pg.m r10, pg.m r11, xl.d<? super tl.l> r12) {
        /*
            boolean r0 = r12 instanceof mg.hb.b
            if (r0 == 0) goto L13
            r0 = r12
            mg.hb$b r0 = (mg.hb.b) r0
            int r1 = r0.f21095i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21095i = r1
            goto L18
        L13:
            mg.hb$b r0 = new mg.hb$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f21093g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f21095i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r12)
            goto L7c
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            pg.m r11 = r0.f21092f
            pg.m r10 = r0.f21091e
            mg.hb r9 = r0.f21090d
            mf.a0.k(r12)
            goto L50
        L3c:
            mf.a0.k(r12)
            long r5 = r11.f24070d
            r0.f21090d = r9
            r0.f21091e = r10
            r0.f21092f = r11
            r0.f21095i = r4
            java.lang.Object r12 = r9.e(r5, r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            pg.m r12 = (pg.m) r12
            r2 = 0
            if (r10 != 0) goto L58
            if (r12 == 0) goto L63
            goto L65
        L58:
            if (r12 == 0) goto L65
            long r5 = r10.f24083q
            long r7 = r12.f24083q
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L63
            goto L65
        L63:
            r10 = 0
            goto L66
        L65:
            r10 = 1
        L66:
            if (r10 != 0) goto L7f
            pg.m[] r10 = new pg.m[r4]
            r10[r2] = r11
            r11 = 0
            r0.f21090d = r11
            r0.f21091e = r11
            r0.f21092f = r11
            r0.f21095i = r3
            java.lang.Object r9 = r9.d(r10, r0)
            if (r9 != r1) goto L7c
            return r1
        L7c:
            tl.l r9 = tl.l.f28297a
            return r9
        L7f:
            tl.l r9 = tl.l.f28297a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.hb.m(mg.hb, pg.m, pg.m, xl.d):java.lang.Object");
    }

    public abstract Object a(long j10, b.C0309b c0309b);

    public abstract sm.u0 b(long j10);

    public abstract sm.u0 c(long j10);

    public abstract Object d(pg.m[] mVarArr, zl.c cVar);

    public abstract Object e(long j10, zl.c cVar);

    public abstract Object f(long j10, zl.c cVar);

    public abstract sm.u0 g(long j10);

    public abstract Object h(long j10, xl.d<? super String> dVar);

    public abstract Object i(long j10, b.f fVar);

    public Object j(long j10, Date date, Integer num, Float f10, Float f11, Uri uri, String str, xl.d<? super tl.l> dVar) {
        return k(this, j10, date, num, f10, f11, uri, str, dVar);
    }

    public Object l(pg.m mVar, pg.m mVar2, f.a aVar) {
        return m(this, mVar, mVar2, aVar);
    }

    public abstract Object n(long j10, String str, m.f fVar);

    public abstract Object o(long j10, String str, m.e eVar);

    public abstract Object p(long j10, String str, m.c cVar);

    public abstract Object q(long j10, String str, m.e eVar);
}
