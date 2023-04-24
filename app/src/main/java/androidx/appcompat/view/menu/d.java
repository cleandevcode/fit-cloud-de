package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements j, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Context f916a;

    /* renamed from: b */
    public LayoutInflater f917b;

    /* renamed from: c */
    public f f918c;

    /* renamed from: d */
    public ExpandedMenuView f919d;

    /* renamed from: e */
    public int f920e;

    /* renamed from: f */
    public j.a f921f;

    /* renamed from: g */
    public a f922g;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: a */
        public int f923a = -1;

        public a() {
            d.this = r1;
            b();
        }

        public final void b() {
            f fVar = d.this.f918c;
            h hVar = fVar.f953v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.f941j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.get(i10) == hVar) {
                        this.f923a = i10;
                        return;
                    }
                }
            }
            this.f923a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: c */
        public final h getItem(int i10) {
            f fVar = d.this.f918c;
            fVar.i();
            ArrayList<h> arrayList = fVar.f941j;
            d.this.getClass();
            int i11 = i10 + 0;
            int i12 = this.f923a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayList.get(i11);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            f fVar = d.this.f918c;
            fVar.i();
            int size = fVar.f941j.size();
            d.this.getClass();
            int i10 = size + 0;
            if (this.f923a < 0) {
                return i10;
            }
            return i10 - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                d dVar = d.this;
                view = dVar.f917b.inflate(dVar.f920e, viewGroup, false);
            }
            ((k.a) view).d(getItem(i10));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context, int i10) {
        this.f920e = i10;
        this.f916a = context;
        this.f917b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z10) {
        j.a aVar = this.f921f;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        a aVar = this.f922g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.f921f = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, f fVar) {
        if (this.f916a != null) {
            this.f916a = context;
            if (this.f917b == null) {
                this.f917b = LayoutInflater.from(context);
            }
        }
        this.f918c = fVar;
        a aVar = this.f922g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f919d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g(mVar);
        d.a aVar = new d.a(mVar.f932a);
        d dVar = new d(aVar.f838a.f805a, R.layout.abc_list_menu_item_layout);
        gVar.f958c = dVar;
        dVar.f921f = gVar;
        f fVar = gVar.f956a;
        fVar.b(dVar, fVar.f932a);
        d dVar2 = gVar.f958c;
        if (dVar2.f922g == null) {
            dVar2.f922g = new a();
        }
        a aVar2 = dVar2.f922g;
        AlertController.b bVar = aVar.f838a;
        bVar.f820p = aVar2;
        bVar.f821q = gVar;
        View view = mVar.f946o;
        if (view != null) {
            bVar.f809e = view;
        } else {
            bVar.f807c = mVar.f945n;
            bVar.f808d = mVar.f944m;
        }
        bVar.f818n = gVar;
        androidx.appcompat.app.d a10 = aVar.a();
        gVar.f957b = a10;
        a10.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.f957b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.f957b.show();
        j.a aVar3 = this.f921f;
        if (aVar3 != null) {
            aVar3.d(mVar);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        if (this.f919d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f919d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f918c.q(this.f922g.getItem(i10), this, 0);
    }
}
