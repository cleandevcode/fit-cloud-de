package eh;

import a0.a2;
import com.topstep.fitcloud.pro.model.auth.FillUserInfo;

/* loaded from: classes2.dex */
public final class i extends dh.b<a, FillUserInfo> {

    /* renamed from: b */
    public final jg.a f13659b;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final String f13660a;

        /* renamed from: b */
        public final String f13661b;

        public a(String str, String str2) {
            gm.l.f(str, "username");
            gm.l.f(str2, "password");
            this.f13660a = str;
            this.f13661b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return gm.l.a(this.f13660a, aVar.f13660a) && gm.l.a(this.f13661b, aVar.f13661b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13661b.hashCode() + (this.f13660a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Params(username=");
            a10.append(this.f13660a);
            a10.append(", password=");
            return a2.a(a10, this.f13661b, ')');
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.domain.auth.SignInStandardUseCase", f = "SignInStandardUseCase.kt", l = {20}, m = "execute")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f13662d;

        /* renamed from: f */
        public int f13664f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            i.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f13662d = obj;
            this.f13664f |= Integer.MIN_VALUE;
            return i.this.a(null, this);
        }
    }

    public i(wm.b bVar, jg.b bVar2) {
        super(bVar);
        this.f13659b = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004f  */
    @Override // dh.b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(eh.i.a r7, xl.d<? super com.topstep.fitcloud.pro.model.auth.FillUserInfo> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof eh.i.b
            if (r0 == 0) goto L13
            r0 = r8
            eh.i$b r0 = (eh.i.b) r0
            int r1 = r0.f13664f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13664f = r1
            goto L18
        L13:
            eh.i$b r0 = new eh.i$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f13662d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f13664f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r8)
            goto L49
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            mf.a0.k(r8)
            java.lang.String r8 = r7.f13660a
            eh.l r8 = s.h1.s(r8)
            jg.a r2 = r6.f13659b
            java.lang.String r4 = r8.f13681a
            java.lang.String r7 = r7.f13661b
            boolean r8 = r8.f13682b
            r0.f13664f = r3
            java.lang.Object r8 = r2.g(r4, r7, r8, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            jg.a$a r8 = (jg.a.C0308a) r8
            if (r8 != 0) goto L4f
            r7 = 0
            goto L5b
        L4f:
            com.topstep.fitcloud.pro.model.auth.FillUserInfo r7 = new com.topstep.fitcloud.pro.model.auth.FillUserInfo
            java.lang.String r1 = r8.f17662a
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: eh.i.a(eh.i$a, xl.d):java.lang.Object");
    }
}
