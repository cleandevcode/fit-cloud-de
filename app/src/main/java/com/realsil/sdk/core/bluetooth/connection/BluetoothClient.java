package com.realsil.sdk.core.bluetooth.connection;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.annotation.Keep;
import ge.b;
import java.util.Locale;
import xd.a;

/* loaded from: classes.dex */
public class BluetoothClient {
    @Keep
    public BluetoothAdapter mBluetoothAdapter;
    @Keep
    public BluetoothManager mBluetoothManager;
    @Keep
    public a mCallback;
    @Keep
    public Context mContext;
    @Keep
    public boolean DBG = false;
    @Keep
    public boolean VDBG = false;
    @Keep
    public BluetoothDevice mDevice = null;
    @Keep
    public int mBondState = 10;

    /* renamed from: a */
    public int f9454a = 0;

    public final synchronized void a(int i10) {
        int i11 = this.f9454a;
        if (i10 != i11) {
            b.n(String.format(Locale.US, "connection sate changed: %d -> %d", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
        this.f9454a = i10;
        a aVar = this.mCallback;
        if (aVar != null) {
            aVar.a((zd.a) this, i10);
        } else {
            b.n("no channel callback");
        }
    }
}
