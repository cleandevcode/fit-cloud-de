package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.R;
import androidx.appcompat.widget.t0;
import k1.c;

/* loaded from: classes.dex */
public class l extends EditText implements k1.g0, o1.c0 {

    /* renamed from: a */
    public final e f1405a;

    /* renamed from: b */
    public final v0 f1406b;

    /* renamed from: c */
    public final t0 f1407c;

    /* renamed from: d */
    public final o1.b0 f1408d;

    /* renamed from: e */
    public final m f1409e;

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i2.a(context);
        g2.a(this, getContext());
        e eVar = new e(this);
        this.f1405a = eVar;
        eVar.d(attributeSet, i10);
        v0 v0Var = new v0(this);
        this.f1406b = v0Var;
        v0Var.f(attributeSet, i10);
        v0Var.b();
        this.f1407c = new t0(this);
        this.f1408d = new o1.b0();
        m mVar = new m(this);
        this.f1409e = mVar;
        mVar.b(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a10 = mVar.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // k1.g0
    public final k1.c a(k1.c cVar) {
        return this.f1408d.a(this, cVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1405a;
        if (eVar != null) {
            eVar.a();
        }
        v0 v0Var = this.f1406b;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o1.p.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1405a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1405a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1406b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1406b.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        t0 t0Var;
        if (Build.VERSION.SDK_INT < 28 && (t0Var = this.f1407c) != null) {
            TextClassifier textClassifier = t0Var.f1553b;
            if (textClassifier == null) {
                return t0.a.a(t0Var.f1552a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        String[] g10;
        InputConnection dVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1406b.getClass();
        v0.h(this, onCreateInputConnection, editorInfo);
        tb.a.j(this, editorInfo, onCreateInputConnection);
        if (onCreateInputConnection != null && (i10 = Build.VERSION.SDK_INT) <= 30 && (g10 = k1.o0.g(this)) != null) {
            n1.b.b(editorInfo, g10);
            s.i0 i0Var = new s.i0(2, this);
            if (i10 >= 25) {
                dVar = new n1.c(onCreateInputConnection, i0Var);
            } else if (n1.b.a(editorInfo).length != 0) {
                dVar = new n1.d(onCreateInputConnection, i0Var);
            }
            onCreateInputConnection = dVar;
        }
        return this.f1409e.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && k1.o0.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z10 = o0.a(dragEvent, this, activity);
            }
        }
        if (z10) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        c.b c0314c;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 < 31 && k1.o0.g(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i11 >= 31) {
                    c0314c = new c.a(primaryClip, 1);
                } else {
                    c0314c = new c.C0314c(primaryClip, 1);
                }
                if (i10 != 16908322) {
                    i12 = 1;
                }
                c0314c.b(i12);
                k1.o0.l(this, c0314c.build());
            }
            i12 = 1;
        }
        if (i12 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1405a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1405a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f1406b;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f1406b;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o1.p.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f1409e.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1409e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1405a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1405a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // o1.c0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1406b.l(colorStateList);
        this.f1406b.b();
    }

    @Override // o1.c0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1406b.m(mode);
        this.f1406b.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        v0 v0Var = this.f1406b;
        if (v0Var != null) {
            v0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        t0 t0Var;
        if (Build.VERSION.SDK_INT < 28 && (t0Var = this.f1407c) != null) {
            t0Var.f1553b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }
}
