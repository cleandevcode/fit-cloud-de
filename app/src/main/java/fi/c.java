package fi;

import a5.k;
import a5.m;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.m0;
import com.bumptech.glide.n;
import com.topstep.fitcloud.pro.databinding.ItemFriendMsgBinding;
import com.topstep.fitcloud.pro.model.friend.FriendMsg;
import com.topstep.fitcloudpro.R;
import gm.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public final class c extends RecyclerView.e<a> {

    /* renamed from: d */
    public SimpleDateFormat f14284d;

    /* renamed from: e */
    public List<FriendMsg> f14285e;

    /* renamed from: f */
    public b f14286f;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemFriendMsgBinding f14287u;

        public a(ItemFriendMsgBinding itemFriendMsgBinding) {
            super(itemFriendMsgBinding.getRoot());
            this.f14287u = itemFriendMsgBinding;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i10, FriendMsg friendMsg);

        void b(int i10, FriendMsg friendMsg);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<FriendMsg> list = this.f14285e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        a aVar2 = aVar;
        List<FriendMsg> list = this.f14285e;
        if (list != null) {
            FriendMsg friendMsg = list.get(i10);
            Context context = aVar2.f2927a.getContext();
            l.e(context, "context");
            String str = friendMsg.f9678d;
            ImageView imageView = aVar2.f14287u.imgAvatar;
            l.e(imageView, "holder.viewBind.imgAvatar");
            n<Drawable> x10 = com.bumptech.glide.b.c(context).b(context).k(str).x(i5.g.w(R.drawable.ic_user_avatar));
            x10.getClass();
            ((n) x10.r(m.f293b, new k())).A(imageView);
            aVar2.f14287u.tvNickName.setText(friendMsg.f9677c);
            aVar2.f14287u.tvMessage.setText(friendMsg.f9681g);
            TextView textView = aVar2.f14287u.tvTime;
            Object[] objArr = new Object[1];
            SimpleDateFormat simpleDateFormat = this.f14284d;
            if (simpleDateFormat == null) {
                simpleDateFormat = m0.n();
                this.f14284d = simpleDateFormat;
            }
            objArr[0] = simpleDateFormat.format(new Date(friendMsg.f9679e));
            textView.setText(context.getString(R.string.friends_message_time, objArr));
            p.b.g(aVar2.f14287u.btnReject, new d(aVar2, this, list));
            p.b.g(aVar2.f14287u.btnAccept, new e(aVar2, this, list));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        l.f(recyclerView, "parent");
        ItemFriendMsgBinding inflate = ItemFriendMsgBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        l.e(inflate, "inflate(\n               …rent, false\n            )");
        return new a(inflate);
    }
}
