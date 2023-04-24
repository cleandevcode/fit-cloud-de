package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.t0;
import i1.d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import o1.p;

/* loaded from: classes.dex */
public class d1 extends TextView implements o1.c0, o1.b {

    /* renamed from: a */
    public final e f1302a;

    /* renamed from: b */
    public final v0 f1303b;

    /* renamed from: c */
    public final t0 f1304c;

    /* renamed from: d */
    public n f1305d;

    /* renamed from: e */
    public boolean f1306e;

    /* renamed from: f */
    public Future<i1.d> f1307f;

    public d1() {
        throw null;
    }

    public d1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i2.a(context);
        this.f1306e = false;
        g2.a(this, getContext());
        e eVar = new e(this);
        this.f1302a = eVar;
        eVar.d(attributeSet, i10);
        v0 v0Var = new v0(this);
        this.f1303b = v0Var;
        v0Var.f(attributeSet, i10);
        v0Var.b();
        this.f1304c = new t0(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private n getEmojiTextViewHelper() {
        if (this.f1305d == null) {
            this.f1305d = new n(this);
        }
        return this.f1305d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1302a;
        if (eVar != null) {
            eVar.a();
        }
        v0 v0Var = this.f1303b;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (o1.b.J) {
            return super.getAutoSizeMaxTextSize();
        }
        v0 v0Var = this.f1303b;
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
        v0 v0Var = this.f1303b;
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
        v0 v0Var = this.f1303b;
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
        v0 v0Var = this.f1303b;
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
        v0 v0Var = this.f1303b;
        if (v0Var == null) {
            return 0;
        }
        return v0Var.f1574i.f1316a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o1.p.f(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1302a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1302a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1303b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1303b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<i1.d> future = this.f1307f;
        if (future != null) {
            try {
                this.f1307f = null;
                o1.p.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        t0 t0Var;
        if (Build.VERSION.SDK_INT < 28 && (t0Var = this.f1304c) != null) {
            TextClassifier textClassifier = t0Var.f1553b;
            if (textClassifier == null) {
                return t0.a.a(t0Var.f1552a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public d.a getTextMetricsParamsCompat() {
        return o1.p.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1303b.getClass();
        v0.h(this, onCreateInputConnection, editorInfo);
        tb.a.j(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        v0 v0Var = this.f1303b;
        if (v0Var != null && !o1.b.J) {
            v0Var.f1574i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future<i1.d> future = this.f1307f;
        if (future != null) {
            try {
                this.f1307f = null;
                o1.p.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        super.onTextChanged(charSequence, i10, i11, i12);
        v0 v0Var = this.f1303b;
        if (v0Var != null && !o1.b.J) {
            e1 e1Var = v0Var.f1574i;
            if (e1Var.i() && e1Var.f1316a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f1303b.f1574i.a();
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
        v0 v0Var = this.f1303b;
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
        v0 v0Var = this.f1303b;
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
        v0 v0Var = this.f1303b;
        if (v0Var != null) {
            v0Var.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1302a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1302a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f1303b;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f1303b;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? g.a.b(context, i10) : null, i11 != 0 ? g.a.b(context, i11) : null, i12 != 0 ? g.a.b(context, i12) : null, i13 != 0 ? g.a.b(context, i13) : null);
        v0 v0Var = this.f1303b;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? g.a.b(context, i10) : null, i11 != 0 ? g.a.b(context, i11) : null, i12 != 0 ? g.a.b(context, i12) : null, i13 != 0 ? g.a.b(context, i13) : null);
        v0 v0Var = this.f1303b;
        if (v0Var != null) {
            v0Var.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            o1.p.b(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            o1.p.c(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        s.h1.h(i10);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(i1.d dVar) {
        o1.p.d(this, dVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1302a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1302a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // o1.c0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1303b.l(colorStateList);
        this.f1303b.b();
    }

    @Override // o1.c0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1303b.m(mode);
        this.f1303b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        v0 v0Var = this.f1303b;
        if (v0Var != null) {
            v0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        t0 t0Var;
        if (Build.VERSION.SDK_INT < 28 && (t0Var = this.f1304c) != null) {
            t0Var.f1553b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<i1.d> future) {
        this.f1307f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(d.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f16210b;
        int i11 = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i11 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i11 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i11 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i11 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i11 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i11 = 7;
            }
        }
        p.b.h(this, i11);
        if (i10 < 23) {
            float textScaleX = aVar.f16209a.getTextScaleX();
            getPaint().set(aVar.f16209a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(aVar.f16209a);
        p.c.e(this, aVar.f16211c);
        p.c.h(this, aVar.f16212d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z10;
        boolean z11 = o1.b.J;
        if (z11) {
            super.setTextSize(i10, f10);
            return;
        }
        v0 v0Var = this.f1303b;
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        if (this.f1306e) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i10 > 0) {
            Context context = getContext();
            a1.n nVar = a1.g.f221a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i10);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        }
        this.f1306e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f1306e = false;
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f1303b;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f1303b;
        if (v0Var != null) {
            v0Var.b();
        }
    }
}
