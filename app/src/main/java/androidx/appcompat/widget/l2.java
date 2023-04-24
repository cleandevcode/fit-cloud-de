package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.v0;

/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a */
    public final Context f1414a;

    /* renamed from: b */
    public final TypedArray f1415b;

    /* renamed from: c */
    public TypedValue f1416c;

    public l2(Context context, TypedArray typedArray) {
        this.f1414a = context;
        this.f1415b = typedArray;
    }

    public static l2 m(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new l2(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public final boolean a(int i10, boolean z10) {
        return this.f1415b.getBoolean(i10, z10);
    }

    public final ColorStateList b(int i10) {
        int resourceId;
        ColorStateList a10;
        return (!this.f1415b.hasValue(i10) || (resourceId = this.f1415b.getResourceId(i10, 0)) == 0 || (a10 = g.a.a(this.f1414a, resourceId)) == null) ? this.f1415b.getColorStateList(i10) : a10;
    }

    public final int c(int i10, int i11) {
        return this.f1415b.getDimensionPixelOffset(i10, i11);
    }

    public final int d(int i10, int i11) {
        return this.f1415b.getDimensionPixelSize(i10, i11);
    }

    public final Drawable e(int i10) {
        int resourceId;
        return (!this.f1415b.hasValue(i10) || (resourceId = this.f1415b.getResourceId(i10, 0)) == 0) ? this.f1415b.getDrawable(i10) : g.a.b(this.f1414a, resourceId);
    }

    public final Drawable f(int i10) {
        int resourceId;
        Drawable g10;
        if (this.f1415b.hasValue(i10) && (resourceId = this.f1415b.getResourceId(i10, 0)) != 0) {
            k a10 = k.a();
            Context context = this.f1414a;
            synchronized (a10) {
                g10 = a10.f1386a.g(context, resourceId, true);
            }
            return g10;
        }
        return null;
    }

    public final Typeface g(int i10, int i11, v0.a aVar) {
        int resourceId = this.f1415b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1416c == null) {
            this.f1416c = new TypedValue();
        }
        Context context = this.f1414a;
        TypedValue typedValue = this.f1416c;
        ThreadLocal<TypedValue> threadLocal = z0.f.f31856a;
        if (context.isRestricted()) {
            return null;
        }
        return z0.f.b(context, resourceId, typedValue, i11, aVar, true, false);
    }

    public final int h(int i10, int i11) {
        return this.f1415b.getInt(i10, i11);
    }

    public final int i(int i10, int i11) {
        return this.f1415b.getResourceId(i10, i11);
    }

    public final String j(int i10) {
        return this.f1415b.getString(i10);
    }

    public final CharSequence k(int i10) {
        return this.f1415b.getText(i10);
    }

    public final boolean l(int i10) {
        return this.f1415b.hasValue(i10);
    }

    public final void n() {
        this.f1415b.recycle();
    }
}
