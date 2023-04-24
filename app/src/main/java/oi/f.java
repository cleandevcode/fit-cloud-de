package oi;

import android.view.MotionEvent;
import android.view.View;
import com.topstep.fitcloud.pro.ui.widget.SleepDayView;

/* loaded from: classes2.dex */
public final class f implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ SleepDayView f23567a;

    public f(SleepDayView sleepDayView) {
        this.f23567a = sleepDayView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            SleepDayView.a(this.f23567a, motionEvent);
        }
        return this.f23567a.f12404e.onTouchEvent(motionEvent);
    }
}
