package qh;

import com.topstep.fitcloudpro.R;
import java.util.List;
import n6.a0;
import qh.a;

/* loaded from: classes2.dex */
public final class c extends a<vf.c> {
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a.C0450a c0450a, int i10) {
        a.C0450a c0450a2 = c0450a;
        List<? extends T> list = this.f24818e;
        if (list != 0) {
            vf.c cVar = (vf.c) list.get(i10);
            c0450a2.f24820u.tvTime.setText(this.f24817d.format(cVar.f29268a));
            c0450a2.f24820u.tvUnit.setText(R.string.unit_mmhg);
            c0450a2.f24820u.tvValue.setText(a0.a(cVar.f29269b, cVar.f29270c));
            p.b.g(c0450a2.f2927a, new b(c0450a2, this, list));
        }
    }
}
