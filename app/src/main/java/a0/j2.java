package a0;

import a0.l0;
import a0.u1;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.t;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class j2 implements h2<androidx.camera.core.u>, a1, e0.j {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;

    /* renamed from: z */
    public static final d f115z;

    /* renamed from: y */
    public final n1 f116y;

    static {
        Class cls = Integer.TYPE;
        f115z = l0.a.a("camerax.core.videoCapture.recordingFrameRate", cls);
        A = l0.a.a("camerax.core.videoCapture.bitRate", cls);
        B = l0.a.a("camerax.core.videoCapture.intraFrameInterval", cls);
        C = l0.a.a("camerax.core.videoCapture.audioBitRate", cls);
        D = l0.a.a("camerax.core.videoCapture.audioSampleRate", cls);
        E = l0.a.a("camerax.core.videoCapture.audioChannelCount", cls);
        F = l0.a.a("camerax.core.videoCapture.audioMinBufferSize", cls);
    }

    public j2(n1 n1Var) {
        this.f116y = n1Var;
    }

    @Override // a0.t1, a0.l0
    public final l0.b a(l0.a aVar) {
        return ((n1) b()).a(aVar);
    }

    @Override // a0.t1
    public final l0 b() {
        return this.f116y;
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
        return 34;
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
