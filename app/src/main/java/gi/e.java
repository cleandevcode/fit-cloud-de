package gi;

import androidx.fragment.app.r;
import com.topstep.fitcloudpro.R;
import fm.l;
import gi.d;
import gm.m;

/* loaded from: classes2.dex */
public final class e extends m implements l<Void, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ d f15358b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar) {
        super(1);
        this.f15358b = dVar;
    }

    @Override // fm.l
    public final tl.l k(Void r52) {
        d.a aVar;
        r rVar = this.f15358b.f2537v;
        if (rVar instanceof d.a) {
            aVar = (d.a) rVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.U();
        }
        d dVar = this.f15358b;
        int i10 = d.E0;
        d7.e.h((d7.e) dVar.D0.getValue(), R.string.tip_success, false, 1, 14);
        return tl.l.f28297a;
    }
}
