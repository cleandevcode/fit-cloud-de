package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ t.f f3316a;

    /* renamed from: b */
    public final /* synthetic */ t f3317b;

    public u(t tVar, t.f fVar, int i10) {
        this.f3317b = tVar;
        this.f3316a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f3317b.f3284r;
        if (recyclerView != null && recyclerView.isAttachedToWindow()) {
            t.f fVar = this.f3316a;
            if (!fVar.f3313k && fVar.f3307e.c() != -1) {
                RecyclerView.j itemAnimator = this.f3317b.f3284r.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.g()) {
                    t tVar = this.f3317b;
                    int size = tVar.f3282p.size();
                    boolean z10 = false;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (!((t.f) tVar.f3282p.get(i10)).f3314l) {
                            z10 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (!z10) {
                        this.f3317b.f3279m.f(this.f3316a.f3307e);
                        return;
                    }
                }
                this.f3317b.f3284r.post(this);
            }
        }
    }
}
