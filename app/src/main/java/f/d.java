package f;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public final class d implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ View f13873a;

    /* renamed from: b */
    public final /* synthetic */ View f13874b;

    public d(View view, View view2) {
        this.f13873a = view;
        this.f13874b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        AlertController.b(absListView, this.f13873a, this.f13874b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
