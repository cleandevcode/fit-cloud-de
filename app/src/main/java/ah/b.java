package ah;

import bi.r;
import fm.p;
import fm.q;
import mf.a0;
import pm.e0;
import sm.g;
import tl.l;
import tm.j;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.wh.WomenHealthRepositoryImpl$1", f = "WomenHealthRepository.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f465e;

    /* renamed from: f */
    public final /* synthetic */ e f466f;

    /* loaded from: classes2.dex */
    public static final class a<T> implements g {

        /* renamed from: a */
        public final /* synthetic */ e f467a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.wh.WomenHealthRepositoryImpl$1$2", f = "WomenHealthRepository.kt", l = {91}, m = "emit")
        /* renamed from: ah.b$a$a */
        /* loaded from: classes2.dex */
        public static final class C0004a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f468d;

            /* renamed from: e */
            public final /* synthetic */ a<T> f469e;

            /* renamed from: f */
            public int f470f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0004a(a<? super T> aVar, xl.d<? super C0004a> dVar) {
                super(dVar);
                this.f469e = aVar;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f468d = obj;
                this.f470f |= Integer.MIN_VALUE;
                return this.f469e.n(null, this);
            }
        }

        public a(e eVar) {
            this.f467a = eVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|(2:22|(1:24))|12|13)|11|12|13))|27|6|7|(0)(0)|11|12|13) */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0027, code lost:
            r5 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0046, code lost:
            p000do.a.f13275a.q(r5);
         */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0031  */
        @Override // sm.g
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(uf.c r5, xl.d<? super tl.l> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof ah.b.a.C0004a
                if (r0 == 0) goto L13
                r0 = r6
                ah.b$a$a r0 = (ah.b.a.C0004a) r0
                int r1 = r0.f470f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f470f = r1
                goto L18
            L13:
                ah.b$a$a r0 = new ah.b$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f468d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f470f
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                mf.a0.k(r6)     // Catch: java.lang.Exception -> L27
                goto L4b
            L27:
                r5 = move-exception
                goto L46
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                mf.a0.k(r6)
                if (r5 == 0) goto L4b
                int r5 = r5.f28711b
                if (r5 != 0) goto L4b
                ah.e r5 = r4.f467a     // Catch: java.lang.Exception -> L27
                r6 = 0
                r0.f470f = r3     // Catch: java.lang.Exception -> L27
                java.lang.Object r5 = r5.d(r6, r0)     // Catch: java.lang.Exception -> L27
                if (r5 != r1) goto L4b
                return r1
            L46:
                do.a$b r6 = p000do.a.f13275a
                r6.q(r5)
            L4b:
                tl.l r5 = tl.l.f28297a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ah.b.a.n(uf.c, xl.d):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.wh.WomenHealthRepositoryImpl$1$invokeSuspend$$inlined$flatMapLatest$1", f = "WomenHealthRepository.kt", l = {190}, m = "invokeSuspend")
    /* renamed from: ah.b$b */
    /* loaded from: classes2.dex */
    public static final class C0005b extends i implements q<g<? super uf.c>, gg.b, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f471e;

        /* renamed from: f */
        public /* synthetic */ g f472f;

        /* renamed from: g */
        public /* synthetic */ Object f473g;

        /* renamed from: h */
        public final /* synthetic */ e f474h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0005b(e eVar, xl.d dVar) {
            super(3, dVar);
            this.f474h = eVar;
        }

        @Override // fm.q
        public final Object j(g<? super uf.c> gVar, gg.b bVar, xl.d<? super l> dVar) {
            C0005b c0005b = new C0005b(this.f474h, dVar);
            c0005b.f472f = gVar;
            c0005b.f473g = bVar;
            return c0005b.t(l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            sm.f a10;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f471e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                g gVar = this.f472f;
                if (((gg.b) this.f473g) == null) {
                    a10 = new sm.i(null);
                } else {
                    a10 = this.f474h.f488e.a();
                }
                this.f471e = 1;
                if (r.v(this, a10, gVar) == aVar) {
                    return aVar;
                }
            }
            return l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, xl.d<? super b> dVar) {
        super(2, dVar);
        this.f466f = eVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((b) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new b(this.f466f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f465e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            e eVar = this.f466f;
            j O = r.O(eVar.f489f, new C0005b(eVar, null));
            a aVar2 = new a(this.f466f);
            this.f465e = 1;
            if (O.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return l.f28297a;
    }
}
