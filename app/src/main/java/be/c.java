package be;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;
import xe.f;

/* loaded from: classes.dex */
public final class c extends ee.a {

    /* renamed from: q */
    public fe.c f4154q;

    /* renamed from: r */
    public final a f4155r = new a();

    /* loaded from: classes.dex */
    public class a {
        public a() {
            c.this = r1;
        }
    }

    public c(Context context, d dVar, f.b bVar) {
        this.f13585c = context.getApplicationContext();
        this.f13589g = null;
        this.f13586d = dVar;
        this.f13587e = bVar;
        if (super.e()) {
            this.f4154q = new fe.c(this.f13585c, Build.VERSION.SDK_INT);
        }
    }

    @Override // ee.a
    public final void a() {
    }

    @Override // ee.a
    public final boolean d(BluetoothDevice bluetoothDevice) {
        int type = bluetoothDevice.getType();
        if (this.f13586d.f4157a == 18 && type != 2) {
            if (this.f13584b) {
                ge.b.n(String.format(Locale.US, "filter, invalid type: %d, expect type is %d", Integer.valueOf(type), 2));
            }
            return false;
        } else if (!f(bluetoothDevice)) {
            return false;
        } else {
            if (TextUtils.isEmpty(this.f13586d.f4162f) || Objects.equals(this.f13586d.f4162f, bluetoothDevice.getAddress())) {
                return true;
            }
            if (this.f13584b) {
                ge.b.n("address not match:" + p.b.m(bluetoothDevice.getAddress()));
            }
            return false;
        }
    }

    @Override // ee.a
    public final boolean i() {
        fe.c cVar = this.f4154q;
        synchronized (cVar) {
            fe.a aVar = cVar.f14244a;
            if (aVar != null) {
                aVar.f14243f = null;
            }
        }
        if (this.f4154q.f14244a.f14241d) {
            ge.b.o("stop the le scan process", this.f13584b);
            if (!this.f4154q.f14244a.a()) {
                ge.b.p("scanLeDevice failed");
                return false;
            }
        }
        b(0);
        return true;
    }

    @Override // ee.a
    public final boolean k() {
        boolean z10;
        StringBuilder sb2;
        String str;
        boolean b10;
        if (!h()) {
            return true;
        }
        if (this.f13584b) {
            z10 = this.f13583a;
            sb2 = new StringBuilder("startDiscovery for ");
            str = this.f13586d.toString();
        } else {
            z10 = this.f13583a;
            sb2 = new StringBuilder("startDiscovery for ");
            sb2.append(this.f13586d.f4164h);
            str = "ms";
        }
        sb2.append(str);
        ge.b.o(sb2.toString(), z10);
        fe.c cVar = this.f4154q;
        a aVar = this.f4155r;
        synchronized (cVar) {
            fe.a aVar2 = cVar.f14244a;
            if (aVar2 != null) {
                aVar2.f14243f = aVar;
            }
        }
        fe.c cVar2 = this.f4154q;
        d dVar = this.f13586d;
        fe.a aVar3 = cVar2.f14244a;
        if (!aVar3.f14240c.isEnabled()) {
            ge.b.d("BT Adapter is not enable");
            b10 = false;
        } else {
            b10 = aVar3.b(dVar);
        }
        if (!b10) {
            ge.b.n("scanLeDevice failed");
            l();
            return false;
        }
        g();
        ge.b.n("");
        return true;
    }
}
