package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.f1;
import androidx.fragment.app.m;
import f1.d;

/* loaded from: classes.dex */
public final class h implements d.b {

    /* renamed from: a */
    public final /* synthetic */ View f2381a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f2382b;

    /* renamed from: c */
    public final /* synthetic */ m.a f2383c;

    /* renamed from: d */
    public final /* synthetic */ f1.b f2384d;

    public h(View view, ViewGroup viewGroup, m.a aVar, f1.b bVar) {
        this.f2381a = view;
        this.f2382b = viewGroup;
        this.f2383c = aVar;
        this.f2384d = bVar;
    }

    @Override // f1.d.b
    public final void onCancel() {
        this.f2381a.clearAnimation();
        this.f2382b.endViewTransition(this.f2381a);
        this.f2383c.a();
        if (j0.J(2)) {
            StringBuilder a10 = android.support.v4.media.d.a("Animation from operation ");
            a10.append(this.f2384d);
            a10.append(" has been cancelled.");
            Log.v("FragmentManager", a10.toString());
        }
    }
}
