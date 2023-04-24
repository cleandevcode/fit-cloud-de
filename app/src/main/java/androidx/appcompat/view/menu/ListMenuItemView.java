package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.l2;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    public h f855a;

    /* renamed from: b */
    public ImageView f856b;

    /* renamed from: c */
    public RadioButton f857c;

    /* renamed from: d */
    public TextView f858d;

    /* renamed from: e */
    public CheckBox f859e;

    /* renamed from: f */
    public TextView f860f;

    /* renamed from: g */
    public ImageView f861g;

    /* renamed from: h */
    public ImageView f862h;

    /* renamed from: i */
    public LinearLayout f863i;

    /* renamed from: j */
    public Drawable f864j;

    /* renamed from: k */
    public int f865k;

    /* renamed from: l */
    public Context f866l;

    /* renamed from: m */
    public boolean f867m;

    /* renamed from: n */
    public Drawable f868n;

    /* renamed from: o */
    public boolean f869o;

    /* renamed from: p */
    public LayoutInflater f870p;

    /* renamed from: q */
    public boolean f871q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10 = R.attr.listMenuViewStyle;
        l2 m10 = l2.m(getContext(), attributeSet, R.styleable.MenuView, i10);
        this.f864j = m10.e(R.styleable.MenuView_android_itemBackground);
        this.f865k = m10.i(R.styleable.MenuView_android_itemTextAppearance, -1);
        this.f867m = m10.a(R.styleable.MenuView_preserveIconSpacing, false);
        this.f866l = context;
        this.f868n = m10.e(R.styleable.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f869o = obtainStyledAttributes.hasValue(0);
        m10.n();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f870p == null) {
            this.f870p = LayoutInflater.from(getContext());
        }
        return this.f870p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f861g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f862h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f862h.getLayoutParams();
        rect.top = this.f862h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x005c, code lost:
        if (r0 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0063  */
    @Override // androidx.appcompat.view.menu.k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.appcompat.view.menu.h r11) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.d(androidx.appcompat.view.menu.h):void");
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f855a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f864j;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        o0.d.q(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f858d = textView;
        int i10 = this.f865k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f866l, i10);
        }
        this.f860f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f861g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f868n);
        }
        this.f862h = (ImageView) findViewById(R.id.group_divider);
        this.f863i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f856b != null && this.f867m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f856b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        boolean z11;
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f857c == null && this.f859e == null) {
            return;
        }
        if ((this.f855a.f982x & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f857c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f857c = radioButton;
                LinearLayout linearLayout = this.f863i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f857c;
            view = this.f859e;
        } else {
            if (this.f859e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f859e = checkBox;
                LinearLayout linearLayout2 = this.f863i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f859e;
            view = this.f857c;
        }
        if (z10) {
            compoundButton.setChecked(this.f855a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f859e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f857c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        boolean z11;
        CompoundButton compoundButton;
        if ((this.f855a.f982x & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f857c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f857c = radioButton;
                LinearLayout linearLayout = this.f863i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f857c;
        } else {
            if (this.f859e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f859e = checkBox;
                LinearLayout linearLayout2 = this.f863i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f859e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f871q = z10;
        this.f867m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f862h;
        if (imageView != null) {
            imageView.setVisibility((this.f869o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f855a.f972n.getClass();
        boolean z10 = this.f871q;
        if (!z10 && !this.f867m) {
            return;
        }
        ImageView imageView = this.f856b;
        if (imageView == null && drawable == null && !this.f867m) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f856b = imageView2;
            LinearLayout linearLayout = this.f863i;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.f867m) {
            this.f856b.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f856b;
        if (!z10) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f856b.getVisibility() != 0) {
            this.f856b.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i10;
        TextView textView;
        if (charSequence != null) {
            this.f858d.setText(charSequence);
            if (this.f858d.getVisibility() == 0) {
                return;
            }
            textView = this.f858d;
            i10 = 0;
        } else {
            i10 = 8;
            if (this.f858d.getVisibility() == 8) {
                return;
            }
            textView = this.f858d;
        }
        textView.setVisibility(i10);
    }
}
