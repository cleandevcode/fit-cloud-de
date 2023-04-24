package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.k;
import androidx.lifecycle.r;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements u2.a<u> {
    @Override // u2.a
    public final List<Class<? extends u2.a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // u2.a
    public final u b(Context context) {
        if (androidx.startup.a.c(context).f3354b.contains(ProcessLifecycleInitializer.class)) {
            if (!r.f2773a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new r.a());
            }
            f0 f0Var = f0.f2713i;
            f0Var.getClass();
            f0Var.f2718e = new Handler();
            f0Var.f2719f.f(k.b.ON_CREATE);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new g0(f0Var));
            return f0Var;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
