package c7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ f f4551a;

    public e(f fVar) {
        this.f4551a = fVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        gm.l.f(context, "context");
        gm.l.f(intent, "intent");
        this.f4551a.a();
    }
}
