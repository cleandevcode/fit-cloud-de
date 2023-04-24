package wi;

import android.bluetooth.BluetoothGattCharacteristic;
import kc.v0;
import p000do.a;
import wi.b;

/* loaded from: classes2.dex */
public final class x implements b {

    /* renamed from: a */
    public final aj.c f29957a;

    /* renamed from: b */
    public final cj.h f29958b;

    /* loaded from: classes2.dex */
    public static final class a implements cj.i {

        /* renamed from: a */
        public final v0 f29959a;

        /* renamed from: b */
        public final int f29960b;

        /* renamed from: c */
        public final BluetoothGattCharacteristic f29961c;

        /* renamed from: d */
        public final tk.i<byte[]> f29962d;

        public a(v0 v0Var, int i10, BluetoothGattCharacteristic bluetoothGattCharacteristic, tk.i<byte[]> iVar) {
            gm.l.f(v0Var, "rxBleConnection");
            this.f29959a = v0Var;
            this.f29960b = i10;
            this.f29961c = bluetoothGattCharacteristic;
            this.f29962d = iVar;
        }

        public final void a(byte[] bArr) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#FcConnection");
            bVar.h("Send Data:%s", bi.r.h(bArr));
            if (bArr.length <= this.f29960b) {
                fl.q e10 = this.f29959a.e(this.f29961c, bArr);
                e10.getClass();
                al.e eVar = new al.e();
                e10.c(eVar);
                if (eVar.getCount() != 0) {
                    try {
                        eVar.await();
                    } catch (InterruptedException e11) {
                        eVar.f615d = true;
                        uk.c cVar = eVar.f614c;
                        if (cVar != null) {
                            cVar.c();
                        }
                        throw kl.d.d(e11);
                    }
                }
                Throwable th2 = eVar.f613b;
                if (th2 != null) {
                    throw kl.d.d(th2);
                }
                return;
            }
            v0.a c10 = this.f29959a.c();
            gm.l.e(c10, "rxBleConnection.createNewLongWriteBuilder()");
            c10.c(bArr);
            c10.b(this.f29961c);
            c10.a(this.f29960b);
            tk.i<byte[]> build = c10.build();
            build.getClass();
            kl.c cVar2 = new kl.c();
            al.j jVar = new al.j(yk.a.f31789d, cVar2, cVar2);
            build.d(jVar);
            if (cVar2.getCount() != 0) {
                try {
                    cVar2.await();
                } catch (InterruptedException e12) {
                    xk.b.a(jVar);
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e12);
                }
            }
            Throwable th3 = cVar2.f18619a;
            if (th3 == null) {
                return;
            }
            throw kl.d.d(th3);
        }
    }

    public x(b.a aVar) {
        this.f29957a = new aj.c(aVar.f29862b, aVar.f29863c.d(), aVar.f29863c.b());
        String str = aVar.f29862b;
        v0 v0Var = aVar.f29861a;
        int i10 = aVar.f29865e;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = aVar.f29866f;
        if (bluetoothGattCharacteristic != null) {
            tk.i<byte[]> iVar = aVar.f29867g;
            if (iVar != null) {
                this.f29958b = new cj.h(str, new a(v0Var, i10, bluetoothGattCharacteristic, iVar), aVar.f29863c.a(), aVar.f29863c.c(), aVar.f29864d);
                return;
            } else {
                gm.l.l("protocolNotifyObservable");
                throw null;
            }
        }
        gm.l.l("protocolWriteCharacteristic");
        throw null;
    }

    @Override // wi.b
    public final void a(lc.f fVar) {
        gm.l.f(fVar, "disconnectedException");
        aj.c cVar = this.f29957a;
        synchronized (cVar) {
            if (cVar.f601e == null) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("Fc#OperationQueue");
                bVar.c(fVar, "Connection operations queue to be terminated (%s)", cVar.f597a);
                cVar.f600d = false;
                cVar.f601e = fVar;
                cVar.f602f.cancel(true);
            }
        }
        cj.h hVar = this.f29958b;
        hVar.getClass();
        if (hVar.f4891e) {
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("Fc#ProtocolQueue");
            bVar2.c(fVar, "ProtocolQueue to be terminated (%s)", hVar.f4887a);
            while (!hVar.f4903q.d()) {
                a.b bVar3 = p000do.a.f13275a;
                bVar3.t("Fc#ProtocolQueue");
                bVar3.b("wait receiveDisposable disposed", new Object[0]);
                Thread.sleep(100L);
            }
            while (!hVar.f4900n.isEmpty()) {
                a.b bVar4 = p000do.a.f13275a;
                bVar4.t("Fc#ProtocolQueue");
                bVar4.b("wait receiveQueue empty", new Object[0]);
                Thread.sleep(100L);
            }
            hVar.f4891e = false;
            hVar.f4892f.b(fVar);
            try {
                hVar.f4895i.lock();
                hVar.f4896j.signalAll();
                hVar.f4895i.unlock();
                hVar.f4902p.cancel(true);
            } catch (Throwable th2) {
                hVar.f4895i.unlock();
                throw th2;
            }
        }
    }

    @Override // wi.b
    public final <T> tk.i<T> b(zi.b<T> bVar) {
        gm.l.f(bVar, "operation");
        return bVar instanceof ti.f ? this.f29957a.a(new ti.j(this.f29958b, (ti.f) bVar)) : this.f29957a.a(bVar);
    }
}
