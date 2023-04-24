package sf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class h extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ i f26929a;

    /* renamed from: b */
    public final /* synthetic */ pm.i<Boolean> f26930b;

    public h(i iVar, pm.j jVar) {
        this.f26929a = iVar;
        this.f26930b = jVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (gm.l.a(str, "com.topstep.fitcloudpro.action.CameraLaunch")) {
            this.f26929a.f26931a.unregisterReceiver(this);
            this.f26930b.l(Boolean.TRUE);
        }
    }
}
