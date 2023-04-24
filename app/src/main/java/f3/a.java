package f3;

import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class a {
    public static String a(Locale locale, String str, Object[] objArr, StringBuilder sb2, String str2) {
        sb2.append(String.format(locale, str, objArr));
        sb2.append(str2);
        return sb2.toString();
    }

    public static /* synthetic */ String b(int i10) {
        return i10 == 1 ? "EXPONENTIAL" : i10 == 2 ? "LINEAR" : "null";
    }
}
