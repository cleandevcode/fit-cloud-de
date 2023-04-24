package v9;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a */
    public final Dialog f29176a;

    /* renamed from: b */
    public final int f29177b;

    /* renamed from: c */
    public final int f29178c;

    /* renamed from: d */
    public final int f29179d;

    public a(Dialog dialog, Rect rect) {
        this.f29176a = dialog;
        this.f29177b = rect.left;
        this.f29178c = rect.top;
        this.f29179d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f29177b;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f29178c;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f29179d;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f29176a.onTouchEvent(obtain);
    }
}
