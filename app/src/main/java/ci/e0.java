package ci;

import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.ItemSongInfoBinding;
import java.util.List;

/* loaded from: classes2.dex */
public final class e0 extends RecyclerView.e<a> {

    /* renamed from: d */
    public List<? extends xc.a> f4753d;

    /* renamed from: e */
    public mh.b<xc.a> f4754e;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemSongInfoBinding f4755u;

        public a(ItemSongInfoBinding itemSongInfoBinding) {
            super(itemSongInfoBinding.getRoot());
            this.f4755u = itemSongInfoBinding;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<? extends xc.a> list = this.f4753d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        a aVar2 = aVar;
        List<? extends xc.a> list = this.f4753d;
        if (list != null) {
            aVar2.f4755u.tvName.setText(list.get(i10).f30469d);
            p.b.g(aVar2.f4755u.imgDelete, new f0(aVar2, this, list));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        ItemSongInfoBinding inflate = ItemSongInfoBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate, "inflate(\n               …rent, false\n            )");
        return new a(inflate);
    }
}
