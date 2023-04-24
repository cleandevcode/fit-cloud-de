package mg;

import com.topstep.fitcloud.pro.shared.data.bean.data.SleepRecordBean;
import com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class a5 implements fm.l {

    /* renamed from: a */
    public final /* synthetic */ int f20661a;

    /* renamed from: b */
    public final /* synthetic */ long f20662b;

    /* renamed from: c */
    public final /* synthetic */ Object f20663c;

    /* renamed from: d */
    public final /* synthetic */ Object f20664d;

    public /* synthetic */ a5(Object obj, long j10, Object obj2, int i10) {
        this.f20661a = i10;
        this.f20663c = obj;
        this.f20662b = j10;
        this.f20664d = obj2;
    }

    @Override // fm.l
    public final Object k(Object obj) {
        switch (this.f20661a) {
            case 0:
                a6 a6Var = (a6) this.f20663c;
                a6Var.getClass();
                return y4.t(a6Var, this.f20662b, (List) this.f20664d, (xl.d) obj);
            case 1:
                c7 c7Var = (c7) this.f20663c;
                c7Var.getClass();
                return c6.t(c7Var, this.f20662b, (SleepRecordBean) this.f20664d, (xl.d) obj);
            default:
                s8 s8Var = (s8) this.f20663c;
                s8Var.getClass();
                return v7.u(s8Var, this.f20662b, (StepRecordEntity) this.f20664d, (xl.d) obj);
        }
    }
}
