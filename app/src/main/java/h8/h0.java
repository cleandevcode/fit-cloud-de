package h8;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class h0 extends BroadcastReceiver {

    /* renamed from: a */
    public Context f15961a;

    /* renamed from: b */
    public final a5.b f15962b;

    public h0(a5.b bVar) {
        this.f15962b = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            a5.b bVar = this.f15962b;
            h1 h1Var = ((g1) bVar.f264b).f15955b;
            h1Var.f15964c.set(null);
            v8.j jVar = ((t) h1Var).f16022g.f15938n;
            jVar.sendMessage(jVar.obtainMessage(3));
            if (((Dialog) bVar.f263a).isShowing()) {
                ((Dialog) bVar.f263a).dismiss();
            }
            synchronized (this) {
                Context context2 = this.f15961a;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f15961a = null;
            }
        }
    }
}
