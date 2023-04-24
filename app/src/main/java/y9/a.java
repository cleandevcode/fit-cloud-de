package y9;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import ga.i;
import ga.j;

/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: b */
    public final Paint f31229b;

    /* renamed from: h */
    public float f31235h;

    /* renamed from: i */
    public int f31236i;

    /* renamed from: j */
    public int f31237j;

    /* renamed from: k */
    public int f31238k;

    /* renamed from: l */
    public int f31239l;

    /* renamed from: m */
    public int f31240m;

    /* renamed from: o */
    public i f31242o;

    /* renamed from: p */
    public ColorStateList f31243p;

    /* renamed from: a */
    public final j f31228a = j.a.f15153a;

    /* renamed from: c */
    public final Path f31230c = new Path();

    /* renamed from: d */
    public final Rect f31231d = new Rect();

    /* renamed from: e */
    public final RectF f31232e = new RectF();

    /* renamed from: f */
    public final RectF f31233f = new RectF();

    /* renamed from: g */
    public final C0575a f31234g = new C0575a();

    /* renamed from: n */
    public boolean f31241n = true;

    /* renamed from: y9.a$a */
    /* loaded from: classes.dex */
    public class C0575a extends Drawable.ConstantState {
        public C0575a() {
            a.this = r1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return a.this;
        }
    }

    public a(i iVar) {
        this.f31242o = iVar;
        Paint paint = new Paint(1);
        this.f31229b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public final RectF a() {
        this.f31233f.set(getBounds());
        return this.f31233f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f31241n) {
            Paint paint = this.f31229b;
            Rect rect = this.f31231d;
            copyBounds(rect);
            float height = this.f31235h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{a1.a.b(this.f31236i, this.f31240m), a1.a.b(this.f31237j, this.f31240m), a1.a.b(a1.a.d(this.f31237j, 0), this.f31240m), a1.a.b(a1.a.d(this.f31239l, 0), this.f31240m), a1.a.b(this.f31239l, this.f31240m), a1.a.b(this.f31238k, this.f31240m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f31241n = false;
        }
        float strokeWidth = this.f31229b.getStrokeWidth() / 2.0f;
        copyBounds(this.f31231d);
        this.f31232e.set(this.f31231d);
        float min = Math.min(this.f31242o.f15121e.a(a()), this.f31232e.width() / 2.0f);
        if (this.f31242o.c(a())) {
            this.f31232e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f31232e, min, min, this.f31229b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f31234g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f31235h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.f31242o.c(a())) {
            outline.setRoundRect(getBounds(), this.f31242o.f15121e.a(a()));
            return;
        }
        copyBounds(this.f31231d);
        this.f31232e.set(this.f31231d);
        this.f31228a.a(this.f31242o, 1.0f, this.f31232e, null, this.f31230c);
        if (this.f31230c.isConvex()) {
            outline.setConvexPath(this.f31230c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        if (this.f31242o.c(a())) {
            int round = Math.round(this.f31235h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f31243p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f31241n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f31243p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f31240m)) != this.f31240m) {
            this.f31241n = true;
            this.f31240m = colorForState;
        }
        if (this.f31241n) {
            invalidateSelf();
        }
        return this.f31241n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f31229b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31229b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
