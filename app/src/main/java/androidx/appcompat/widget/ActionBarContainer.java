package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R;
import java.util.WeakHashMap;
import k1.o0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public boolean f1023a;

    /* renamed from: b */
    public c2 f1024b;

    /* renamed from: c */
    public View f1025c;

    /* renamed from: d */
    public View f1026d;

    /* renamed from: e */
    public Drawable f1027e;

    /* renamed from: f */
    public Drawable f1028f;

    /* renamed from: g */
    public Drawable f1029g;

    /* renamed from: h */
    public boolean f1030h;

    /* renamed from: i */
    public boolean f1031i;

    /* renamed from: j */
    public int f1032j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
        o0.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBar);
        this.f1027e = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_background);
        this.f1028f = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundStacked);
        this.f1032j = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_height, -1);
        boolean z10 = true;
        if (getId() == R.id.split_action_bar) {
            this.f1030h = true;
            this.f1029g = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1030h ? this.f1027e != null || this.f1028f != null : this.f1029g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1027e;
        if (drawable != null && drawable.isStateful()) {
            this.f1027e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1028f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1028f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1029g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1029g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1024b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1027e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1028f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1029g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1025c = findViewById(R.id.action_bar);
        this.f1026d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1023a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        c2 c2Var = this.f1024b;
        boolean z11 = false;
        boolean z12 = (c2Var == null || c2Var.getVisibility() == 8) ? false : true;
        if (c2Var != null && c2Var.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i14 = ((FrameLayout.LayoutParams) c2Var.getLayoutParams()).bottomMargin;
            c2Var.layout(i10, (measuredHeight - c2Var.getMeasuredHeight()) - i14, i12, measuredHeight - i14);
        }
        if (this.f1030h) {
            Drawable drawable3 = this.f1029g;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                z11 = true;
            }
        } else {
            if (this.f1027e != null) {
                if (this.f1025c.getVisibility() == 0) {
                    drawable2 = this.f1027e;
                    left = this.f1025c.getLeft();
                    top = this.f1025c.getTop();
                    right = this.f1025c.getRight();
                    view = this.f1025c;
                } else {
                    View view2 = this.f1026d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f1027e.setBounds(0, 0, 0, 0);
                        z11 = true;
                    } else {
                        drawable2 = this.f1027e;
                        left = this.f1026d.getLeft();
                        top = this.f1026d.getTop();
                        right = this.f1026d.getRight();
                        view = this.f1026d;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z11 = true;
            }
            this.f1031i = z12;
            if (z12 && (drawable = this.f1028f) != null) {
                drawable.setBounds(c2Var.getLeft(), c2Var.getTop(), c2Var.getRight(), c2Var.getBottom());
                z11 = true;
            }
        }
        if (z11) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0074  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.f1025c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r1) goto L1c
            int r0 = r6.f1032j
            if (r0 < 0) goto L1c
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = java.lang.Math.min(r0, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
        L1c:
            super.onMeasure(r7, r8)
            android.view.View r7 = r6.f1025c
            if (r7 != 0) goto L24
            return
        L24:
            int r7 = android.view.View.MeasureSpec.getMode(r8)
            androidx.appcompat.widget.c2 r0 = r6.f1024b
            if (r0 == 0) goto L89
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L89
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == r0) goto L89
            android.view.View r0 = r6.f1025c
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L4d
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L4d
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L4b
            goto L4d
        L4b:
            r0 = 0
            goto L4e
        L4d:
            r0 = 1
        L4e:
            if (r0 != 0) goto L53
            android.view.View r0 = r6.f1025c
            goto L69
        L53:
            android.view.View r0 = r6.f1026d
            if (r0 == 0) goto L65
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L65
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L64
            goto L65
        L64:
            r3 = 0
        L65:
            if (r3 != 0) goto L6d
            android.view.View r0 = r6.f1026d
        L69:
            int r4 = a(r0)
        L6d:
            if (r7 != r1) goto L74
            int r7 = android.view.View.MeasureSpec.getSize(r8)
            goto L77
        L74:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L77:
            int r8 = r6.getMeasuredWidth()
            androidx.appcompat.widget.c2 r0 = r6.f1024b
            int r0 = a(r0)
            int r0 = r0 + r4
            int r7 = java.lang.Math.min(r0, r7)
            r6.setMeasuredDimension(r8, r7)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1027e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1027e);
        }
        this.f1027e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1025c;
            if (view != null) {
                this.f1027e.setBounds(view.getLeft(), this.f1025c.getTop(), this.f1025c.getRight(), this.f1025c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1030h ? this.f1027e != null || this.f1028f != null : this.f1029g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1029g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1029g);
        }
        this.f1029g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1030h && (drawable2 = this.f1029g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1030h ? !(this.f1027e != null || this.f1028f != null) : this.f1029g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1028f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1028f);
        }
        this.f1028f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1031i && (drawable2 = this.f1028f) != null) {
                drawable2.setBounds(this.f1024b.getLeft(), this.f1024b.getTop(), this.f1024b.getRight(), this.f1024b.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1030h ? this.f1027e != null || this.f1028f != null : this.f1029g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(c2 c2Var) {
        c2 c2Var2 = this.f1024b;
        if (c2Var2 != null) {
            removeView(c2Var2);
        }
        this.f1024b = c2Var;
        if (c2Var != null) {
            addView(c2Var);
            ViewGroup.LayoutParams layoutParams = c2Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c2Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f1023a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1027e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1028f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f1029g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1027e && !this.f1030h) || (drawable == this.f1028f && this.f1031i) || ((drawable == this.f1029g && this.f1030h) || super.verifyDrawable(drawable));
    }
}
