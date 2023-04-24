package ri;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.ItemPagingLoadStateBinding;
import com.topstep.fitcloudpro.R;
import l2.f2;
import l2.n0;
import l2.p0;
import mi.w;
import qi.p;
import tl.l;

/* loaded from: classes2.dex */
public final class b extends p0<a> {

    /* renamed from: e */
    public final f2<?, ?> f25752e;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemPagingLoadStateBinding f25753u;

        /* renamed from: v */
        public final fm.a<l> f25754v;

        /* renamed from: w */
        public boolean f25755w;

        public a(ItemPagingLoadStateBinding itemPagingLoadStateBinding, c cVar) {
            super(itemPagingLoadStateBinding.getRoot());
            this.f25753u = itemPagingLoadStateBinding;
            this.f25754v = cVar;
            p.b.g(itemPagingLoadStateBinding.tvMsg, new ri.a(this));
        }
    }

    public b(w wVar) {
        this.f25752e = wVar;
    }

    @Override // l2.p0
    public final a A(RecyclerView recyclerView, n0 n0Var) {
        gm.l.f(recyclerView, "parent");
        gm.l.f(n0Var, "loadState");
        ItemPagingLoadStateBinding inflate = ItemPagingLoadStateBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new a(inflate, new c(this));
    }

    @Override // l2.p0
    public final boolean y(n0 n0Var) {
        gm.l.f(n0Var, "loadState");
        return (n0Var instanceof n0.b) || (n0Var instanceof n0.a) || ((n0Var instanceof n0.c) && n0Var.f19105a);
    }

    @Override // l2.p0
    public final void z(a aVar, n0 n0Var) {
        a aVar2 = aVar;
        gm.l.f(n0Var, "loadState");
        boolean z10 = n0Var instanceof n0.a;
        aVar2.f25755w = z10;
        if (n0Var instanceof n0.b) {
            aVar2.f25753u.tvMsg.setVisibility(8);
            aVar2.f25753u.progressBar.setVisibility(0);
        } else if (n0Var instanceof n0.c) {
            aVar2.f25753u.tvMsg.setVisibility(0);
            aVar2.f25753u.progressBar.setVisibility(8);
            if (n0Var.f19105a) {
                aVar2.f25753u.tvMsg.setText(R.string.tip_load_no_more_data);
            } else {
                aVar2.f25753u.tvMsg.setText((CharSequence) null);
            }
        } else if (z10) {
            aVar2.f25753u.tvMsg.setVisibility(0);
            aVar2.f25753u.progressBar.setVisibility(8);
            TextView textView = aVar2.f25753u.tvMsg;
            Throwable th2 = ((n0.a) n0Var).f19106b;
            Context context = aVar2.f2927a.getContext();
            gm.l.e(context, "holder.itemView.context");
            textView.setText(p.g(context, th2));
        }
    }
}
