package ij;

import android.bluetooth.BluetoothDevice;
import ij.c;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import jj.g1;

/* loaded from: classes2.dex */
public final class i extends gm.m implements fm.l<File, tk.t<? extends c.C0298c>> {

    /* renamed from: b */
    public final /* synthetic */ c f17058b;

    /* renamed from: c */
    public final /* synthetic */ int f17059c;

    /* renamed from: d */
    public final /* synthetic */ int f17060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, int i10, int i11) {
        super(1);
        this.f17058b = cVar;
        this.f17059c = i10;
        this.f17060d = i11;
    }

    @Override // fm.l
    public final tk.t<? extends c.C0298c> k(File file) {
        tk.c cVar;
        tk.p e10;
        File file2 = file;
        this.f17058b.f17042i.b(new c.a(4, -1));
        c cVar2 = this.f17058b;
        Object obj = cVar2.f17040g;
        if (obj == null) {
            obj = new q(cVar2.f17035b);
        }
        int i10 = this.f17059c;
        int i11 = this.f17060d;
        q qVar = (q) obj;
        gm.k.b(i10, "dfuMode");
        gm.k.b(i11, "dfuType");
        if (qVar.f17070a.f() == wi.d.CONNECTED) {
            gl.p pVar = new gl.p(h7.a.w(qVar.f17070a.l().f17917a, new bj.b((byte) 1, (byte) 1, null), new bj.b((byte) 1, (byte) 2, null)), new wi.h(7, g1.f17898b));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            il.b bVar = pl.a.f24280b;
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(bVar, "scheduler is null");
            cVar = new bl.e(new fj.f(new gl.p(new gl.d(pVar, timeUnit, bVar), new wi.i(1, o.f17068b)), new ph.p(7, p.f17069b)));
        } else {
            cVar = bl.b.f4448a;
        }
        BluetoothDevice d10 = qVar.f17070a.d();
        if (d10 == null) {
            e10 = tk.p.d(new yi.c(4, 2, null, null));
        } else {
            e10 = tk.p.e(d10);
        }
        cVar.getClass();
        return new gl.p(new gl.e(e10, cVar), new ph.p(6, new h(file2)));
    }
}
