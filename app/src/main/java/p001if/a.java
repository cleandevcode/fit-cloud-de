package p001if;

import ae.c;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import fl.g;
import ij.a0;
import java.util.Locale;
import p000do.a;
import p001if.c;
import vd.d;
import vd.e;
import ze.g;

/* renamed from: if.a */
/* loaded from: classes.dex */
public abstract class a extends c {

    /* renamed from: m */
    public BluetoothAdapter f16774m;

    /* renamed from: n */
    public vd.b f16775n;

    /* renamed from: o */
    public d f16776o;

    /* renamed from: p */
    public BluetoothDevice f16777p;

    /* renamed from: r */
    public String f16779r;

    /* renamed from: q */
    public int f16778q = 10;

    /* renamed from: s */
    public final C0295a f16780s = new C0295a();

    /* renamed from: t */
    public final b f16781t = new b();

    /* renamed from: if.a$a */
    /* loaded from: classes.dex */
    public class C0295a extends e {
        public C0295a() {
            a.this = r1;
        }

        @Override // vd.e
        public final void b(int i10, BluetoothDevice bluetoothDevice) {
            BluetoothProfile bluetoothProfile;
            String str;
            BluetoothDevice bluetoothDevice2 = a.this.f16777p;
            if (bluetoothDevice2 != null && bluetoothDevice2.equals(bluetoothDevice)) {
                e eVar = (e) a.this;
                switch (i10) {
                    case 10:
                        ge.b.o("BOND_NONE", eVar.f16793a);
                        if (eVar.f16802j == 533 && eVar.f16777p != null) {
                            ge.b.o("createBond", eVar.f16793a);
                            eVar.f16777p.createBond();
                            return;
                        }
                        return;
                    case 11:
                        ge.b.o("BOND_BONDING", eVar.f16793a);
                        return;
                    case 12:
                        ge.b.o("BOND_BONDED", eVar.f16793a);
                        if (eVar.f16802j == 532) {
                            if (eVar.f16777p != null) {
                                BluetoothDevice g10 = eVar.g(eVar.f16779r);
                                boolean z10 = false;
                                if (g10 != null && vd.b.f29198l.e(4, g10) == 2) {
                                    z10 = true;
                                }
                                boolean z11 = eVar.f16795c;
                                if (!z10) {
                                    ge.b.o("hid not connect", z11);
                                    eVar.e(529);
                                    vd.b bVar = vd.b.f29198l;
                                    BluetoothDevice bluetoothDevice3 = eVar.f16777p;
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        bluetoothProfile = bVar.f29206h;
                                        str = "android.bluetooth.BluetoothHidHost";
                                    } else {
                                        bluetoothProfile = bVar.f29206h;
                                        str = "android.bluetooth.BluetoothInputDevice";
                                    }
                                    c.b(bluetoothProfile, str, bluetoothDevice3);
                                    return;
                                }
                                ge.b.o("hid already connected", z11);
                                eVar.j(eVar.f16779r);
                                return;
                            }
                            return;
                        }
                        eVar.d();
                        return;
                    default:
                        eVar.getClass();
                        return;
                }
            }
            ge.b.o("bonded device not match with current device", a.this.f16795c);
        }
    }

    /* renamed from: if.a$b */
    /* loaded from: classes.dex */
    public class b extends lf.b {
        public b() {
            a.this = r1;
        }

        @Override // yb.y
        public final void A(g gVar) {
            int i10;
            a aVar = a.this;
            c.b bVar = aVar.f16800h;
            if (bVar != null) {
                a0.a aVar2 = (a0.a) bVar;
                if (gVar != null && aVar2.f17033f.f15508a != (i10 = gVar.f32318c)) {
                    a.b bVar2 = p000do.a.f13275a;
                    bVar2.t("Fc#DfuProcess8762C");
                    bVar2.p("onProcessStateChanged: " + i10, new Object[0]);
                    aVar2.f17033f.f15508a = i10;
                    ((g.a) aVar2.f17032e).d(new gj.g(i10, null));
                    return;
                }
                return;
            }
            ge.b.o("no callback registered", aVar.f16795c);
        }

        @Override // yb.y
        public final void B(int i10) {
            a aVar = a.this;
            aVar.getClass();
            c.b bVar = aVar.f16800h;
            if (bVar != null) {
                a0.a aVar2 = (a0.a) bVar;
                a.b bVar2 = p000do.a.f13275a;
                bVar2.t("Fc#DfuProcess8762C");
                bVar2.p("onProcessStateChanged: " + i10, new Object[0]);
                if (i10 != 258) {
                    if (i10 == 521) {
                        ((g.a) aVar2.f17032e).d(new gj.g(0, null));
                        return;
                    }
                    return;
                }
                ((g.a) aVar2.f17032e).d(new gj.g(100, Boolean.TRUE));
                ((g.a) aVar2.f17032e).b();
                return;
            }
            ge.b.o("no callback registered", aVar.f16795c);
        }

        @Override // lf.b
        public final void C(boolean z10, lf.a aVar) {
            a aVar2;
            int i10;
            if (z10) {
                ge.b.d("DfuService connected");
                aVar2 = a.this;
                aVar2.f16797e = aVar;
                i10 = 258;
            } else {
                ge.b.d("DfuService disconnected");
                aVar2 = a.this;
                aVar2.f16797e = null;
                i10 = 0;
            }
            aVar2.e(i10);
        }

        @Override // yb.y
        public final void z(int i10) {
            a aVar = a.this;
            aVar.getClass();
            aVar.c(65536, i10);
        }
    }

    public final void f(ne.a aVar) {
        int i10 = aVar.f16770b;
        boolean z10 = false;
        if (this.f16802j <= 258) {
            ge.b.p("has not be initialized");
        } else {
            int i11 = this.f16799g;
            if (i11 <= 0) {
                ge.b.n(String.format(Locale.US, "reconnectTimes=%d, no need to reconnect", Integer.valueOf(i11)));
            } else if (i10 == 0 || i10 == 1 || i10 == 6) {
                z10 = true;
            }
        }
        if (z10) {
            this.f16799g--;
            Handler handler = this.f16803k;
            if (handler != null) {
                handler.postDelayed(this.f16804l, 1000L);
                return;
            }
            return;
        }
        a();
        c(aVar.f16769a, aVar.f16770b);
    }

    public final BluetoothDevice g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BluetoothAdapter bluetoothAdapter = this.f16774m;
        if (bluetoothAdapter == null) {
            ge.b.p("mBluetoothAdapter == null");
            return null;
        }
        try {
            return bluetoothAdapter.getRemoteDevice(str);
        } catch (Exception e10) {
            ge.b.f(e10.toString());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(p001if.c.b r7) {
        /*
            r6 = this;
            r6.f16800h = r7
            int r7 = r6.f16802j
            r0 = 0
            r1 = 257(0x101, float:3.6E-43)
            if (r7 != r1) goto Lf
            java.lang.String r7 = "STATE_INIT_BINDING_SERVICE ..."
            ge.b.p(r7)
            return r0
        Lf:
            lf.a r7 = r6.f16797e
            r2 = 1
            if (r7 != 0) goto L5b
            r6.e(r1)
            android.content.Context r7 = r6.f16796d
            if.a$b r1 = r6.f16781t
            if (r7 == 0) goto L4c
            if (r1 != 0) goto L20
            goto L4c
        L20:
            lf.a r3 = new lf.a
            r3.<init>(r7, r1)
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.realsil.sdk.dfu.DfuService> r5 = com.realsil.sdk.dfu.DfuService.class
            r4.<init>(r7, r5)
            r7 = 65536(0x10000, float:9.1835E-41)
            java.util.List r7 = r1.queryIntentServices(r4, r7)
            int r7 = r7.size()
            if (r7 <= 0) goto L3d
            goto L3e
        L3d:
            r2 = 0
        L3e:
            if (r2 != 0) goto L46
            java.lang.String r7 = "please declare com.realsil.sdk.dfu.DfuService in your AndroidManifest.xml"
            ge.b.p(r7)
            goto L4c
        L46:
            boolean r7 = r3.b()
            r2 = r7
            goto L4e
        L4c:
            r7 = 0
            r2 = 0
        L4e:
            boolean r7 = r6.f16795c
            java.lang.String r1 = "getDfuProxy: "
            d4.b.b(r1, r2, r7)
            if (r2 != 0) goto L67
            r6.e(r0)
            goto L67
        L5b:
            boolean r7 = r6.f16793a
            java.lang.String r0 = "dfu already binded"
            ge.b.o(r0, r7)
            r7 = 258(0x102, float:3.62E-43)
            r6.e(r7)
        L67:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p001if.a.h(if.c$b):boolean");
    }
}
