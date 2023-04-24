package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.q2;
import b1.a;
import com.google.android.material.R;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import l1.j;
import o1.p;
import z0.f;
import z9.g;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends g implements k.a {
    public static final int[] F = {16842912};
    public h A;
    public ColorStateList B;
    public boolean C;
    public Drawable D;
    public final a E;

    /* renamed from: v */
    public int f6624v;

    /* renamed from: w */
    public boolean f6625w;

    /* renamed from: x */
    public boolean f6626x;

    /* renamed from: y */
    public final CheckedTextView f6627y;

    /* renamed from: z */
    public FrameLayout f6628z;

    /* loaded from: classes.dex */
    public class a extends k1.a {
        public a() {
            NavigationMenuItemView.this = r1;
        }

        @Override // k1.a
        public final void d(View view, j jVar) {
            this.f18085a.onInitializeAccessibilityNodeInfo(view, jVar.f18670a);
            jVar.f18670a.setCheckable(NavigationMenuItemView.this.f6626x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.E = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f6627y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        o0.p(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f6628z == null) {
                this.f6628z = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f6628z.removeAllViews();
            this.f6628z.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void d(h hVar) {
        int i10;
        LinearLayoutCompat.a aVar;
        int i11;
        StateListDrawable stateListDrawable;
        this.A = hVar;
        int i12 = hVar.f959a;
        if (i12 > 0) {
            setId(i12);
        }
        if (hVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        boolean z10 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(F, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.q(this, stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.f963e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.f975q);
        q2.a(this, hVar.f976r);
        h hVar2 = this.A;
        if ((hVar2.f963e == null && hVar2.getIcon() == null && this.A.getActionView() != null) ? false : false) {
            this.f6627y.setVisibility(8);
            FrameLayout frameLayout = this.f6628z;
            if (frameLayout != null) {
                aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                i11 = -1;
            } else {
                return;
            }
        } else {
            this.f6627y.setVisibility(0);
            FrameLayout frameLayout2 = this.f6628z;
            if (frameLayout2 != null) {
                aVar = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
                i11 = -2;
            } else {
                return;
            }
        }
        ((LinearLayout.LayoutParams) aVar).width = i11;
        this.f6628z.setLayoutParams(aVar);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        h hVar = this.A;
        if (hVar != null && hVar.isCheckable() && this.A.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f6626x != z10) {
            this.f6626x = z10;
            this.E.h(this.f6627y, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f6627y.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = b1.a.g(drawable).mutate();
                a.b.h(drawable, this.B);
            }
            int i10 = this.f6624v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f6625w) {
            if (this.D == null) {
                Resources resources = getResources();
                int i11 = R.drawable.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = f.f31856a;
                Drawable a10 = f.a.a(resources, i11, theme);
                this.D = a10;
                if (a10 != null) {
                    int i12 = this.f6624v;
                    a10.setBounds(0, 0, i12, i12);
                }
            }
            drawable = this.D;
        }
        p.b.e(this.f6627y, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f6627y.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f6624v = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.B = colorStateList;
        this.C = colorStateList != null;
        h hVar = this.A;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f6627y.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f6625w = z10;
    }

    public void setTextAppearance(int i10) {
        p.e(this.f6627y, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f6627y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f6627y.setText(charSequence);
    }
}
