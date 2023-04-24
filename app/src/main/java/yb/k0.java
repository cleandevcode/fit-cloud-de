package yb;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: c */
    public static k0 f31336c = new k0();

    /* renamed from: a */
    public boolean f31337a = false;

    /* renamed from: b */
    public Context f31338b = y.s();

    @TargetApi(24)
    public final boolean a() {
        boolean z10;
        if (!this.f31337a) {
            Context context = this.f31338b;
            if (context == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                UserManager userManager = (UserManager) context.getSystemService("user");
                if (userManager != null) {
                    z10 = userManager.isUserUnlocked();
                } else {
                    this.f31337a = false;
                }
            } else {
                z10 = true;
            }
            this.f31337a = z10;
        }
        return this.f31337a;
    }
}
