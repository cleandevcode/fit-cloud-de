package qc;

import android.bluetooth.BluetoothGatt;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class o implements Callable<BluetoothGatt> {

    /* renamed from: a */
    public final /* synthetic */ s f24750a;

    public o(s sVar) {
        this.f24750a = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final BluetoothGatt call() {
        throw new lc.h(this.f24750a.f24756d.f22918a.get(), lc.m.f19426b);
    }
}
