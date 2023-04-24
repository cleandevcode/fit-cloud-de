package ed;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.ParcelUuid;
import ed.e;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import zd.a;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: p */
    public static volatile c f13551p;

    /* renamed from: m */
    public zd.a f13552m;

    /* renamed from: n */
    public UUID f13553n = d.f13557g;

    /* renamed from: o */
    public final a f13554o = new a();

    /* loaded from: classes.dex */
    public class a extends zd.c {
        public a() {
            c.this = r1;
        }

        @Override // xd.a
        public final void a(zd.a aVar, int i10) {
            String str;
            BluetoothDevice bluetoothDevice = aVar.mDevice;
            if (bluetoothDevice != null) {
                str = bluetoothDevice.getAddress();
            } else {
                str = null;
            }
            if (e.f13564l) {
                ge.b.n(String.format(Locale.US, "%s status: %b 0x%04X", p.b.m(str), Boolean.TRUE, Integer.valueOf(i10)));
            }
            if (i10 == 0) {
                c.this.a();
            }
            c cVar = c.this;
            cVar.getClass();
            try {
                synchronized (cVar.f13571g) {
                    CopyOnWriteArrayList copyOnWriteArrayList = cVar.f13571g;
                    if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                        Iterator it = cVar.f13571g.iterator();
                        while (it.hasNext()) {
                            ((f) it.next()).b(bluetoothDevice, i10);
                        }
                    }
                }
            } catch (Exception e10) {
                ge.b.p(e10.toString());
            }
        }
    }

    public c() {
        e.f13563k = rd.b.f25539b;
        e.f13564l = rd.b.f25540c;
        this.f13571g = new CopyOnWriteArrayList();
    }

    public static synchronized c l() {
        c cVar;
        synchronized (c.class) {
            if (f13551p == null) {
                synchronized (c.class) {
                    if (f13551p == null) {
                        f13551p = new c();
                    }
                }
            }
            cVar = f13551p;
        }
        return cVar;
    }

    @Override // ed.e
    public final synchronized boolean f(b bVar) {
        return m(g.b(bVar.f13545a, bVar.f13549e));
    }

    public final boolean h(BluetoothDevice bluetoothDevice, BluetoothSocket bluetoothSocket, UUID uuid, int i10) {
        boolean z10;
        boolean z11;
        String str;
        ParcelUuid[] uuids;
        boolean z12 = false;
        if (bluetoothDevice == null) {
            return false;
        }
        if (this.f13552m == null) {
            this.f13552m = new zd.a(this.f13554o);
        }
        zd.a aVar = this.f13552m;
        BluetoothDevice bluetoothDevice2 = aVar.mDevice;
        if (bluetoothDevice2 != null && bluetoothDevice2.equals(bluetoothDevice)) {
            z10 = aVar.g();
        } else {
            z10 = false;
        }
        if (z10) {
            a aVar2 = this.f13554o;
            if (aVar2 != null) {
                if (this.f13552m == null) {
                    this.f13552m = new zd.a(this.f13554o);
                }
                aVar2.a(this.f13552m, 2);
            }
            return true;
        }
        this.f13567c = 0;
        this.f13566b = 1;
        e.b bVar = this.f13568d;
        if (bVar != null) {
            bVar.f28684a = true;
        }
        if (e.f13564l) {
            ge.b.n("startTxSchedule.");
        }
        e.b bVar2 = new e.b();
        this.f13568d = bVar2;
        bVar2.start();
        e.a aVar3 = this.f13569e;
        if (aVar3 != null) {
            aVar3.f28684a = true;
        }
        if (e.f13564l) {
            ge.b.n("startAckThread.");
        }
        e.a aVar4 = new e.a();
        this.f13569e = aVar4;
        aVar4.start();
        e.c cVar = this.f13570f;
        if (cVar != null) {
            cVar.f28684a = true;
        }
        e.c cVar2 = new e.c();
        this.f13570f = cVar2;
        cVar2.start();
        if (e.f13564l && (uuids = bluetoothDevice.getUuids()) != null && uuids.length > 0) {
            StringBuilder sb2 = new StringBuilder("supported features (UUIDs)");
            for (ParcelUuid parcelUuid : uuids) {
                sb2.append("\n\t" + parcelUuid.toString());
            }
            ge.b.n(sb2.toString());
        }
        ParcelUuid[] uuids2 = bluetoothDevice.getUuids();
        ParcelUuid parcelUuid2 = null;
        if (uuid != null && uuids2 != null && uuids2.length > 0) {
            for (ParcelUuid parcelUuid3 : uuids2) {
                if (parcelUuid3 != null) {
                    if (!uuid.equals(parcelUuid3.getUuid())) {
                        if (!de.a.b(parcelUuid3) && !de.a.c(parcelUuid3)) {
                            byte[] s10 = o8.b.s(parcelUuid3);
                            byte[] bArr = new byte[s10.length];
                            int i11 = 0;
                            for (int length = s10.length - 1; length >= 0; length--) {
                                bArr[i11] = s10[length];
                                i11++;
                            }
                            parcelUuid3 = o8.b.g(bArr);
                            if (parcelUuid3 != null && uuid.equals(parcelUuid3.getUuid())) {
                                StringBuilder a10 = android.support.v4.media.d.a("match reverse uuid:");
                                a10.append(parcelUuid3.toString());
                                ge.b.n(a10.toString());
                            }
                        }
                    }
                    parcelUuid2 = parcelUuid3;
                    break;
                }
            }
        }
        if (parcelUuid2 == null) {
            if (i10 == 1) {
                ge.b.q("not find pref spp: " + uuid, e.f13563k);
                return false;
            }
            parcelUuid2 = d.f13556f;
            boolean z13 = e.f13563k;
            StringBuilder a11 = android.support.v4.media.d.a("use well-known spp: ");
            a11.append(parcelUuid2.toString());
            ge.b.o(a11.toString(), z13);
        } else {
            ge.b.o("use pref spp: " + uuid, e.f13563k);
        }
        this.f13553n = parcelUuid2.getUuid();
        UUID uuid2 = zd.d.f32223d;
        UUID uuid3 = parcelUuid2.getUuid();
        if (uuid3 != null) {
            uuid2 = uuid3;
        }
        zd.d dVar = new zd.d(bluetoothDevice, bluetoothSocket, uuid2);
        if (this.f13552m == null) {
            this.f13552m = new zd.a(this.f13554o);
        }
        zd.a aVar5 = this.f13552m;
        synchronized (aVar5) {
            BluetoothDevice bluetoothDevice3 = aVar5.mDevice;
            if (bluetoothDevice3 != null) {
                if (bluetoothDevice3.equals(bluetoothDevice)) {
                    int i12 = aVar5.f9454a;
                    if (i12 == 2) {
                        ge.b.o("device already connected", aVar5.DBG);
                        aVar5.a(2);
                    } else if (i12 == 1) {
                        ge.b.o("device is already at connecting state", aVar5.DBG);
                        aVar5.a(1);
                    }
                    return true;
                }
                int i13 = aVar5.f9454a;
                if (i13 == 2) {
                    z11 = aVar5.DBG;
                    str = "other device already connected";
                } else if (i13 == 1) {
                    z11 = aVar5.DBG;
                    str = "other device is at connecting state";
                }
                ge.b.o(str, z11);
                aVar5.c();
                return z12;
            }
            aVar5.f32203b = true;
            z12 = aVar5.b(dVar);
            return z12;
        }
    }

    public final boolean i(d dVar) {
        return h(dVar.f13558a, dVar.f13559b, dVar.f13560c, dVar.f13562e);
    }

    public final void j() {
        if (e.f13564l) {
            ge.b.n("disconnect");
        }
        a();
        zd.a aVar = this.f13552m;
        if (aVar != null) {
            synchronized (aVar) {
                ge.b.o("stop", aVar.VDBG);
                if (aVar.f9454a == 2) {
                    aVar.a(3);
                }
                aVar.mDevice = null;
                a.b bVar = aVar.f32208g;
                if (bVar != null) {
                    bVar.b();
                    aVar.f32208g.interrupt();
                    aVar.f32208g = null;
                }
                a.c cVar = aVar.f32209h;
                if (cVar != null) {
                    cVar.a();
                    aVar.f32209h.interrupt();
                    aVar.f32209h = null;
                }
                a.C0610a c0610a = aVar.f32210i;
                if (c0610a != null) {
                    c0610a.a();
                    aVar.f32210i.interrupt();
                    aVar.f32210i = null;
                }
                synchronized (aVar.f32212k) {
                    aVar.f32213l = Boolean.FALSE;
                }
            }
        }
    }

    public final int k() {
        if (this.f13552m == null) {
            this.f13552m = new zd.a(this.f13554o);
        }
        return this.f13552m.f9454a;
    }

    public final boolean m(byte[] bArr) {
        if (this.f13552m == null) {
            this.f13552m = new zd.a(this.f13554o);
        }
        zd.a aVar = this.f13552m;
        synchronized (aVar) {
            if (aVar.f9454a != 2) {
                ge.b.e("not connected", aVar.DBG);
                return false;
            }
            a.c cVar = aVar.f32209h;
            if (cVar == null) {
                ge.b.d("ConnectedThread not created");
                return false;
            } else if (cVar.f32221c == null) {
                return false;
            } else {
                try {
                    if (zd.a.this.DBG) {
                        ge.b.d(String.format(Locale.US, "<< (%d) %s", Integer.valueOf(bArr.length), he.a.a(bArr)));
                    }
                    cVar.f32221c.write(bArr);
                    cVar.f32221c.flush();
                    return true;
                } catch (IOException e10) {
                    ge.b.p("Exception during write： " + e10);
                    return false;
                }
            }
        }
    }
}
