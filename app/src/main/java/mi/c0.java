package mi;

import com.topstep.fitcloud.pro.ui.sport.SportHistoryViewModel;
import l2.b2;

/* loaded from: classes2.dex */
public final class c0 implements sm.f<b2<z>> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f21805a;

    /* renamed from: b */
    public final /* synthetic */ SportHistoryViewModel f21806b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f21807a;

        /* renamed from: b */
        public final /* synthetic */ SportHistoryViewModel f21808b;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportHistoryViewModel$special$$inlined$map$1$2", f = "SportHistoryFragment.kt", l = {223}, m = "emit")
        /* renamed from: mi.c0$a$a */
        /* loaded from: classes2.dex */
        public static final class C0385a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f21809d;

            /* renamed from: e */
            public int f21810e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0385a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f21809d = obj;
                this.f21810e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, SportHistoryViewModel sportHistoryViewModel) {
            this.f21807a = gVar;
            this.f21808b = sportHistoryViewModel;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r10, xl.d r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof mi.c0.a.C0385a
                if (r0 == 0) goto L13
                r0 = r11
                mi.c0$a$a r0 = (mi.c0.a.C0385a) r0
                int r1 = r0.f21810e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f21810e = r1
                goto L18
            L13:
                mi.c0$a$a r0 = new mi.c0$a$a
                r0.<init>(r11)
            L18:
                java.lang.Object r11 = r0.f21809d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f21810e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r11)
                goto L7a
            L27:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L2f:
                mf.a0.k(r11)
                sm.g r11 = r9.f21807a
                l2.b2 r10 = (l2.b2) r10
                mi.a0 r2 = new mi.a0
                r4 = 0
                r2.<init>(r4)
                java.lang.String r5 = "<this>"
                gm.l.f(r10, r5)
                l2.b2 r6 = new l2.b2
                sm.f<l2.b1<T>> r7 = r10.f18755a
                l2.k2 r8 = new l2.k2
                r8.<init>(r2, r7)
                l2.h3 r10 = r10.f18756b
                r6.<init>(r8, r10)
                mi.b0 r10 = new mi.b0
                com.topstep.fitcloud.pro.ui.sport.SportHistoryViewModel r2 = r9.f21808b
                r10.<init>(r2, r4)
                l2.b2 r2 = new l2.b2
                sm.f<l2.b1<T>> r7 = r6.f18755a
                gm.l.f(r7, r5)
                l2.u2 r5 = new l2.u2
                l2.w2 r8 = new l2.w2
                r8.<init>(r10, r4)
                r5.<init>(r8)
                l2.v2 r10 = new l2.v2
                r10.<init>(r7, r5)
                l2.h3 r4 = r6.f18756b
                r2.<init>(r10, r4)
                r0.f21810e = r3
                java.lang.Object r10 = r11.n(r2, r0)
                if (r10 != r1) goto L7a
                return r1
            L7a:
                tl.l r10 = tl.l.f28297a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: mi.c0.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public c0(sm.f fVar, SportHistoryViewModel sportHistoryViewModel) {
        this.f21805a = fVar;
        this.f21806b = sportHistoryViewModel;
    }

    @Override // sm.f
    public final Object a(sm.g<? super b2<z>> gVar, xl.d dVar) {
        Object a10 = this.f21805a.a(new a(gVar, this.f21806b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
