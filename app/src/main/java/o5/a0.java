package o5;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 {
    public static String a(Object[] objArr, int i10, Locale locale, String str, String str2) {
        String format = String.format(locale, str, Arrays.copyOf(objArr, i10));
        gm.l.e(format, str2);
        return format;
    }
}
