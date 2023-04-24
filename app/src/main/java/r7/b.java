package r7;

import a8.f;
import a8.g;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import s7.e;
import t7.i;
import t7.k;
import x7.d;

/* loaded from: classes.dex */
public abstract class b<T extends i<? extends d<? extends k>>> extends ViewGroup implements w7.c {
    public boolean A;
    public s7.d B;
    public ArrayList<Runnable> C;
    public boolean D;

    /* renamed from: a */
    public boolean f25421a;

    /* renamed from: b */
    public T f25422b;

    /* renamed from: c */
    public boolean f25423c;

    /* renamed from: d */
    public boolean f25424d;

    /* renamed from: e */
    public float f25425e;

    /* renamed from: f */
    public u7.b f25426f;

    /* renamed from: g */
    public Paint f25427g;

    /* renamed from: h */
    public Paint f25428h;

    /* renamed from: i */
    public s7.i f25429i;

    /* renamed from: j */
    public boolean f25430j;

    /* renamed from: k */
    public s7.c f25431k;

    /* renamed from: l */
    public e f25432l;

    /* renamed from: m */
    public y7.b f25433m;

    /* renamed from: n */
    public String f25434n;

    /* renamed from: o */
    public z7.e f25435o;

    /* renamed from: p */
    public z7.d f25436p;

    /* renamed from: q */
    public v7.b f25437q;

    /* renamed from: r */
    public g f25438r;

    /* renamed from: s */
    public p7.a f25439s;

    /* renamed from: t */
    public float f25440t;

    /* renamed from: u */
    public float f25441u;

    /* renamed from: v */
    public float f25442v;

    /* renamed from: w */
    public float f25443w;

    /* renamed from: x */
    public boolean f25444x;

    /* renamed from: y */
    public v7.c[] f25445y;

    /* renamed from: z */
    public float f25446z;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
            b.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.postInvalidate();
        }
    }

    public b(Context context) {
        super(context);
        this.f25421a = false;
        this.f25422b = null;
        this.f25423c = true;
        this.f25424d = true;
        this.f25425e = 0.9f;
        this.f25426f = new u7.b(0);
        this.f25430j = true;
        this.f25434n = "No chart data available.";
        this.f25438r = new g();
        this.f25440t = 0.0f;
        this.f25441u = 0.0f;
        this.f25442v = 0.0f;
        this.f25443w = 0.0f;
        this.f25444x = false;
        this.f25446z = 0.0f;
        this.A = true;
        this.C = new ArrayList<>();
        this.D = false;
        k();
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25421a = false;
        this.f25422b = null;
        this.f25423c = true;
        this.f25424d = true;
        this.f25425e = 0.9f;
        this.f25426f = new u7.b(0);
        this.f25430j = true;
        this.f25434n = "No chart data available.";
        this.f25438r = new g();
        this.f25440t = 0.0f;
        this.f25441u = 0.0f;
        this.f25442v = 0.0f;
        this.f25443w = 0.0f;
        this.f25444x = false;
        this.f25446z = 0.0f;
        this.A = true;
        this.C = new ArrayList<>();
        this.D = false;
        k();
    }

    public static void m(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i10 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                m(viewGroup.getChildAt(i10));
                i10++;
            }
        }
    }

    public abstract void f();

    public final void g() {
        this.f25422b = null;
        this.f25444x = false;
        this.f25445y = null;
        this.f25433m.f31208b = null;
        invalidate();
    }

    public p7.a getAnimator() {
        return this.f25439s;
    }

    public a8.c getCenter() {
        return a8.c.b(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public a8.c getCenterOfView() {
        return getCenter();
    }

    public a8.c getCenterOffsets() {
        g gVar = this.f25438r;
        return a8.c.b(gVar.f397b.centerX(), gVar.f397b.centerY());
    }

    public Bitmap getChartBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return createBitmap;
    }

    public RectF getContentRect() {
        return this.f25438r.f397b;
    }

    public T getData() {
        return this.f25422b;
    }

    public u7.c getDefaultValueFormatter() {
        return this.f25426f;
    }

    public s7.c getDescription() {
        return this.f25431k;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.f25425e;
    }

    public float getExtraBottomOffset() {
        return this.f25442v;
    }

    public float getExtraLeftOffset() {
        return this.f25443w;
    }

    public float getExtraRightOffset() {
        return this.f25441u;
    }

    public float getExtraTopOffset() {
        return this.f25440t;
    }

    public v7.c[] getHighlighted() {
        return this.f25445y;
    }

    public v7.d getHighlighter() {
        return this.f25437q;
    }

    public ArrayList<Runnable> getJobs() {
        return this.C;
    }

    public e getLegend() {
        return this.f25432l;
    }

    public z7.e getLegendRenderer() {
        return this.f25435o;
    }

    public s7.d getMarker() {
        return this.B;
    }

    @Deprecated
    public s7.d getMarkerView() {
        return getMarker();
    }

    @Override // w7.c
    public float getMaxHighlightDistance() {
        return this.f25446z;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public y7.c getOnChartGestureListener() {
        return null;
    }

    public y7.b getOnTouchListener() {
        return this.f25433m;
    }

    public z7.d getRenderer() {
        return this.f25436p;
    }

    public g getViewPortHandler() {
        return this.f25438r;
    }

    public s7.i getXAxis() {
        return this.f25429i;
    }

    public float getXChartMax() {
        return this.f25429i.f26654y;
    }

    public float getXChartMin() {
        return this.f25429i.f26655z;
    }

    public float getXRange() {
        return this.f25429i.A;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.f25422b.f27823a;
    }

    public float getYMin() {
        return this.f25422b.f27824b;
    }

    public v7.c h(float f10, float f11) {
        if (this.f25422b == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        return getHighlighter().a(f10, f11);
    }

    public float[] i(v7.c cVar) {
        return new float[]{cVar.f29164i, cVar.f29165j};
    }

    public final void j(v7.c cVar) {
        if (cVar != null) {
            if (this.f25421a) {
                StringBuilder a10 = android.support.v4.media.d.a("Highlighted: ");
                a10.append(cVar.toString());
                Log.i("MPAndroidChart", a10.toString());
            }
            if (this.f25422b.f(cVar) != null) {
                this.f25445y = new v7.c[]{cVar};
                setLastHighlighted(this.f25445y);
                invalidate();
            }
        }
        this.f25445y = null;
        setLastHighlighted(this.f25445y);
        invalidate();
    }

    public void k() {
        setWillNotDraw(false);
        this.f25439s = new p7.a(new a());
        Context context = getContext();
        DisplayMetrics displayMetrics = f.f387a;
        if (context == null) {
            f.f388b = ViewConfiguration.getMinimumFlingVelocity();
            f.f389c = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            f.f388b = viewConfiguration.getScaledMinimumFlingVelocity();
            f.f389c = viewConfiguration.getScaledMaximumFlingVelocity();
            f.f387a = context.getResources().getDisplayMetrics();
        }
        this.f25446z = f.c(500.0f);
        this.f25431k = new s7.c();
        e eVar = new e();
        this.f25432l = eVar;
        this.f25435o = new z7.e(this.f25438r, eVar);
        this.f25429i = new s7.i();
        this.f25427g = new Paint(1);
        Paint paint = new Paint(1);
        this.f25428h = paint;
        paint.setColor(Color.rgb(247, 189, 51));
        this.f25428h.setTextAlign(Paint.Align.CENTER);
        this.f25428h.setTextSize(f.c(12.0f));
        if (this.f25421a) {
            Log.i("", "Chart.init()");
        }
    }

    public abstract void l();

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.D) {
            m(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f25422b == null) {
            if (!TextUtils.isEmpty(this.f25434n)) {
                a8.c center = getCenter();
                canvas.drawText(this.f25434n, center.f370b, center.f371c, this.f25428h);
            }
        } else if (this.f25444x) {
        } else {
            f();
            this.f25444x = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            getChildAt(i14).layout(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int c10 = (int) f.c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(c10, i10)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(c10, i11)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (this.f25421a) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if (i10 > 0 && i11 > 0 && i10 < 10000 && i11 < 10000) {
            if (this.f25421a) {
                Log.i("MPAndroidChart", "Setting chart dimens, width: " + i10 + ", height: " + i11);
            }
            g gVar = this.f25438r;
            float f10 = i10;
            float f11 = i11;
            RectF rectF = gVar.f397b;
            float f12 = rectF.left;
            float f13 = rectF.top;
            float f14 = gVar.f398c - rectF.right;
            float k10 = gVar.k();
            gVar.f399d = f11;
            gVar.f398c = f10;
            gVar.f397b.set(f12, f13, f10 - f14, f11 - k10);
        } else if (this.f25421a) {
            Log.w("MPAndroidChart", "*Avoiding* setting chart dimens! width: " + i10 + ", height: " + i11);
        }
        l();
        Iterator<Runnable> it = this.C.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        this.C.clear();
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public void setData(T t10) {
        float abs;
        this.f25422b = t10;
        int i10 = 0;
        this.f25444x = false;
        if (t10 == null) {
            return;
        }
        float f10 = t10.f27824b;
        float f11 = t10.f27823a;
        if (t10.e() < 2) {
            abs = Math.max(Math.abs(f10), Math.abs(f11));
        } else {
            abs = Math.abs(f11 - f10);
        }
        float e10 = f.e(abs);
        if (!Float.isInfinite(e10)) {
            i10 = ((int) Math.ceil(-Math.log10(e10))) + 2;
        }
        this.f25426f.b(i10);
        for (T t11 : this.f25422b.f27831i) {
            if (t11.F() || t11.u() == this.f25426f) {
                t11.W(this.f25426f);
            }
        }
        l();
        if (this.f25421a) {
            Log.i("MPAndroidChart", "Data is set.");
        }
    }

    public void setDescription(s7.c cVar) {
        this.f25431k = cVar;
    }

    public void setDragDecelerationEnabled(boolean z10) {
        this.f25424d = z10;
    }

    public void setDragDecelerationFrictionCoef(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 >= 1.0f) {
            f10 = 0.999f;
        }
        this.f25425e = f10;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z10) {
        setDrawMarkers(z10);
    }

    public void setDrawMarkers(boolean z10) {
        this.A = z10;
    }

    public void setExtraBottomOffset(float f10) {
        this.f25442v = f.c(f10);
    }

    public void setExtraLeftOffset(float f10) {
        this.f25443w = f.c(f10);
    }

    public void setExtraRightOffset(float f10) {
        this.f25441u = f.c(f10);
    }

    public void setExtraTopOffset(float f10) {
        this.f25440t = f.c(f10);
    }

    public void setHardwareAccelerationEnabled(boolean z10) {
        setLayerType(z10 ? 2 : 1, null);
    }

    public void setHighlightPerTapEnabled(boolean z10) {
        this.f25423c = z10;
    }

    public void setHighlighter(v7.b bVar) {
        this.f25437q = bVar;
    }

    public void setLastHighlighted(v7.c[] cVarArr) {
        v7.c cVar;
        if (cVarArr != null && cVarArr.length > 0 && (cVar = cVarArr[0]) != null) {
            this.f25433m.f31208b = cVar;
        } else {
            this.f25433m.f31208b = null;
        }
    }

    public void setLogEnabled(boolean z10) {
        this.f25421a = z10;
    }

    public void setMarker(s7.d dVar) {
        this.B = dVar;
    }

    @Deprecated
    public void setMarkerView(s7.d dVar) {
        setMarker(dVar);
    }

    public void setMaxHighlightDistance(float f10) {
        this.f25446z = f.c(f10);
    }

    public void setNoDataText(String str) {
        this.f25434n = str;
    }

    public void setNoDataTextColor(int i10) {
        this.f25428h.setColor(i10);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.f25428h.setTypeface(typeface);
    }

    public void setOnChartGestureListener(y7.c cVar) {
    }

    public void setOnChartValueSelectedListener(y7.d dVar) {
    }

    public void setOnTouchListener(y7.b bVar) {
        this.f25433m = bVar;
    }

    public void setRenderer(z7.d dVar) {
        if (dVar != null) {
            this.f25436p = dVar;
        }
    }

    public void setTouchEnabled(boolean z10) {
        this.f25430j = z10;
    }

    public void setUnbindEnabled(boolean z10) {
        this.D = z10;
    }
}
