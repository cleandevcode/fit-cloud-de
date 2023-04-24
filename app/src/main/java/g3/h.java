package g3;

import androidx.work.impl.WorkDatabase;
import m2.t;

/* loaded from: classes.dex */
public final class h extends t.b {
    @Override // m2.t.b
    public final void a(s2.a aVar) {
        gm.l.f(aVar, "db");
        aVar.i();
        try {
            int i10 = WorkDatabase.f3652n;
            aVar.o("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f3651m) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            aVar.K();
        } finally {
            aVar.Y();
        }
    }
}
