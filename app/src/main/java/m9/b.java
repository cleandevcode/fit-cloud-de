package m9;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import ba.d;
import com.google.android.material.R;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class b extends d {
    public final int E;
    public final int F;
    public final int H;
    public final int L;
    public boolean M;
    public int[] Q;

    public b(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.E = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.F = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.H = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.L = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
        this.Q = new int[5];
    }

    @Override // ba.d
    public final a e(Context context) {
        return new a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                if (o0.e.d(this) == 1) {
                    int i18 = i14 - i16;
                    childAt.layout(i18 - childAt.getMeasuredWidth(), 0, i18, i15);
                } else {
                    childAt.layout(i16, 0, childAt.getMeasuredWidth() + i16, i15);
                }
                i16 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        f menu = getMenu();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        int i15 = 1;
        if (labelVisibilityMode != -1 ? labelVisibilityMode == 0 : size2 > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.M) {
            View childAt = getChildAt(getSelectedItemPosition());
            int i16 = this.L;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.H, Integer.MIN_VALUE), makeMeasureSpec);
                i16 = Math.max(i16, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i17 = size2 - i12;
            int min = Math.min(size - (this.F * i17), Math.min(i16, this.H));
            int i18 = size - min;
            if (i17 == 0) {
                i13 = 1;
            } else {
                i13 = i17;
            }
            int min2 = Math.min(i18 / i13, this.E);
            int i19 = i18 - (i17 * min2);
            for (int i20 = 0; i20 < childCount; i20++) {
                if (getChildAt(i20).getVisibility() != 8) {
                    int[] iArr = this.Q;
                    if (i20 == getSelectedItemPosition()) {
                        i14 = min;
                    } else {
                        i14 = min2;
                    }
                    iArr[i20] = i14;
                    if (i19 > 0) {
                        int[] iArr2 = this.Q;
                        iArr2[i20] = iArr2[i20] + 1;
                        i19--;
                    }
                } else {
                    this.Q[i20] = 0;
                }
            }
        } else {
            if (size2 != 0) {
                i15 = size2;
            }
            int min3 = Math.min(size / i15, this.H);
            int i21 = size - (size2 * min3);
            for (int i22 = 0; i22 < childCount; i22++) {
                if (getChildAt(i22).getVisibility() != 8) {
                    int[] iArr3 = this.Q;
                    iArr3[i22] = min3;
                    if (i21 > 0) {
                        iArr3[i22] = min3 + 1;
                        i21--;
                    }
                } else {
                    this.Q[i22] = 0;
                }
            }
        }
        int i23 = 0;
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt2 = getChildAt(i24);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.Q[i24], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i23 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i23, View.MeasureSpec.makeMeasureSpec(i23, 1073741824), 0), View.resolveSizeAndState(size3, i11, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.M = z10;
    }
}
