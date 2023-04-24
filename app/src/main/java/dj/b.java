package dj;

import gm.l;
import java.util.concurrent.TimeUnit;
import kc.o0;

/* loaded from: classes2.dex */
public interface b {

    /* loaded from: classes2.dex */
    public interface a {
    }

    /* renamed from: dj.b$b */
    /* loaded from: classes2.dex */
    public static final class C0226b {

        /* renamed from: a */
        public final o0 f13094a;

        /* renamed from: b */
        public final vi.d f13095b;

        /* renamed from: c */
        public final vi.b f13096c;

        /* renamed from: d */
        public final vi.c f13097d;

        /* renamed from: e */
        public a f13098e;

        /* renamed from: f */
        public c f13099f;

        public C0226b(o0 o0Var, vi.d dVar, vi.b bVar, vi.c cVar) {
            l.f(o0Var, "rxBleClient");
            l.f(dVar, "processVisibilityManager");
            l.f(bVar, "environmentHelper");
            l.f(cVar, "internalStorage");
            this.f13094a = o0Var;
            this.f13095b = dVar;
            this.f13096c = bVar;
            this.f13097d = cVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
    }

    tk.i a(TimeUnit timeUnit);
}
