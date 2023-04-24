package kc;

import android.bluetooth.BluetoothGattDescriptor;

/* loaded from: classes.dex */
public final class n implements v3.c<byte[]> {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final n f18359a = new n();
    }

    @Override // w3.a
    public final Object get() {
        byte[] bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
        b0.c.j(bArr);
        return bArr;
    }
}
