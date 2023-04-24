package lg;

import bi.z0;
import com.topstep.fitcloud.pro.model.data.SportRecord;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.concurrent.atomic.AtomicInteger;
import l2.l2;
import l2.m2;

/* loaded from: classes2.dex */
public final class h0 extends l2<Integer, SportRecord> {

    /* renamed from: b */
    public final long f19770b;

    /* renamed from: c */
    public final AppDatabase f19771c;

    /* renamed from: d */
    public final AtomicInteger f19772d;

    /* renamed from: e */
    public final o2.b f19773e;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends gm.i implements fm.a<tl.l> {
        public a(Object obj) {
            super(0, obj, h0.class, "invalidate", "invalidate()V");
        }

        @Override // fm.a
        public final tl.l m() {
            ((h0) this.f15491b).f19073a.a();
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportHistoryPagingSource", f = "SportHistoryPagingSource.kt", l = {68}, m = "queryRecord")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public int f19774d;

        /* renamed from: e */
        public int f19775e;

        /* renamed from: f */
        public int f19776f;

        /* renamed from: g */
        public /* synthetic */ Object f19777g;

        /* renamed from: i */
        public int f19779i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            h0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f19777g = obj;
            this.f19779i |= Integer.MIN_VALUE;
            return h0.this.e(null, 0, this);
        }
    }

    public h0(long j10, AppDatabase appDatabase) {
        gm.l.f(appDatabase, "db");
        this.f19770b = j10;
        this.f19771c = appDatabase;
        this.f19772d = new AtomicInteger(-1);
        this.f19773e = new o2.b(new String[]{"SportRecord"}, new a(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(lg.h0 r4, l2.l2.a r5, int r6, xl.d r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof lg.g0
            if (r0 == 0) goto L16
            r0 = r7
            lg.g0 r0 = (lg.g0) r0
            int r1 = r0.f19764g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f19764g = r1
            goto L1b
        L16:
            lg.g0 r0 = new lg.g0
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f19762e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f19764g
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            lg.h0 r4 = r0.f19761d
            mf.a0.k(r7)
            goto L42
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            mf.a0.k(r7)
            r0.f19761d = r4
            r0.f19764g = r3
            java.lang.Object r7 = r4.e(r5, r6, r0)
            if (r7 != r1) goto L42
            goto L5e
        L42:
            r1 = r7
            l2.l2$b r1 = (l2.l2.b) r1
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r5 = r4.f19771c
            m2.m r5 = r5.f20265e
            r5.f()
            m2.n r5 = r5.f20230m
            r5.run()
            l2.k0 r4 = r4.f19073a
            boolean r4 = r4.f19041a
            if (r4 == 0) goto L5e
            l2.l2$b$b<java.lang.Object, java.lang.Object> r1 = o2.a.f22601a
            java.lang.String r4 = "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Invalid<kotlin.Int, com.topstep.fitcloud.pro.model.data.SportRecord>"
            gm.l.d(r1, r4)
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.h0.d(lg.h0, l2.l2$a, int, xl.d):java.lang.Object");
    }

    @Override // l2.l2
    public final Integer b(m2<Integer, SportRecord> m2Var) {
        l2.b.C0336b<Object, Object> c0336b = o2.a.f22601a;
        Integer num = m2Var.f19098b;
        if (num != null) {
            return Integer.valueOf(Math.max(0, num.intValue() - (m2Var.f19099c.f18711c / 2)));
        }
        return null;
    }

    @Override // l2.l2
    public final Object c(l2.a aVar, zl.c cVar) {
        return z0.s(cVar, p.b.p(this.f19771c), new f0(this, aVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ac A[LOOP:0: B:108:0x00a5->B:110:0x00ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(l2.l2.a<java.lang.Integer> r11, int r12, xl.d<? super l2.l2.b<java.lang.Integer, com.topstep.fitcloud.pro.model.data.SportRecord>> r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.h0.e(l2.l2$a, int, xl.d):java.lang.Object");
    }
}
