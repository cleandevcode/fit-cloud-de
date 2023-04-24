package da;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.l2;

/* loaded from: classes.dex */
public final class d {
    public static ColorStateList a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList a10;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (a10 = g.a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : a10;
    }

    public static ColorStateList b(Context context, l2 l2Var, int i10) {
        int i11;
        ColorStateList a10;
        return (!l2Var.l(i10) || (i11 = l2Var.i(i10, 0)) == 0 || (a10 = g.a.a(context, i11)) == null) ? l2Var.b(i10) : a10;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable b10;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (b10 = g.a.b(context, resourceId)) == null) ? typedArray.getDrawable(i10) : b10;
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
