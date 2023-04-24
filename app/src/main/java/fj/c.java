package fj;

import fm.l;
import gm.m;
import java.util.concurrent.TimeUnit;
import p000do.a;
import tk.i;

/* loaded from: classes2.dex */
public final class c extends m implements l<Throwable, tk.l<? extends Object>> {

    /* renamed from: b */
    public final /* synthetic */ d f14307b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(1);
        this.f14307b = dVar;
    }

    @Override // fm.l
    public final tk.l<? extends Object> k(Throwable th2) {
        Throwable th3 = th2;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#ObservableRetryDelay");
        boolean z10 = true;
        bVar.r(th3, "retryNum:%d", Integer.valueOf(this.f14307b.f14310c));
        d dVar = this.f14307b;
        int i10 = dVar.f14310c + 1;
        dVar.f14310c = i10;
        if (i10 <= 3) {
            wk.f<Throwable> fVar = dVar.f14309b;
            if (!((fVar == null || fVar.test(th3)) ? false : false)) {
                return i.D(this.f14307b.f14308a, TimeUnit.MILLISECONDS);
            }
        }
        return i.m(th3);
    }
}
