package mg;

import com.topstep.fitcloud.pro.model.data.SleepItem;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public final class o6 extends m2.i<rg.o> {
    public o6(AppDatabase appDatabase) {
        super(appDatabase);
    }

    @Override // m2.a0
    public final String b() {
        return "INSERT OR REPLACE INTO `SleepDetail` (`userId`,`time`,`deepSleep`,`lightSleep`,`soberSleep`,`lastModifyTime`,`detail`,`uploadFlag`,`uploadAttempts`) VALUES (?,?,?,?,?,?,?,?,?)";
    }

    @Override // m2.i
    public final void d(r2.f fVar, rg.o oVar) {
        boolean z10;
        String e10;
        rg.o oVar2 = oVar;
        fVar.H(1, oVar2.f25630a);
        Date date = oVar2.f25631b;
        k.f.b(date, "date", date, fVar, 2);
        fVar.H(3, oVar2.f25632c);
        fVar.H(4, oVar2.f25633d);
        fVar.H(5, oVar2.f25634e);
        fVar.H(6, oVar2.f25635f);
        List<SleepItem> list = oVar2.f25636g;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            e10 = null;
        } else {
            e10 = qg.a.f24816a.b(mf.l0.d(List.class, SleepItem.class)).e(list);
        }
        if (e10 == null) {
            fVar.m0(7);
        } else {
            fVar.p(7, e10);
        }
        fVar.H(8, oVar2.f25637h);
        fVar.H(9, oVar2.f25638i);
    }
}
