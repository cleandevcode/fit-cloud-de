package eh;

import a0.a2;
import i2.t;

/* loaded from: classes2.dex */
public final class f extends dh.b<a, tl.l> {

    /* renamed from: b */
    public final jg.a f13646b;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final String f13647a;

        /* renamed from: b */
        public final String f13648b;

        /* renamed from: c */
        public final String f13649c;

        public a(String str, String str2, String str3) {
            gm.l.f(str, "username");
            gm.l.f(str2, "password");
            gm.l.f(str3, "authCode");
            this.f13647a = str;
            this.f13648b = str2;
            this.f13649c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return gm.l.a(this.f13647a, aVar.f13647a) && gm.l.a(this.f13648b, aVar.f13648b) && gm.l.a(this.f13649c, aVar.f13649c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13649c.hashCode() + t.a(this.f13648b, this.f13647a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Params(username=");
            a10.append(this.f13647a);
            a10.append(", password=");
            a10.append(this.f13648b);
            a10.append(", authCode=");
            return a2.a(a10, this.f13649c, ')');
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.domain.auth.ResetPwdUseCase", f = "ResetPwdUseCase.kt", l = {19}, m = "execute")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f13650d;

        /* renamed from: f */
        public int f13652f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            f.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f13650d = obj;
            this.f13652f |= Integer.MIN_VALUE;
            return f.this.a(null, this);
        }
    }

    public f(wm.b bVar, jg.b bVar2) {
        super(bVar);
        this.f13646b = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
    @Override // dh.b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(eh.f.a r6, xl.d<? super tl.l> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof eh.f.b
            if (r0 == 0) goto L13
            r0 = r7
            eh.f$b r0 = (eh.f.b) r0
            int r1 = r0.f13652f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13652f = r1
            goto L18
        L13:
            eh.f$b r0 = new eh.f$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13650d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f13652f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r7)
            goto L49
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            mf.a0.k(r7)
            java.lang.String r7 = r6.f13647a
            eh.l r7 = s.h1.s(r7)
            jg.a r2 = r5.f13646b
            java.lang.String r7 = r7.f13681a
            java.lang.String r4 = r6.f13648b
            java.lang.String r6 = r6.f13649c
            r0.f13652f = r3
            java.lang.Object r6 = r2.b(r7, r4, r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            tl.l r6 = tl.l.f28297a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eh.f.a(eh.f$a, xl.d):java.lang.Object");
    }
}
