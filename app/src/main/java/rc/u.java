package rc;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u implements s {

    /* renamed from: d */
    public static final long f25505d = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: a */
    public final long[] f25506a = new long[5];

    /* renamed from: b */
    public final t f25507b;

    /* renamed from: c */
    public final tk.o f25508c;

    public u(t tVar, tk.o oVar) {
        this.f25507b = tVar;
        this.f25508c = oVar;
    }

    @Override // rc.s
    public final void a(boolean z10) {
        this.f25507b.a(z10);
        long j10 = Long.MAX_VALUE;
        int i10 = -1;
        for (int i11 = 0; i11 < 5; i11++) {
            long j11 = this.f25506a[i11];
            if (j11 < j10) {
                i10 = i11;
                j10 = j11;
            }
        }
        long j12 = this.f25506a[i10];
        tk.o oVar = this.f25508c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        oVar.getClass();
        long a10 = tk.o.a(timeUnit);
        long j13 = f25505d;
        if (a10 - j12 >= j13) {
            this.f25506a[i10] = a10;
            return;
        }
        throw new lc.n(new Date(j12 + j13));
    }
}
