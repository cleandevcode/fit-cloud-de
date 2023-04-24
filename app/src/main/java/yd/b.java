package yd;

import android.annotation.TargetApi;
import android.content.Context;

@TargetApi(18)
/* loaded from: classes.dex */
public final class b extends td.c {

    /* renamed from: m */
    public static b f31446m;

    public b(Context context) {
        super(context);
    }

    public static synchronized void i(Context context) {
        synchronized (b.class) {
            if (f31446m == null) {
                synchronized (b.class) {
                    if (f31446m == null) {
                        f31446m = new b(context.getApplicationContext());
                    }
                }
            }
        }
    }
}
