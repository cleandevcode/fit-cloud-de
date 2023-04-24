package cf;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.UUID;
import p001if.e;
import xe.h;
import ze.k;

/* loaded from: classes.dex */
public final class a extends xe.a {
    public a(int i10, p001if.b bVar, String str, BluetoothGattService bluetoothGattService, BluetoothGattService bluetoothGattService2, e.a aVar) {
        super(i10, bVar, str, bluetoothGattService, bluetoothGattService2, aVar);
        if (this.f30484m != null) {
            this.f30488q.add(new k(16));
        }
        if (this.f30480i != null) {
            this.f30488q.add(new k(0));
        }
    }

    @Override // xe.a
    public final void c(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i10) {
        int i11;
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        if (i10 == 0) {
            if (bArr != null) {
                i11 = bArr.length;
            } else {
                i11 = 0;
            }
            if (xe.b.f30501b.equals(uuid)) {
                d(bArr);
            } else if (h.f30515b.equals(uuid)) {
                StringBuilder a10 = android.support.v4.media.d.a("PNP_ID: ");
                a10.append(he.a.a(bArr));
                ge.b.n(a10.toString());
                g().C(bArr);
            } else if (f.f4646c.equals(uuid)) {
                g().w(bArr);
            } else if (f.f4645b.equals(uuid)) {
                if (i11 > 0) {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                    if (i11 >= 6) {
                        byte[] bArr2 = new byte[6];
                        wrap.get(bArr2, 0, 6);
                        g().F = bArr2;
                    }
                }
            } else {
                int e10 = de.a.e(uuid);
                if (e10 == 65504) {
                    g().e(bArr);
                } else if (e10 == 65524) {
                    g().d(bArr);
                }
            }
        } else {
            boolean z10 = this.f30472a;
            ge.b.q("Characteristic read error: " + i10, z10);
            if (f.f4646c.equals(uuid)) {
                h(2);
            } else {
                ge.b.e("ignore exctption when read other info", this.f30472a);
                return;
            }
        }
        l();
    }

    @Override // xe.a
    public final boolean j() {
        if (!super.j()) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = this.f30479h.getCharacteristic(de.a.a(65504));
        if (characteristic == null) {
            ge.b.e("not found image version characteristic:65504", this.f30474c);
        } else {
            boolean z10 = this.f30474c;
            StringBuilder a10 = android.support.v4.media.d.a("find image version characteristic: ");
            a10.append(characteristic.getUuid());
            ge.b.e(a10.toString(), z10);
            this.f30483l.add(characteristic);
        }
        BluetoothGattCharacteristic characteristic2 = this.f30479h.getCharacteristic(de.a.a(65524));
        if (characteristic2 == null) {
            ge.b.o("not found image session size characteristic:65524", this.f30474c);
            return true;
        }
        boolean z11 = this.f30474c;
        StringBuilder a11 = android.support.v4.media.d.a("find image session size characteristic: ");
        a11.append(characteristic2.getUuid());
        ge.b.o(a11.toString(), z11);
        this.f30486o.add(characteristic2);
        return true;
    }

    @Override // xe.a
    public final void k() {
        h(257);
        if (this.f30477f != null) {
            h(258);
            d4.b.b("read battery level :", f(this.f30477f), this.f30474c);
        }
        if (this.f30478g != null) {
            h(259);
            d4.b.b("read PnP_ID :", f(this.f30478g), this.f30474c);
        }
        if (this.f30481j != null) {
            h(260);
            boolean f10 = f(this.f30481j);
            d4.b.b("read device info :", f10, this.f30474c);
            if (!f10) {
                this.f30486o.clear();
                this.f30483l.clear();
                h(2);
                return;
            }
        }
        if (this.f30482k != null) {
            h(261);
            d4.b.b("read device mac :", f(this.f30482k), this.f30474c);
        }
        Iterator it = this.f30486o.iterator();
        while (it.hasNext()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) it.next();
            int e10 = de.a.e(bluetoothGattCharacteristic.getUuid());
            ge.b.o(String.format("uuidShortValue=0x%4x", Integer.valueOf(e10)), this.f30474c);
            if (e10 == 65524) {
                h(268);
                d4.b.b("read image section size :", f(bluetoothGattCharacteristic), this.f30474c);
            }
        }
        Iterator it2 = this.f30483l.iterator();
        while (it2.hasNext()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) it2.next();
            int e11 = de.a.e(bluetoothGattCharacteristic2.getUuid());
            ge.b.o(String.format("uuidShortValue=0x%4x", Integer.valueOf(e11)), this.f30474c);
            if (e11 == 65504) {
                h(267);
                d4.b.b("read image version :", f(bluetoothGattCharacteristic2), this.f30474c);
            }
        }
        this.f30488q.clear();
        if (this.f30484m != null) {
            this.f30488q.add(new k(16));
        }
        if (g().f32272v && this.f30480i != null) {
            this.f30488q.add(new k(0));
        }
        if (this.f30474c) {
            StringBuilder a10 = android.support.v4.media.d.a("readDeviceInfo complete: ");
            a10.append(g().toString());
            ge.b.d(a10.toString());
        }
        this.f30486o.clear();
        this.f30483l.clear();
        h(1);
    }
}
