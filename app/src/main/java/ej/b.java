package ej;

import java.util.concurrent.atomic.AtomicBoolean;
import p000do.a;
import tl.l;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a */
    public final Object f13817a = new Object();

    /* renamed from: b */
    public final AtomicBoolean f13818b = new AtomicBoolean(false);

    public final void a() {
        synchronized (this.f13817a) {
            while (!this.f13818b.get()) {
                try {
                    this.f13817a.wait();
                } catch (InterruptedException e10) {
                    if (!this.f13818b.get()) {
                        a.b bVar = p000do.a.f13275a;
                        bVar.t("Fc#Semaphore");
                        bVar.r(e10, "awaitRelease() has been interrupted abruptly  while it wasn't released by the release() method.", new Object[0]);
                    }
                }
            }
            l lVar = l.f28297a;
        }
    }

    public final void b() {
        synchronized (this.f13817a) {
            if (this.f13818b.compareAndSet(false, true)) {
                this.f13817a.notify();
            }
            l lVar = l.f28297a;
        }
    }
}
