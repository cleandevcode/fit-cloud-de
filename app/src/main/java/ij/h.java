package ij;

import android.bluetooth.BluetoothDevice;
import ij.c;
import java.io.File;

/* loaded from: classes2.dex */
public final class h extends gm.m implements fm.l<BluetoothDevice, c.C0298c> {

    /* renamed from: b */
    public final /* synthetic */ File f17057b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(File file) {
        super(1);
        this.f17057b = file;
    }

    @Override // fm.l
    public final c.C0298c k(BluetoothDevice bluetoothDevice) {
        BluetoothDevice bluetoothDevice2 = bluetoothDevice;
        File file = this.f17057b;
        gm.l.e(file, "file");
        gm.l.e(bluetoothDevice2, "device");
        return new c.C0298c(file, bluetoothDevice2);
    }
}
