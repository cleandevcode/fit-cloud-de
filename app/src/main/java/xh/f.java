package xh;

import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.kilnn.tool.widget.DotTextView;
import com.topstep.fitcloud.pro.databinding.ItemDialComponentStyleBinding;
import java.util.List;

/* loaded from: classes2.dex */
public final class f extends RecyclerView.e<b> {

    /* renamed from: d */
    public int f30560d;

    /* renamed from: e */
    public List<String> f30561e;

    /* renamed from: f */
    public a f30562f;

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i10);
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemDialComponentStyleBinding f30563u;

        public b(ItemDialComponentStyleBinding itemDialComponentStyleBinding) {
            super(itemDialComponentStyleBinding.getRoot());
            this.f30563u = itemDialComponentStyleBinding;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<String> list = this.f30561e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(b bVar, int i10) {
        boolean z10;
        b bVar2 = bVar;
        List<String> list = this.f30561e;
        if (list != null) {
            ImageView imageView = bVar2.f30563u.imgView;
            gm.l.e(imageView, "holder.viewBind.imgView");
            a.f.g(imageView, list.get(i10), 12);
            DotTextView dotTextView = bVar2.f30563u.dotView;
            gm.l.e(dotTextView, "holder.viewBind.dotView");
            int i11 = 0;
            if (this.f30560d != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = 4;
            }
            dotTextView.setVisibility(i11);
            p.b.g(bVar2.f2927a, new g(bVar2, this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        ItemDialComponentStyleBinding inflate = ItemDialComponentStyleBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new b(inflate);
    }
}
