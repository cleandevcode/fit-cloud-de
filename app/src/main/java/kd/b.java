package kd;

import com.realsil.sdk.bbpro.internal.BaseBeeProManager;
import no.nordicsemi.android.dfu.DfuServiceInitiator;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ yc.d f18441a;

    /* renamed from: b */
    public final /* synthetic */ BaseBeeProManager f18442b;

    public b(BaseBeeProManager baseBeeProManager, yc.d dVar) {
        this.f18442b = baseBeeProManager;
        this.f18441a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            synchronized (this.f18442b.f9444w) {
                this.f18442b.f9444w.wait(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
            }
        } catch (InterruptedException e10) {
            ge.b.p(e10.getMessage());
        }
        this.f18442b.a(1);
        if (!this.f18442b.g().i(this.f18441a.a())) {
            ge.b.p("connect failed");
            this.f18442b.a(0);
            BaseBeeProManager baseBeeProManager = this.f18442b;
            baseBeeProManager.b(baseBeeProManager.f9427f, baseBeeProManager.f9423b);
        }
    }
}
