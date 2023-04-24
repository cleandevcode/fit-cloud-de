package qc;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.concurrent.TimeUnit;
import oc.c1;
import oc.q0;
import oc.z0;

/* loaded from: classes.dex */
public final class a0 implements z {

    /* renamed from: a */
    public final c1 f24681a;

    /* renamed from: b */
    public final BluetoothGatt f24682b;

    /* renamed from: c */
    public final pc.c f24683c;

    /* renamed from: d */
    public final m0 f24684d;

    /* renamed from: e */
    public final tk.o f24685e;

    /* renamed from: f */
    public final tk.o f24686f;

    public a0(c1 c1Var, BluetoothGatt bluetoothGatt, pc.c cVar, m0 m0Var, tk.o oVar, tk.o oVar2, w3.a<c0> aVar) {
        this.f24681a = c1Var;
        this.f24682b = bluetoothGatt;
        this.f24683c = cVar;
        this.f24684d = m0Var;
        this.f24685e = oVar;
        this.f24686f = oVar2;
    }

    @Override // qc.z
    public final x a(int i10) {
        return new x(this.f24681a, this.f24682b, this.f24684d, i10);
    }

    @Override // qc.z
    public final t b(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return new t(this.f24681a, this.f24682b, this.f24684d, bluetoothGattDescriptor, bArr);
    }

    @Override // qc.z
    public final l c(BluetoothGattCharacteristic bluetoothGattCharacteristic, oc.f0 f0Var, q0 q0Var, z0 z0Var, byte[] bArr) {
        return new l(this.f24682b, this.f24681a, this.f24685e, this.f24684d, bluetoothGattCharacteristic, z0Var, f0Var, q0Var, bArr);
    }

    @Override // qc.z
    public final l0 d(long j10, TimeUnit timeUnit) {
        return new l0(this.f24681a, this.f24682b, this.f24683c, new m0(j10, timeUnit, this.f24686f));
    }

    @Override // qc.z
    public final m e(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return new m(this.f24681a, this.f24682b, this.f24684d, bluetoothGattCharacteristic, bArr);
    }
}
