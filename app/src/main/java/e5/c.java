package e5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import e5.f;

/* loaded from: classes.dex */
public final class c extends Drawable implements f.b, Animatable {

    /* renamed from: a */
    public final a f13443a;

    /* renamed from: b */
    public boolean f13444b;

    /* renamed from: c */
    public boolean f13445c;

    /* renamed from: d */
    public boolean f13446d;

    /* renamed from: e */
    public boolean f13447e;

    /* renamed from: f */
    public int f13448f;

    /* renamed from: g */
    public int f13449g;

    /* renamed from: h */
    public boolean f13450h;

    /* renamed from: i */
    public Paint f13451i;

    /* renamed from: j */
    public Rect f13452j;

    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a */
        public final f f13453a;

        public a(f fVar) {
            this.f13453a = fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c() {
        throw null;
    }

    public c(a aVar) {
        this.f13447e = true;
        this.f13449g = -1;
        b0.c.i(aVar);
        this.f13443a = aVar;
    }

    @Override // e5.f.b
    public final void a() {
        f fVar;
        int i10;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        f.a aVar = this.f13443a.f13453a.f13463i;
        if (aVar != null) {
            i10 = aVar.f13473e;
        } else {
            i10 = -1;
        }
        if (i10 == fVar.f13455a.c() - 1) {
            this.f13448f++;
        }
        int i11 = this.f13449g;
        if (i11 != -1 && this.f13448f >= i11) {
            stop();
        }
    }

    public final void b() {
        b0.c.g("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f13446d);
        if (this.f13443a.f13453a.f13455a.c() != 1) {
            if (!this.f13444b) {
                this.f13444b = true;
                f fVar = this.f13443a.f13453a;
                if (!fVar.f13464j) {
                    if (!fVar.f13457c.contains(this)) {
                        boolean isEmpty = fVar.f13457c.isEmpty();
                        fVar.f13457c.add(this);
                        if (isEmpty && !fVar.f13460f) {
                            fVar.f13460f = true;
                            fVar.f13464j = false;
                            fVar.a();
                        }
                    } else {
                        throw new IllegalStateException("Cannot subscribe twice in a row");
                    }
                } else {
                    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.f13446d) {
            return;
        }
        if (this.f13450h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f13452j == null) {
                this.f13452j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f13452j);
            this.f13450h = false;
        }
        f fVar = this.f13443a.f13453a;
        f.a aVar = fVar.f13463i;
        if (aVar != null) {
            bitmap = aVar.f13475g;
        } else {
            bitmap = fVar.f13466l;
        }
        if (this.f13452j == null) {
            this.f13452j = new Rect();
        }
        Rect rect = this.f13452j;
        if (this.f13451i == null) {
            this.f13451i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f13451i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f13443a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f13443a.f13453a.f13471q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f13443a.f13453a.f13470p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f13444b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13450h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f13451i == null) {
            this.f13451i = new Paint(2);
        }
        this.f13451i.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f13451i == null) {
            this.f13451i = new Paint(2);
        }
        this.f13451i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        b0.c.g("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f13446d);
        this.f13447e = z10;
        if (!z10) {
            this.f13444b = false;
            f fVar = this.f13443a.f13453a;
            fVar.f13457c.remove(this);
            if (fVar.f13457c.isEmpty()) {
                fVar.f13460f = false;
            }
        } else if (this.f13445c) {
            b();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f13445c = true;
        this.f13448f = 0;
        if (this.f13447e) {
            b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f13445c = false;
        this.f13444b = false;
        f fVar = this.f13443a.f13453a;
        fVar.f13457c.remove(this);
        if (fVar.f13457c.isEmpty()) {
            fVar.f13460f = false;
        }
    }
}
