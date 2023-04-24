package y2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import b1.a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class b extends e implements Animatable {

    /* renamed from: b */
    public C0567b f30844b;

    /* renamed from: c */
    public Context f30845c;

    /* renamed from: d */
    public final a f30846d;

    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
            b.this = r1;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            b.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: y2.b$b */
    /* loaded from: classes.dex */
    public static class C0567b extends Drawable.ConstantState {

        /* renamed from: a */
        public f f30848a;

        /* renamed from: b */
        public AnimatorSet f30849b;

        /* renamed from: c */
        public ArrayList<Animator> f30850c;

        /* renamed from: d */
        public o0.b<Animator, String> f30851d;

        public C0567b(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f30852a;

        public c(Drawable.ConstantState constantState) {
            this.f30852a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f30852a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f30852a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.f30852a.newDrawable();
            bVar.f30855a = newDrawable;
            newDrawable.setCallback(bVar.f30846d);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.f30852a.newDrawable(resources);
            bVar.f30855a = newDrawable;
            newDrawable.setCallback(bVar.f30846d);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.f30852a.newDrawable(resources, theme);
            bVar.f30855a = newDrawable;
            newDrawable.setCallback(bVar.f30846d);
            return bVar;
        }
    }

    public b() {
        this(null);
    }

    public b(Context context) {
        a aVar = new a();
        this.f30846d = aVar;
        this.f30845c = context;
        this.f30844b = new C0567b(aVar);
    }

    @Override // y2.e, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            a.b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            return a.b.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f30844b.f30848a.draw(canvas);
        if (this.f30844b.f30849b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            return a.C0049a.a(drawable);
        }
        return this.f30844b.f30848a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f30844b.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f30844b.f30848a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f30855a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f30855a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f30855a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f30844b.f30848a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f30855a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f30844b.f30848a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f30855a;
        return drawable != null ? drawable.getOpacity() : this.f30844b.f30848a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x00a4  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.content.res.Resources.Theme r23) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.b.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            return a.C0049a.d(drawable);
        }
        return this.f30844b.f30848a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f30855a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f30844b.f30849b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f30855a;
        return drawable != null ? drawable.isStateful() : this.f30844b.f30848a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f30844b.f30848a.setBounds(rect);
        }
    }

    @Override // y2.e, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f30855a;
        return drawable != null ? drawable.setLevel(i10) : this.f30844b.f30848a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f30855a;
        return drawable != null ? drawable.setState(iArr) : this.f30844b.f30848a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f30844b.f30848a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            a.C0049a.e(drawable, z10);
        } else {
            this.f30844b.f30848a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f30844b.f30848a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            b1.a.d(drawable, i10);
        } else {
            this.f30844b.f30848a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            b1.a.e(drawable, colorStateList);
        } else {
            this.f30844b.f30848a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            b1.a.f(drawable, mode);
        } else {
            this.f30844b.f30848a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f30844b.f30848a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f30844b.f30849b.isStarted()) {
        } else {
            this.f30844b.f30849b.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f30844b.f30849b.end();
        }
    }
}
