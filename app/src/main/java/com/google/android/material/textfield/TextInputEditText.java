package com.google.android.material.textfield;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.l;
import java.util.Locale;

/* loaded from: classes.dex */
public class TextInputEditText extends l {

    /* renamed from: f */
    public final Rect f6775f;

    /* renamed from: g */
    public boolean f6776g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputEditText(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = com.google.android.material.R.attr.editTextStyle
            r6 = 0
            android.content.Context r0 = la.a.a(r8, r9, r3, r6)
            r7.<init>(r0, r9, r3)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f6775f = r0
            int[] r2 = com.google.android.material.R.styleable.TextInputEditText
            int r4 = com.google.android.material.R.style.Widget_Design_TextInputEditText
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r8 = z9.o.d(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.TextInputEditText_textInputLayoutFocusedRectEnabled
            boolean r9 = r8.getBoolean(r9, r6)
            r7.setTextInputLayoutFocusedRectEnabled(r9)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputEditText.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        boolean z10;
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f6776g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && rect != null) {
            textInputLayout.getFocusedRect(this.f6775f);
            rect.bottom = this.f6775f.bottom;
        }
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean z10;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f6776g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.E) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.E && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.l, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            Editable text = getText();
            CharSequence hint = textInputLayout.getHint();
            boolean z10 = !TextUtils.isEmpty(text);
            String str2 = "";
            if (!(!TextUtils.isEmpty(hint))) {
                str = "";
            } else {
                str = hint.toString();
            }
            if (z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) text);
                if (!TextUtils.isEmpty(str)) {
                    str2 = a.b.b(", ", str);
                }
                sb2.append(str2);
                str2 = sb2.toString();
            } else if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            accessibilityNodeInfo.setText(str2);
        }
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean z10;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f6776g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && rect != null) {
            this.f6775f.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.f6775f);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f6776g = z10;
    }
}
