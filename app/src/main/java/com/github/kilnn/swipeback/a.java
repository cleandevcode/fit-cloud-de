package com.github.kilnn.swipeback;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.github.kilnn.swipeback.SwipeBackLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import o1.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: x */
    public static final animation.InterpolatorC0089a f5888x = new animation.InterpolatorC0089a();

    /* renamed from: a */
    public int f5889a;

    /* renamed from: b */
    public int f5890b;

    /* renamed from: d */
    public float[] f5892d;

    /* renamed from: e */
    public float[] f5893e;

    /* renamed from: f */
    public float[] f5894f;

    /* renamed from: g */
    public float[] f5895g;

    /* renamed from: h */
    public int[] f5896h;

    /* renamed from: i */
    public int[] f5897i;

    /* renamed from: j */
    public int[] f5898j;

    /* renamed from: k */
    public int f5899k;

    /* renamed from: l */
    public VelocityTracker f5900l;

    /* renamed from: m */
    public float f5901m;

    /* renamed from: n */
    public float f5902n;

    /* renamed from: o */
    public int f5903o;

    /* renamed from: p */
    public int f5904p;

    /* renamed from: q */
    public n f5905q;

    /* renamed from: r */
    public final c f5906r;

    /* renamed from: s */
    public View f5907s;

    /* renamed from: t */
    public boolean f5908t;

    /* renamed from: u */
    public final ViewGroup f5909u;

    /* renamed from: w */
    public boolean f5911w;

    /* renamed from: c */
    public int f5891c = -1;

    /* renamed from: v */
    public final b f5910v = new b();

    /* renamed from: com.github.kilnn.swipeback.a$a */
    /* loaded from: classes.dex */
    public static class animation.InterpolatorC0089a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.n(0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a(int i10, int i11);
    }

    public a(Context context, ViewGroup viewGroup, SwipeBackLayout.b bVar) {
        if (viewGroup != null) {
            this.f5909u = viewGroup;
            this.f5906r = bVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f5903o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f5890b = viewConfiguration.getScaledTouchSlop();
            this.f5901m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f5902n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f5905q = new n(context);
            return;
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final void a() {
        this.f5891c = -1;
        float[] fArr = this.f5892d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f5893e, 0.0f);
            Arrays.fill(this.f5894f, 0.0f);
            Arrays.fill(this.f5895g, 0.0f);
            Arrays.fill(this.f5896h, 0);
            Arrays.fill(this.f5897i, 0);
            Arrays.fill(this.f5898j, 0);
            this.f5899k = 0;
        }
        VelocityTracker velocityTracker = this.f5900l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5900l = null;
        }
    }

    public final boolean b(float f10, int i10, int i11, float f11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f5896h[i10] & i11) != i11 || (this.f5904p & i11) == 0 || (this.f5898j[i10] & i11) == i11 || (this.f5897i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f5890b;
        if (abs > i12 || abs2 > i12) {
            if (abs < abs2 * 0.5f) {
                this.f5906r.getClass();
            }
            return (this.f5897i[i10] & i11) == 0 && abs > ((float) this.f5890b);
        }
        return false;
    }

    public final boolean c(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        if ((this.f5899k & (1 << i11)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if ((i10 & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i10 & 2) == 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        float f10 = this.f5894f[i11] - this.f5892d[i11];
        float f11 = this.f5895g[i11] - this.f5893e[i11];
        if (z11 && z12) {
            float f12 = f11 * f11;
            int i12 = this.f5890b;
            if (f12 + (f10 * f10) > i12 * i12) {
                return true;
            }
            return false;
        } else if (z11) {
            if (Math.abs(f10) > this.f5890b) {
                return true;
            }
            return false;
        } else if (z12 && Math.abs(f11) > this.f5890b) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean d(View view, float f10, float f11) {
        boolean z10;
        boolean z11;
        if (view == null) {
            return false;
        }
        c cVar = this.f5906r;
        if ((SwipeBackLayout.this.f5869a & 3) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((SwipeBackLayout.this.f5869a & 8) > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            float f12 = f11 * f11;
            int i10 = this.f5890b;
            if (f12 + (f10 * f10) <= i10 * i10) {
                return false;
            }
            return true;
        } else if (z10) {
            if (Math.abs(f10) <= this.f5890b) {
                return false;
            }
            return true;
        } else if (!z11 || Math.abs(f11) <= this.f5890b) {
            return false;
        } else {
            return true;
        }
    }

    public final void e(int i10) {
        float[] fArr = this.f5892d;
        if (fArr == null) {
            return;
        }
        fArr[i10] = 0.0f;
        this.f5893e[i10] = 0.0f;
        this.f5894f[i10] = 0.0f;
        this.f5895g[i10] = 0.0f;
        this.f5896h[i10] = 0;
        this.f5897i[i10] = 0;
        this.f5898j[i10] = 0;
        this.f5899k = (~(1 << i10)) & this.f5899k;
    }

    public final int f(int i10, int i11, int i12) {
        int width;
        int abs;
        if (i10 == 0) {
            return 0;
        }
        float width2 = this.f5909u.getWidth() / 2;
        float sin = (((float) Math.sin((float) ((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.4712389167638204d))) * width2) + width2;
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final void g(float f10, float f11) {
        int i10;
        int i11;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        this.f5908t = true;
        c cVar = this.f5906r;
        View view = this.f5907s;
        SwipeBackLayout.b bVar = (SwipeBackLayout.b) cVar;
        bVar.getClass();
        int width = view.getWidth();
        int height = view.getHeight();
        SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
        int i13 = swipeBackLayout.f5885q;
        if ((i13 & 1) != 0) {
            int i14 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i14 > 0 || (i14 == 0 && swipeBackLayout.f5874f > swipeBackLayout.f5870b)) {
                i12 = swipeBackLayout.f5878j.getIntrinsicWidth() + width + 10;
                i11 = 0;
            }
            i12 = 0;
            i11 = 0;
        } else {
            if ((i13 & 2) != 0) {
                if (f10 < 0.0f || (f10 == 0.0f && swipeBackLayout.f5874f > swipeBackLayout.f5870b)) {
                    i12 = -(swipeBackLayout.f5878j.getIntrinsicWidth() + width + 10);
                    i11 = 0;
                }
            } else if ((i13 & 8) != 0) {
                if (f11 >= 0.0f && (f11 != 0.0f || swipeBackLayout.f5874f <= swipeBackLayout.f5870b)) {
                    i10 = 0;
                } else {
                    i10 = -(swipeBackLayout.f5880l.getIntrinsicHeight() + height + 10);
                }
                i11 = i10;
                i12 = 0;
            }
            i12 = 0;
            i11 = 0;
        }
        a aVar = SwipeBackLayout.this.f5873e;
        if (aVar.f5908t) {
            int xVelocity = (int) aVar.f5900l.getXVelocity(aVar.f5891c);
            int yVelocity = (int) aVar.f5900l.getYVelocity(aVar.f5891c);
            int left = aVar.f5907s.getLeft();
            int top = aVar.f5907s.getTop();
            int i15 = i12 - left;
            int i16 = i11 - top;
            if (i15 == 0 && i16 == 0) {
                aVar.f5905q.f22594a.abortAnimation();
                aVar.n(0);
            } else {
                int i17 = (int) aVar.f5902n;
                int i18 = (int) aVar.f5901m;
                int abs = Math.abs(xVelocity);
                if (abs < i17) {
                    xVelocity = 0;
                } else if (abs > i18) {
                    if (xVelocity > 0) {
                        xVelocity = i18;
                    } else {
                        xVelocity = -i18;
                    }
                }
                int i19 = (int) aVar.f5902n;
                int i20 = (int) aVar.f5901m;
                int abs2 = Math.abs(yVelocity);
                if (abs2 < i19) {
                    yVelocity = 0;
                } else if (abs2 > i20) {
                    if (yVelocity > 0) {
                        yVelocity = i20;
                    } else {
                        yVelocity = -i20;
                    }
                }
                int abs3 = Math.abs(i15);
                int abs4 = Math.abs(i16);
                int abs5 = Math.abs(xVelocity);
                int abs6 = Math.abs(yVelocity);
                int i21 = abs5 + abs6;
                int i22 = abs3 + abs4;
                if (xVelocity != 0) {
                    f12 = abs5;
                    f13 = i21;
                } else {
                    f12 = abs3;
                    f13 = i22;
                }
                float f16 = f12 / f13;
                if (yVelocity != 0) {
                    f15 = abs6;
                    f14 = i21;
                } else {
                    float f17 = abs4;
                    f14 = i22;
                    f15 = f17;
                }
                OverScroller overScroller = aVar.f5905q.f22594a;
                overScroller.startScroll(left, top, i15, i16, (int) ((aVar.f(i16, yVelocity, SwipeBackLayout.this.f5869a & 8) * (f15 / f14)) + (aVar.f(i15, xVelocity, SwipeBackLayout.this.f5869a & 3) * f16)));
                aVar.n(2);
            }
            SwipeBackLayout.this.invalidate();
            this.f5908t = false;
            if (this.f5889a == 1) {
                n(0);
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final View h(int i10, int i11) {
        for (int childCount = this.f5909u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f5909u;
            this.f5906r.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i10, int i11) {
        boolean z10;
        if ((this.f5899k & (1 << i11)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (i10 & this.f5896h[i11]) != 0) {
            return true;
        }
        return false;
    }

    public final void j() {
        this.f5900l.computeCurrentVelocity(1000, this.f5901m);
        float xVelocity = this.f5900l.getXVelocity(this.f5891c);
        float f10 = this.f5902n;
        float f11 = this.f5901m;
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
        float yVelocity = this.f5900l.getYVelocity(this.f5891c);
        float f13 = this.f5902n;
        float f14 = this.f5901m;
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
        g(xVelocity, f12);
    }

    public final void k(float f10, float f11, int i10) {
        boolean b10 = b(f10, i10, 1, f11);
        if (b(f11, i10, 4, f10)) {
            b10 |= true;
        }
        if (b(f10, i10, 2, f11)) {
            b10 |= true;
        }
        if (b(f11, i10, 8, f10)) {
            b10 |= true;
        }
        if (b10) {
            int[] iArr = this.f5897i;
            iArr[i10] = iArr[i10] | b10;
            this.f5906r.getClass();
        }
    }

    public final void l(float f10, float f11, int i10) {
        float[] fArr = this.f5892d;
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
                float[] fArr6 = this.f5893e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f5894f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f5895g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f5896h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f5897i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f5898j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f5892d = fArr2;
            this.f5893e = fArr3;
            this.f5894f = fArr4;
            this.f5895g = fArr5;
            this.f5896h = iArr;
            this.f5897i = iArr2;
            this.f5898j = iArr3;
        }
        float[] fArr9 = this.f5892d;
        this.f5894f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f5893e;
        this.f5895g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f5896h;
        int i13 = (int) f10;
        int i14 = (int) f11;
        if (this.f5911w) {
            i11 = 1;
        } else {
            if (i13 < this.f5909u.getLeft() + this.f5903o) {
                i11 = 1;
            }
            if (i14 < this.f5909u.getTop() + this.f5903o) {
                i11 = 4;
            }
            if (i13 > this.f5909u.getRight() - this.f5903o) {
                i11 = 2;
            }
            if (i14 > this.f5909u.getBottom() - this.f5903o) {
                i11 = 8;
            }
        }
        iArr7[i10] = i11;
        this.f5899k |= 1 << i10;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            float x10 = motionEvent.getX(i10);
            float y10 = motionEvent.getY(i10);
            this.f5894f[pointerId] = x10;
            this.f5895g[pointerId] = y10;
        }
    }

    public final void n(int i10) {
        if (this.f5889a != i10) {
            this.f5889a = i10;
            SwipeBackLayout.b bVar = (SwipeBackLayout.b) this.f5906r;
            ArrayList arrayList = SwipeBackLayout.this.f5877i;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = SwipeBackLayout.this.f5877i.iterator();
                while (it.hasNext()) {
                    float f10 = SwipeBackLayout.this.f5874f;
                    ((SwipeBackLayout.a) it.next()).a();
                }
            }
            if (i10 == 0) {
                this.f5907s = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x00d6, code lost:
        if ((r10.f5896h[r11] & r10.f5904p) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00d8, code lost:
        r10.f5906r.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0053, code lost:
        if ((r10.f5896h[r0] & r10.f5904p) != 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r0 = r11.getActionMasked()
            int r1 = r11.getActionIndex()
            if (r0 != 0) goto Ld
            r10.a()
        Ld:
            android.view.VelocityTracker r2 = r10.f5900l
            if (r2 != 0) goto L17
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r10.f5900l = r2
        L17:
            android.view.VelocityTracker r2 = r10.f5900l
            r2.addMovement(r11)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto Laf
            if (r0 == r4) goto Lab
            if (r0 == r2) goto L68
            r5 = 3
            if (r0 == r5) goto Lab
            r5 = 5
            if (r0 == r5) goto L39
            r2 = 6
            if (r0 == r2) goto L30
            goto Ldd
        L30:
            int r11 = r11.getPointerId(r1)
            r10.e(r11)
            goto Ldd
        L39:
            int r0 = r11.getPointerId(r1)
            float r5 = r11.getX(r1)
            float r11 = r11.getY(r1)
            r10.l(r5, r11, r0)
            int r1 = r10.f5889a
            if (r1 != 0) goto L57
            int[] r11 = r10.f5896h
            r11 = r11[r0]
            int r0 = r10.f5904p
            r11 = r11 & r0
            if (r11 == 0) goto Ldd
            goto Ld8
        L57:
            if (r1 != r2) goto Ldd
            int r1 = (int) r5
            int r11 = (int) r11
            android.view.View r11 = r10.h(r1, r11)
            android.view.View r1 = r10.f5907s
            if (r11 != r1) goto Ldd
            r10.p(r11, r0)
            goto Ldd
        L68:
            int r0 = r11.getPointerCount()
            r1 = 0
        L6d:
            if (r1 >= r0) goto La7
            int r2 = r11.getPointerId(r1)
            float r5 = r11.getX(r1)
            float r6 = r11.getY(r1)
            float[] r7 = r10.f5892d
            r7 = r7[r2]
            float r7 = r5 - r7
            float[] r8 = r10.f5893e
            r8 = r8[r2]
            float r8 = r6 - r8
            r10.k(r7, r8, r2)
            int r9 = r10.f5889a
            if (r9 != r4) goto L8f
            goto La7
        L8f:
            int r5 = (int) r5
            int r6 = (int) r6
            android.view.View r5 = r10.h(r5, r6)
            if (r5 == 0) goto La4
            boolean r6 = r10.d(r5, r7, r8)
            if (r6 == 0) goto La4
            boolean r2 = r10.p(r5, r2)
            if (r2 == 0) goto La4
            goto La7
        La4:
            int r1 = r1 + 1
            goto L6d
        La7:
            r10.m(r11)
            goto Ldd
        Lab:
            r10.a()
            goto Ldd
        Laf:
            float r0 = r11.getX()
            float r1 = r11.getY()
            int r11 = r11.getPointerId(r3)
            r10.l(r0, r1, r11)
            int r0 = (int) r0
            int r1 = (int) r1
            android.view.View r0 = r10.h(r0, r1)
            android.view.View r1 = r10.f5907s
            if (r0 != r1) goto Lcf
            int r1 = r10.f5889a
            if (r1 != r2) goto Lcf
            r10.p(r0, r11)
        Lcf:
            int[] r0 = r10.f5896h
            r11 = r0[r11]
            int r0 = r10.f5904p
            r11 = r11 & r0
            if (r11 == 0) goto Ldd
        Ld8:
            com.github.kilnn.swipeback.a$c r11 = r10.f5906r
            r11.getClass()
        Ldd:
            int r11 = r10.f5889a
            if (r11 != r4) goto Le2
            r3 = 1
        Le2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.kilnn.swipeback.a.o(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.View r10, int r11) {
        /*
            r9 = this;
            android.view.View r0 = r9.f5907s
            r1 = 1
            if (r10 != r0) goto La
            int r0 = r9.f5891c
            if (r0 != r11) goto La
            return r1
        La:
            r0 = 0
            if (r10 == 0) goto Lcb
            com.github.kilnn.swipeback.a$c r2 = r9.f5906r
            com.github.kilnn.swipeback.SwipeBackLayout$b r2 = (com.github.kilnn.swipeback.SwipeBackLayout.b) r2
            com.github.kilnn.swipeback.SwipeBackLayout r3 = com.github.kilnn.swipeback.SwipeBackLayout.this
            com.github.kilnn.swipeback.a r4 = r3.f5873e
            int r3 = r3.f5869a
            boolean r3 = r4.i(r3, r11)
            r4 = 8
            r5 = 2
            if (r3 == 0) goto L76
            com.github.kilnn.swipeback.SwipeBackLayout r6 = com.github.kilnn.swipeback.SwipeBackLayout.this
            com.github.kilnn.swipeback.a r6 = r6.f5873e
            boolean r6 = r6.i(r1, r11)
            if (r6 == 0) goto L2f
            com.github.kilnn.swipeback.SwipeBackLayout r6 = com.github.kilnn.swipeback.SwipeBackLayout.this
            r6.f5885q = r1
            goto L4c
        L2f:
            com.github.kilnn.swipeback.SwipeBackLayout r6 = com.github.kilnn.swipeback.SwipeBackLayout.this
            com.github.kilnn.swipeback.a r6 = r6.f5873e
            boolean r6 = r6.i(r5, r11)
            if (r6 == 0) goto L3e
            com.github.kilnn.swipeback.SwipeBackLayout r6 = com.github.kilnn.swipeback.SwipeBackLayout.this
            r6.f5885q = r5
            goto L4c
        L3e:
            com.github.kilnn.swipeback.SwipeBackLayout r6 = com.github.kilnn.swipeback.SwipeBackLayout.this
            com.github.kilnn.swipeback.a r6 = r6.f5873e
            boolean r6 = r6.i(r4, r11)
            if (r6 == 0) goto L4c
            com.github.kilnn.swipeback.SwipeBackLayout r6 = com.github.kilnn.swipeback.SwipeBackLayout.this
            r6.f5885q = r4
        L4c:
            com.github.kilnn.swipeback.SwipeBackLayout r6 = com.github.kilnn.swipeback.SwipeBackLayout.this
            java.util.ArrayList r6 = r6.f5877i
            if (r6 == 0) goto L74
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L74
            com.github.kilnn.swipeback.SwipeBackLayout r6 = com.github.kilnn.swipeback.SwipeBackLayout.this
            java.util.ArrayList r6 = r6.f5877i
            java.util.Iterator r6 = r6.iterator()
        L60:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L74
            java.lang.Object r7 = r6.next()
            com.github.kilnn.swipeback.SwipeBackLayout$a r7 = (com.github.kilnn.swipeback.SwipeBackLayout.a) r7
            com.github.kilnn.swipeback.SwipeBackLayout r8 = com.github.kilnn.swipeback.SwipeBackLayout.this
            int r8 = r8.f5885q
            r7.c()
            goto L60
        L74:
            r2.f5886a = r1
        L76:
            com.github.kilnn.swipeback.SwipeBackLayout r2 = com.github.kilnn.swipeback.SwipeBackLayout.this
            int r6 = r2.f5869a
            if (r6 == r1) goto L90
            if (r6 != r5) goto L7f
            goto L90
        L7f:
            if (r6 != r4) goto L88
            com.github.kilnn.swipeback.a r2 = r2.f5873e
            boolean r2 = r2.c(r1, r11)
            goto L96
        L88:
            r2 = 11
            if (r6 != r2) goto L8e
            r2 = 1
            goto L97
        L8e:
            r2 = 0
            goto L97
        L90:
            com.github.kilnn.swipeback.a r2 = r2.f5873e
            boolean r2 = r2.c(r5, r11)
        L96:
            r2 = r2 ^ r1
        L97:
            r2 = r2 & r3
            if (r2 == 0) goto Lcb
            r9.f5891c = r11
            android.view.ViewParent r0 = r10.getParent()
            android.view.ViewGroup r2 = r9.f5909u
            if (r0 != r2) goto Lb1
            r9.f5907s = r10
            r9.f5891c = r11
            com.github.kilnn.swipeback.a$c r10 = r9.f5906r
            r10.getClass()
            r9.n(r1)
            return r1
        Lb1:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view ("
            java.lang.StringBuilder r11 = android.support.v4.media.d.a(r11)
            android.view.ViewGroup r0 = r9.f5909u
            r11.append(r0)
            java.lang.String r0 = ")"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lcb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.kilnn.swipeback.a.p(android.view.View, int):boolean");
    }
}
