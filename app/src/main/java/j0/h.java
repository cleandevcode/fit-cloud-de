package j0;

import a0.b0;
import a0.g1;
import android.graphics.RectF;
import androidx.camera.core.s;
import androidx.camera.view.PreviewView;
import androidx.camera.view.c;
import b0.p;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import y.h1;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements s.e, c.a {

    /* renamed from: a */
    public final /* synthetic */ Object f17248a;

    /* renamed from: b */
    public final /* synthetic */ Object f17249b;

    /* renamed from: c */
    public final /* synthetic */ Object f17250c;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3) {
        this.f17248a = obj;
        this.f17249b = obj2;
        this.f17250c = obj3;
    }

    @Override // androidx.camera.core.s.e
    public final void a(s.d dVar) {
        s.e eVar;
        Executor executor;
        d dVar2 = (d) this.f17250c;
        int b10 = dVar.b() - ((h1) this.f17248a).c();
        if (((d) this.f17249b).f17237q) {
            b10 = -b10;
        }
        RectF rectF = p.f3976a;
        int i10 = ((b10 % 360) + 360) % 360;
        dVar2.getClass();
        p.b.f();
        if (dVar2.f17239s != i10) {
            dVar2.f17239s = i10;
            s sVar = dVar2.f17243w;
            if (sVar != null) {
                androidx.camera.core.c cVar = new androidx.camera.core.c(dVar2.f17236p, i10, -1);
                synchronized (sVar.f1786a) {
                    sVar.f1795j = cVar;
                    eVar = sVar.f1796k;
                    executor = sVar.f1797l;
                }
                if (eVar != null && executor != null) {
                    executor.execute(new s.p(eVar, cVar, 8));
                }
            }
        }
    }

    public final void b() {
        boolean z10;
        androidx.camera.view.a aVar = (androidx.camera.view.a) this.f17249b;
        b0 b0Var = (b0) this.f17250c;
        AtomicReference<androidx.camera.view.a> atomicReference = PreviewView.this.f1853f;
        while (true) {
            if (atomicReference.compareAndSet(aVar, null)) {
                z10 = true;
                break;
            } else if (atomicReference.get() != aVar) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            aVar.a(PreviewView.g.IDLE);
        }
        d0.d dVar = aVar.f1878e;
        if (dVar != null) {
            dVar.cancel(false);
            aVar.f1878e = null;
        }
        g1 a10 = b0Var.a();
        synchronized (a10.f72b) {
            g1.a aVar2 = (g1.a) a10.f72b.remove(aVar);
            if (aVar2 != null) {
                aVar2.f73a.set(false);
                o8.b.p().execute(new s.p(a10, aVar2, 11));
            }
        }
    }
}
