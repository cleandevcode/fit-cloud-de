package p5;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import d6.m0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import o5.v;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: c */
    public static SharedPreferences f23949c;

    /* renamed from: a */
    public static final u f23947a = new u();

    /* renamed from: b */
    public static final String f23948b = u.class.getSimpleName();

    /* renamed from: d */
    public static final AtomicBoolean f23950d = new AtomicBoolean(false);

    /* renamed from: e */
    public static final ConcurrentHashMap<String, String> f23951e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public static final ConcurrentHashMap<String, String> f23952f = new ConcurrentHashMap<>();

    public final HashMap a() {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = q5.d.f24593d;
            HashSet hashSet = new HashSet();
            Iterator it = q5.d.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((q5.d) it.next()).b());
            }
            for (String str : f23952f.keySet()) {
                if (hashSet.contains(str)) {
                    hashMap.put(str, f23952f.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final synchronized void b() {
        if (i6.a.b(this)) {
            return;
        }
        AtomicBoolean atomicBoolean = f23950d;
        if (atomicBoolean.get()) {
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(v.a());
        gm.l.e(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
        f23949c = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
        if (string == null) {
            string = "";
        }
        SharedPreferences sharedPreferences = f23949c;
        if (sharedPreferences == null) {
            gm.l.l("sharedPreferences");
            throw null;
        }
        String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
        if (string2 == null) {
            string2 = "";
        }
        f23951e.putAll(m0.D(string));
        f23952f.putAll(m0.D(string2));
        atomicBoolean.set(true);
    }

    public final String c(String str, String str2) {
        boolean z10;
        String str3;
        int i10;
        boolean z11;
        if (i6.a.b(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length) {
                if (!z12) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (gm.l.h(str2.charAt(i10), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i11++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = str2.subSequence(i11, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                gm.l.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (gm.l.a("em", str)) {
                    if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        Log.e(f23948b, "Setting email failure: this is not a valid email address");
                        return "";
                    }
                    return lowerCase;
                } else if (gm.l.a("ph", str)) {
                    Pattern compile = Pattern.compile("[^0-9]");
                    gm.l.e(compile, "compile(pattern)");
                    String replaceAll = compile.matcher(lowerCase).replaceAll("");
                    gm.l.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                    return replaceAll;
                } else if (gm.l.a("ge", str)) {
                    if (lowerCase.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        str3 = "";
                    } else {
                        str3 = lowerCase.substring(0, 1);
                        gm.l.e(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    if (!gm.l.a("f", str3) && !gm.l.a("m", str3)) {
                        Log.e(f23948b, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return str3;
                } else {
                    return lowerCase;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }
}
