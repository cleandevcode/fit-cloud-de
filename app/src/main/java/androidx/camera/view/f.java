package androidx.camera.view;

import a0.m0;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.s;
import androidx.camera.view.c;
import j0.h;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p0.c;
import s.n2;
import s.q;
import y.j1;
import y.u0;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: e */
    public TextureView f1901e;

    /* renamed from: f */
    public SurfaceTexture f1902f;

    /* renamed from: g */
    public c.d f1903g;

    /* renamed from: h */
    public s f1904h;

    /* renamed from: i */
    public boolean f1905i;

    /* renamed from: j */
    public SurfaceTexture f1906j;

    /* renamed from: k */
    public AtomicReference<c.a<Void>> f1907k;

    /* renamed from: l */
    public c.a f1908l;

    public f(PreviewView previewView, b bVar) {
        super(previewView, bVar);
        this.f1905i = false;
        this.f1907k = new AtomicReference<>();
    }

    @Override // androidx.camera.view.c
    public final View a() {
        return this.f1901e;
    }

    @Override // androidx.camera.view.c
    public final Bitmap b() {
        TextureView textureView = this.f1901e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f1901e.getBitmap();
    }

    @Override // androidx.camera.view.c
    public final void c() {
        if (!this.f1905i || this.f1906j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f1901e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f1906j;
        if (surfaceTexture != surfaceTexture2) {
            this.f1901e.setSurfaceTexture(surfaceTexture2);
            this.f1906j = null;
            this.f1905i = false;
        }
    }

    @Override // androidx.camera.view.c
    public final void d() {
        this.f1905i = true;
    }

    @Override // androidx.camera.view.c
    public final void e(s sVar, h hVar) {
        this.f1886a = sVar.f1787b;
        this.f1908l = hVar;
        this.f1887b.getClass();
        this.f1886a.getClass();
        TextureView textureView = new TextureView(this.f1887b.getContext());
        this.f1901e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f1886a.getWidth(), this.f1886a.getHeight()));
        this.f1901e.setSurfaceTextureListener(new e(this));
        this.f1887b.removeAllViews();
        this.f1887b.addView(this.f1901e);
        s sVar2 = this.f1904h;
        if (sVar2 != null) {
            sVar2.f1791f.b(new m0.b());
        }
        this.f1904h = sVar;
        Executor c10 = y0.a.c(this.f1901e.getContext());
        q qVar = new q(this, sVar, 10);
        p0.d<Void> dVar = sVar.f1793h.f23755c;
        if (dVar != null) {
            dVar.a(qVar, c10);
        }
        h();
    }

    @Override // androidx.camera.view.c
    public final na.a<Void> g() {
        return p0.c.a(new n2(2, this));
    }

    public final void h() {
        SurfaceTexture surfaceTexture;
        Size size = this.f1886a;
        if (size != null && (surfaceTexture = this.f1902f) != null && this.f1904h != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f1886a.getHeight());
            final Surface surface = new Surface(this.f1902f);
            final s sVar = this.f1904h;
            final c.d a10 = p0.c.a(new j1(this, surface, 2));
            this.f1903g = a10;
            a10.f23758b.a(new Runnable() { // from class: k0.k
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.view.f fVar = androidx.camera.view.f.this;
                    Surface surface2 = surface;
                    na.a aVar = a10;
                    s sVar2 = sVar;
                    fVar.getClass();
                    u0.a("TextureViewImpl", "Safe to release surface.");
                    c.a aVar2 = fVar.f1908l;
                    if (aVar2 != null) {
                        ((j0.h) aVar2).b();
                        fVar.f1908l = null;
                    }
                    surface2.release();
                    if (fVar.f1903g == aVar) {
                        fVar.f1903g = null;
                    }
                    if (fVar.f1904h == sVar2) {
                        fVar.f1904h = null;
                    }
                }
            }, y0.a.c(this.f1901e.getContext()));
            this.f1889d = true;
            f();
        }
    }
}
