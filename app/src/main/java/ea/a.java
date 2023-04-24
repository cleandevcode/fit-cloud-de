package ea;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import b1.j;
import ga.f;
import ga.i;
import ga.m;

/* loaded from: classes.dex */
public final class a extends Drawable implements m, j {

    /* renamed from: a */
    public C0238a f13507a;

    /* renamed from: ea.a$a */
    /* loaded from: classes.dex */
    public static final class C0238a extends Drawable.ConstantState {

        /* renamed from: a */
        public f f13508a;

        /* renamed from: b */
        public boolean f13509b;

        public C0238a(C0238a c0238a) {
            this.f13508a = (f) c0238a.f13508a.f15069a.newDrawable();
            this.f13509b = c0238a.f13509b;
        }

        public C0238a(f fVar) {
            this.f13508a = fVar;
            this.f13509b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new a(new C0238a(this));
        }
    }

    public a(C0238a c0238a) {
        this.f13507a = c0238a;
    }

    public a(i iVar) {
        this(new C0238a(new f(iVar)));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C0238a c0238a = this.f13507a;
        if (c0238a.f13509b) {
            c0238a.f13508a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f13507a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f13507a.f13508a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f13507a = new C0238a(this.f13507a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13507a.f13508a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f13507a.f13508a.setState(iArr)) {
            onStateChange = true;
        }
        boolean d10 = b.d(iArr);
        C0238a c0238a = this.f13507a;
        if (c0238a.f13509b != d10) {
            c0238a.f13509b = d10;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f13507a.f13508a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13507a.f13508a.setColorFilter(colorFilter);
    }

    @Override // ga.m
    public final void setShapeAppearanceModel(i iVar) {
        this.f13507a.f13508a.setShapeAppearanceModel(iVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        this.f13507a.f13508a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f13507a.f13508a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f13507a.f13508a.setTintMode(mode);
    }
}
