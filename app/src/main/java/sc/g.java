package sc;

import java.util.concurrent.ExecutorService;
import oc.x;
import tc.i0;
import tc.m;
import tc.p;
import tk.o;

/* loaded from: classes.dex */
public final class g implements v3.c {

    /* renamed from: a */
    public final /* synthetic */ int f26883a;

    /* renamed from: b */
    public final w3.a f26884b;

    /* renamed from: c */
    public final w3.a f26885c;

    /* renamed from: d */
    public final w3.a f26886d;

    /* renamed from: e */
    public final w3.a f26887e;

    public /* synthetic */ g(w3.a aVar, w3.a aVar2, w3.a aVar3, w3.a aVar4, int i10) {
        this.f26883a = i10;
        this.f26884b = aVar;
        this.f26885c = aVar2;
        this.f26886d = aVar3;
        this.f26887e = aVar4;
    }

    @Override // w3.a
    public final Object get() {
        switch (this.f26883a) {
            case 0:
                return new e((String) this.f26884b.get(), (x) this.f26885c.get(), (ExecutorService) this.f26886d.get(), (o) this.f26887e.get());
            default:
                return new i0((m) this.f26884b.get(), (p) this.f26885c.get(), ((Boolean) this.f26886d.get()).booleanValue(), ((Boolean) this.f26887e.get()).booleanValue());
        }
    }
}
