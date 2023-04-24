package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class r extends RecyclerView.l implements RecyclerView.q {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final a B;

    /* renamed from: a */
    public final int f3215a;

    /* renamed from: b */
    public final int f3216b;

    /* renamed from: c */
    public final StateListDrawable f3217c;

    /* renamed from: d */
    public final Drawable f3218d;

    /* renamed from: e */
    public final int f3219e;

    /* renamed from: f */
    public final int f3220f;

    /* renamed from: g */
    public final StateListDrawable f3221g;

    /* renamed from: h */
    public final Drawable f3222h;

    /* renamed from: i */
    public final int f3223i;

    /* renamed from: j */
    public final int f3224j;

    /* renamed from: k */
    public int f3225k;

    /* renamed from: l */
    public int f3226l;

    /* renamed from: m */
    public float f3227m;

    /* renamed from: n */
    public int f3228n;

    /* renamed from: o */
    public int f3229o;

    /* renamed from: p */
    public float f3230p;

    /* renamed from: s */
    public RecyclerView f3233s;

    /* renamed from: z */
    public final ValueAnimator f3240z;

    /* renamed from: q */
    public int f3231q = 0;

    /* renamed from: r */
    public int f3232r = 0;

    /* renamed from: t */
    public boolean f3234t = false;

    /* renamed from: u */
    public boolean f3235u = false;

    /* renamed from: v */
    public int f3236v = 0;

    /* renamed from: w */
    public int f3237w = 0;

    /* renamed from: x */
    public final int[] f3238x = new int[2];

    /* renamed from: y */
    public final int[] f3239y = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            r.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            r rVar = r.this;
            int i10 = rVar.A;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
            } else {
                rVar.f3240z.cancel();
            }
            rVar.A = 3;
            ValueAnimator valueAnimator = rVar.f3240z;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            rVar.f3240z.setDuration(500);
            rVar.f3240z.start();
        }
    }

    /* loaded from: classes.dex */
    public class b extends RecyclerView.r {
        public b() {
            r.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            boolean z10;
            boolean z11;
            r rVar = r.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = rVar.f3233s.computeVerticalScrollRange();
            int i12 = rVar.f3232r;
            if (computeVerticalScrollRange - i12 > 0 && i12 >= rVar.f3215a) {
                z10 = true;
            } else {
                z10 = false;
            }
            rVar.f3234t = z10;
            int computeHorizontalScrollRange = rVar.f3233s.computeHorizontalScrollRange();
            int i13 = rVar.f3231q;
            if (computeHorizontalScrollRange - i13 > 0 && i13 >= rVar.f3215a) {
                z11 = true;
            } else {
                z11 = false;
            }
            rVar.f3235u = z11;
            boolean z12 = rVar.f3234t;
            if (!z12 && !z11) {
                if (rVar.f3236v != 0) {
                    rVar.l(0);
                    return;
                }
                return;
            }
            if (z12) {
                float f10 = i12;
                rVar.f3226l = (int) ((((f10 / 2.0f) + computeVerticalScrollOffset) * f10) / computeVerticalScrollRange);
                rVar.f3225k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
            }
            if (rVar.f3235u) {
                float f11 = computeHorizontalScrollOffset;
                float f12 = i13;
                rVar.f3229o = (int) ((((f12 / 2.0f) + f11) * f12) / computeHorizontalScrollRange);
                rVar.f3228n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
            }
            int i14 = rVar.f3236v;
            if (i14 == 0 || i14 == 1) {
                rVar.l(1);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f3243a = false;

        public c() {
            r.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f3243a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f3243a) {
                this.f3243a = false;
            } else if (((Float) r.this.f3240z.getAnimatedValue()).floatValue() == 0.0f) {
                r rVar = r.this;
                rVar.A = 0;
                rVar.l(0);
            } else {
                r rVar2 = r.this;
                rVar2.A = 2;
                rVar2.f3233s.invalidate();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
            r.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            r.this.f3217c.setAlpha(floatValue);
            r.this.f3218d.setAlpha(floatValue);
            r.this.f3233s.invalidate();
        }
    }

    public r(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3240z = ofFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.f3217c = stateListDrawable;
        this.f3218d = drawable;
        this.f3221g = stateListDrawable2;
        this.f3222h = drawable2;
        this.f3219e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3220f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3223i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3224j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3215a = i11;
        this.f3216b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f3233s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.Y(this);
            RecyclerView recyclerView3 = this.f3233s;
            recyclerView3.f2897q.remove(this);
            if (recyclerView3.f2899r == this) {
                recyclerView3.f2899r = null;
            }
            ArrayList arrayList = this.f3233s.f2908v0;
            if (arrayList != null) {
                arrayList.remove(bVar);
            }
            this.f3233s.removeCallbacks(aVar);
        }
        this.f3233s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f3233s.f2897q.add(this);
            this.f3233s.h(bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0116, code lost:
        if (r5 >= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00bc, code lost:
        if (r8 >= 0) goto L34;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.r.a(android.view.MotionEvent):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f3236v;
        if (i10 == 1) {
            boolean j10 = j(motionEvent.getX(), motionEvent.getY());
            boolean i11 = i(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (j10 || i11)) {
                if (i11) {
                    this.f3237w = 1;
                    this.f3230p = (int) motionEvent.getX();
                } else if (j10) {
                    this.f3237w = 2;
                    this.f3227m = (int) motionEvent.getY();
                }
                l(2);
                return true;
            }
        } else if (i10 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void e(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        if (this.f3231q == this.f3233s.getWidth() && this.f3232r == this.f3233s.getHeight()) {
            if (this.A != 0) {
                if (this.f3234t) {
                    int i10 = this.f3231q;
                    int i11 = this.f3219e;
                    int i12 = i10 - i11;
                    int i13 = this.f3226l;
                    int i14 = this.f3225k;
                    int i15 = i13 - (i14 / 2);
                    this.f3217c.setBounds(0, 0, i11, i14);
                    this.f3218d.setBounds(0, 0, this.f3220f, this.f3232r);
                    RecyclerView recyclerView2 = this.f3233s;
                    WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
                    boolean z10 = true;
                    if (o0.e.d(recyclerView2) != 1) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f3218d.draw(canvas);
                        canvas.translate(this.f3219e, i15);
                        canvas.scale(-1.0f, 1.0f);
                        this.f3217c.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        i12 = this.f3219e;
                    } else {
                        canvas.translate(i12, 0.0f);
                        this.f3218d.draw(canvas);
                        canvas.translate(0.0f, i15);
                        this.f3217c.draw(canvas);
                    }
                    canvas.translate(-i12, -i15);
                }
                if (this.f3235u) {
                    int i16 = this.f3232r;
                    int i17 = this.f3223i;
                    int i18 = i16 - i17;
                    int i19 = this.f3229o;
                    int i20 = this.f3228n;
                    int i21 = i19 - (i20 / 2);
                    this.f3221g.setBounds(0, 0, i20, i17);
                    this.f3222h.setBounds(0, 0, this.f3231q, this.f3224j);
                    canvas.translate(0.0f, i18);
                    this.f3222h.draw(canvas);
                    canvas.translate(i21, 0.0f);
                    this.f3221g.draw(canvas);
                    canvas.translate(-i21, -i18);
                    return;
                }
                return;
            }
            return;
        }
        this.f3231q = this.f3233s.getWidth();
        this.f3232r = this.f3233s.getHeight();
        l(0);
    }

    public final boolean i(float f10, float f11) {
        if (f11 >= this.f3232r - this.f3223i) {
            int i10 = this.f3229o;
            int i11 = this.f3228n;
            if (f10 >= i10 - (i11 / 2) && f10 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(float f10, float f11) {
        boolean z10;
        RecyclerView recyclerView = this.f3233s;
        WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
        if (o0.e.d(recyclerView) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (f10 > this.f3219e) {
                return false;
            }
        } else if (f10 < this.f3231q - this.f3219e) {
            return false;
        }
        int i10 = this.f3226l;
        int i11 = this.f3225k / 2;
        if (f11 < i10 - i11 || f11 > i11 + i10) {
            return false;
        }
        return true;
    }

    public final void k(int i10) {
        this.f3233s.removeCallbacks(this.B);
        this.f3233s.postDelayed(this.B, i10);
    }

    public final void l(int i10) {
        int i11;
        if (i10 == 2 && this.f3236v != 2) {
            this.f3217c.setState(C);
            this.f3233s.removeCallbacks(this.B);
        }
        if (i10 == 0) {
            this.f3233s.invalidate();
        } else {
            m();
        }
        if (this.f3236v == 2 && i10 != 2) {
            this.f3217c.setState(D);
            i11 = 1200;
        } else {
            i11 = i10 == 1 ? 1500 : 1500;
            this.f3236v = i10;
        }
        k(i11);
        this.f3236v = i10;
    }

    public final void m() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            }
            this.f3240z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3240z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3240z.setDuration(500L);
        this.f3240z.setStartDelay(0L);
        this.f3240z.start();
    }
}
