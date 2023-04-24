package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.R;
import o1.g;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    public final ImageView f1478a;

    /* renamed from: b */
    public j2 f1479b;

    /* renamed from: c */
    public j2 f1480c;

    /* renamed from: d */
    public int f1481d = 0;

    public p(ImageView imageView) {
        this.f1478a = imageView;
    }

    public final void a() {
        boolean z10;
        Drawable drawable = this.f1478a.getDrawable();
        if (drawable != null) {
            k1.a(drawable);
        }
        if (drawable != null) {
            int i10 = Build.VERSION.SDK_INT;
            boolean z11 = true;
            if (i10 <= 21 && i10 == 21) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f1480c == null) {
                    this.f1480c = new j2();
                }
                j2 j2Var = this.f1480c;
                j2Var.f1380a = null;
                j2Var.f1383d = false;
                j2Var.f1381b = null;
                j2Var.f1382c = false;
                ColorStateList a10 = g.a.a(this.f1478a);
                if (a10 != null) {
                    j2Var.f1383d = true;
                    j2Var.f1380a = a10;
                }
                PorterDuff.Mode b10 = g.a.b(this.f1478a);
                if (b10 != null) {
                    j2Var.f1382c = true;
                    j2Var.f1381b = b10;
                }
                if (!j2Var.f1383d && !j2Var.f1382c) {
                    z11 = false;
                } else {
                    k.e(drawable, j2Var, this.f1478a.getDrawableState());
                }
                if (z11) {
                    return;
                }
            }
            j2 j2Var2 = this.f1479b;
            if (j2Var2 != null) {
                k.e(drawable, j2Var2, this.f1478a.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i10) {
        Drawable drawable;
        int i11;
        Context context = this.f1478a.getContext();
        int[] iArr = R.styleable.AppCompatImageView;
        l2 m10 = l2.m(context, attributeSet, iArr, i10);
        ImageView imageView = this.f1478a;
        k1.o0.o(imageView, imageView.getContext(), iArr, attributeSet, m10.f1415b, i10);
        try {
            Drawable drawable2 = this.f1478a.getDrawable();
            if (drawable2 == null && (i11 = m10.i(R.styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable2 = g.a.b(this.f1478a.getContext(), i11)) != null) {
                this.f1478a.setImageDrawable(drawable2);
            }
            if (drawable2 != null) {
                k1.a(drawable2);
            }
            int i12 = R.styleable.AppCompatImageView_tint;
            if (m10.l(i12)) {
                o1.g.a(this.f1478a, m10.b(i12));
            }
            int i13 = R.styleable.AppCompatImageView_tintMode;
            if (m10.l(i13)) {
                ImageView imageView2 = this.f1478a;
                PorterDuff.Mode d10 = k1.d(m10.h(i13, -1), null);
                int i14 = Build.VERSION.SDK_INT;
                g.a.d(imageView2, d10);
                if (i14 == 21 && (drawable = imageView2.getDrawable()) != null && g.a.a(imageView2) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable);
                }
            }
        } finally {
            m10.n();
        }
    }

    public final void c(int i10) {
        if (i10 != 0) {
            Drawable b10 = g.a.b(this.f1478a.getContext(), i10);
            if (b10 != null) {
                k1.a(b10);
            }
            this.f1478a.setImageDrawable(b10);
        } else {
            this.f1478a.setImageDrawable(null);
        }
        a();
    }
}
