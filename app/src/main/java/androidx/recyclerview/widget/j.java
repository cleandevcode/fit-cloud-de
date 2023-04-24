package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f3122a;

    /* renamed from: b */
    public final /* synthetic */ p f3123b;

    public j(p pVar, ArrayList arrayList) {
        this.f3123b = pVar;
        this.f3122a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f3122a.iterator();
        while (it.hasNext()) {
            RecyclerView.b0 b0Var = (RecyclerView.b0) it.next();
            p pVar = this.f3123b;
            pVar.getClass();
            View view = b0Var.f2927a;
            ViewPropertyAnimator animate = view.animate();
            pVar.f3164o.add(b0Var);
            animate.alpha(1.0f).setDuration(pVar.f2952c).setListener(new l(view, animate, pVar, b0Var)).start();
        }
        this.f3122a.clear();
        this.f3123b.f3161l.remove(this.f3122a);
    }
}
