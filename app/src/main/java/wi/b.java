package wi;

import android.bluetooth.BluetoothGattCharacteristic;
import kc.v0;

/* loaded from: classes2.dex */
public interface b {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final v0 f29861a;

        /* renamed from: b */
        public final String f29862b;

        /* renamed from: c */
        public final vi.a f29863c;

        /* renamed from: d */
        public final ql.b<bj.b> f29864d;

        /* renamed from: e */
        public volatile int f29865e;

        /* renamed from: f */
        public volatile BluetoothGattCharacteristic f29866f;

        /* renamed from: g */
        public volatile tk.i<byte[]> f29867g;

        public a(v0 v0Var, String str, vi.a aVar, ql.b<bj.b> bVar) {
            gm.l.f(v0Var, "rxBleConnection");
            gm.l.f(aVar, "connectorThreadProvider");
            this.f29861a = v0Var;
            this.f29862b = str;
            this.f29863c = aVar;
            this.f29864d = bVar;
            this.f29865e = 20;
        }
    }

    void a(lc.f fVar);

    <T> tk.i<T> b(zi.b<T> bVar);
}
