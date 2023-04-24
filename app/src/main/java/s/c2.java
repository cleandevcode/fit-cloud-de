package s;

import a0.l0;
import a0.u1;
import android.graphics.SurfaceTexture;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.t;
import java.util.Set;

/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a */
    public a0.d1 f25922a;

    /* renamed from: b */
    public final a0.u1 f25923b;

    /* renamed from: c */
    public final b f25924c;

    /* loaded from: classes.dex */
    public class a implements d0.c<Void> {

        /* renamed from: a */
        public final /* synthetic */ Surface f25925a;

        /* renamed from: b */
        public final /* synthetic */ SurfaceTexture f25926b;

        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f25925a = surface;
            this.f25926b = surfaceTexture;
        }

        @Override // d0.c
        public final void onFailure(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }

        @Override // d0.c
        public final void onSuccess(Void r12) {
            this.f25925a.release();
            this.f25926b.release();
        }
    }

    /* loaded from: classes.dex */
    public static class b implements a0.h2<androidx.camera.core.t> {

        /* renamed from: y */
        public final a0.j1 f25927y;

        public b() {
            a0.j1 B = a0.j1.B();
            B.E(a0.h2.f99n, new y0());
            this.f25927y = B;
        }

        @Override // a0.t1, a0.l0
        public final l0.b a(l0.a aVar) {
            return ((a0.n1) b()).a(aVar);
        }

        @Override // a0.t1
        public final a0.l0 b() {
            return this.f25927y;
        }

        @Override // a0.t1, a0.l0
        public final Object c(l0.a aVar) {
            return ((a0.n1) b()).c(aVar);
        }

        @Override // a0.t1, a0.l0
        public final Set d() {
            return ((a0.n1) b()).d();
        }

        @Override // a0.t1, a0.l0
        public final Object e(l0.a aVar, Object obj) {
            return ((a0.n1) b()).e(aVar, obj);
        }

        @Override // e0.k
        public final t.a f() {
            return (t.a) e(e0.k.f13309x, null);
        }

        @Override // a0.y0
        public final int h() {
            return ((Integer) c(a0.y0.f210d)).intValue();
        }

        @Override // a0.h2
        public final Range i() {
            return (Range) e(a0.h2.f103r, null);
        }

        @Override // a0.h2
        public final a0.u1 j() {
            return (a0.u1) e(a0.h2.f97l, null);
        }

        @Override // a0.h2
        public final /* synthetic */ int k() {
            return a0.g2.a(this);
        }

        @Override // a0.h2
        public final u1.d l() {
            return (u1.d) e(a0.h2.f99n, null);
        }

        @Override // a0.l0
        public final void m(x.d dVar) {
            this.f25927y.m(dVar);
        }

        @Override // e0.i
        public final /* synthetic */ String n(String str) {
            return e0.h.a(this, str);
        }

        @Override // a0.l0
        public final Object p(l0.a aVar, l0.b bVar) {
            return ((a0.n1) b()).p(aVar, bVar);
        }

        @Override // a0.h2
        public final y.p r() {
            return (y.p) e(a0.h2.f102q, null);
        }

        @Override // a0.l0
        public final Set u(l0.a aVar) {
            return ((a0.n1) b()).u(aVar);
        }

        @Override // a0.h2
        public final /* synthetic */ boolean w() {
            return a0.g2.b(this);
        }

        @Override // a0.l0
        public final boolean z(l0.a aVar) {
            return this.f25927y.z(aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e0, code lost:
        r1 = (android.util.Size) r1.get(0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c2(t.t r18, s.t1 r19) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.c2.<init>(t.t, s.t1):void");
    }
}
