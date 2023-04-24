package i8;

import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a */
    public static final Object f16667a = new Object();

    /* renamed from: b */
    public static f1 f16668b;

    /* renamed from: c */
    public static HandlerThread f16669c;

    public final void a(String str, String str2, u0 u0Var, boolean z10) {
        b1 b1Var = new b1(str, str2, z10);
        f1 f1Var = (f1) this;
        synchronized (f1Var.f16656d) {
            d1 d1Var = (d1) f1Var.f16656d.get(b1Var);
            if (d1Var != null) {
                if (d1Var.f16623a.containsKey(u0Var)) {
                    d1Var.f16623a.remove(u0Var);
                    if (d1Var.f16623a.isEmpty()) {
                        f1Var.f16658f.sendMessageDelayed(f1Var.f16658f.obtainMessage(0, b1Var), f1Var.f16660h);
                    }
                } else {
                    String b1Var2 = b1Var.toString();
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + b1Var2);
                }
            } else {
                String b1Var3 = b1Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + b1Var3);
            }
        }
    }

    public abstract boolean b(b1 b1Var, u0 u0Var, String str, Executor executor);
}
