package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R;
import b1.a;
import k1.o0;

/* loaded from: classes.dex */
public final class q0 extends k0 {

    /* renamed from: d */
    public final SeekBar f1488d;

    /* renamed from: e */
    public Drawable f1489e;

    /* renamed from: f */
    public ColorStateList f1490f;

    /* renamed from: g */
    public PorterDuff.Mode f1491g;

    /* renamed from: h */
    public boolean f1492h;

    /* renamed from: i */
    public boolean f1493i;

    public q0(SeekBar seekBar) {
        super(seekBar);
        this.f1490f = null;
        this.f1491g = null;
        this.f1492h = false;
        this.f1493i = false;
        this.f1488d = seekBar;
    }

    @Override // androidx.appcompat.widget.k0
    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, i10);
        Context context = this.f1488d.getContext();
        int[] iArr = R.styleable.AppCompatSeekBar;
        l2 m10 = l2.m(context, attributeSet, iArr, i10);
        SeekBar seekBar = this.f1488d;
        k1.o0.o(seekBar, seekBar.getContext(), iArr, attributeSet, m10.f1415b, i10);
        Drawable f10 = m10.f(R.styleable.AppCompatSeekBar_android_thumb);
        if (f10 != null) {
            this.f1488d.setThumb(f10);
        }
        Drawable e10 = m10.e(R.styleable.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f1489e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1489e = e10;
        if (e10 != null) {
            e10.setCallback(this.f1488d);
            b1.a.c(e10, o0.e.d(this.f1488d));
            if (e10.isStateful()) {
                e10.setState(this.f1488d.getDrawableState());
            }
            c();
        }
        this.f1488d.invalidate();
        int i11 = R.styleable.AppCompatSeekBar_tickMarkTintMode;
        if (m10.l(i11)) {
            this.f1491g = k1.d(m10.h(i11, -1), this.f1491g);
            this.f1493i = true;
        }
        int i12 = R.styleable.AppCompatSeekBar_tickMarkTint;
        if (m10.l(i12)) {
            this.f1490f = m10.b(i12);
            this.f1492h = true;
        }
        m10.n();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1489e;
        if (drawable != null) {
            if (this.f1492h || this.f1493i) {
                Drawable g10 = b1.a.g(drawable.mutate());
                this.f1489e = g10;
                if (this.f1492h) {
                    a.b.h(g10, this.f1490f);
                }
                if (this.f1493i) {
                    a.b.i(this.f1489e, this.f1491g);
                }
                if (this.f1489e.isStateful()) {
                    this.f1489e.setState(this.f1488d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f1489e != null) {
            int max = this.f1488d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1489e.getIntrinsicWidth();
                int intrinsicHeight = this.f1489e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1489e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1488d.getWidth() - this.f1488d.getPaddingLeft()) - this.f1488d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1488d.getPaddingLeft(), this.f1488d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1489e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
