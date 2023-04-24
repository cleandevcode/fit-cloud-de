package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class o1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final float f1448a;

    /* renamed from: b */
    public final int f1449b;

    /* renamed from: c */
    public final int f1450c;

    /* renamed from: d */
    public final View f1451d;

    /* renamed from: e */
    public a f1452e;

    /* renamed from: f */
    public b f1453f;

    /* renamed from: g */
    public boolean f1454g;

    /* renamed from: h */
    public int f1455h;

    /* renamed from: i */
    public final int[] f1456i = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            o1.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = o1.this.f1451d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            o1.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o1 o1Var = o1.this;
            o1Var.a();
            View view = o1Var.f1451d;
            if (view.isEnabled() && !view.isLongClickable() && o1Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                o1Var.f1454g = true;
            }
        }
    }

    public o1(View view) {
        this.f1451d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1448a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1449b = tapTimeout;
        this.f1450c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f1453f;
        if (bVar != null) {
            this.f1451d.removeCallbacks(bVar);
        }
        a aVar = this.f1452e;
        if (aVar != null) {
            this.f1451d.removeCallbacks(aVar);
        }
    }

    public abstract l.f b();

    public abstract boolean c();

    public boolean d() {
        l.f b10 = b();
        if (b10 == null || !b10.a()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0084, code lost:
        if (r4 != 3) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0110  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1454g = false;
        this.f1455h = -1;
        a aVar = this.f1452e;
        if (aVar != null) {
            this.f1451d.removeCallbacks(aVar);
        }
    }
}
