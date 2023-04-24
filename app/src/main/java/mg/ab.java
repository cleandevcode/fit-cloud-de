package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ab implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ long f20687a;

    /* renamed from: b */
    public final /* synthetic */ wa f20688b;

    public ab(wa waVar, long j10) {
        this.f20688b = waVar;
        this.f20687a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f20688b.f21634j.a();
        a10.H(1, this.f20687a);
        this.f20688b.f21625a.c();
        try {
            a10.r();
            this.f20688b.f21625a.p();
            return tl.l.f28297a;
        } finally {
            this.f20688b.f21625a.l();
            this.f20688b.f21634j.c(a10);
        }
    }
}
