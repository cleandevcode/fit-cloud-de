package tc;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e<T> {

    /* renamed from: a */
    public final T f27966a;

    /* renamed from: b */
    public final byte[] f27967b;

    public e(T t10, byte[] bArr) {
        this.f27966a = t10;
        this.f27967b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            return Arrays.equals(eVar.f27967b, this.f27967b) && eVar.f27966a.equals(this.f27966a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27966a.hashCode() ^ Arrays.hashCode(this.f27967b);
    }

    public final String toString() {
        String simpleName;
        StringBuilder sb2;
        String obj;
        UUID uuid;
        T t10 = this.f27966a;
        if (t10 instanceof BluetoothGattCharacteristic) {
            sb2 = new StringBuilder();
            sb2.append(BluetoothGattCharacteristic.class.getSimpleName());
            sb2.append("(");
            uuid = ((BluetoothGattCharacteristic) this.f27966a).getUuid();
        } else if (!(t10 instanceof BluetoothGattDescriptor)) {
            if (!(t10 instanceof UUID)) {
                simpleName = t10.getClass().getSimpleName();
                return e.class.getSimpleName() + "[first=" + simpleName + ", second=" + Arrays.toString(this.f27967b) + "]";
            }
            sb2 = new StringBuilder();
            sb2.append(UUID.class.getSimpleName());
            sb2.append("(");
            obj = this.f27966a.toString();
            sb2.append(obj);
            sb2.append(")");
            simpleName = sb2.toString();
            return e.class.getSimpleName() + "[first=" + simpleName + ", second=" + Arrays.toString(this.f27967b) + "]";
        } else {
            sb2 = new StringBuilder();
            sb2.append(BluetoothGattDescriptor.class.getSimpleName());
            sb2.append("(");
            uuid = ((BluetoothGattDescriptor) this.f27966a).getUuid();
        }
        obj = uuid.toString();
        sb2.append(obj);
        sb2.append(")");
        simpleName = sb2.toString();
        return e.class.getSimpleName() + "[first=" + simpleName + ", second=" + Arrays.toString(this.f27967b) + "]";
    }
}
