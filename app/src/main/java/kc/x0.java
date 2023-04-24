package kc;

import android.bluetooth.BluetoothGattService;
import java.util.UUID;

/* loaded from: classes.dex */
public final class x0 implements wk.f<BluetoothGattService> {

    /* renamed from: a */
    public final /* synthetic */ UUID f18429a;

    public x0(UUID uuid) {
        this.f18429a = uuid;
    }

    @Override // wk.f
    public final boolean test(BluetoothGattService bluetoothGattService) {
        return bluetoothGattService.getUuid().equals(this.f18429a);
    }
}
