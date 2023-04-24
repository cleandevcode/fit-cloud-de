package mi;

import com.topstep.fitcloud.pro.model.data.SportRecord;
import com.topstep.fitcloud.pro.ui.sport.SportHistoryViewModel;
import java.text.SimpleDateFormat;
import mi.z;

@zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportHistoryViewModel$flow$1$2", f = "SportHistoryFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b0 extends zl.i implements fm.q<z.a, z.a, xl.d<? super z>, Object> {

    /* renamed from: e */
    public /* synthetic */ z.a f21799e;

    /* renamed from: f */
    public /* synthetic */ z.a f21800f;

    /* renamed from: g */
    public final /* synthetic */ SportHistoryViewModel f21801g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(SportHistoryViewModel sportHistoryViewModel, xl.d<? super b0> dVar) {
        super(3, dVar);
        this.f21801g = sportHistoryViewModel;
    }

    @Override // fm.q
    public final Object j(z.a aVar, z.a aVar2, xl.d<? super z> dVar) {
        b0 b0Var = new b0(this.f21801g, dVar);
        b0Var.f21799e = aVar;
        b0Var.f21800f = aVar2;
        return b0Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        String format;
        mf.a0.k(obj);
        z.a aVar = this.f21799e;
        z.a aVar2 = this.f21800f;
        if (aVar2 == null) {
            return null;
        }
        if (aVar == null) {
            format = null;
        } else {
            w.d dVar = this.f21801g.f12178d;
            SportRecord sportRecord = aVar.f21875a;
            dVar.getClass();
            gm.l.f(sportRecord, "record");
            format = ((SimpleDateFormat) dVar.f29489a).format(sportRecord.f9628b);
            gm.l.e(format, "recordSeparatorKeyFormatter.format(record.time)");
        }
        w.d dVar2 = this.f21801g.f12178d;
        SportRecord sportRecord2 = aVar2.f21875a;
        dVar2.getClass();
        gm.l.f(sportRecord2, "record");
        String format2 = ((SimpleDateFormat) dVar2.f29489a).format(sportRecord2.f9628b);
        gm.l.e(format2, "recordSeparatorKeyFormatter.format(record.time)");
        if (gm.l.a(format, format2)) {
            return null;
        }
        return new z.b(format2);
    }
}
