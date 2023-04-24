package vd;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: g */
    public static d f29213g;

    /* renamed from: a */
    public final boolean f29214a;

    /* renamed from: b */
    public CopyOnWriteArrayList f29215b;

    /* renamed from: c */
    public BluetoothAdapter f29216c;

    /* renamed from: d */
    public a f29217d;

    /* renamed from: e */
    public final Object f29218e = new Object();

    /* renamed from: f */
    public final Object f29219f = new Object();

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
            d.this = r1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.content.BroadcastReceiver
        @TargetApi(19)
        public final void onReceive(Context context, Intent intent) {
            char c10;
            String str;
            String str2;
            String action = intent.getAction();
            action.getClass();
            switch (action.hashCode()) {
                case -1530327060:
                    if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -301431627:
                    if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -223687943:
                    if (action.equals("android.bluetooth.device.action.PAIRING_REQUEST")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1546533238:
                    if (action.equals("android.bluetooth.adapter.action.BLE_ACL_CONNECTED")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1652078734:
                    if (action.equals("android.bluetooth.adapter.action.BLE_ACL_DISCONNECTED")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1821585647:
                    if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2116862345:
                    if (action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    d dVar = d.this;
                    dVar.getClass();
                    String action2 = intent.getAction();
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                    ge.b.d(String.format(Locale.US, "action=%s, state: %d->%d", action2, Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1)), Integer.valueOf(intExtra)));
                    boolean z10 = dVar.f29214a;
                    switch (intExtra) {
                        case 10:
                            if (z10) {
                                ge.b.n("ACTION_STATE_CHANGED: STATE_OFF");
                            }
                            synchronized (dVar.f29219f) {
                                dVar.f29219f.notifyAll();
                            }
                            break;
                        case 11:
                            if (z10) {
                                str = "ACTION_STATE_CHANGED: STATE_TURNING_ON";
                                ge.b.n(str);
                                break;
                            }
                            break;
                        case 12:
                            if (z10) {
                                ge.b.n("ACTION_STATE_CHANGED: STATE_ON");
                            }
                            synchronized (dVar.f29218e) {
                                dVar.f29218e.notifyAll();
                            }
                            break;
                        case 13:
                            if (z10) {
                                str = "ACTION_STATE_CHANGED: STATE_TURNING_OFF";
                                ge.b.n(str);
                                break;
                            }
                            break;
                        default:
                            if (z10) {
                                str = "ACTION_STATE_CHANGED: " + intExtra;
                                ge.b.n(str);
                                break;
                            }
                            break;
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = dVar.f29215b;
                    if (copyOnWriteArrayList != null) {
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            ((e) it.next()).a(intExtra);
                        }
                        return;
                    }
                    return;
                case 1:
                    d dVar2 = d.this;
                    dVar2.getClass();
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice != null) {
                        if (dVar2.f29214a) {
                            ge.b.d(String.format(Locale.US, "%s: action=%s", p.b.m(bluetoothDevice.getAddress()), intent.getAction()));
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList2 = dVar2.f29215b;
                        if (copyOnWriteArrayList2 != null) {
                            Iterator it2 = copyOnWriteArrayList2.iterator();
                            while (it2.hasNext()) {
                                ((e) it2.next()).getClass();
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 2:
                    d dVar3 = d.this;
                    dVar3.getClass();
                    BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice2 != null) {
                        int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", 0);
                        if (dVar3.f29214a) {
                            ge.b.d(String.format(Locale.US, "%s: action=%s", p.b.m(bluetoothDevice2.getAddress()), intent.getAction()));
                            StringBuilder sb2 = new StringBuilder("android.bluetooth.device.extra.PAIRING_VARIANT>> ");
                            switch (intExtra2) {
                                case 0:
                                    str2 = "PAIRING_VARIANT_PIN";
                                    break;
                                case 1:
                                    str2 = "PAIRING_VARIANT_PASSKEY";
                                    break;
                                case 2:
                                    str2 = "PAIRING_VARIANT_PASSKEY_CONFIRMATION";
                                    break;
                                case 3:
                                    str2 = "PAIRING_VARIANT_CONSENT";
                                    break;
                                case 4:
                                    str2 = "PAIRING_VARIANT_DISPLAY_PASSKEY";
                                    break;
                                case 5:
                                    str2 = "PAIRING_VARIANT_DISPLAY_PIN";
                                    break;
                                case 6:
                                    str2 = "PAIRING_VARIANT_OOB_CONSENT";
                                    break;
                                default:
                                    str2 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                                    break;
                            }
                            sb2.append(str2);
                            sb2.append(" (");
                            sb2.append(intExtra2);
                            sb2.append(")");
                            ge.b.n(sb2.toString());
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList3 = dVar3.f29215b;
                        if (copyOnWriteArrayList3 != null) {
                            Iterator it3 = copyOnWriteArrayList3.iterator();
                            while (it3.hasNext()) {
                                ((e) it3.next()).getClass();
                            }
                        }
                        if (bluetoothDevice2.getBondState() == 12) {
                            ge.b.d("device already bonded: " + p.b.m(bluetoothDevice2.getAddress()));
                            return;
                        }
                        return;
                    }
                    return;
                case 3:
                    d dVar4 = d.this;
                    dVar4.getClass();
                    BluetoothDevice bluetoothDevice3 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice3 != null) {
                        if (dVar4.f29214a) {
                            ge.b.d(String.format(Locale.US, "%s: action=%s", p.b.m(bluetoothDevice3.getAddress()), intent.getAction()));
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList4 = dVar4.f29215b;
                        if (copyOnWriteArrayList4 != null) {
                            Iterator it4 = copyOnWriteArrayList4.iterator();
                            while (it4.hasNext()) {
                                ((e) it4.next()).getClass();
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 4:
                    d dVar5 = d.this;
                    dVar5.getClass();
                    BluetoothDevice bluetoothDevice4 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice4 != null) {
                        if (dVar5.f29214a) {
                            ge.b.d(String.format(Locale.US, "%s: action=%s", p.b.m(bluetoothDevice4.getAddress()), intent.getAction()));
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList5 = dVar5.f29215b;
                        if (copyOnWriteArrayList5 != null) {
                            Iterator it5 = copyOnWriteArrayList5.iterator();
                            while (it5.hasNext()) {
                                ((e) it5.next()).getClass();
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 5:
                    d dVar6 = d.this;
                    dVar6.getClass();
                    BluetoothDevice bluetoothDevice5 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice5 != null) {
                        if (dVar6.f29214a) {
                            ge.b.d(String.format(Locale.US, "%s: action=%s", p.b.m(bluetoothDevice5.getAddress()), intent.getAction()));
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList6 = dVar6.f29215b;
                        if (copyOnWriteArrayList6 != null) {
                            Iterator it6 = copyOnWriteArrayList6.iterator();
                            while (it6.hasNext()) {
                                ((e) it6.next()).getClass();
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 6:
                    d dVar7 = d.this;
                    dVar7.getClass();
                    BluetoothDevice bluetoothDevice6 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    int intExtra3 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
                    int intExtra4 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
                    int intExtra5 = intent.getIntExtra("android.bluetooth.device.extra.REASON", -1);
                    if (bluetoothDevice6 != null) {
                        ge.b.d(String.format(Locale.US, "%s: action=%s, bondState:%d->%d, reason=%d", p.b.m(bluetoothDevice6.getAddress()), intent.getAction(), Integer.valueOf(intExtra3), Integer.valueOf(intExtra4), Integer.valueOf(intExtra5)));
                        CopyOnWriteArrayList copyOnWriteArrayList7 = dVar7.f29215b;
                        if (copyOnWriteArrayList7 != null) {
                            Iterator it7 = copyOnWriteArrayList7.iterator();
                            while (it7.hasNext()) {
                                ((e) it7.next()).b(intExtra4, bluetoothDevice6);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    ge.b.d("action:".concat(action));
                    return;
            }
        }
    }

    public d(Context context) {
        String str;
        this.f29214a = false;
        this.f29217d = null;
        Context applicationContext = context.getApplicationContext();
        this.f29214a = rd.b.f25539b;
        if (applicationContext == null) {
            str = "not intialized";
        } else {
            if (this.f29216c == null) {
                BluetoothAdapter a10 = sd.a.a(applicationContext);
                this.f29216c = a10;
                if (a10 == null) {
                    str = "Unable to obtain a BluetoothAdapter.";
                }
            }
            if (this.f29216c != null) {
                this.f29217d = new a();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                intentFilter.addAction("android.bluetooth.adapter.action.BLE_ACL_CONNECTED");
                intentFilter.addAction("android.bluetooth.adapter.action.BLE_ACL_DISCONNECTED");
                intentFilter.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
                intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
                intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
                intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
                applicationContext.registerReceiver(this.f29217d, intentFilter);
                return;
            }
            str = "mBluetoothAdapter == null";
        }
        ge.b.p(str);
    }

    public static void b(Context context) {
        if (f29213g == null) {
            synchronized (d.class) {
                if (f29213g == null) {
                    f29213g = new d(context);
                }
            }
        }
    }

    public final void a(e eVar) {
        if (this.f29215b == null) {
            this.f29215b = new CopyOnWriteArrayList();
        }
        if (this.f29215b.contains(eVar)) {
            return;
        }
        this.f29215b.add(eVar);
    }
}
