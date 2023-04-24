package q2;

import android.os.Bundle;
import android.support.v4.media.d;
import androidx.lifecycle.k;
import androidx.lifecycle.v;
import androidx.savedstate.Recreator;
import gm.l;
import java.util.Map;
import n.b;
import q2.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final c f24511a;

    /* renamed from: b */
    public final a f24512b = new a();

    /* renamed from: c */
    public boolean f24513c;

    public b(c cVar) {
        this.f24511a = cVar;
    }

    public final void a() {
        boolean z10;
        v a02 = this.f24511a.a0();
        l.e(a02, "owner.lifecycle");
        if (a02.f2790c == k.c.INITIALIZED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a02.a(new Recreator(this.f24511a));
            a aVar = this.f24512b;
            aVar.getClass();
            if (!aVar.f24506b) {
                a02.a(new i2.l(1, aVar));
                aVar.f24506b = true;
                this.f24513c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.f24513c) {
            a();
        }
        v a02 = this.f24511a.a0();
        l.e(a02, "owner.lifecycle");
        if (!a02.f2790c.a(k.c.STARTED)) {
            a aVar = this.f24512b;
            if (aVar.f24506b) {
                if (!aVar.f24508d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    aVar.f24507c = bundle2;
                    aVar.f24508d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        StringBuilder a10 = d.a("performRestore cannot be called when owner is ");
        a10.append(a02.f2790c);
        throw new IllegalStateException(a10.toString().toString());
    }

    public final void c(Bundle bundle) {
        l.f(bundle, "outBundle");
        a aVar = this.f24512b;
        aVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f24507c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.b<String, a.b> bVar = aVar.f24505a;
        bVar.getClass();
        b.d dVar = new b.d();
        bVar.f21898c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
