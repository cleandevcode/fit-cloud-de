package rc;

import android.bluetooth.BluetoothAdapter;
import tc.l0;

/* loaded from: classes.dex */
public final class t implements s {

    /* renamed from: a */
    public final l0 f25503a;

    /* renamed from: b */
    public final tc.d0 f25504b;

    public t(l0 l0Var, tc.d0 d0Var) {
        this.f25503a = l0Var;
        this.f25504b = d0Var;
    }

    @Override // rc.s
    public final void a(boolean z10) {
        boolean z11;
        BluetoothAdapter bluetoothAdapter = this.f25503a.f28001a;
        boolean z12 = false;
        if (bluetoothAdapter != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
                z12 = true;
            }
            if (z12) {
                if (this.f25504b.b()) {
                    if (z10 && !this.f25504b.a()) {
                        throw new lc.n(4);
                    }
                    return;
                }
                throw new lc.n(3);
            }
            throw new lc.n(1);
        }
        throw new lc.n(2);
    }
}
