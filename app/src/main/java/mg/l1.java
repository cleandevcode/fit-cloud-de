package mg;

import com.topstep.fitcloud.pro.model.data.EcgReport;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class l1 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f21213a;

    /* renamed from: b */
    public final /* synthetic */ UUID f21214b;

    /* renamed from: c */
    public final /* synthetic */ w1 f21215c;

    public l1(w1 w1Var, List list, UUID uuid) {
        this.f21215c = w1Var;
        this.f21213a = list;
        this.f21214b = uuid;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        boolean z10;
        String e10;
        r2.f a10 = this.f21215c.f21575e.a();
        List list = this.f21213a;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            e10 = null;
        } else {
            e10 = qg.a.f24816a.b(mf.l0.d(List.class, EcgReport.class)).e(list);
        }
        if (e10 == null) {
            a10.m0(1);
        } else {
            a10.p(1, e10);
        }
        UUID uuid = this.f21214b;
        gm.l.f(uuid, "uuid");
        String uuid2 = uuid.toString();
        gm.l.e(uuid2, "uuid.toString()");
        a10.p(2, uuid2);
        this.f21215c.f21571a.c();
        try {
            a10.r();
            this.f21215c.f21571a.p();
            return tl.l.f28297a;
        } finally {
            this.f21215c.f21571a.l();
            this.f21215c.f21575e.c(a10);
        }
    }
}
