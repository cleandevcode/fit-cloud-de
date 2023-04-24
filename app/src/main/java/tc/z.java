package tc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fl.g;

/* loaded from: classes.dex */
public final class z extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ tk.j f28028a;

    /* renamed from: b */
    public final /* synthetic */ b0 f28029b;

    public z(b0 b0Var, g.a aVar) {
        this.f28029b = b0Var;
        this.f28028a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean a10 = this.f28029b.f27962a.f27965b.a();
        ((g.a) this.f28028a).d(Boolean.valueOf(a10));
    }
}
