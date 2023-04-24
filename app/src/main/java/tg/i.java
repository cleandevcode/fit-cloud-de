package tg;

import android.content.Context;
import bi.r;
import gm.l;
import java.util.List;
import mf.a0;
import pm.e0;
import yg.b0;
import yg.u;

/* loaded from: classes2.dex */
public final class i implements tg.c {

    /* renamed from: a */
    public final yg.j f28146a;

    /* renamed from: b */
    public final Context f28147b;

    /* renamed from: c */
    public final vg.d f28148c;

    /* renamed from: d */
    public final e0 f28149d;

    /* renamed from: e */
    public final u f28150e;

    /* renamed from: f */
    public final hg.c f28151f;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendRepositoryImpl", f = "FriendRepository.kt", l = {138, 140}, m = "getFriendInfo")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public i f28152d;

        /* renamed from: e */
        public long f28153e;

        /* renamed from: f */
        public long f28154f;

        /* renamed from: g */
        public /* synthetic */ Object f28155g;

        /* renamed from: i */
        public int f28157i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            i.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28155g = obj;
            this.f28157i |= Integer.MIN_VALUE;
            return i.this.a(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendRepositoryImpl", f = "FriendRepository.kt", l = {99}, m = "requestFriends")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f28158d;

        /* renamed from: f */
        public int f28160f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            i.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28158d = obj;
            this.f28160f |= Integer.MIN_VALUE;
            return i.this.c(this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendRepositoryImpl", f = "FriendRepository.kt", l = {104, 110, 112, 113, 116, 117}, m = "requestMsgs")
    /* loaded from: classes2.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public Object f28161d;

        /* renamed from: e */
        public List f28162e;

        /* renamed from: f */
        public long f28163f;

        /* renamed from: g */
        public long f28164g;

        /* renamed from: h */
        public /* synthetic */ Object f28165h;

        /* renamed from: j */
        public int f28167j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            i.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f28165h = obj;
            this.f28167j |= Integer.MIN_VALUE;
            return i.this.e(this);
        }
    }

    public i(yg.b bVar, Context context, vg.d dVar, e0 e0Var, b0 b0Var, a0 a0Var) {
        l.f(e0Var, "applicationScope");
        this.f28146a = bVar;
        this.f28147b = context;
        this.f28148c = dVar;
        this.f28149d = e0Var;
        this.f28150e = b0Var;
        this.f28151f = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @Override // tg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r17, xl.d<? super com.topstep.fitcloud.pro.model.friend.Friend> r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            r1 = r19
            boolean r2 = r1 instanceof tg.i.a
            if (r2 == 0) goto L19
            r2 = r1
            tg.i$a r2 = (tg.i.a) r2
            int r3 = r2.f28157i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f28157i = r3
            goto L1e
        L19:
            tg.i$a r2 = new tg.i$a
            r2.<init>(r1)
        L1e:
            r9 = r2
            java.lang.Object r1 = r9.f28155g
            yl.a r10 = yl.a.COROUTINE_SUSPENDED
            int r2 = r9.f28157i
            r11 = 2
            r12 = 0
            r13 = 1
            if (r2 == 0) goto L47
            if (r2 == r13) goto L3b
            if (r2 != r11) goto L33
            mf.a0.k(r1)
            goto L96
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            long r2 = r9.f28154f
            long r4 = r9.f28153e
            tg.i r6 = r9.f28152d
            mf.a0.k(r1)
            r7 = r4
            r4 = r2
            goto L77
        L47:
            mf.a0.k(r1)
            yg.j r1 = r0.f28146a
            sm.f1 r1 = r1.h()
            java.lang.Object r1 = r1.getValue()
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto La6
            long r14 = r1.longValue()
            int r1 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r1 == 0) goto La0
            vg.d r1 = r0.f28148c
            r9.f28152d = r0
            r9.f28153e = r7
            r9.f28154f = r14
            r9.f28157i = r13
            r2 = r14
            r4 = r17
            r6 = r9
            java.lang.Object r1 = r1.i(r2, r4, r6)
            if (r1 != r10) goto L75
            return r10
        L75:
            r6 = r0
            r4 = r14
        L77:
            vg.k r1 = (vg.k) r1
            T r1 = r1.f29381c
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r13) goto L84
            goto L85
        L84:
            r13 = 0
        L85:
            if (r13 == 0) goto L9f
            vg.d r3 = r6.f28148c
            r9.f28152d = r12
            r9.f28157i = r11
            r6 = r7
            r8 = r9
            java.lang.Object r1 = r3.N(r4, r6, r8)
            if (r1 != r10) goto L96
            return r10
        L96:
            vg.l r1 = (vg.l) r1
            java.lang.Object r1 = r1.a()
            r12 = r1
            com.topstep.fitcloud.pro.model.friend.Friend r12 = (com.topstep.fitcloud.pro.model.friend.Friend) r12
        L9f:
            return r12
        La0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        La6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.i.a(long, xl.d):java.lang.Object");
    }

    @Override // tg.c
    public final Object b(long j10, xl.d<? super tl.l> dVar) {
        Long value = this.f28146a.h().getValue();
        if (value != null) {
            Object F = this.f28148c.F(value.longValue(), j10, dVar);
            return F == yl.a.COROUTINE_SUSPENDED ? F : tl.l.f28297a;
        }
        return tl.l.f28297a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
    @Override // tg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(xl.d<? super java.util.List<com.topstep.fitcloud.pro.model.friend.Friend>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof tg.i.b
            if (r0 == 0) goto L13
            r0 = r7
            tg.i$b r0 = (tg.i.b) r0
            int r1 = r0.f28160f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28160f = r1
            goto L18
        L13:
            tg.i$b r0 = new tg.i$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f28158d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f28160f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r7)
            goto L4f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            mf.a0.k(r7)
            yg.j r7 = r6.f28146a
            sm.f1 r7 = r7.h()
            java.lang.Object r7 = r7.getValue()
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L56
            long r4 = r7.longValue()
            vg.d r7 = r6.f28148c
            r0.f28160f = r3
            java.lang.Object r7 = r7.I(r4, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            vg.i r7 = (vg.i) r7
            java.util.List r7 = r7.a()
            return r7
        L56:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.i.c(xl.d):java.lang.Object");
    }

    @Override // tg.c
    public final Object d(long j10, xl.d<? super tl.l> dVar) {
        Long value = this.f28146a.h().getValue();
        if (value != null) {
            Object j02 = this.f28148c.j0(value.longValue(), j10, dVar);
            return j02 == yl.a.COROUTINE_SUSPENDED ? j02 : tl.l.f28297a;
        }
        return tl.l.f28297a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x00d1, code lost:
        r3 = ((com.topstep.fitcloud.pro.model.friend.FriendMsg) r7.get(0)).f9679e;
        r0 = r8.f28150e;
        r2.f28161d = r8;
        r2.f28162e = r7;
        r2.f28163f = r5;
        r2.f28164g = r3;
        r2.f28167j = 2;
        r0 = r0.h(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00ea, code lost:
        if (r0 != r9) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00ec, code lost:
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0127 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x016c  */
    /* JADX WARN: Type inference failed for: r5v15 */
    @Override // tg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(xl.d<? super java.util.List<com.topstep.fitcloud.pro.model.friend.FriendMsg>> r18) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.i.e(xl.d):java.lang.Object");
    }

    @Override // tg.c
    public final Object f(long j10, String str, xl.d<? super tl.l> dVar) {
        Long value = this.f28146a.h().getValue();
        if (value != null) {
            Object f10 = this.f28148c.f(value.longValue(), j10, str, dVar);
            return f10 == yl.a.COROUTINE_SUSPENDED ? f10 : tl.l.f28297a;
        }
        return tl.l.f28297a;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005f  */
    @Override // tg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable g(java.lang.String r22, xl.d r23) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.i.g(java.lang.String, xl.d):java.io.Serializable");
    }

    @Override // tg.c
    public final boolean h() {
        return this.f28151f.a(this.f28147b);
    }

    @Override // tg.c
    public final Object i(long j10, String str, String str2, xl.d<? super tl.l> dVar) {
        Long value = this.f28146a.h().getValue();
        if (value != null) {
            Object q10 = this.f28148c.q(value.longValue(), j10, str, str2, dVar);
            return q10 == yl.a.COROUTINE_SUSPENDED ? q10 : tl.l.f28297a;
        }
        return tl.l.f28297a;
    }

    @Override // tg.c
    public final Object j(long j10, xl.d<? super tl.l> dVar) {
        Long value = this.f28146a.h().getValue();
        if (value != null) {
            Object d02 = this.f28148c.d0(value.longValue(), j10, dVar);
            return d02 == yl.a.COROUTINE_SUSPENDED ? d02 : tl.l.f28297a;
        }
        return tl.l.f28297a;
    }

    public final tm.j k() {
        return r.O(this.f28146a.h(), new d(this, null));
    }
}
