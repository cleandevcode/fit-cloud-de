package oc;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.polidea.rxandroidble3.internal.RxBleLog;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kc.v0;
import pc.b;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a */
    public final tk.o f22942a;

    /* renamed from: b */
    public final oc.a f22943b;

    /* renamed from: c */
    public final v f22944c;

    /* renamed from: d */
    public final o0 f22945d;

    /* renamed from: e */
    public final gc.c<v0.b> f22946e = new gc.c<>();

    /* renamed from: f */
    public final c<kc.y0> f22947f = new c<>();

    /* renamed from: g */
    public final c<tc.e<UUID>> f22948g = new c<>();

    /* renamed from: h */
    public final c<tc.e<UUID>> f22949h = new c<>();

    /* renamed from: i */
    public final gc.d f22950i;

    /* renamed from: j */
    public final c<tc.e<BluetoothGattDescriptor>> f22951j;

    /* renamed from: k */
    public final c<tc.e<BluetoothGattDescriptor>> f22952k;

    /* renamed from: l */
    public final c<Integer> f22953l;

    /* renamed from: m */
    public final c<Integer> f22954m;

    /* renamed from: n */
    public final c<Object> f22955n;

    /* renamed from: o */
    public final a f22956o;

    /* renamed from: p */
    public final b f22957p;

    /* loaded from: classes.dex */
    public class a implements wk.e<lc.l, tk.i<?>> {
        @Override // wk.e
        public final tk.i<?> apply(lc.l lVar) {
            return tk.i.m(lVar);
        }
    }

    /* loaded from: classes.dex */
    public class b extends BluetoothGattCallback {
        public b() {
            c1.this = r1;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            char[] cArr = pc.b.f24007a;
            if (RxBleLog.isAtLeast(4)) {
                b.a aVar = new b.a(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), true);
                RxBleLog.i(pc.b.b(bluetoothGatt) + " %24s(), value=%s", "onCharacteristicChanged", aVar);
            }
            c1.this.f22945d.getClass();
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            if (c1.this.f22950i.H()) {
                c1.this.f22950i.accept(new tc.i(bluetoothGattCharacteristic.getUuid(), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getValue()));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            boolean z10;
            boolean z11 = true;
            pc.b.g("onCharacteristicRead", bluetoothGatt, i10, bluetoothGattCharacteristic, true);
            c1.this.f22945d.getClass();
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i10);
            if (c1.this.f22948g.a()) {
                c<tc.e<UUID>> cVar = c1.this.f22948g;
                lc.m mVar = lc.m.f19428d;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    cVar.f22960b.accept(new lc.j(bluetoothGatt, i10, mVar));
                } else {
                    z11 = false;
                }
                if (!z11) {
                    c1.this.f22948g.f22959a.accept(new tc.e<>(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue()));
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            boolean z10;
            boolean z11 = false;
            pc.b.g("onCharacteristicWrite", bluetoothGatt, i10, bluetoothGattCharacteristic, false);
            c1.this.f22945d.getClass();
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i10);
            if (c1.this.f22949h.a()) {
                c<tc.e<UUID>> cVar = c1.this.f22949h;
                lc.m mVar = lc.m.f19429e;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    cVar.f22960b.accept(new lc.j(bluetoothGatt, i10, mVar));
                    z11 = true;
                }
                if (!z11) {
                    c1.this.f22949h.f22959a.accept(new tc.e<>(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue()));
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i10, int i11) {
            boolean z10;
            v0.b bVar;
            pc.b.f("onConnectionStateChange", bluetoothGatt, i10, i11);
            c1.this.f22945d.getClass();
            super.onConnectionStateChange(bluetoothGatt, i10, i11);
            AtomicReference<BluetoothGatt> atomicReference = c1.this.f22943b.f22918a;
            while (!atomicReference.compareAndSet(null, bluetoothGatt) && atomicReference.get() == null) {
            }
            if (i11 != 0 && i11 != 3) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                v vVar = c1.this.f22944c;
                vVar.f23047a.accept(new lc.f(bluetoothGatt.getDevice().getAddress(), i10));
            } else if (i10 != 0) {
                v vVar2 = c1.this.f22944c;
                vVar2.f23047a.accept(new lc.l(bluetoothGatt, i10, lc.m.f19426b));
            }
            gc.c<v0.b> cVar = c1.this.f22946e;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        bVar = v0.b.DISCONNECTED;
                    } else {
                        bVar = v0.b.DISCONNECTING;
                    }
                } else {
                    bVar = v0.b.CONNECTED;
                }
            } else {
                bVar = v0.b.CONNECTING;
            }
            cVar.accept(bVar);
        }

        public void onConnectionUpdated(BluetoothGatt bluetoothGatt, int i10, int i11, int i12, int i13) {
            char[] cArr = pc.b.f24007a;
            if (RxBleLog.isAtLeast(4)) {
                RxBleLog.i(pc.b.b(bluetoothGatt) + " %24s(), status=%d, interval=%d (%.2f ms), latency=%d, timeout=%d (%.0f ms)", "onConnectionUpdated", Integer.valueOf(i13), Integer.valueOf(i10), Float.valueOf(i10 * 1.25f), Integer.valueOf(i11), Integer.valueOf(i12), Float.valueOf(i12 * 10.0f));
            }
            c1.this.f22945d.getClass();
            if (c1.this.f22955n.a() && !c1.a(c1.this.f22955n, bluetoothGatt, i13, lc.m.f19435k)) {
                c1.this.f22955n.f22959a.accept(new j());
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            boolean z10;
            boolean z11 = true;
            pc.b.h("onDescriptorRead", bluetoothGatt, i10, bluetoothGattDescriptor, true);
            c1.this.f22945d.getClass();
            super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i10);
            if (c1.this.f22951j.a()) {
                c<tc.e<BluetoothGattDescriptor>> cVar = c1.this.f22951j;
                lc.m mVar = lc.m.f19431g;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    cVar.f22960b.accept(new lc.k(bluetoothGatt, i10, mVar));
                } else {
                    z11 = false;
                }
                if (!z11) {
                    c1.this.f22951j.f22959a.accept(new tc.e<>(bluetoothGattDescriptor, bluetoothGattDescriptor.getValue()));
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            boolean z10;
            boolean z11 = false;
            pc.b.h("onDescriptorWrite", bluetoothGatt, i10, bluetoothGattDescriptor, false);
            c1.this.f22945d.getClass();
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i10);
            if (c1.this.f22952k.a()) {
                c<tc.e<BluetoothGattDescriptor>> cVar = c1.this.f22952k;
                lc.m mVar = lc.m.f19432h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    cVar.f22960b.accept(new lc.k(bluetoothGatt, i10, mVar));
                    z11 = true;
                }
                if (!z11) {
                    c1.this.f22952k.f22959a.accept(new tc.e<>(bluetoothGattDescriptor, bluetoothGattDescriptor.getValue()));
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i10, int i11) {
            pc.b.f("onMtuChanged", bluetoothGatt, i11, i10);
            c1.this.f22945d.getClass();
            super.onMtuChanged(bluetoothGatt, i10, i11);
            if (!c1.this.f22954m.a() || c1.a(c1.this.f22954m, bluetoothGatt, i11, lc.m.f19434j)) {
                return;
            }
            c1.this.f22954m.f22959a.accept(Integer.valueOf(i10));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i10, int i11) {
            pc.b.f("onReadRemoteRssi", bluetoothGatt, i11, i10);
            c1.this.f22945d.getClass();
            super.onReadRemoteRssi(bluetoothGatt, i10, i11);
            if (!c1.this.f22953l.a() || c1.a(c1.this.f22953l, bluetoothGatt, i11, lc.m.f19433i)) {
                return;
            }
            c1.this.f22953l.f22959a.accept(Integer.valueOf(i10));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i10) {
            pc.b.e("onReliableWriteCompleted", bluetoothGatt, i10);
            c1.this.f22945d.getClass();
            super.onReliableWriteCompleted(bluetoothGatt, i10);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i10) {
            pc.b.e("onServicesDiscovered", bluetoothGatt, i10);
            c1.this.f22945d.getClass();
            super.onServicesDiscovered(bluetoothGatt, i10);
            if (!c1.this.f22947f.a() || c1.a(c1.this.f22947f, bluetoothGatt, i10, lc.m.f19427c)) {
                return;
            }
            c1.this.f22947f.f22959a.accept(new kc.y0(bluetoothGatt.getServices()));
        }
    }

    /* loaded from: classes.dex */
    public static class c<T> {

        /* renamed from: a */
        public final gc.c<T> f22959a = new gc.c<>();

        /* renamed from: b */
        public final gc.c<lc.l> f22960b = new gc.c<>();

        public final boolean a() {
            return this.f22959a.H() || this.f22960b.H();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [gc.e] */
    public c1(tk.o oVar, oc.a aVar, v vVar, o0 o0Var) {
        gc.c cVar = new gc.c();
        this.f22950i = cVar instanceof gc.e ? cVar : new gc.e(cVar);
        this.f22951j = new c<>();
        this.f22952k = new c<>();
        this.f22953l = new c<>();
        this.f22954m = new c<>();
        this.f22955n = new c<>();
        this.f22956o = new a();
        this.f22957p = new b();
        this.f22942a = oVar;
        this.f22943b = aVar;
        this.f22944c = vVar;
        this.f22945d = o0Var;
    }

    public static boolean a(c<?> cVar, BluetoothGatt bluetoothGatt, int i10, lc.m mVar) {
        if (i10 != 0) {
            cVar.f22960b.accept(new lc.l(bluetoothGatt, i10, mVar));
            return true;
        }
        return false;
    }

    public final <T> tk.i<T> b(c<T> cVar) {
        tk.i<Object> iVar = this.f22944c.f23049c;
        gc.c<T> cVar2 = cVar.f22959a;
        tk.l o10 = cVar.f22960b.o(this.f22956o);
        Objects.requireNonNull(iVar, "source1 is null");
        Objects.requireNonNull(cVar2, "source2 is null");
        Objects.requireNonNull(o10, "source3 is null");
        return tk.i.q(iVar, cVar2, o10).p(yk.a.f31786a, 3);
    }
}
