package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public final class h extends CheckedTextView implements o1.c0 {

    /* renamed from: a */
    public final i f1360a;

    /* renamed from: b */
    public final e f1361b;

    /* renamed from: c */
    public final v0 f1362c;

    /* renamed from: d */
    public n f1363d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0063 A[Catch: all -> 0x00b1, TRY_ENTER, TryCatch #0 {all -> 0x00b1, blocks: (B:35:0x0043, B:37:0x004c, B:39:0x0052, B:44:0x0063, B:46:0x006b, B:48:0x0071, B:49:0x007e, B:51:0x0086, B:52:0x008f, B:54:0x0097), top: B:60:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086 A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:35:0x0043, B:37:0x004c, B:39:0x0052, B:44:0x0063, B:46:0x006b, B:48:0x0071, B:49:0x007e, B:51:0x0086, B:52:0x008f, B:54:0x0097), top: B:60:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:35:0x0043, B:37:0x004c, B:39:0x0052, B:44:0x0063, B:46:0x006b, B:48:0x0071, B:49:0x007e, B:51:0x0086, B:52:0x008f, B:54:0x0097), top: B:60:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            int r6 = androidx.appcompat.R.attr.checkedTextViewStyle
            androidx.appcompat.widget.i2.a(r9)
            r8.<init>(r9, r10, r6)
            android.content.Context r9 = r8.getContext()
            androidx.appcompat.widget.g2.a(r8, r9)
            androidx.appcompat.widget.v0 r9 = new androidx.appcompat.widget.v0
            r9.<init>(r8)
            r8.f1362c = r9
            r9.f(r10, r6)
            r9.b()
            androidx.appcompat.widget.e r9 = new androidx.appcompat.widget.e
            r9.<init>(r8)
            r8.f1361b = r9
            r9.d(r10, r6)
            androidx.appcompat.widget.i r9 = new androidx.appcompat.widget.i
            r9.<init>(r8)
            r8.f1360a = r9
            android.content.Context r0 = r8.getContext()
            int[] r2 = androidx.appcompat.R.styleable.CheckedTextView
            androidx.appcompat.widget.l2 r7 = androidx.appcompat.widget.l2.m(r0, r10, r2, r6)
            android.content.Context r1 = r8.getContext()
            android.content.res.TypedArray r4 = r7.f1415b
            r0 = r8
            r3 = r10
            r5 = r6
            k1.o0.o(r0, r1, r2, r3, r4, r5)
            int r0 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkCompat     // Catch: java.lang.Throwable -> Lb1
            boolean r1 = r7.l(r0)     // Catch: java.lang.Throwable -> Lb1
            r2 = 0
            if (r1 == 0) goto L60
            int r0 = r7.i(r0, r2)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L60
            android.content.Context r1 = r8.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.Throwable -> Lb1
            android.graphics.drawable.Drawable r0 = g.a.b(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.Throwable -> Lb1
            r8.setCheckMarkDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.Throwable -> Lb1
            r0 = 1
            goto L61
        L5f:
        L60:
            r0 = 0
        L61:
            if (r0 != 0) goto L7e
            int r0 = androidx.appcompat.R.styleable.CheckedTextView_android_checkMark     // Catch: java.lang.Throwable -> Lb1
            boolean r1 = r7.l(r0)     // Catch: java.lang.Throwable -> Lb1
            if (r1 == 0) goto L7e
            int r0 = r7.i(r0, r2)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L7e
            android.widget.CheckedTextView r1 = r9.f1367a     // Catch: java.lang.Throwable -> Lb1
            android.content.Context r2 = r1.getContext()     // Catch: java.lang.Throwable -> Lb1
            android.graphics.drawable.Drawable r0 = g.a.b(r2, r0)     // Catch: java.lang.Throwable -> Lb1
            r1.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> Lb1
        L7e:
            int r0 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTint     // Catch: java.lang.Throwable -> Lb1
            boolean r1 = r7.l(r0)     // Catch: java.lang.Throwable -> Lb1
            if (r1 == 0) goto L8f
            android.widget.CheckedTextView r1 = r9.f1367a     // Catch: java.lang.Throwable -> Lb1
            android.content.res.ColorStateList r0 = r7.b(r0)     // Catch: java.lang.Throwable -> Lb1
            r1.setCheckMarkTintList(r0)     // Catch: java.lang.Throwable -> Lb1
        L8f:
            int r0 = androidx.appcompat.R.styleable.CheckedTextView_checkMarkTintMode     // Catch: java.lang.Throwable -> Lb1
            boolean r1 = r7.l(r0)     // Catch: java.lang.Throwable -> Lb1
            if (r1 == 0) goto La6
            android.widget.CheckedTextView r9 = r9.f1367a     // Catch: java.lang.Throwable -> Lb1
            r1 = -1
            int r0 = r7.h(r0, r1)     // Catch: java.lang.Throwable -> Lb1
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.k1.d(r0, r1)     // Catch: java.lang.Throwable -> Lb1
            r9.setCheckMarkTintMode(r0)     // Catch: java.lang.Throwable -> Lb1
        La6:
            r7.n()
            androidx.appcompat.widget.n r9 = r8.getEmojiTextViewHelper()
            r9.b(r10, r6)
            return
        Lb1:
            r9 = move-exception
            r7.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private n getEmojiTextViewHelper() {
        if (this.f1363d == null) {
            this.f1363d = new n(this);
        }
        return this.f1363d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        v0 v0Var = this.f1362c;
        if (v0Var != null) {
            v0Var.b();
        }
        e eVar = this.f1361b;
        if (eVar != null) {
            eVar.a();
        }
        i iVar = this.f1360a;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o1.p.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1361b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1361b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        i iVar = this.f1360a;
        if (iVar != null) {
            return iVar.f1368b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        i iVar = this.f1360a;
        if (iVar != null) {
            return iVar.f1369c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1362c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1362c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        tb.a.j(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1361b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1361b;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(g.a.b(getContext(), i10));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        i iVar = this.f1360a;
        if (iVar != null) {
            if (iVar.f1372f) {
                iVar.f1372f = false;
                return;
            }
            iVar.f1372f = true;
            iVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f1362c;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f1362c;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1361b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1361b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        i iVar = this.f1360a;
        if (iVar != null) {
            iVar.f1368b = colorStateList;
            iVar.f1370d = true;
            iVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        i iVar = this.f1360a;
        if (iVar != null) {
            iVar.f1369c = mode;
            iVar.f1371e = true;
            iVar.a();
        }
    }

    @Override // o1.c0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1362c.l(colorStateList);
        this.f1362c.b();
    }

    @Override // o1.c0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1362c.m(mode);
        this.f1362c.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        v0 v0Var = this.f1362c;
        if (v0Var != null) {
            v0Var.g(context, i10);
        }
    }
}
