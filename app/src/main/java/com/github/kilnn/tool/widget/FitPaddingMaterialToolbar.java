package com.github.kilnn.tool.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.R;
import com.google.android.material.appbar.MaterialToolbar;
import gm.l;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class FitPaddingMaterialToolbar extends MaterialToolbar {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitPaddingMaterialToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        l.f(context, "context");
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return getPaddingTop() + super.getSuggestedMinimumHeight();
    }
}
