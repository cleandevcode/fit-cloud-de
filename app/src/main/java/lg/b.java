package lg;

import com.topstep.fitcloud.pro.model.data.SportRecord;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import mg.d7;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a */
    public final d7 f19472a;

    public b(AppDatabase appDatabase) {
        gm.l.f(appDatabase, "appDatabase");
        this.f19472a = appDatabase.C();
    }

    @Override // lg.a
    public final Object a(long j10, SportRecord sportRecord, xl.d<? super tl.l> dVar) {
        Object t10 = this.f19472a.t(j10, sportRecord, dVar);
        return t10 == yl.a.COROUTINE_SUSPENDED ? t10 : tl.l.f28297a;
    }
}
