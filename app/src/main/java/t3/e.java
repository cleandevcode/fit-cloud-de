package t3;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import gm.j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e implements b4.a {

    /* renamed from: o */
    public static final Object f27534o = new Object();

    /* renamed from: a */
    public final Context f27535a;

    /* renamed from: b */
    public Handler f27536b;

    /* renamed from: c */
    public c4.a f27537c;

    /* renamed from: d */
    public int f27538d;

    /* renamed from: e */
    public byte[] f27539e;

    /* renamed from: f */
    public int f27540f;

    /* renamed from: g */
    public final UUID f27541g;

    /* renamed from: h */
    public final UUID f27542h;

    /* renamed from: i */
    public final UUID f27543i;

    /* renamed from: j */
    public BluetoothGattCharacteristic f27544j;

    /* renamed from: k */
    public BluetoothGattCharacteristic f27545k;

    /* renamed from: l */
    public boolean f27546l;

    /* renamed from: m */
    public int f27547m;

    /* renamed from: n */
    public int f27548n;

    /* loaded from: classes.dex */
    public class a extends BluetoothGattCallback {
        public a() {
            e.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
        @Override // android.bluetooth.BluetoothGattCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onCharacteristicChanged(android.bluetooth.BluetoothGatt r8, android.bluetooth.BluetoothGattCharacteristic r9) {
            /*
                Method dump skipped, instructions count: 358
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.e.a.onCharacteristicChanged(android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGattCharacteristic):void");
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i10);
            if (bluetoothGattCharacteristic.equals(e.this.f27545k)) {
                Object obj = e.f27534o;
                synchronized (obj) {
                    obj.notifyAll();
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i10, int i11) {
            int checkSelfPermission;
            super.onConnectionStateChange(bluetoothGatt, i10, i11);
            if (Build.VERSION.SDK_INT >= 31) {
                checkSelfPermission = e.this.f27535a.checkSelfPermission("android.permission.BLUETOOTH_CONNECT");
                if (checkSelfPermission != 0) {
                    e.this.getClass();
                    return;
                }
            }
            if (i10 == 0) {
                if (i11 == 2) {
                    e.this.getClass();
                    e.this.getClass();
                    throw null;
                } else if (i11 != 0) {
                    return;
                }
            }
            e.this.getClass();
            e.this.f27546l = false;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i10);
            Log.d("AliBtImpl", "onDescriptorWrite " + i10);
            if (bluetoothGattDescriptor.getCharacteristic().equals(e.this.f27544j)) {
                e eVar = e.this;
                eVar.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                byte[] bArr = new byte[7];
                bArr[0] = 0;
                x3.b.a(bArr, 4, 1);
                System.arraycopy(ByteBuffer.allocate(4).order(x3.b.f30193a).putInt(currentTimeMillis).array(), 0, bArr, 3, 4);
                eVar.d(bArr, 3);
                e.this.getClass();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i10, int i11) {
            Log.i("AliBtImpl", "onMtuCHANGE " + i10 + ", status " + i11);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i10) {
            int checkSelfPermission;
            super.onServicesDiscovered(bluetoothGatt, i10);
            Log.i("AliBtImpl", "onServiceDiscover " + i10);
            if (i10 == 0) {
                List<BluetoothGattService> services = bluetoothGatt.getServices();
                for (int i11 = 0; i11 < services.size(); i11++) {
                    if (services.get(i11).getUuid().equals(e.this.f27541g)) {
                        Log.d("AliBtImpl", "find target ride service");
                        List<BluetoothGattCharacteristic> characteristics = services.get(i11).getCharacteristics();
                        for (int i12 = 0; i12 < characteristics.size(); i12++) {
                            if (characteristics.get(i12).getUuid().equals(e.this.f27542h)) {
                                e.this.f27545k = characteristics.get(i12);
                                Log.d("AliBtImpl", "find target write ride characteristic");
                            }
                            if (characteristics.get(i12).getUuid().equals(e.this.f27543i)) {
                                e.this.f27544j = characteristics.get(i12);
                                Log.d("AliBtImpl", "find target notify ride characteristic");
                            }
                        }
                    }
                }
                e eVar = e.this;
                if (eVar.f27544j != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        checkSelfPermission = eVar.f27535a.checkSelfPermission("android.permission.BLUETOOTH_CONNECT");
                        if (checkSelfPermission != 0) {
                            return;
                        }
                    }
                    throw null;
                }
                Log.d("AliBtImpl", "uuid not found");
            }
            e.this.getClass();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Handler.Callback {
        public b() {
            e.this = r1;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                Object obj = e.f27534o;
                byte[] byteArray = message.getData().getByteArray("EXTRA_WRITE_DATA");
                BluetoothGattCharacteristic bluetoothGattCharacteristic = e.this.f27545k;
                if (bluetoothGattCharacteristic != null) {
                    bluetoothGattCharacteristic.setValue(byteArray);
                    e.this.f27545k.setWriteType(1);
                    e.this.getClass();
                    throw null;
                }
            } else {
                BluetoothGattCharacteristic bluetoothGattCharacteristic2 = e.this.f27545k;
                if (bluetoothGattCharacteristic2 != null) {
                    bluetoothGattCharacteristic2.setValue("0x23");
                    e.this.f27545k.setWriteType(1);
                    Log.i("AliBtImpl", "write to remote");
                    e.this.getClass();
                    throw null;
                }
            }
            Log.e("AliBtImpl", "mWriteRideCharacteristic is null");
            return false;
        }
    }

    public e(Context context) {
        int checkSelfPermission;
        new ArrayList();
        this.f27541g = UUID.fromString("00003803-0000-1000-8000-00805f9b34fb");
        this.f27542h = UUID.fromString("00004a03-0000-1000-8000-00805f9b34fb");
        this.f27543i = UUID.fromString("00004a03-0000-1000-8000-00805f9b34fb");
        this.f27546l = false;
        new a();
        this.f27548n = 244;
        this.f27535a = context;
        BluetoothAdapter adapter = ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        if (adapter.getState() == 12) {
            adapter.getBluetoothLeScanner();
        } else {
            if (Build.VERSION.SDK_INT >= 31) {
                checkSelfPermission = context.checkSelfPermission("android.permission.BLUETOOTH_SCAN");
                if (checkSelfPermission != 0) {
                    j.e("AliBtImpl", "no scan per mission...");
                    return;
                }
            }
            adapter.enable();
        }
        HandlerThread handlerThread = new HandlerThread("BleAPPMessage");
        handlerThread.start();
        this.f27536b = new Handler(handlerThread.getLooper(), new b());
    }

    @Override // b4.a
    public final void a(c4.a aVar) {
        this.f27537c = aVar;
    }

    @Override // b4.a
    public final void b(byte[] bArr, c4.g gVar) {
        if (!this.f27546l) {
            if (gVar != null) {
                gVar.b(0, "bt not connected...");
                return;
            }
            return;
        }
        try {
            if (bArr.length > 65535) {
                if (gVar != null) {
                    gVar.b(1, "data size too .... fucking large, out of 65535");
                    return;
                }
                return;
            }
            d(bArr, 2);
            if (gVar != null) {
                gVar.a();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            if (gVar != null) {
                gVar.b(2, e10.getMessage());
            }
        }
    }

    public final void c(byte[] bArr) {
        Message message = new Message();
        message.what = 2;
        Bundle bundle = new Bundle();
        bundle.putByteArray("EXTRA_WRITE_DATA", bArr);
        message.setData(bundle);
        this.f27536b.sendMessage(message);
    }

    public final void d(byte[] bArr, int i10) {
        StringBuilder a10 = android.support.v4.media.d.a("sendToSerial ");
        a10.append(bArr.length);
        Log.d("AliBtImpl", a10.toString());
        int length = bArr.length;
        int i11 = length + 4;
        if (i11 > 65535) {
            Log.e("AliBtImpl", "serial length over");
            return;
        }
        int i12 = this.f27548n;
        if (i11 <= i12) {
            byte[] bArr2 = new byte[i11];
            bArr2[0] = (byte) i10;
            bArr2[1] = 0;
            x3.b.a(bArr2, length, 2);
            System.arraycopy(bArr, 0, bArr2, 4, length);
            c(bArr2);
            return;
        }
        byte[] bArr3 = new byte[i12];
        byte b10 = (byte) i10;
        bArr3[0] = b10;
        bArr3[1] = 1;
        x3.b.a(bArr3, length, 2);
        System.arraycopy(bArr, 0, bArr3, 4, this.f27548n - 4);
        int i13 = (this.f27548n - 4) + 0;
        c(bArr3);
        while (i13 < length) {
            int i14 = length - i13;
            int i15 = this.f27548n;
            int i16 = (i15 - 4) + 2;
            if (i14 > i16) {
                byte[] bArr4 = new byte[i15];
                bArr4[0] = b10;
                bArr4[1] = 2;
                System.arraycopy(bArr, i13, bArr4, 2, i16);
                i13 += (this.f27548n - 4) + 2;
                c(bArr4);
            } else {
                byte[] bArr5 = new byte[(i14 + 4) - 2];
                bArr5[0] = b10;
                bArr5[1] = 3;
                System.arraycopy(bArr, i13, bArr5, 2, i14);
                c(bArr5);
                i13 = length;
            }
        }
    }
}
