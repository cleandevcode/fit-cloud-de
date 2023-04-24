package l2;

/* loaded from: classes.dex */
public final class b0<T> {

    /* renamed from: a */
    public final c0<T> f18719a = new c0<>();

    /* renamed from: b */
    public final ym.c f18720b = rm.b.a();

    /* renamed from: c */
    public int f18721c = -1;

    @zl.e(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {262}, m = "record")
    /* loaded from: classes.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public b0 f18722d;

        /* renamed from: e */
        public ul.v f18723e;

        /* renamed from: f */
        public ym.c f18724f;

        /* renamed from: g */
        public /* synthetic */ Object f18725g;

        /* renamed from: h */
        public final /* synthetic */ b0<T> f18726h;

        /* renamed from: i */
        public int f18727i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0<T> b0Var, xl.d<? super a> dVar) {
            super(dVar);
            this.f18726h = b0Var;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f18725g = obj;
            this.f18727i |= Integer.MIN_VALUE;
            return this.f18726h.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006c A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:55:0x0048, B:56:0x0066, B:58:0x006c, B:60:0x0074, B:61:0x0081, B:62:0x0084), top: B:68:0x0048 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(xl.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof l2.a0
            if (r0 == 0) goto L13
            r0 = r9
            l2.a0 r0 = (l2.a0) r0
            int r1 = r0.f18700h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18700h = r1
            goto L18
        L13:
            l2.a0 r0 = new l2.a0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f18698f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f18700h
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ym.c r1 = r0.f18697e
            l2.b0 r0 = r0.f18696d
            mf.a0.k(r9)
            goto L47
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            mf.a0.k(r9)
            ym.c r9 = r8.f18720b
            r0.f18696d = r8
            r0.f18697e = r9
            r0.f18700h = r3
            java.lang.Object r0 = r9.b(r0)
            if (r0 != r1) goto L45
            return r1
        L45:
            r0 = r8
            r1 = r9
        L47:
            r9 = 0
            l2.c0<T> r2 = r0.f18719a     // Catch: java.lang.Throwable -> L89
            java.util.List r2 = r2.b()     // Catch: java.lang.Throwable -> L89
            int r0 = r0.f18721c     // Catch: java.lang.Throwable -> L89
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L89
            int r0 = r0 - r4
            int r0 = r0 + r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L89
            r4 = 10
            int r4 = ul.l.B(r2, r4)     // Catch: java.lang.Throwable -> L89
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L89
            r4 = 0
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L89
        L66:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L89
            if (r5 == 0) goto L85
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L89
            int r6 = r4 + 1
            if (r4 < 0) goto L81
            l2.b1 r5 = (l2.b1) r5     // Catch: java.lang.Throwable -> L89
            ul.v r7 = new ul.v     // Catch: java.lang.Throwable -> L89
            int r4 = r4 + r0
            r7.<init>(r4, r5)     // Catch: java.lang.Throwable -> L89
            r3.add(r7)     // Catch: java.lang.Throwable -> L89
            r4 = r6
            goto L66
        L81:
            h7.a.z()     // Catch: java.lang.Throwable -> L89
            throw r9     // Catch: java.lang.Throwable -> L89
        L85:
            r1.a(r9)
            return r3
        L89:
            r0 = move-exception
            r1.a(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.b0.a(xl.d):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ul.v<? extends l2.b1<T>> r6, xl.d<? super tl.l> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof l2.b0.a
            if (r0 == 0) goto L13
            r0 = r7
            l2.b0$a r0 = (l2.b0.a) r0
            int r1 = r0.f18727i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18727i = r1
            goto L18
        L13:
            l2.b0$a r0 = new l2.b0$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f18725g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f18727i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            ym.c r6 = r0.f18724f
            ul.v r1 = r0.f18723e
            l2.b0 r0 = r0.f18722d
            mf.a0.k(r7)
            r7 = r6
            r6 = r1
            goto L4d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            mf.a0.k(r7)
            ym.c r7 = r5.f18720b
            r0.f18722d = r5
            r0.f18723e = r6
            r0.f18724f = r7
            r0.f18727i = r4
            java.lang.Object r0 = r7.b(r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            int r1 = r6.f28882a     // Catch: java.lang.Throwable -> L62
            r0.f18721c = r1     // Catch: java.lang.Throwable -> L62
            l2.c0<T> r0 = r0.f18719a     // Catch: java.lang.Throwable -> L62
            T r6 = r6.f28883b     // Catch: java.lang.Throwable -> L62
            l2.b1 r6 = (l2.b1) r6     // Catch: java.lang.Throwable -> L62
            r0.a(r6)     // Catch: java.lang.Throwable -> L62
            tl.l r6 = tl.l.f28297a     // Catch: java.lang.Throwable -> L62
            r7.a(r3)
            tl.l r6 = tl.l.f28297a
            return r6
        L62:
            r6 = move-exception
            r7.a(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.b0.b(ul.v, xl.d):java.lang.Object");
    }
}
