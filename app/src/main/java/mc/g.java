package mc;

import android.bluetooth.BluetoothManager;
import java.util.concurrent.TimeUnit;
import qc.m0;

/* loaded from: classes.dex */
public final class g implements v3.c {

    /* renamed from: a */
    public final /* synthetic */ int f20427a;

    /* renamed from: b */
    public final w3.a f20428b;

    public /* synthetic */ g(v3.c cVar, int i10) {
        this.f20427a = i10;
        this.f20428b = cVar;
    }

    @Override // w3.a
    public final Object get() {
        switch (this.f20427a) {
            case 0:
                return new m0(10L, TimeUnit.SECONDS, (tk.o) this.f20428b.get());
            default:
                BluetoothManager bluetoothManager = (BluetoothManager) this.f20428b.get();
                return new tc.d();
        }
    }
}
