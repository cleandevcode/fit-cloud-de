package lb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public final class a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    public static a f19423b;

    /* renamed from: a */
    public final Context f19424a;

    /* JADX WARN: Removed duplicated region for block: B:101:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0188 A[LOOP:3: B:144:0x0182->B:146:0x0188, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x014f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.a.<init>(android.content.Context):void");
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            Log.i("AGConnectInstance", "AGConnectInstance#initialize");
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f19423b == null) {
                f19423b = new a(context);
            }
        }
    }
}
