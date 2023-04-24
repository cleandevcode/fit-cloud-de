package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ac implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ String f20689a;

    /* renamed from: b */
    public final /* synthetic */ long f20690b;

    /* renamed from: c */
    public final /* synthetic */ sb f20691c;

    public ac(sb sbVar, String str, long j10) {
        this.f20691c = sbVar;
        this.f20689a = str;
        this.f20690b = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f20691c.f21454c.a();
        String str = this.f20689a;
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        a10.H(2, this.f20690b);
        this.f20691c.f21452a.c();
        try {
            a10.r();
            this.f20691c.f21452a.p();
            return tl.l.f28297a;
        } finally {
            this.f20691c.f21452a.l();
            this.f20691c.f21454c.c(a10);
        }
    }
}
