package o1;

import android.os.Build;

/* loaded from: classes.dex */
public interface b {
    @Deprecated
    public static final boolean J;

    static {
        J = Build.VERSION.SDK_INT >= 27;
    }
}
