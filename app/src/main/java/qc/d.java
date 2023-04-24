package qc;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d implements wk.f<tc.e<UUID>> {

    /* renamed from: a */
    public final /* synthetic */ BluetoothGattCharacteristic f24701a;

    public d(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f24701a = bluetoothGattCharacteristic;
    }

    @Override // wk.f
    public final boolean test(tc.e<UUID> eVar) {
        return eVar.f27966a.equals(this.f24701a.getUuid());
    }
}
