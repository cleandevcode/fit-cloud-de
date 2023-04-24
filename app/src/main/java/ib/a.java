package ib;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a */
    public static final HashMap f16760a = new HashMap();

    /* renamed from: b */
    public static final Object f16761b = new Object();

    public static a a(Context context) {
        a aVar;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        String packageName = context.getPackageName();
        synchronized (f16761b) {
            HashMap hashMap = f16760a;
            aVar = (a) hashMap.get(packageName);
            if (aVar == null) {
                aVar = new jb.a(context, packageName);
                hashMap.put(packageName, aVar);
            }
        }
        return aVar;
    }

    public abstract String b(String str);
}
