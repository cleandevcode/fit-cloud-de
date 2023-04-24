package kc;

import android.bluetooth.BluetoothAdapter;

/* loaded from: classes.dex */
public final class c implements v3.c<BluetoothAdapter> {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final c f18267a = new c();
    }

    @Override // w3.a
    public final Object get() {
        return BluetoothAdapter.getDefaultAdapter();
    }
}
