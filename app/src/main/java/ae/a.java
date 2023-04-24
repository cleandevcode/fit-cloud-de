package ae;

import android.bluetooth.BluetoothClass;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class a {
    public static boolean a(BluetoothClass bluetoothClass, int i10) {
        int deviceClass;
        int deviceClass2;
        int deviceClass3;
        if (i10 == 1) {
            return bluetoothClass.hasService(262144) || (deviceClass3 = bluetoothClass.getDeviceClass()) == 1044 || deviceClass3 == 1048 || deviceClass3 == 1056 || deviceClass3 == 1064;
        } else if (i10 == 6) {
            return bluetoothClass.hasService(524288) || (deviceClass2 = bluetoothClass.getDeviceClass()) == 1060 || deviceClass2 == 1064 || deviceClass2 == 1068;
        } else if (i10 == 0) {
            return bluetoothClass.hasService(262144) || (deviceClass = bluetoothClass.getDeviceClass()) == 1028 || deviceClass == 1032 || deviceClass == 1056;
        } else if (i10 == 2) {
            if (bluetoothClass.hasService(1048576)) {
                return true;
            }
            switch (bluetoothClass.getDeviceClass()) {
                case DfuBaseService.ERROR_REMOTE_TYPE_LEGACY /* 256 */:
                case 260:
                case 264:
                case 268:
                case 272:
                case 276:
                case 280:
                case DfuBaseService.ERROR_REMOTE_TYPE_SECURE /* 512 */:
                case 516:
                case 520:
                case 524:
                case 528:
                case 532:
                    return true;
                default:
                    return false;
            }
        } else if (i10 == 3) {
            return (bluetoothClass.getDeviceClass() & 1280) == 1280;
        } else if (i10 == 4 || i10 == 5) {
            return bluetoothClass.hasService(131072) || (bluetoothClass.getDeviceClass() & 768) == 768;
        } else {
            return false;
        }
    }
}
