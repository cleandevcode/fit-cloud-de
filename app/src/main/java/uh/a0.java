package uh;

import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m0;
import androidx.recyclerview.widget.n0;
import com.topstep.fitcloud.pro.databinding.ItemScanDeviceBinding;
import com.topstep.fitcloud.pro.ui.widget.SignalView;

/* loaded from: classes2.dex */
public final class a0 extends RecyclerView.e<a> {

    /* renamed from: d */
    public final m0<z> f28739d = new m0<>(new c(this));

    /* renamed from: e */
    public b f28740e;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemScanDeviceBinding f28741u;

        public a(ItemScanDeviceBinding itemScanDeviceBinding) {
            super(itemScanDeviceBinding.getRoot());
            this.f28741u = itemScanDeviceBinding;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(z zVar);

        void b(int i10, int i11);
    }

    /* loaded from: classes2.dex */
    public static final class c extends n0<z> {
        public c(a0 a0Var) {
            super(a0Var);
        }

        @Override // androidx.recyclerview.widget.m0.a, java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            z zVar = (z) obj;
            z zVar2 = (z) obj2;
            gm.l.f(zVar, "o1");
            gm.l.f(zVar2, "o2");
            return gm.l.h(zVar2.f28821c, zVar.f28821c);
        }

        @Override // androidx.recyclerview.widget.m0.a
        public final boolean e(Object obj, Object obj2) {
            z zVar = (z) obj;
            z zVar2 = (z) obj2;
            gm.l.f(zVar, "oldItem");
            gm.l.f(zVar2, "newItem");
            if (gm.l.a(zVar.f28820b, zVar2.f28820b) && zVar.f28821c == zVar2.f28821c) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.m0.a
        public final boolean f(Object obj, Object obj2) {
            z zVar = (z) obj;
            z zVar2 = (z) obj2;
            gm.l.f(zVar, "item1");
            gm.l.f(zVar2, "item2");
            return gm.l.a(zVar.f28819a, zVar2.f28819a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        return this.f28739d.f3145c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        boolean z10;
        String str;
        a aVar2 = aVar;
        z b10 = this.f28739d.b(i10);
        gm.l.e(b10, "sorter[position]");
        z zVar = b10;
        TextView textView = aVar2.f28741u.tvName;
        String str2 = zVar.f28820b;
        if (str2 != null && str2.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            str = "Unknown";
        } else {
            str = zVar.f28820b;
        }
        textView.setText(str);
        aVar2.f28741u.tvAddress.setText(zVar.f28819a);
        aVar2.f28741u.tvRssi.setText(String.valueOf(zVar.f28821c));
        int i11 = 4;
        aVar2.f28741u.signalView.setMaxSignal(4);
        SignalView signalView = aVar2.f28741u.signalView;
        int i12 = zVar.f28821c;
        if (i12 < -70) {
            i11 = 1;
        } else if (i12 < -60) {
            i11 = 2;
        } else if (i12 < -50) {
            i11 = 3;
        }
        signalView.setCurrentSignal(i11);
        aVar2.f28741u.signalView.invalidate();
        aVar2.f28741u.btnAction.setOnClickListener(new k7.b(this, aVar2, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        ItemScanDeviceBinding inflate = ItemScanDeviceBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate, "inflate(\n               …rent, false\n            )");
        return new a(inflate);
    }
}
