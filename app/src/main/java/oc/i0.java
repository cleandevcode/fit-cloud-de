package oc;

import android.bluetooth.BluetoothGattCharacteristic;
import kc.v0;

/* loaded from: classes.dex */
public final class i0 implements v0.a {

    /* renamed from: a */
    public final sc.d f22991a;

    /* renamed from: b */
    public final kc.v0 f22992b;

    /* renamed from: c */
    public final qc.z f22993c;

    /* renamed from: d */
    public gl.o f22994d;

    /* renamed from: e */
    public z0 f22995e;

    /* renamed from: f */
    public f0 f22996f = new f0();

    /* renamed from: g */
    public q0 f22997g = new q0();

    /* renamed from: h */
    public byte[] f22998h;

    /* loaded from: classes.dex */
    public class a implements wk.e<BluetoothGattCharacteristic, tk.i<byte[]>> {
        public a() {
            i0.this = r1;
        }

        @Override // wk.e
        public final tk.i<byte[]> apply(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
            i0 i0Var = i0.this;
            return i0Var.f22991a.a(i0Var.f22993c.c(bluetoothGattCharacteristic2, i0Var.f22996f, i0Var.f22997g, i0Var.f22995e, i0Var.f22998h));
        }
    }

    public i0(sc.d dVar, k0 k0Var, kc.v0 v0Var, qc.z zVar) {
        this.f22991a = dVar;
        this.f22995e = k0Var;
        this.f22992b = v0Var;
        this.f22993c = zVar;
    }

    @Override // kc.v0.a
    public final i0 a(int i10) {
        this.f22995e = new r(i10, 0);
        return this;
    }

    @Override // kc.v0.a
    public final i0 b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f22994d = tk.p.e(bluetoothGattCharacteristic);
        return this;
    }

    @Override // kc.v0.a
    public final tk.i<byte[]> build() {
        gl.o oVar = this.f22994d;
        if (oVar != null) {
            if (this.f22998h != null) {
                return new el.e(oVar, new a());
            }
            throw new IllegalArgumentException("setBytes() needs to be called before build()");
        }
        throw new IllegalArgumentException("setCharacteristicUuid() or setCharacteristic() needs to be called before build()");
    }

    @Override // kc.v0.a
    public final i0 c(byte[] bArr) {
        this.f22998h = bArr;
        return this;
    }
}
