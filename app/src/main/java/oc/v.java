package oc;

import android.bluetooth.BluetoothAdapter;
import com.polidea.rxandroidble3.internal.RxBleLog;
import fl.p0;
import java.util.concurrent.atomic.AtomicReference;
import kc.m0;
import yk.a;

/* loaded from: classes.dex */
public final class v implements x {

    /* renamed from: a */
    public final gc.b<lc.g> f23047a;

    /* renamed from: b */
    public final tk.i<lc.g> f23048b;

    /* renamed from: c */
    public final tk.i<Object> f23049c;

    /* loaded from: classes.dex */
    public class a implements wk.d<Throwable> {
        @Override // wk.d
        public final void accept(Throwable th2) {
            RxBleLog.e(th2, "Failed to monitor adapter state.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public class b implements wk.d<lc.g> {
        @Override // wk.d
        public final void accept(lc.g gVar) {
            RxBleLog.v("An exception received, indicating that the adapter has became unusable.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public class c implements wk.e<Boolean, lc.g> {

        /* renamed from: a */
        public final /* synthetic */ String f23050a;

        public c(String str) {
            this.f23050a = str;
        }

        @Override // wk.e
        public final lc.g apply(Boolean bool) {
            return new lc.f(this.f23050a, new lc.a());
        }
    }

    /* loaded from: classes.dex */
    public class d implements wk.a {

        /* renamed from: a */
        public final /* synthetic */ uk.c f23051a;

        public d(al.j jVar) {
            this.f23051a = jVar;
        }

        @Override // wk.a
        public final void run() {
            this.f23051a.c();
        }
    }

    /* loaded from: classes.dex */
    public class e implements wk.e<lc.g, tk.l<?>> {
        @Override // wk.e
        public final tk.l<?> apply(lc.g gVar) {
            return tk.i.m(gVar);
        }
    }

    public v(String str, tc.l0 l0Var, tk.i<m0.b> iVar) {
        boolean z10;
        gc.b<lc.g> bVar = new gc.b<>();
        this.f23047a = bVar;
        tk.i<R> u10 = iVar.u(new w());
        BluetoothAdapter bluetoothAdapter = l0Var.f28001a;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        tk.i<R> u11 = new fl.t(u10.x(Boolean.valueOf(z10)), new gn.u()).u(new c(str));
        b bVar2 = new b();
        a.d dVar = yk.a.f31789d;
        a.c cVar = yk.a.f31788c;
        fl.m l10 = new fl.p(bVar).b().l(new d(u11.k(bVar2, dVar, cVar, cVar).y(bVar, new a(), cVar)));
        p0.j jVar = fl.p0.f14610e;
        AtomicReference atomicReference = new AtomicReference();
        fl.p0 p0Var = new fl.p0(new p0.h(atomicReference, jVar), l10, atomicReference, jVar);
        p0Var.G(dVar);
        this.f23048b = p0Var;
        this.f23049c = p0Var.o(new e());
    }

    @Override // oc.x
    public final tk.i<lc.g> a() {
        return this.f23048b;
    }
}
