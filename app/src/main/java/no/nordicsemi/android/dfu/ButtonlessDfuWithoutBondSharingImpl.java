package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import java.util.UUID;

/* loaded from: classes2.dex */
public class ButtonlessDfuWithoutBondSharingImpl extends ButtonlessDfuImpl {
    public static UUID BUTTONLESS_DFU_SERVICE_UUID;
    public static UUID BUTTONLESS_DFU_UUID;
    public static final UUID DEFAULT_BUTTONLESS_DFU_SERVICE_UUID;
    public static final UUID DEFAULT_BUTTONLESS_DFU_UUID;
    private BluetoothGattCharacteristic mButtonlessDfuCharacteristic;

    static {
        UUID uuid = SecureDfuImpl.DEFAULT_DFU_SERVICE_UUID;
        DEFAULT_BUTTONLESS_DFU_SERVICE_UUID = uuid;
        UUID uuid2 = new UUID(-8157989233041780896L, -6937650605005804976L);
        DEFAULT_BUTTONLESS_DFU_UUID = uuid2;
        BUTTONLESS_DFU_SERVICE_UUID = uuid;
        BUTTONLESS_DFU_UUID = uuid2;
    }

    public ButtonlessDfuWithoutBondSharingImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    @Override // no.nordicsemi.android.dfu.ButtonlessDfuImpl
    public BluetoothGattCharacteristic getButtonlessDfuCharacteristic() {
        return this.mButtonlessDfuCharacteristic;
    }

    @Override // no.nordicsemi.android.dfu.ButtonlessDfuImpl
    public int getResponseType() {
        return 2;
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattService service = bluetoothGatt.getService(BUTTONLESS_DFU_SERVICE_UUID);
        if (service == null || (characteristic = service.getCharacteristic(BUTTONLESS_DFU_UUID)) == null || characteristic.getDescriptor(BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG) == null) {
            return false;
        }
        this.mButtonlessDfuCharacteristic = characteristic;
        return true;
    }

    @Override // no.nordicsemi.android.dfu.ButtonlessDfuImpl, no.nordicsemi.android.dfu.DfuService
    public void performDfu(Intent intent) {
        logi("Buttonless service without bond sharing found -> SDK 13 or newer");
        if (isBonded()) {
            logw("Device is paired! Use Buttonless DFU with Bond Sharing instead (SDK 14 or newer)");
        }
        super.performDfu(intent);
    }

    @Override // no.nordicsemi.android.dfu.ButtonlessDfuImpl
    public boolean shouldScanForBootloader() {
        return true;
    }
}
