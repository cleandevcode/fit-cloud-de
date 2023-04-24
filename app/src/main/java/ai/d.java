package ai;

import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.github.kilnn.tool.widget.SquareImageView;
import com.topstep.fitcloud.pro.databinding.ItemGamePacketBinding;
import com.topstep.fitcloud.pro.model.game.push.GamePacket;
import java.util.List;

/* loaded from: classes2.dex */
public final class d extends RecyclerView.e<a> {

    /* renamed from: d */
    public b f536d;

    /* renamed from: e */
    public List<GamePacket> f537e;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemGamePacketBinding f538u;

        public a(ItemGamePacketBinding itemGamePacketBinding) {
            super(itemGamePacketBinding.getRoot());
            this.f538u = itemGamePacketBinding;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(GamePacket gamePacket);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<GamePacket> list = this.f537e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        a aVar2 = aVar;
        List<GamePacket> list = this.f537e;
        if (list != null) {
            GamePacket gamePacket = list.get(i10);
            SquareImageView squareImageView = aVar2.f538u.img;
            gm.l.e(squareImageView, "holder.viewBind.img");
            a.f.g(squareImageView, gamePacket.f9690e, 12);
            aVar2.f538u.tvName.setText(gamePacket.f9687b);
            p.b.g(aVar2.f2927a, new e(aVar2, this, list));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        ItemGamePacketBinding inflate = ItemGamePacketBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new a(inflate);
    }
}
