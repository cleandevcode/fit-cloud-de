package df;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import cn.sharesdk.framework.Platform;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import p001if.e;
import ze.j;
import ze.k;

/* loaded from: classes.dex */
public final class a extends xe.a {
    public BluetoothGattCharacteristic B;
    public BluetoothGattCharacteristic C;
    public BluetoothGattCharacteristic D;
    public boolean E;

    public a(p001if.b bVar, String str, BluetoothGattService bluetoothGattService, BluetoothGattService bluetoothGattService2, e.a aVar, boolean z10) {
        super(0, bVar, str, bluetoothGattService, bluetoothGattService2, aVar);
        ArrayList arrayList;
        k kVar;
        this.E = z10;
        super.i();
        BluetoothGattService bluetoothGattService3 = this.f30484m;
        if (bluetoothGattService3 == null) {
            if (this.f30480i == null) {
                return;
            }
            arrayList = this.f30488q;
            kVar = new k(0);
        } else if (this.E) {
            this.f30488q.add(new k(18));
            return;
        } else {
            UUID uuid = g.f13021c;
            BluetoothGattCharacteristic characteristic = bluetoothGattService3.getCharacteristic(uuid);
            if (characteristic != null) {
                boolean z11 = this.f30472a;
                ge.b.e("find DFU_EXTEND_FLASH_CHARACTERISTIC = " + uuid, z11);
                this.f30488q.add(new k(17));
                ge.b.d(ae.b.b(characteristic.getProperties()));
                return;
            }
            ge.b.e("DFU_EXTEND_FLASH_CHARACTERISTIC not found", this.f30472a);
            this.f30488q.add(new k(16));
            if (this.f30480i == null) {
                return;
            }
            arrayList = this.f30488q;
            kVar = new k(0);
        }
        arrayList.add(kVar);
    }

    @Override // xe.a
    public final void b(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        bluetoothGattCharacteristic.getUuid();
        if (g.f13020b.equals(bluetoothGattCharacteristic.getUuid())) {
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
                    g().s(3, bArr);
                } else {
                    ge.b.p("Get temp dev info failed");
                }
                l();
            }
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
            } else if (h.f13027f.equals(uuid)) {
                g().s(0, bArr);
            } else if (h.f13023b.equals(uuid)) {
                if (i11 > 0) {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                    if (i11 >= 6) {
                        byte[] bArr2 = new byte[6];
                        wrap.get(bArr2, 0, 6);
                        g().F = bArr2;
                    }
                }
            } else if (h.f13024c.equals(uuid)) {
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
            } else if (h.f13025d.equals(uuid)) {
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
            } else if (h.f13026e.equals(uuid)) {
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
            } else {
                int e10 = de.a.e(uuid);
                if (e10 >= 65504 && e10 <= 65519) {
                    g().b(0, bArr);
                } else if (e10 >= 65472 && e10 <= 65487) {
                    g().c(e10, bArr);
                }
            }
        } else {
            boolean z10 = this.f30472a;
            ge.b.q("Characteristic read error: " + i10, z10);
            if (h.f13027f.equals(uuid)) {
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
        BluetoothGattService bluetoothGattService = this.f30479h;
        UUID uuid = h.f13024c;
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
        this.C = characteristic;
        if (characteristic == null) {
            if (this.f30473b) {
                ge.b.d("OTA_READ_PATCH_CHARACTERISTIC_UUID not found");
            }
        } else if (this.f30474c) {
            ge.b.n("find OTA_READ_PATCH_CHARACTERISTIC_UUID = " + uuid);
            ge.b.n(ae.b.b(this.C.getProperties()));
        }
        BluetoothGattService bluetoothGattService2 = this.f30479h;
        UUID uuid2 = h.f13025d;
        BluetoothGattCharacteristic characteristic2 = bluetoothGattService2.getCharacteristic(uuid2);
        this.B = characteristic2;
        if (characteristic2 == null) {
            if (this.f30473b) {
                ge.b.d("OTA_APP_VERSION_CHARACTERISTIC_UUID not found");
            }
        } else if (this.f30474c) {
            ge.b.n("find OTA_APP_VERSION_CHARACTERISTIC_UUID = " + uuid2);
            ge.b.n(ae.b.b(this.B.getProperties()));
        }
        BluetoothGattService bluetoothGattService3 = this.f30479h;
        UUID uuid3 = h.f13026e;
        BluetoothGattCharacteristic characteristic3 = bluetoothGattService3.getCharacteristic(uuid3);
        this.D = characteristic3;
        if (characteristic3 == null) {
            if (this.f30473b) {
                ge.b.d("OTA_READ_PATCH_EXTENSION_CHARACTERISTIC_UUID not found");
            }
        } else if (this.f30474c) {
            ge.b.n("find OTA_READ_PATCH_EXTENSION_CHARACTERISTIC_UUID = " + uuid3);
            ge.b.n(ae.b.b(this.D.getProperties()));
        }
        int i10 = 65472;
        while (true) {
            if (i10 > 65487) {
                break;
            }
            UUID a10 = de.a.a(i10);
            BluetoothGattCharacteristic characteristic4 = this.f30479h.getCharacteristic(a10);
            if (characteristic4 == null) {
                boolean z10 = this.f30474c;
                StringBuilder a11 = android.support.v4.media.d.a("not found debug characteristic:");
                a11.append(a10.toString());
                ge.b.o(a11.toString(), z10);
                break;
            }
            boolean z11 = this.f30473b;
            StringBuilder a12 = android.support.v4.media.d.a("find debug characteristic: ");
            a12.append(a10.toString());
            ge.b.e(a12.toString(), z11);
            this.f30486o.add(characteristic4);
            i10++;
        }
        for (int i11 = 65504; i11 <= 65519; i11++) {
            UUID a13 = de.a.a(i11);
            BluetoothGattCharacteristic characteristic5 = this.f30479h.getCharacteristic(a13);
            if (characteristic5 == null) {
                boolean z12 = this.f30473b;
                StringBuilder a14 = android.support.v4.media.d.a("not found image version characteristic:");
                a14.append(a13.toString());
                ge.b.e(a14.toString(), z12);
                return true;
            }
            boolean z13 = this.f30472a;
            StringBuilder a15 = android.support.v4.media.d.a("find image version characteristic: ");
            a15.append(a13.toString());
            ge.b.e(a15.toString(), z13);
            this.f30483l.add(characteristic5);
        }
        return true;
    }

    @Override // xe.a
    public final void k() {
        boolean z10;
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
        if (g().f32262l == 0) {
            if (this.B != null) {
                h(262);
                d4.b.b("read app version :", f(this.B), this.f30474c);
            }
            if (this.C != null) {
                h(263);
                d4.b.b("attempt to read patch version :", f(this.C), this.f30474c);
            }
            if (this.D != null) {
                h(264);
                d4.b.b("attempt to read patch extension version :", f(this.D), this.f30474c);
            }
        }
        if (this.E) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f30485n;
            if (bluetoothGattCharacteristic == null) {
                z10 = this.f30474c;
                str = "mDfuControlPointCharacteristic is null";
            } else {
                BluetoothGatt bluetoothGatt = this.f30476e;
                if (bluetoothGatt == null) {
                    ge.b.p("mBtGatt is null maybe disconnected just now");
                } else if (!e(bluetoothGatt, bluetoothGattCharacteristic)) {
                    z10 = this.f30474c;
                    str = "readTempDeviceInfo failed";
                } else {
                    h(265);
                    ge.b.n("attempt to read temp device info ....: ");
                    if (wd.a.a(this.f30476e, this.f30485n, new byte[]{13})) {
                        m();
                    }
                }
            }
            ge.b.e(str, z10);
        }
        Iterator it = this.f30486o.iterator();
        while (it.hasNext()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) it.next();
            int e10 = de.a.e(bluetoothGattCharacteristic2.getUuid());
            ge.b.o(String.format("uuidShortValue=0x%4x", Integer.valueOf(e10)), this.f30472a);
            if (e10 >= 65472 && e10 <= 65487) {
                h(266);
                boolean f11 = f(bluetoothGattCharacteristic2);
                boolean z11 = this.f30474c;
                ge.b.e("read debug info :" + f11, z11);
            }
        }
        Iterator it2 = this.f30483l.iterator();
        while (it2.hasNext()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic3 = (BluetoothGattCharacteristic) it2.next();
            int e11 = de.a.e(bluetoothGattCharacteristic3.getUuid());
            ge.b.o(String.format("uuidShortValue=0x%4x", Integer.valueOf(e11)), this.f30472a);
            if (e11 >= 65504 && e11 <= 65519 && g().f32262l != 0) {
                h(267);
                d4.b.b("read image version :", f(bluetoothGattCharacteristic3), this.f30474c);
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
