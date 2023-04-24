package lc;

/* loaded from: classes.dex */
public class l extends g {

    /* renamed from: a */
    public final m f19425a;

    public l() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(android.bluetooth.BluetoothGatt r6, int r7, lc.m r8) {
        /*
            r5 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = -1
            if (r7 != r3) goto L25
            java.lang.Object[] r7 = new java.lang.Object[r0]
            if (r6 == 0) goto L19
            android.bluetooth.BluetoothDevice r0 = r6.getDevice()
            if (r0 == 0) goto L19
            android.bluetooth.BluetoothDevice r6 = r6.getDevice()
            java.lang.String r6 = r6.getAddress()
            goto L1a
        L19:
            r6 = 0
        L1a:
            r7[r2] = r6
            r7[r1] = r8
            java.lang.String r6 = "GATT exception from MAC address %s, with type %s"
            java.lang.String r6 = java.lang.String.format(r6, r7)
            goto L5b
        L25:
            java.util.Map<java.lang.Integer, java.lang.String> r3 = vc.a.f29194a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L35
            java.lang.String r3 = "UNKNOWN"
        L35:
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r6 = pc.b.b(r6)
            r4[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r4[r1] = r6
            r4[r0] = r3
            r6 = 3
            r4[r6] = r8
            r6 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4[r6] = r7
            r6 = 5
            java.lang.String r7 = "https://cs.android.com/android/platform/superproject/+/master:packages/modules/Bluetooth/system/stack/include/gatt_api.h"
            r4[r6] = r7
            java.lang.String r6 = "GATT exception from %s, status %d (%s), type %s. (Look up status 0x%02x here %s)"
            java.lang.String r6 = java.lang.String.format(r6, r4)
        L5b:
            r5.<init>(r6)
            r5.f19425a = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lc.l.<init>(android.bluetooth.BluetoothGatt, int, lc.m):void");
    }
}
