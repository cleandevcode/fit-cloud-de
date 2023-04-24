package y;

import a0.c1;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements c1.a {

    /* renamed from: a */
    public final /* synthetic */ int f30788a;

    /* renamed from: b */
    public final /* synthetic */ Object f30789b;

    public /* synthetic */ x(int i10, Object obj) {
        this.f30788a = i10;
        this.f30789b = obj;
    }

    @Override // a0.c1.a
    public final void a(a0.c1 c1Var) {
        switch (this.f30788a) {
            case 0:
                y yVar = (y) this.f30789b;
                yVar.getClass();
                androidx.camera.core.j l10 = c1Var.l();
                try {
                    yVar.f30794d.execute(new s.p(yVar, l10, 5));
                    return;
                } catch (RejectedExecutionException unused) {
                    u0.b("CaptureProcessorPipeline", "The executor for post-processing might have been shutting down or terminated!");
                    l10.close();
                    return;
                }
            default:
                b1 b1Var = (b1) this.f30789b;
                synchronized (b1Var.f30659m) {
                    b1Var.h(c1Var);
                }
                return;
        }
    }
}
