package e3;

import android.graphics.Rect;
import androidx.fragment.app.x;
import gm.l;

/* loaded from: classes.dex */
public final class b {
    public static Rect a(x xVar) {
        Rect bounds = xVar.getWindowManager().getCurrentWindowMetrics().getBounds();
        l.e(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }
}
