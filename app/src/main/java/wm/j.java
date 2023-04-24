package wm;

import pm.g0;

/* loaded from: classes2.dex */
public final class j extends g {

    /* renamed from: c */
    public final Runnable f30051c;

    public j(Runnable runnable, long j10, h hVar) {
        super(j10, hVar);
        this.f30051c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f30051c.run();
        } finally {
            this.f30049b.a();
        }
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Task[");
        a10.append(this.f30051c.getClass().getSimpleName());
        a10.append('@');
        a10.append(g0.j(this.f30051c));
        a10.append(", ");
        a10.append(this.f30048a);
        a10.append(", ");
        a10.append(this.f30049b);
        a10.append(']');
        return a10.toString();
    }
}
