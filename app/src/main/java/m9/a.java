package m9;

import android.content.Context;
import com.google.android.material.R;

/* loaded from: classes.dex */
public final class a extends ba.a {
    public a(Context context) {
        super(context);
    }

    @Override // ba.a
    public int getItemDefaultMarginResId() {
        return R.dimen.design_bottom_navigation_margin;
    }

    @Override // ba.a
    public int getItemLayoutResId() {
        return R.layout.design_bottom_navigation_item;
    }
}
