package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f3113a;

    /* renamed from: b */
    public final /* synthetic */ p f3114b;

    public h(p pVar, ArrayList arrayList) {
        this.f3114b = pVar;
        this.f3113a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f3113a.iterator();
        while (it.hasNext()) {
            p.b bVar = (p.b) it.next();
            p pVar = this.f3114b;
            RecyclerView.b0 b0Var = bVar.f3174a;
            int i10 = bVar.f3175b;
            int i11 = bVar.f3176c;
            int i12 = bVar.f3177d;
            int i13 = bVar.f3178e;
            pVar.getClass();
            View view = b0Var.f2927a;
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (i14 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i15 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            pVar.f3165p.add(b0Var);
            animate.setDuration(pVar.f2954e).setListener(new m(pVar, b0Var, i14, view, i15, animate)).start();
        }
        this.f3113a.clear();
        this.f3114b.f3162m.remove(this.f3113a);
    }
}
