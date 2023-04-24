package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import vh.b;

/* loaded from: classes.dex */
public final class t extends RecyclerView.l implements RecyclerView.o {
    public Rect A;
    public long B;

    /* renamed from: d */
    public float f3270d;

    /* renamed from: e */
    public float f3271e;

    /* renamed from: f */
    public float f3272f;

    /* renamed from: g */
    public float f3273g;

    /* renamed from: h */
    public float f3274h;

    /* renamed from: i */
    public float f3275i;

    /* renamed from: j */
    public float f3276j;

    /* renamed from: k */
    public float f3277k;

    /* renamed from: m */
    public d f3279m;

    /* renamed from: o */
    public int f3281o;

    /* renamed from: q */
    public int f3283q;

    /* renamed from: r */
    public RecyclerView f3284r;

    /* renamed from: t */
    public VelocityTracker f3286t;

    /* renamed from: u */
    public ArrayList f3287u;

    /* renamed from: v */
    public ArrayList f3288v;

    /* renamed from: x */
    public k1.e f3290x;

    /* renamed from: y */
    public e f3291y;

    /* renamed from: a */
    public final ArrayList f3267a = new ArrayList();

    /* renamed from: b */
    public final float[] f3268b = new float[2];

    /* renamed from: c */
    public RecyclerView.b0 f3269c = null;

    /* renamed from: l */
    public int f3278l = -1;

    /* renamed from: n */
    public int f3280n = 0;

    /* renamed from: p */
    public ArrayList f3282p = new ArrayList();

    /* renamed from: s */
    public final a f3285s = new a();

    /* renamed from: w */
    public View f3289w = null;

    /* renamed from: z */
    public final b f3292z = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            t.this = r1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x0054, code lost:
            if (r11 < 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0077, code lost:
            if (r11 > 0) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x00f8  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 301
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.t.a.run():void");
        }
    }

    /* loaded from: classes.dex */
    public class b implements RecyclerView.q {
        public b() {
            t.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void a(MotionEvent motionEvent) {
            t.this.f3290x.f18111a.f18112a.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = t.this.f3286t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (t.this.f3278l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(t.this.f3278l);
            if (findPointerIndex >= 0) {
                t.this.j(actionMasked, findPointerIndex, motionEvent);
            }
            t tVar = t.this;
            RecyclerView.b0 b0Var = tVar.f3269c;
            if (b0Var == null) {
                return;
            }
            int i10 = 0;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            t tVar2 = t.this;
                            if (pointerId == tVar2.f3278l) {
                                if (actionIndex == 0) {
                                    i10 = 1;
                                }
                                tVar2.f3278l = motionEvent.getPointerId(i10);
                                t tVar3 = t.this;
                                tVar3.s(tVar3.f3281o, actionIndex, motionEvent);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = tVar.f3286t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else if (findPointerIndex >= 0) {
                    tVar.s(tVar.f3281o, findPointerIndex, motionEvent);
                    t.this.p(b0Var);
                    t tVar4 = t.this;
                    tVar4.f3284r.removeCallbacks(tVar4.f3285s);
                    t.this.f3285s.run();
                    t.this.f3284r.invalidate();
                    return;
                } else {
                    return;
                }
            }
            t.this.r(null, 0);
            t.this.f3278l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            t.this.f3290x.f18111a.f18112a.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                t.this.f3278l = motionEvent.getPointerId(0);
                t.this.f3270d = motionEvent.getX();
                t.this.f3271e = motionEvent.getY();
                t tVar = t.this;
                VelocityTracker velocityTracker = tVar.f3286t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                tVar.f3286t = VelocityTracker.obtain();
                t tVar2 = t.this;
                if (tVar2.f3269c == null) {
                    if (!tVar2.f3282p.isEmpty()) {
                        View m10 = tVar2.m(motionEvent);
                        int size = tVar2.f3282p.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            f fVar2 = (f) tVar2.f3282p.get(size);
                            if (fVar2.f3307e.f2927a == m10) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        t tVar3 = t.this;
                        tVar3.f3270d -= fVar.f3311i;
                        tVar3.f3271e -= fVar.f3312j;
                        tVar3.l(fVar.f3307e, true);
                        if (t.this.f3267a.remove(fVar.f3307e.f2927a)) {
                            d dVar = t.this.f3279m;
                            RecyclerView.b0 b0Var = fVar.f3307e;
                            dVar.getClass();
                            d.a(b0Var);
                        }
                        t.this.r(fVar.f3307e, fVar.f3308f);
                        t tVar4 = t.this;
                        tVar4.s(tVar4.f3281o, 0, motionEvent);
                    }
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i10 = t.this.f3278l;
                if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    t.this.j(actionMasked, findPointerIndex, motionEvent);
                }
            } else {
                t tVar5 = t.this;
                tVar5.f3278l = -1;
                tVar5.r(null, 0);
            }
            VelocityTracker velocityTracker2 = t.this.f3286t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (t.this.f3269c != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void e(boolean z10) {
            if (z10) {
                t.this.r(null, 0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends f {

        /* renamed from: n */
        public final /* synthetic */ int f3295n;

        /* renamed from: o */
        public final /* synthetic */ RecyclerView.b0 f3296o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.b0 b0Var, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.b0 b0Var2) {
            super(b0Var, i11, f10, f11, f12, f13);
            t.this = r9;
            this.f3295n = i12;
            this.f3296o = b0Var2;
        }

        @Override // androidx.recyclerview.widget.t.f, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f3313k) {
                return;
            }
            if (this.f3295n <= 0) {
                d dVar = t.this.f3279m;
                RecyclerView.b0 b0Var = this.f3296o;
                dVar.getClass();
                d.a(b0Var);
            } else {
                t.this.f3267a.add(this.f3296o.f2927a);
                this.f3310h = true;
                int i10 = this.f3295n;
                if (i10 > 0) {
                    t tVar = t.this;
                    tVar.f3284r.post(new u(tVar, this, i10));
                }
            }
            t tVar2 = t.this;
            View view = tVar2.f3289w;
            View view2 = this.f3296o.f2927a;
            if (view == view2) {
                tVar2.q(view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: b */
        public static final a f3298b = new a();

        /* renamed from: c */
        public static final b f3299c = new b();

        /* renamed from: a */
        public int f3300a = -1;

        /* loaded from: classes.dex */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        /* loaded from: classes.dex */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        public static void a(RecyclerView.b0 b0Var) {
            View view = b0Var.f2927a;
            int i10 = R.id.item_touch_helper_previous_elevation;
            Object tag = view.getTag(i10);
            if (tag instanceof Float) {
                float floatValue = ((Float) tag).floatValue();
                WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
                o0.i.s(view, floatValue);
            }
            view.setTag(i10, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public static void d(RecyclerView recyclerView, RecyclerView.b0 b0Var, float f10, float f11, boolean z10) {
            View view = b0Var.f2927a;
            if (z10 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
                Float valueOf = Float.valueOf(o0.i.i(view));
                int childCount = recyclerView.getChildCount();
                float f12 = 0.0f;
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = recyclerView.getChildAt(i10);
                    if (childAt != view) {
                        WeakHashMap<View, i2> weakHashMap2 = k1.o0.f18161a;
                        float i11 = o0.i.i(childAt);
                        if (i11 > f12) {
                            f12 = i11;
                        }
                    }
                }
                o0.i.s(view, f12 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f10);
            view.setTranslationY(f11);
        }

        public abstract int b(RecyclerView recyclerView, RecyclerView.b0 b0Var);

        public final int c(RecyclerView recyclerView, int i10, int i11, long j10) {
            if (this.f3300a == -1) {
                this.f3300a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int i12 = this.f3300a;
            float f10 = 1.0f;
            int interpolation = (int) (f3299c.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)) * ((int) Math.signum(i11)) * i12);
            if (j10 <= 2000) {
                f10 = ((float) j10) / 2000.0f;
            }
            int interpolation2 = (int) (f3298b.getInterpolation(f10) * interpolation);
            if (interpolation2 == 0) {
                if (i11 <= 0) {
                    return -1;
                }
                return 1;
            }
            return interpolation2;
        }

        public abstract boolean e(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2);

        public abstract void f(RecyclerView.b0 b0Var);
    }

    /* loaded from: classes.dex */
    public class e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public boolean f3301a = true;

        public e() {
            t.this = r1;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            View m10;
            RecyclerView.b0 I;
            boolean z10;
            int i10;
            if (this.f3301a && (m10 = t.this.m(motionEvent)) != null && (I = t.this.f3284r.I(m10)) != null) {
                t tVar = t.this;
                d dVar = tVar.f3279m;
                RecyclerView recyclerView = tVar.f3284r;
                int b10 = dVar.b(recyclerView, I);
                WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
                int d10 = o0.e.d(recyclerView);
                int i11 = b10 & 3158064;
                if (i11 != 0) {
                    int i12 = b10 & (~i11);
                    if (d10 == 0) {
                        i10 = i11 >> 2;
                    } else {
                        int i13 = i11 >> 1;
                        i12 |= (-3158065) & i13;
                        i10 = (i13 & 3158064) >> 2;
                    }
                    b10 = i12 | i10;
                }
                if ((16711680 & b10) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return;
                }
                int pointerId = motionEvent.getPointerId(0);
                int i14 = t.this.f3278l;
                if (pointerId == i14) {
                    int findPointerIndex = motionEvent.findPointerIndex(i14);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    t tVar2 = t.this;
                    tVar2.f3270d = x10;
                    tVar2.f3271e = y10;
                    tVar2.f3275i = 0.0f;
                    tVar2.f3274h = 0.0f;
                    d dVar2 = tVar2.f3279m;
                    dVar2.getClass();
                    if (!(dVar2 instanceof b.d)) {
                        t.this.r(I, 2);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Animator.AnimatorListener {

        /* renamed from: a */
        public final float f3303a;

        /* renamed from: b */
        public final float f3304b;

        /* renamed from: c */
        public final float f3305c;

        /* renamed from: d */
        public final float f3306d;

        /* renamed from: e */
        public final RecyclerView.b0 f3307e;

        /* renamed from: f */
        public final int f3308f;

        /* renamed from: g */
        public final ValueAnimator f3309g;

        /* renamed from: h */
        public boolean f3310h;

        /* renamed from: i */
        public float f3311i;

        /* renamed from: j */
        public float f3312j;

        /* renamed from: k */
        public boolean f3313k = false;

        /* renamed from: l */
        public boolean f3314l = false;

        /* renamed from: m */
        public float f3315m;

        public f(RecyclerView.b0 b0Var, int i10, float f10, float f11, float f12, float f13) {
            this.f3308f = i10;
            this.f3307e = b0Var;
            this.f3303a = f10;
            this.f3304b = f11;
            this.f3305c = f12;
            this.f3306d = f13;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f3309g = ofFloat;
            ofFloat.addUpdateListener(new v(this));
            ofFloat.setTarget(b0Var.f2927a);
            ofFloat.addListener(this);
            this.f3315m = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f3315m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f3314l) {
                this.f3307e.p(true);
            }
            this.f3314l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void b(View view, View view2);
    }

    public t(b.d dVar) {
        this.f3279m = dVar;
    }

    public static boolean o(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void b(View view) {
        q(view);
        RecyclerView.b0 I = this.f3284r.I(view);
        if (I == null) {
            return;
        }
        RecyclerView.b0 b0Var = this.f3269c;
        if (b0Var != null && I == b0Var) {
            r(null, 0);
            return;
        }
        l(I, false);
        if (this.f3267a.remove(I.f2927a)) {
            this.f3279m.getClass();
            d.a(I);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void f(Rect rect, View view, RecyclerView recyclerView) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float a10;
        float a11;
        float f11 = 0.0f;
        if (this.f3269c != null) {
            n(this.f3268b);
            float[] fArr = this.f3268b;
            f11 = fArr[0];
            f10 = fArr[1];
        } else {
            f10 = 0.0f;
        }
        d dVar = this.f3279m;
        RecyclerView.b0 b0Var = this.f3269c;
        ArrayList arrayList = this.f3282p;
        dVar.getClass();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = (f) arrayList.get(i10);
            float f12 = fVar.f3303a;
            float f13 = fVar.f3305c;
            if (f12 == f13) {
                a10 = fVar.f3307e.f2927a.getTranslationX();
            } else {
                a10 = t0.e.a(f13, f12, fVar.f3315m, f12);
            }
            fVar.f3311i = a10;
            float f14 = fVar.f3304b;
            float f15 = fVar.f3306d;
            if (f14 == f15) {
                a11 = fVar.f3307e.f2927a.getTranslationY();
            } else {
                a11 = t0.e.a(f15, f14, fVar.f3315m, f14);
            }
            fVar.f3312j = a11;
            int save = canvas.save();
            d.d(recyclerView, fVar.f3307e, fVar.f3311i, fVar.f3312j, false);
            canvas.restoreToCount(save);
        }
        if (b0Var != null) {
            int save2 = canvas.save();
            d.d(recyclerView, b0Var, f11, f10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.f3269c != null) {
            n(this.f3268b);
            float[] fArr = this.f3268b;
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        d dVar = this.f3279m;
        RecyclerView.b0 b0Var = this.f3269c;
        ArrayList arrayList = this.f3282p;
        dVar.getClass();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            int save = canvas.save();
            View view = ((f) arrayList.get(i10)).f3307e.f2927a;
            canvas.restoreToCount(save);
        }
        if (b0Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            f fVar = (f) arrayList.get(i11);
            boolean z11 = fVar.f3314l;
            if (z11 && !fVar.f3310h) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final int i(int i10) {
        if ((i10 & 12) != 0) {
            int i11 = this.f3274h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.f3286t;
            if (velocityTracker != null && this.f3278l > -1) {
                d dVar = this.f3279m;
                float f10 = this.f3273g;
                dVar.getClass();
                velocityTracker.computeCurrentVelocity(1000, f10);
                float xVelocity = this.f3286t.getXVelocity(this.f3278l);
                float yVelocity = this.f3286t.getYVelocity(this.f3278l);
                int i12 = xVelocity > 0.0f ? 8 : 4;
                float abs = Math.abs(xVelocity);
                if ((i12 & i10) != 0 && i11 == i12) {
                    d dVar2 = this.f3279m;
                    float f11 = this.f3272f;
                    dVar2.getClass();
                    if (abs >= f11 && abs > Math.abs(yVelocity)) {
                        return i12;
                    }
                }
            }
            this.f3279m.getClass();
            float width = this.f3284r.getWidth() * 0.5f;
            if ((i10 & i11) == 0 || Math.abs(this.f3274h) <= width) {
                return 0;
            }
            return i11;
        }
        return 0;
    }

    public final void j(int i10, int i11, MotionEvent motionEvent) {
        int i12;
        View m10;
        if (this.f3269c == null && i10 == 2 && this.f3280n != 2) {
            this.f3279m.getClass();
            if (this.f3284r.getScrollState() == 1) {
                return;
            }
            RecyclerView.m layoutManager = this.f3284r.getLayoutManager();
            int i13 = this.f3278l;
            RecyclerView.b0 b0Var = null;
            if (i13 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i13);
                float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f3270d);
                float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f3271e);
                float f10 = this.f3283q;
                if ((abs >= f10 || abs2 >= f10) && ((abs <= abs2 || !layoutManager.f()) && ((abs2 <= abs || !layoutManager.g()) && (m10 = m(motionEvent)) != null))) {
                    b0Var = this.f3284r.I(m10);
                }
            }
            if (b0Var == null) {
                return;
            }
            d dVar = this.f3279m;
            RecyclerView recyclerView = this.f3284r;
            int b10 = dVar.b(recyclerView, b0Var);
            WeakHashMap<View, i2> weakHashMap = k1.o0.f18161a;
            int d10 = o0.e.d(recyclerView);
            int i14 = b10 & 3158064;
            if (i14 != 0) {
                int i15 = b10 & (~i14);
                if (d10 == 0) {
                    i12 = i14 >> 2;
                } else {
                    int i16 = i14 >> 1;
                    i15 |= (-3158065) & i16;
                    i12 = (i16 & 3158064) >> 2;
                }
                b10 = i15 | i12;
            }
            int i17 = (b10 & 65280) >> 8;
            if (i17 == 0) {
                return;
            }
            float x10 = motionEvent.getX(i11);
            float y10 = motionEvent.getY(i11);
            float f11 = x10 - this.f3270d;
            float f12 = y10 - this.f3271e;
            float abs3 = Math.abs(f11);
            float abs4 = Math.abs(f12);
            float f13 = this.f3283q;
            if (abs3 < f13 && abs4 < f13) {
                return;
            }
            if (abs3 > abs4) {
                if (f11 < 0.0f && (i17 & 4) == 0) {
                    return;
                }
                if (f11 > 0.0f && (i17 & 8) == 0) {
                    return;
                }
            } else if (f12 < 0.0f && (i17 & 1) == 0) {
                return;
            } else {
                if (f12 > 0.0f && (i17 & 2) == 0) {
                    return;
                }
            }
            this.f3275i = 0.0f;
            this.f3274h = 0.0f;
            this.f3278l = motionEvent.getPointerId(0);
            r(b0Var, 1);
        }
    }

    public final int k(int i10) {
        if ((i10 & 3) != 0) {
            int i11 = this.f3275i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.f3286t;
            if (velocityTracker != null && this.f3278l > -1) {
                d dVar = this.f3279m;
                float f10 = this.f3273g;
                dVar.getClass();
                velocityTracker.computeCurrentVelocity(1000, f10);
                float xVelocity = this.f3286t.getXVelocity(this.f3278l);
                float yVelocity = this.f3286t.getYVelocity(this.f3278l);
                int i12 = yVelocity > 0.0f ? 2 : 1;
                float abs = Math.abs(yVelocity);
                if ((i12 & i10) != 0 && i12 == i11) {
                    d dVar2 = this.f3279m;
                    float f11 = this.f3272f;
                    dVar2.getClass();
                    if (abs >= f11 && abs > Math.abs(xVelocity)) {
                        return i12;
                    }
                }
            }
            this.f3279m.getClass();
            float height = this.f3284r.getHeight() * 0.5f;
            if ((i10 & i11) == 0 || Math.abs(this.f3275i) <= height) {
                return 0;
            }
            return i11;
        }
        return 0;
    }

    public final void l(RecyclerView.b0 b0Var, boolean z10) {
        f fVar;
        int size = this.f3282p.size();
        do {
            size--;
            if (size >= 0) {
                fVar = (f) this.f3282p.get(size);
            } else {
                return;
            }
        } while (fVar.f3307e != b0Var);
        fVar.f3313k |= z10;
        if (!fVar.f3314l) {
            fVar.f3309g.cancel();
        }
        this.f3282p.remove(size);
    }

    public final View m(MotionEvent motionEvent) {
        f fVar;
        View view;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.b0 b0Var = this.f3269c;
        if (b0Var != null) {
            View view2 = b0Var.f2927a;
            if (o(view2, x10, y10, this.f3276j + this.f3274h, this.f3277k + this.f3275i)) {
                return view2;
            }
        }
        int size = this.f3282p.size();
        do {
            size--;
            if (size >= 0) {
                fVar = (f) this.f3282p.get(size);
                view = fVar.f3307e.f2927a;
            } else {
                RecyclerView recyclerView = this.f3284r;
                int e10 = recyclerView.f2873e.e();
                while (true) {
                    e10--;
                    if (e10 >= 0) {
                        View d10 = recyclerView.f2873e.d(e10);
                        float translationX = d10.getTranslationX();
                        float translationY = d10.getTranslationY();
                        if (x10 >= d10.getLeft() + translationX && x10 <= d10.getRight() + translationX && y10 >= d10.getTop() + translationY && y10 <= d10.getBottom() + translationY) {
                            return d10;
                        }
                    } else {
                        return null;
                    }
                }
            }
        } while (!o(view, x10, y10, fVar.f3311i, fVar.f3312j));
        return view;
    }

    public final void n(float[] fArr) {
        if ((this.f3281o & 12) != 0) {
            fArr[0] = (this.f3276j + this.f3274h) - this.f3269c.f2927a.getLeft();
        } else {
            fArr[0] = this.f3269c.f2927a.getTranslationX();
        }
        if ((this.f3281o & 3) != 0) {
            fArr[1] = (this.f3277k + this.f3275i) - this.f3269c.f2927a.getTop();
        } else {
            fArr[1] = this.f3269c.f2927a.getTranslationY();
        }
    }

    public final void p(RecyclerView.b0 b0Var) {
        ArrayList arrayList;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i10;
        int i11;
        if (this.f3284r.isLayoutRequested() || this.f3280n != 2) {
            return;
        }
        this.f3279m.getClass();
        int i12 = (int) (this.f3276j + this.f3274h);
        int i13 = (int) (this.f3277k + this.f3275i);
        if (Math.abs(i13 - b0Var.f2927a.getTop()) < b0Var.f2927a.getHeight() * 0.5f && Math.abs(i12 - b0Var.f2927a.getLeft()) < b0Var.f2927a.getWidth() * 0.5f) {
            return;
        }
        ArrayList arrayList2 = this.f3287u;
        if (arrayList2 == null) {
            this.f3287u = new ArrayList();
            this.f3288v = new ArrayList();
        } else {
            arrayList2.clear();
            this.f3288v.clear();
        }
        this.f3279m.getClass();
        int round = Math.round(this.f3276j + this.f3274h) - 0;
        int round2 = Math.round(this.f3277k + this.f3275i) - 0;
        int width = b0Var.f2927a.getWidth() + round + 0;
        int height = b0Var.f2927a.getHeight() + round2 + 0;
        int i14 = (round + width) / 2;
        int i15 = (round2 + height) / 2;
        RecyclerView.m layoutManager = this.f3284r.getLayoutManager();
        int y10 = layoutManager.y();
        int i16 = 0;
        while (i16 < y10) {
            View x10 = layoutManager.x(i16);
            if (x10 != b0Var.f2927a && x10.getBottom() >= round2 && x10.getTop() <= height && x10.getRight() >= round && x10.getLeft() <= width) {
                RecyclerView.b0 I = this.f3284r.I(x10);
                this.f3279m.getClass();
                int abs5 = Math.abs(i14 - ((x10.getRight() + x10.getLeft()) / 2));
                int abs6 = Math.abs(i15 - ((x10.getBottom() + x10.getTop()) / 2));
                int i17 = (abs6 * abs6) + (abs5 * abs5);
                int size = this.f3287u.size();
                i10 = round;
                i11 = round2;
                int i18 = 0;
                int i19 = 0;
                while (i18 < size) {
                    int i20 = size;
                    if (i17 <= ((Integer) this.f3288v.get(i18)).intValue()) {
                        break;
                    }
                    i19++;
                    i18++;
                    size = i20;
                }
                this.f3287u.add(i19, I);
                this.f3288v.add(i19, Integer.valueOf(i17));
            } else {
                i10 = round;
                i11 = round2;
            }
            i16++;
            round = i10;
            round2 = i11;
        }
        ArrayList arrayList3 = this.f3287u;
        if (arrayList3.size() == 0) {
            return;
        }
        this.f3279m.getClass();
        int width2 = b0Var.f2927a.getWidth() + i12;
        int height2 = b0Var.f2927a.getHeight() + i13;
        int left2 = i12 - b0Var.f2927a.getLeft();
        int top2 = i13 - b0Var.f2927a.getTop();
        int size2 = arrayList3.size();
        RecyclerView.b0 b0Var2 = null;
        int i21 = 0;
        int i22 = -1;
        while (i21 < size2) {
            RecyclerView.b0 b0Var3 = (RecyclerView.b0) arrayList3.get(i21);
            if (left2 > 0 && (right = b0Var3.f2927a.getRight() - width2) < 0) {
                arrayList = arrayList3;
                if (b0Var3.f2927a.getRight() > b0Var.f2927a.getRight() && (abs4 = Math.abs(right)) > i22) {
                    i22 = abs4;
                    b0Var2 = b0Var3;
                }
            } else {
                arrayList = arrayList3;
            }
            if (left2 < 0 && (left = b0Var3.f2927a.getLeft() - i12) > 0 && b0Var3.f2927a.getLeft() < b0Var.f2927a.getLeft() && (abs3 = Math.abs(left)) > i22) {
                i22 = abs3;
                b0Var2 = b0Var3;
            }
            if (top2 < 0 && (top = b0Var3.f2927a.getTop() - i13) > 0 && b0Var3.f2927a.getTop() < b0Var.f2927a.getTop() && (abs2 = Math.abs(top)) > i22) {
                i22 = abs2;
                b0Var2 = b0Var3;
            }
            if (top2 > 0 && (bottom = b0Var3.f2927a.getBottom() - height2) < 0 && b0Var3.f2927a.getBottom() > b0Var.f2927a.getBottom() && (abs = Math.abs(bottom)) > i22) {
                i22 = abs;
                b0Var2 = b0Var3;
            }
            i21++;
            arrayList3 = arrayList;
        }
        if (b0Var2 == null) {
            this.f3287u.clear();
            this.f3288v.clear();
            return;
        }
        int c10 = b0Var2.c();
        b0Var.c();
        if (this.f3279m.e(this.f3284r, b0Var, b0Var2)) {
            d dVar = this.f3279m;
            RecyclerView recyclerView = this.f3284r;
            dVar.getClass();
            RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
            if (layoutManager2 instanceof g) {
                ((g) layoutManager2).b(b0Var.f2927a, b0Var2.f2927a);
                return;
            }
            if (layoutManager2.f()) {
                View view = b0Var2.f2927a;
                if (view.getLeft() - RecyclerView.m.C(view) <= recyclerView.getPaddingLeft()) {
                    recyclerView.d0(c10);
                }
                View view2 = b0Var2.f2927a;
                if (RecyclerView.m.J(view2) + view2.getRight() >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.d0(c10);
                }
            }
            if (layoutManager2.g()) {
                View view3 = b0Var2.f2927a;
                if (view3.getTop() - RecyclerView.m.L(view3) <= recyclerView.getPaddingTop()) {
                    recyclerView.d0(c10);
                }
                View view4 = b0Var2.f2927a;
                if (RecyclerView.m.w(view4) + view4.getBottom() >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.d0(c10);
                }
            }
        }
    }

    public final void q(View view) {
        if (view == this.f3289w) {
            this.f3289w = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x00b4, code lost:
        if (r0 == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00b6, code lost:
        r0 = r1 << 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00b9, code lost:
        r0 = r1 << 1;
        r2 = r2 | (r0 & (-789517));
        r0 = (r0 & 789516) << 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x00c0, code lost:
        r2 = r0 | r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00c7, code lost:
        if (r2 > 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x00e7, code lost:
        if (r0 == 0) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(androidx.recyclerview.widget.RecyclerView.b0 r24, int r25) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.t.r(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    public final void s(int i10, int i11, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f3270d;
        this.f3274h = f10;
        this.f3275i = y10 - this.f3271e;
        if ((i10 & 4) == 0) {
            this.f3274h = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f3274h = Math.min(0.0f, this.f3274h);
        }
        if ((i10 & 1) == 0) {
            this.f3275i = Math.max(0.0f, this.f3275i);
        }
        if ((i10 & 2) == 0) {
            this.f3275i = Math.min(0.0f, this.f3275i);
        }
    }
}
