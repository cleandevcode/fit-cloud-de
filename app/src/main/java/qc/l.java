package qc;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.DeadObjectException;
import com.polidea.rxandroidble3.internal.RxBleLog;
import fl.b1;
import fl.g;
import fl.o0;
import fl.r0;
import fl.x0;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kc.v0;
import oc.c1;
import oc.q0;
import oc.z0;
import pc.b;

/* loaded from: classes.dex */
public final class l extends mc.i<byte[]> {

    /* renamed from: a */
    public final BluetoothGatt f24732a;

    /* renamed from: b */
    public final c1 f24733b;

    /* renamed from: c */
    public final tk.o f24734c;

    /* renamed from: d */
    public final m0 f24735d;

    /* renamed from: e */
    public final BluetoothGattCharacteristic f24736e;

    /* renamed from: f */
    public final z0 f24737f;

    /* renamed from: g */
    public final v0.c f24738g;

    /* renamed from: h */
    public final v0.d f24739h;

    /* renamed from: i */
    public final byte[] f24740i;

    /* renamed from: j */
    public byte[] f24741j;

    /* loaded from: classes.dex */
    public interface a {
    }

    public l(BluetoothGatt bluetoothGatt, c1 c1Var, tk.o oVar, m0 m0Var, BluetoothGattCharacteristic bluetoothGattCharacteristic, z0 z0Var, oc.f0 f0Var, q0 q0Var, byte[] bArr) {
        this.f24732a = bluetoothGatt;
        this.f24733b = c1Var;
        this.f24734c = oVar;
        this.f24735d = m0Var;
        this.f24736e = bluetoothGattCharacteristic;
        this.f24737f = z0Var;
        this.f24738g = f0Var;
        this.f24739h = q0Var;
        this.f24740i = bArr;
    }

    @Override // mc.i
    public final void a(g.a aVar, w.d dVar) {
        int a10 = this.f24737f.a();
        if (a10 > 0) {
            tk.i m10 = tk.i.m(new lc.h(this.f24732a, lc.m.f19430f));
            ByteBuffer wrap = ByteBuffer.wrap(this.f24740i);
            tc.k0 k0Var = new tc.k0(aVar, dVar);
            qc.a aVar2 = new qc.a(wrap, a10);
            c1 c1Var = this.f24733b;
            x0 x0Var = new x0(new fl.t(new fl.g(new c(this, c1Var.b(c1Var.f22949h).h(0L, TimeUnit.SECONDS, c1Var.f22942a), wrap, a10, aVar2)).A(this.f24734c), new d(this.f24736e)));
            m0 m0Var = this.f24735d;
            long j10 = m0Var.f24746a;
            TimeUnit timeUnit = m0Var.f24747b;
            tk.o oVar = m0Var.f24748c;
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(oVar, "scheduler is null");
            new r0(new o0(new b1(x0Var, j10, timeUnit, oVar, m10), new h(this.f24738g, k0Var, wrap)), new k(a10, this.f24739h, aVar2, wrap)).d(new b(this, k0Var));
            return;
        }
        throw new IllegalArgumentException(androidx.activity.i.a("batchSizeProvider value must be greater than zero (now: ", a10, ")"));
    }

    @Override // mc.i
    public final lc.g c(DeadObjectException deadObjectException) {
        return new lc.f(this.f24732a.getDevice().getAddress(), deadObjectException);
    }

    public final void d(byte[] bArr, a aVar) {
        if (RxBleLog.isAtLeast(3)) {
            qc.a aVar2 = (qc.a) aVar;
            RxBleLog.d("Writing batch #%04d: %s", Integer.valueOf(((int) Math.ceil(aVar2.f24679a.position() / aVar2.f24680b)) - 1), pc.b.a(bArr));
        }
        this.f24736e.setValue(bArr);
        if (this.f24732a.writeCharacteristic(this.f24736e)) {
            return;
        }
        throw new lc.i(this.f24732a, lc.m.f19430f);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CharacteristicLongWriteOperation{");
        a10.append(pc.b.b(this.f24732a));
        a10.append(", characteristic=");
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f24736e;
        a10.append(new b.a(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), false));
        a10.append(", maxBatchSize=");
        a10.append(this.f24737f.a());
        a10.append('}');
        return a10.toString();
    }
}
