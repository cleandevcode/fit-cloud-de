package f1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: b */
    public static final Locale[] f14035b = new Locale[0];

    /* renamed from: a */
    public final Locale[] f14036a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        int i10 = j.f14033b;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length != 1) {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        } else {
            new Locale(split[0]);
        }
    }

    public k(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f14036a = f14035b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    locale2.getLanguage();
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        locale2.getCountry();
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(androidx.activity.i.a("list[", i10, "] is null"));
            }
        }
        this.f14036a = (Locale[]) arrayList.toArray(new Locale[0]);
    }

    @Override // f1.l
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        Locale[] localeArr = ((k) obj).f14036a;
        if (this.f14036a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f14036a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // f1.l
    public final Locale get() {
        Locale[] localeArr = this.f14036a;
        if (localeArr.length > 0) {
            return localeArr[0];
        }
        return null;
    }

    public final int hashCode() {
        int i10 = 1;
        for (Locale locale : this.f14036a) {
            i10 = (i10 * 31) + locale.hashCode();
        }
        return i10;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f14036a;
            if (i10 < localeArr.length) {
                a10.append(localeArr[i10]);
                if (i10 < this.f14036a.length - 1) {
                    a10.append(',');
                }
                i10++;
            } else {
                a10.append("]");
                return a10.toString();
            }
        }
    }
}
