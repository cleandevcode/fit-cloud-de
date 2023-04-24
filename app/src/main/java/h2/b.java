package h2;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public class b extends Application {
    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        String str;
        super.attachBaseContext(context);
        HashSet hashSet = a.f15743a;
        Log.i("MultiDex", "Installing application");
        try {
            if (a.f15744b) {
                str = "VM has multidex support, MultiDex support library is disabled.";
            } else {
                try {
                    applicationInfo = getApplicationInfo();
                } catch (RuntimeException e10) {
                    Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e10);
                    applicationInfo = null;
                }
                if (applicationInfo == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                } else {
                    a.b(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                    str = "install done";
                }
            }
            Log.i("MultiDex", str);
        } catch (Exception e11) {
            Log.e("MultiDex", "MultiDex installation failure", e11);
            StringBuilder a10 = android.support.v4.media.d.a("MultiDex installation failed (");
            a10.append(e11.getMessage());
            a10.append(").");
            throw new RuntimeException(a10.toString());
        }
    }
}
