package ak;

import android.text.TextUtils;
import cn.sharesdk.framework.InnerShareParams;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class b {
    public static byte a(Locale locale) {
        if (locale == null) {
            return (byte) 0;
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (language.equals(Locale.CHINESE.getLanguage())) {
            if (TextUtils.isEmpty(country) || country.equals(Locale.SIMPLIFIED_CHINESE.getCountry())) {
                return (byte) 1;
            }
            return (byte) 2;
        }
        HashMap hashMap = new HashMap(80);
        hashMap.put("en", (byte) 3);
        hashMap.put("de", (byte) 4);
        hashMap.put("ru", (byte) 5);
        hashMap.put("es", (byte) 6);
        hashMap.put("pt", (byte) 7);
        hashMap.put("fr", (byte) 8);
        hashMap.put("ja", (byte) 9);
        hashMap.put("ar", (byte) 10);
        hashMap.put("nl", (byte) 11);
        hashMap.put("it", (byte) 12);
        hashMap.put("bn", (byte) 13);
        hashMap.put("hr", (byte) 14);
        hashMap.put("cs", (byte) 15);
        hashMap.put("da", (byte) 16);
        hashMap.put("el", (byte) 17);
        hashMap.put("he", (byte) 18);
        hashMap.put("hi", (byte) 19);
        hashMap.put("hu", (byte) 20);
        hashMap.put("in", (byte) 21);
        hashMap.put("ko", (byte) 22);
        hashMap.put("ms", (byte) 23);
        hashMap.put("fa", (byte) 24);
        hashMap.put("pl", (byte) 25);
        hashMap.put("ro", (byte) 26);
        hashMap.put(InnerShareParams.SUBREDDIT, (byte) 27);
        hashMap.put("sv", (byte) 28);
        hashMap.put("th", (byte) 29);
        hashMap.put("tr", (byte) 30);
        hashMap.put("ur", (byte) 31);
        hashMap.put("vi", (byte) 32);
        hashMap.put("ca", (byte) 33);
        hashMap.put("lv", (byte) 34);
        hashMap.put("lt", (byte) 35);
        hashMap.put("nb", (byte) 36);
        hashMap.put("sk", (byte) 37);
        hashMap.put("sl", (byte) 38);
        hashMap.put("bg", (byte) 39);
        hashMap.put("uk", (byte) 40);
        hashMap.put("tl", (byte) 41);
        hashMap.put("fi", (byte) 42);
        hashMap.put("af", (byte) 43);
        hashMap.put("rm", (byte) 44);
        hashMap.put("my", (byte) 45);
        hashMap.put("km", (byte) 46);
        hashMap.put("am", (byte) 47);
        hashMap.put("be", (byte) 48);
        hashMap.put("et", (byte) 49);
        hashMap.put("sw", (byte) 50);
        hashMap.put("zu", (byte) 51);
        hashMap.put("az", (byte) 52);
        hashMap.put("hy", (byte) 53);
        hashMap.put("ka", (byte) 54);
        hashMap.put("lo", (byte) 55);
        hashMap.put("mn", (byte) 56);
        hashMap.put("ne", (byte) 57);
        hashMap.put("kk", (byte) 58);
        hashMap.put("gl", (byte) 59);
        hashMap.put("is", (byte) 60);
        hashMap.put("kn", (byte) 61);
        hashMap.put("ky", (byte) 62);
        hashMap.put("ml", (byte) 63);
        hashMap.put("mr", (byte) 64);
        hashMap.put("ta", (byte) 65);
        hashMap.put("mk", (byte) 66);
        hashMap.put("te", (byte) 67);
        hashMap.put("uz", (byte) 68);
        hashMap.put("eu", (byte) 69);
        hashMap.put("si", (byte) 70);
        hashMap.put("sq", (byte) 71);
        Byte b10 = (Byte) hashMap.get(language);
        if (b10 != null) {
            p000do.a.f13275a.h("getLanguageType in map direct, value=%d", b10);
            return b10.byteValue();
        }
        for (String str : hashMap.keySet()) {
            if (language.equals(new Locale(str).getLanguage())) {
                p000do.a.f13275a.p("getLanguageType in map local, value=%d", hashMap.get(str));
                return ((Byte) hashMap.get(str)).byteValue();
            }
        }
        return (byte) 0;
    }
}
