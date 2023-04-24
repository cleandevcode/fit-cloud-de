package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.topstep.fitcloud.pro.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class EcgView extends View {
    public c A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public VelocityTracker H;

    /* renamed from: a */
    public volatile int f12309a;

    /* renamed from: b */
    public ArrayList f12310b;

    /* renamed from: c */
    public OverScroller f12311c;

    /* renamed from: d */
    public EdgeEffect f12312d;

    /* renamed from: e */
    public EdgeEffect f12313e;

    /* renamed from: f */
    public int f12314f;

    /* renamed from: g */
    public int f12315g;

    /* renamed from: h */
    public int f12316h;

    /* renamed from: i */
    public int f12317i;

    /* renamed from: j */
    public int f12318j;

    /* renamed from: k */
    public int f12319k;

    /* renamed from: l */
    public int f12320l;

    /* renamed from: m */
    public int f12321m;

    /* renamed from: n */
    public int f12322n;

    /* renamed from: o */
    public float f12323o;

    /* renamed from: p */
    public float f12324p;

    /* renamed from: q */
    public float f12325q;

    /* renamed from: r */
    public float f12326r;

    /* renamed from: s */
    public float f12327s;

    /* renamed from: t */
    public Path f12328t;

    /* renamed from: u */
    public Paint f12329u;

    /* renamed from: v */
    public float f12330v;

    /* renamed from: w */
    public int f12331w;

    /* renamed from: x */
    public int f12332x;

    /* renamed from: y */
    public d f12333y;

    /* renamed from: z */
    public AtomicInteger f12334z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
            EcgView.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (EcgView.this.getWidth() != 0 && EcgView.this.getHeight() != 0) {
                if (EcgView.this.f12309a == 1) {
                    EcgView ecgView = EcgView.this;
                    ecgView.B = 0;
                    ecgView.invalidate();
                    return;
                }
                return;
            }
            EcgView.this.post(this);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a();

        void b();
    }

    /* loaded from: classes2.dex */
    public class d extends Thread {
        public d() {
            EcgView.this = r1;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            EcgView.this.f12334z.set(0);
            while (EcgView.this.f12309a != 1) {
                EcgView.this.postInvalidate();
                try {
                    Thread.sleep(EcgView.this.f12332x);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                EcgView ecgView = EcgView.this;
                int min = Math.min(ecgView.f12331w, ecgView.f12310b.size() - EcgView.this.f12334z.get());
                if (min > 0) {
                    EcgView.this.f12334z.addAndGet(min);
                }
            }
        }
    }

    public EcgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12309a = 1;
        this.f12323o = 0.07152582f;
        this.f12324p = 3.0f;
        this.f12334z = new AtomicInteger(0);
        this.C = false;
        this.F = -1;
        this.f12310b = new ArrayList(10000);
        float f10 = getResources().getDisplayMetrics().density * 2.0f;
        this.f12319k = 40;
        this.f12320l = 125;
        this.f12321m = 25;
        this.f12322n = 10;
        int i10 = -65536;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.EcgView, 0, 0);
            i10 = obtainStyledAttributes.getColor(2, -65536);
            f10 = obtainStyledAttributes.getDimension(3, f10);
            this.f12319k = obtainStyledAttributes.getInt(1, this.f12319k);
            this.f12320l = obtainStyledAttributes.getInt(4, this.f12320l);
            this.f12321m = obtainStyledAttributes.getInt(5, this.f12321m);
            this.f12322n = obtainStyledAttributes.getInt(0, this.f12322n);
            obtainStyledAttributes.recycle();
        }
        this.f12325q = g7.a.b(getContext());
        this.f12326r = g7.a.c(getContext());
        b();
        this.f12328t = new Path();
        Paint paint = new Paint(5);
        this.f12329u = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f12329u.setColor(i10);
        this.f12329u.setStrokeWidth(f10);
        this.f12329u.setPathEffect(new CornerPathEffect(200.0f));
        this.f12311c = new OverScroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f12314f = viewConfiguration.getScaledTouchSlop();
        this.f12315g = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12316h = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f12317i = viewConfiguration.getScaledOverscrollDistance();
        this.f12318j = viewConfiguration.getScaledOverflingDistance();
        float refreshRate = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
        this.f12330v = refreshRate;
        int ceil = (int) Math.ceil(this.f12320l / refreshRate);
        this.f12331w = ceil;
        this.f12332x = (int) ((1000.0f / this.f12320l) * ceil);
        setLayerType(1, null);
    }

    private int getScrollRange() {
        if (this.f12310b.size() > 0) {
            return (int) Math.max(0.0f, ((this.f12310b.size() - 1) * this.f12327s) - getWidth());
        }
        return 0;
    }

    public final void a(int[] iArr) {
        if (iArr == null) {
            return;
        }
        for (int i10 : iArr) {
            this.f12310b.add(Integer.valueOf(i10));
        }
        post(new a());
    }

    public final void b() {
        this.f12327s = this.f12325q / ((1000.0f / this.f12321m) / (1000.0f / this.f12320l));
    }

    public final void c() {
        this.f12310b.clear();
        this.B = 0;
        invalidate();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        int size = this.f12310b.size();
        int width = getWidth();
        if (size == 0) {
            return width;
        }
        int i10 = (int) ((size - 1) * this.f12327s);
        int i11 = this.B;
        int max = Math.max(0, i10 - width);
        return i11 < 0 ? i10 - i11 : i11 > max ? i10 + (i11 - max) : i10;
    }

    @Override // android.view.View
    public final void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f12311c.computeScrollOffset()) {
            int i10 = this.B;
            int currX = this.f12311c.getCurrX();
            if (i10 != currX) {
                int scrollRange = getScrollRange();
                int overScrollMode = getOverScrollMode();
                boolean z10 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                overScrollBy(currX - i10, 0, i10, 0, scrollRange, 0, this.f12318j, 0, false);
                if (z10) {
                    if (currX < 0 && i10 >= 0) {
                        edgeEffect = this.f12312d;
                    } else if (currX > scrollRange && i10 <= scrollRange) {
                        edgeEffect = this.f12313e;
                    }
                    edgeEffect.onAbsorb((int) this.f12311c.getCurrVelocity());
                }
            }
            if (awakenScrollBars()) {
                return;
            }
            postInvalidateOnAnimation();
        }
    }

    public final void d(Canvas canvas, int i10, float f10, int i11, Path path) {
        path.reset();
        path.moveTo(f10, f(((Integer) this.f12310b.get(i10)).intValue()));
        if (i11 > 1) {
            for (int i12 = i10 + 1; i12 < i10 + i11; i12++) {
                path.lineTo((this.f12327s * (i12 - i10)) + f10, f(((Integer) this.f12310b.get(i12)).intValue()));
            }
        }
        canvas.drawPath(path, this.f12329u);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        EdgeEffect edgeEffect = this.f12312d;
        if (edgeEffect != null) {
            if (!edgeEffect.isFinished()) {
                int save = canvas.save();
                int height = getHeight();
                canvas.rotate(270.0f);
                canvas.translate(-height, 0.0f);
                this.f12312d.setSize(height, getWidth());
                if (this.f12312d.draw(canvas)) {
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save);
            }
            if (this.f12313e.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width = getWidth();
            int height2 = getHeight();
            canvas.translate(width, 0.0f);
            canvas.rotate(90.0f);
            this.f12313e.setSize(height2, width);
            if (this.f12313e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void e() {
        this.C = false;
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.H = null;
        }
        EdgeEffect edgeEffect = this.f12312d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f12313e.onRelease();
        }
    }

    public final float f(int i10) {
        return getHeight() - (((((i10 * this.f12323o) / 1000.0f) * this.f12322n) - ((this.f12324p * this.f12322n) / 10.0f)) * this.f12326r);
    }

    public final void g() {
        d dVar = this.f12333y;
        if (dVar != null && dVar.isAlive()) {
            this.f12333y.interrupt();
        }
        this.f12333y = null;
    }

    public int getAmplitude() {
        return this.f12322n;
    }

    public int getMode() {
        return this.f12309a;
    }

    public int getSamplingRate() {
        return this.f12320l;
    }

    public int getSpeed() {
        return this.f12321m;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        super.onDraw(canvas);
        int i14 = this.f12309a;
        if (i14 != 1) {
            if (i14 == 2 || i14 == 3) {
                int size = this.f12310b.size();
                int i15 = this.f12334z.get() - 1;
                if (size > 0 && i15 >= 0) {
                    int width = ((int) (getWidth() / this.f12327s)) + 1;
                    int i16 = i15 / width;
                    int i17 = i16 * width;
                    d(canvas, i17, 0.0f, (i15 - i17) + 1, this.f12328t);
                    if (i16 > 0 && (i12 = (i15 % width) + this.f12331w) < width) {
                        int i18 = ((i16 - 1) * width) + i12;
                        d(canvas, i18, (int) (i13 * this.f12327s), width - (i18 % width), this.f12328t);
                    }
                    if (this.f12309a == 3 && i15 == size - 1) {
                        setMode(1);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int size2 = this.f12310b.size();
        if (size2 > 0) {
            int width2 = getWidth() + this.B;
            int floor = (int) Math.floor(i10 / this.f12327s);
            int ceil = (int) Math.ceil(width2 / this.f12327s);
            if (floor < 0) {
                i11 = 0;
            } else {
                i11 = floor;
            }
            int i19 = size2 - 1;
            if (ceil > i19) {
                ceil = i19;
            }
            d(canvas, i11, (i11 * this.f12327s) - this.B, (ceil - i11) + 1, this.f12328t);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), (int) (this.f12319k * this.f12326r));
        }
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        if (this.B != i10) {
            this.B = i10;
        }
        if (!this.f12311c.isFinished() && z10) {
            this.f12311c.springBack(this.B, 0, 0, getScrollRange(), 0, 0);
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x00bb, code lost:
        if (r29.f12311c.springBack(r29.B, 0, 0, getScrollRange(), 0, 0) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0216, code lost:
        if (r29.f12311c.springBack(r29.B, 0, 0, getScrollRange(), 0, 0) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0218, code lost:
        postInvalidateOnAnimation();
     */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.widget.EcgView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAmplitude(int i10) {
        if (this.f12322n != i10) {
            this.f12322n = i10;
            if (this.f12309a == 1) {
                invalidate();
            }
        }
    }

    public void setDataType(int i10) {
        this.f12323o = 0.07152582f;
        this.f12324p = 3.0f;
        setSpeed(25);
        setAmplitude(10);
    }

    public void setMode(int i10) {
        c cVar;
        c cVar2;
        if (this.f12309a == i10) {
            return;
        }
        if (this.f12309a == 3 && (cVar2 = this.A) != null) {
            cVar2.b();
        }
        this.f12309a = i10;
        g();
        this.B = 0;
        if (this.f12309a == 1) {
            invalidate();
            return;
        }
        g();
        if (this.f12309a != 1) {
            d dVar = new d();
            this.f12333y = dVar;
            dVar.start();
        }
        if (this.f12309a == 3 && (cVar = this.A) != null) {
            cVar.a();
        }
    }

    public void setOnEcgClickListener(b bVar) {
    }

    public void setOnPlayBackListener(c cVar) {
        this.A = cVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        if (i10 == 2) {
            this.f12312d = null;
            this.f12313e = null;
        } else if (this.f12312d == null) {
            Context context = getContext();
            this.f12312d = new EdgeEffect(context);
            this.f12313e = new EdgeEffect(context);
        }
        super.setOverScrollMode(i10);
    }

    public void setSampleRate(int i10) {
        if (i10 <= 0) {
            i10 = 125;
        }
        if (this.f12320l != i10) {
            this.f12320l = i10;
            b();
            int ceil = (int) Math.ceil(this.f12320l / this.f12330v);
            this.f12331w = ceil;
            this.f12332x = (int) ((1000.0f / this.f12320l) * ceil);
            if (this.f12309a == 1) {
                invalidate();
            }
        }
    }

    public void setSpeed(int i10) {
        if (i10 != this.f12321m) {
            this.f12321m = i10;
            b();
            if (this.f12309a == 1) {
                invalidate();
            }
        }
    }
}
