package ci;

import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.ItemDirectoryInfoBinding;
import com.topstep.fitcloudpro.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class o extends RecyclerView.e<a> {

    /* renamed from: d */
    public List<n> f4810d;

    /* renamed from: e */
    public b f4811e;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemDirectoryInfoBinding f4812u;

        public a(ItemDirectoryInfoBinding itemDirectoryInfoBinding) {
            super(itemDirectoryInfoBinding.getRoot());
            this.f4812u = itemDirectoryInfoBinding;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<n> list = this.f4810d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        boolean z10;
        a aVar2 = aVar;
        List<n> list = this.f4810d;
        if (list != null) {
            n nVar = list.get(i10);
            String str = nVar.f4807a;
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                aVar2.f4812u.tvName.setText(R.string.ds_song_unknown);
            } else {
                aVar2.f4812u.tvName.setText(nVar.f4807a);
            }
            p.b.g(aVar2.f2927a, new p(this, aVar2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        ItemDirectoryInfoBinding inflate = ItemDirectoryInfoBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate, "inflate(\n               …rent, false\n            )");
        return new a(inflate);
    }
}
