package zh;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.ItemDialCustomGridAddBinding;
import com.topstep.fitcloud.pro.databinding.ItemDialCustomGridPreviewBinding;
import com.topstep.fitcloud.sdk.v2.utils.dial.DialView;
import java.util.List;
import xf.a;

/* loaded from: classes2.dex */
public final class f extends RecyclerView.e<RecyclerView.b0> {

    /* renamed from: d */
    public final boolean f32436d;

    /* renamed from: e */
    public b f32437e;

    /* renamed from: f */
    public sj.e f32438f = new sj.e(0, 240, 240, 0);

    /* renamed from: g */
    public List<g> f32439g;

    /* renamed from: h */
    public int f32440h;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemDialCustomGridAddBinding f32441u;

        public a(ItemDialCustomGridAddBinding itemDialCustomGridAddBinding) {
            super(itemDialCustomGridAddBinding.getRoot());
            this.f32441u = itemDialCustomGridAddBinding;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(g gVar);

        void b();

        void c(g gVar);
    }

    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemDialCustomGridPreviewBinding f32442u;

        public c(ItemDialCustomGridPreviewBinding itemDialCustomGridPreviewBinding) {
            super(itemDialCustomGridPreviewBinding.getRoot());
            this.f32442u = itemDialCustomGridPreviewBinding;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.l<DialView, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1);
            f.this = r1;
        }

        @Override // fm.l
        public final tl.l k(DialView dialView) {
            gm.l.f(dialView, "it");
            b bVar = f.this.f32437e;
            if (bVar != null) {
                bVar.b();
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.l<DialView, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ RecyclerView.b0 f32444b;

        /* renamed from: c */
        public final /* synthetic */ f f32445c;

        /* renamed from: d */
        public final /* synthetic */ List<g> f32446d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(RecyclerView.b0 b0Var, f fVar, List<g> list) {
            super(1);
            this.f32444b = b0Var;
            this.f32445c = fVar;
            this.f32446d = list;
        }

        @Override // fm.l
        public final tl.l k(DialView dialView) {
            gm.l.f(dialView, "it");
            int d10 = ((c) this.f32444b).d();
            if (d10 != -1) {
                f fVar = this.f32445c;
                if (fVar.f32436d) {
                    d10--;
                }
                if (fVar.f32440h != d10) {
                    fVar.f32440h = d10;
                    b bVar = fVar.f32437e;
                    if (bVar != null) {
                        bVar.c(this.f32446d.get(d10));
                    }
                    this.f32445c.h();
                }
            }
            return tl.l.f28297a;
        }
    }

    /* renamed from: zh.f$f */
    /* loaded from: classes2.dex */
    public static final class C0623f extends gm.m implements fm.l<ImageView, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ RecyclerView.b0 f32447b;

        /* renamed from: c */
        public final /* synthetic */ List<g> f32448c;

        /* renamed from: d */
        public final /* synthetic */ f f32449d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0623f(RecyclerView.b0 b0Var, f fVar, List list) {
            super(1);
            this.f32447b = b0Var;
            this.f32448c = list;
            this.f32449d = fVar;
        }

        @Override // fm.l
        public final tl.l k(ImageView imageView) {
            int i10;
            gm.l.f(imageView, "it");
            int d10 = ((c) this.f32447b).d();
            if (d10 != -1) {
                List<g> list = this.f32448c;
                if (this.f32449d.f32436d) {
                    i10 = d10 - 1;
                } else {
                    i10 = d10;
                }
                g remove = list.remove(i10);
                this.f32449d.f2947a.f(d10, 1);
                b bVar = this.f32449d.f32437e;
                if (bVar != null) {
                    bVar.a(remove);
                }
            }
            return tl.l.f28297a;
        }
    }

    public f(boolean z10) {
        this.f32436d = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<g> list = this.f32439g;
        int size = list != null ? list.size() : 0;
        return this.f32436d ? size + 1 : size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int g(int i10) {
        return (this.f32436d && i10 == 0) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.b0 b0Var, int i10) {
        List<g> list;
        boolean z10;
        if (b0Var instanceof a) {
            DialView dialView = ((a) b0Var).f32441u.dialView;
            gm.l.e(dialView, "holder.viewBind.dialView");
            dialView.setShape(this.f32438f);
            p.b.g(dialView, new d());
        } else if (!(b0Var instanceof c) || (list = this.f32439g) == null) {
        } else {
            c cVar = (c) b0Var;
            Context context = cVar.f32442u.getRoot().getContext();
            DialView dialView2 = cVar.f32442u.dialView;
            gm.l.e(dialView2, "holder.viewBind.dialView");
            if (this.f32436d) {
                i10--;
            }
            g gVar = list.get(i10);
            dialView2.setShape(this.f32438f);
            gm.l.e(context, "context");
            a.f.e(context, dialView2, gVar.f32450a);
            a.C0558a c0558a = gVar.f32451b;
            a.f.f(context, dialView2, c0558a.f30538a, c0558a.f30539b);
            dialView2.setStylePosition(gVar.f32452c);
            if (i10 == this.f32440h) {
                z10 = true;
            } else {
                z10 = false;
            }
            dialView2.setChecked(z10);
            p.b.g(dialView2, new e(b0Var, this, list));
            if (this.f32436d) {
                cVar.f32442u.imgDelete.setVisibility(0);
                p.b.g(cVar.f32442u.imgDelete, new C0623f(b0Var, this, list));
                return;
            }
            cVar.f32442u.imgDelete.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        if (i10 == 0) {
            ItemDialCustomGridAddBinding inflate = ItemDialCustomGridAddBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
            gm.l.e(inflate, "inflate(LayoutInflater.f….context), parent, false)");
            return new a(inflate);
        }
        ItemDialCustomGridPreviewBinding inflate2 = ItemDialCustomGridPreviewBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate2, "inflate(LayoutInflater.f….context), parent, false)");
        return new c(inflate2);
    }
}
