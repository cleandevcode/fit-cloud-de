package lg;

import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import java.util.List;

/* loaded from: classes2.dex */
public final class j implements sm.f<List<? extends SimpleEcgRecord>> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f19808a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f19809a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowEcgRecords$lambda$41$$inlined$map$1$2", f = "DataRepository.kt", l = {223}, m = "emit")
        /* renamed from: lg.j$a$a */
        /* loaded from: classes2.dex */
        public static final class C0355a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f19810d;

            /* renamed from: e */
            public int f19811e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0355a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f19810d = obj;
                this.f19811e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f19809a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r8, xl.d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof lg.j.a.C0355a
                if (r0 == 0) goto L13
                r0 = r9
                lg.j$a$a r0 = (lg.j.a.C0355a) r0
                int r1 = r0.f19811e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19811e = r1
                goto L18
            L13:
                lg.j$a$a r0 = new lg.j$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f19810d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f19811e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r9)
                goto L6a
            L27:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2f:
                mf.a0.k(r9)
                sm.g r9 = r7.f19809a
                java.util.List r8 = (java.util.List) r8
                if (r8 == 0) goto L60
                java.util.ArrayList r2 = new java.util.ArrayList
                r4 = 10
                int r4 = ul.l.B(r8, r4)
                r2.<init>(r4)
                java.util.Iterator r8 = r8.iterator()
            L47:
                boolean r4 = r8.hasNext()
                if (r4 == 0) goto L61
                java.lang.Object r4 = r8.next()
                mg.h1$a r4 = (mg.h1.a) r4
                com.topstep.fitcloud.pro.model.data.SimpleEcgRecord r5 = new com.topstep.fitcloud.pro.model.data.SimpleEcgRecord
                java.util.UUID r6 = r4.f21044a
                java.util.Date r4 = r4.f21045b
                r5.<init>(r6, r4)
                r2.add(r5)
                goto L47
            L60:
                r2 = 0
            L61:
                r0.f19811e = r3
                java.lang.Object r8 = r9.n(r2, r0)
                if (r8 != r1) goto L6a
                return r1
            L6a:
                tl.l r8 = tl.l.f28297a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.j.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public j(sm.f fVar) {
        this.f19808a = fVar;
    }

    @Override // sm.f
    public final Object a(sm.g<? super List<? extends SimpleEcgRecord>> gVar, xl.d dVar) {
        Object a10 = this.f19808a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
