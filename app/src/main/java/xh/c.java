package xh;

import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.ItemDialComponentBinding;
import com.topstep.fitcloud.pro.model.dial.DialComponent;
import com.topstep.fitcloud.pro.model.dial.DialSpacePacket;
import java.util.List;

/* loaded from: classes2.dex */
public final class c extends RecyclerView.e<a> {

    /* renamed from: d */
    public sj.e f30549d = new sj.e(0, 240, 240, 0);

    /* renamed from: e */
    public List<DialSpacePacket> f30550e;

    /* renamed from: f */
    public b f30551f;

    /* renamed from: g */
    public int f30552g;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemDialComponentBinding f30553u;

        public a(ItemDialComponentBinding itemDialComponentBinding) {
            super(itemDialComponentBinding.getRoot());
            this.f30553u = itemDialComponentBinding;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i10, DialSpacePacket dialSpacePacket);

        void b(int i10, DialSpacePacket dialSpacePacket);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<DialSpacePacket> list = this.f30550e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        boolean z10;
        int i11;
        a aVar2 = aVar;
        List<DialSpacePacket> list = this.f30550e;
        if (list != null) {
            DialSpacePacket dialSpacePacket = list.get(i10);
            aVar2.f30553u.cardView.setShape(this.f30549d);
            p.b.g(aVar2.f30553u.imgView, new d(aVar2, this, list));
            ImageView imageView = aVar2.f30553u.imgView;
            gm.l.e(imageView, "holder.viewBind.imgView");
            a.f.g(imageView, dialSpacePacket.getImgUrl(), 12);
            ImageView imageView2 = aVar2.f30553u.imgSelect;
            gm.l.e(imageView2, "holder.viewBind.imgSelect");
            boolean z11 = true;
            if (this.f30552g == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView2.setVisibility(i11);
            List<DialComponent> components = dialSpacePacket.getComponents();
            if (components != null && !components.isEmpty()) {
                z11 = false;
            }
            if (z11) {
                aVar2.f30553u.imgEdit.setVisibility(4);
                aVar2.f30553u.imgEdit.setOnClickListener(null);
                return;
            }
            aVar2.f30553u.imgEdit.setVisibility(0);
            p.b.g(aVar2.f30553u.imgEdit, new e(aVar2, this, list));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        ItemDialComponentBinding inflate = ItemDialComponentBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new a(inflate);
    }
}
