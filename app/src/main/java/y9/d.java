package y9;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ga.f;
import ga.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends com.google.android.material.floatingactionbutton.d {

    /* loaded from: classes.dex */
    public static class a extends f {
        public a(i iVar) {
            super(iVar);
        }

        @Override // ga.f, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final float e() {
        return this.f6596v.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void f(Rect rect) {
        boolean z10;
        if (FloatingActionButton.this.f6555l) {
            super.f(rect);
            return;
        }
        int i10 = 0;
        if (this.f6580f && this.f6596v.getSizeDimension() < this.f6585k) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            i10 = (this.f6585k - this.f6596v.getSizeDimension()) / 2;
        }
        rect.set(i10, i10, i10, i10);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        f s10 = s();
        this.f6576b = s10;
        s10.setTintList(colorStateList);
        if (mode != null) {
            this.f6576b.setTintMode(mode);
        }
        this.f6576b.i(this.f6596v.getContext());
        if (i10 > 0) {
            Context context = this.f6596v.getContext();
            i iVar = this.f6575a;
            iVar.getClass();
            y9.a aVar = new y9.a(iVar);
            int b10 = y0.a.b(context, R.color.design_fab_stroke_top_outer_color);
            int b11 = y0.a.b(context, R.color.design_fab_stroke_top_inner_color);
            int b12 = y0.a.b(context, R.color.design_fab_stroke_end_inner_color);
            int b13 = y0.a.b(context, R.color.design_fab_stroke_end_outer_color);
            aVar.f31236i = b10;
            aVar.f31237j = b11;
            aVar.f31238k = b12;
            aVar.f31239l = b13;
            float f10 = i10;
            if (aVar.f31235h != f10) {
                aVar.f31235h = f10;
                aVar.f31229b.setStrokeWidth(f10 * 1.3333f);
                aVar.f31241n = true;
                aVar.invalidateSelf();
            }
            if (colorStateList != null) {
                aVar.f31240m = colorStateList.getColorForState(aVar.getState(), aVar.f31240m);
            }
            aVar.f31243p = colorStateList;
            aVar.f31241n = true;
            aVar.invalidateSelf();
            this.f6578d = aVar;
            y9.a aVar2 = this.f6578d;
            aVar2.getClass();
            f fVar = this.f6576b;
            fVar.getClass();
            drawable = new LayerDrawable(new Drawable[]{aVar2, fVar});
        } else {
            this.f6578d = null;
            drawable = this.f6576b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(ea.b.c(colorStateList2), drawable, null);
        this.f6577c = rippleDrawable;
        this.f6579e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void h() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void i() {
        q();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void j(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f10 = 0.0f;
            if (this.f6596v.isEnabled()) {
                this.f6596v.setElevation(this.f6582h);
                if (this.f6596v.isPressed()) {
                    floatingActionButton = this.f6596v;
                    f10 = this.f6584j;
                } else if (this.f6596v.isFocused() || this.f6596v.isHovered()) {
                    floatingActionButton = this.f6596v;
                    f10 = this.f6583i;
                }
                floatingActionButton.setTranslationZ(f10);
            }
            this.f6596v.setElevation(0.0f);
            floatingActionButton = this.f6596v;
            floatingActionButton.setTranslationZ(f10);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void k(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21) {
            this.f6596v.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.D, r(f10, f12));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.E, r(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.F, r(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.G, r(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f6596v, "elevation", f10).setDuration(0L));
            if (i10 >= 22 && i10 <= 24) {
                FloatingActionButton floatingActionButton = this.f6596v;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f6596v, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.d.C);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.H, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.I, r(0.0f, 0.0f));
            this.f6596v.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.f6577c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ea.b.c(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final boolean o() {
        boolean z10;
        if (!FloatingActionButton.this.f6555l) {
            if (this.f6580f && this.f6596v.getSizeDimension() < this.f6585k) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void p() {
    }

    public final AnimatorSet r(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f6596v, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f6596v, View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.d.C);
        return animatorSet;
    }

    public final f s() {
        i iVar = this.f6575a;
        iVar.getClass();
        return new a(iVar);
    }
}
