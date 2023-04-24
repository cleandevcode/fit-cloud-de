package m3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import f3.m;

/* loaded from: classes.dex */
public final class h extends c<Boolean> {

    /* renamed from: i */
    public static final String f20348i = m.e("StorageNotLowTracker");

    public h(Context context, r3.a aVar) {
        super(context, aVar);
    }

    @Override // m3.d
    public final Object a() {
        Intent registerReceiver = this.f20336b.registerReceiver(null, e());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.getClass();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return Boolean.FALSE;
            }
            if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    @Override // m3.c
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // m3.c
    public final void f(Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        m.c().a(f20348i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            bool = Boolean.FALSE;
        } else if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return;
        } else {
            bool = Boolean.TRUE;
        }
        b(bool);
    }
}
