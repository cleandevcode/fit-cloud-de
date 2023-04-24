package tm;

import java.util.concurrent.atomic.AtomicInteger;
import mf.a0;
import pm.e0;

@zl.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {57, 79, 82}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public rm.g f28338e;

    /* renamed from: f */
    public byte[] f28339f;

    /* renamed from: g */
    public int f28340g;

    /* renamed from: h */
    public int f28341h;

    /* renamed from: i */
    public int f28342i;

    /* renamed from: j */
    public /* synthetic */ Object f28343j;

    /* renamed from: k */
    public final /* synthetic */ sm.f<Object>[] f28344k;

    /* renamed from: l */
    public final /* synthetic */ fm.a<Object[]> f28345l;

    /* renamed from: m */
    public final /* synthetic */ fm.q<sm.g<Object>, Object[], xl.d<? super tl.l>, Object> f28346m;

    /* renamed from: n */
    public final /* synthetic */ sm.g<Object> f28347n;

    @zl.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f28348e;

        /* renamed from: f */
        public final /* synthetic */ sm.f<Object>[] f28349f;

        /* renamed from: g */
        public final /* synthetic */ int f28350g;

        /* renamed from: h */
        public final /* synthetic */ AtomicInteger f28351h;

        /* renamed from: i */
        public final /* synthetic */ rm.g<ul.v<Object>> f28352i;

        /* renamed from: tm.l$a$a */
        /* loaded from: classes2.dex */
        public static final class C0507a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ rm.g<ul.v<Object>> f28353a;

            /* renamed from: b */
            public final /* synthetic */ int f28354b;

            @zl.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {35, 36}, m = "emit")
            /* renamed from: tm.l$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C0508a extends zl.c {

                /* renamed from: d */
                public /* synthetic */ Object f28355d;

                /* renamed from: e */
                public final /* synthetic */ C0507a<T> f28356e;

                /* renamed from: f */
                public int f28357f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0508a(C0507a<? super T> c0507a, xl.d<? super C0508a> dVar) {
                    super(dVar);
                    this.f28356e = c0507a;
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    this.f28355d = obj;
                    this.f28357f |= Integer.MIN_VALUE;
                    return this.f28356e.n(null, this);
                }
            }

            public C0507a(rm.g<ul.v<Object>> gVar, int i10) {
                this.f28353a = gVar;
                this.f28354b = i10;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0036  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0053 A[RETURN] */
            @Override // sm.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object n(T r7, xl.d<? super tl.l> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof tm.l.a.C0507a.C0508a
                    if (r0 == 0) goto L13
                    r0 = r8
                    tm.l$a$a$a r0 = (tm.l.a.C0507a.C0508a) r0
                    int r1 = r0.f28357f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f28357f = r1
                    goto L18
                L13:
                    tm.l$a$a$a r0 = new tm.l$a$a$a
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.f28355d
                    yl.a r1 = yl.a.COROUTINE_SUSPENDED
                    int r2 = r0.f28357f
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L36
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    mf.a0.k(r8)
                    goto L54
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L32:
                    mf.a0.k(r8)
                    goto L4b
                L36:
                    mf.a0.k(r8)
                    rm.g<ul.v<java.lang.Object>> r8 = r6.f28353a
                    ul.v r2 = new ul.v
                    int r5 = r6.f28354b
                    r2.<init>(r5, r7)
                    r0.f28357f = r4
                    java.lang.Object r7 = r8.d(r2, r0)
                    if (r7 != r1) goto L4b
                    return r1
                L4b:
                    r0.f28357f = r3
                    java.lang.Object r7 = ih.v.B(r0)
                    if (r7 != r1) goto L54
                    return r1
                L54:
                    tl.l r7 = tl.l.f28297a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: tm.l.a.C0507a.n(java.lang.Object, xl.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sm.f<Object>[] fVarArr, int i10, AtomicInteger atomicInteger, rm.g<ul.v<Object>> gVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f28349f = fVarArr;
            this.f28350g = i10;
            this.f28351h = atomicInteger;
            this.f28352i = gVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f28349f, this.f28350g, this.f28351h, this.f28352i, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            AtomicInteger atomicInteger;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f28348e;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    sm.f<Object>[] fVarArr = this.f28349f;
                    int i11 = this.f28350g;
                    sm.f<Object> fVar = fVarArr[i11];
                    C0507a c0507a = new C0507a(this.f28352i, i11);
                    this.f28348e = 1;
                    if (fVar.a(c0507a, this) == aVar) {
                        return aVar;
                    }
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    this.f28352i.o(null);
                }
                return tl.l.f28297a;
            } finally {
                if (this.f28351h.decrementAndGet() == 0) {
                    this.f28352i.o(null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xl.d dVar, fm.a aVar, fm.q qVar, sm.g gVar, sm.f[] fVarArr) {
        super(2, dVar);
        this.f28344k = fVarArr;
        this.f28345l = aVar;
        this.f28346m = qVar;
        this.f28347n = gVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((l) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        l lVar = new l(dVar, this.f28345l, this.f28346m, this.f28347n, this.f28344k);
        lVar.f28343j = obj;
        return lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ca A[LOOP:0: B:83:0x00ca->B:89:0x00e9, LOOP_START, PHI: r6 r9 
      PHI: (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:80:0x00c5, B:89:0x00e9] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v4 ul.v) = (r9v3 ul.v), (r9v19 ul.v) binds: [B:80:0x00c5, B:89:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0141 -> B:61:0x0024). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x00a2 -> B:75:0x00a4). Please submit an issue!!! */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.l.t(java.lang.Object):java.lang.Object");
    }
}
