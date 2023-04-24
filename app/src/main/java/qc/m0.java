package qc;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a */
    public final long f24746a;

    /* renamed from: b */
    public final TimeUnit f24747b;

    /* renamed from: c */
    public final tk.o f24748c;

    public m0(long j10, TimeUnit timeUnit, tk.o oVar) {
        this.f24746a = j10;
        this.f24747b = timeUnit;
        this.f24748c = oVar;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("{value=");
        a10.append(this.f24746a);
        a10.append(", timeUnit=");
        a10.append(this.f24747b);
        a10.append('}');
        return a10.toString();
    }
}
