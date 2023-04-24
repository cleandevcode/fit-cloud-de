package i8;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d1 implements ServiceConnection, g1 {

    /* renamed from: a */
    public final HashMap f16623a = new HashMap();

    /* renamed from: b */
    public int f16624b = 2;

    /* renamed from: c */
    public boolean f16625c;

    /* renamed from: d */
    public IBinder f16626d;

    /* renamed from: e */
    public final b1 f16627e;

    /* renamed from: f */
    public ComponentName f16628f;

    /* renamed from: g */
    public final /* synthetic */ f1 f16629g;

    public d1(f1 f1Var, b1 b1Var) {
        this.f16629g = f1Var;
        this.f16627e = b1Var;
    }

    public final void a(String str, Executor executor) {
        boolean z10;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f16624b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            f1 f1Var = this.f16629g;
            m8.a aVar = f1Var.f16659g;
            Context context = f1Var.f16657e;
            boolean b10 = aVar.b(context, str, this.f16627e.a(context), this, executor);
            this.f16625c = b10;
            if (b10) {
                this.f16629g.f16658f.sendMessageDelayed(this.f16629g.f16658f.obtainMessage(1, this.f16627e), this.f16629g.f16661i);
            } else {
                this.f16624b = 2;
                try {
                    f1 f1Var2 = this.f16629g;
                    f1Var2.f16659g.a(f1Var2.f16657e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f16629g.f16656d) {
            this.f16629g.f16658f.removeMessages(1, this.f16627e);
            this.f16626d = iBinder;
            this.f16628f = componentName;
            for (ServiceConnection serviceConnection : this.f16623a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f16624b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f16629g.f16656d) {
            this.f16629g.f16658f.removeMessages(1, this.f16627e);
            this.f16626d = null;
            this.f16628f = componentName;
            for (ServiceConnection serviceConnection : this.f16623a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f16624b = 2;
        }
    }
}
