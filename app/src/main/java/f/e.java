package f;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f13875a;

    /* renamed from: b */
    public final /* synthetic */ View f13876b;

    /* renamed from: c */
    public final /* synthetic */ AlertController f13877c;

    public e(AlertController alertController, View view, View view2) {
        this.f13877c = alertController;
        this.f13875a = view;
        this.f13876b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertController.b(this.f13877c.f782g, this.f13875a, this.f13876b);
    }
}
