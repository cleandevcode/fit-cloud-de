package com.huawei.hms.scankit;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes.dex */
public final class ViewfinderView extends View {
    private int[] A;
    private float[] B;
    private Rect C;
    private boolean D;
    public Point E;
    private boolean F;

    /* renamed from: a */
    private Paint f7105a;

    /* renamed from: b */
    private TextPaint f7106b;

    /* renamed from: c */
    private int f7107c;

    /* renamed from: d */
    private int f7108d;

    /* renamed from: e */
    private int f7109e;

    /* renamed from: f */
    private int f7110f;

    /* renamed from: g */
    private int f7111g;

    /* renamed from: h */
    private float f7112h;

    /* renamed from: i */
    private b f7113i;

    /* renamed from: j */
    private String f7114j;

    /* renamed from: k */
    private int f7115k;

    /* renamed from: l */
    private float f7116l;

    /* renamed from: m */
    public int f7117m;

    /* renamed from: n */
    public int f7118n;

    /* renamed from: o */
    private boolean f7119o;

    /* renamed from: p */
    private int f7120p;

    /* renamed from: q */
    private int f7121q;

    /* renamed from: r */
    private int f7122r;

    /* renamed from: s */
    private int f7123s;

    /* renamed from: t */
    private a f7124t;

    /* renamed from: u */
    private int f7125u;

    /* renamed from: v */
    private int f7126v;

    /* renamed from: w */
    private Rect f7127w;

    /* renamed from: x */
    private int f7128x;

    /* renamed from: y */
    private ValueAnimator f7129y;

    /* renamed from: z */
    public Paint f7130z;

    /* loaded from: classes.dex */
    public enum a {
        NONE(0),
        LINE(1),
        GRID(2);
        

        /* renamed from: e */
        private int f7135e;

        a(int i10) {
            this.f7135e = i10;
        }

        public static a b(int i10) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.f7135e == i10) {
                    return aVar;
                }
            }
            return LINE;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        TOP(0),
        BOTTOM(1);
        

        /* renamed from: d */
        private int f7139d;

        b(int i10) {
            this.f7139d = i10;
        }

        public static b b(int i10) {
            b[] values;
            for (b bVar : values()) {
                if (bVar.f7139d == i10) {
                    return bVar;
                }
            }
            return TOP;
        }
    }

    public ViewfinderView(Context context) {
        this(context, null);
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewfinderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7117m = 0;
        this.f7118n = 0;
        this.f7127w = new Rect();
        this.f7130z = new Paint();
        this.A = new int[]{Color.parseColor("#FFFFFFFF"), Color.parseColor("#72FFFFFF"), Color.parseColor("#58FFFFFF"), Color.parseColor("#40FFFFFF"), Color.parseColor("#28FFFFFF"), Color.parseColor("#13FFFFFF"), Color.parseColor("#00FFFFFF")};
        this.B = new float[]{0.0f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 1.0f};
        this.D = true;
        this.F = true;
        a(context, attributeSet);
    }

    public static int a(Context context, int i10) {
        return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewfinderView);
        this.f7107c = obtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_maskColor, b(context, R.color.scankit_viewfinder_mask));
        this.f7108d = obtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_frameColor, b(context, R.color.scankit_viewfinder_frame));
        this.f7110f = obtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_cornerColor, b(context, R.color.scankit_viewfinder_corner));
        this.f7109e = obtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_laserColor, b(context, R.color.scankit_viewfinder_lasers));
        this.f7111g = obtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_resultPointColor, b(context, R.color.scankit_viewfinder_result_point_color));
        this.f7114j = obtainStyledAttributes.getString(R.styleable.ViewfinderView_scankit_labelText);
        this.f7115k = obtainStyledAttributes.getColor(R.styleable.ViewfinderView_scankit_labelTextColor, b(context, R.color.scankit_viewfinder_text_color));
        this.f7116l = obtainStyledAttributes.getDimension(R.styleable.ViewfinderView_scankit_labelTextSize, TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
        this.f7112h = obtainStyledAttributes.getDimension(R.styleable.ViewfinderView_scankit_labelTextPadding, TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
        this.f7113i = b.b(obtainStyledAttributes.getInt(R.styleable.ViewfinderView_scankit_labelTextLocation, 0));
        this.f7119o = obtainStyledAttributes.getBoolean(R.styleable.ViewfinderView_scankit_showResultPoint, false);
        this.f7122r = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewfinderView_scankit_frameWidth, 0);
        this.f7123s = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewfinderView_scankit_frameHeight, 0);
        this.f7124t = a.b(obtainStyledAttributes.getInt(R.styleable.ViewfinderView_scankit_laserStyle, a.LINE.f7135e));
        this.f7125u = obtainStyledAttributes.getInt(R.styleable.ViewfinderView_scankit_gridColumn, 20);
        this.f7126v = (int) obtainStyledAttributes.getDimension(R.styleable.ViewfinderView_scankit_gridHeight, TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics()));
        this.F = obtainStyledAttributes.getBoolean(R.styleable.ViewfinderView_scankit_line_anim, true);
        obtainStyledAttributes.recycle();
        this.f7105a = new Paint(1);
        this.f7106b = new TextPaint(1);
        this.f7128x = a(context, 136);
        this.f7121q = getDisplayMetrics().heightPixels;
        this.f7120p = getDisplayMetrics().widthPixels;
    }

    private void a(Canvas canvas) {
        Point point;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        if (this.C == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (this.D) {
            Point point2 = this.E;
            point = new Point(point2.y, point2.x);
        } else {
            Point point3 = this.E;
            point = new Point(point3.x, point3.y);
        }
        int i13 = point.x;
        float f12 = width / i13;
        int i14 = point.y;
        float f13 = height / i14;
        int i15 = (int) (i14 * 0.1d);
        int i16 = (int) ((i13 * 0.15d) / 2.0d);
        RectF rectF = new RectF();
        if (!this.D ? f12 > f13 : f12 > f13) {
            canvas.translate((width / 2) - (i12 / 2), 0.0f);
            i11 = (int) (point.x * f13);
            i10 = height;
        } else {
            i10 = (int) (point.y * f12);
            canvas.translate(0.0f, (height / 2) - (i10 / 2));
            i11 = width;
        }
        Rect rect = this.C;
        float f14 = point.x;
        float f15 = point.y;
        float f16 = (rect.top + i15) / f15;
        float f17 = (rect.bottom + i15) / f15;
        float f18 = i11;
        float f19 = ((rect.left + i16) / f14) * f18;
        rectF.left = f19;
        float f20 = ((rect.right + i16) / f14) * f18;
        rectF.right = f20;
        float f21 = i10;
        float f22 = f16 * f21;
        rectF.top = f22;
        float f23 = f17 * f21;
        rectF.bottom = f23;
        float f24 = (f19 + f20) / 2.0f;
        float f25 = (f22 + f23) / 2.0f;
        this.f7130z.setStyle(Paint.Style.FILL);
        this.f7130z.setColor(-1);
        canvas.drawCircle(f24, f25, ((int) ((getDisplayMetrics().density * 24.0f) + 0.5d)) / 2, this.f7130z);
        this.f7130z.setColor(Color.parseColor("#007DFF"));
        canvas.drawCircle(f24, f25, ((int) ((getDisplayMetrics().density * 22.0f) + 0.5d)) / 2, this.f7130z);
        if (!this.D) {
            f10 = 0.0f;
            if (f12 > f13) {
                f11 = (i10 / 2) - (height / 2);
                canvas.translate(f10, f11);
            }
            canvas.translate((i11 / 2) - (width / 2), f10);
        } else if (f12 <= f13) {
            f10 = 0.0f;
            canvas.translate((i11 / 2) - (width / 2), f10);
        } else {
            f11 = (i10 / 2) - (height / 2);
            f10 = 0.0f;
            canvas.translate(f10, f11);
        }
    }

    private void a(Canvas canvas, boolean z10) {
        Rect rect;
        int i10;
        int i11;
        this.f7105a.setStyle(Paint.Style.FILL);
        this.f7105a.setColor(this.f7109e);
        if (q.f8143b || z10) {
            rect = this.f7127w;
            int i12 = this.f7120p / 2;
            rect.left = i12 - 540;
            int i13 = this.f7117m;
            rect.top = i13;
            rect.bottom = i13 + this.f7128x;
            i10 = i12 + 540;
        } else {
            rect = this.f7127w;
            rect.left = 0;
            int i14 = this.f7117m;
            rect.top = i14;
            rect.bottom = i14 + this.f7128x;
            i10 = this.f7120p;
        }
        rect.right = i10;
        float f10 = this.f7120p / 2;
        float f11 = this.f7127w.bottom + 500;
        this.f7105a.setShader(new RadialGradient(f10, f11, 690, this.A, this.B, Shader.TileMode.CLAMP));
        this.f7105a.setStrokeWidth(10.0f);
        Rect rect2 = this.f7127w;
        float f12 = rect2.left;
        float f13 = rect2.bottom;
        canvas.drawLine(f12, f13, rect2.right, f13, this.f7105a);
        canvas.clipRect(this.f7127w);
        canvas.drawCircle(f10, f11, i11 + 200, this.f7105a);
    }

    public static int b(Context context, int i10) {
        String str;
        try {
            return Build.VERSION.SDK_INT >= 23 ? context.getColor(i10) : context.getResources().getColor(i10);
        } catch (Resources.NotFoundException unused) {
            str = "getColor: Resources.NotFoundException";
            Log.e("ViewfinderView", str);
            return 16777215;
        } catch (Exception unused2) {
            str = "getColor: Exception";
            Log.e("ViewfinderView", str);
            return 16777215;
        }
    }

    private DisplayMetrics getDisplayMetrics() {
        return getResources().getDisplayMetrics();
    }

    public void a() {
        this.f7118n = q.f8143b ? this.f7121q : this.f7121q - a(getContext(), 139);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, this.f7118n - this.f7128x);
        this.f7129y = ofInt;
        ofInt.setDuration(3000L);
        this.f7129y.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f7129y.setRepeatMode(1);
        this.f7129y.setRepeatCount(-1);
        this.f7129y.addUpdateListener(new G(this));
        this.f7129y.start();
    }

    public void a(Rect rect, boolean z10, Point point) {
        this.D = z10;
        this.E = point;
        if (this.C == null) {
            this.C = rect;
            invalidate();
        }
    }

    public void a(com.huawei.hms.scankit.aiscan.common.z zVar) {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f7129y;
        if (valueAnimator != null) {
            valueAnimator.pause();
            this.f7129y.removeAllListeners();
            this.f7129y.cancel();
        }
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        if (this.F) {
            canvas.save();
            String str = Build.DEVICE;
            a(canvas, "HWTAH".equals(str) || str.equals("HWTAH-C"));
            canvas.restore();
        }
        a(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f7120p = i10;
        this.f7121q = i11;
        a();
    }
}
