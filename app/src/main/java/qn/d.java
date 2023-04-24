package qn;

import java.io.IOException;
import java.io.InputStream;
import pn.t;
import tn.u;

/* loaded from: classes2.dex */
public class d implements Runnable {

    /* renamed from: h */
    public static final String f25064h;

    /* renamed from: i */
    public static final un.b f25065i;

    /* renamed from: j */
    public static /* synthetic */ Class f25066j;

    /* renamed from: c */
    public b f25069c;

    /* renamed from: d */
    public a f25070d;

    /* renamed from: e */
    public tn.f f25071e;

    /* renamed from: f */
    public f f25072f;

    /* renamed from: a */
    public boolean f25067a = false;

    /* renamed from: b */
    public Object f25068b = new Object();

    /* renamed from: g */
    public Thread f25073g = null;

    static {
        Class<?> cls = f25066j;
        if (cls == null) {
            try {
                cls = Class.forName("qn.d");
                f25066j = cls;
            } catch (ClassNotFoundException e10) {
                throw new NoClassDefFoundError(e10.getMessage());
            }
        }
        String name = cls.getName();
        f25064h = name;
        f25065i = un.c.a(name);
    }

    public d(a aVar, b bVar, f fVar, InputStream inputStream) {
        this.f25069c = null;
        this.f25070d = null;
        this.f25072f = null;
        this.f25071e = new tn.f(bVar, inputStream);
        this.f25070d = aVar;
        this.f25069c = bVar;
        this.f25072f = fVar;
        f25065i.d(aVar.f24998a.a());
    }

    public final void a(String str) {
        f25065i.c(f25064h, "start", "855");
        synchronized (this.f25068b) {
            if (!this.f25067a) {
                this.f25067a = true;
                Thread thread = new Thread(this, str);
                this.f25073g = thread;
                thread.start();
            }
        }
    }

    public final void b() {
        synchronized (this.f25068b) {
            f25065i.c(f25064h, "stop", "850");
            if (this.f25067a) {
                this.f25067a = false;
                if (!Thread.currentThread().equals(this.f25073g)) {
                    try {
                        this.f25073g.join();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        this.f25073g = null;
        f25065i.c(f25064h, "stop", "851");
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = null;
        while (this.f25067a && this.f25071e != null) {
            try {
                try {
                    f25065i.c(f25064h, "run", "852");
                    this.f25071e.available();
                    u a10 = this.f25071e.a();
                    if (a10 instanceof tn.b) {
                        tVar = this.f25072f.c(a10);
                        if (tVar == null) {
                            throw new pn.n(6);
                        }
                        synchronized (tVar) {
                            this.f25069c.p((tn.b) a10);
                        }
                    } else {
                        this.f25069c.r(a10);
                    }
                } catch (pn.n e10) {
                    f25065i.e(f25064h, "run", "856", null, e10);
                    this.f25067a = false;
                    this.f25070d.i(tVar, e10);
                }
            } catch (IOException e11) {
                f25065i.c(f25064h, "run", "853");
                this.f25067a = false;
                if (!this.f25070d.h()) {
                    this.f25070d.i(tVar, new pn.n(32109, e11));
                }
            }
        }
        f25065i.c(f25064h, "run", "854");
    }
}
