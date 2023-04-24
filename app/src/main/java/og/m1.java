package og;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel;
import mg.d9;

/* loaded from: classes2.dex */
public final class m1 implements l1 {

    /* renamed from: a */
    public final d9 f23406a;

    public m1(AppDatabase appDatabase) {
        gm.l.f(appDatabase, "appDatabase");
        this.f23406a = appDatabase.E();
    }

    @Override // og.l1
    public final Object a(long j10, int i10, bi.x0 x0Var) {
        return this.f23406a.i(j10, i10, x0Var);
    }

    @Override // og.l1
    public final Object b(long j10, int i10, String str, QrCodeSettingsViewModel.a aVar) {
        d9 d9Var = this.f23406a;
        d9Var.getClass();
        Object h10 = d9Var.h(new pg.i(i10, j10, str), aVar);
        yl.a aVar2 = yl.a.COROUTINE_SUSPENDED;
        if (h10 != aVar2) {
            h10 = tl.l.f28297a;
        }
        if (h10 == aVar2) {
            return h10;
        }
        return tl.l.f28297a;
    }
}
