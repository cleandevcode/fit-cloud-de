package b1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a */
    public int f3989a;

    /* renamed from: b */
    public Drawable.ConstantState f3990b;

    /* renamed from: c */
    public ColorStateList f3991c;

    /* renamed from: d */
    public PorterDuff.Mode f3992d;

    public n(n nVar) {
        this.f3991c = null;
        this.f3992d = l.f3981g;
        if (nVar != null) {
            this.f3989a = nVar.f3989a;
            this.f3990b = nVar.f3990b;
            this.f3991c = nVar.f3991c;
            this.f3992d = nVar.f3992d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i10 = this.f3989a;
        Drawable.ConstantState constantState = this.f3990b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new m(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new m(this, resources);
    }
}
