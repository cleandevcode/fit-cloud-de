package pc;

import a0.a2;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.support.v4.media.d;
import com.polidea.rxandroidble3.internal.RxBleLog;
import java.util.UUID;
import qc.y;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final char[] f24007a = "0123456789ABCDEF".toCharArray();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final UUID f24008a;

        /* renamed from: b */
        public final byte[] f24009b;

        /* renamed from: c */
        public final boolean f24010c;

        public a(UUID uuid, byte[] bArr, boolean z10) {
            this.f24008a = uuid;
            this.f24009b = bArr;
            this.f24010c = z10;
        }

        public final String toString() {
            String str;
            StringBuilder a10 = d.a("[uuid='");
            a10.append(b.d(this.f24008a));
            if (this.f24010c) {
                StringBuilder a11 = d.a("', hexValue=");
                a11.append(b.a(this.f24009b));
                str = a11.toString();
            } else {
                str = "'";
            }
            return a2.a(a10, str, ']');
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        if (RxBleLog.getShouldLogAttributeValues()) {
            int length = bArr.length;
            if (length == 0) {
                return "[]";
            }
            int i10 = length - 1;
            int i11 = (i10 * 2) + (length * 2) + 2;
            char[] cArr = new char[i11];
            for (int i12 = 0; i12 < length; i12++) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 * 2;
                int i15 = i14 + 1 + i14;
                char[] cArr2 = f24007a;
                cArr[i15] = cArr2[i13 >>> 4];
                cArr[i15 + 1] = cArr2[i13 & 15];
            }
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = i16 * 2;
                int i18 = i17 + 1 + i17 + 2;
                cArr[i18] = ',';
                cArr[i18 + 1] = ' ';
            }
            cArr[0] = '[';
            cArr[i11 - 1] = ']';
            return new String(cArr);
        }
        return "[...]";
    }

    public static String b(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt == null ? "MAC=null" : c(bluetoothGatt.getDevice().getAddress());
    }

    public static String c(String str) {
        if (str == null) {
            return "MAC=null";
        }
        int macAddressLogSetting = RxBleLog.getMacAddressLogSetting();
        if (macAddressLogSetting == 3) {
            str = str.substring(0, 15) + "XX";
        } else if (macAddressLogSetting == Integer.MAX_VALUE) {
            str = "XX:XX:XX:XX:XX:XX";
        }
        return String.format("MAC='%s'", str);
    }

    public static String d(UUID uuid) {
        return RxBleLog.getUuidLogSetting() == 2 ? uuid.toString() : "...";
    }

    public static void e(String str, BluetoothGatt bluetoothGatt, int i10) {
        if (RxBleLog.isAtLeast(4)) {
            RxBleLog.i(b(bluetoothGatt) + " %24s(), status=%d", str, Integer.valueOf(i10));
        }
    }

    public static void f(String str, BluetoothGatt bluetoothGatt, int i10, int i11) {
        if (RxBleLog.isAtLeast(4)) {
            RxBleLog.i(b(bluetoothGatt) + " %24s(), status=%d, value=%s", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    public static void g(String str, BluetoothGatt bluetoothGatt, int i10, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z10) {
        if (RxBleLog.isAtLeast(4)) {
            a aVar = new a(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), z10);
            RxBleLog.i(b(bluetoothGatt) + " %24s(), status=%d, value=%s", str, Integer.valueOf(i10), aVar);
        }
    }

    public static void h(String str, BluetoothGatt bluetoothGatt, int i10, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z10) {
        if (RxBleLog.isAtLeast(4)) {
            a aVar = new a(bluetoothGattDescriptor.getUuid(), bluetoothGattDescriptor.getValue(), z10);
            RxBleLog.i(b(bluetoothGatt) + " %24s(), status=%d, value=%s", str, Integer.valueOf(i10), aVar);
        }
    }

    public static void i(y yVar, long j10, long j11) {
        if (RxBleLog.isAtLeast(3)) {
            RxBleLog.d("FINISHED %s(%d) in %d ms", yVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(yVar)), Long.valueOf(j11 - j10));
        }
    }

    public static void j(y yVar) {
        if (RxBleLog.isAtLeast(3)) {
            RxBleLog.d("QUEUED   %s(%d)", yVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(yVar)));
        }
    }

    public static void k(y yVar) {
        if (RxBleLog.isAtLeast(3)) {
            RxBleLog.d("REMOVED  %s(%d)", yVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(yVar)));
        }
    }

    public static void l(y yVar) {
        if (RxBleLog.isAtLeast(3)) {
            RxBleLog.d("STARTED  %s(%d)", yVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(yVar)));
        }
    }
}
