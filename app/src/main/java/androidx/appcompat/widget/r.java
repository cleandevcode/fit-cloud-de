package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R;

/* loaded from: classes.dex */
public final class r extends PopupWindow {
    public r(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PopupWindow, i10, i11);
        int i12 = R.styleable.PopupWindow_overlapAnchor;
        if (obtainStyledAttributes.hasValue(i12)) {
            o1.j.a(this, obtainStyledAttributes.getBoolean(i12, false));
        }
        int i13 = R.styleable.PopupWindow_android_popupBackground;
        if (obtainStyledAttributes.hasValue(i13) && (resourceId = obtainStyledAttributes.getResourceId(i13, 0)) != 0) {
            drawable = g.a.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(i13);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i10, int i11) {
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i10, int i11, int i12) {
        super.showAsDropDown(view, i10, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i10, int i11, int i12, int i13) {
        super.update(view, i10, i11, i12, i13);
    }
}
