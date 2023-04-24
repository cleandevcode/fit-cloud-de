package sd;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import ge.b;

/* loaded from: classes.dex */
public final class a {
    public static BluetoothAdapter a(Context context) {
        if (context == null) {
            return BluetoothAdapter.getDefaultAdapter();
        }
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            b.p("Unable to initialize BluetoothManager.");
            return BluetoothAdapter.getDefaultAdapter();
        }
        return bluetoothManager.getAdapter();
    }
}
