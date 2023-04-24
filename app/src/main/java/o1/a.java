package o1;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: q */
    public static final int f22560q = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    public final C0405a f22561a;

    /* renamed from: b */
    public final AccelerateInterpolator f22562b;

    /* renamed from: c */
    public final View f22563c;

    /* renamed from: d */
    public b f22564d;

    /* renamed from: e */
    public float[] f22565e;

    /* renamed from: f */
    public float[] f22566f;

    /* renamed from: g */
    public int f22567g;

    /* renamed from: h */
    public int f22568h;

    /* renamed from: i */
    public float[] f22569i;

    /* renamed from: j */
    public float[] f22570j;

    /* renamed from: k */
    public float[] f22571k;

    /* renamed from: l */
    public boolean f22572l;

    /* renamed from: m */
    public boolean f22573m;

    /* renamed from: n */
    public boolean f22574n;

    /* renamed from: o */
    public boolean f22575o;

    /* renamed from: p */
    public boolean f22576p;

    /* renamed from: o1.a$a */
    /* loaded from: classes.dex */
    public static class C0405a {

        /* renamed from: a */
        public int f22577a;

        /* renamed from: b */
        public int f22578b;

        /* renamed from: c */
        public float f22579c;

        /* renamed from: d */
        public float f22580d;

        /* renamed from: h */
        public float f22584h;

        /* renamed from: i */
        public int f22585i;

        /* renamed from: e */
        public long f22581e = Long.MIN_VALUE;

        /* renamed from: g */
        public long f22583g = -1;

        /* renamed from: f */
        public long f22582f = 0;

        public final float a(long j10) {
            long j11 = this.f22581e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f22583g;
            if (j12 < 0 || j10 < j12) {
                return a.b(((float) (j10 - j11)) / this.f22577a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f22584h;
            return (a.b(((float) (j10 - j12)) / this.f22585i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            a aVar = a.this;
            if (!aVar.f22575o) {
                return;
            }
            if (aVar.f22573m) {
                aVar.f22573m = false;
                C0405a c0405a = aVar.f22561a;
                c0405a.getClass();
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                c0405a.f22581e = currentAnimationTimeMillis;
                c0405a.f22583g = -1L;
                c0405a.f22582f = currentAnimationTimeMillis;
                c0405a.f22584h = 0.5f;
            }
            C0405a c0405a2 = a.this.f22561a;
            if (c0405a2.f22583g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0405a2.f22583g + c0405a2.f22585i) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && a.this.e()) {
                a aVar2 = a.this;
                if (aVar2.f22574n) {
                    aVar2.f22574n = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar2.f22563c.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c0405a2.f22582f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = c0405a2.a(currentAnimationTimeMillis2);
                    c0405a2.f22582f = currentAnimationTimeMillis2;
                    i.b(((h) a.this).f22589r, (int) (((float) (currentAnimationTimeMillis2 - c0405a2.f22582f)) * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * c0405a2.f22580d));
                    View view = a.this.f22563c;
                    WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                    o0.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            a.this.f22575o = false;
        }
    }

    public a(View view) {
        C0405a c0405a = new C0405a();
        this.f22561a = c0405a;
        this.f22562b = new AccelerateInterpolator();
        this.f22565e = new float[]{0.0f, 0.0f};
        this.f22566f = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f22569i = new float[]{0.0f, 0.0f};
        this.f22570j = new float[]{0.0f, 0.0f};
        this.f22571k = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f22563c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f22571k;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr[0] = f11;
        fArr[1] = f11;
        float[] fArr2 = this.f22570j;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f12;
        fArr2[1] = f12;
        this.f22567g = 1;
        float[] fArr3 = this.f22566f;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f22565e;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f22569i;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f22568h = f22560q;
        c0405a.f22577a = 500;
        c0405a.f22578b = 500;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f22565e
            r0 = r0[r7]
            float[] r1 = r3.f22566f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 >= 0) goto L26
            android.view.animation.AccelerateInterpolator r5 = r3.f22562b
            float r4 = -r4
            float r4 = r5.getInterpolation(r4)
            float r4 = -r4
            goto L30
        L26:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L39
            android.view.animation.AccelerateInterpolator r5 = r3.f22562b
            float r4 = r5.getInterpolation(r4)
        L30:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L3a
        L39:
            r4 = 0
        L3a:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3f
            return r2
        L3f:
            float[] r0 = r3.f22569i
            r0 = r0[r7]
            float[] r1 = r3.f22570j
            r1 = r1[r7]
            float[] r2 = r3.f22571k
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L56
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L56:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.a.a(float, float, float, int):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f22567g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f22575o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.f22573m) {
            this.f22575o = false;
            return;
        }
        C0405a c0405a = this.f22561a;
        c0405a.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - c0405a.f22581e);
        int i12 = c0405a.f22578b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        c0405a.f22585i = i10;
        c0405a.f22584h = c0405a.a(currentAnimationTimeMillis);
        c0405a.f22583g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            r9 = this;
            o1.a$a r0 = r9.f22561a
            float r1 = r0.f22580d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f22579c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L53
            r4 = r9
            o1.h r4 = (o1.h) r4
            android.widget.ListView r4 = r4.f22589r
            int r5 = r4.getCount()
            if (r5 != 0) goto L23
        L21:
            r1 = 0
            goto L51
        L23:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r5) goto L50
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = 1
        L51:
            if (r1 != 0) goto L54
        L53:
            r2 = 0
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.a.e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f22576p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L7f
        L16:
            r5.d()
            goto L7f
        L1a:
            r5.f22574n = r2
            r5.f22572l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f22563c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r0, r3, r4, r1)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f22563c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r7, r6, r3, r2)
            o1.a$a r7 = r5.f22561a
            r7.f22579c = r0
            r7.f22580d = r6
            boolean r6 = r5.f22575o
            if (r6 != 0) goto L7f
            boolean r6 = r5.e()
            if (r6 == 0) goto L7f
            o1.a$b r6 = r5.f22564d
            if (r6 != 0) goto L61
            o1.a$b r6 = new o1.a$b
            r6.<init>()
            r5.f22564d = r6
        L61:
            r5.f22575o = r2
            r5.f22573m = r2
            boolean r6 = r5.f22572l
            if (r6 != 0) goto L78
            int r6 = r5.f22568h
            if (r6 <= 0) goto L78
            android.view.View r7 = r5.f22563c
            o1.a$b r0 = r5.f22564d
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, k1.i2> r6 = k1.o0.f18161a
            k1.o0.d.n(r7, r0, r3)
            goto L7d
        L78:
            o1.a$b r6 = r5.f22564d
            r6.run()
        L7d:
            r5.f22572l = r2
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
