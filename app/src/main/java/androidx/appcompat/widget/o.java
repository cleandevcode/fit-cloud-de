package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.appcompat.R;

/* loaded from: classes.dex */
public class o extends ImageButton {

    /* renamed from: a */
    public final e f1445a;

    /* renamed from: b */
    public final p f1446b;

    /* renamed from: c */
    public boolean f1447c;

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i2.a(context);
        this.f1447c = false;
        g2.a(this, getContext());
        e eVar = new e(this);
        this.f1445a = eVar;
        eVar.d(attributeSet, i10);
        p pVar = new p(this);
        this.f1446b = pVar;
        pVar.b(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1445a;
        if (eVar != null) {
            eVar.a();
        }
        p pVar = this.f1446b;
        if (pVar != null) {
            pVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1445a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1445a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        j2 j2Var;
        p pVar = this.f1446b;
        if (pVar == null || (j2Var = pVar.f1479b) == null) {
            return null;
        }
        return j2Var.f1380a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        j2 j2Var;
        p pVar = this.f1446b;
        if (pVar == null || (j2Var = pVar.f1479b) == null) {
            return null;
        }
        return j2Var.f1381b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(this.f1446b.f1478a.getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1445a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1445a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        p pVar = this.f1446b;
        if (pVar != null) {
            pVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        p pVar = this.f1446b;
        if (pVar != null && drawable != null && !this.f1447c) {
            pVar.f1481d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        p pVar2 = this.f1446b;
        if (pVar2 != null) {
            pVar2.a();
            if (!this.f1447c) {
                p pVar3 = this.f1446b;
                if (pVar3.f1478a.getDrawable() != null) {
                    pVar3.f1478a.getDrawable().setLevel(pVar3.f1481d);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1447c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f1446b.c(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        p pVar = this.f1446b;
        if (pVar != null) {
            pVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1445a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1445a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        p pVar = this.f1446b;
        if (pVar != null) {
            if (pVar.f1479b == null) {
                pVar.f1479b = new j2();
            }
            j2 j2Var = pVar.f1479b;
            j2Var.f1380a = colorStateList;
            j2Var.f1383d = true;
            pVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        p pVar = this.f1446b;
        if (pVar != null) {
            if (pVar.f1479b == null) {
                pVar.f1479b = new j2();
            }
            j2 j2Var = pVar.f1479b;
            j2Var.f1381b = mode;
            j2Var.f1382c = true;
            pVar.a();
        }
    }
}
