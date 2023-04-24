package wi;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import kc.v0;
import p000do.a;
import wi.b;

/* loaded from: classes2.dex */
public final class t extends gm.m implements fm.l<BluetoothGattService, tk.l<? extends tk.i<byte[]>>> {

    /* renamed from: b */
    public final /* synthetic */ b.a f29951b;

    /* renamed from: c */
    public final /* synthetic */ k f29952c;

    /* renamed from: d */
    public final /* synthetic */ v0 f29953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b.a aVar, k kVar, v0 v0Var) {
        super(1);
        this.f29951b = aVar;
        this.f29952c = kVar;
        this.f29953d = v0Var;
    }

    @Override // fm.l
    public final tk.l<? extends tk.i<byte[]>> k(BluetoothGattService bluetoothGattService) {
        BluetoothGattService bluetoothGattService2 = bluetoothGattService;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#BaseConnectorImpl");
        bVar.h("rxPrepare setupNotification (Thread:%s)", Thread.currentThread().getName());
        b.a aVar = this.f29951b;
        BluetoothGattCharacteristic characteristic = bluetoothGattService2.getCharacteristic(this.f29952c.f29899g);
        if (characteristic != null) {
            aVar.getClass();
            aVar.f29866f = characteristic;
            BluetoothGattCharacteristic characteristic2 = bluetoothGattService2.getCharacteristic(this.f29952c.f29900h);
            if (characteristic2 != null) {
                return this.f29953d.f(characteristic2);
            }
            throw new lc.d(this.f29952c.f29900h);
        }
        throw new lc.d(this.f29952c.f29899g);
    }
}
