package m2;

import android.os.CancellationSignal;
import pm.g1;
import pm.z1;

/* loaded from: classes.dex */
public final class d extends gm.m implements fm.l<Throwable, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ CancellationSignal f20189b;

    /* renamed from: c */
    public final /* synthetic */ g1 f20190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CancellationSignal cancellationSignal, z1 z1Var) {
        super(1);
        this.f20189b = cancellationSignal;
        this.f20190c = z1Var;
    }

    @Override // fm.l
    public final tl.l k(Throwable th2) {
        this.f20189b.cancel();
        this.f20190c.h(null);
        return tl.l.f28297a;
    }
}
