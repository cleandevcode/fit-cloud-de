package i9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public abstract class f<V extends View> extends h<V> {

    /* renamed from: c */
    public a f16738c;

    /* renamed from: d */
    public OverScroller f16739d;

    /* renamed from: e */
    public boolean f16740e;

    /* renamed from: f */
    public int f16741f;

    /* renamed from: g */
    public int f16742g;

    /* renamed from: h */
    public int f16743h;

    /* renamed from: i */
    public VelocityTracker f16744i;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final CoordinatorLayout f16745a;

        /* renamed from: b */
        public final V f16746b;

        public a(CoordinatorLayout coordinatorLayout, V v10) {
            f.this = r1;
            this.f16745a = coordinatorLayout;
            this.f16746b = v10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OverScroller overScroller;
            if (this.f16746b != null && (overScroller = f.this.f16739d) != null) {
                if (overScroller.computeScrollOffset()) {
                    f fVar = f.this;
                    fVar.A(this.f16745a, this.f16746b, fVar.f16739d.getCurrY());
                    V v10 = this.f16746b;
                    WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                    o0.d.m(v10, this);
                    return;
                }
                f.this.y(this.f16746b, this.f16745a);
            }
        }
    }

    public f() {
        this.f16741f = -1;
        this.f16743h = -1;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16741f = -1;
        this.f16743h = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(CoordinatorLayout coordinatorLayout, View view, int i10) {
        z(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        int findPointerIndex;
        if (this.f16743h < 0) {
            this.f16743h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f16740e) {
            int i10 = this.f16741f;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f16742g) > this.f16743h) {
                this.f16742g = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f16741f = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            if (u(v10) && coordinatorLayout.q(v10, x10, y11)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16740e = z10;
            if (z10) {
                this.f16742g = y11;
                this.f16741f = motionEvent.getPointerId(0);
                if (this.f16744i == null) {
                    this.f16744i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f16739d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f16739d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f16744i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.f.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean u(V v10) {
        return false;
    }

    public int v(V v10) {
        return -v10.getHeight();
    }

    public int w(V v10) {
        return v10.getHeight();
    }

    public int x() {
        return s();
    }

    public void y(View view, CoordinatorLayout coordinatorLayout) {
    }

    public int z(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int k10;
        int s10 = s();
        if (i11 == 0 || s10 < i11 || s10 > i12 || s10 == (k10 = b0.c.k(i10, i11, i12))) {
            return 0;
        }
        i iVar = this.f16752a;
        if (iVar != null) {
            iVar.b(k10);
        } else {
            this.f16753b = k10;
        }
        return s10 - k10;
    }
}
