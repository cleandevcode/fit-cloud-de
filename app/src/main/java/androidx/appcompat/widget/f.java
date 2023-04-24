package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.appcompat.R;

/* loaded from: classes.dex */
public class f extends Button implements o1.b, o1.c0 {

    /* renamed from: a */
    public final e f1327a;

    /* renamed from: b */
    public final v0 f1328b;

    /* renamed from: c */
    public n f1329c;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i2.a(context);
        g2.a(this, getContext());
        e eVar = new e(this);
        this.f1327a = eVar;
        eVar.d(attributeSet, i10);
        v0 v0Var = new v0(this);
        this.f1328b = v0Var;
        v0Var.f(attributeSet, i10);
        v0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private n getEmojiTextViewHelper() {
        if (this.f1329c == null) {
            this.f1329c = new n(this);
        }
        return this.f1329c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1327a;
        if (eVar != null) {
            eVar.a();
        }
        v0 v0Var = this.f1328b;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (o1.b.J) {
            return super.getAutoSizeMaxTextSize();
        }
        v0 v0Var = this.f1328b;
        if (v0Var != null) {
            return Math.round(v0Var.f1574i.f1320e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (o1.b.J) {
            return super.getAutoSizeMinTextSize();
        }
        v0 v0Var = this.f1328b;
        if (v0Var != null) {
            return Math.round(v0Var.f1574i.f1319d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (o1.b.J) {
            return super.getAutoSizeStepGranularity();
        }
        v0 v0Var = this.f1328b;
        if (v0Var != null) {
            return Math.round(v0Var.f1574i.f1318c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (o1.b.J) {
            return super.getAutoSizeTextAvailableSizes();
        }
        v0 v0Var = this.f1328b;
        if (v0Var != null) {
            return v0Var.f1574i.f1321f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (o1.b.J) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        v0 v0Var = this.f1328b;
        if (v0Var == null) {
            return 0;
        }
        return v0Var.f1574i.f1316a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o1.p.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1327a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1327a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1328b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1328b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        v0 v0Var = this.f1328b;
        if (v0Var != null && !o1.b.J) {
            v0Var.f1574i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        super.onTextChanged(charSequence, i10, i11, i12);
        v0 v0Var = this.f1328b;
        if (v0Var != null && !o1.b.J) {
            e1 e1Var = v0Var.f1574i;
            if (e1Var.i() && e1Var.f1316a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f1328b.f1574i.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (o1.b.J) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        v0 v0Var = this.f1328b;
        if (v0Var != null) {
            v0Var.i(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (o1.b.J) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        v0 v0Var = this.f1328b;
        if (v0Var != null) {
            v0Var.j(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (o1.b.J) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        v0 v0Var = this.f1328b;
        if (v0Var != null) {
            v0Var.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1327a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1327a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o1.p.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        v0 v0Var = this.f1328b;
        if (v0Var != null) {
            v0Var.f1566a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1327a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1327a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // o1.c0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1328b.l(colorStateList);
        this.f1328b.b();
    }

    @Override // o1.c0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1328b.m(mode);
        this.f1328b.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        v0 v0Var = this.f1328b;
        if (v0Var != null) {
            v0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z10;
        boolean z11 = o1.b.J;
        if (z11) {
            super.setTextSize(i10, f10);
            return;
        }
        v0 v0Var = this.f1328b;
        if (v0Var != null && !z11) {
            e1 e1Var = v0Var.f1574i;
            if (e1Var.i() && e1Var.f1316a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                v0Var.f1574i.f(f10, i10);
            }
        }
    }
}
