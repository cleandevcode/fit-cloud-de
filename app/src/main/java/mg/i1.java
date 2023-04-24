package mg;

import com.topstep.fitcloud.pro.model.data.SportRecord;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class i1 implements fm.l {

    /* renamed from: a */
    public final /* synthetic */ int f21109a;

    /* renamed from: b */
    public final /* synthetic */ long f21110b;

    /* renamed from: c */
    public final /* synthetic */ Object f21111c;

    /* renamed from: d */
    public final /* synthetic */ Object f21112d;

    public /* synthetic */ i1(Object obj, long j10, Object obj2, int i10) {
        this.f21109a = i10;
        this.f21112d = obj;
        this.f21110b = j10;
        this.f21111c = obj2;
    }

    @Override // fm.l
    public final Object k(Object obj) {
        Object i10;
        switch (this.f21109a) {
            case 0:
                i10 = super/*mg.h1*/.i(this.f21110b, (List) this.f21111c, (xl.d) obj);
                return i10;
            case 1:
                a6 a6Var = (a6) this.f21112d;
                a6Var.getClass();
                return y4.v(a6Var, this.f21110b, (List) this.f21111c, (xl.d) obj);
            case 2:
                h7 h7Var = (h7) this.f21112d;
                h7Var.getClass();
                return d7.u(h7Var, this.f21110b, (SportRecord) this.f21111c, (xl.d) obj);
            default:
                la laVar = (la) this.f21112d;
                laVar.getClass();
                return l9.t(laVar, this.f21110b, (List) this.f21111c, (xl.d) obj);
        }
    }
}
