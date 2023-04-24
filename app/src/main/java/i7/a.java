package i7;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.b0;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.topstep.fitcloud.pro.ui.settings.assist.DeviceInfoFragment;
import gm.l;

/* loaded from: classes.dex */
public abstract class a<VH extends RecyclerView.b0> extends RecyclerView.e<VH> {

    /* renamed from: d */
    public b f16567d;

    /* renamed from: f */
    public int[] f16569f;

    /* renamed from: g */
    public int[] f16570g;

    /* renamed from: e */
    public int f16568e = 0;

    /* renamed from: h */
    public boolean f16571h = false;

    /* renamed from: i7.a$a */
    /* loaded from: classes.dex */
    public class C0292a extends GridLayoutManager.c {

        /* renamed from: c */
        public final /* synthetic */ GridLayoutManager f16572c;

        public C0292a(GridLayoutManager gridLayoutManager) {
            a.this = r1;
            this.f16572c = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i10) {
            if (a.this.f16570g[i10] < 0) {
                return this.f16572c.F;
            }
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.g {

        /* renamed from: a */
        public final a<?> f16574a;

        public b(a aVar) {
            this.f16574a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            a<?> aVar = this.f16574a;
            aVar.f16571h = false;
            aVar.y();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i10, int i11) {
            a<?> aVar = this.f16574a;
            aVar.f16571h = false;
            aVar.y();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i10, int i11) {
            a<?> aVar = this.f16574a;
            aVar.f16571h = false;
            aVar.y();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i10, int i11) {
            a<?> aVar = this.f16574a;
            aVar.f16571h = false;
            aVar.y();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i10, int i11) {
            a<?> aVar = this.f16574a;
            aVar.f16571h = false;
            aVar.y();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        y();
        return this.f16568e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int g(int i10) {
        int i11 = this.f16569f[i10];
        int i12 = this.f16570g[i10];
        if (i12 == -1) {
            return -1;
        }
        return i12 == -2 ? -2 : -3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void m(RecyclerView recyclerView) {
        y();
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.K = new C0292a(gridLayoutManager);
        }
        if (this.f16567d == null) {
            this.f16567d = new b(this);
        }
        u(this.f16567d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(VH vh2, int i10) {
        int i11 = this.f16569f[i10];
        int i12 = this.f16570g[i10];
        if (i12 == -1) {
            DeviceInfoFragment.b bVar = (DeviceInfoFragment.b) this;
            if (vh2 instanceof DeviceInfoFragment.b.a) {
                ((DeviceInfoFragment.b.a) vh2).f11982u.tvName.setText(bVar.f11981i.get(i11).f11979a);
            }
        } else if (i12 != -2) {
            DeviceInfoFragment.b bVar2 = (DeviceInfoFragment.b) this;
            if (vh2 instanceof DeviceInfoFragment.b.C0204b) {
                DeviceInfoFragment.c cVar = bVar2.f11981i.get(i11).f11980b.get(i12);
                l.e(cVar, "sources[section].items[index]");
                DeviceInfoFragment.c cVar2 = cVar;
                DeviceInfoFragment.b.C0204b c0204b = (DeviceInfoFragment.b.C0204b) vh2;
                c0204b.f11983u.tvName.setText(cVar2.f11984a);
                c0204b.f11983u.tvDes.setText(cVar2.f11985b);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void p(RecyclerView recyclerView) {
        b bVar = this.f16567d;
        if (bVar != null) {
            x(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void r(VH vh2) {
        ViewGroup.LayoutParams layoutParams = vh2.f2927a.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.c) {
            ((StaggeredGridLayoutManager.c) layoutParams).f3049f = this.f16570g[vh2.e()] < 0;
        }
    }

    public final void y() {
        DeviceInfoFragment.b bVar;
        if (this.f16571h) {
            return;
        }
        this.f16568e = 0;
        int i10 = 0;
        while (true) {
            bVar = (DeviceInfoFragment.b) this;
            if (i10 >= bVar.f11981i.size()) {
                break;
            }
            this.f16568e = bVar.f11981i.get(i10).f11980b.size() + 1 + 0 + this.f16568e;
            i10++;
        }
        int i11 = this.f16568e;
        this.f16569f = new int[i11];
        this.f16570g = new int[i11];
        int size = bVar.f11981i.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            this.f16569f[i12] = i13;
            this.f16570g[i12] = -1;
            i12++;
            for (int i14 = 0; i14 < bVar.f11981i.get(i13).f11980b.size(); i14++) {
                this.f16569f[i12] = i13;
                this.f16570g[i12] = i14;
                i12++;
            }
        }
        this.f16571h = true;
    }
}
