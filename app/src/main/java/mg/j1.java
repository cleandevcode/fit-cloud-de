package mg;

import com.topstep.fitcloud.pro.shared.data.bean.data.EcgRecordBean;
import com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class j1 implements fm.l {

    /* renamed from: a */
    public final /* synthetic */ int f21152a;

    /* renamed from: b */
    public final /* synthetic */ long f21153b;

    /* renamed from: c */
    public final /* synthetic */ Object f21154c;

    /* renamed from: d */
    public final /* synthetic */ Object f21155d;

    public /* synthetic */ j1(Object obj, long j10, Object obj2, int i10) {
        this.f21152a = i10;
        this.f21154c = obj;
        this.f21153b = j10;
        this.f21155d = obj2;
    }

    @Override // fm.l
    public final Object k(Object obj) {
        Object j10;
        switch (this.f21152a) {
            case 0:
                j10 = super/*mg.h1*/.j(this.f21153b, (EcgRecordBean) this.f21155d, (xl.d) obj);
                return j10;
            case 1:
                j3 j3Var = (j3) this.f21154c;
                j3Var.getClass();
                return c3.n(j3Var, this.f21153b, (WhMenstruationConfig) this.f21155d, (xl.d) obj);
            default:
                la laVar = (la) this.f21154c;
                laVar.getClass();
                return l9.v(laVar, this.f21153b, (List) this.f21155d, (xl.d) obj);
        }
    }
}
