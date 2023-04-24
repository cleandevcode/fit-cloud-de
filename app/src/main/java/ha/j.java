package ha;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ View.OnClickListener f16069a;

    /* renamed from: b */
    public final /* synthetic */ Snackbar f16070b;

    public j(Snackbar snackbar, uh.e eVar) {
        this.f16070b = snackbar;
        this.f16069a = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f16069a.onClick(view);
        this.f16070b.b(1);
    }
}
