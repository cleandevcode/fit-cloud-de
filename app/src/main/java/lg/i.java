package lg;

import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import java.util.Date;
import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowEcgRecords$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends zl.i implements fm.q<sm.g<? super List<? extends SimpleEcgRecord>>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19780e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19781f;

    /* renamed from: g */
    public /* synthetic */ Object f19782g;

    /* renamed from: h */
    public final /* synthetic */ d f19783h;

    /* renamed from: i */
    public final /* synthetic */ Date f19784i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xl.d dVar, d dVar2, Date date) {
        super(3, dVar);
        this.f19783h = dVar2;
        this.f19784i = date;
    }

    @Override // fm.q
    public final Object j(sm.g<? super List<? extends SimpleEcgRecord>> gVar, Long l10, xl.d<? super tl.l> dVar) {
        i iVar = new i(dVar, this.f19783h, this.f19784i);
        iVar.f19781f = gVar;
        iVar.f19782g = l10;
        return iVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f jVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19780e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19781f;
            Long l10 = (Long) this.f19782g;
            if (l10 == null) {
                jVar = new sm.i(null);
            } else {
                jVar = new j(this.f19783h.f19485c.v().b(l10.longValue(), this.f19784i));
            }
            this.f19780e = 1;
            if (bi.r.v(this, jVar, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
