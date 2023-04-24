package oi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.topstep.fitcloud.pro.ui.widget.SleepDayView;

/* loaded from: classes2.dex */
public final class e extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ SleepDayView f23566a;

    public e(SleepDayView sleepDayView) {
        this.f23566a = sleepDayView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        SleepDayView.a(this.f23566a, motionEvent);
        return super.onSingleTapUp(motionEvent);
    }
}
