package tc;

import android.bluetooth.BluetoothGattDescriptor;

/* loaded from: classes.dex */
public final class h implements wk.f<e<BluetoothGattDescriptor>> {

    /* renamed from: a */
    public final /* synthetic */ BluetoothGattDescriptor f27975a;

    public h(BluetoothGattDescriptor bluetoothGattDescriptor) {
        this.f27975a = bluetoothGattDescriptor;
    }

    @Override // wk.f
    public final boolean test(e<BluetoothGattDescriptor> eVar) {
        return eVar.f27966a.equals(this.f27975a);
    }
}
