package com.huawei.hms.scankit.drawable;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.huawei.hms.scankit.R;
import com.huawei.hms.scankit.p.Qc;
import com.huawei.hms.scankit.p.Rc;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class ScanDrawable extends Drawable implements Animatable {

    /* renamed from: a */
    private static final int[] f7335a = {13625597, 357325};

    /* renamed from: b */
    private static final Interpolator f7336b = new a(0.4f, 0.0f, 0.4f, 1.0f);

    /* renamed from: c */
    private static final Interpolator f7337c = new a(0.4f, 0.0f, 0.7f, 1.0f);

    /* renamed from: d */
    private static final Interpolator f7338d = new a(0.25f, 0.0f, 0.4f, 1.0f);
    private AnimatorSet A;

    /* renamed from: e */
    private final ValueAnimator f7339e;

    /* renamed from: f */
    private final ValueAnimator f7340f;

    /* renamed from: g */
    private final Matrix f7341g;

    /* renamed from: h */
    private final Paint f7342h;

    /* renamed from: i */
    private final Paint f7343i;

    /* renamed from: j */
    private final ColorMatrix f7344j;

    /* renamed from: k */
    private final Matrix f7345k;

    /* renamed from: l */
    private final Rect f7346l;

    /* renamed from: m */
    private final Rect f7347m;

    /* renamed from: n */
    private final Rect f7348n;

    /* renamed from: o */
    private final Rect f7349o;

    /* renamed from: p */
    private int f7350p;

    /* renamed from: q */
    private int f7351q;

    /* renamed from: r */
    private float f7352r;

    /* renamed from: s */
    private boolean f7353s;

    /* renamed from: t */
    private float f7354t;

    /* renamed from: u */
    private int f7355u;

    /* renamed from: v */
    private Qc f7356v;

    /* renamed from: w */
    private float f7357w;

    /* renamed from: x */
    private boolean f7358x;

    /* renamed from: y */
    private Bitmap f7359y;

    /* renamed from: z */
    private Bitmap f7360z;

    public ScanDrawable() {
        this.f7339e = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7340f = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7341g = new Matrix();
        this.f7342h = new Paint();
        this.f7343i = new Paint();
        this.f7344j = new ColorMatrix();
        this.f7345k = new Matrix();
        this.f7346l = new Rect();
        this.f7347m = new Rect();
        this.f7348n = new Rect();
        this.f7349o = new Rect();
        this.f7352r = 0.5f;
        this.f7353s = false;
        this.f7354t = 0.0f;
        this.f7358x = true;
        this.A = new AnimatorSet();
        d();
    }

    public ScanDrawable(Resources resources) {
        this();
        a(resources);
    }

    private void a(Resources resources) {
        if (resources == null) {
            Log.e("ScanDrawable", "resources is null when init drawable");
            return;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.scankit_scan_light);
        this.f7360z = Bitmap.createBitmap(decodeResource.getWidth() * 2, decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas();
        canvas.setBitmap(this.f7360z);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        paint.setShader(new BitmapShader(decodeResource, tileMode, tileMode));
        canvas.drawRect(0.0f, 0.0f, decodeResource.getWidth() * 2, decodeResource.getHeight() * 2, paint);
        this.f7359y = BitmapFactory.decodeResource(resources, R.drawable.scankit_scan_tail);
        this.f7357w = resources.getDisplayMetrics().density;
    }

    private void a(Canvas canvas) {
        int i10;
        int i11;
        Bitmap bitmap = this.f7360z;
        if (bitmap == null || bitmap.getWidth() == 0 || this.f7360z.getHeight() == 0) {
            Log.e("ScanDrawable", "drawLight failed, light bitmap is null");
            return;
        }
        float floatValue = (((Float) this.f7339e.getAnimatedValue()).floatValue() * this.f7352r) + (this.f7354t * 0.5f);
        float f10 = (1.5f - floatValue) * 0.05f;
        float f11 = f10 + 1.0f;
        this.f7344j.set(new float[]{1.0f, f10, f10, f10, 0.0f, f10, f11, f10, f10, 0.0f, f10, f10, f11, f10, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f7343i.setColorFilter(new ColorMatrixColorFilter(this.f7344j));
        int i12 = (int) (((floatValue * 0.2f) + 0.4f) * this.f7350p);
        if (this.f7353s) {
            int i13 = this.f7355u;
            i10 = i13 + i12;
            i11 = i13 - i12;
        } else {
            int i14 = this.f7355u;
            i10 = i14 - i12;
            i11 = i14 + i12;
        }
        this.f7346l.set(0, i10, getBounds().right, i11);
        this.f7345k.setScale(this.f7346l.width() / this.f7360z.getWidth(), this.f7346l.height() / this.f7360z.getHeight());
        Matrix matrix = this.f7345k;
        Rect rect = this.f7346l;
        matrix.postTranslate(rect.left, rect.top);
        canvas.drawBitmap(this.f7360z, this.f7345k, this.f7343i);
        this.f7345k.reset();
    }

    private void a(Canvas canvas, Rect rect) {
        Bitmap bitmap = this.f7359y;
        if (bitmap == null || bitmap.getWidth() == 0 || this.f7359y.getHeight() == 0) {
            Log.e("ScanDrawable", "dawTail failed, input bitmap is null");
            return;
        }
        this.f7341g.setScale(rect.width() / this.f7359y.getWidth(), rect.height() / this.f7359y.getHeight());
        this.f7341g.postTranslate(rect.left, rect.top);
        canvas.drawBitmap(this.f7359y, this.f7341g, this.f7342h);
        this.f7341g.reset();
    }

    private void a(Rect rect) {
        if (rect.height() == 0) {
            Log.d("ScanDrawable", "initBounds bounds is null");
            return;
        }
        this.f7349o.set(rect);
        this.f7349o.inset(0, (int) (rect.height() * 0.1f));
        this.f7350p = (int) (rect.height() * 0.18f);
        this.f7351q = (int) (rect.height() * 0.36f);
        Rect rect2 = new Rect(rect);
        rect2.inset((int) (rect.width() * 0.2f), 0);
        float f10 = this.f7357w;
        int width = (int) ((f10 != 0.0f ? 0.001f / (f10 * f10) : 0.001f) * rect2.width() * rect2.height());
        this.f7356v = new Qc(new Rc(width, 500L).a(0.33f, 1.0f).a(0, -1, 0L, 100L, new LinearInterpolator()).a(-1, 0, 400L, 500L, new LinearInterpolator()), rect2, width, this.f7357w * 2.0f, f7335a);
    }

    private void b(Canvas canvas) {
        Qc qc2 = this.f7356v;
        if (qc2 == null) {
            Log.e("ScanDrawable", "drawParticle failed, mParticle is null");
        } else {
            qc2.a(canvas, this.f7347m);
        }
    }

    private void d() {
        f();
        e();
        AnimatorSet animatorSet = new AnimatorSet();
        this.A = animatorSet;
        animatorSet.playTogether(this.f7340f, this.f7339e);
    }

    private void e() {
        this.f7339e.setInterpolator(new LinearInterpolator());
        this.f7339e.setRepeatMode(2);
        this.f7339e.setRepeatCount(-1);
        this.f7339e.setDuration(500L);
        this.f7339e.setStartDelay(200L);
        this.f7339e.addListener(new d(this));
    }

    private void f() {
        this.f7340f.setDuration(2000L);
        this.f7340f.setInterpolator(new LinearInterpolator());
        this.f7340f.setRepeatCount(-1);
        this.f7340f.setRepeatMode(2);
        this.f7340f.addUpdateListener(new b(this));
        this.f7340f.addListener(new c(this));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        if (!isRunning() || canvas == null) {
            Log.w("ScanDrawable", "animator is not running or canvas is null.");
            return;
        }
        if (this.f7353s) {
            int i12 = this.f7355u;
            this.f7347m.set(0, i12, getBounds().right, ((int) (this.f7351q * this.f7354t * 0.5f)) + i12);
            i10 = this.f7355u;
            i11 = ((int) (this.f7351q * this.f7354t)) + i10;
        } else {
            int i13 = this.f7355u;
            this.f7347m.set(0, i13, getBounds().right, i13 - ((int) ((this.f7351q * this.f7354t) * 0.5f)));
            i10 = this.f7355u;
            i11 = i10 - ((int) (this.f7351q * this.f7354t));
        }
        this.f7348n.set(0, i10, getBounds().right, i11);
        a(canvas, this.f7348n);
        b(canvas);
        a(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (resources == null || xmlPullParser == null || attributeSet == null) {
            Log.e("ScanDrawable", "resources, xmlPullParser or attributeSet is null when inflating drawable");
            return;
        }
        a(resources);
        super.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.A.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        if (rect == null) {
            Log.e("ScanDrawable", "on bounds change: bounds is null!");
            return;
        }
        super.onBoundsChange(rect);
        a(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        String str;
        if (isRunning()) {
            str = "start failed, animator is running";
        } else {
            this.f7353s = false;
            this.f7358x = true;
            a(getBounds());
            this.A.start();
            str = "start scan animator success";
        }
        Log.i("ScanDrawable", str);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        String str;
        if (isRunning()) {
            this.A.end();
            this.f7356v = null;
            str = "stop scan animator success";
        } else {
            str = "stop failed, animator is not running";
        }
        Log.i("ScanDrawable", str);
    }
}
