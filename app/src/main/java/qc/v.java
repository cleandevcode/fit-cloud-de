package qc;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.os.DeadObjectException;
import com.polidea.rxandroidble3.internal.RxBleLog;
import fl.g;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kc.v0;
import oc.c1;

/* loaded from: classes.dex */
public final class v extends mc.i<Void> {

    /* renamed from: a */
    public final c1 f24765a;

    /* renamed from: b */
    public final oc.a f24766b;

    /* renamed from: c */
    public final String f24767c;

    /* renamed from: d */
    public final BluetoothManager f24768d;

    /* renamed from: e */
    public final tk.o f24769e;

    /* renamed from: f */
    public final m0 f24770f;

    /* renamed from: g */
    public final oc.k f24771g;

    /* loaded from: classes.dex */
    public static class a extends tk.p<BluetoothGatt> {

        /* renamed from: a */
        public final BluetoothGatt f24772a;

        /* renamed from: b */
        public final c1 f24773b;

        /* renamed from: c */
        public final tk.o f24774c;

        /* renamed from: qc.v$a$a */
        /* loaded from: classes.dex */
        public class C0449a implements wk.e<v0.b, BluetoothGatt> {
            public C0449a() {
                a.this = r1;
            }

            @Override // wk.e
            public final BluetoothGatt apply(v0.b bVar) {
                return a.this.f24772a;
            }
        }

        /* loaded from: classes.dex */
        public class b implements wk.f<v0.b> {
            @Override // wk.f
            public final boolean test(v0.b bVar) {
                return bVar == v0.b.DISCONNECTED;
            }
        }

        /* loaded from: classes.dex */
        public class c implements Runnable {
            public c() {
                a.this = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f24772a.disconnect();
            }
        }

        public a(BluetoothGatt bluetoothGatt, c1 c1Var, tk.o oVar) {
            this.f24772a = bluetoothGatt;
            this.f24773b = c1Var;
            this.f24774c = oVar;
        }

        @Override // tk.p
        public final void f(tk.r<? super BluetoothGatt> rVar) {
            c1 c1Var = this.f24773b;
            new gl.p(new fl.q(new fl.t(c1Var.f22946e.g(0L, TimeUnit.SECONDS, c1Var.f22942a), new b())), new C0449a()).c(rVar);
            this.f24774c.b().a(new c());
        }
    }

    public v(c1 c1Var, oc.a aVar, String str, BluetoothManager bluetoothManager, tk.o oVar, m0 m0Var, oc.k kVar) {
        this.f24765a = c1Var;
        this.f24766b = aVar;
        this.f24767c = str;
        this.f24768d = bluetoothManager;
        this.f24769e = oVar;
        this.f24770f = m0Var;
        this.f24771g = kVar;
    }

    @Override // mc.i
    public final void a(g.a aVar, w.d dVar) {
        tk.t g10;
        this.f24771g.a(v0.b.DISCONNECTING);
        BluetoothGatt bluetoothGatt = this.f24766b.f22918a.get();
        boolean z10 = false;
        if (bluetoothGatt == null) {
            RxBleLog.w("Disconnect operation has been executed but GATT instance was null - considering disconnected.", new Object[0]);
            this.f24771g.a(v0.b.DISCONNECTED);
            dVar.e();
            aVar.b();
            return;
        }
        if (this.f24768d.getConnectionState(bluetoothGatt.getDevice(), 7) == 0) {
            z10 = true;
        }
        if (z10) {
            g10 = tk.p.e(bluetoothGatt);
        } else {
            a aVar2 = new a(bluetoothGatt, this.f24765a, this.f24769e);
            m0 m0Var = this.f24770f;
            g10 = aVar2.g(m0Var.f24746a, m0Var.f24747b, m0Var.f24748c, tk.p.e(bluetoothGatt));
        }
        tk.o oVar = this.f24769e;
        Objects.requireNonNull(oVar, "scheduler is null");
        new gl.q(g10, oVar).c(new u(this, aVar, dVar));
    }

    @Override // mc.i
    public final lc.g c(DeadObjectException deadObjectException) {
        return new lc.f(this.f24767c, deadObjectException);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DisconnectOperation{");
        a10.append(pc.b.c(this.f24767c));
        a10.append('}');
        return a10.toString();
    }
}
