package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.o1;
import androidx.appcompat.widget.q2;

/* loaded from: classes.dex */
public class ActionMenuItemView extends d1 implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: g */
    public h f841g;

    /* renamed from: h */
    public CharSequence f842h;

    /* renamed from: i */
    public Drawable f843i;

    /* renamed from: j */
    public f.b f844j;

    /* renamed from: k */
    public a f845k;

    /* renamed from: l */
    public b f846l;

    /* renamed from: m */
    public boolean f847m;

    /* renamed from: n */
    public boolean f848n;

    /* renamed from: o */
    public int f849o;

    /* renamed from: p */
    public int f850p;

    /* renamed from: q */
    public int f851q;

    /* loaded from: classes.dex */
    public class a extends o1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(r1);
            ActionMenuItemView.this = r1;
        }

        @Override // androidx.appcompat.widget.o1
        public final l.f b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.f846l;
            if (bVar == null || (aVar = androidx.appcompat.widget.c.this.f1284u) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // androidx.appcompat.widget.o1
        public final boolean c() {
            l.f b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.f844j;
            return bVar != null && bVar.a(actionMenuItemView.f841g) && (b10 = b()) != null && b10.a();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f847m = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionMenuItemView, 0, 0);
        this.f849o = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f851q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f850p = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        return f() && this.f841g.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void d(h hVar) {
        int i10;
        this.f841g = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.f959a);
        if (hVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f845k == null) {
            this.f845k = new a();
        }
    }

    public final boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f841g;
    }

    public final void h() {
        CharSequence charSequence;
        boolean z10;
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f842h);
        if (this.f843i != null) {
            if ((this.f841g.f983y & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || (!this.f847m && !this.f848n)) {
                z11 = false;
            }
        }
        boolean z13 = z12 & z11;
        CharSequence charSequence2 = null;
        if (z13) {
            charSequence = this.f842h;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence3 = this.f841g.f975q;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z13) {
                charSequence3 = null;
            } else {
                charSequence3 = this.f841g.f963e;
            }
        }
        setContentDescription(charSequence3);
        CharSequence charSequence4 = this.f841g.f976r;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z13) {
                charSequence2 = this.f841g.f963e;
            }
            q2.a(this, charSequence2);
            return;
        }
        q2.a(this, charSequence4);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f.b bVar = this.f844j;
        if (bVar != null) {
            bVar.a(this.f841g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f847m = g();
        h();
    }

    @Override // androidx.appcompat.widget.d1, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean f10 = f();
        if (f10 && (i12 = this.f850p) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f849o) : this.f849o;
        if (mode != 1073741824 && this.f849o > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (f10 || this.f843i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f843i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f841g.hasSubMenu() && (aVar = this.f845k) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f848n != z10) {
            this.f848n = z10;
            h hVar = this.f841g;
            if (hVar != null) {
                f fVar = hVar.f972n;
                fVar.f942k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f843i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f851q;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(f.b bVar) {
        this.f844j = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f850p = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f846l = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f842h = charSequence;
        h();
    }
}
