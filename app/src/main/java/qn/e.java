package qn;

import java.io.IOException;
import java.io.OutputStream;
import pn.t;
import tn.u;

/* loaded from: classes2.dex */
public class e implements Runnable {

    /* renamed from: h */
    public static final String f25074h;

    /* renamed from: i */
    public static final un.b f25075i;

    /* renamed from: j */
    public static /* synthetic */ Class f25076j;

    /* renamed from: c */
    public b f25079c;

    /* renamed from: d */
    public tn.g f25080d;

    /* renamed from: e */
    public a f25081e;

    /* renamed from: f */
    public f f25082f;

    /* renamed from: a */
    public boolean f25077a = false;

    /* renamed from: b */
    public Object f25078b = new Object();

    /* renamed from: g */
    public Thread f25083g = null;

    static {
        Class<?> cls = f25076j;
        if (cls == null) {
            try {
                cls = Class.forName("qn.e");
                f25076j = cls;
            } catch (ClassNotFoundException e10) {
                throw new NoClassDefFoundError(e10.getMessage());
            }
        }
        String name = cls.getName();
        f25074h = name;
        f25075i = un.c.a(name);
    }

    public e(a aVar, b bVar, f fVar, OutputStream outputStream) {
        this.f25079c = null;
        this.f25081e = null;
        this.f25082f = null;
        this.f25080d = new tn.g(bVar, outputStream);
        this.f25081e = aVar;
        this.f25079c = bVar;
        this.f25082f = fVar;
        f25075i.d(aVar.f24998a.a());
    }

    public final void a(Exception exc) {
        f25075i.e(f25074h, "handleRunException", "804", null, exc);
        pn.n nVar = !(exc instanceof pn.n) ? new pn.n(32109, exc) : (pn.n) exc;
        this.f25077a = false;
        this.f25081e.i(null, nVar);
    }

    public final void b(String str) {
        synchronized (this.f25078b) {
            if (!this.f25077a) {
                this.f25077a = true;
                Thread thread = new Thread(this, str);
                this.f25083g = thread;
                thread.start();
            }
        }
    }

    public final void c() {
        synchronized (this.f25078b) {
            f25075i.c(f25074h, "stop", "800");
            if (this.f25077a) {
                this.f25077a = false;
                if (!Thread.currentThread().equals(this.f25083g)) {
                    while (this.f25083g.isAlive()) {
                        try {
                            this.f25079c.o();
                            this.f25083g.join(100L);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
            this.f25083g = null;
            f25075i.c(f25074h, "stop", "801");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (this.f25077a && this.f25080d != null) {
            try {
                u h10 = this.f25079c.h();
                if (h10 != null) {
                    f25075i.g(f25074h, "run", "802", new Object[]{h10.m(), h10});
                    if (h10 instanceof tn.b) {
                        this.f25080d.a(h10);
                        this.f25080d.flush();
                    } else {
                        t c10 = this.f25082f.c(h10);
                        if (c10 != null) {
                            synchronized (c10) {
                                this.f25080d.a(h10);
                                try {
                                    this.f25080d.flush();
                                } catch (IOException e10) {
                                    if (!(h10 instanceof tn.e)) {
                                        throw e10;
                                        break;
                                    }
                                }
                                this.f25079c.t(h10);
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    f25075i.c(f25074h, "run", "803");
                    this.f25077a = false;
                }
            } catch (pn.n | Exception e11) {
                a(e11);
            }
        }
        f25075i.c(f25074h, "run", "805");
    }
}
