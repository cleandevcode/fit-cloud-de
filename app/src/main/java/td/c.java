package td;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import vd.d;
import vd.e;

/* loaded from: classes.dex */
public class c {

    /* renamed from: l */
    public static final /* synthetic */ int f28030l = 0;

    /* renamed from: a */
    public final boolean f28031a;

    /* renamed from: b */
    public final boolean f28032b;

    /* renamed from: c */
    public BluetoothManager f28033c;

    /* renamed from: d */
    public BluetoothAdapter f28034d;

    /* renamed from: e */
    public final CopyOnWriteArrayList f28035e;

    /* renamed from: f */
    public final HashMap<String, BluetoothGatt> f28036f;

    /* renamed from: g */
    public final HashMap<String, List<yd.a>> f28037g;

    /* renamed from: h */
    public final HashMap<String, Integer> f28038h;

    /* renamed from: i */
    public final Object f28039i = new Object();

    /* renamed from: j */
    public final Context f28040j;

    /* renamed from: k */
    public d f28041k;

    /* loaded from: classes.dex */
    public class a extends e {
        public a() {
            c.this = r1;
        }

        @Override // vd.e
        public final void a(int i10) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            c cVar = c.this;
            cVar.getClass();
            if (i10 == 10 && Build.VERSION.SDK_INT >= 29 && (copyOnWriteArrayList = cVar.f28035e) != null && copyOnWriteArrayList.size() > 0) {
                ge.b.d("Bluetooth is turned off, disconnect all client connections");
                Iterator it = cVar.f28035e.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    BluetoothGatt bluetoothGatt = cVar.f28036f.get(str);
                    if (cVar.e(str)) {
                        cVar.f28038h.put(str, 0);
                        List<yd.a> list = cVar.f28037g.get(str);
                        if (list != null && list.size() > 0) {
                            for (yd.a aVar : list) {
                                aVar.d(bluetoothGatt, 0, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends BluetoothGattCallback {
        public b() {
            c.this = r1;
        }

        public final void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            String address = bluetoothGatt.getDevice().getAddress();
            if (c.this.f28031a) {
                ge.b.d(String.format(Locale.US, ">> onCharacteristicChanged(%s):0x%02X-%s\n(%d)%s", p.b.m(address), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid(), Integer.valueOf(bArr.length), he.a.a(bArr)));
            }
            List<yd.a> list = c.this.f28037g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            for (yd.a aVar : list) {
                aVar.a(bluetoothGatt, bluetoothGattCharacteristic, bArr);
            }
        }

        public final void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i10) {
            String address = bluetoothGatt.getDevice().getAddress();
            if (c.this.f28031a) {
                ge.b.d(String.format(Locale.US, "<< onCharacteristicRead(%s): 0x%02X-%s, %s \n\t(%d)%s", p.b.m(address), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid(), b0.c.r(i10), Integer.valueOf(bArr.length), he.a.a(bArr)));
            }
            synchronized (c.this.f28039i) {
                c.this.getClass();
                c.this.f28039i.notifyAll();
            }
            List<yd.a> list = c.this.f28037g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            for (yd.a aVar : list) {
                aVar.b(bluetoothGatt, bluetoothGattCharacteristic, bArr, i10);
            }
        }

        public final void c(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10, byte[] bArr) {
            String address = bluetoothGatt.getDevice().getAddress();
            if (c.this.f28031a) {
                ge.b.d(String.format(Locale.US, "<< onDescriptorRead(%s):%s, %s\n(%d)%s", p.b.m(address), b0.c.r(i10), bluetoothGattDescriptor.getUuid(), Integer.valueOf(bArr.length), he.a.a(bArr)));
            }
            List<yd.a> list = c.this.f28037g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            for (yd.a aVar : list) {
                aVar.getClass();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            a(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
        }

        public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            a(bluetoothGatt, bluetoothGattCharacteristic, bArr);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            b(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue(), i10);
        }

        public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i10) {
            b(bluetoothGatt, bluetoothGattCharacteristic, bArr, i10);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            String address = bluetoothGatt.getDevice().getAddress();
            if (c.this.f28031a) {
                Locale locale = Locale.US;
                ge.b.d(String.format(locale, "<< onCharacteristicWrite(%s):%s 0x%02X-%s", p.b.m(address), b0.c.r(i10), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid()));
                byte[] value = bluetoothGattCharacteristic.getValue();
                if (value != null) {
                    ge.b.d(String.format(locale, "<<<<(%d)%s", Integer.valueOf(value.length), he.a.a(value)));
                }
            }
            synchronized (c.this.f28039i) {
                c.this.getClass();
                c.this.f28039i.notifyAll();
            }
            List<yd.a> list = c.this.f28037g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            for (yd.a aVar : list) {
                aVar.c(bluetoothGattCharacteristic, i10);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i10, int i11) {
            String str;
            String str2;
            BluetoothDevice device = bluetoothGatt.getDevice();
            if (device == null) {
                return;
            }
            String address = device.getAddress();
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[0] = p.b.m(address);
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 8) {
                        if (i10 != 19) {
                            if (i10 != 22) {
                                if (i10 != 34) {
                                    if (i10 != 62) {
                                        if (i10 != 133) {
                                            if (i10 != 256) {
                                                str = "UNKNOWN (" + i10 + ")";
                                            } else {
                                                str = "0x0100-GATT_CONN_CANCEL";
                                            }
                                        } else {
                                            str = "0x0085-GATT_ERROR";
                                        }
                                    } else {
                                        str = "0x3E-GATT_CONN_FAIL_ESTABLISH";
                                    }
                                } else {
                                    str = "0x22-GATT_CONN_LMP_TIMEOUT";
                                }
                            } else {
                                str = "0x16-GATT_CONN_TERMINATE_LOCAL_HOST";
                            }
                        } else {
                            str = "0x13-GATT_CONN_TERMINATE_PEER_USER";
                        }
                    } else {
                        str = "0x08-GATT_CONN_TIMEOUT";
                    }
                } else {
                    str = "0x01-GATT_CONN_L2C_FAILURE";
                }
            } else {
                str = "0x00-SUCCESS";
            }
            objArr[1] = str;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            str2 = "UNKNOWN (" + i11 + ")";
                        } else {
                            str2 = "3-BluetoothProfile.STATE_DISCONNECTING";
                        }
                    } else {
                        str2 = "2-BluetoothProfile.STATE_CONNECTED";
                    }
                } else {
                    str2 = "1-BluetoothProfile.STATE_CONNECTING";
                }
            } else {
                str2 = "0-BluetoothProfile.STATE_DISCONNECTED";
            }
            objArr[2] = str2;
            ge.b.n(String.format(locale, ">> onConnectionStateChange(%s), status: %s , newState: %s", objArr));
            if (i10 == 0 && i11 == 2) {
                c.this.f28038h.put(address, 2);
                c.this.f28036f.put(address, bluetoothGatt);
            } else {
                c.this.f28038h.put(address, 0);
            }
            List<yd.a> list = c.this.f28037g.get(address);
            if (list != null && list.size() > 0) {
                for (yd.a aVar : list) {
                    aVar.d(bluetoothGatt, i10, i11);
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            c(bluetoothGatt, bluetoothGattDescriptor, i10, bluetoothGattDescriptor.getValue());
        }

        public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10, byte[] bArr) {
            c(bluetoothGatt, bluetoothGattDescriptor, i10, bArr);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            String address = bluetoothGatt.getDevice().getAddress();
            UUID uuid = bluetoothGattDescriptor.getCharacteristic().getUuid();
            if (c.this.f28031a) {
                byte[] value = bluetoothGattDescriptor.getValue();
                ge.b.d(value != null ? String.format(Locale.US, "<< onDescriptorWrite(%s):%s {\nCharacteristic:%s\nDescriptor:%s\nvalue:(%d)%s\n}", p.b.m(address), b0.c.r(i10), uuid, bluetoothGattDescriptor.getUuid(), Integer.valueOf(value.length), he.a.a(value)) : String.format(Locale.US, "<< onDescriptorWrite(%s):%s {\nCharacteristic:%s\nDescriptor:%s}", p.b.m(address), b0.c.r(i10), uuid, bluetoothGattDescriptor.getUuid()));
            }
            synchronized (c.this.f28039i) {
                c.this.getClass();
                c.this.f28039i.notifyAll();
            }
            List<yd.a> list = c.this.f28037g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            for (yd.a aVar : list) {
                aVar.e(bluetoothGattDescriptor, i10);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @TargetApi(21)
        public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i10, int i11) {
            String address = bluetoothGatt.getDevice().getAddress();
            ge.b.d(String.format(Locale.US, ">> onMtuChanged(%s) mtu=%d, addr=%s", b0.c.r(i11), Integer.valueOf(i10), p.b.m(address)));
            List<yd.a> list = c.this.f28037g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            for (yd.a aVar : list) {
                aVar.f(i10, i11);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onPhyRead(BluetoothGatt bluetoothGatt, int i10, int i11, int i12) {
            super.onPhyRead(bluetoothGatt, i10, i11, i12);
            String address = bluetoothGatt.getDevice().getAddress();
            ge.b.d(String.format(Locale.US, "<< onPhyRead(%s) %s: txPhy=%d, rxPhy=%d", p.b.m(address), b0.c.r(i12), Integer.valueOf(i10), Integer.valueOf(i11)));
            List<yd.a> list = c.this.f28037g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            for (yd.a aVar : list) {
                aVar.getClass();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onPhyUpdate(BluetoothGatt bluetoothGatt, int i10, int i11, int i12) {
            super.onPhyUpdate(bluetoothGatt, i10, i11, i12);
            String address = bluetoothGatt.getDevice().getAddress();
            ge.b.d(String.format(Locale.US, ">> onPhyUpdate(%s) %s: txPhy=%d, rxPhy=%d", p.b.m(address), b0.c.r(i12), Integer.valueOf(i10), Integer.valueOf(i11)));
            List<yd.a> list = c.this.f28037g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            for (yd.a aVar : list) {
                aVar.g();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i10, int i11) {
            super.onReadRemoteRssi(bluetoothGatt, i10, i11);
            if (c.this.f28031a) {
                ge.b.n(String.format(Locale.US, "onReadRemoteRssi(%s):rssi=%d, status=%d", p.b.m(bluetoothGatt.getDevice().getAddress()), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i10) {
            super.onReliableWriteCompleted(bluetoothGatt, i10);
            if (c.this.f28031a) {
                ge.b.n(String.format(Locale.US, "onReliableWriteCompleted(%s):status=%d", p.b.m(bluetoothGatt.getDevice().getAddress()), Integer.valueOf(i10)));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onServiceChanged(BluetoothGatt bluetoothGatt) {
            super.onServiceChanged(bluetoothGatt);
            String address = bluetoothGatt.getDevice().getAddress();
            if (c.this.f28031a) {
                ge.b.n(String.format("onServiceChanged(%s)", p.b.m(address)));
            }
            List<yd.a> list = c.this.f28037g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            for (yd.a aVar : list) {
                aVar.getClass();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i10) {
            String address = bluetoothGatt.getDevice().getAddress();
            ge.b.d(String.format(Locale.US, ">> onServicesDiscovered(%s), status=%s", p.b.m(address), b0.c.r(i10)));
            int i11 = c.f28030l;
            List<yd.a> list = c.this.f28037g.get(address);
            if (list == null || list.size() <= 0) {
                return;
            }
            for (yd.a aVar : list) {
                aVar.h(bluetoothGatt, i10);
            }
        }
    }

    static {
        UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    }

    public c(Context context) {
        String str;
        this.f28031a = false;
        this.f28032b = false;
        a aVar = new a();
        this.f28040j = context;
        this.f28036f = new HashMap<>();
        this.f28038h = new HashMap<>();
        this.f28037g = new HashMap<>();
        this.f28035e = new CopyOnWriteArrayList();
        this.f28031a = rd.b.f25539b;
        this.f28032b = rd.b.f25540c;
        if (this.f28033c == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
            this.f28033c = bluetoothManager;
            if (bluetoothManager == null) {
                str = "BLUETOOTH_SERVICE not supported.";
                ge.b.p(str);
                return;
            }
        }
        if (this.f28034d == null) {
            BluetoothAdapter a10 = sd.a.a(context);
            this.f28034d = a10;
            if (a10 == null) {
                str = "BluetoothAdapter is not supported";
                ge.b.p(str);
                return;
            }
        }
        d dVar = d.f29213g;
        this.f28041k = dVar;
        if (dVar == null) {
            d.b(context);
            this.f28041k = d.f29213g;
        }
        d dVar2 = this.f28041k;
        if (dVar2 != null) {
            dVar2.a(aVar);
        } else {
            ge.b.p("BluetoothProfileManager not initialized");
        }
        ge.b.d("initialize success");
    }

    public static boolean h(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        if (Build.VERSION.SDK_INT >= 33) {
            return bluetoothGatt.writeDescriptor(bluetoothGattDescriptor, bArr) == 0;
        }
        bluetoothGattDescriptor.setValue(bArr);
        return bluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
    }

    public final void a(String str) {
        if (str == null) {
            return;
        }
        BluetoothGatt bluetoothGatt = this.f28036f.get(str);
        if (bluetoothGatt != null) {
            if (e(str)) {
                if (this.f28031a) {
                    ge.b.n("disconnect : ".concat(str));
                }
                bluetoothGatt.disconnect();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused) {
                }
            }
            if (this.f28032b) {
                ge.b.n("closeGatt, addr:=" + p.b.m(str));
            }
            bluetoothGatt.close();
            this.f28036f.remove(str);
        }
        HashMap<String, List<yd.a>> hashMap = this.f28037g;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f28035e;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.contains(str)) {
            return;
        }
        this.f28035e.remove(str);
    }

    public final synchronized void b(String str, boolean z10) {
        BluetoothGatt bluetoothGatt;
        if (str == null) {
            ge.b.e("Invalid address", this.f28031a);
            return;
        }
        HashMap<String, BluetoothGatt> hashMap = this.f28036f;
        if (hashMap != null) {
            if (z10 && (bluetoothGatt = hashMap.get(str)) != null) {
                if (this.f28032b) {
                    ge.b.n("closeGatt, addr=" + p.b.m(str));
                }
                bluetoothGatt.close();
            }
            this.f28036f.remove(str);
        }
        HashMap<String, List<yd.a>> hashMap2 = this.f28037g;
        if (hashMap2 != null) {
            hashMap2.remove(str);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f28035e;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(str);
        }
    }

    public final boolean c(String str, yd.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        return d(str, aVar);
    }

    public final boolean d(String str, yd.a aVar) {
        BluetoothGatt connectGatt;
        BluetoothGatt bluetoothGatt;
        String str2;
        BluetoothAdapter bluetoothAdapter = this.f28034d;
        if (bluetoothAdapter == null) {
            str2 = "BluetoothAdapter not initialized";
        } else if (str == null) {
            str2 = "unspecified address.";
        } else {
            BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
            if (remoteDevice == null) {
                str2 = "Device not found.  Unable to connect.";
            } else {
                if (this.f28035e.contains(str) && (bluetoothGatt = this.f28036f.get(str)) != null) {
                    if (e(str)) {
                        if (this.f28031a) {
                            ge.b.n(p.b.m(str) + " already connected");
                        }
                        f(str, aVar);
                        if (aVar != null) {
                            aVar.d(bluetoothGatt, 0, 2);
                        }
                        return true;
                    }
                    synchronized (this) {
                        b(str, true);
                    }
                }
                if (this.f28031a) {
                    ge.b.n("create connection to " + p.b.m(str));
                }
                f(str, aVar);
                this.f28038h.put(str, 1);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    connectGatt = remoteDevice.connectGatt(this.f28040j, false, new b(), 2, 1);
                } else if (i10 >= 23) {
                    connectGatt = remoteDevice.connectGatt(this.f28040j, false, new b(), 2);
                } else {
                    connectGatt = remoteDevice.connectGatt(this.f28040j, false, new b());
                }
                if (connectGatt == null) {
                    ge.b.d("BluetoothGatt not exist.  Unable to connect.");
                    this.f28038h.put(str, 0);
                    synchronized (this) {
                        b(str, true);
                    }
                    return false;
                }
                this.f28036f.put(str, connectGatt);
                if (!this.f28035e.contains(str)) {
                    this.f28035e.add(str);
                }
                return true;
            }
        }
        ge.b.p(str2);
        return false;
    }

    public final boolean e(String str) {
        Integer num = this.f28038h.get(str);
        return num != null && num.intValue() == 2;
    }

    public final synchronized void f(String str, yd.a aVar) {
        List<yd.a> list;
        HashMap<String, List<yd.a>> hashMap = this.f28037g;
        if (hashMap != null) {
            list = hashMap.get(str);
        } else {
            list = null;
        }
        if (list == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.add(aVar);
            this.f28037g.put(str, copyOnWriteArrayList);
            return;
        }
        if (!list.contains(aVar)) {
            list.add(aVar);
            this.f28037g.put(str, list);
        }
    }

    public final synchronized void g(String str, yd.a aVar) {
        List<yd.a> list;
        HashMap<String, List<yd.a>> hashMap = this.f28037g;
        if (hashMap != null) {
            list = hashMap.get(str);
        } else {
            list = null;
        }
        if (list == null) {
            if (this.f28031a) {
                ge.b.n("callback not registered, addr= " + p.b.m(str));
            }
            return;
        }
        if (list.contains(aVar)) {
            list.remove(aVar);
            this.f28037g.put(str, list);
        }
    }
}
