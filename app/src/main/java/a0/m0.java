package a0;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import d0.i;
import java.util.concurrent.atomic.AtomicInteger;
import p0.c;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: i */
    public static final Size f122i = new Size(0, 0);

    /* renamed from: j */
    public static final boolean f123j = y.u0.e("DeferrableSurface");

    /* renamed from: k */
    public static final AtomicInteger f124k = new AtomicInteger(0);

    /* renamed from: l */
    public static final AtomicInteger f125l = new AtomicInteger(0);

    /* renamed from: a */
    public final Object f126a;

    /* renamed from: b */
    public int f127b;

    /* renamed from: c */
    public boolean f128c;

    /* renamed from: d */
    public c.a<Void> f129d;

    /* renamed from: e */
    public final c.d f130e;

    /* renamed from: f */
    public final Size f131f;

    /* renamed from: g */
    public final int f132g;

    /* renamed from: h */
    public Class<?> f133h;

    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: a */
        public m0 f134a;

        public a(m0 m0Var, String str) {
            super(str);
            this.f134a = m0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public b() {
            super("Surface request will not complete.");
        }
    }

    public m0() {
        this(0, f122i);
    }

    public m0(int i10, Size size) {
        this.f126a = new Object();
        this.f127b = 0;
        this.f128c = false;
        this.f131f = size;
        this.f132g = i10;
        c.d a10 = p0.c.a(new s.r0(6, this));
        this.f130e = a10;
        if (y.u0.e("DeferrableSurface")) {
            f(f125l.incrementAndGet(), f124k.get(), "Surface created");
            a10.f23758b.a(new s.o(this, Log.getStackTraceString(new Exception()), 3), o8.b.i());
        }
    }

    public void a() {
        c.a<Void> aVar;
        synchronized (this.f126a) {
            if (this.f128c) {
                aVar = null;
            } else {
                this.f128c = true;
                if (this.f127b == 0) {
                    aVar = this.f129d;
                    this.f129d = null;
                } else {
                    aVar = null;
                }
                if (y.u0.e("DeferrableSurface")) {
                    y.u0.a("DeferrableSurface", "surface closed,  useCount=" + this.f127b + " closed=true " + this);
                }
            }
        }
        if (aVar != null) {
            aVar.a(null);
        }
    }

    public final void b() {
        c.a<Void> aVar;
        synchronized (this.f126a) {
            int i10 = this.f127b;
            if (i10 == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i11 = i10 - 1;
            this.f127b = i11;
            if (i11 == 0 && this.f128c) {
                aVar = this.f129d;
                this.f129d = null;
            } else {
                aVar = null;
            }
            if (y.u0.e("DeferrableSurface")) {
                y.u0.a("DeferrableSurface", "use count-1,  useCount=" + this.f127b + " closed=" + this.f128c + " " + this);
                if (this.f127b == 0) {
                    f(f125l.get(), f124k.decrementAndGet(), "Surface no longer in use");
                }
            }
        }
        if (aVar != null) {
            aVar.a(null);
        }
    }

    public final na.a<Surface> c() {
        synchronized (this.f126a) {
            if (this.f128c) {
                return new i.a(new a(this, "DeferrableSurface already closed."));
            }
            return g();
        }
    }

    public final na.a<Void> d() {
        return d0.f.f(this.f130e);
    }

    public final void e() {
        synchronized (this.f126a) {
            int i10 = this.f127b;
            if (i10 == 0 && this.f128c) {
                throw new a(this, "Cannot begin use on a closed surface.");
            }
            this.f127b = i10 + 1;
            if (y.u0.e("DeferrableSurface")) {
                if (this.f127b == 1) {
                    f(f125l.get(), f124k.incrementAndGet(), "New surface in use");
                }
                y.u0.a("DeferrableSurface", "use count+1, useCount=" + this.f127b + " " + this);
            }
        }
    }

    public final void f(int i10, int i11, String str) {
        if (!f123j && y.u0.e("DeferrableSurface")) {
            y.u0.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        y.u0.a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    public abstract na.a<Surface> g();
}
