package fe;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import be.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

@TargetApi(21)
/* loaded from: classes.dex */
public final class j extends fe.a {

    /* renamed from: g */
    public BluetoothLeScanner f14247g;

    /* renamed from: h */
    public final a f14248h;

    /* loaded from: classes.dex */
    public class a extends ScanCallback {
        public a() {
            j.this = r1;
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onBatchScanResults(List<ScanResult> list) {
            super.onBatchScanResults(list);
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onScanFailed(int i10) {
            super.onScanFailed(i10);
            boolean z10 = j.this.f14238a;
            ge.b.q("scan failed with " + i10, z10);
            j jVar = j.this;
            c.a aVar = jVar.f14243f;
            if (aVar == null) {
                ge.b.o("no listeners register", jVar.f14239b);
                return;
            }
            boolean z11 = be.c.this.f13584b;
            ge.b.o("onLeScanFailed:" + i10, z11);
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onScanResult(int i10, ScanResult scanResult) {
            byte[] bArr;
            boolean isConnectable;
            boolean isLegacy;
            int primaryPhy;
            int secondaryPhy;
            int advertisingSid;
            int txPower;
            int periodicAdvertisingInterval;
            String str;
            List serviceSolicitationUuids;
            boolean isConnectable2;
            super.onScanResult(i10, scanResult);
            j jVar = j.this;
            if (!jVar.f14241d) {
                ge.b.n("scan procedure has already been stopped, ignore.");
                j.this.a();
                return;
            }
            be.d dVar = jVar.f14242e;
            if (dVar != null && dVar.f4169m && Build.VERSION.SDK_INT >= 26) {
                isConnectable2 = scanResult.isConnectable();
                if (!isConnectable2) {
                    if (j.this.f14239b) {
                        ge.b.n("ignore non-connectable device");
                        return;
                    }
                    return;
                }
            }
            if (j.this.f14239b) {
                StringBuilder sb2 = new StringBuilder("ScanResult {");
                BluetoothDevice device = scanResult.getDevice();
                if (device != null) {
                    sb2.append(String.format("\n\t%s", p.b.k(device)));
                }
                if (scanResult.getScanRecord() != null) {
                    sb2.append("\n\tscanRecord=");
                    ScanRecord scanRecord = scanResult.getScanRecord();
                    StringBuilder sb3 = new StringBuilder("scanRecord{");
                    int i11 = Build.VERSION.SDK_INT;
                    Locale locale = Locale.US;
                    sb3.append(String.format(locale, "\n\tmAdvertiseFlags=0x%04X", Integer.valueOf(scanRecord.getAdvertiseFlags())));
                    sb3.append(String.format(locale, "\n\tmManufacturerSpecificData=%s", b.a(scanRecord.getManufacturerSpecificData())));
                    sb3.append(String.format(locale, "\n\tserviceData=%s", b.b(scanRecord.getServiceData())));
                    Object[] objArr = new Object[1];
                    List<ParcelUuid> serviceUuids = scanRecord.getServiceUuids();
                    String str2 = "";
                    if (serviceUuids == null || serviceUuids.size() <= 0) {
                        str = "";
                    } else {
                        StringBuilder sb4 = new StringBuilder("supported features (UUIDs)");
                        Iterator<ParcelUuid> it = serviceUuids.iterator();
                        while (it.hasNext()) {
                            sb4.append("\n\t" + it.next().toString());
                        }
                        str = sb4.toString();
                    }
                    objArr[0] = str;
                    sb3.append(String.format(locale, "\n\tserviceUuids=%s", objArr));
                    sb3.append(String.format(locale, "\n\tmDeviceName=%s", scanRecord.getDeviceName()));
                    if (i11 >= 29) {
                        Locale locale2 = Locale.US;
                        Object[] objArr2 = new Object[1];
                        serviceSolicitationUuids = scanRecord.getServiceSolicitationUuids();
                        if (serviceSolicitationUuids != null && serviceSolicitationUuids.size() > 0) {
                            StringBuilder sb5 = new StringBuilder("supported features (UUIDs)");
                            Iterator it2 = serviceSolicitationUuids.iterator();
                            while (it2.hasNext()) {
                                sb5.append("\n\t" + ((ParcelUuid) it2.next()).toString());
                            }
                            str2 = sb5.toString();
                        }
                        objArr2[0] = str2;
                        sb3.append(String.format(locale2, "\n\tserviceSolicitationUuids=%s", objArr2));
                    }
                    sb3.append("\n}");
                    sb2.append(sb3.toString());
                }
                sb2.append("\n\trssi=");
                sb2.append(scanResult.getRssi());
                sb2.append("\n\ttimestampNanos=");
                sb2.append(scanResult.getTimestampNanos());
                if (Build.VERSION.SDK_INT >= 26) {
                    sb2.append("\n\tisConnectable=");
                    isConnectable = scanResult.isConnectable();
                    sb2.append(isConnectable);
                    sb2.append("\n\tisLegacy=");
                    isLegacy = scanResult.isLegacy();
                    sb2.append(isLegacy);
                    Locale locale3 = Locale.US;
                    primaryPhy = scanResult.getPrimaryPhy();
                    secondaryPhy = scanResult.getSecondaryPhy();
                    sb2.append(String.format(locale3, "\n\tprimaryPhy=%d,secondaryPhy=%d", Integer.valueOf(primaryPhy), Integer.valueOf(secondaryPhy)));
                    sb2.append("\n\tadvertisingSid=");
                    advertisingSid = scanResult.getAdvertisingSid();
                    sb2.append(advertisingSid);
                    sb2.append("\n\ttxPower=");
                    txPower = scanResult.getTxPower();
                    sb2.append(txPower);
                    sb2.append("\n\tperiodicAdvertisingInterval=");
                    periodicAdvertisingInterval = scanResult.getPeriodicAdvertisingInterval();
                    sb2.append(periodicAdvertisingInterval);
                }
                sb2.append("\n}");
                ge.b.n(sb2.toString());
            }
            ScanRecord scanRecord2 = scanResult.getScanRecord();
            j jVar2 = j.this;
            BluetoothDevice device2 = scanResult.getDevice();
            int rssi = scanResult.getRssi();
            if (scanRecord2 != null) {
                bArr = scanRecord2.getBytes();
            } else {
                bArr = new byte[0];
            }
            c.a aVar = jVar2.f14243f;
            if (aVar != null) {
                be.c.this.c(device2, rssi, bArr);
            } else {
                ge.b.o("no listeners register", jVar2.f14239b);
            }
        }
    }

    public j(Context context) {
        super(context);
        this.f14248h = new a();
        ge.b.o("LeScannerV21 init", this.f14239b);
        BluetoothAdapter bluetoothAdapter = this.f14240c;
        if (bluetoothAdapter != null) {
            this.f14247g = bluetoothAdapter.getBluetoothLeScanner();
        }
        if (this.f14247g == null) {
            ge.b.d("mBluetoothLeScanner == null");
        }
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
        } else if (this.f14247g == null) {
            str = "BluetoothLeScanner has not been initialized";
        } else {
            try {
                ge.b.n("stop LE Scan");
                this.f14247g.stopScan(this.f14248h);
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
        boolean z10;
        ScanSettings.Builder phy;
        BluetoothAdapter bluetoothAdapter = this.f14240c;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            ge.b.o("LeScanner--startScan", this.f14239b);
            if (this.f14243f == null) {
                ge.b.o("no listeners register", this.f14239b);
            }
            this.f14241d = true;
            this.f14242e = dVar;
            z10 = true;
        } else {
            ge.b.p("BT Adapter is not turned ON");
            z10 = false;
        }
        if (!z10) {
            ge.b.p("startScan failed");
            return false;
        }
        if (this.f14247g == null) {
            ge.b.d("getBluetoothLeScanner...");
            this.f14247g = this.f14240c.getBluetoothLeScanner();
        }
        if (this.f14247g == null) {
            ge.b.p("mBluetoothLeScanner is null");
            a();
            return false;
        }
        ArrayList arrayList = new ArrayList();
        List<ce.a> list = dVar.f4172p;
        if (list != null && list.size() > 0) {
            boolean z11 = this.f14239b;
            ge.b.o("contains " + list.size() + " filters", z11);
            for (ce.a aVar : list) {
                ScanFilter.Builder builder = new ScanFilter.Builder();
                builder.setServiceUuid(aVar.f4620e).setDeviceAddress(aVar.f4617b).setDeviceName(aVar.f4616a).setManufacturerData(aVar.f4627l, aVar.f4628m, aVar.f4629n);
                ParcelUuid parcelUuid = aVar.f4624i;
                if (parcelUuid != null) {
                    builder.setServiceData(parcelUuid, aVar.f4625j);
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    builder.setServiceSolicitationUuid(aVar.f4622g);
                }
                arrayList.add(builder.build());
                ge.b.o(aVar.toString(), this.f14239b);
            }
        }
        ScanSettings.Builder scanMode = new ScanSettings.Builder().setScanMode(2);
        if (Build.VERSION.SDK_INT >= 26) {
            phy = scanMode.setPhy(dVar.f4168l);
            phy.setLegacy(false);
        }
        try {
            this.f14247g.startScan(arrayList, scanMode.build(), this.f14248h);
            return true;
        } catch (Exception e10) {
            ge.b.p(e10.toString());
            return false;
        }
    }
}
