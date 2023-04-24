package com.github.kilnn.tool.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.github.kilnn.tool.R;
import gm.l;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class SquareImageView extends AppCompatImageView {

    /* renamed from: d */
    public final int f5926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SquareImageView, 0, 0);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…ageView, defStyleAttr, 0)");
        this.f5926d = obtainStyledAttributes.getInt(R.styleable.SquareImageView_squareBase, 0);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x001f, code lost:
        if (r1 > r2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0021, code lost:
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002b, code lost:
        if (r1 < r2) goto L14;
     */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r1, int r2) {
        /*
            r0 = this;
            super.onMeasure(r1, r2)
            int r1 = r0.f5926d
            if (r1 == 0) goto L23
            r2 = 1
            if (r1 == r2) goto L17
            r2 = 2
            if (r1 == r2) goto L12
            int r1 = r0.getMeasuredHeight()
            goto L2e
        L12:
            int r1 = r0.getMeasuredWidth()
            goto L2e
        L17:
            int r1 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            if (r1 <= r2) goto L2e
        L21:
            r1 = r2
            goto L2e
        L23:
            int r1 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            if (r1 >= r2) goto L2e
            goto L21
        L2e:
            r0.setMeasuredDimension(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.kilnn.tool.widget.SquareImageView.onMeasure(int, int):void");
    }
}
