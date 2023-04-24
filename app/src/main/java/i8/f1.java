package i8;

import android.content.Context;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import no.nordicsemi.android.dfu.DfuServiceInitiator;

/* loaded from: classes.dex */
public final class f1 extends h {

    /* renamed from: d */
    public final HashMap f16656d = new HashMap();

    /* renamed from: e */
    public final Context f16657e;

    /* renamed from: f */
    public volatile w8.e f16658f;

    /* renamed from: g */
    public final m8.a f16659g;

    /* renamed from: h */
    public final long f16660h;

    /* renamed from: i */
    public final long f16661i;

    /* renamed from: j */
    public volatile Executor f16662j;

    public f1(Context context, Looper looper) {
        e1 e1Var = new e1(this);
        this.f16657e = context.getApplicationContext();
        this.f16658f = new w8.e(looper, e1Var);
        if (m8.a.f20416c == null) {
            synchronized (m8.a.f20415b) {
                if (m8.a.f20416c == null) {
                    m8.a.f20416c = new m8.a();
                }
            }
        }
        m8.a aVar = m8.a.f20416c;
        p.f(aVar);
        this.f16659g = aVar;
        this.f16660h = DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT;
        this.f16661i = 300000L;
        this.f16662j = null;
    }

    @Override // i8.h
    public final boolean b(b1 b1Var, u0 u0Var, String str, Executor executor) {
        boolean z10;
        synchronized (this.f16656d) {
            try {
                d1 d1Var = (d1) this.f16656d.get(b1Var);
                if (executor == null) {
                    executor = this.f16662j;
                }
                if (d1Var == null) {
                    d1Var = new d1(this, b1Var);
                    d1Var.f16623a.put(u0Var, u0Var);
                    d1Var.a(str, executor);
                    this.f16656d.put(b1Var, d1Var);
                } else {
                    this.f16658f.removeMessages(0, b1Var);
                    if (!d1Var.f16623a.containsKey(u0Var)) {
                        d1Var.f16623a.put(u0Var, u0Var);
                        int i10 = d1Var.f16624b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                d1Var.a(str, executor);
                            }
                        } else {
                            u0Var.onServiceConnected(d1Var.f16628f, d1Var.f16626d);
                        }
                    } else {
                        String b1Var2 = b1Var.toString();
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + b1Var2);
                    }
                }
                z10 = d1Var.f16625c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}
