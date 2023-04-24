package oc;

import android.bluetooth.BluetoothGattCharacteristic;
import fl.p0;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kc.v0;

/* loaded from: classes.dex */
public final class a1 implements kc.v0 {

    /* renamed from: a */
    public final sc.d f22920a;

    /* renamed from: b */
    public final qc.z f22921b;

    /* renamed from: c */
    public final w3.a<v0.a> f22922c;

    /* renamed from: d */
    public final e1 f22923d;

    /* renamed from: e */
    public final x0 f22924e;

    /* renamed from: f */
    public final m0 f22925f;

    /* renamed from: g */
    public final a0 f22926g;

    public a1(sc.d dVar, e1 e1Var, x0 x0Var, m0 m0Var, qc.z zVar, w3.a aVar, a0 a0Var) {
        this.f22920a = dVar;
        this.f22923d = e1Var;
        this.f22924e = x0Var;
        this.f22925f = m0Var;
        this.f22921b = zVar;
        this.f22922c = aVar;
        this.f22926g = a0Var;
    }

    @Override // kc.v0
    public final int a() {
        return this.f22925f.a();
    }

    @Override // kc.v0
    public final tk.p<kc.y0> b() {
        e1 e1Var = this.f22923d;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (e1Var.f22974f) {
            return e1Var.f22972d;
        }
        gl.a aVar = e1Var.f22972d;
        d1 d1Var = new d1(e1Var, timeUnit);
        aVar.getClass();
        return new gl.i(aVar, d1Var);
    }

    @Override // kc.v0
    public final v0.a c() {
        return this.f22922c.get();
    }

    @Override // kc.v0
    public final fl.q d(int i10) {
        tk.i a10 = this.f22920a.a(this.f22921b.a(i10));
        a10.getClass();
        return new fl.q(a10);
    }

    @Override // kc.v0
    public final fl.q e(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        a0 a0Var = this.f22926g;
        a0Var.getClass();
        return new fl.q(new bl.d(new z(a0Var, bluetoothGattCharacteristic, 76)).c(this.f22920a.a(this.f22921b.e(bluetoothGattCharacteristic, bArr))));
    }

    @Override // kc.v0
    public final tk.i f(final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        a0 a0Var = this.f22926g;
        a0Var.getClass();
        bl.d dVar = new bl.d(new z(a0Var, bluetoothGattCharacteristic, 16));
        final x0 x0Var = this.f22924e;
        x0Var.getClass();
        return dVar.c(new bl.k(1, new wk.g() { // from class: oc.r0

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ boolean f23031c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ kc.j0 f23032d;

            {
                kc.j0 j0Var = kc.j0.DEFAULT;
                this.f23031c = false;
                this.f23032d = j0Var;
            }

            @Override // wk.g
            public final Object get() {
                final byte[] bArr;
                tk.i<tk.i<byte[]>> m10;
                final x0 x0Var2 = x0Var;
                final BluetoothGattCharacteristic bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
                boolean z10 = this.f23031c;
                final kc.j0 j0Var = this.f23032d;
                synchronized (x0Var2.f23066g) {
                    final tc.j jVar = new tc.j(bluetoothGattCharacteristic2.getUuid(), Integer.valueOf(bluetoothGattCharacteristic2.getInstanceId()));
                    tc.a aVar = (tc.a) x0Var2.f23066g.get(jVar);
                    if (aVar != null) {
                        if (aVar.f27959b == z10) {
                            m10 = aVar.f27958a;
                        } else {
                            m10 = tk.i.m(new lc.e(bluetoothGattCharacteristic2.getUuid(), !z10));
                        }
                        return m10;
                    }
                    if (z10) {
                        bArr = x0Var2.f23061b;
                    } else {
                        bArr = x0Var2.f23060a;
                    }
                    final ql.b bVar = new ql.b();
                    bl.d dVar2 = new bl.d(new v0(x0Var2.f23063d, bluetoothGattCharacteristic2, true));
                    c1 c1Var = x0Var2.f23064e;
                    tk.i c10 = dVar2.c(fl.j0.f14518a.x(new fl.t(tk.i.v(c1Var.f22944c.f23049c, c1Var.f22950i).h(0L, TimeUnit.SECONDS, c1Var.f22942a), new jj.i(3, jVar)).u(new wk.e() { // from class: oc.u0
                        @Override // wk.e
                        public final Object apply(Object obj) {
                            return ((tc.i) obj).f27981a;
                        }
                    })));
                    final s sVar = x0Var2.f23065f;
                    fl.l lVar = new fl.l(c10.c(new tk.m() { // from class: oc.w0
                        @Override // tk.m
                        public final tk.i a(tk.i iVar) {
                            tk.i kVar;
                            kc.j0 j0Var2 = j0Var;
                            BluetoothGattCharacteristic bluetoothGattCharacteristic3 = bluetoothGattCharacteristic2;
                            s sVar2 = sVar;
                            byte[] bArr2 = bArr;
                            int ordinal = j0Var2.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    return x0.a(bluetoothGattCharacteristic3, sVar2, bArr2).c(iVar);
                                }
                                tk.a a10 = x0.a(bluetoothGattCharacteristic3, sVar2, bArr2);
                                if (a10 instanceof zk.a) {
                                    kVar = ((zk.a) a10).b();
                                } else {
                                    kVar = new bl.k(0, a10);
                                }
                                kVar.getClass();
                                fl.d0 d0Var = new fl.d0(new fl.c(new fl.l0(kVar), 2));
                                iVar.getClass();
                                return new fl.i0(iVar, d0Var).u(new wi.i(7, d0Var));
                            }
                            return iVar;
                        }
                    }).u(new s0(0, bVar)), new wk.a() { // from class: oc.t0
                        @Override // wk.a
                        public final void run() {
                            x0 x0Var3 = x0.this;
                            ql.b bVar2 = bVar;
                            tc.j jVar2 = jVar;
                            BluetoothGattCharacteristic bluetoothGattCharacteristic3 = bluetoothGattCharacteristic2;
                            kc.j0 j0Var2 = j0Var;
                            x0Var3.getClass();
                            bVar2.onComplete();
                            synchronized (x0Var3.f23066g) {
                                x0Var3.f23066g.remove(jVar2);
                            }
                            tk.c dVar3 = new bl.d(new v0(x0Var3.f23063d, bluetoothGattCharacteristic3, false));
                            s sVar2 = x0Var3.f23065f;
                            byte[] bArr2 = x0Var3.f23062c;
                            if (j0Var2 != kc.j0.COMPAT) {
                                dVar3 = new bl.a(dVar3, x0.a(bluetoothGattCharacteristic3, sVar2, bArr2));
                            }
                            dVar3.a(new al.f(yk.a.f31788c, yk.a.f31789d));
                        }
                    });
                    tk.i<Object> iVar = x0Var2.f23064e.f22944c.f23049c;
                    Objects.requireNonNull(iVar, "other is null");
                    tk.i v10 = tk.i.v(lVar, iVar);
                    v10.getClass();
                    yk.b.a(1, "bufferSize");
                    p0.f fVar = new p0.f();
                    AtomicReference atomicReference = new AtomicReference();
                    fl.n0 n0Var = new fl.n0(new fl.p0(new p0.h(atomicReference, fVar), v10, atomicReference, fVar));
                    x0Var2.f23066g.put(jVar, new tc.a(n0Var, z10));
                    return n0Var;
                }
            }
        }));
    }
}
