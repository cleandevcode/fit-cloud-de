package kj;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import gm.l;
import java.util.Locale;
import jj.k1;

/* loaded from: classes2.dex */
public final class a implements ComponentCallbacks {

    /* renamed from: a */
    public final /* synthetic */ c f18604a;

    public a(c cVar) {
        this.f18604a = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        l.f(configuration, "newConfig");
        c cVar = this.f18604a;
        if (cVar.f18609d != null) {
            Locale b10 = c.b(cVar, configuration);
            if (!l.a(b10, this.f18604a.f18608c)) {
                this.f18604a.f18608c = b10;
                byte a10 = ak.b.a(b10);
                Byte b11 = this.f18604a.f18609d;
                if (b11 != null && a10 == b11.byteValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    this.f18604a.f18609d = Byte.valueOf(a10);
                    new bl.g(((k1) this.f18604a.f18607b).f(a10)).f();
                }
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
