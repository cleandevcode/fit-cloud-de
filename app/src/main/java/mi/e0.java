package mi;

import com.topstep.fitcloud.pro.ui.sport.SportingActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class e0 implements androidx.lifecycle.b0 {

    /* renamed from: a */
    public final /* synthetic */ int f21812a;

    /* renamed from: b */
    public final /* synthetic */ fm.l f21813b;

    public /* synthetic */ e0(int i10, fm.l lVar) {
        this.f21812a = i10;
        this.f21813b = lVar;
    }

    @Override // androidx.lifecycle.b0
    public final void a(Object obj) {
        switch (this.f21812a) {
            case 0:
                fm.l lVar = this.f21813b;
                SportingActivity.a aVar = SportingActivity.X;
                gm.l.f(lVar, "$tmp0");
                lVar.k(obj);
                return;
            default:
                this.f21813b.k(obj);
                return;
        }
    }
}
