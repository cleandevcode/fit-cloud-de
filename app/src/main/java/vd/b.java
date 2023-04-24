package vd;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothHealth;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: l */
    public static b f29198l;

    /* renamed from: a */
    public final boolean f29199a;

    /* renamed from: b */
    public final boolean f29200b;

    /* renamed from: c */
    public final Context f29201c;

    /* renamed from: d */
    public CopyOnWriteArrayList f29202d;

    /* renamed from: e */
    public BluetoothAdapter f29203e;

    /* renamed from: j */
    public a f29208j;

    /* renamed from: f */
    public BluetoothHeadset f29204f = null;

    /* renamed from: g */
    public BluetoothA2dp f29205g = null;

    /* renamed from: h */
    public BluetoothProfile f29206h = null;

    /* renamed from: i */
    public BluetoothProfile f29207i = null;

    /* renamed from: k */
    public final C0529b f29209k = new C0529b();

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
            b.this = r1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.content.BroadcastReceiver
        @TargetApi(19)
        public final void onReceive(Context context, Intent intent) {
            char c10;
            b bVar;
            String str;
            String action = intent.getAction();
            action.getClass();
            switch (action.hashCode()) {
                case -1435586571:
                    if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1021360715:
                    if (action.equals("android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -855499628:
                    if (action.equals("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 545516589:
                    if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1244161670:
                    if (action.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1772843706:
                    if (action.equals("android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 == 0) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice == null) {
                    return;
                }
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                ge.b.e(String.format(Locale.US, "%s: action=%s, state: %d->%d", p.b.m(bluetoothDevice.getAddress()), action, Integer.valueOf(intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1)), Integer.valueOf(intExtra)), b.this.f29199a);
                CopyOnWriteArrayList copyOnWriteArrayList = b.this.f29202d;
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    Iterator it = b.this.f29202d.iterator();
                    while (it.hasNext()) {
                        ((vd.a) it.next()).getClass();
                    }
                    return;
                }
            } else if (c10 == 1) {
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                if (bluetoothDevice2 == null) {
                    return;
                }
                ge.b.e(String.format(Locale.US, "%s: action=%s, state: %d->%d", p.b.m(bluetoothDevice2.getAddress()), action, Integer.valueOf(intExtra3), Integer.valueOf(intExtra2)), b.this.f29199a);
                CopyOnWriteArrayList copyOnWriteArrayList2 = b.this.f29202d;
                if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                    Iterator it2 = b.this.f29202d.iterator();
                    while (it2.hasNext()) {
                        ((vd.a) it2.next()).c(intExtra2, bluetoothDevice2);
                    }
                    return;
                }
            } else if (c10 == 2) {
                BluetoothDevice bluetoothDevice3 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                int intExtra4 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                int intExtra5 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                if (bluetoothDevice3 == null) {
                    return;
                }
                ge.b.e(String.format(Locale.US, "%s: action=%s, state: %d->%d", p.b.m(bluetoothDevice3.getAddress()), action, Integer.valueOf(intExtra5), Integer.valueOf(intExtra4)), b.this.f29199a);
                CopyOnWriteArrayList copyOnWriteArrayList3 = b.this.f29202d;
                if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                    Iterator it3 = b.this.f29202d.iterator();
                    while (it3.hasNext()) {
                        ((vd.a) it3.next()).getClass();
                    }
                    return;
                }
            } else if (c10 == 3) {
                BluetoothDevice bluetoothDevice4 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                int intExtra6 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                int intExtra7 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                if (bluetoothDevice4 == null) {
                    return;
                }
                ge.b.e(String.format(Locale.US, "action=%s, device:%s, state: %d->%d", action, p.b.m(bluetoothDevice4.getAddress()), Integer.valueOf(intExtra7), Integer.valueOf(intExtra6)), b.this.f29199a);
                CopyOnWriteArrayList copyOnWriteArrayList4 = b.this.f29202d;
                if (copyOnWriteArrayList4 != null && copyOnWriteArrayList4.size() > 0) {
                    Iterator it4 = b.this.f29202d.iterator();
                    while (it4.hasNext()) {
                        ((vd.a) it4.next()).b(intExtra6, bluetoothDevice4);
                    }
                    return;
                }
            } else if (c10 != 4) {
                if (c10 != 5) {
                    return;
                }
                bVar = b.this;
                bVar.getClass();
                if (((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) == null) {
                    str = "onVendorSpecificHeadsetEvent() remote device is null";
                } else if (intent.getStringExtra("android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_CMD") == null) {
                    str = "onVendorSpecificHeadsetEvent() command is null";
                } else {
                    int intExtra8 = intent.getIntExtra("android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_CMD_TYPE", -1);
                    if (intExtra8 == 0 && intExtra8 == 1 && intExtra8 == 2 && intExtra8 == 3 && intExtra8 == 4) {
                        Object[] objArr = (Object[]) intent.getExtras().get("android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_ARGS");
                        CopyOnWriteArrayList copyOnWriteArrayList5 = bVar.f29202d;
                        if (copyOnWriteArrayList5 != null && copyOnWriteArrayList5.size() > 0) {
                            Iterator it5 = bVar.f29202d.iterator();
                            while (it5.hasNext()) {
                                ((vd.a) it5.next()).getClass();
                            }
                            return;
                        }
                        ge.b.o("no callback registered", bVar.f29200b);
                    }
                    str = "onVendorSpecificHeadsetEvent() unknown command";
                }
                ge.b.n(str);
                return;
            } else {
                BluetoothDevice bluetoothDevice5 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                int intExtra9 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                int intExtra10 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                if (bluetoothDevice5 == null) {
                    return;
                }
                ge.b.e(String.format(Locale.US, "%s: action=%s, state: %d->%d", p.b.m(bluetoothDevice5.getAddress()), action, Integer.valueOf(intExtra10), Integer.valueOf(intExtra9)), b.this.f29199a);
                CopyOnWriteArrayList copyOnWriteArrayList6 = b.this.f29202d;
                if (copyOnWriteArrayList6 != null && copyOnWriteArrayList6.size() > 0) {
                    Iterator it6 = b.this.f29202d.iterator();
                    while (it6.hasNext()) {
                        ((vd.a) it6.next()).a(intExtra9, bluetoothDevice5);
                    }
                    return;
                }
            }
            bVar = b.this;
            ge.b.o("no callback registered", bVar.f29200b);
        }
    }

    /* renamed from: vd.b$b */
    /* loaded from: classes.dex */
    public class C0529b implements BluetoothProfile.ServiceListener {
        public C0529b() {
            b.this = r1;
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public final void onServiceConnected(int i10, BluetoothProfile bluetoothProfile) {
            ge.b.d(String.format("%s(%s) profile connected", p.b.v(i10), bluetoothProfile.getClass().getName()));
            if (i10 == 11) {
                b.this.f29207i = bluetoothProfile;
            } else if (i10 == 1) {
                b.this.f29204f = (BluetoothHeadset) bluetoothProfile;
            } else if (i10 == 2) {
                b.this.f29205g = (BluetoothA2dp) bluetoothProfile;
            } else if (i10 == 3) {
                BluetoothHealth bluetoothHealth = (BluetoothHealth) bluetoothProfile;
                b.this.getClass();
            } else if (i10 != 4) {
            } else {
                b.this.f29206h = bluetoothProfile;
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public final void onServiceDisconnected(int i10) {
            String v10 = p.b.v(i10);
            ge.b.d(v10 + " profile disconnected");
            if (i10 == 1) {
                b.this.f29204f = null;
            } else if (i10 == 2) {
                b.this.f29205g = null;
            } else if (i10 == 3) {
                b.this.getClass();
            } else if (i10 == 4) {
                b.this.f29206h = null;
            } else if (i10 == 11) {
                b.this.f29207i = null;
            }
        }
    }

    public b(Context context) {
        String str;
        this.f29199a = false;
        this.f29200b = false;
        this.f29208j = null;
        Context applicationContext = context.getApplicationContext();
        this.f29201c = applicationContext;
        this.f29199a = rd.b.f25539b;
        this.f29200b = rd.b.f25540c;
        if (applicationContext == null) {
            str = "not intialized";
        } else {
            if (this.f29203e == null) {
                BluetoothAdapter a10 = sd.a.a(applicationContext);
                this.f29203e = a10;
                str = a10 == null ? "Unable to obtain a BluetoothAdapter." : "Unable to obtain a BluetoothAdapter.";
            }
            if (this.f29203e == null) {
                ge.b.p("mBluetoothAdapter == null");
            } else {
                this.f29208j = new a();
                IntentFilter intentFilter = new IntentFilter();
                f(2);
                f(1);
                f(4);
                f(11);
                applicationContext.registerReceiver(this.f29208j, intentFilter);
            }
            this.f29208j = new a();
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter2.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
            intentFilter2.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter2.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            intentFilter2.addAction("android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT");
            intentFilter2.addAction("android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter2.addAction("android.bluetooth.a2dp-sink.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter2.addAction("android.bluetooth.a2dp-sink.profile.action.PLAYING_STATE_CHANGED");
            applicationContext.registerReceiver(this.f29208j, intentFilter2);
            return;
        }
        ge.b.p(str);
    }

    public static void g(Context context) {
        if (f29198l == null) {
            synchronized (b.class) {
                if (f29198l == null) {
                    f29198l = new b(context);
                }
            }
        }
    }

    public final void a(vd.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f29202d == null) {
            this.f29202d = new CopyOnWriteArrayList();
        }
        if (!this.f29202d.contains(aVar)) {
            this.f29202d.add(aVar);
        }
        boolean z10 = this.f29200b;
        ge.b.o("mManagerCallbacks.size=" + this.f29202d.size(), z10);
    }

    public final boolean b(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            ge.b.p("can't find remote device.");
            return false;
        }
        BluetoothA2dp bluetoothA2dp = this.f29205g;
        if (bluetoothA2dp == null) {
            ge.b.p("A2DP not initialized");
            f(2);
            return false;
        } else if (bluetoothA2dp.getConnectionState(bluetoothDevice) == 2) {
            ge.b.p("a2dp already connected");
            return true;
        } else {
            BluetoothAdapter bluetoothAdapter = this.f29203e;
            if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
                ge.b.p("BT not enabled");
                return false;
            }
            if (!ae.c.e(this.f29205g, bluetoothDevice)) {
                ge.b.o("setPriority failed", this.f29199a);
            }
            return ae.c.a(this.f29205g, bluetoothDevice);
        }
    }

    public final void c(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            ge.b.p("device is null");
            return;
        }
        BluetoothA2dp bluetoothA2dp = this.f29205g;
        if (bluetoothA2dp == null) {
            ge.b.p("A2DP not initialized");
            f(2);
        } else if (bluetoothA2dp.getConnectionState(bluetoothDevice) != 2) {
            ge.b.p("A2DP already disconnected");
        } else {
            if (!ae.c.e(this.f29205g, bluetoothDevice)) {
                ge.b.o("setPriority failed", this.f29199a);
            }
            ae.c.c(this.f29205g, bluetoothDevice);
        }
    }

    public final void d(String str) {
        BluetoothDevice remoteDevice = this.f29203e.getRemoteDevice(str);
        if (remoteDevice == null) {
            return;
        }
        BluetoothHeadset bluetoothHeadset = this.f29204f;
        if (bluetoothHeadset == null) {
            ge.b.p("BluetoothHeadset service is not connected");
            f(1);
        } else if (bluetoothHeadset.getConnectionState(remoteDevice) != 2) {
            ge.b.p("BluetoothHeadset profile is not connected");
        } else {
            ae.c.c(this.f29204f, remoteDevice);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(int r5, android.bluetooth.BluetoothDevice r6) {
        /*
            r4 = this;
            android.bluetooth.BluetoothAdapter r0 = r4.f29203e
            if (r0 == 0) goto L70
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto Lb
            goto L70
        Lb:
            r0 = 11
            r1 = 4
            r2 = 2
            r3 = 1
            if (r5 == r3) goto L19
            if (r5 == r2) goto L2a
            if (r5 == r1) goto L3b
            if (r5 == r0) goto L5b
            goto L6e
        L19:
            android.bluetooth.BluetoothHeadset r5 = r4.f29204f
            if (r5 == 0) goto L22
            int r5 = r5.getConnectionState(r6)
            return r5
        L22:
            java.lang.String r5 = "HEADSET profile not connected"
            ge.b.d(r5)
            r4.f(r3)
        L2a:
            android.bluetooth.BluetoothA2dp r5 = r4.f29205g
            if (r5 == 0) goto L33
            int r5 = r5.getConnectionState(r6)
            return r5
        L33:
            java.lang.String r5 = "A2DP profile not connected"
            ge.b.d(r5)
            r4.f(r2)
        L3b:
            android.bluetooth.BluetoothProfile r5 = r4.f29206h
            if (r5 == 0) goto L53
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L4c
            java.lang.String r0 = "android.bluetooth.BluetoothHidHost"
            int r5 = ae.c.d(r5, r0, r6)
            return r5
        L4c:
            java.lang.String r0 = "android.bluetooth.BluetoothInputDevice"
            int r5 = ae.c.d(r5, r0, r6)
            return r5
        L53:
            java.lang.String r5 = "HID_HOST profile not connected"
            ge.b.d(r5)
            r4.f(r1)
        L5b:
            android.bluetooth.BluetoothProfile r5 = r4.f29207i
            if (r5 == 0) goto L66
            java.lang.String r0 = "android.bluetooth.BluetoothA2dpSink"
            int r5 = ae.c.d(r5, r0, r6)
            return r5
        L66:
            java.lang.String r5 = "A2DP_SINK profile not connected"
            ge.b.d(r5)
            r4.f(r0)
        L6e:
            r5 = 0
            return r5
        L70:
            java.lang.String r5 = "BT not enabled"
            ge.b.d(r5)
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.b.e(int, android.bluetooth.BluetoothDevice):int");
    }

    public final void f(int i10) {
        try {
            if (!this.f29203e.getProfileProxy(this.f29201c, this.f29209k, i10)) {
                ge.b.p(String.format(Locale.US, "getProfileProxy %d failed", Integer.valueOf(i10)));
            } else if (this.f29200b) {
                ge.b.n(String.format(Locale.US, "getProfileProxy %d success", Integer.valueOf(i10)));
            }
        } catch (Exception e10) {
            ge.b.p(String.format(Locale.US, "getProfileProxy %d exception: %s", Integer.valueOf(i10), e10.toString()));
        }
    }
}
