package androidx.camera.core;

import a0.c1;
import androidx.appcompat.widget.r2;
import androidx.camera.core.d;
import androidx.camera.core.g;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g extends f {

    /* renamed from: t */
    public final Executor f1650t;

    /* renamed from: u */
    public final Object f1651u = new Object();

    /* renamed from: v */
    public j f1652v;

    /* renamed from: w */
    public b f1653w;

    /* loaded from: classes.dex */
    public class a implements d0.c<Void> {

        /* renamed from: a */
        public final /* synthetic */ b f1654a;

        public a(b bVar) {
            this.f1654a = bVar;
        }

        @Override // d0.c
        public final void onFailure(Throwable th2) {
            this.f1654a.close();
        }

        @Override // d0.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    /* loaded from: classes.dex */
    public static class b extends d {

        /* renamed from: d */
        public final WeakReference<g> f1655d;

        public b(j jVar, g gVar) {
            super(jVar);
            this.f1655d = new WeakReference<>(gVar);
            a(new d.a() { // from class: y.f0
                @Override // androidx.camera.core.d.a
                public final void a(androidx.camera.core.j jVar2) {
                    androidx.camera.core.g gVar2 = g.b.this.f1655d.get();
                    if (gVar2 != null) {
                        gVar2.f1650t.execute(new r2(3, gVar2));
                    }
                }
            });
        }
    }

    public g(Executor executor) {
        this.f1650t = executor;
    }

    @Override // androidx.camera.core.f
    public final j b(c1 c1Var) {
        return c1Var.g();
    }

    @Override // androidx.camera.core.f
    public final void d() {
        synchronized (this.f1651u) {
            j jVar = this.f1652v;
            if (jVar != null) {
                jVar.close();
                this.f1652v = null;
            }
        }
    }

    @Override // androidx.camera.core.f
    public final void f(j jVar) {
        synchronized (this.f1651u) {
            if (!this.f1649s) {
                jVar.close();
            } else if (this.f1653w == null) {
                b bVar = new b(jVar, this);
                this.f1653w = bVar;
                d0.f.a(c(bVar), new a(bVar), o8.b.i());
            } else {
                if (jVar.d0().d() <= this.f1653w.d0().d()) {
                    jVar.close();
                } else {
                    j jVar2 = this.f1652v;
                    if (jVar2 != null) {
                        jVar2.close();
                    }
                    this.f1652v = jVar;
                }
            }
        }
    }
}
