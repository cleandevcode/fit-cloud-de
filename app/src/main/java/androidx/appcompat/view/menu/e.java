package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: a */
    public f f925a;

    /* renamed from: b */
    public int f926b = -1;

    /* renamed from: c */
    public boolean f927c;

    /* renamed from: d */
    public final boolean f928d;

    /* renamed from: e */
    public final LayoutInflater f929e;

    /* renamed from: f */
    public final int f930f;

    public e(f fVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f928d = z10;
        this.f929e = layoutInflater;
        this.f925a = fVar;
        this.f930f = i10;
        b();
    }

    public final void b() {
        f fVar = this.f925a;
        h hVar = fVar.f953v;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.f941j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayList.get(i10) == hVar) {
                    this.f926b = i10;
                    return;
                }
            }
        }
        this.f926b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public final h getItem(int i10) {
        ArrayList<h> l10;
        if (this.f928d) {
            f fVar = this.f925a;
            fVar.i();
            l10 = fVar.f941j;
        } else {
            l10 = this.f925a.l();
        }
        int i11 = this.f926b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return l10.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<h> l10;
        if (this.f928d) {
            f fVar = this.f925a;
            fVar.i();
            l10 = fVar.f941j;
        } else {
            l10 = this.f925a.l();
        }
        int i10 = this.f926b;
        int size = l10.size();
        if (i10 < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z10 = false;
        if (view == null) {
            view = this.f929e.inflate(this.f930f, viewGroup, false);
        }
        int i12 = getItem(i10).f960b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f960b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f925a.m() && i12 != i11) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        k.a aVar = (k.a) view;
        if (this.f927c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
