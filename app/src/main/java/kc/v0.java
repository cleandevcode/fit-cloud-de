package kc;

import a0.a2;
import android.bluetooth.BluetoothGattCharacteristic;

/* loaded from: classes.dex */
public interface v0 {

    /* loaded from: classes.dex */
    public interface a {
        oc.i0 a(int i10);

        oc.i0 b(BluetoothGattCharacteristic bluetoothGattCharacteristic);

        tk.i<byte[]> build();

        oc.i0 c(byte[] bArr);
    }

    /* loaded from: classes.dex */
    public enum b {
        CONNECTING("CONNECTING"),
        CONNECTED("CONNECTED"),
        DISCONNECTED("DISCONNECTED"),
        DISCONNECTING("DISCONNECTING");
        

        /* renamed from: a */
        public final String f18420a;

        b(String str) {
            this.f18420a = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return a2.a(android.support.v4.media.d.a("RxBleConnectionState{"), this.f18420a, '}');
        }
    }

    /* loaded from: classes.dex */
    public interface c extends tk.m<Boolean, Boolean> {
    }

    /* loaded from: classes.dex */
    public interface d extends tk.m<a, a> {

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            public final int f18421a;

            /* renamed from: b */
            public final lc.l f18422b;

            public a(int i10, lc.l lVar) {
                this.f18421a = i10;
                this.f18422b = lVar;
            }
        }
    }

    int a();

    tk.p<y0> b();

    a c();

    fl.q d(int i10);

    fl.q e(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr);

    tk.i f(BluetoothGattCharacteristic bluetoothGattCharacteristic);
}
