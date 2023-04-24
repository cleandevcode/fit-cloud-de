package k1;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class y {
    public static boolean a(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }
}
