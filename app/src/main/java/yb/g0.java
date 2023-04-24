package yb;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class g0 {
    @SuppressLint({"DefaultLocale"})
    public static boolean a(Context context, int i10, String str) {
        long length = new File(context.getFilesDir(), a.b.b("../shared_prefs/", l.f(context, str) + ".xml")).length();
        if (length <= i10) {
            return false;
        }
        m2.f.b(String.format("reach local file limited size - file len: %d limitedSize: %d", Long.valueOf(length), Integer.valueOf(i10)));
        return true;
    }
}
