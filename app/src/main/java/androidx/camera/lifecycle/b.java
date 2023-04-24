package androidx.camera.lifecycle;

import com.polidea.rxandroidble3.internal.RxBleLog;
import d0.f;
import fl.g;
import gm.l;
import p0.c;
import tk.k;
import y.u;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements c.InterfaceC0425c, k {

    /* renamed from: a */
    public final /* synthetic */ Object f1836a;

    /* renamed from: b */
    public final /* synthetic */ Object f1837b;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f1836a = obj;
        this.f1837b = obj2;
    }

    @Override // tk.k
    public final void a(g.a aVar) {
        zi.a aVar2 = (zi.a) this.f1836a;
        ej.a aVar3 = (ej.a) this.f1837b;
        l.f(aVar2, "this$0");
        l.f(aVar3, "$releaseSemaphore");
        try {
            aVar2.a(aVar, aVar3);
        } catch (Throwable th2) {
            aVar.f(th2);
            RxBleLog.e(th2, "QueueOperation terminated with an unexpected exception", new Object[0]);
        }
    }

    @Override // p0.c.InterfaceC0425c
    public final String g(c.a aVar) {
        e eVar = (e) this.f1836a;
        final u uVar = (u) this.f1837b;
        synchronized (eVar.f1842a) {
            f.a(d0.d.b(eVar.f1844c).d(new d0.a() { // from class: androidx.camera.lifecycle.c
                @Override // d0.a
                public final na.a apply(Object obj) {
                    Void r22 = (Void) obj;
                    return u.this.f30780j;
                }
            }, o8.b.i()), new d(uVar, aVar), o8.b.i());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }
}
