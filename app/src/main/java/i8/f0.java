package i8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import g8.e;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f0 implements e.a {

    /* renamed from: a */
    public final /* synthetic */ g8.e f16653a;

    /* renamed from: b */
    public final /* synthetic */ g9.h f16654b;

    /* renamed from: c */
    public final /* synthetic */ o f16655c;

    public f0(BasePendingResult basePendingResult, g9.h hVar, g0 g0Var) {
        this.f16653a = basePendingResult;
        this.f16654b = hVar;
        this.f16655c = g0Var;
    }

    @Override // g8.e.a
    public final void a(Status status) {
        boolean z10;
        if (status.f6057b <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            g8.e eVar = this.f16653a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) eVar;
            p.h("Result has already been consumed.", true ^ basePendingResult.f6068g);
            try {
                if (!basePendingResult.f6063b.await(0L, timeUnit)) {
                    basePendingResult.c(Status.f6054i);
                }
            } catch (InterruptedException unused) {
                basePendingResult.c(Status.f6052g);
            }
            p.h("Result is not ready.", basePendingResult.d());
            g8.h f10 = basePendingResult.f();
            g9.h hVar = this.f16654b;
            this.f16655c.a(f10);
            hVar.a(null);
            return;
        }
        g9.h hVar2 = this.f16654b;
        hVar2.f15034a.c(s.h1.n(status));
    }
}
