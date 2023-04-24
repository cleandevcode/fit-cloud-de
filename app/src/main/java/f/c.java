package f;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f13870a;

    /* renamed from: b */
    public final /* synthetic */ View f13871b;

    /* renamed from: c */
    public final /* synthetic */ AlertController f13872c;

    public c(AlertController alertController, View view, View view2) {
        this.f13872c = alertController;
        this.f13870a = view;
        this.f13871b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertController.b(this.f13872c.f798w, this.f13870a, this.f13871b);
    }
}
