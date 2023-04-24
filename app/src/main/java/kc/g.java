package kc;

import android.bluetooth.BluetoothManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class g implements v3.c<BluetoothManager> {

    /* renamed from: a */
    public final w3.a<Context> f18321a;

    public g(w3.a<Context> aVar) {
        this.f18321a = aVar;
    }

    @Override // w3.a
    public final Object get() {
        BluetoothManager bluetoothManager = (BluetoothManager) this.f18321a.get().getSystemService("bluetooth");
        b0.c.j(bluetoothManager);
        return bluetoothManager;
    }
}
