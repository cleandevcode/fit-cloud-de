package m8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import i8.g1;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import o8.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b */
    public static final Object f20415b = new Object();

    /* renamed from: c */
    public static volatile a f20416c;

    /* renamed from: a */
    public final ConcurrentHashMap f20417a = new ConcurrentHashMap();

    public final void a(Context context, ServiceConnection serviceConnection) {
        if ((!(serviceConnection instanceof g1)) && this.f20417a.containsKey(serviceConnection)) {
            try {
                try {
                    context.unbindService((ServiceConnection) this.f20417a.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                }
                return;
            } finally {
                this.f20417a.remove(serviceConnection);
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean b(Context context, String str, Intent intent, ServiceConnection serviceConnection, Executor executor) {
        boolean bindService;
        ComponentName component = intent.getComponent();
        boolean z10 = false;
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((d.a(context).f22890a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        boolean z11 = true;
        if (!(serviceConnection instanceof g1)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f20417a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                if (Build.VERSION.SDK_INT < 29) {
                    z11 = false;
                }
                if (z11 && executor != null) {
                    bindService = context.bindService(intent, 4225, executor, serviceConnection);
                } else {
                    bindService = context.bindService(intent, serviceConnection, 4225);
                }
                if (!bindService) {
                    this.f20417a.remove(serviceConnection, serviceConnection);
                    return false;
                }
            } catch (Throwable th2) {
                this.f20417a.remove(serviceConnection, serviceConnection);
                throw th2;
            }
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                z10 = true;
            }
            if (z10 && executor != null) {
                bindService = context.bindService(intent, 4225, executor, serviceConnection);
            } else {
                bindService = context.bindService(intent, serviceConnection, 4225);
            }
        }
        return bindService;
    }
}
