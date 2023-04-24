package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public class HealthyDetailInfoMeasureLayout extends LinearLayout {
    public HealthyDetailInfoMeasureLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        TextView textView = (TextView) findViewById(R.id.tv_highest_text);
        TextView textView2 = (TextView) findViewById(R.id.tv_avg_text);
        TextView textView3 = (TextView) findViewById(R.id.tv_lowest_text);
        if (textView == null || textView2 == null || textView3 == null) {
            return;
        }
        int measuredHeight = textView.getMeasuredHeight();
        int measuredHeight2 = textView2.getMeasuredHeight();
        int max = Math.max(Math.max(measuredHeight, measuredHeight2), textView3.getMeasuredHeight());
        textView.setHeight(max);
        textView2.setHeight(max);
        textView3.setHeight(max);
    }
}
