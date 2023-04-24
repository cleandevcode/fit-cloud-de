package ye;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import androidx.fragment.app.p;
import cn.sharesdk.framework.Platform;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.UUID;
import p001if.e;
import xe.h;
import ze.j;
import ze.k;

/* loaded from: classes.dex */
public final class a extends xe.a {
    public a(int i10, p001if.b bVar, String str, BluetoothGattService bluetoothGattService, BluetoothGattService bluetoothGattService2, e.a aVar) {
        super(i10, bVar, str, bluetoothGattService, bluetoothGattService2, aVar);
        super.i();
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
        j g10;
        int i12;
        j g11;
        int i13;
        j g12;
        int i14;
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        ge.b.o("processCharacteristicRead", this.f30473b);
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
            } else if (f.f31452f.equals(uuid)) {
                ge.b.o("update device info", this.f30474c);
                g().u(bArr);
            } else if (f.f31448b.equals(uuid)) {
                if (i11 > 0) {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                    if (i11 >= 6) {
                        byte[] bArr2 = new byte[6];
                        wrap.get(bArr2, 0, 6);
                        g().F = bArr2;
                    }
                }
            } else if (f.f31449c.equals(uuid)) {
                if (i11 > 0) {
                    ByteBuffer wrap2 = ByteBuffer.wrap(bArr);
                    wrap2.order(ByteOrder.LITTLE_ENDIAN);
                    if (i11 == 2) {
                        g12 = g();
                        i14 = wrap2.getShort(0);
                    } else if (i11 >= 4) {
                        g12 = g();
                        i14 = wrap2.getInt(0);
                    }
                    g12.G = i14 & Platform.CUSTOMER_ACTION_MASK;
                }
            } else if (f.f31450d.equals(uuid)) {
                if (i11 > 0) {
                    ByteBuffer wrap3 = ByteBuffer.wrap(bArr);
                    wrap3.order(ByteOrder.LITTLE_ENDIAN);
                    if (i11 == 2) {
                        g11 = g();
                        i13 = wrap3.getShort(0) & 65535;
                    } else if (i11 >= 4) {
                        g11 = g();
                        i13 = wrap3.getInt(0);
                    }
                    g11.H = i13;
                }
            } else if (f.f31451e.equals(uuid)) {
                if (i11 > 0) {
                    ByteBuffer wrap4 = ByteBuffer.wrap(bArr);
                    wrap4.order(ByteOrder.LITTLE_ENDIAN);
                    if (i11 == 1) {
                        g10 = g();
                        i12 = wrap4.get(0);
                    } else if (i11 == 2) {
                        g10 = g();
                        i12 = wrap4.getShort(0) & 65535;
                    }
                    g10.I = i12;
                }
            } else {
                int e10 = de.a.e(uuid);
                if (e10 >= 65504 && e10 <= 65519) {
                    ge.b.o("X0012:appendActiveImageVersionBytes", this.f30473b);
                    g().b(0, bArr);
                } else if (e10 >= 65472 && e10 <= 65487) {
                    g().c(e10, bArr);
                }
            }
        } else {
            boolean z10 = this.f30473b;
            ge.b.q("Characteristic read error: " + i10, z10);
            if (f.f31452f.equals(uuid)) {
                h(2);
            } else {
                ge.b.d("ignore exception when read other info");
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
        int i10 = 65472;
        while (true) {
            if (i10 > 65487) {
                break;
            }
            UUID a10 = de.a.a(i10);
            BluetoothGattCharacteristic characteristic = this.f30479h.getCharacteristic(a10);
            if (characteristic == null) {
                if (this.f30474c) {
                    p.b(a10, android.support.v4.media.d.a("not found debug characteristic:"));
                }
            } else {
                if (this.f30474c) {
                    p.b(a10, android.support.v4.media.d.a("find debug characteristic: "));
                }
                this.f30486o.add(characteristic);
                i10++;
            }
        }
        for (int i11 = 65504; i11 <= 65519; i11++) {
            UUID a11 = de.a.a(i11);
            BluetoothGattCharacteristic characteristic2 = this.f30479h.getCharacteristic(a11);
            if (characteristic2 == null) {
                boolean z10 = this.f30474c;
                StringBuilder a12 = android.support.v4.media.d.a("not found image version characteristic:");
                a12.append(a11.toString());
                ge.b.o(a12.toString(), z10);
                return true;
            }
            boolean z11 = this.f30472a;
            StringBuilder a13 = android.support.v4.media.d.a("find image version characteristic: ");
            a13.append(a11.toString());
            ge.b.o(a13.toString(), z11);
            this.f30483l.add(characteristic2);
        }
        return true;
    }

    @Override // xe.a
    public final void k() {
        h(257);
        if (this.f30477f != null) {
            h(258);
            d4.b.b("read battery level :", f(this.f30477f), this.f30473b);
        }
        if (this.f30478g != null) {
            h(259);
            d4.b.b("read PnP_ID :", f(this.f30478g), this.f30473b);
        }
        if (this.f30481j != null) {
            h(260);
            boolean f10 = f(this.f30481j);
            d4.b.b("read device info :", f10, this.f30473b);
            if (!f10) {
                this.f30486o.clear();
                this.f30483l.clear();
                h(2);
                return;
            }
        }
        if (this.f30482k != null) {
            h(261);
            d4.b.b("read device mac :", f(this.f30482k), this.f30473b);
        }
        Iterator it = this.f30486o.iterator();
        while (it.hasNext()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) it.next();
            int e10 = de.a.e(bluetoothGattCharacteristic.getUuid());
            ge.b.o(String.format("uuidShortValue=0x%4x", Integer.valueOf(e10)), this.f30474c);
            if (e10 >= 65472 && e10 <= 65487) {
                h(266);
                d4.b.b("read debug info :", f(bluetoothGattCharacteristic), this.f30474c);
            }
        }
        Iterator it2 = this.f30483l.iterator();
        while (it2.hasNext()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) it2.next();
            int e11 = de.a.e(bluetoothGattCharacteristic2.getUuid());
            ge.b.o(String.format("uuidShortValue=0x%4x", Integer.valueOf(e11)), this.f30474c);
            if (e11 >= 65504 && e11 <= 65519) {
                h(267);
                boolean f11 = f(bluetoothGattCharacteristic2);
                boolean z10 = this.f30473b;
                ge.b.e("X0012: read image version :" + f11, z10);
            }
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
