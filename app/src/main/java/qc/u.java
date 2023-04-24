package qc;

import android.bluetooth.BluetoothGatt;
import com.polidea.rxandroidble3.internal.RxBleLog;
import fl.g;
import kc.v0;

/* loaded from: classes.dex */
public final class u implements tk.r<BluetoothGatt> {

    /* renamed from: a */
    public final /* synthetic */ tk.j f24762a;

    /* renamed from: b */
    public final /* synthetic */ w.d f24763b;

    /* renamed from: c */
    public final /* synthetic */ v f24764c;

    public u(v vVar, g.a aVar, w.d dVar) {
        this.f24764c = vVar;
        this.f24762a = aVar;
        this.f24763b = dVar;
    }

    @Override // tk.r, tk.b, tk.g
    public final void a(uk.c cVar) {
    }

    @Override // tk.r, tk.b, tk.g
    public final void onError(Throwable th2) {
        RxBleLog.w(th2, "Disconnect operation has been executed but finished with an error - considering disconnected.", new Object[0]);
        v vVar = this.f24764c;
        tk.j jVar = this.f24762a;
        w.d dVar = this.f24763b;
        vVar.f24771g.a(v0.b.DISCONNECTED);
        dVar.e();
        ((g.a) jVar).b();
    }

    @Override // tk.r, tk.g
    public final void onSuccess(Object obj) {
        ((BluetoothGatt) obj).close();
        v vVar = this.f24764c;
        tk.j jVar = this.f24762a;
        w.d dVar = this.f24763b;
        vVar.f24771g.a(v0.b.DISCONNECTED);
        dVar.e();
        ((g.a) jVar).b();
    }
}
