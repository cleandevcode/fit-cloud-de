package ah;

import com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig;
import com.topstep.fitcloud.pro.shared.data.wh.WhRemindConfig;
import fm.r;
import mf.a0;
import tl.l;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.wh.WomenHealthRepositoryImpl$flowWomenHealthConfig$1", f = "WomenHealthRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements r<Integer, WhRemindConfig, WhMenstruationConfig, xl.d<? super gg.b>, Object> {

    /* renamed from: e */
    public /* synthetic */ int f480e;

    /* renamed from: f */
    public /* synthetic */ WhRemindConfig f481f;

    /* renamed from: g */
    public /* synthetic */ WhMenstruationConfig f482g;

    /* renamed from: h */
    public final /* synthetic */ e f483h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, xl.d<? super d> dVar) {
        super(4, dVar);
        this.f483h = eVar;
    }

    @Override // fm.r
    public final Object s(Integer num, WhRemindConfig whRemindConfig, WhMenstruationConfig whMenstruationConfig, xl.d<? super gg.b> dVar) {
        int intValue = num.intValue();
        d dVar2 = new d(this.f483h, dVar);
        dVar2.f480e = intValue;
        dVar2.f481f = whRemindConfig;
        dVar2.f482g = whMenstruationConfig;
        return dVar2.t(l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        a0.k(obj);
        int i10 = this.f480e;
        WhRemindConfig whRemindConfig = this.f481f;
        WhMenstruationConfig whMenstruationConfig = this.f482g;
        this.f483h.getClass();
        return new gg.b(i10, whRemindConfig.f10111a, whRemindConfig.f10112b, whRemindConfig.f10113c, whRemindConfig.f10114d, whMenstruationConfig.f10104a, whMenstruationConfig.f10105b, whMenstruationConfig.f10106c);
    }
}
