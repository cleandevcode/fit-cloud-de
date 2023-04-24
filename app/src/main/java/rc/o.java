package rc;

import android.bluetooth.le.ScanResult;

/* loaded from: classes.dex */
public final class o implements k {
    @Override // rc.k
    public final int a(ScanResult scanResult) {
        boolean isConnectable;
        isConnectable = scanResult.isConnectable();
        return isConnectable ? 2 : 3;
    }
}
