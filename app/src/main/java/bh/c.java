package bh;

import android.util.SparseArray;
import gm.l;
import java.util.Calendar;
import java.util.Date;
import xl.d;
import zl.e;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public final Date f4226a;

    /* renamed from: b */
    public final Date f4227b;

    /* renamed from: c */
    public final int f4228c;

    /* renamed from: d */
    public final int f4229d;

    /* renamed from: e */
    public final int f4230e;

    /* renamed from: f */
    public final SparseArray<bh.a> f4231f;

    @e(c = "com.topstep.fitcloud.pro.shared.data.wh.menstruation.MenstruationSegment", f = "MenstruationSegment.kt", l = {79}, m = "calculate")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public c f4232d;

        /* renamed from: e */
        public bh.a f4233e;

        /* renamed from: f */
        public Calendar f4234f;

        /* renamed from: g */
        public /* synthetic */ Object f4235g;

        /* renamed from: i */
        public int f4237i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<? super a> dVar) {
            super(dVar);
            c.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f4235g = obj;
            this.f4237i |= Integer.MIN_VALUE;
            return c.this.a(null, null, null, 0L, this);
        }
    }

    @e(c = "com.topstep.fitcloud.pro.shared.data.wh.menstruation.MenstruationSegment", f = "MenstruationSegment.kt", l = {71}, m = "getCycleInfo")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public c f4238d;

        /* renamed from: e */
        public bh.a f4239e;

        /* renamed from: f */
        public int f4240f;

        /* renamed from: g */
        public /* synthetic */ Object f4241g;

        /* renamed from: i */
        public int f4243i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<? super b> dVar) {
            super(dVar);
            c.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f4241g = obj;
            this.f4243i |= Integer.MIN_VALUE;
            return c.this.b(null, null, 0L, 0, this);
        }
    }

    public c(Calendar calendar, Date date, Date date2, int i10, int i11) {
        l.f(calendar, "calendar");
        l.f(date, "segmentBegin");
        this.f4226a = date;
        this.f4227b = date2;
        this.f4228c = i10;
        this.f4229d = i11;
        this.f4230e = date2 != null ? (int) Math.ceil(hh.c.e(calendar, date, date2) / i11) : Integer.MAX_VALUE;
        this.f4231f = new SparseArray<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bh.a r9, java.util.Calendar r10, mg.c3 r11, long r12, xl.d<? super tl.l> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof bh.c.a
            if (r0 == 0) goto L13
            r0 = r14
            bh.c$a r0 = (bh.c.a) r0
            int r1 = r0.f4237i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4237i = r1
            goto L18
        L13:
            bh.c$a r0 = new bh.c$a
            r0.<init>(r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.f4235g
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r6.f4237i
            r7 = 1
            if (r1 == 0) goto L36
            if (r1 != r7) goto L2e
            java.util.Calendar r10 = r6.f4234f
            bh.a r9 = r6.f4233e
            bh.c r11 = r6.f4232d
            mf.a0.k(r14)
            goto L4f
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            mf.a0.k(r14)
            java.util.Date r4 = r9.f4185a
            java.util.Date r5 = r9.f4186b
            r6.f4232d = r8
            r6.f4233e = r9
            r6.f4234f = r10
            r6.f4237i = r7
            r1 = r11
            r2 = r12
            java.lang.Object r14 = r1.i(r2, r4, r5, r6)
            if (r14 != r0) goto L4e
            return r0
        L4e:
            r11 = r8
        L4f:
            java.util.Date r14 = (java.util.Date) r14
            r9.f4188d = r14
            if (r14 != 0) goto L58
            int r10 = r11.f4228c
            goto L5f
        L58:
            java.util.Date r11 = r9.f4185a
            int r10 = hh.c.e(r10, r11, r14)
            int r10 = r10 + r7
        L5f:
            r9.f4189e = r10
            int r11 = r9.f4187c
            if (r10 <= r11) goto L67
            r9.f4189e = r11
        L67:
            int r10 = r11 + (-14)
            int r10 = r10 + r7
            r9.f4192h = r10
            int r10 = r9.f4189e
            int r12 = r11 - r10
            r13 = 9
            if (r12 > r13) goto L7b
            r10 = 0
            r9.f4190f = r10
            r10 = 0
            r9.f4191g = r10
            goto L97
        L7b:
            r13 = 10
            r14 = 19
            if (r12 >= r14) goto L8c
            int r10 = r10 + r7
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            r9.f4190f = r11
            int r14 = r14 - r12
            int r13 = r13 - r14
            goto L95
        L8c:
            int r11 = r11 - r14
            int r11 = r11 + r7
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r11)
            r9.f4190f = r10
        L95:
            r9.f4191g = r13
        L97:
            tl.l r9 = tl.l.f28297a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.c.a(bh.a, java.util.Calendar, mg.c3, long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.Calendar r10, mg.c3 r11, long r12, int r14, xl.d<? super bh.a> r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof bh.c.b
            if (r0 == 0) goto L13
            r0 = r15
            bh.c$b r0 = (bh.c.b) r0
            int r1 = r0.f4243i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4243i = r1
            goto L18
        L13:
            bh.c$b r0 = new bh.c$b
            r0.<init>(r15)
        L18:
            r7 = r0
            java.lang.Object r15 = r7.f4241g
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r7.f4243i
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            int r14 = r7.f4240f
            bh.a r10 = r7.f4239e
            bh.c r11 = r7.f4238d
            mf.a0.k(r15)
            goto L83
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            mf.a0.k(r15)
            android.util.SparseArray<bh.a> r15 = r9.f4231f
            java.lang.Object r15 = r15.get(r14)
            bh.a r15 = (bh.a) r15
            if (r15 != 0) goto L89
            java.util.Date r15 = r9.f4226a
            int r1 = r9.f4229d
            int r1 = r1 * r14
            java.util.Date r15 = hh.c.b(r10, r15, r1)
            int r1 = r9.f4229d
            java.util.Date r1 = hh.c.b(r10, r15, r1)
            int r3 = r9.f4230e
            int r3 = r3 - r2
            if (r14 != r3) goto L66
            java.util.Date r3 = r9.f4227b
            if (r3 == 0) goto L66
            int r1 = hh.c.e(r10, r1, r3)
            int r3 = r9.f4229d
            int r3 = r3 - r1
            java.util.Date r1 = r9.f4227b
            goto L68
        L66:
            int r3 = r9.f4229d
        L68:
            bh.a r8 = new bh.a
            r8.<init>(r3, r15, r1)
            r7.f4238d = r9
            r7.f4239e = r8
            r7.f4240f = r14
            r7.f4243i = r2
            r1 = r9
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r7)
            if (r10 != r0) goto L81
            return r0
        L81:
            r11 = r9
            r10 = r8
        L83:
            android.util.SparseArray<bh.a> r11 = r11.f4231f
            r11.put(r14, r10)
            r15 = r10
        L89:
            java.lang.String r10 = "cycleInfo"
            gm.l.e(r15, r10)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.c.b(java.util.Calendar, mg.c3, long, int, xl.d):java.lang.Object");
    }
}
