package dj;

import dj.f;
import fm.l;
import gm.m;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import lc.n;

/* loaded from: classes2.dex */
public final class e extends m implements l<Throwable, tk.l<? extends Object>> {

    /* renamed from: b */
    public final /* synthetic */ f.a f13106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f.a aVar) {
        super(1);
        this.f13106b = aVar;
    }

    @Override // fm.l
    public final tk.l<? extends Object> k(Throwable th2) {
        long j10;
        Throwable th3 = th2;
        f.a aVar = this.f13106b;
        if (!aVar.f13116c && (th3 instanceof n)) {
            n nVar = (n) th3;
            if (nVar.f19437a == 2147483646) {
                aVar.f13116c = true;
                Date date = nVar.f19438b;
                if (date != null) {
                    j10 = date.getTime() - System.currentTimeMillis();
                } else {
                    j10 = 0;
                }
                if (j10 <= 0 || j10 > 30000) {
                    f.a aVar2 = this.f13106b;
                    j10 = aVar2.f13115b.toMillis(aVar2.f13114a);
                    if (j10 > 30000) {
                        j10 = 30000;
                    }
                }
                return tk.i.D(j10, TimeUnit.MILLISECONDS);
            }
        }
        return tk.i.m(th3);
    }
}
