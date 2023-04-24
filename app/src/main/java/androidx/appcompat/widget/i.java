package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import b1.a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public final CheckedTextView f1367a;

    /* renamed from: b */
    public ColorStateList f1368b = null;

    /* renamed from: c */
    public PorterDuff.Mode f1369c = null;

    /* renamed from: d */
    public boolean f1370d = false;

    /* renamed from: e */
    public boolean f1371e = false;

    /* renamed from: f */
    public boolean f1372f;

    public i(CheckedTextView checkedTextView) {
        this.f1367a = checkedTextView;
    }

    public final void a() {
        Drawable checkMarkDrawable = this.f1367a.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1370d || this.f1371e) {
                Drawable mutate = b1.a.g(checkMarkDrawable).mutate();
                if (this.f1370d) {
                    a.b.h(mutate, this.f1368b);
                }
                if (this.f1371e) {
                    a.b.i(mutate, this.f1369c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1367a.getDrawableState());
                }
                this.f1367a.setCheckMarkDrawable(mutate);
            }
        }
    }
}
