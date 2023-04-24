package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.s;
import j0.h;
import y.u0;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a */
    public Size f1886a;

    /* renamed from: b */
    public FrameLayout f1887b;

    /* renamed from: c */
    public final b f1888c;

    /* renamed from: d */
    public boolean f1889d = false;

    /* loaded from: classes.dex */
    public interface a {
    }

    public c(PreviewView previewView, b bVar) {
        this.f1887b = previewView;
        this.f1888c = bVar;
    }

    public abstract View a();

    public abstract Bitmap b();

    public abstract void c();

    public abstract void d();

    public abstract void e(s sVar, h hVar);

    public final void f() {
        View a10 = a();
        if (a10 == null || !this.f1889d) {
            return;
        }
        b bVar = this.f1888c;
        Size size = new Size(this.f1887b.getWidth(), this.f1887b.getHeight());
        int layoutDirection = this.f1887b.getLayoutDirection();
        bVar.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            u0.h("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
        } else if (bVar.f()) {
            if (a10 instanceof TextureView) {
                ((TextureView) a10).setTransform(bVar.d());
            } else {
                Display display = a10.getDisplay();
                if (display != null && display.getRotation() != bVar.f1883d) {
                    u0.b("PreviewTransform", "Non-display rotation not supported with SurfaceView / PERFORMANCE mode.");
                }
            }
            RectF e10 = bVar.e(layoutDirection, size);
            a10.setPivotX(0.0f);
            a10.setPivotY(0.0f);
            a10.setScaleX(e10.width() / bVar.f1880a.getWidth());
            a10.setScaleY(e10.height() / bVar.f1880a.getHeight());
            a10.setTranslationX(e10.left - a10.getLeft());
            a10.setTranslationY(e10.top - a10.getTop());
        }
    }

    public abstract na.a<Void> g();
}
