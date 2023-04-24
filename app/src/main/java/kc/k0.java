package kc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.polidea.rxandroidble3.internal.RxBleLog;
import fl.g;
import kc.m0;

/* loaded from: classes.dex */
public final class k0 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ tk.j f18346a;

    public k0(g.a aVar) {
        this.f18346a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m0.b bVar;
        switch (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1)) {
            case 11:
                bVar = m0.b.f18355e;
                break;
            case 12:
                bVar = m0.b.f18353c;
                break;
            case 13:
                bVar = m0.b.f18356f;
                break;
            default:
                bVar = m0.b.f18354d;
                break;
        }
        RxBleLog.i("Adapter state changed: %s", bVar);
        ((g.a) this.f18346a).d(bVar);
    }
}
