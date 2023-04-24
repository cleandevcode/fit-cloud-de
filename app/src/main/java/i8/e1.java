package i8;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class e1 implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ f1 f16636a;

    public /* synthetic */ e1(f1 f1Var) {
        this.f16636a = f1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            synchronized (this.f16636a.f16656d) {
                b1 b1Var = (b1) message.obj;
                d1 d1Var = (d1) this.f16636a.f16656d.get(b1Var);
                if (d1Var != null && d1Var.f16624b == 3) {
                    String valueOf = String.valueOf(b1Var);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName componentName = d1Var.f16628f;
                    if (componentName == null) {
                        b1Var.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = b1Var.f16603b;
                        p.f(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    d1Var.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
        synchronized (this.f16636a.f16656d) {
            try {
                b1 b1Var2 = (b1) message.obj;
                d1 d1Var2 = (d1) this.f16636a.f16656d.get(b1Var2);
                if (d1Var2 != null && d1Var2.f16623a.isEmpty()) {
                    if (d1Var2.f16625c) {
                        d1Var2.f16629g.f16658f.removeMessages(1, d1Var2.f16627e);
                        f1 f1Var = d1Var2.f16629g;
                        f1Var.f16659g.a(f1Var.f16657e, d1Var2);
                        d1Var2.f16625c = false;
                        d1Var2.f16624b = 2;
                    }
                    this.f16636a.f16656d.remove(b1Var2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
