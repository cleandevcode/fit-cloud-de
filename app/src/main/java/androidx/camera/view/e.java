package androidx.camera.view;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.camera.core.s;
import p0.c;
import s.h1;
import y.u0;

/* loaded from: classes.dex */
public final class e implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    public final /* synthetic */ f f1898a;

    /* loaded from: classes.dex */
    public class a implements d0.c<s.c> {

        /* renamed from: a */
        public final /* synthetic */ SurfaceTexture f1899a;

        public a(SurfaceTexture surfaceTexture) {
            e.this = r1;
            this.f1899a = surfaceTexture;
        }

        @Override // d0.c
        public final void onFailure(Throwable th2) {
            throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
        }

        @Override // d0.c
        public final void onSuccess(s.c cVar) {
            h1.k("Unexpected result from SurfaceRequest. Surface was provided twice.", cVar.a() != 3);
            u0.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
            this.f1899a.release();
            f fVar = e.this.f1898a;
            if (fVar.f1906j != null) {
                fVar.f1906j = null;
            }
        }
    }

    public e(f fVar) {
        this.f1898a = fVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        u0.a("TextureViewImpl", "SurfaceTexture available. Size: " + i10 + "x" + i11);
        f fVar = this.f1898a;
        fVar.f1902f = surfaceTexture;
        if (fVar.f1903g != null) {
            fVar.f1904h.getClass();
            u0.a("TextureViewImpl", "Surface invalidated " + this.f1898a.f1904h);
            this.f1898a.f1904h.f1794i.a();
            return;
        }
        fVar.h();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f fVar = this.f1898a;
        fVar.f1902f = null;
        c.d dVar = fVar.f1903g;
        if (dVar == null) {
            u0.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }
        d0.f.a(dVar, new a(surfaceTexture), y0.a.c(fVar.f1901e.getContext()));
        this.f1898a.f1906j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        u0.a("TextureViewImpl", "SurfaceTexture size changed: " + i10 + "x" + i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        c.a<Void> andSet = this.f1898a.f1907k.getAndSet(null);
        if (andSet != null) {
            andSet.a(null);
        }
        this.f1898a.getClass();
    }
}
