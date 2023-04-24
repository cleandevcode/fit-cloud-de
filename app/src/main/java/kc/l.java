package kc;

import android.bluetooth.BluetoothGattDescriptor;

/* loaded from: classes.dex */
public final class l implements v3.c<byte[]> {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final l f18347a = new l();
    }

    @Override // w3.a
    public final Object get() {
        byte[] bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
        b0.c.j(bArr);
        return bArr;
    }
}
