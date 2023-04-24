package b0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public static class a {
        public static Context a(Context context, String str) {
            Context createAttributionContext;
            createAttributionContext = context.createAttributionContext(str);
            return createAttributionContext;
        }

        public static String b(Context context) {
            String attributionTag;
            attributionTag = context.getAttributionTag();
            return attributionTag;
        }
    }

    public static Context a(Context context) {
        String b10;
        Context applicationContext = context.getApplicationContext();
        return (Build.VERSION.SDK_INT < 30 || (b10 = a.b(context)) == null) ? applicationContext : a.a(applicationContext, b10);
    }

    public static Application b(Context context) {
        String b10;
        Context a10 = a(context);
        while (a10 instanceof ContextWrapper) {
            if (a10 instanceof Application) {
                return (Application) a10;
            }
            ContextWrapper contextWrapper = (ContextWrapper) a10;
            Context baseContext = contextWrapper.getBaseContext();
            a10 = (Build.VERSION.SDK_INT < 30 || (b10 = a.b(contextWrapper)) == null) ? baseContext : a.a(baseContext, b10);
        }
        return null;
    }
}
