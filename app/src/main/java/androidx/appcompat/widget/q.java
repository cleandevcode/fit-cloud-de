package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes.dex */
public final class q extends MultiAutoCompleteTextView implements o1.c0 {

    /* renamed from: d */
    public static final int[] f1484d = {16843126};

    /* renamed from: a */
    public final e f1485a;

    /* renamed from: b */
    public final v0 f1486b;

    /* renamed from: c */
    public final m f1487c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            int r0 = androidx.appcompat.R.attr.autoCompleteTextViewStyle
            androidx.appcompat.widget.i2.a(r5)
            r4.<init>(r5, r6, r0)
            android.content.Context r5 = r4.getContext()
            androidx.appcompat.widget.g2.a(r4, r5)
            android.content.Context r5 = r4.getContext()
            int[] r1 = androidx.appcompat.widget.q.f1484d
            androidx.appcompat.widget.l2 r5 = androidx.appcompat.widget.l2.m(r5, r6, r1, r0)
            r1 = 0
            boolean r2 = r5.l(r1)
            if (r2 == 0) goto L27
            android.graphics.drawable.Drawable r1 = r5.e(r1)
            r4.setDropDownBackgroundDrawable(r1)
        L27:
            r5.n()
            androidx.appcompat.widget.e r5 = new androidx.appcompat.widget.e
            r5.<init>(r4)
            r4.f1485a = r5
            r5.d(r6, r0)
            androidx.appcompat.widget.v0 r5 = new androidx.appcompat.widget.v0
            r5.<init>(r4)
            r4.f1486b = r5
            r5.f(r6, r0)
            r5.b()
            androidx.appcompat.widget.m r5 = new androidx.appcompat.widget.m
            r5.<init>(r4)
            r4.f1487c = r5
            r5.b(r6, r0)
            android.text.method.KeyListener r6 = r4.getKeyListener()
            boolean r0 = r6 instanceof android.text.method.NumberKeyListener
            r0 = r0 ^ 1
            if (r0 == 0) goto L7b
            boolean r0 = r4.isFocusable()
            boolean r1 = r4.isClickable()
            boolean r2 = r4.isLongClickable()
            int r3 = r4.getInputType()
            android.text.method.KeyListener r5 = r5.a(r6)
            if (r5 != r6) goto L6c
            goto L7b
        L6c:
            super.setKeyListener(r5)
            r4.setRawInputType(r3)
            r4.setFocusable(r0)
            r4.setClickable(r1)
            r4.setLongClickable(r2)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1485a;
        if (eVar != null) {
            eVar.a();
        }
        v0 v0Var = this.f1486b;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1485a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1485a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1486b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1486b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        tb.a.j(this, editorInfo, onCreateInputConnection);
        return this.f1487c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1485a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1485a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f1486b;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f1486b;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(g.a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f1487c.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1487c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1485a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1485a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // o1.c0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1486b.l(colorStateList);
        this.f1486b.b();
    }

    @Override // o1.c0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1486b.m(mode);
        this.f1486b.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        v0 v0Var = this.f1486b;
        if (v0Var != null) {
            v0Var.g(context, i10);
        }
    }
}
