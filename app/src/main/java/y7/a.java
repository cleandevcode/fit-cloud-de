package y7;

import a8.f;
import a8.g;
import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import t7.k;

/* loaded from: classes.dex */
public final class a extends b<r7.a<? extends t7.d<? extends x7.b<? extends k>>>> {

    /* renamed from: e */
    public Matrix f31193e;

    /* renamed from: f */
    public Matrix f31194f;

    /* renamed from: g */
    public a8.c f31195g;

    /* renamed from: h */
    public a8.c f31196h;

    /* renamed from: i */
    public float f31197i;

    /* renamed from: j */
    public float f31198j;

    /* renamed from: k */
    public float f31199k;

    /* renamed from: l */
    public x7.b f31200l;

    /* renamed from: m */
    public VelocityTracker f31201m;

    /* renamed from: n */
    public long f31202n;

    /* renamed from: o */
    public a8.c f31203o;

    /* renamed from: p */
    public a8.c f31204p;

    /* renamed from: q */
    public float f31205q;

    /* renamed from: r */
    public float f31206r;

    public a(r7.a aVar, Matrix matrix) {
        super(aVar);
        this.f31193e = new Matrix();
        this.f31194f = new Matrix();
        this.f31195g = a8.c.b(0.0f, 0.0f);
        this.f31196h = a8.c.b(0.0f, 0.0f);
        this.f31197i = 1.0f;
        this.f31198j = 1.0f;
        this.f31199k = 1.0f;
        this.f31202n = 0L;
        this.f31203o = a8.c.b(0.0f, 0.0f);
        this.f31204p = a8.c.b(0.0f, 0.0f);
        this.f31193e = matrix;
        this.f31205q = f.c(3.0f);
        this.f31206r = f.c(3.5f);
    }

    public static float f(MotionEvent motionEvent) {
        float x10 = motionEvent.getX(0) - motionEvent.getX(1);
        float y10 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y10 * y10) + (x10 * x10));
    }

    public final a8.c b(float f10, float f11) {
        g viewPortHandler = ((r7.a) this.f31210d).getViewPortHandler();
        c();
        return a8.c.b(f10 - viewPortHandler.f397b.left, -((((r7.a) this.f31210d).getMeasuredHeight() - f11) - viewPortHandler.k()));
    }

    public final void c() {
        if (this.f31200l == null) {
            r7.a aVar = (r7.a) this.f31210d;
            aVar.f25407j0.getClass();
            aVar.f25408k0.getClass();
        }
        x7.b bVar = this.f31200l;
        if (bVar != null) {
            ((r7.a) this.f31210d).e(bVar.X());
        }
    }

    public final void d(MotionEvent motionEvent, float f10, float f11) {
        this.f31193e.set(this.f31194f);
        c onChartGestureListener = ((r7.a) this.f31210d).getOnChartGestureListener();
        c();
        this.f31193e.postTranslate(f10, f11);
        if (onChartGestureListener != null) {
            onChartGestureListener.c();
        }
    }

    public final void e(MotionEvent motionEvent) {
        x7.b bVar;
        this.f31194f.set(this.f31193e);
        this.f31195g.f370b = motionEvent.getX();
        this.f31195g.f371c = motionEvent.getY();
        r7.a aVar = (r7.a) this.f31210d;
        v7.c h10 = aVar.h(motionEvent.getX(), motionEvent.getY());
        if (h10 != null) {
            bVar = (x7.b) ((t7.d) aVar.f25422b).c(h10.f29161f);
        } else {
            bVar = null;
        }
        this.f31200l = bVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float f10;
        c onChartGestureListener = ((r7.a) this.f31210d).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.e();
        }
        r7.a aVar = (r7.a) this.f31210d;
        if (aVar.L && ((t7.d) aVar.getData()).e() > 0) {
            a8.c b10 = b(motionEvent.getX(), motionEvent.getY());
            r7.a aVar2 = (r7.a) this.f31210d;
            float f11 = 1.0f;
            if (aVar2.V) {
                f10 = 1.4f;
            } else {
                f10 = 1.0f;
            }
            if (aVar2.W) {
                f11 = 1.4f;
            }
            float f12 = b10.f370b;
            float f13 = b10.f371c;
            g gVar = aVar2.f25438r;
            Matrix matrix = aVar2.f25417t0;
            gVar.getClass();
            matrix.reset();
            matrix.set(gVar.f396a);
            matrix.postScale(f10, f11, f12, -f13);
            aVar2.f25438r.l(aVar2.f25417t0, aVar2, false);
            aVar2.f();
            aVar2.postInvalidate();
            if (((r7.a) this.f31210d).f25421a) {
                StringBuilder a10 = android.support.v4.media.d.a("Double-Tap, Zooming In, x: ");
                a10.append(b10.f370b);
                a10.append(", y: ");
                a10.append(b10.f371c);
                Log.i("BarlineChartTouch", a10.toString());
            }
            a8.c.d(b10);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        c onChartGestureListener = ((r7.a) this.f31210d).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.g();
        }
        return super.onFling(motionEvent, motionEvent2, f10, f11);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        c onChartGestureListener = ((r7.a) this.f31210d).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.b();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        c onChartGestureListener = ((r7.a) this.f31210d).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.a();
        }
        r7.a aVar = (r7.a) this.f31210d;
        if (!aVar.f25423c) {
            return false;
        }
        v7.c h10 = aVar.h(motionEvent.getX(), motionEvent.getY());
        if (h10 != null && !h10.a(this.f31208b)) {
            this.f31210d.j(h10);
            this.f31208b = h10;
        } else {
            this.f31210d.j(null);
            this.f31208b = null;
        }
        return super.onSingleTapUp(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:345:0x01cf, code lost:
        if (r12 == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x02d3, code lost:
        if (r12 != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x031e, code lost:
        if (r12 != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0368, code lost:
        if (r12 != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x036a, code lost:
        r12.d();
     */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
