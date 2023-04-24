package he;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {
    public static String a(String str) {
        if (TextUtils.isEmpty(str) || str.endsWith(".")) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".");
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1).toLowerCase(Locale.US) : "";
    }
}
