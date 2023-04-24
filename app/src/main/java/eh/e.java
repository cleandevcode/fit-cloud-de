package eh;

import l2.o0;

/* loaded from: classes2.dex */
public final class e extends dh.b<a, tl.l> {

    /* renamed from: b */
    public final jg.a f13640b;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final String f13641a;

        /* renamed from: b */
        public final boolean f13642b;

        public a(String str, boolean z10) {
            gm.l.f(str, "username");
            this.f13641a = str;
            this.f13642b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return gm.l.a(this.f13641a, aVar.f13641a) && this.f13642b == aVar.f13642b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode = this.f13641a.hashCode() * 31;
            boolean z10 = this.f13642b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Params(username=");
            a10.append(this.f13641a);
            a10.append(", assumeExist=");
            return o0.a(a10, this.f13642b, ')');
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.domain.auth.RequestAuthCodeUseCase", f = "RequestAuthCodeUseCase.kt", l = {19}, m = "execute")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f13643d;

        /* renamed from: f */
        public int f13645f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            e.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f13643d = obj;
            this.f13645f |= Integer.MIN_VALUE;
            return e.this.a(null, this);
        }
    }

    public e(wm.b bVar, jg.b bVar2) {
        super(bVar);
        this.f13640b = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
    @Override // dh.b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(eh.e.a r5, xl.d<? super tl.l> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof eh.e.b
            if (r0 == 0) goto L13
            r0 = r6
            eh.e$b r0 = (eh.e.b) r0
            int r1 = r0.f13645f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13645f = r1
            goto L18
        L13:
            eh.e$b r0 = new eh.e$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f13643d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f13645f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            mf.a0.k(r6)
            java.lang.String r6 = r5.f13641a
            eh.l r6 = s.h1.s(r6)
            jg.a r2 = r4.f13640b
            java.lang.String r6 = r6.f13681a
            boolean r5 = r5.f13642b
            r0.f13645f = r3
            java.lang.Object r5 = r2.c(r6, r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            tl.l r5 = tl.l.f28297a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eh.e.a(eh.e$a, xl.d):java.lang.Object");
    }
}
