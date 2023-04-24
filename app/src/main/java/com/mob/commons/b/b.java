package com.mob.commons.b;

import android.content.Context;
import android.text.TextUtils;
import com.mob.commons.i;
import java.util.HashMap;

/* loaded from: classes.dex */
public class b {
    public static synchronized HashMap<String, Object> a(Context context) {
        synchronized (b.class) {
            HashMap<String, Object> hashMap = new HashMap<>();
            a a10 = a.a(context);
            HashMap<String, Object> a11 = a10.a();
            boolean z10 = a11 != null && a11.size() > 0;
            if (z10) {
                HashMap hashMap2 = new HashMap();
                if (a11.containsKey(i.a("004Ffe.j-fg*j"))) {
                    a11.put(i.a("005-fhfeSj^fg@j"), a11.remove(i.a("004Rfe]j9fgWj")));
                }
                if (a11.containsKey(i.a("009$hifeSggTgefjIfkj"))) {
                    a11.put(i.a("011@fg>jVgjfe)gg6gefjZfkj"), a11.remove(i.a("009Phife0gg]gefj)fkj")));
                }
                hashMap2.putAll(a11);
                hashMap.put(i.a("009Mhjfg:j,hiiifhfi9ek"), hashMap2);
            }
            String c10 = c(context);
            String e10 = e(context);
            String g10 = g(context);
            String f10 = f(context);
            if (!z10 && TextUtils.isEmpty(c10) && TextUtils.isEmpty(f10)) {
                return null;
            }
            boolean b10 = b(context);
            hashMap.put(i.a("004?fhfhfgFj"), e10);
            hashMap.put(i.a("0048gefhfg'j"), c10);
            hashMap.put(i.a("004lJfhfg2j"), g10);
            hashMap.put(i.a("005>fhfeHjFfg'j"), f10);
            hashMap.put(i.a("0115fgPjGgjfe^gg.gefj1fkj"), Boolean.valueOf(b10));
            a10.a(c10, e10, g10, f10, b10);
            return hashMap;
        }
    }

    public static boolean b(Context context) {
        return false;
    }

    public static String c(Context context) {
        return null;
    }

    public static String d(Context context) {
        return null;
    }

    public static String e(Context context) {
        return null;
    }

    public static String f(Context context) {
        return null;
    }

    public static String g(Context context) {
        return null;
    }
}
