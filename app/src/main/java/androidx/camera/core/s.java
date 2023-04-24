package androidx.camera.core;

import a0.b0;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.widget.m2;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p0.c;
import s.h1;
import s.l0;
import y.i0;
import y.j1;
import y.k1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    public final Object f1786a = new Object();

    /* renamed from: b */
    public final Size f1787b;

    /* renamed from: c */
    public final boolean f1788c;

    /* renamed from: d */
    public final b0 f1789d;

    /* renamed from: e */
    public final na.a<Surface> f1790e;

    /* renamed from: f */
    public final c.a<Surface> f1791f;

    /* renamed from: g */
    public final na.a<Void> f1792g;

    /* renamed from: h */
    public final c.a<Void> f1793h;

    /* renamed from: i */
    public final k1 f1794i;

    /* renamed from: j */
    public d f1795j;

    /* renamed from: k */
    public e f1796k;

    /* renamed from: l */
    public Executor f1797l;

    /* loaded from: classes.dex */
    public class a implements d0.c<Void> {

        /* renamed from: a */
        public final /* synthetic */ j1.a f1798a;

        /* renamed from: b */
        public final /* synthetic */ Surface f1799b;

        public a(j1.a aVar, Surface surface) {
            this.f1798a = aVar;
            this.f1799b = surface;
        }

        @Override // d0.c
        public final void onFailure(Throwable th2) {
            h1.k("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2, th2 instanceof b);
            this.f1798a.accept(new androidx.camera.core.b(1, this.f1799b));
        }

        @Override // d0.c
        public final void onSuccess(Void r42) {
            this.f1798a.accept(new androidx.camera.core.b(0, this.f1799b));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends RuntimeException {
        public b(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract int a();

        public abstract Surface b();
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public abstract Rect a();

        public abstract int b();

        public abstract int c();
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(d dVar);
    }

    public s(Size size, b0 b0Var, boolean z10) {
        this.f1787b = size;
        this.f1789d = b0Var;
        this.f1788c = z10;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        c.d a10 = p0.c.a(new j1(atomicReference, str, 0));
        c.a<Void> aVar = (c.a) atomicReference.get();
        aVar.getClass();
        this.f1793h = aVar;
        AtomicReference atomicReference2 = new AtomicReference(null);
        c.d a11 = p0.c.a(new l0(atomicReference2, str, 1));
        this.f1792g = a11;
        d0.f.a(a11, new p(aVar, a10), o8.b.i());
        c.a aVar2 = (c.a) atomicReference2.get();
        aVar2.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        c.d a12 = p0.c.a(new i0(atomicReference3, str, 1));
        this.f1790e = a12;
        c.a<Surface> aVar3 = (c.a) atomicReference3.get();
        aVar3.getClass();
        this.f1791f = aVar3;
        k1 k1Var = new k1(this, size);
        this.f1794i = k1Var;
        na.a<Void> d10 = k1Var.d();
        d0.f.a(a12, new q(d10, aVar2, str), o8.b.i());
        d10.a(new m2(5, this), o8.b.i());
    }

    public final void a(Surface surface, Executor executor, j1.a<c> aVar) {
        if (!this.f1791f.a(surface) && !this.f1790e.isCancelled()) {
            h1.k(null, this.f1790e.isDone());
            try {
                this.f1790e.get();
                executor.execute(new s.q(aVar, surface, 6));
                return;
            } catch (InterruptedException | ExecutionException unused) {
                executor.execute(new s.s(aVar, surface, 7));
                return;
            }
        }
        d0.f.a(this.f1792g, new a(aVar, surface), executor);
    }
}
