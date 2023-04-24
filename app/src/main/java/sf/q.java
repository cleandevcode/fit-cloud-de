package sf;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.topstep.fitcloud.pro.function.MySmsBroadcastReceiver;

/* loaded from: classes2.dex */
public abstract class q extends bk.e {

    /* renamed from: b */
    public volatile boolean f26967b = false;

    /* renamed from: c */
    public final Object f26968c = new Object();

    @Override // bk.e, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!this.f26967b) {
            synchronized (this.f26968c) {
                if (!this.f26967b) {
                    Application j10 = h7.a.j(context.getApplicationContext());
                    boolean z10 = j10 instanceof lk.b;
                    Object[] objArr = {j10.getClass()};
                    if (z10) {
                        ((u) ((lk.b) j10).h()).b((MySmsBroadcastReceiver) this);
                        this.f26967b = true;
                    } else {
                        throw new IllegalArgumentException(String.format("Hilt BroadcastReceiver must be attached to an @AndroidEntryPoint Application. Found: %s", objArr));
                    }
                }
            }
        }
        super.onReceive(context, intent);
    }
}
