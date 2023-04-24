package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes.dex */
public final class n extends j {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f3457a;

    /* renamed from: b */
    public final /* synthetic */ View f3458b;

    /* renamed from: c */
    public final /* synthetic */ View f3459c;

    /* renamed from: d */
    public final /* synthetic */ o f3460d;

    public n(o oVar, ViewGroup viewGroup, View view, View view2) {
        this.f3460d = oVar;
        this.f3457a = viewGroup;
        this.f3458b = view;
        this.f3459c = view2;
    }

    @Override // androidx.transition.j, androidx.transition.i.d
    public final void a() {
        x2.i iVar = new x2.i(this.f3457a);
        ((ViewGroupOverlay) iVar.f30183b).remove(this.f3458b);
    }

    @Override // androidx.transition.i.d
    public final void d(i iVar) {
        this.f3459c.setTag(R.id.save_overlay_view, null);
        x2.i iVar2 = new x2.i(this.f3457a);
        ((ViewGroupOverlay) iVar2.f30183b).remove(this.f3458b);
        iVar.z(this);
    }

    @Override // androidx.transition.j, androidx.transition.i.d
    public final void e() {
        if (this.f3458b.getParent() == null) {
            x2.i iVar = new x2.i(this.f3457a);
            ((ViewGroupOverlay) iVar.f30183b).add(this.f3458b);
            return;
        }
        this.f3460d.cancel();
    }
}
