package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f3116a;

    /* renamed from: b */
    public final /* synthetic */ p f3117b;

    public i(p pVar, ArrayList arrayList) {
        this.f3117b = pVar;
        this.f3116a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        Iterator it = this.f3116a.iterator();
        while (it.hasNext()) {
            p.a aVar = (p.a) it.next();
            p pVar = this.f3117b;
            pVar.getClass();
            RecyclerView.b0 b0Var = aVar.f3168a;
            View view2 = null;
            if (b0Var == null) {
                view = null;
            } else {
                view = b0Var.f2927a;
            }
            RecyclerView.b0 b0Var2 = aVar.f3169b;
            if (b0Var2 != null) {
                view2 = b0Var2.f2927a;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(pVar.f2955f);
                pVar.f3167r.add(aVar.f3168a);
                duration.translationX(aVar.f3172e - aVar.f3170c);
                duration.translationY(aVar.f3173f - aVar.f3171d);
                duration.alpha(0.0f).setListener(new n(pVar, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                pVar.f3167r.add(aVar.f3169b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(pVar.f2955f).alpha(1.0f).setListener(new o(pVar, aVar, animate, view2)).start();
            }
        }
        this.f3116a.clear();
        this.f3117b.f3163n.remove(this.f3116a);
    }
}
