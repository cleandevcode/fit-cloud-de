package w6;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public abstract class d extends FrameLayout implements c {
    public d(Context context) {
        super(context, null);
    }

    public int getContentHeight() {
        return getMeasuredHeight();
    }
}
