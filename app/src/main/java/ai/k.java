package ai;

import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.github.kilnn.tool.widget.SquareImageView;
import com.topstep.fitcloud.pro.databinding.ItemGameSkinBinding;
import com.topstep.fitcloud.pro.model.game.push.GameSkin;
import java.util.List;

/* loaded from: classes2.dex */
public final class k extends RecyclerView.e<a> {

    /* renamed from: d */
    public b f568d;

    /* renamed from: e */
    public List<GameSkin> f569e;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemGameSkinBinding f570u;

        public a(ItemGameSkinBinding itemGameSkinBinding) {
            super(itemGameSkinBinding.getRoot());
            this.f570u = itemGameSkinBinding;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(GameSkin gameSkin);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<GameSkin> list = this.f569e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        a aVar2 = aVar;
        List<GameSkin> list = this.f569e;
        if (list != null) {
            GameSkin gameSkin = list.get(i10);
            SquareImageView squareImageView = aVar2.f570u.img;
            gm.l.e(squareImageView, "holder.viewBind.img");
            a.f.g(squareImageView, gameSkin.getImgUrl(), 12);
            if (gameSkin.getExistLocally()) {
                aVar2.f570u.tvExist.setVisibility(0);
                aVar2.f2927a.setOnClickListener(null);
                return;
            }
            aVar2.f570u.tvExist.setVisibility(8);
            p.b.g(aVar2.f2927a, new l(aVar2, this, list));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        ItemGameSkinBinding inflate = ItemGameSkinBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate, "inflate(\n               …rent, false\n            )");
        return new a(inflate);
    }
}
