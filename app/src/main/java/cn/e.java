package cn;

import bi.r;
import gm.l;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ d f4978a;

    public e(d dVar) {
        this.f4978a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a c10;
        while (true) {
            synchronized (this.f4978a) {
                c10 = this.f4978a.c();
            }
            if (c10 != null) {
                c cVar = c10.f4956a;
                l.c(cVar);
                long j10 = -1;
                d dVar = d.f4967h;
                boolean isLoggable = d.f4968i.isLoggable(Level.FINE);
                if (isLoggable) {
                    j10 = cVar.f4965e.f4976g.b();
                    r.d(c10, cVar, "starting");
                }
                try {
                    d.a(this.f4978a, c10);
                    tl.l lVar = tl.l.f28297a;
                    if (isLoggable) {
                        long b10 = cVar.f4965e.f4976g.b() - j10;
                        StringBuilder a10 = android.support.v4.media.d.a("finished run in ");
                        a10.append(r.z(b10));
                        r.d(c10, cVar, a10.toString());
                    }
                } catch (Throwable th2) {
                    if (isLoggable) {
                        long b11 = cVar.f4965e.f4976g.b() - j10;
                        StringBuilder a11 = android.support.v4.media.d.a("failed a run in ");
                        a11.append(r.z(b11));
                        r.d(c10, cVar, a11.toString());
                    }
                    throw th2;
                }
            } else {
                return;
            }
        }
    }
}
