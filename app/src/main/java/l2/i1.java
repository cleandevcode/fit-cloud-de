package l2;

import java.util.concurrent.atomic.AtomicBoolean;
import l2.b1;
import l2.d1;
import l2.l2;
import l2.n0;
import l2.o1;
import l2.t1;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class i1<Key, Value> {

    /* renamed from: a */
    public final Key f18974a;

    /* renamed from: b */
    public final l2<Key, Value> f18975b;

    /* renamed from: c */
    public final a2 f18976c;

    /* renamed from: d */
    public final sm.f<tl.l> f18977d;

    /* renamed from: e */
    public final boolean f18978e;

    /* renamed from: f */
    public final s2<Key, Value> f18979f;

    /* renamed from: g */
    public final m2<Key, Value> f18980g;

    /* renamed from: h */
    public final fm.a<tl.l> f18981h;

    /* renamed from: i */
    public final h0 f18982i;

    /* renamed from: j */
    public final AtomicBoolean f18983j;

    /* renamed from: k */
    public final rm.a f18984k;

    /* renamed from: l */
    public final t1.a<Key, Value> f18985l;

    /* renamed from: m */
    public final pm.j1 f18986m;

    /* renamed from: n */
    public final sm.o f18987n;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18988a;

        static {
            int[] iArr = new int[r0.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            f18988a = iArr;
        }
    }

    @zl.e(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {608}, m = "currentPagingState")
    /* loaded from: classes.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public i1 f18989d;

        /* renamed from: e */
        public t1.a f18990e;

        /* renamed from: f */
        public ym.c f18991f;

        /* renamed from: g */
        public /* synthetic */ Object f18992g;

        /* renamed from: h */
        public final /* synthetic */ i1<Key, Value> f18993h;

        /* renamed from: i */
        public int f18994i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i1<Key, Value> i1Var, xl.d<? super b> dVar) {
            super(dVar);
            this.f18993h = i1Var;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f18992g = obj;
            this.f18994i |= Integer.MIN_VALUE;
            return this.f18993h.e(this);
        }
    }

    @zl.e(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {608, 280, DfuBaseService.NOTIFICATION_ID, 619, 630, 317, 641, 652, 341}, m = "doInitialLoad")
    /* loaded from: classes.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public i1 f18995d;

        /* renamed from: e */
        public Object f18996e;

        /* renamed from: f */
        public Object f18997f;

        /* renamed from: g */
        public ym.c f18998g;

        /* renamed from: h */
        public /* synthetic */ Object f18999h;

        /* renamed from: i */
        public final /* synthetic */ i1<Key, Value> f19000i;

        /* renamed from: j */
        public int f19001j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i1<Key, Value> i1Var, xl.d<? super c> dVar) {
            super(dVar);
            this.f19000i = i1Var;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f18999h = obj;
            this.f19001j |= Integer.MIN_VALUE;
            return this.f19000i.f(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i1(Object obj, l2 l2Var, a2 a2Var, sm.f fVar, boolean z10, r2 r2Var, m2 m2Var, d1.b.a aVar) {
        gm.l.f(l2Var, "pagingSource");
        gm.l.f(a2Var, "config");
        gm.l.f(fVar, "retryFlow");
        this.f18974a = obj;
        this.f18975b = l2Var;
        this.f18976c = a2Var;
        this.f18977d = fVar;
        this.f18978e = z10;
        this.f18979f = r2Var;
        this.f18980g = m2Var;
        this.f18981h = aVar;
        if (!(a2Var.f18713e == Integer.MIN_VALUE || l2Var.a())) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
        }
        this.f18982i = new h0();
        this.f18983j = new AtomicBoolean(false);
        this.f18984k = jh.v.a(-2, null, 6);
        this.f18985l = new t1.a<>(a2Var);
        pm.j1 b10 = bi.m0.b();
        this.f18986m = b10;
        this.f18987n = new sm.o(new p1(this, null), y2.a(new r(b10, new o1(this, null), null)));
    }

    public static final Object a(i1 i1Var, sm.o oVar, r0 r0Var, xl.d dVar) {
        i1Var.getClass();
        sm.f a10 = f0.a(oVar, new k1(r0Var, i1Var, null));
        l1 l1Var = new l1(r0Var, null);
        gm.l.f(a10, "<this>");
        Object a11 = bi.r.g(new sm.u0(new d0(a10, l1Var, null)), -1).a(new j1(i1Var, r0Var), dVar);
        if (a11 != yl.a.COROUTINE_SUSPENDED) {
            return tl.l.f28297a;
        }
        return a11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x02c5 A[Catch: all -> 0x05ad, TRY_LEAVE, TryCatch #6 {all -> 0x05ad, blocks: (B:328:0x02b0, B:331:0x02c5), top: B:484:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x047e A[Catch: all -> 0x05a2, TRY_LEAVE, TryCatch #0 {all -> 0x05a2, blocks: (B:403:0x046d, B:412:0x04bf, B:414:0x04d6, B:416:0x04e0, B:418:0x04e6, B:420:0x04eb, B:419:0x04e9, B:421:0x04ee, B:406:0x047e), top: B:473:0x046d }] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x04d6 A[Catch: all -> 0x05a2, TryCatch #0 {all -> 0x05a2, blocks: (B:403:0x046d, B:412:0x04bf, B:414:0x04d6, B:416:0x04e0, B:418:0x04e6, B:420:0x04eb, B:419:0x04e9, B:421:0x04ee, B:406:0x047e), top: B:473:0x046d }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x04e6 A[Catch: all -> 0x05a2, TryCatch #0 {all -> 0x05a2, blocks: (B:403:0x046d, B:412:0x04bf, B:414:0x04d6, B:416:0x04e0, B:418:0x04e6, B:420:0x04eb, B:419:0x04e9, B:421:0x04ee, B:406:0x047e), top: B:473:0x046d }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x04e9 A[Catch: all -> 0x05a2, TryCatch #0 {all -> 0x05a2, blocks: (B:403:0x046d, B:412:0x04bf, B:414:0x04d6, B:416:0x04e0, B:418:0x04e6, B:420:0x04eb, B:419:0x04e9, B:421:0x04ee, B:406:0x047e), top: B:473:0x046d }] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x05b4 A[Catch: all -> 0x05ba, TRY_ENTER, TryCatch #2 {all -> 0x05ba, blocks: (B:298:0x01ee, B:323:0x0280, B:305:0x01fe, B:307:0x0209, B:308:0x0217, B:310:0x021f, B:314:0x0239, B:316:0x024a, B:319:0x0266, B:466:0x05b4, B:467:0x05b9), top: B:477:0x01ee }] */
    /* JADX WARN: Removed duplicated region for block: B:498:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:500:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:501:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v9, types: [ym.b] */
    /* JADX WARN: Type inference failed for: r13v30, types: [l2.i1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l2.r0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v30, types: [ym.b] */
    /* JADX WARN: Type inference failed for: r1v39, types: [ym.b] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [T] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r3v13, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:439:0x054a -> B:451:0x0594). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:441:0x054e -> B:451:0x0594). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:443:0x0573 -> B:482:0x0576). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(l2.i1 r17, l2.r0 r18, l2.g0 r19, xl.d r20) {
        /*
            Method dump skipped, instructions count: 1510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.i1.b(l2.i1, l2.r0, l2.g0, xl.d):java.lang.Object");
    }

    public static final Object c(i1 i1Var, r0 r0Var, j3 j3Var, o1.c.b.a aVar) {
        boolean z10;
        i1Var.getClass();
        boolean z11 = true;
        if (a.f18988a[r0Var.ordinal()] == 1) {
            Object f10 = i1Var.f(aVar);
            if (f10 == yl.a.COROUTINE_SUSPENDED) {
                return f10;
            }
        } else {
            if (j3Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                h0 h0Var = i1Var.f18982i;
                h0Var.getClass();
                gm.l.f(j3Var, "viewportHint");
                if (r0Var != r0.PREPEND && r0Var != r0.APPEND) {
                    z11 = false;
                }
                if (z11) {
                    h0Var.f18915a.a(null, new i0(r0Var, j3Var));
                } else {
                    throw new IllegalArgumentException(gm.l.k(r0Var, "invalid load type for reset: ").toString());
                }
            } else {
                throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
            }
        }
        return tl.l.f28297a;
    }

    public static final void d(i1 i1Var, pm.e0 e0Var) {
        if (i1Var.f18976c.f18713e != Integer.MIN_VALUE) {
            for (r0 r0Var : h7.a.q(r0.APPEND, r0.PREPEND)) {
                bi.z0.g(e0Var, null, 0, new q1(r0Var, i1Var, null), 3);
            }
        }
        bi.z0.g(e0Var, null, 0, new r1(i1Var, null), 3);
        bi.z0.g(e0Var, null, 0, new s1(i1Var, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(xl.d<? super l2.m2<Key, Value>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof l2.i1.b
            if (r0 == 0) goto L13
            r0 = r6
            l2.i1$b r0 = (l2.i1.b) r0
            int r1 = r0.f18994i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18994i = r1
            goto L18
        L13:
            l2.i1$b r0 = new l2.i1$b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f18992g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f18994i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            ym.c r1 = r0.f18991f
            l2.t1$a r2 = r0.f18990e
            l2.i1 r0 = r0.f18989d
            mf.a0.k(r6)
            goto L4e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            mf.a0.k(r6)
            l2.t1$a<Key, Value> r2 = r5.f18985l
            ym.c r6 = r2.f19265a
            r0.f18989d = r5
            r0.f18990e = r2
            r0.f18991f = r6
            r0.f18994i = r4
            java.lang.Object r0 = r6.b(r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            l2.t1<Key, Value> r6 = r2.f19266b     // Catch: java.lang.Throwable -> L5e
            l2.h0 r0 = r0.f18982i     // Catch: java.lang.Throwable -> L5e
            l2.h0$b r0 = r0.f18915a     // Catch: java.lang.Throwable -> L5e
            l2.j3$a r0 = r0.f18920c     // Catch: java.lang.Throwable -> L5e
            l2.m2 r6 = r6.a(r0)     // Catch: java.lang.Throwable -> L5e
            r1.a(r3)
            return r6
        L5e:
            r6 = move-exception
            r1.a(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.i1.e(xl.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0131 A[Catch: all -> 0x01e0, TryCatch #0 {all -> 0x01e0, blocks: (B:174:0x0119, B:176:0x0131, B:177:0x0138, B:179:0x013f), top: B:238:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x013f A[Catch: all -> 0x01e0, TRY_LEAVE, TryCatch #0 {all -> 0x01e0, blocks: (B:174:0x0119, B:176:0x0131, B:177:0x0138, B:179:0x013f), top: B:238:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01e5  */
    /* JADX WARN: Type inference failed for: r0v0, types: [ym.b, l2.r0] */
    /* JADX WARN: Type inference failed for: r13v21, types: [l2.w0] */
    /* JADX WARN: Type inference failed for: r2v10, types: [ym.b] */
    /* JADX WARN: Type inference failed for: r2v12, types: [ym.b] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ym.b] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v8, types: [ym.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(xl.d<? super tl.l> r13) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.i1.f(xl.d):java.lang.Object");
    }

    public final l2.a<Key> g(r0 r0Var, Key key) {
        int i10;
        if (r0Var == r0.REFRESH) {
            i10 = this.f18976c.f18711c;
        } else {
            this.f18976c.getClass();
            i10 = 20;
        }
        boolean z10 = this.f18976c.f18710b;
        gm.l.f(r0Var, "loadType");
        int ordinal = r0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (key != null) {
                    return new l2.a.b(i10, key, z10);
                }
                throw new IllegalArgumentException("key cannot be null for prepend".toString());
            } else if (ordinal == 2) {
                if (key != null) {
                    return new l2.a.C0335a(i10, key, z10);
                }
                throw new IllegalArgumentException("key cannot be null for append".toString());
            } else {
                throw new qa.p();
            }
        }
        return new l2.a.c(i10, key, z10);
    }

    public final Key h(t1<Key, Value> t1Var, r0 r0Var, int i10, int i11) {
        int i12;
        t1Var.getClass();
        int ordinal = r0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i12 = t1Var.f19260h;
                } else {
                    throw new qa.p();
                }
            } else {
                i12 = t1Var.f19259g;
            }
            if (i10 != i12 || (t1Var.f19264l.a(r0Var) instanceof n0.a) || i11 >= this.f18976c.f18709a) {
                return null;
            }
            if (r0Var == r0.PREPEND) {
                return ((l2.b.c) ul.q.H(t1Var.f19255c)).f19079b;
            }
            return ((l2.b.c) ul.q.N(t1Var.f19255c)).f19080c;
        }
        throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
    }

    public final Object i(t1 t1Var, r0 r0Var, zl.c cVar) {
        n0 a10 = t1Var.f19264l.a(r0Var);
        n0.b bVar = n0.b.f19107b;
        if (!gm.l.a(a10, bVar)) {
            t1Var.f19264l.c(r0Var, bVar);
            Object d10 = this.f18984k.d(new b1.c(t1Var.f19264l.d(), null), cVar);
            if (d10 == yl.a.COROUTINE_SUSPENDED) {
                return d10;
            }
            return tl.l.f28297a;
        }
        return tl.l.f28297a;
    }
}
