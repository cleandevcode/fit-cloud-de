package yh;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.ItemDialCustomBinding;
import com.topstep.fitcloud.pro.databinding.ItemDialPacketBinding;
import com.topstep.fitcloud.pro.model.dial.DialPacket;
import java.util.List;

/* loaded from: classes2.dex */
public final class d extends RecyclerView.e<RecyclerView.b0> {

    /* renamed from: d */
    public boolean f31702d;

    /* renamed from: e */
    public final boolean f31703e;

    /* renamed from: f */
    public sj.e f31704f = new sj.e(0, 240, 240, 0);

    /* renamed from: g */
    public c f31705g;

    /* renamed from: h */
    public List<DialPacket> f31706h;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemDialCustomBinding f31707u;

        public a(ItemDialCustomBinding itemDialCustomBinding) {
            super(itemDialCustomBinding.getRoot());
            this.f31707u = itemDialCustomBinding;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemDialPacketBinding f31708u;

        public b(ItemDialPacketBinding itemDialPacketBinding) {
            super(itemDialPacketBinding.getRoot());
            this.f31708u = itemDialPacketBinding;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a();

        void b(DialPacket dialPacket);

        void c(DialPacket dialPacket);
    }

    /* renamed from: yh.d$d */
    /* loaded from: classes2.dex */
    public static final class C0596d extends gm.m implements fm.l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0596d() {
            super(1);
            d.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            gm.l.f(view, "it");
            c cVar = d.this.f31705g;
            if (cVar != null) {
                cVar.a();
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.l<View, tl.l> {

        /* renamed from: c */
        public final /* synthetic */ DialPacket f31711c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DialPacket dialPacket) {
            super(1);
            d.this = r1;
            this.f31711c = dialPacket;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            gm.l.f(view, "it");
            c cVar = d.this.f31705g;
            if (cVar != null) {
                cVar.c(this.f31711c);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.l<ImageView, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ RecyclerView.b0 f31712b;

        /* renamed from: c */
        public final /* synthetic */ List<DialPacket> f31713c;

        /* renamed from: d */
        public final /* synthetic */ d f31714d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(RecyclerView.b0 b0Var, List<DialPacket> list, d dVar) {
            super(1);
            this.f31712b = b0Var;
            this.f31713c = list;
            this.f31714d = dVar;
        }

        @Override // fm.l
        public final tl.l k(ImageView imageView) {
            int i10;
            gm.l.f(imageView, "it");
            int d10 = ((b) this.f31712b).d();
            if (d10 != -1) {
                List<DialPacket> list = this.f31713c;
                if (this.f31714d.f31702d) {
                    i10 = d10 - 1;
                } else {
                    i10 = d10;
                }
                DialPacket remove = list.remove(i10);
                this.f31714d.f2947a.f(d10, 1);
                c cVar = this.f31714d.f31705g;
                if (cVar != null) {
                    cVar.b(remove);
                }
            }
            return tl.l.f28297a;
        }
    }

    public d(boolean z10, boolean z11) {
        this.f31702d = z10;
        this.f31703e = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<DialPacket> list = this.f31706h;
        int size = list != null ? list.size() : 0;
        return this.f31702d ? size + 1 : size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int g(int i10) {
        return (this.f31702d && i10 == 0) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.b0 b0Var, int i10) {
        List<DialPacket> list;
        View view;
        fm.l lVar;
        b0Var.f2927a.getContext();
        if (b0Var instanceof a) {
            a aVar = (a) b0Var;
            aVar.f31707u.cardView.setShape(this.f31704f);
            aVar.f31707u.dialView.setShape(this.f31704f);
            view = b0Var.f2927a;
            lVar = new C0596d();
        } else if (!(b0Var instanceof b) || (list = this.f31706h) == null) {
            return;
        } else {
            if (this.f31702d) {
                i10--;
            }
            DialPacket dialPacket = list.get(i10);
            b bVar = (b) b0Var;
            bVar.f31708u.cardView.setShape(this.f31704f);
            p.b.g(b0Var.f2927a, new e(dialPacket));
            ImageView imageView = bVar.f31708u.imgView;
            gm.l.e(imageView, "holder.viewBind.imgView");
            a.f.g(imageView, dialPacket.getImgUrl(), 12);
            if (this.f31703e) {
                bVar.f31708u.imgDelete.setVisibility(0);
                ImageView imageView2 = bVar.f31708u.imgDelete;
                f fVar = new f(b0Var, list, this);
                view = imageView2;
                lVar = fVar;
            } else {
                bVar.f31708u.imgDelete.setVisibility(4);
                return;
            }
        }
        p.b.g(view, lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        if (i10 == 0) {
            ItemDialCustomBinding inflate = ItemDialCustomBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
            gm.l.e(inflate, "inflate(\n               …, false\n                )");
            return new a(inflate);
        }
        ItemDialPacketBinding inflate2 = ItemDialPacketBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate2, "inflate(\n               …, false\n                )");
        return new b(inflate2);
    }
}
