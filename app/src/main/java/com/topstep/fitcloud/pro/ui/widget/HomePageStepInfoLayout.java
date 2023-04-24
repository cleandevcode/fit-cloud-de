package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.topstep.fitcloud.pro.databinding.LayoutHomePageStepInfoBinding;
import com.topstep.fitcloudpro.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes2.dex */
public class HomePageStepInfoLayout extends FrameLayout {

    /* renamed from: a */
    public a f12359a;

    /* renamed from: b */
    public LayoutHomePageStepInfoBinding f12360b;

    /* renamed from: c */
    public int f12361c;

    /* loaded from: classes2.dex */
    public class a implements AppBarLayout.f {
        public a() {
            HomePageStepInfoLayout.this = r1;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(int i10) {
            HomePageStepInfoLayout homePageStepInfoLayout = HomePageStepInfoLayout.this;
            if (homePageStepInfoLayout.f12361c == i10) {
                return;
            }
            homePageStepInfoLayout.f12361c = i10;
            homePageStepInfoLayout.requestLayout();
        }
    }

    public HomePageStepInfoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12360b = LayoutHomePageStepInfoBinding.inflate(LayoutInflater.from(getContext()), this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.home_page_step_info_padding_size);
        setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            setFitsSystemWindows(o0.d.b((View) parent));
            if (this.f12359a == null) {
                this.f12359a = new a();
            }
            ((AppBarLayout) parent).a(this.f12359a);
            o0.h.c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        a aVar = this.f12359a;
        if (aVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).f6166h) != null) {
            arrayList.remove(aVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f10;
        int paddingLeft = getPaddingLeft();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12360b.layoutStepDetail.getLayoutParams();
        int measuredHeight = ((getMeasuredHeight() - getPaddingBottom()) - marginLayoutParams.bottomMargin) - this.f12361c;
        int measuredHeight2 = measuredHeight - this.f12360b.layoutStepDetail.getMeasuredHeight();
        this.f12360b.layoutStepDetail.layout(paddingLeft, measuredHeight2, this.f12360b.layoutStepDetail.getMeasuredWidth() + paddingLeft, measuredHeight);
        int abs = (Math.abs(this.f12361c) - this.f12360b.layoutStepDetail.getMeasuredHeight()) - marginLayoutParams.topMargin;
        if (abs > 0) {
            float paddingTop = abs / (getPaddingTop() + (getPaddingBottom() + (this.f12360b.layoutStepCount.getMeasuredHeight() - getMinimumHeight())));
            i14 = (int) ((((getPaddingTop() + (getPaddingBottom() + this.f12360b.layoutStepCount.getMeasuredHeight())) - getMinimumHeight()) / 2) * paddingTop);
            f10 = paddingTop * 90.0f;
        } else {
            i14 = 0;
            f10 = 0.0f;
        }
        int i15 = (measuredHeight2 - marginLayoutParams.topMargin) - ((ViewGroup.MarginLayoutParams) this.f12360b.layoutStepCount.getLayoutParams()).bottomMargin;
        this.f12360b.layoutStepCount.layout(paddingLeft, (i15 - this.f12360b.layoutStepCount.getMeasuredHeight()) - i14, this.f12360b.layoutStepCount.getMeasuredWidth() + paddingLeft, i15 - i14);
        this.f12360b.stepProgressView.setTranslationY(i14);
        this.f12360b.stepProgressView.setRotationX(f10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12360b.layoutStepDetail.getLayoutParams();
        int i12 = (measuredWidth - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        int i13 = (measuredHeight - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        this.f12360b.layoutStepDetail.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE));
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f12360b.layoutStepCount.getLayoutParams();
        this.f12360b.layoutStepCount.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(((i13 - this.f12360b.layoutStepDetail.getMeasuredHeight()) - marginLayoutParams2.topMargin) - marginLayoutParams2.bottomMargin, Integer.MIN_VALUE));
        setMinimumHeight(getPaddingBottom() + getPaddingTop() + this.f12360b.layoutStepCountNumbers.getMeasuredHeight());
        int measuredHeight2 = this.f12360b.tvTotalConsumedText.getMeasuredHeight();
        int measuredHeight3 = this.f12360b.tvTotalDistanceText.getMeasuredHeight();
        int max = Math.max(Math.max(measuredHeight2, measuredHeight3), this.f12360b.tvTodayGoalText.getMeasuredHeight());
        this.f12360b.tvTotalConsumedText.setHeight(max);
        this.f12360b.tvTotalDistanceText.setHeight(max);
        this.f12360b.tvTodayGoalText.setHeight(max);
    }
}
