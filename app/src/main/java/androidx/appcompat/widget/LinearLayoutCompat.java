package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.R;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a */
    public boolean f1108a;

    /* renamed from: b */
    public int f1109b;

    /* renamed from: c */
    public int f1110c;

    /* renamed from: d */
    public int f1111d;

    /* renamed from: e */
    public int f1112e;

    /* renamed from: f */
    public int f1113f;

    /* renamed from: g */
    public float f1114g;

    /* renamed from: h */
    public boolean f1115h;

    /* renamed from: i */
    public int[] f1116i;

    /* renamed from: j */
    public int[] f1117j;

    /* renamed from: k */
    public Drawable f1118k;

    /* renamed from: l */
    public int f1119l;

    /* renamed from: m */
    public int f1120m;

    /* renamed from: n */
    public int f1121n;

    /* renamed from: o */
    public int f1122o;

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Drawable drawable;
        int resourceId;
        this.f1108a = true;
        this.f1109b = -1;
        this.f1110c = 0;
        this.f1112e = 8388659;
        int[] iArr = R.styleable.LinearLayoutCompat;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        k1.o0.o(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        int i11 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = obtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f1114g = obtainStyledAttributes.getFloat(R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1109b = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1115h = obtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        int i13 = R.styleable.LinearLayoutCompat_divider;
        if (obtainStyledAttributes.hasValue(i13) && (resourceId = obtainStyledAttributes.getResourceId(i13, 0)) != 0) {
            drawable = g.a.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(i13);
        }
        setDividerDrawable(drawable);
        this.f1121n = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_showDividers, 0);
        this.f1122o = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    public final void c(Canvas canvas, int i10) {
        this.f1118k.setBounds(getPaddingLeft() + this.f1122o, i10, (getWidth() - getPaddingRight()) - this.f1122o, this.f1120m + i10);
        this.f1118k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void e(Canvas canvas, int i10) {
        this.f1118k.setBounds(i10, getPaddingTop() + this.f1122o, this.f1119l + i10, (getHeight() - getPaddingBottom()) - this.f1122o);
        this.f1118k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1111d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1109b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1109b;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1109b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i12 = this.f1110c;
            if (this.f1111d == 1 && (i10 = this.f1112e & 112) != 48) {
                if (i10 == 16) {
                    i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1113f) / 2;
                } else if (i10 == 80) {
                    i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1113f;
                }
            }
            return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1109b;
    }

    public Drawable getDividerDrawable() {
        return this.f1118k;
    }

    public int getDividerPadding() {
        return this.f1122o;
    }

    public int getDividerWidth() {
        return this.f1119l;
    }

    public int getGravity() {
        return this.f1112e;
    }

    public int getOrientation() {
        return this.f1111d;
    }

    public int getShowDividers() {
        return this.f1121n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1114g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public final boolean i(int i10) {
        if (i10 == 0) {
            return (this.f1121n & 1) != 0;
        } else if (i10 == getChildCount()) {
            return (this.f1121n & 4) != 0;
        } else if ((this.f1121n & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        int left2;
        int bottom;
        if (this.f1118k == null) {
            return;
        }
        int i11 = 0;
        if (this.f1111d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && i(i11)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f1120m);
                }
                i11++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f1120m;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin;
                }
                c(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a10 = x2.a(this);
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i11)) {
                a aVar = (a) childAt3.getLayoutParams();
                if (a10) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1119l;
                }
                e(canvas, left2);
            }
            i11++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a10) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth();
                    i10 = getPaddingRight();
                    right = (left - i10) - this.f1119l;
                }
            } else {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (a10) {
                    left = childAt4.getLeft();
                    i10 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - i10) - this.f1119l;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01a7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:577:0x02b0, code lost:
        if (r13 < 0) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:589:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:831:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:881:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f1108a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1109b = i10;
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("base aligned child index out of range (0, ");
        a10.append(getChildCount());
        a10.append(")");
        throw new IllegalArgumentException(a10.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1118k) {
            return;
        }
        this.f1118k = drawable;
        if (drawable != null) {
            this.f1119l = drawable.getIntrinsicWidth();
            this.f1120m = drawable.getIntrinsicHeight();
        } else {
            this.f1119l = 0;
            this.f1120m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1122o = i10;
    }

    public void setGravity(int i10) {
        if (this.f1112e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1112e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1112e;
        if ((8388615 & i12) != i11) {
            this.f1112e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1115h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1111d != i10) {
            this.f1111d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1121n) {
            requestLayout();
        }
        this.f1121n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1112e;
        if ((i12 & 112) != i11) {
            this.f1112e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1114g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
