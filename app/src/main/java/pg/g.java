package pg;

import a0.a2;
import java.util.Date;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a */
    public final long f24041a;

    /* renamed from: b */
    public final long f24042b;

    /* renamed from: c */
    public final Date f24043c;

    /* renamed from: d */
    public final int f24044d;

    /* renamed from: e */
    public final String f24045e;

    public g(long j10, long j11, Date date, int i10, String str) {
        gm.l.f(date, "date");
        this.f24041a = j10;
        this.f24042b = j11;
        this.f24043c = date;
        this.f24044d = i10;
        this.f24045e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x001e A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:36:0x000e, B:45:0x001e), top: B:56:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig a(mf.h0 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "moshi"
            gm.l.f(r9, r0)
            int r0 = r8.f24044d
            r1 = 0
            if (r0 != 0) goto L47
            java.lang.String r0 = r8.f24045e
            if (r0 == 0) goto L19
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L15
            goto L19
        L15:
            r2 = 0
            goto L1a
        L17:
            r9 = move-exception
            goto L29
        L19:
            r2 = 1
        L1a:
            if (r2 == 0) goto L1e
            r9 = r1
            goto L32
        L1e:
            java.lang.Class<com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig> r2 = com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig.class
            mf.t r9 = r9.a(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = r9.a(r0)     // Catch: java.lang.Throwable -> L17
            goto L32
        L29:
            do.a$b r0 = p000do.a.f13275a
            r0.q(r9)
            tl.g$a r9 = mf.a0.f(r9)
        L32:
            boolean r0 = r9 instanceof tl.g.a
            if (r0 == 0) goto L37
            goto L38
        L37:
            r1 = r9
        L38:
            com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig r1 = (com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig) r1
            if (r1 != 0) goto L47
            com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig r1 = new com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 7
            r7 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.g.a(mf.h0):com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f24041a == gVar.f24041a && this.f24042b == gVar.f24042b && gm.l.a(this.f24043c, gVar.f24043c) && this.f24044d == gVar.f24044d && gm.l.a(this.f24045e, gVar.f24045e);
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f24041a;
        long j11 = this.f24042b;
        int hashCode = (((this.f24043c.hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f24044d) * 31;
        String str = this.f24045e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("MenstruationTimeline(id=");
        a10.append(this.f24041a);
        a10.append(", userId=");
        a10.append(this.f24042b);
        a10.append(", date=");
        a10.append(this.f24043c);
        a10.append(", type=");
        a10.append(this.f24044d);
        a10.append(", extra=");
        return a2.a(a10, this.f24045e, ')');
    }
}
