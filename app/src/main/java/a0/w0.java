package a0;

import a0.h0;
import a0.l0;
import a0.u1;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.t;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class w0 implements h2<androidx.camera.core.h>, a1, e0.g {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final d G;
    public static final d H;
    public static final d I;

    /* renamed from: z */
    public static final d f205z;

    /* renamed from: y */
    public final n1 f206y;

    static {
        Class cls = Integer.TYPE;
        f205z = l0.a.a("camerax.core.imageCapture.captureMode", cls);
        A = l0.a.a("camerax.core.imageCapture.flashMode", cls);
        B = l0.a.a("camerax.core.imageCapture.captureBundle", g0.class);
        C = l0.a.a("camerax.core.imageCapture.captureProcessor", i0.class);
        D = l0.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        E = l0.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        F = l0.a.a("camerax.core.imageCapture.imageReaderProxyProvider", y.r0.class);
        G = l0.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        H = l0.a.a("camerax.core.imageCapture.flashType", cls);
        I = l0.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
    }

    public w0(n1 n1Var) {
        this.f206y = n1Var;
    }

    public final h0.b A() {
        return (h0.b) e(h2.f100o, null);
    }

    public final h0 B() {
        return (h0) e(h2.f98m, null);
    }

    @Override // a0.t1, a0.l0
    public final l0.b a(l0.a aVar) {
        return ((n1) b()).a(aVar);
    }

    @Override // a0.t1
    public final l0 b() {
        return this.f206y;
    }

    @Override // a0.t1, a0.l0
    public final Object c(l0.a aVar) {
        return ((n1) b()).c(aVar);
    }

    @Override // a0.t1, a0.l0
    public final Set d() {
        return ((n1) b()).d();
    }

    @Override // a0.t1, a0.l0
    public final Object e(l0.a aVar, Object obj) {
        return ((n1) b()).e(aVar, obj);
    }

    @Override // e0.k
    public final t.a f() {
        return (t.a) e(e0.k.f13309x, null);
    }

    @Override // a0.a1
    public final List g() {
        return (List) e(a1.f15k, null);
    }

    @Override // a0.y0
    public final int h() {
        return ((Integer) ((n1) b()).c(y0.f210d)).intValue();
    }

    @Override // a0.h2
    public final Range i() {
        return (Range) e(h2.f103r, null);
    }

    @Override // a0.h2
    public final u1 j() {
        return (u1) e(h2.f97l, null);
    }

    @Override // a0.h2
    public final /* synthetic */ int k() {
        return g2.a(this);
    }

    @Override // a0.h2
    public final u1.d l() {
        return (u1.d) e(h2.f99n, null);
    }

    @Override // a0.l0
    public final /* synthetic */ void m(x.d dVar) {
        s1.b(this, dVar);
    }

    @Override // e0.i
    public final /* synthetic */ String n(String str) {
        return e0.h.a(this, str);
    }

    @Override // a0.a1
    public final Size o() {
        return (Size) e(a1.f13i, null);
    }

    @Override // a0.l0
    public final Object p(l0.a aVar, l0.b bVar) {
        return ((n1) b()).p(aVar, bVar);
    }

    @Override // a0.a1
    public final Size q() {
        return (Size) e(a1.f12h, null);
    }

    @Override // a0.h2
    public final y.p r() {
        return (y.p) e(h2.f102q, null);
    }

    @Override // a0.a1
    public final boolean s() {
        return z(a1.f9e);
    }

    @Override // a0.a1
    public final /* synthetic */ int t() {
        return z0.b(this);
    }

    @Override // a0.l0
    public final Set u(l0.a aVar) {
        return ((n1) b()).u(aVar);
    }

    @Override // a0.a1
    public final Size v() {
        return (Size) e(a1.f14j, null);
    }

    @Override // a0.h2
    public final /* synthetic */ boolean w() {
        return g2.b(this);
    }

    @Override // a0.a1
    public final /* synthetic */ int x(int i10) {
        return z0.c(i10, this);
    }

    @Override // a0.a1
    public final /* synthetic */ int y() {
        return z0.a(this);
    }

    @Override // a0.l0
    public final /* synthetic */ boolean z(l0.a aVar) {
        return s1.a(this, (d) aVar);
    }
}
