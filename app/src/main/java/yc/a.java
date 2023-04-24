package yc;

import android.content.Context;
import com.realsil.sdk.bbpro.internal.BaseBeeProManager;

/* loaded from: classes.dex */
public final class a extends BaseBeeProManager {
    public static volatile a A;

    public a(Context context) {
        super(context);
    }

    public static synchronized a q(Context context) {
        a aVar;
        synchronized (a.class) {
            if (A == null) {
                synchronized (a.class) {
                    if (A == null) {
                        A = new a(context.getApplicationContext());
                    }
                }
            }
            aVar = A;
        }
        return aVar;
    }
}
