package x2;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public static boolean f30184a = true;

    public static void a(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else if (f30184a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f30184a = false;
            }
        }
    }
}
