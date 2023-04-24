package qh;

import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.m0;
import com.topstep.fitcloud.pro.databinding.ItemTemperatureBinding;
import com.topstep.fitcloudpro.R;
import gm.l;
import java.text.SimpleDateFormat;
import java.util.List;
import n6.a0;
import vf.r;

/* loaded from: classes2.dex */
public final class j extends RecyclerView.e<a> {

    /* renamed from: d */
    public final boolean f24833d;

    /* renamed from: e */
    public final SimpleDateFormat f24834e = m0.l();

    /* renamed from: f */
    public List<r> f24835f;

    /* renamed from: g */
    public mh.a<r> f24836g;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemTemperatureBinding f24837u;

        public a(ItemTemperatureBinding itemTemperatureBinding) {
            super(itemTemperatureBinding.getRoot());
            this.f24837u = itemTemperatureBinding;
        }
    }

    public j(boolean z10) {
        this.f24833d = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<r> list = this.f24835f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        TextView textView;
        int i11;
        a aVar2 = aVar;
        List<r> list = this.f24835f;
        if (list != null) {
            r rVar = list.get(i10);
            aVar2.f24837u.tvTime.setText(this.f24834e.format(rVar.f29322a));
            aVar2.f24837u.tvBodyValue.setText(a0.p(rVar.f29323b, this.f24833d));
            aVar2.f24837u.tvWristValue.setText(a0.p(rVar.f29324c, this.f24833d));
            if (this.f24833d) {
                textView = aVar2.f24837u.tvBodyUnit;
                i11 = R.string.unit_centigrade;
            } else {
                textView = aVar2.f24837u.tvBodyUnit;
                i11 = R.string.unit_fahrenheit;
            }
            textView.setText(i11);
            aVar2.f24837u.tvWristUnit.setText(i11);
            p.b.g(aVar2.f2927a, new k(aVar2, this, list));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        l.f(recyclerView, "parent");
        ItemTemperatureBinding inflate = ItemTemperatureBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        l.e(inflate, "inflate(\n               …rent, false\n            )");
        return new a(inflate);
    }
}
