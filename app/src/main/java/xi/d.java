package xi;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.location.LocationManager;
import fl.k;
import gm.l;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kc.m0;
import kc.w0;
import p000do.a;
import ph.o;
import tk.i;
import wi.h;

/* loaded from: classes2.dex */
public final class d implements vi.b {

    /* renamed from: a */
    public final BluetoothManager f30597a;

    /* renamed from: b */
    public final BluetoothAdapter f30598b;

    /* renamed from: c */
    public final LocationManager f30599c;

    /* renamed from: d */
    public final i<Boolean> f30600d;

    /* renamed from: e */
    public final Set<String> f30601e;

    /* renamed from: f */
    public final Set<String> f30602f;

    public d(Application application) {
        BluetoothManager bluetoothManager;
        BluetoothAdapter bluetoothAdapter;
        l.f(application, "context");
        Object systemService = application.getSystemService("bluetooth");
        if (systemService instanceof BluetoothManager) {
            bluetoothManager = (BluetoothManager) systemService;
        } else {
            bluetoothManager = null;
        }
        this.f30597a = bluetoothManager;
        if (bluetoothManager != null) {
            bluetoothAdapter = bluetoothManager.getAdapter();
        } else {
            bluetoothAdapter = null;
        }
        this.f30598b = bluetoothAdapter;
        Object systemService2 = application.getSystemService("location");
        LocationManager locationManager = systemService2 instanceof LocationManager ? (LocationManager) systemService2 : null;
        this.f30599c = locationManager;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#EnvironmentHelper");
        bVar.h("bluetoothManager:%s", bluetoothManager);
        bVar.t("Fc#EnvironmentHelper");
        bVar.h("bluetoothAdapter:%s", bluetoothAdapter);
        bVar.t("Fc#EnvironmentHelper");
        bVar.h("locationManager:%s", locationManager);
        k kVar = new k(new m0(application).u(new h(1, b.f30595b)));
        this.f30600d = kVar;
        this.f30601e = Collections.synchronizedSet(new HashSet(5));
        this.f30602f = Collections.synchronizedSet(new HashSet(5));
        kVar.y(new o(6, new c(this)), yk.a.f31790e, yk.a.f31788c);
    }

    @Override // vi.b
    public final boolean a(w0 w0Var) {
        l.f(w0Var, "rxBleDevice");
        return this.f30601e.add(w0Var.c());
    }

    @Override // vi.b
    public final boolean b(w0 w0Var) {
        return this.f30601e.remove(w0Var.c());
    }

    @Override // vi.b
    public final void c(w0 w0Var) {
        this.f30602f.add(w0Var.c());
    }

    @Override // vi.b
    public final i<Boolean> d() {
        i<Boolean> iVar = this.f30600d;
        l.e(iVar, "adapterEnabledObservable");
        return iVar;
    }

    @Override // vi.b
    public final boolean e() {
        LocationManager locationManager = this.f30599c;
        if (locationManager == null) {
            return false;
        }
        return d1.g.a(locationManager);
    }

    @Override // vi.b
    public final boolean f() {
        return this.f30598b != null;
    }

    @Override // vi.b
    public final Set<BluetoothDevice> g() {
        BluetoothAdapter bluetoothAdapter = this.f30598b;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.getBondedDevices();
        }
        return null;
    }

    @Override // vi.b
    public final List<BluetoothDevice> getConnectedDevices() {
        BluetoothManager bluetoothManager = this.f30597a;
        if (bluetoothManager != null) {
            return bluetoothManager.getConnectedDevices(8);
        }
        return null;
    }

    @Override // vi.b
    public final boolean h(w0 w0Var) {
        l.f(w0Var, "rxBleDevice");
        return this.f30602f.contains(w0Var.c());
    }

    @Override // vi.b
    public final boolean i() {
        BluetoothAdapter bluetoothAdapter = this.f30598b;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    @Override // vi.b
    public final BluetoothAdapter j() {
        return this.f30598b;
    }
}
