package y;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.widget.m2;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p0.c;
import s.x2;

/* loaded from: classes.dex */
public final class y implements a0.i0 {

    /* renamed from: a */
    public final a0.i0 f30791a;

    /* renamed from: b */
    public final a0.i0 f30792b;

    /* renamed from: c */
    public final d0.m f30793c;

    /* renamed from: d */
    public final Executor f30794d;

    /* renamed from: e */
    public final int f30795e;

    /* renamed from: f */
    public b f30796f = null;

    /* renamed from: g */
    public o0 f30797g = null;

    /* renamed from: h */
    public final Object f30798h = new Object();

    /* renamed from: i */
    public boolean f30799i = false;

    /* renamed from: j */
    public boolean f30800j = false;

    /* renamed from: k */
    public c.a<Void> f30801k;

    /* renamed from: l */
    public c.d f30802l;

    public y(a0.i0 i0Var, int i10, e0.m mVar, ExecutorService executorService) {
        this.f30791a = i0Var;
        this.f30792b = mVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(i0Var.b());
        arrayList.add(mVar.b());
        this.f30793c = d0.f.b(arrayList);
        this.f30794d = executorService;
        this.f30795e = i10;
    }

    @Override // a0.i0
    public final void a(int i10, Surface surface) {
        this.f30792b.a(i10, surface);
    }

    @Override // a0.i0
    public final na.a<Void> b() {
        na.a<Void> f10;
        synchronized (this.f30798h) {
            if (!this.f30799i || this.f30800j) {
                if (this.f30802l == null) {
                    this.f30802l = p0.c.a(new s.r0(3, this));
                }
                f10 = d0.f.f(this.f30802l);
            } else {
                f10 = d0.f.h(this.f30793c, new x2(1), o8.b.i());
            }
        }
        return f10;
    }

    @Override // a0.i0
    public final void c(Size size) {
        b bVar = new b(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, this.f30795e));
        this.f30796f = bVar;
        this.f30791a.a(35, bVar.getSurface());
        this.f30791a.c(size);
        this.f30792b.c(size);
        this.f30796f.j(new x(0, this), o8.b.i());
    }

    @Override // a0.i0
    public final void close() {
        synchronized (this.f30798h) {
            if (this.f30799i) {
                return;
            }
            this.f30799i = true;
            this.f30791a.close();
            this.f30792b.close();
            e();
        }
    }

    @Override // a0.i0
    public final void d(a0.b1 b1Var) {
        synchronized (this.f30798h) {
            if (this.f30799i) {
                return;
            }
            this.f30800j = true;
            na.a<androidx.camera.core.j> a10 = b1Var.a(b1Var.b().get(0).intValue());
            s.h1.f(a10.isDone());
            try {
                this.f30797g = a10.get().d0();
                this.f30791a.d(b1Var);
            } catch (InterruptedException | ExecutionException unused) {
                throw new IllegalArgumentException("Can not successfully extract ImageProxy from the ImageProxyBundle.");
            }
        }
    }

    public final void e() {
        boolean z10;
        boolean z11;
        c.a<Void> aVar;
        synchronized (this.f30798h) {
            z10 = this.f30799i;
            z11 = this.f30800j;
            aVar = this.f30801k;
            if (z10 && !z11) {
                this.f30796f.close();
            }
        }
        if (!z10 || z11 || aVar == null) {
            return;
        }
        this.f30793c.a(new m2(3, aVar), o8.b.i());
    }
}
