package g7;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class a {
    public static int a(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static float b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        return i10 / ((i10 / displayMetrics.xdpi) * 25.4f);
    }

    public static float c(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.heightPixels;
        return i10 / ((i10 / displayMetrics.ydpi) * 25.4f);
    }
}
