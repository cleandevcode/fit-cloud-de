package kc;

import android.bluetooth.BluetoothGattDescriptor;

/* loaded from: classes.dex */
public final class m implements v3.c<byte[]> {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final m f18350a = new m();
    }

    @Override // w3.a
    public final Object get() {
        byte[] bArr = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
        b0.c.j(bArr);
        return bArr;
    }
}
