package j0;

import a0.b0;
import a0.m0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.s;
import java.util.concurrent.Executor;
import p0.c;
import s.e2;
import s.h1;
import s.m;
import s.p;
import y.j1;
import y.k1;

/* loaded from: classes.dex */
public final class d extends m0 {

    /* renamed from: x */
    public static final /* synthetic */ int f17232x = 0;

    /* renamed from: m */
    public final na.a<Surface> f17233m;

    /* renamed from: n */
    public c.a<Surface> f17234n;

    /* renamed from: o */
    public final Matrix f17235o;

    /* renamed from: p */
    public final Rect f17236p;

    /* renamed from: q */
    public final boolean f17237q;

    /* renamed from: r */
    public final int f17238r;

    /* renamed from: s */
    public int f17239s;

    /* renamed from: t */
    public f f17240t;

    /* renamed from: u */
    public boolean f17241u;

    /* renamed from: v */
    public boolean f17242v;

    /* renamed from: w */
    public s f17243w;

    public d(int i10, Size size, int i11, Matrix matrix, Rect rect, int i12, boolean z10) {
        super(i11, size);
        this.f17241u = false;
        this.f17242v = false;
        this.f17238r = i10;
        this.f17235o = matrix;
        this.f17236p = rect;
        this.f17239s = i12;
        this.f17237q = z10;
        this.f17233m = p0.c.a(new j1(this, size, 1));
    }

    @Override // a0.m0
    public final void a() {
        super.a();
        o8.b.p().execute(new m(5, this));
    }

    @Override // a0.m0
    public final na.a<Surface> g() {
        return this.f17233m;
    }

    public final s h(b0 b0Var) {
        s.e eVar;
        Executor executor;
        p.b.f();
        s sVar = new s(this.f131f, b0Var, true);
        try {
            i(sVar.f1794i);
            this.f17243w = sVar;
            androidx.camera.core.c cVar = new androidx.camera.core.c(this.f17236p, this.f17239s, -1);
            synchronized (sVar.f1786a) {
                sVar.f1795j = cVar;
                eVar = sVar.f1796k;
                executor = sVar.f1797l;
            }
            if (eVar != null && executor != null) {
                executor.execute(new p(eVar, cVar, 8));
            }
            return sVar;
        } catch (m0.a e10) {
            throw new AssertionError("Surface is somehow already closed", e10);
        }
    }

    public final void i(k1 k1Var) {
        p.b.f();
        na.a<Surface> c10 = k1Var.c();
        p.b.f();
        h1.k("Provider can only be linked once.", !this.f17241u);
        this.f17241u = true;
        d0.f.g(true, c10, this.f17234n, o8.b.i());
        k1Var.e();
        d().a(new e2(2, k1Var), o8.b.i());
    }
}
