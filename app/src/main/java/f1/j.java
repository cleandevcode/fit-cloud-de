package f1;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b */
    public static final /* synthetic */ int f14033b = 0;

    /* renamed from: a */
    public final l f14034a;

    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    static {
        Locale[] localeArr = new Locale[0];
        if (Build.VERSION.SDK_INT >= 24) {
            a.a(localeArr);
        } else {
            new k(localeArr);
        }
    }

    public j(l lVar) {
        this.f14034a = lVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j) && this.f14034a.equals(((j) obj).f14034a);
    }

    public final int hashCode() {
        return this.f14034a.hashCode();
    }

    public final String toString() {
        return this.f14034a.toString();
    }
}
