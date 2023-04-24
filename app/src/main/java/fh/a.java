package fh;

import a0.a2;
import android.support.v4.media.d;
import kg.k;
import tl.l;
import zl.c;
import zl.e;

/* loaded from: classes2.dex */
public final class a extends dh.b<C0252a, l> {

    /* renamed from: b */
    public final long f14262b;

    /* renamed from: c */
    public final k f14263c;

    /* renamed from: fh.a$a */
    /* loaded from: classes2.dex */
    public static final class C0252a {

        /* renamed from: a */
        public final String f14264a;

        /* renamed from: b */
        public final String f14265b;

        /* renamed from: c */
        public final String f14266c;

        public C0252a(String str, String str2, String str3) {
            gm.l.f(str, "username");
            gm.l.f(str3, "authCode");
            this.f14264a = str;
            this.f14265b = str2;
            this.f14266c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0252a) {
                C0252a c0252a = (C0252a) obj;
                return gm.l.a(this.f14264a, c0252a.f14264a) && gm.l.a(this.f14265b, c0252a.f14265b) && gm.l.a(this.f14266c, c0252a.f14266c);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f14264a.hashCode() * 31;
            String str = this.f14265b;
            return this.f14266c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder a10 = d.a("Params(username=");
            a10.append(this.f14264a);
            a10.append(", password=");
            a10.append(this.f14265b);
            a10.append(", authCode=");
            return a2.a(a10, this.f14266c, ')');
        }
    }

    @e(c = "com.topstep.fitcloud.pro.shared.domain.config.AccountBindUseCase", f = "AccountBindUseCase.kt", l = {19}, m = "execute")
    /* loaded from: classes2.dex */
    public static final class b extends c {

        /* renamed from: d */
        public /* synthetic */ Object f14267d;

        /* renamed from: f */
        public int f14269f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f14267d = obj;
            this.f14269f |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(wm.b bVar, long j10, k kVar) {
        super(bVar);
        gm.l.f(kVar, "userInfoRepository");
        this.f14262b = j10;
        this.f14263c = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0030  */
    @Override // dh.b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(fh.a.C0252a r10, xl.d<? super tl.l> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof fh.a.b
            if (r0 == 0) goto L13
            r0 = r11
            fh.a$b r0 = (fh.a.b) r0
            int r1 = r0.f14269f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14269f = r1
            goto L18
        L13:
            fh.a$b r0 = new fh.a$b
            r0.<init>(r11)
        L18:
            r8 = r0
            java.lang.Object r11 = r8.f14267d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r8.f14269f
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            mf.a0.k(r11)
            goto L51
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L30:
            mf.a0.k(r11)
            java.lang.String r11 = r10.f14264a
            eh.l r11 = s.h1.s(r11)
            kg.k r1 = r9.f14263c
            long r3 = r9.f14262b
            java.lang.String r5 = r11.f13681a
            boolean r11 = r11.f13682b
            java.lang.String r6 = r10.f14266c
            java.lang.String r7 = r10.f14265b
            r8.f14269f = r2
            r2 = r3
            r4 = r5
            r5 = r11
            java.lang.Object r10 = r1.z(r2, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L51
            return r0
        L51:
            tl.l r10 = tl.l.f28297a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.a.a(fh.a$a, xl.d):java.lang.Object");
    }
}
