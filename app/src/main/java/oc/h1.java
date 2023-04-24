package oc;

import android.bluetooth.BluetoothGattService;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class h1 implements Callable<List<BluetoothGattService>> {

    /* renamed from: a */
    public final /* synthetic */ e1 f22987a;

    public h1(e1 e1Var) {
        this.f22987a = e1Var;
    }

    @Override // java.util.concurrent.Callable
    public final List<BluetoothGattService> call() {
        return this.f22987a.f22970b.getServices();
    }
}
