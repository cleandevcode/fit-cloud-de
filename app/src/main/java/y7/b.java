package y7;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import r7.b;

/* loaded from: classes.dex */
public abstract class b<T extends r7.b<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* renamed from: a */
    public int f31207a = 0;

    /* renamed from: b */
    public v7.c f31208b;

    /* renamed from: c */
    public GestureDetector f31209c;

    /* renamed from: d */
    public T f31210d;

    /* loaded from: classes.dex */
    public enum a {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        /* JADX INFO: Fake field, exist only in values array */
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING
    }

    public b(T t10) {
        this.f31210d = t10;
        this.f31209c = new GestureDetector(t10.getContext(), this);
    }

    public final void a(MotionEvent motionEvent) {
        c onChartGestureListener = this.f31210d.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.f();
        }
    }
}
