package eh;

import a0.a2;
import com.topstep.fitcloud.pro.model.auth.FillUserInfo;
import i2.t;

/* loaded from: classes2.dex */
public final class j extends dh.b<a, FillUserInfo> {

    /* renamed from: b */
    public final jg.a f13665b;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final String f13666a;

        /* renamed from: b */
        public final String f13667b;

        /* renamed from: c */
        public final String f13668c;

        /* renamed from: d */
        public String f13669d;

        public a(String str, String str2, String str3) {
            this.f13666a = str;
            this.f13667b = str2;
            this.f13668c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return gm.l.a(this.f13666a, aVar.f13666a) && gm.l.a(this.f13667b, aVar.f13667b) && gm.l.a(this.f13668c, aVar.f13668c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13668c.hashCode() + t.a(this.f13667b, this.f13666a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Params(openAppId=");
            a10.append(this.f13666a);
            a10.append(", openAppName=");
            a10.append(this.f13667b);
            a10.append(", nickName=");
            return a2.a(a10, this.f13668c, ')');
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.domain.auth.SignInThirdPartyUseCase", f = "SignInThirdPartyUseCase.kt", l = {19}, m = "execute")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public a f13670d;

        /* renamed from: e */
        public /* synthetic */ Object f13671e;

        /* renamed from: g */
        public int f13673g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            j.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f13671e = obj;
            this.f13673g |= Integer.MIN_VALUE;
            return j.this.a(null, this);
        }
    }

    public j(wm.b bVar, jg.b bVar2) {
        super(bVar);
        this.f13665b = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0049 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004b  */
    @Override // dh.b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(eh.j.a r6, xl.d<? super com.topstep.fitcloud.pro.model.auth.FillUserInfo> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof eh.j.b
            if (r0 == 0) goto L13
            r0 = r7
            eh.j$b r0 = (eh.j.b) r0
            int r1 = r0.f13673g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13673g = r1
            goto L18
        L13:
            eh.j$b r0 = new eh.j$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13671e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f13673g
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            eh.j$a r6 = r0.f13670d
            mf.a0.k(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            mf.a0.k(r7)
            jg.a r7 = r5.f13665b
            java.lang.String r2 = r6.f13666a
            java.lang.String r4 = r6.f13667b
            r0.f13670d = r6
            r0.f13673g = r3
            java.lang.Object r7 = r7.i(r2, r4, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            jg.a$a r7 = (jg.a.C0308a) r7
            if (r7 != 0) goto L4b
            r6 = 0
            goto L57
        L4b:
            com.topstep.fitcloud.pro.model.auth.FillUserInfo r0 = new com.topstep.fitcloud.pro.model.auth.FillUserInfo
            java.lang.String r7 = r7.f17662a
            java.lang.String r1 = r6.f13668c
            java.lang.String r6 = r6.f13669d
            r0.<init>(r7, r1, r6)
            r6 = r0
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eh.j.a(eh.j$a, xl.d):java.lang.Object");
    }
}
