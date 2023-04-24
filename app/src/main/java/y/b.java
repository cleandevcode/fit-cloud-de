package y;

import a0.c1;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b implements a0.c1 {

    /* renamed from: a */
    public final ImageReader f30652a;

    /* renamed from: b */
    public final Object f30653b = new Object();

    /* renamed from: c */
    public boolean f30654c = true;

    public b(ImageReader imageReader) {
        this.f30652a = imageReader;
    }

    @Override // a0.c1
    public final int c() {
        int height;
        synchronized (this.f30653b) {
            height = this.f30652a.getHeight();
        }
        return height;
    }

    @Override // a0.c1
    public final void close() {
        synchronized (this.f30653b) {
            this.f30652a.close();
        }
    }

    @Override // a0.c1
    public final int f() {
        int width;
        synchronized (this.f30653b) {
            width = this.f30652a.getWidth();
        }
        return width;
    }

    @Override // a0.c1
    public androidx.camera.core.j g() {
        Image image;
        synchronized (this.f30653b) {
            try {
                image = this.f30652a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if ("ImageReaderContext is not initialized".equals(e10.getMessage())) {
                    image = null;
                } else {
                    throw e10;
                }
            }
            if (image == null) {
                return null;
            }
            return new androidx.camera.core.a(image);
        }
    }

    @Override // a0.c1
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f30653b) {
            surface = this.f30652a.getSurface();
        }
        return surface;
    }

    @Override // a0.c1
    public final int h() {
        int imageFormat;
        synchronized (this.f30653b) {
            imageFormat = this.f30652a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // a0.c1
    public final void i() {
        synchronized (this.f30653b) {
            this.f30654c = true;
            this.f30652a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // a0.c1
    public final void j(final c1.a aVar, final Executor executor) {
        synchronized (this.f30653b) {
            this.f30654c = false;
            this.f30652a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: y.a
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    b bVar = b.this;
                    Executor executor2 = executor;
                    c1.a aVar2 = aVar;
                    synchronized (bVar.f30653b) {
                        if (!bVar.f30654c) {
                            executor2.execute(new s.q(bVar, aVar2, 3));
                        }
                    }
                }
            }, b0.o.a());
        }
    }

    @Override // a0.c1
    public final int k() {
        int maxImages;
        synchronized (this.f30653b) {
            maxImages = this.f30652a.getMaxImages();
        }
        return maxImages;
    }

    @Override // a0.c1
    public androidx.camera.core.j l() {
        Image image;
        synchronized (this.f30653b) {
            try {
                image = this.f30652a.acquireNextImage();
            } catch (RuntimeException e10) {
                if ("ImageReaderContext is not initialized".equals(e10.getMessage())) {
                    image = null;
                } else {
                    throw e10;
                }
            }
            if (image == null) {
                return null;
            }
            return new androidx.camera.core.a(image);
        }
    }
}
