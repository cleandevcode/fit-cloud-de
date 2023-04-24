package r1;

import android.content.Context;
import android.support.v4.media.d;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import k1.o0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: v */
    public static final a f25165v = new a();

    /* renamed from: a */
    public int f25166a;

    /* renamed from: b */
    public int f25167b;

    /* renamed from: d */
    public float[] f25169d;

    /* renamed from: e */
    public float[] f25170e;

    /* renamed from: f */
    public float[] f25171f;

    /* renamed from: g */
    public float[] f25172g;

    /* renamed from: h */
    public int[] f25173h;

    /* renamed from: i */
    public int[] f25174i;

    /* renamed from: j */
    public int[] f25175j;

    /* renamed from: k */
    public int f25176k;

    /* renamed from: l */
    public VelocityTracker f25177l;

    /* renamed from: m */
    public float f25178m;

    /* renamed from: n */
    public float f25179n;

    /* renamed from: o */
    public int f25180o;

    /* renamed from: p */
    public OverScroller f25181p;

    /* renamed from: q */
    public final AbstractC0457c f25182q;

    /* renamed from: r */
    public View f25183r;

    /* renamed from: s */
    public boolean f25184s;

    /* renamed from: t */
    public final ViewGroup f25185t;

    /* renamed from: c */
    public int f25168c = -1;

    /* renamed from: u */
    public final b f25186u = new b();

    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            c.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.p(0);
        }
    }

    /* renamed from: r1.c$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0457c {
        public abstract int a(View view, int i10);

        public abstract int b(View view, int i10);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public void e(View view, int i10) {
        }

        public abstract void f(int i10);

        public abstract void g(View view, int i10, int i11);

        public abstract void h(View view, float f10, float f11);

        public abstract boolean i(View view, int i10);
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0457c abstractC0457c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0457c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f25185t = viewGroup;
        this.f25182q = abstractC0457c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f25180o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f25167b = viewConfiguration.getScaledTouchSlop();
        this.f25178m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f25179n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f25181p = new OverScroller(context, f25165v);
    }

    public final void a() {
        this.f25168c = -1;
        float[] fArr = this.f25169d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f25170e, 0.0f);
            Arrays.fill(this.f25171f, 0.0f);
            Arrays.fill(this.f25172g, 0.0f);
            Arrays.fill(this.f25173h, 0);
            Arrays.fill(this.f25174i, 0);
            Arrays.fill(this.f25175j, 0);
            this.f25176k = 0;
        }
        VelocityTracker velocityTracker = this.f25177l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f25177l = null;
        }
    }

    public final void b(View view, int i10) {
        if (view.getParent() == this.f25185t) {
            this.f25183r = view;
            this.f25168c = i10;
            this.f25182q.e(view, i10);
            p(1);
            return;
        }
        StringBuilder a10 = d.a("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        a10.append(this.f25185t);
        a10.append(")");
        throw new IllegalArgumentException(a10.toString());
    }

    public final boolean c(float f10, int i10, int i11, float f11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f25173h[i10] & i11) != i11 || (0 & i11) == 0 || (this.f25175j[i10] & i11) == i11 || (this.f25174i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f25167b;
        if (abs > i12 || abs2 > i12) {
            if (abs < abs2 * 0.5f) {
                this.f25182q.getClass();
            }
            return (this.f25174i[i10] & i11) == 0 && abs > ((float) this.f25167b);
        }
        return false;
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f25182q.c(view) > 0;
        boolean z11 = this.f25182q.d() > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f25167b) : z11 && Math.abs(f11) > ((float) this.f25167b);
        }
        float f12 = f11 * f11;
        int i10 = this.f25167b;
        return f12 + (f10 * f10) > ((float) (i10 * i10));
    }

    public final void e(int i10) {
        float[] fArr = this.f25169d;
        if (fArr != null) {
            int i11 = this.f25176k;
            boolean z10 = true;
            int i12 = 1 << i10;
            if ((i12 & i11) == 0) {
                z10 = false;
            }
            if (z10) {
                fArr[i10] = 0.0f;
                this.f25170e[i10] = 0.0f;
                this.f25171f[i10] = 0.0f;
                this.f25172g[i10] = 0.0f;
                this.f25173h[i10] = 0;
                this.f25174i[i10] = 0;
                this.f25175j[i10] = 0;
                this.f25176k = (~i12) & i11;
            }
        }
    }

    public final int f(int i10, int i11, int i12) {
        int width;
        int abs;
        if (i10 == 0) {
            return 0;
        }
        float width2 = this.f25185t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean g() {
        if (this.f25166a == 2) {
            boolean computeScrollOffset = this.f25181p.computeScrollOffset();
            int currX = this.f25181p.getCurrX();
            int currY = this.f25181p.getCurrY();
            int left = currX - this.f25183r.getLeft();
            int top = currY - this.f25183r.getTop();
            if (left != 0) {
                o0.i(this.f25183r, left);
            }
            if (top != 0) {
                o0.j(this.f25183r, top);
            }
            if (left != 0 || top != 0) {
                this.f25182q.g(this.f25183r, currX, currY);
            }
            if (computeScrollOffset && currX == this.f25181p.getFinalX() && currY == this.f25181p.getFinalY()) {
                this.f25181p.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f25185t.post(this.f25186u);
            }
        }
        return this.f25166a == 2;
    }

    public final View h(int i10, int i11) {
        for (int childCount = this.f25185t.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f25185t;
            this.f25182q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f25183r.getLeft();
        int top = this.f25183r.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f25181p.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f25183r;
        int i16 = (int) this.f25179n;
        int i17 = (int) this.f25178m;
        int abs = Math.abs(i12);
        if (abs < i16) {
            i12 = 0;
        } else if (abs > i17) {
            if (i12 > 0) {
                i12 = i17;
            } else {
                i12 = -i17;
            }
        }
        int i18 = (int) this.f25179n;
        int i19 = (int) this.f25178m;
        int abs2 = Math.abs(i13);
        if (abs2 < i18) {
            i13 = 0;
        } else if (abs2 > i19) {
            if (i13 > 0) {
                i13 = i19;
            } else {
                i13 = -i19;
            }
        }
        int abs3 = Math.abs(i14);
        int abs4 = Math.abs(i15);
        int abs5 = Math.abs(i12);
        int abs6 = Math.abs(i13);
        int i20 = abs5 + abs6;
        int i21 = abs3 + abs4;
        if (i12 != 0) {
            f10 = abs5;
            f11 = i20;
        } else {
            f10 = abs3;
            f11 = i21;
        }
        float f14 = f10 / f11;
        if (i13 != 0) {
            f12 = abs6;
            f13 = i20;
        } else {
            f12 = abs4;
            f13 = i21;
        }
        float f15 = f12 / f13;
        this.f25181p.startScroll(left, top, i14, i15, (int) ((f(i15, i13, this.f25182q.d()) * f15) + (f(i14, i12, this.f25182q.c(view)) * f14)));
        p(2);
        return true;
    }

    public final boolean j(int i10) {
        boolean z10;
        if ((this.f25176k & (1 << i10)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f25177l == null) {
            this.f25177l = VelocityTracker.obtain();
        }
        this.f25177l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f25166a == 1 && pointerId == this.f25168c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i11 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i11);
                                            if (pointerId2 != this.f25168c) {
                                                View h10 = h((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                                View view = this.f25183r;
                                                if (h10 == view && s(view, pointerId2)) {
                                                    i10 = this.f25168c;
                                                    break;
                                                }
                                            }
                                            i11++;
                                        } else {
                                            i10 = -1;
                                            break;
                                        }
                                    }
                                    if (i10 == -1) {
                                        l();
                                    }
                                }
                                e(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x10 = motionEvent.getX(actionIndex);
                        float y10 = motionEvent.getY(actionIndex);
                        n(x10, y10, pointerId3);
                        if (this.f25166a == 0) {
                            s(h((int) x10, (int) y10), pointerId3);
                            if ((this.f25173h[pointerId3] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i12 = (int) x10;
                            int i13 = (int) y10;
                            View view2 = this.f25183r;
                            if (view2 != null && i12 >= view2.getLeft() && i12 < view2.getRight() && i13 >= view2.getTop() && i13 < view2.getBottom()) {
                                i11 = 1;
                            }
                            if (i11 != 0) {
                                s(this.f25183r, pointerId3);
                                return;
                            }
                            return;
                        }
                    } else if (this.f25166a == 1) {
                        this.f25184s = true;
                        this.f25182q.h(this.f25183r, 0.0f, 0.0f);
                        this.f25184s = false;
                        if (this.f25166a == 1) {
                            p(0);
                        }
                    }
                } else {
                    if (this.f25166a == 1) {
                        if (j(this.f25168c)) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f25168c);
                            float x11 = motionEvent.getX(findPointerIndex);
                            float y11 = motionEvent.getY(findPointerIndex);
                            float[] fArr = this.f25171f;
                            int i14 = this.f25168c;
                            int i15 = (int) (x11 - fArr[i14]);
                            int i16 = (int) (y11 - this.f25172g[i14]);
                            int left = this.f25183r.getLeft() + i15;
                            int top = this.f25183r.getTop() + i16;
                            int left2 = this.f25183r.getLeft();
                            int top2 = this.f25183r.getTop();
                            if (i15 != 0) {
                                left = this.f25182q.a(this.f25183r, left);
                                o0.i(this.f25183r, left - left2);
                            }
                            if (i16 != 0) {
                                top = this.f25182q.b(this.f25183r, top);
                                o0.j(this.f25183r, top - top2);
                            }
                            if (i15 != 0 || i16 != 0) {
                                this.f25182q.g(this.f25183r, left, top);
                            }
                        } else {
                            return;
                        }
                    } else {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (i11 < pointerCount2) {
                            int pointerId4 = motionEvent.getPointerId(i11);
                            if (j(pointerId4)) {
                                float x12 = motionEvent.getX(i11);
                                float y12 = motionEvent.getY(i11);
                                float f10 = x12 - this.f25169d[pointerId4];
                                float f11 = y12 - this.f25170e[pointerId4];
                                m(f10, f11, pointerId4);
                                if (this.f25166a != 1) {
                                    View h11 = h((int) x12, (int) y12);
                                    if (d(h11, f10, f11) && s(h11, pointerId4)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i11++;
                        }
                    }
                    o(motionEvent);
                    return;
                }
            } else if (this.f25166a == 1) {
                l();
            }
            a();
            return;
        }
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View h12 = h((int) x13, (int) y13);
        n(x13, y13, pointerId5);
        s(h12, pointerId5);
        if ((this.f25173h[pointerId5] & 0) == 0) {
            return;
        }
        this.f25182q.getClass();
    }

    public final void l() {
        this.f25177l.computeCurrentVelocity(1000, this.f25178m);
        float xVelocity = this.f25177l.getXVelocity(this.f25168c);
        float f10 = this.f25179n;
        float f11 = this.f25178m;
        float abs = Math.abs(xVelocity);
        float f12 = 0.0f;
        if (abs < f10) {
            xVelocity = 0.0f;
        } else if (abs > f11) {
            if (xVelocity > 0.0f) {
                xVelocity = f11;
            } else {
                xVelocity = -f11;
            }
        }
        float yVelocity = this.f25177l.getYVelocity(this.f25168c);
        float f13 = this.f25179n;
        float f14 = this.f25178m;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f13) {
            if (abs2 > f14) {
                if (yVelocity > 0.0f) {
                    f12 = f14;
                } else {
                    yVelocity = -f14;
                }
            }
            f12 = yVelocity;
        }
        this.f25184s = true;
        this.f25182q.h(this.f25183r, xVelocity, f12);
        this.f25184s = false;
        if (this.f25166a == 1) {
            p(0);
        }
    }

    public final void m(float f10, float f11, int i10) {
        boolean c10 = c(f10, i10, 1, f11);
        if (c(f11, i10, 4, f10)) {
            c10 |= true;
        }
        if (c(f10, i10, 2, f11)) {
            c10 |= true;
        }
        if (c(f11, i10, 8, f10)) {
            c10 |= true;
        }
        if (c10) {
            int[] iArr = this.f25174i;
            iArr[i10] = iArr[i10] | c10;
            this.f25182q.getClass();
        }
    }

    public final void n(float f10, float f11, int i10) {
        float[] fArr = this.f25169d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f25170e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f25171f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f25172g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f25173h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f25174i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f25175j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f25169d = fArr2;
            this.f25170e = fArr3;
            this.f25171f = fArr4;
            this.f25172g = fArr5;
            this.f25173h = iArr;
            this.f25174i = iArr2;
            this.f25175j = iArr3;
        }
        float[] fArr9 = this.f25169d;
        this.f25171f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f25170e;
        this.f25172g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f25173h;
        int i13 = (int) f10;
        int i14 = (int) f11;
        if (i13 < this.f25185t.getLeft() + this.f25180o) {
            i11 = 1;
        }
        if (i14 < this.f25185t.getTop() + this.f25180o) {
            i11 |= 4;
        }
        if (i13 > this.f25185t.getRight() - this.f25180o) {
            i11 |= 2;
        }
        if (i14 > this.f25185t.getBottom() - this.f25180o) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.f25176k |= 1 << i10;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (j(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f25171f[pointerId] = x10;
                this.f25172g[pointerId] = y10;
            }
        }
    }

    public final void p(int i10) {
        this.f25185t.removeCallbacks(this.f25186u);
        if (this.f25166a != i10) {
            this.f25166a = i10;
            this.f25182q.f(i10);
            if (this.f25166a == 0) {
                this.f25183r = null;
            }
        }
    }

    public final boolean q(int i10, int i11) {
        if (this.f25184s) {
            return i(i10, i11, (int) this.f25177l.getXVelocity(this.f25168c), (int) this.f25177l.getYVelocity(this.f25168c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x00db, code lost:
        if (r12 != r11) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.c.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i10) {
        if (view == this.f25183r && this.f25168c == i10) {
            return true;
        }
        if (view == null || !this.f25182q.i(view, i10)) {
            return false;
        }
        this.f25168c = i10;
        b(view, i10);
        return true;
    }
}
