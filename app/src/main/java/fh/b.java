package fh;

import a0.a2;
import android.support.v4.media.d;
import kg.k;
import tl.l;
import zl.c;
import zl.e;

/* loaded from: classes2.dex */
public final class b extends dh.b<a, l> {

    /* renamed from: b */
    public final long f14270b;

    /* renamed from: c */
    public final k f14271c;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final String f14272a;

        /* renamed from: b */
        public final String f14273b;

        public a(String str, String str2) {
            gm.l.f(str, "oldPassword");
            gm.l.f(str2, "newPassword");
            this.f14272a = str;
            this.f14273b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return gm.l.a(this.f14272a, aVar.f14272a) && gm.l.a(this.f14273b, aVar.f14273b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f14273b.hashCode() + (this.f14272a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder a10 = d.a("Params(oldPassword=");
            a10.append(this.f14272a);
            a10.append(", newPassword=");
            return a2.a(a10, this.f14273b, ')');
        }
    }

    @e(c = "com.topstep.fitcloud.pro.shared.domain.config.ModifyPwdUseCase", f = "ModifyPwdUseCase.kt", l = {17}, m = "execute")
    /* renamed from: fh.b$b */
    /* loaded from: classes2.dex */
    public static final class C0253b extends c {

        /* renamed from: d */
        public /* synthetic */ Object f14274d;

        /* renamed from: f */
        public int f14276f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0253b(xl.d<? super C0253b> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f14274d = obj;
            this.f14276f |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(wm.b bVar, long j10, k kVar) {
        super(bVar);
        gm.l.f(kVar, "userInfoRepository");
        this.f14270b = j10;
        this.f14271c = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0030  */
    @Override // dh.b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(fh.b.a r8, xl.d<? super tl.l> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof fh.b.C0253b
            if (r0 == 0) goto L13
            r0 = r9
            fh.b$b r0 = (fh.b.C0253b) r0
            int r1 = r0.f14276f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14276f = r1
            goto L18
        L13:
            fh.b$b r0 = new fh.b$b
            r0.<init>(r9)
        L18:
            r6 = r0
            java.lang.Object r9 = r6.f14274d
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r6.f14276f
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            mf.a0.k(r9)
            goto L46
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            mf.a0.k(r9)
            kg.k r1 = r7.f14271c
            long r3 = r7.f14270b
            java.lang.String r9 = r8.f14272a
            java.lang.String r5 = r8.f14273b
            r6.f14276f = r2
            r2 = r3
            r4 = r9
            java.lang.Object r8 = r1.w(r2, r4, r5, r6)
            if (r8 != r0) goto L46
            return r0
        L46:
            tl.l r8 = tl.l.f28297a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.b.a(fh.b$a, xl.d):java.lang.Object");
    }
}
