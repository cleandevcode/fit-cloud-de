package ef;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;
import p001if.e;
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
    public final void b(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        bluetoothGattCharacteristic.getUuid();
        if (df.g.f13020b.equals(bluetoothGattCharacteristic.getUuid())) {
            if (bArr == null || bArr.length < 2) {
                ge.b.p("notification data invalid");
                return;
            }
            int i10 = bArr[0] & 255;
            int i11 = bArr[1] & 255;
            byte b10 = bArr[2];
            if (this.f30474c) {
                ge.b.n(String.format("responseType = %02X , requestOpCode = %02X", Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            if (i10 == 16 && i11 == 13) {
                if (b10 == 1) {
                    g().e(Arrays.copyOfRange(bArr, 3, bArr.length - 3));
                } else {
                    ge.b.p("Get image version info failed");
                }
                l();
            }
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
            } else if (xe.h.f30515b.equals(uuid)) {
                StringBuilder a10 = android.support.v4.media.d.a("PNP_ID: ");
                a10.append(he.a.a(bArr));
                ge.b.n(a10.toString());
                g().C(bArr);
            } else if (j.f13609c.equals(uuid)) {
                g().t(bArr);
            } else if (j.f13608b.equals(uuid)) {
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
                if (e10 >= 65504 && e10 <= 65519) {
                    g().e(bArr);
                } else if (e10 >= 65472 && e10 <= 65487) {
                    g().c(e10, bArr);
                } else if (e10 >= 65524 && e10 <= 65526) {
                    g().d(bArr);
                }
            }
        } else {
            boolean z10 = this.f30472a;
            ge.b.q("Characteristic read error: " + i10, z10);
            if (j.f13609c.equals(uuid)) {
                h(2);
            } else {
                ge.b.d("ignore exctption when read other info");
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
                boolean z10 = this.f30474c;
                StringBuilder a11 = android.support.v4.media.d.a("not found debug characteristic:");
                a11.append(a10.toString());
                ge.b.o(a11.toString(), z10);
                break;
            }
            boolean z11 = this.f30474c;
            StringBuilder a12 = android.support.v4.media.d.a("find debug characteristic: ");
            a12.append(a10.toString());
            ge.b.e(a12.toString(), z11);
            this.f30486o.add(characteristic);
            i10++;
        }
        int i11 = 65504;
        while (true) {
            if (i11 > 65519) {
                break;
            }
            UUID a13 = de.a.a(i11);
            BluetoothGattCharacteristic characteristic2 = this.f30479h.getCharacteristic(a13);
            if (characteristic2 == null) {
                boolean z12 = this.f30474c;
                StringBuilder a14 = android.support.v4.media.d.a("not found image version characteristic:");
                a14.append(a13.toString());
                ge.b.o(a14.toString(), z12);
                break;
            }
            boolean z13 = this.f30474c;
            StringBuilder a15 = android.support.v4.media.d.a("find image version characteristic: ");
            a15.append(a13.toString());
            ge.b.o(a15.toString(), z13);
            this.f30483l.add(characteristic2);
            i11++;
        }
        for (int i12 = 65524; i12 <= 65526; i12++) {
            UUID a16 = de.a.a(i12);
            BluetoothGattCharacteristic characteristic3 = this.f30479h.getCharacteristic(a16);
            if (characteristic3 == null) {
                boolean z14 = this.f30472a;
                StringBuilder a17 = android.support.v4.media.d.a("not found image session size characteristic:");
                a17.append(a16.toString());
                ge.b.e(a17.toString(), z14);
                return true;
            }
            boolean z15 = this.f30474c;
            StringBuilder a18 = android.support.v4.media.d.a("find image session size characteristic: ");
            a18.append(a16.toString());
            ge.b.e(a18.toString(), z15);
            this.f30486o.add(characteristic3);
        }
        return true;
    }

    @Override // xe.a
    public final void k() {
        ArrayList arrayList;
        k kVar;
        boolean f10;
        boolean z10;
        StringBuilder sb2;
        String str;
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
            boolean f11 = f(this.f30481j);
            d4.b.b("read device info :", f11, this.f30474c);
            if (!f11) {
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
        int i10 = g().f32262l;
        Iterator it = this.f30486o.iterator();
        while (it.hasNext()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) it.next();
            int e10 = de.a.e(bluetoothGattCharacteristic.getUuid());
            ge.b.o(String.format("uuidShortValue=0x%4x", Integer.valueOf(e10)), this.f30474c);
            if (e10 >= 65472 && e10 <= 65487) {
                h(266);
                f10 = f(bluetoothGattCharacteristic);
                z10 = this.f30474c;
                sb2 = new StringBuilder();
                str = "read debug info :";
            } else if (e10 >= 65524 && e10 <= 65526) {
                h(268);
                f10 = f(bluetoothGattCharacteristic);
                z10 = this.f30474c;
                sb2 = new StringBuilder();
                str = "read image section version :";
            }
            sb2.append(str);
            sb2.append(f10);
            ge.b.o(sb2.toString(), z10);
        }
        if (i10 < 4) {
            Iterator it2 = this.f30483l.iterator();
            while (it2.hasNext()) {
                BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) it2.next();
                int e11 = de.a.e(bluetoothGattCharacteristic2.getUuid());
                ge.b.o(String.format("uuidShortValue=0x%4x", Integer.valueOf(e11)), this.f30474c);
                if (e11 >= 65504 && e11 <= 65519) {
                    h(267);
                    d4.b.b("read image version :", f(bluetoothGattCharacteristic2), this.f30474c);
                }
            }
        } else {
            BluetoothGattService bluetoothGattService = this.f30479h;
            if (bluetoothGattService != null) {
                BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(de.a.a(65504));
                h(267);
                d4.b.b("read image version :", f(characteristic), this.f30474c);
            }
            BluetoothGattCharacteristic bluetoothGattCharacteristic3 = this.f30485n;
            if (bluetoothGattCharacteristic3 != null) {
                if (!e(this.f30476e, bluetoothGattCharacteristic3)) {
                    ge.b.e("setCharacteristicNotification failed", this.f30473b);
                } else {
                    h(269);
                    if (this.f30476e != null && this.f30485n != null) {
                        ge.b.o("attempt to read inactive device info ....: ", this.f30473b);
                        if (wd.a.a(this.f30476e, this.f30485n, new byte[]{13})) {
                            m();
                        }
                    } else {
                        ge.b.p("mBtGatt is null maybe disconnected just now");
                    }
                }
            }
        }
        this.f30488q.clear();
        if (this.f30484m != null) {
            if (g().B) {
                arrayList = this.f30488q;
                kVar = new k(24);
            } else {
                arrayList = this.f30488q;
                kVar = new k(16);
            }
            arrayList.add(kVar);
            if (g().A) {
                this.f30488q.add(new k(23));
            }
        }
        if (g().f32272v && this.f30480i != null) {
            this.f30488q.add(new k(0));
            if (g().A) {
                this.f30488q.add(new k(22));
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
