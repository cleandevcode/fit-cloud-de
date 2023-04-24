package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public final class b implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertController f832a;

    /* renamed from: b */
    public final /* synthetic */ AlertController.b f833b;

    public b(AlertController.b bVar, AlertController alertController) {
        this.f833b = bVar;
        this.f832a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f833b.f821q.onClick(this.f832a.f777b, i10);
        if (this.f833b.f826v) {
            return;
        }
        this.f832a.f777b.dismiss();
    }
}
