package fi;

import a5.k;
import a5.m;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.n;
import com.topstep.fitcloud.pro.databinding.ItemFriendListBinding;
import com.topstep.fitcloud.pro.model.config.UserInfo;
import com.topstep.fitcloudpro.R;
import gm.l;
import java.util.List;
import qi.h;

/* loaded from: classes2.dex */
public final class f extends RecyclerView.e<a> {

    /* renamed from: d */
    public List<UserInfo> f14294d;

    /* renamed from: e */
    public b f14295e;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemFriendListBinding f14296u;

        public a(ItemFriendListBinding itemFriendListBinding) {
            super(itemFriendListBinding.getRoot());
            this.f14296u = itemFriendListBinding;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(UserInfo userInfo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<UserInfo> list = this.f14294d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        a aVar2 = aVar;
        List<UserInfo> list = this.f14294d;
        if (list != null) {
            UserInfo userInfo = list.get(i10);
            Context context = aVar2.f2927a.getContext();
            l.e(context, "context");
            String avatar = userInfo.getAvatar();
            ImageView imageView = aVar2.f14296u.imgAvatar;
            l.e(imageView, "holder.viewBind.imgAvatar");
            n<Drawable> x10 = com.bumptech.glide.b.c(context).b(context).k(avatar).x(i5.g.w(R.drawable.ic_user_avatar));
            x10.getClass();
            ((n) x10.r(m.f293b, new k())).A(imageView);
            aVar2.f14296u.tvNickName.setText(userInfo.getNickName());
            aVar2.f14296u.tvTime.setText(h.f(context, R.string.user_info_id, userInfo.getIdentityId()));
            p.b.g(aVar2.f2927a, new g(aVar2, this, list));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        l.f(recyclerView, "parent");
        ItemFriendListBinding inflate = ItemFriendListBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        l.e(inflate, "inflate(\n               …rent, false\n            )");
        return new a(inflate);
    }
}
