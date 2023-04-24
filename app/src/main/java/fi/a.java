package fi;

import a5.k;
import a5.m;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import bi.m0;
import com.bumptech.glide.n;
import com.topstep.fitcloud.pro.databinding.ItemFriendListBinding;
import com.topstep.fitcloud.pro.model.friend.Friend;
import com.topstep.fitcloudpro.R;
import gm.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<C0254a> {

    /* renamed from: d */
    public SimpleDateFormat f14277d;

    /* renamed from: e */
    public List<Friend> f14278e;

    /* renamed from: f */
    public b f14279f;

    /* renamed from: fi.a$a */
    /* loaded from: classes2.dex */
    public static final class C0254a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemFriendListBinding f14280u;

        public C0254a(ItemFriendListBinding itemFriendListBinding) {
            super(itemFriendListBinding.getRoot());
            this.f14280u = itemFriendListBinding;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(Friend friend);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<Friend> list = this.f14278e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(C0254a c0254a, int i10) {
        C0254a c0254a2 = c0254a;
        List<Friend> list = this.f14278e;
        if (list != null) {
            Friend friend = list.get(i10);
            Context context = c0254a2.f2927a.getContext();
            l.e(context, "context");
            String avatar = friend.getAvatar();
            ImageView imageView = c0254a2.f14280u.imgAvatar;
            l.e(imageView, "holder.viewBind.imgAvatar");
            n<Drawable> x10 = com.bumptech.glide.b.c(context).b(context).k(avatar).x(i5.g.w(R.drawable.ic_user_avatar));
            x10.getClass();
            ((n) x10.r(m.f293b, new k())).A(imageView);
            c0254a2.f14280u.tvNickName.setText(friend.getDisplayName());
            if (friend.getLastUpdateTime() > 0) {
                SimpleDateFormat simpleDateFormat = this.f14277d;
                if (simpleDateFormat == null) {
                    simpleDateFormat = m0.n();
                    this.f14277d = simpleDateFormat;
                }
                c0254a2.f14280u.tvTime.setText(context.getString(R.string.friends_last_update_time, simpleDateFormat.format(new Date(friend.getLastUpdateTime()))));
            } else {
                c0254a2.f14280u.tvTime.setText((CharSequence) null);
            }
            p.b.g(c0254a2.f2927a, new fi.b(c0254a2, this, list));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        l.f(recyclerView, "parent");
        ItemFriendListBinding inflate = ItemFriendListBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        l.e(inflate, "inflate(\n               …rent, false\n            )");
        return new C0254a(inflate);
    }
}
