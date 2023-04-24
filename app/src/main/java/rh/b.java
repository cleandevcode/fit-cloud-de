package rh;

import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import java.util.List;
import qh.a;

/* loaded from: classes2.dex */
public final class b extends qh.a<SimpleEcgRecord> {
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a.C0450a c0450a, int i10) {
        a.C0450a c0450a2 = c0450a;
        List<? extends T> list = this.f24818e;
        if (list != 0) {
            c0450a2.f24820u.tvTime.setText(bi.m0.n().format(((SimpleEcgRecord) list.get(i10)).f9596b));
            p.b.g(c0450a2.f2927a, new a(c0450a2, this, list));
        }
    }
}
