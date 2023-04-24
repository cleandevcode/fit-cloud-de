package ah;

import bi.r;
import fm.q;
import mf.a0;
import sm.g;
import tl.l;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.wh.WomenHealthRepositoryImpl$flowCurrent$lambda$1$$inlined$flatMapLatest$1", f = "WomenHealthRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements q<g<? super gg.b>, Integer, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f475e;

    /* renamed from: f */
    public /* synthetic */ g f476f;

    /* renamed from: g */
    public /* synthetic */ Object f477g;

    /* renamed from: h */
    public final /* synthetic */ e f478h;

    /* renamed from: i */
    public final /* synthetic */ Long f479i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xl.d dVar, e eVar, Long l10) {
        super(3, dVar);
        this.f478h = eVar;
        this.f479i = l10;
    }

    @Override // fm.q
    public final Object j(g<? super gg.b> gVar, Integer num, xl.d<? super l> dVar) {
        c cVar = new c(dVar, this.f478h, this.f479i);
        cVar.f476f = gVar;
        cVar.f477g = num;
        return cVar.t(l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f k10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f475e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            g gVar = this.f476f;
            Integer num = (Integer) this.f477g;
            if (num == null) {
                k10 = new sm.i(null);
            } else {
                k10 = this.f478h.k(num.intValue(), this.f479i.longValue());
            }
            this.f475e = 1;
            if (r.v(this, k10, gVar) == aVar) {
                return aVar;
            }
        }
        return l.f28297a;
    }
}
