package androidx.camera.view;

import a0.m0;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.s;
import androidx.camera.view.c;
import androidx.camera.view.d;
import j0.h;
import java.util.concurrent.Executor;
import s.g;
import s.m;
import y.u0;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: e */
    public SurfaceView f1890e;

    /* renamed from: f */
    public final b f1891f;

    /* renamed from: g */
    public c.a f1892g;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* loaded from: classes.dex */
    public class b implements SurfaceHolder.Callback {

        /* renamed from: a */
        public Size f1893a;

        /* renamed from: b */
        public s f1894b;

        /* renamed from: c */
        public Size f1895c;

        /* renamed from: d */
        public boolean f1896d = false;

        public b() {
            d.this = r1;
        }

        public final void a() {
            if (this.f1894b != null) {
                StringBuilder a10 = android.support.v4.media.d.a("Request canceled: ");
                a10.append(this.f1894b);
                u0.a("SurfaceViewImpl", a10.toString());
                this.f1894b.f1791f.b(new m0.b());
            }
        }

        public final boolean b() {
            boolean z10;
            Size size;
            Surface surface = d.this.f1890e.getHolder().getSurface();
            if (!this.f1896d && this.f1894b != null && (size = this.f1893a) != null && size.equals(this.f1895c)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            u0.a("SurfaceViewImpl", "Surface set on Preview.");
            this.f1894b.a(surface, y0.a.c(d.this.f1890e.getContext()), new j1.a() { // from class: k0.j
                @Override // j1.a
                public final void accept(Object obj) {
                    d.b bVar = d.b.this;
                    s.c cVar = (s.c) obj;
                    bVar.getClass();
                    u0.a("SurfaceViewImpl", "Safe to release surface.");
                    androidx.camera.view.d dVar = androidx.camera.view.d.this;
                    c.a aVar = dVar.f1892g;
                    if (aVar != null) {
                        ((j0.h) aVar).b();
                        dVar.f1892g = null;
                    }
                }
            });
            this.f1896d = true;
            d dVar = d.this;
            dVar.f1889d = true;
            dVar.f();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            u0.a("SurfaceViewImpl", "Surface changed. Size: " + i11 + "x" + i12);
            this.f1895c = new Size(i11, i12);
            b();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            u0.a("SurfaceViewImpl", "Surface created.");
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            u0.a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f1896d) {
                if (this.f1894b != null) {
                    StringBuilder a10 = android.support.v4.media.d.a("Surface invalidated ");
                    a10.append(this.f1894b);
                    u0.a("SurfaceViewImpl", a10.toString());
                    this.f1894b.f1794i.a();
                }
            } else {
                a();
            }
            this.f1896d = false;
            this.f1894b = null;
            this.f1895c = null;
            this.f1893a = null;
        }
    }

    public d(PreviewView previewView, androidx.camera.view.b bVar) {
        super(previewView, bVar);
        this.f1891f = new b();
    }

    @Override // androidx.camera.view.c
    public final View a() {
        return this.f1890e;
    }

    @Override // androidx.camera.view.c
    public final Bitmap b() {
        SurfaceView surfaceView = this.f1890e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f1890e.getHolder().getSurface().isValid()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.f1890e.getWidth(), this.f1890e.getHeight(), Bitmap.Config.ARGB_8888);
        SurfaceView surfaceView2 = this.f1890e;
        a.a(surfaceView2, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: k0.i
            public final void onPixelCopyFinished(int i10) {
                if (i10 == 0) {
                    u0.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                    return;
                }
                u0.b("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i10);
            }
        }, surfaceView2.getHandler());
        return createBitmap;
    }

    @Override // androidx.camera.view.c
    public final void c() {
    }

    @Override // androidx.camera.view.c
    public final void d() {
    }

    @Override // androidx.camera.view.c
    public final void e(s sVar, h hVar) {
        this.f1886a = sVar.f1787b;
        this.f1892g = hVar;
        this.f1887b.getClass();
        this.f1886a.getClass();
        SurfaceView surfaceView = new SurfaceView(this.f1887b.getContext());
        this.f1890e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f1886a.getWidth(), this.f1886a.getHeight()));
        this.f1887b.removeAllViews();
        this.f1887b.addView(this.f1890e);
        this.f1890e.getHolder().addCallback(this.f1891f);
        Executor c10 = y0.a.c(this.f1890e.getContext());
        m mVar = new m(7, this);
        p0.d<Void> dVar = sVar.f1793h.f23755c;
        if (dVar != null) {
            dVar.a(mVar, c10);
        }
        this.f1890e.post(new g(this, sVar, 5));
    }

    @Override // androidx.camera.view.c
    public final na.a<Void> g() {
        return d0.f.e(null);
    }
}
