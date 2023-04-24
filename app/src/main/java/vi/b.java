package vi;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.List;
import java.util.Set;
import kc.w0;
import tk.i;

/* loaded from: classes2.dex */
public interface b {
    boolean a(w0 w0Var);

    boolean b(w0 w0Var);

    void c(w0 w0Var);

    i<Boolean> d();

    boolean e();

    boolean f();

    Set<BluetoothDevice> g();

    List<BluetoothDevice> getConnectedDevices();

    boolean h(w0 w0Var);

    boolean i();

    BluetoothAdapter j();
}
