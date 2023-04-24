package androidx.camera.core;

import a0.d2;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.j;
import java.nio.ByteBuffer;
import y.o0;
import y.s0;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a */
    public final Image f1612a;

    /* renamed from: b */
    public final C0021a[] f1613b;

    /* renamed from: c */
    public final y.f f1614c;

    /* renamed from: androidx.camera.core.a$a */
    /* loaded from: classes.dex */
    public static final class C0021a implements j.a {

        /* renamed from: a */
        public final Image.Plane f1615a;

        public C0021a(Image.Plane plane) {
            this.f1615a = plane;
        }

        public final ByteBuffer a() {
            return this.f1615a.getBuffer();
        }

        public final int b() {
            return this.f1615a.getPixelStride();
        }

        public final int c() {
            return this.f1615a.getRowStride();
        }
    }

    public a(Image image) {
        this.f1612a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f1613b = new C0021a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f1613b[i10] = new C0021a(planes[i10]);
            }
        } else {
            this.f1613b = new C0021a[0];
        }
        this.f1614c = s0.e(d2.f45b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.j
    public final int c() {
        return this.f1612a.getHeight();
    }

    @Override // androidx.camera.core.j, java.lang.AutoCloseable
    public final void close() {
        this.f1612a.close();
    }

    @Override // androidx.camera.core.j
    public final o0 d0() {
        return this.f1614c;
    }

    @Override // androidx.camera.core.j
    public final int f() {
        return this.f1612a.getWidth();
    }

    @Override // androidx.camera.core.j
    public final int getFormat() {
        return this.f1612a.getFormat();
    }

    @Override // androidx.camera.core.j
    public final j.a[] l() {
        return this.f1613b;
    }

    @Override // androidx.camera.core.j
    public final Image s0() {
        return this.f1612a;
    }

    @Override // androidx.camera.core.j
    public final Rect z() {
        return this.f1612a.getCropRect();
    }
}
