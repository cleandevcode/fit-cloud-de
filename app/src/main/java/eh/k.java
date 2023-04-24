package eh;

import a0.a2;
import com.topstep.fitcloud.pro.model.auth.FillUserInfo;
import i2.t;

/* loaded from: classes2.dex */
public final class k extends dh.b<a, FillUserInfo> {

    /* renamed from: b */
    public final jg.a f13674b;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final String f13675a;

        /* renamed from: b */
        public final String f13676b;

        /* renamed from: c */
        public final String f13677c;

        public a(String str, String str2, String str3) {
            gm.l.f(str, "username");
            gm.l.f(str2, "password");
            this.f13675a = str;
            this.f13676b = str2;
            this.f13677c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return gm.l.a(this.f13675a, aVar.f13675a) && gm.l.a(this.f13676b, aVar.f13676b) && gm.l.a(this.f13677c, aVar.f13677c);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int a10 = t.a(this.f13676b, this.f13675a.hashCode() * 31, 31);
            String str = this.f13677c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return a10 + hashCode;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Params(username=");
            a10.append(this.f13675a);
            a10.append(", password=");
            a10.append(this.f13676b);
            a10.append(", authCode=");
            return a2.a(a10, this.f13677c, ')');
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.domain.auth.SignUpUseCase", f = "SignUpUseCase.kt", l = {20}, m = "execute")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f13678d;

        /* renamed from: f */
        public int f13680f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            k.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f13678d = obj;
            this.f13680f |= Integer.MIN_VALUE;
            return k.this.a(null, this);
        }
    }

    public k(wm.b bVar, jg.b bVar2) {
        super(bVar);
        this.f13674b = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0030  */
    @Override // dh.b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(eh.k.a r8, xl.d<? super com.topstep.fitcloud.pro.model.auth.FillUserInfo> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof eh.k.b
            if (r0 == 0) goto L13
            r0 = r9
            eh.k$b r0 = (eh.k.b) r0
            int r1 = r0.f13680f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13680f = r1
            goto L18
        L13:
            eh.k$b r0 = new eh.k$b
            r0.<init>(r9)
        L18:
            r6 = r0
            java.lang.Object r9 = r6.f13678d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r6.f13680f
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            mf.a0.k(r9)
            goto L4f
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            mf.a0.k(r9)
            java.lang.String r9 = r8.f13675a
            eh.l r9 = s.h1.s(r9)
            jg.a r1 = r7.f13674b
            java.lang.String r3 = r9.f13681a
            java.lang.String r4 = r8.f13676b
            java.lang.String r8 = r8.f13677c
            boolean r5 = r9.f13682b
            r6.f13680f = r2
            r2 = r3
            r3 = r4
            r4 = r8
            java.lang.Object r9 = r1.l(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L4f
            return r0
        L4f:
            jg.a$a r9 = (jg.a.C0308a) r9
            com.topstep.fitcloud.pro.model.auth.FillUserInfo r8 = new com.topstep.fitcloud.pro.model.auth.FillUserInfo
            java.lang.String r1 = r9.f17662a
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: eh.k.a(eh.k$a, xl.d):java.lang.Object");
    }
}
