package vd;

import android.annotation.TargetApi;
import android.content.Context;

@TargetApi(18)
/* loaded from: classes.dex */
public final class c extends td.c {

    /* renamed from: m */
    public static c f29212m;

    public c(Context context) {
        super(context);
    }

    public static synchronized void i(Context context) {
        synchronized (c.class) {
            if (f29212m == null) {
                synchronized (c.class) {
                    if (f29212m == null) {
                        f29212m = new c(context.getApplicationContext());
                    }
                }
            }
        }
    }
}
