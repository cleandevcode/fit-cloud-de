package j5;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract class f<Z> extends i<ImageView, Z> {

    /* renamed from: d */
    public Animatable f17497d;

    public f(ImageView imageView) {
        super(imageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j5.h
    public final void c(Object obj) {
        i(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f17497d = animatable;
            animatable.start();
            return;
        }
        this.f17497d = null;
    }

    @Override // j5.h
    public final void e(Drawable drawable) {
        i(null);
        this.f17497d = null;
        ((ImageView) this.f17499a).setImageDrawable(drawable);
    }

    @Override // j5.h
    public final void f(Drawable drawable) {
        i(null);
        this.f17497d = null;
        ((ImageView) this.f17499a).setImageDrawable(drawable);
    }

    @Override // j5.i, j5.h
    public final void h(Drawable drawable) {
        super.h(drawable);
        Animatable animatable = this.f17497d;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        this.f17497d = null;
        ((ImageView) this.f17499a).setImageDrawable(drawable);
    }

    public abstract void i(Z z10);

    @Override // com.bumptech.glide.manager.j
    public final void onStart() {
        Animatable animatable = this.f17497d;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.manager.j
    public final void onStop() {
        Animatable animatable = this.f17497d;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
