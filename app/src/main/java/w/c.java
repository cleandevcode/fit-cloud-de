package w;

import android.os.RemoteException;
import com.google.android.gms.location.LocationRequest;
import g8.a;
import h8.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import l2.v;
import sm.g1;
import sm.r0;
import x8.u;

/* loaded from: classes.dex */
public final class c implements h8.m, g9.f {

    /* renamed from: a */
    public final Object f29487a;

    /* renamed from: b */
    public final Object f29488b;

    public /* synthetic */ c() {
        g1 c10 = bi.r.c(new tl.f(Integer.MIN_VALUE, null));
        this.f29487a = c10;
        this.f29488b = new v(c10);
    }

    public /* synthetic */ c(Object obj, Object obj2) {
        this.f29487a = obj;
        this.f29488b = obj2;
    }

    public /* synthetic */ c(wi.k kVar, jj.l lVar) {
        gm.l.f(kVar, "connector");
        gm.l.f(lVar, "configFeature");
        this.f29487a = kVar;
        this.f29488b = lVar;
    }

    @Override // h8.m
    public final void a(a.e eVar, Object obj) {
        g8.a aVar = x8.h.f30418k;
        ((u) eVar).E((x8.g) this.f29487a, (LocationRequest) this.f29488b, (g9.h) obj);
    }

    public final void b(Object obj) {
        gm.l.f(obj, "data");
        Object obj2 = this.f29487a;
        ((r0) obj2).setValue(new tl.f(Integer.valueOf(((Number) ((tl.f) ((r0) obj2).getValue()).f28286a).intValue() + 1), obj));
    }

    @Override // g9.f
    public final void c() {
        try {
            ((u) this.f29487a).C((h.a) this.f29488b, true, new g9.h());
        } catch (RemoteException unused) {
        }
    }

    public c(v.e eVar) {
        this.f29487a = eVar;
        this.f29488b = eVar != null ? new HashSet(new ArrayList(eVar.f28959a)) : Collections.emptySet();
    }
}
