package qh;

import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import bi.m0;
import com.topstep.fitcloud.pro.databinding.ItemBaseHealthBinding;
import gm.l;
import java.text.SimpleDateFormat;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a<T> extends RecyclerView.e<C0450a> {

    /* renamed from: d */
    public final SimpleDateFormat f24817d = m0.l();

    /* renamed from: e */
    public List<? extends T> f24818e;

    /* renamed from: f */
    public mh.a<T> f24819f;

    /* renamed from: qh.a$a */
    /* loaded from: classes2.dex */
    public static final class C0450a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemBaseHealthBinding f24820u;

        public C0450a(ItemBaseHealthBinding itemBaseHealthBinding) {
            super(itemBaseHealthBinding.getRoot());
            this.f24820u = itemBaseHealthBinding;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<? extends T> list = this.f24818e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        l.f(recyclerView, "parent");
        ItemBaseHealthBinding inflate = ItemBaseHealthBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        l.e(inflate, "inflate(\n               …rent, false\n            )");
        return new C0450a(inflate);
    }
}
