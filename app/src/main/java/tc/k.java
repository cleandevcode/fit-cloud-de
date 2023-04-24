package tc;

import com.polidea.rxandroidble3.internal.RxBleLog;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public final int f27987a = 1;

    /* renamed from: b */
    public final int f27988b = 2;

    /* renamed from: c */
    public final int f27989c = 4;

    /* renamed from: d */
    public final int f27990d = 8;

    /* renamed from: e */
    public final int f27991e = 16;

    /* renamed from: f */
    public final int f27992f = 32;

    /* renamed from: g */
    public final int f27993g = 64;

    /* renamed from: h */
    public final int[] f27994h = {1, 2, 4, 8, 16, 32, 64};

    public final String a(int i10) {
        int[] iArr;
        boolean z10;
        String str;
        StringBuilder a10 = android.support.v4.media.d.a("[ ");
        for (int i11 : this.f27994h) {
            if ((i10 & i11) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i11 == this.f27988b) {
                    str = "READ";
                } else if (i11 == this.f27990d) {
                    str = "WRITE";
                } else if (i11 == this.f27989c) {
                    str = "WRITE_NO_RESPONSE";
                } else if (i11 == this.f27993g) {
                    str = "SIGNED_WRITE";
                } else if (i11 == this.f27992f) {
                    str = "INDICATE";
                } else if (i11 == this.f27987a) {
                    str = "BROADCAST";
                } else if (i11 == this.f27991e) {
                    str = "NOTIFY";
                } else if (i11 == 0) {
                    str = "";
                } else {
                    RxBleLog.e("Unknown property specified (%d)", Integer.valueOf(i11));
                    str = "UNKNOWN (" + i11 + " -> check android.bluetooth.BluetoothGattCharacteristic)";
                }
                a10.append(str);
                a10.append(" ");
            }
        }
        a10.append("]");
        return a10.toString();
    }
}
