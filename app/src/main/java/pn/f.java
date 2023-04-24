package pn;

import java.util.Timer;
import pn.h;

/* loaded from: classes2.dex */
public final class f implements j {

    /* renamed from: a */
    public final /* synthetic */ h f24421a;

    /* renamed from: b */
    public final /* synthetic */ boolean f24422b;

    public f(h hVar, boolean z10) {
        this.f24421a = hVar;
        this.f24422b = z10;
    }

    @Override // pn.i
    public final void a(String str, o oVar) {
    }

    @Override // pn.i
    public final void b(Throwable th2) {
        if (this.f24422b) {
            h hVar = this.f24421a;
            hVar.f24430c.getClass();
            hVar.f24436i = true;
            h.f24425k.g(h.f24424j, "startReconnectCycle", "503", new Object[]{hVar.f24428a, new Long(h.f24426l)});
            StringBuffer stringBuffer = new StringBuffer("MQTT Reconnect: ");
            stringBuffer.append(hVar.f24428a);
            Timer timer = new Timer(stringBuffer.toString());
            hVar.f24435h = timer;
            timer.schedule(new h.a(), h.f24426l);
        }
    }

    @Override // pn.i
    public final void c(c cVar) {
    }

    @Override // pn.j
    public final void d(String str, boolean z10) {
    }
}
