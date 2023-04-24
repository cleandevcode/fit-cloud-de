package com.topstep.fitcloud.pro.ui.device.dial;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import g7.a;
import gm.l;
import kotlin.Metadata;
import sj.e;

@Metadata
/* loaded from: classes2.dex */
public final class DialCardView extends CardView {

    /* renamed from: h */
    public View f10915h;

    /* renamed from: i */
    public float f10916i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        this.f10916i = 1.0f;
        setCardElevation(a.a(context, 1.0f));
        int a10 = a.a(context, 2.0f);
        this.f1913c.set(a10, a10, a10, a10);
        CardView.f1910g.b(this.f1915e);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f10915h == null) {
            View childAt = getChildAt(0);
            l.e(childAt, "getChildAt(0)");
            this.f10915h = childAt;
        }
        int size = View.MeasureSpec.getSize(i10);
        View view = this.f10915h;
        if (view == null) {
            l.l("contentView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        l.d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int contentPaddingBottom = getContentPaddingBottom() + getContentPaddingTop() + ((int) (((((size - getContentPaddingLeft()) - getContentPaddingRight()) - layoutParams2.leftMargin) - layoutParams2.rightMargin) / this.f10916i)) + layoutParams2.topMargin + layoutParams2.bottomMargin;
        setMeasuredDimension(size, contentPaddingBottom);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(contentPaddingBottom, Integer.MIN_VALUE));
    }

    public final void setShape(e eVar) {
        boolean z10;
        l.f(eVar, "shape");
        float f10 = eVar.f27096b / eVar.f27097c;
        if (f10 == this.f10916i) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f10916i = f10;
            requestLayout();
        }
    }
}
