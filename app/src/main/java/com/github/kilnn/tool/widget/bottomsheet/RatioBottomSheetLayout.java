package com.github.kilnn.tool.widget.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.github.kilnn.tool.R;
import gm.l;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class RatioBottomSheetLayout extends BottomSheetLayout {

    /* renamed from: k */
    public float f5946k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatioBottomSheetLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RatioBottomSheetLayout, 0, 0);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…tLayout, defStyleAttr, 0)");
        this.f5946k = obtainStyledAttributes.getFloat(R.styleable.RatioBottomSheetLayout_heightRatio, 0.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!(this.f5946k == 0.0f)) {
            i11 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i11) * this.f5946k), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public final void setHeightRatio(float f10) {
        this.f5946k = f10;
        invalidate();
    }
}
