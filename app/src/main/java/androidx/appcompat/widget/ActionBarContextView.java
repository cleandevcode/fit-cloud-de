package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.c;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* renamed from: i */
    public CharSequence f1033i;

    /* renamed from: j */
    public CharSequence f1034j;

    /* renamed from: k */
    public View f1035k;

    /* renamed from: l */
    public View f1036l;

    /* renamed from: m */
    public View f1037m;

    /* renamed from: n */
    public LinearLayout f1038n;

    /* renamed from: o */
    public TextView f1039o;

    /* renamed from: p */
    public TextView f1040p;

    /* renamed from: q */
    public int f1041q;

    /* renamed from: r */
    public int f1042r;

    /* renamed from: s */
    public boolean f1043s;

    /* renamed from: t */
    public int f1044t;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ k.a f1045a;

        public a(k.a aVar) {
            this.f1045a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f1045a.c();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ActionBarContextView(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = androidx.appcompat.R.attr.actionModeStyle
            r3.<init>(r4, r5, r0)
            int[] r1 = androidx.appcompat.R.styleable.ActionMode
            r2 = 0
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            int r0 = androidx.appcompat.R.styleable.ActionMode_background
            boolean r1 = r5.hasValue(r0)
            if (r1 == 0) goto L1f
            int r1 = r5.getResourceId(r0, r2)
            if (r1 == 0) goto L1f
            android.graphics.drawable.Drawable r4 = g.a.b(r4, r1)
            goto L23
        L1f:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r0)
        L23:
            java.util.WeakHashMap<android.view.View, k1.i2> r0 = k1.o0.f18161a
            k1.o0.d.q(r3, r4)
            int r4 = androidx.appcompat.R.styleable.ActionMode_titleTextStyle
            int r4 = r5.getResourceId(r4, r2)
            r3.f1041q = r4
            int r4 = androidx.appcompat.R.styleable.ActionMode_subtitleTextStyle
            int r4 = r5.getResourceId(r4, r2)
            r3.f1042r = r4
            int r4 = androidx.appcompat.R.styleable.ActionMode_height
            int r4 = r5.getLayoutDimension(r4, r2)
            r3.f1257e = r4
            int r4 = androidx.appcompat.R.styleable.ActionMode_closeItemLayout
            int r0 = androidx.appcompat.R.layout.abc_action_mode_close_item_material
            int r4 = r5.getResourceId(r4, r0)
            r3.f1044t = r4
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(k.a r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f1035k
            r1 = 0
            if (r0 != 0) goto L16
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.f1044t
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.f1035k = r0
            goto L1e
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L21
            android.view.View r0 = r6.f1035k
        L1e:
            r6.addView(r0)
        L21:
            android.view.View r0 = r6.f1035k
            int r2 = androidx.appcompat.R.id.action_mode_close_button
            android.view.View r0 = r0.findViewById(r2)
            r6.f1036l = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r7)
            r0.setOnClickListener(r2)
            androidx.appcompat.view.menu.f r7 = r7.e()
            androidx.appcompat.widget.c r0 = r6.f1256d
            if (r0 == 0) goto L4d
            r0.b()
            androidx.appcompat.widget.c$a r0 = r0.f1284u
            if (r0 == 0) goto L4d
            boolean r2 = r0.b()
            if (r2 == 0) goto L4d
            l.d r0 = r0.f995j
            r0.dismiss()
        L4d:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f1256d = r0
            r2 = 1
            r0.f1276m = r2
            r0.f1277n = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            androidx.appcompat.widget.c r3 = r6.f1256d
            android.content.Context r4 = r6.f1254b
            r7.b(r3, r4)
            androidx.appcompat.widget.c r7 = r6.f1256d
            androidx.appcompat.view.menu.k r3 = r7.f879h
            if (r3 != 0) goto L85
            android.view.LayoutInflater r4 = r7.f875d
            int r5 = r7.f877f
            android.view.View r1 = r4.inflate(r5, r6, r1)
            androidx.appcompat.view.menu.k r1 = (androidx.appcompat.view.menu.k) r1
            r7.f879h = r1
            androidx.appcompat.view.menu.f r4 = r7.f874c
            r1.b(r4)
            r7.d(r2)
        L85:
            androidx.appcompat.view.menu.k r1 = r7.f879h
            if (r3 == r1) goto L8f
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L8f:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f1255c = r1
            r7 = 0
            java.util.WeakHashMap<android.view.View, k1.i2> r2 = k1.o0.f18161a
            k1.o0.d.q(r1, r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f1255c
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.f(k.a):void");
    }

    public final void g() {
        if (this.f1038n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1038n = linearLayout;
            this.f1039o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1040p = (TextView) this.f1038n.findViewById(R.id.action_bar_subtitle);
            if (this.f1041q != 0) {
                this.f1039o.setTextAppearance(getContext(), this.f1041q);
            }
            if (this.f1042r != 0) {
                this.f1040p.setTextAppearance(getContext(), this.f1042r);
            }
        }
        this.f1039o.setText(this.f1033i);
        this.f1040p.setText(this.f1034j);
        boolean z10 = !TextUtils.isEmpty(this.f1033i);
        boolean z11 = !TextUtils.isEmpty(this.f1034j);
        int i10 = 0;
        this.f1040p.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1038n;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f1038n.getParent() == null) {
            addView(this.f1038n);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1034j;
    }

    public CharSequence getTitle() {
        return this.f1033i;
    }

    public final void h() {
        removeAllViews();
        this.f1037m = null;
        this.f1255c = null;
        this.f1256d = null;
        View view = this.f1036l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1256d;
        if (cVar != null) {
            cVar.b();
            c.a aVar = this.f1256d.f1284u;
            if (aVar != null && aVar.b()) {
                aVar.f995j.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean a10 = x2.a(this);
        int paddingRight = a10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1035k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1035k.getLayoutParams();
            int i14 = a10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = a10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = a10 ? paddingRight - i14 : paddingRight + i14;
            int d10 = androidx.appcompat.widget.a.d(i16, paddingTop, paddingTop2, this.f1035k, a10) + i16;
            paddingRight = a10 ? d10 - i15 : d10 + i15;
        }
        LinearLayout linearLayout = this.f1038n;
        if (linearLayout != null && this.f1037m == null && linearLayout.getVisibility() != 8) {
            paddingRight += androidx.appcompat.widget.a.d(paddingRight, paddingTop, paddingTop2, this.f1038n, a10);
        }
        View view2 = this.f1037m;
        if (view2 != null) {
            androidx.appcompat.widget.a.d(paddingRight, paddingTop, paddingTop2, view2, a10);
        }
        int paddingLeft = a10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1255c;
        if (actionMenuView != null) {
            androidx.appcompat.widget.a.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !a10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i10);
            int i12 = this.f1257e;
            if (i12 <= 0) {
                i12 = View.MeasureSpec.getSize(i11);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i13 = i12 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
            View view = this.f1035k;
            if (view != null) {
                int c10 = androidx.appcompat.widget.a.c(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1035k.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1255c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = androidx.appcompat.widget.a.c(this.f1255c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.f1038n;
            if (linearLayout != null && this.f1037m == null) {
                if (this.f1043s) {
                    this.f1038n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1038n.getMeasuredWidth();
                    boolean z10 = measuredWidth <= paddingLeft;
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1038n.setVisibility(z10 ? 0 : 8);
                } else {
                    paddingLeft = androidx.appcompat.widget.a.c(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.f1037m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i14 = layoutParams.width;
                int i15 = i14 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i14 >= 0) {
                    paddingLeft = Math.min(i14, paddingLeft);
                }
                int i16 = layoutParams.height;
                int i17 = i16 == -2 ? Integer.MIN_VALUE : 1073741824;
                if (i16 >= 0) {
                    i13 = Math.min(i16, i13);
                }
                this.f1037m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i15), View.MeasureSpec.makeMeasureSpec(i13, i17));
            }
            if (this.f1257e <= 0) {
                int childCount = getChildCount();
                i12 = 0;
                for (int i18 = 0; i18 < childCount; i18++) {
                    int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i12) {
                        i12 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i12);
        }
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f1257e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1037m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1037m = view;
        if (view != null && (linearLayout = this.f1038n) != null) {
            removeView(linearLayout);
            this.f1038n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1034j = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1033i = charSequence;
        g();
        k1.o0.q(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f1043s) {
            requestLayout();
        }
        this.f1043s = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
