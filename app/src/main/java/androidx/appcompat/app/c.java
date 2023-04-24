package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertController.RecycleListView f834a;

    /* renamed from: b */
    public final /* synthetic */ AlertController f835b;

    /* renamed from: c */
    public final /* synthetic */ AlertController.b f836c;

    public c(AlertController.b bVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f836c = bVar;
        this.f834a = recycleListView;
        this.f835b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        boolean[] zArr = this.f836c.f824t;
        if (zArr != null) {
            zArr[i10] = this.f834a.isItemChecked(i10);
        }
        this.f836c.f828x.onClick(this.f835b.f777b, i10, this.f834a.isItemChecked(i10));
    }
}
