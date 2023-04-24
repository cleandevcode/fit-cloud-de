package fe;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.ParcelUuid;
import be.c;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@TargetApi(19)
/* loaded from: classes.dex */
public final class d extends fe.a {

    /* renamed from: g */
    public final a f14245g;

    /* loaded from: classes.dex */
    public class a implements BluetoothAdapter.LeScanCallback {
        public a() {
            d.this = r1;
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public final void onLeScan(BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
            d dVar = d.this;
            c.a aVar = dVar.f14243f;
            if (aVar != null) {
                be.c.this.c(bluetoothDevice, i10, bArr);
            } else {
                ge.b.o("no listeners register", dVar.f14239b);
            }
        }
    }

    public d(Context context) {
        super(context);
        this.f14245g = new a();
        ge.b.o("LeScannerV19 init", this.f14239b);
    }

    @Override // fe.a
    public final boolean a() {
        String str;
        c.a aVar = this.f14243f;
        if (aVar != null) {
            ge.b.o("onLeScanStop", be.c.this.f13584b);
            be.c.this.b(3);
        } else {
            ge.b.o("no listeners register", this.f14239b);
        }
        this.f14241d = false;
        BluetoothAdapter bluetoothAdapter = this.f14240c;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            str = "BT Adapter is not turned ON";
        } else {
            try {
                this.f14240c.stopLeScan(this.f14245g);
                return true;
            } catch (Exception e10) {
                str = e10.toString();
            }
        }
        ge.b.p(str);
        return false;
    }

    @Override // fe.a
    public final boolean b(be.d dVar) {
        BluetoothAdapter bluetoothAdapter = this.f14240c;
        boolean z10 = true;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            ge.b.o("LeScanner--startScan", this.f14239b);
            if (this.f14243f == null) {
                ge.b.o("no listeners register", this.f14239b);
            }
            this.f14241d = true;
            this.f14242e = dVar;
        } else {
            ge.b.p("BT Adapter is not turned ON");
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        UUID[] uuidArr = null;
        List<ce.a> list = dVar.f4172p;
        if (list != null && list.size() > 0) {
            boolean z11 = this.f14239b;
            ge.b.o("contains " + list.size() + " filters", z11);
            ArrayList arrayList = new ArrayList();
            for (ce.a aVar : list) {
                ge.b.n(aVar.toString());
                ParcelUuid parcelUuid = aVar.f4620e;
                if (parcelUuid != null) {
                    arrayList.add(parcelUuid);
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                uuidArr = new UUID[size];
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.get(i10) != null) {
                        uuidArr[i10] = ((ParcelUuid) arrayList.get(i10)).getUuid();
                    }
                }
            }
        }
        try {
            return this.f14240c.startLeScan(uuidArr, this.f14245g);
        } catch (Exception e10) {
            ge.b.p(e10.toString());
            return false;
        }
    }
}
