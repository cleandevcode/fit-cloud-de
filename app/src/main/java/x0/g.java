package x0;

import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f30107a;

    /* renamed from: b */
    public final /* synthetic */ Object f30108b;

    public g(Object obj, Object obj2) {
        this.f30107a = obj;
        this.f30108b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = h.f30113d;
            if (method != null) {
                method.invoke(this.f30107a, this.f30108b, Boolean.FALSE, "AppCompat recreation");
            } else {
                h.f30114e.invoke(this.f30107a, this.f30108b, Boolean.FALSE);
            }
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
        }
    }
}
