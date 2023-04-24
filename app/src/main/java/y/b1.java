package y;

import a0.j0;
import a0.m0;
import a0.x1;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.l;

/* loaded from: classes.dex */
public final class b1 extends a0.m0 {

    /* renamed from: m */
    public final Object f30659m;

    /* renamed from: n */
    public boolean f30660n;

    /* renamed from: o */
    public final androidx.camera.core.l f30661o;

    /* renamed from: p */
    public final Surface f30662p;

    /* renamed from: q */
    public final a0.j0 f30663q;

    /* renamed from: r */
    public final a0.i0 f30664r;

    /* renamed from: s */
    public final l.a f30665s;

    /* renamed from: t */
    public final a0.m0 f30666t;

    /* renamed from: u */
    public String f30667u;

    public b1(int i10, int i11, int i12, Handler handler, j0.a aVar, a0.i0 i0Var, k1 k1Var, String str) {
        super(i12, new Size(i10, i11));
        this.f30659m = new Object();
        x xVar = new x(1, this);
        this.f30660n = false;
        Size size = new Size(i10, i11);
        c0.b bVar = new c0.b(handler);
        androidx.camera.core.l lVar = new androidx.camera.core.l(i10, i11, i12, 2);
        this.f30661o = lVar;
        lVar.j(xVar, bVar);
        this.f30662p = lVar.getSurface();
        this.f30665s = lVar.f1721b;
        this.f30664r = i0Var;
        i0Var.c(size);
        this.f30663q = aVar;
        this.f30666t = k1Var;
        this.f30667u = str;
        d0.f.a(k1Var.c(), new a1(this), o8.b.i());
        d().a(new s.m(3, this), o8.b.i());
    }

    @Override // a0.m0
    public final na.a<Surface> g() {
        d0.d b10 = d0.d.b(this.f30666t.c());
        s.r0 r0Var = new s.r0(5, this);
        c0.a i10 = o8.b.i();
        b10.getClass();
        return d0.f.h(b10, r0Var, i10);
    }

    public final void h(a0.c1 c1Var) {
        if (this.f30660n) {
            return;
        }
        androidx.camera.core.j jVar = null;
        try {
            jVar = c1Var.l();
        } catch (IllegalStateException e10) {
            u0.c("ProcessingSurfaceTextur", "Failed to acquire next image.", e10);
        }
        if (jVar == null) {
            return;
        }
        o0 d02 = jVar.d0();
        if (d02 == null) {
            jVar.close();
            return;
        }
        Integer num = (Integer) d02.b().a(this.f30667u);
        if (num == null) {
            jVar.close();
            return;
        }
        this.f30663q.getId();
        if (num.intValue() != 0) {
            u0.h("ProcessingSurfaceTextur", "ImageProxyBundle does not contain this id: " + num);
            jVar.close();
            return;
        }
        x1 x1Var = new x1(jVar, this.f30667u);
        try {
            e();
            this.f30664r.d(x1Var);
            ((androidx.camera.core.j) x1Var.f209b).close();
            b();
        } catch (m0.a unused) {
            u0.a("ProcessingSurfaceTextur", "The ProcessingSurface has been closed. Don't process the incoming image.");
            ((androidx.camera.core.j) x1Var.f209b).close();
        }
    }
}
