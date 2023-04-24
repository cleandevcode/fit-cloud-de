package oc;

import android.bluetooth.BluetoothGatt;
import yk.a;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a */
    public final sc.d f22969a;

    /* renamed from: b */
    public final BluetoothGatt f22970b;

    /* renamed from: c */
    public final qc.z f22971c;

    /* renamed from: d */
    public gl.a f22972d;

    /* renamed from: e */
    public final ql.d<qc.m0> f22973e = new ql.a(null).G();

    /* renamed from: f */
    public boolean f22974f = false;

    /* loaded from: classes.dex */
    public class a implements wk.a {
        public a() {
            e1.this = r1;
        }

        @Override // wk.a
        public final void run() {
            e1.this.f22974f = true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements wk.a {
        public b() {
            e1.this = r1;
        }

        @Override // wk.a
        public final void run() {
            e1.this.a();
        }
    }

    public e1(sc.d dVar, BluetoothGatt bluetoothGatt, qc.z zVar) {
        this.f22969a = dVar;
        this.f22970b = bluetoothGatt;
        this.f22971c = zVar;
        a();
    }

    public final void a() {
        this.f22974f = false;
        dl.e eVar = new dl.e(new dl.c(new gl.n(new h1(this)), new g1()), new f1());
        ql.d<qc.m0> dVar = this.f22973e;
        dVar.getClass();
        this.f22972d = new gl.a(new gl.h(new gl.j(new dl.g(eVar, new gl.l(new fl.q(dVar), new i1(this))), new a.C0601a(new a())), new a.C0601a(new b())));
    }
}
