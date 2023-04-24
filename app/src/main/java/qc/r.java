package qc;

import android.bluetooth.BluetoothGatt;
import java.util.concurrent.Callable;
import kc.v0;

/* loaded from: classes.dex */
public final class r implements Callable<BluetoothGatt> {

    /* renamed from: a */
    public final /* synthetic */ s f24752a;

    public r(s sVar) {
        this.f24752a = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final BluetoothGatt call() {
        this.f24752a.f24759g.a(v0.b.CONNECTED);
        return this.f24752a.f24756d.f22918a.get();
    }
}
