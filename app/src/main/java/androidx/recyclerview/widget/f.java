package androidx.recyclerview.widget;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import s.h1;

/* loaded from: classes.dex */
public final class f extends RecyclerView.e<RecyclerView.b0> {

    /* renamed from: d */
    public final g f3098d;

    @SafeVarargs
    public f(RecyclerView.e<? extends RecyclerView.b0>... eVarArr) {
        g gVar;
        int size;
        z zVar;
        List asList = Arrays.asList(eVarArr);
        this.f3098d = new g(this);
        Iterator it = asList.iterator();
        while (true) {
            int i10 = 0;
            if (it.hasNext()) {
                RecyclerView.e<RecyclerView.b0> eVar = (RecyclerView.e) it.next();
                gVar = this.f3098d;
                size = gVar.f3105e.size();
                if (size < 0 || size > gVar.f3105e.size()) {
                    break;
                }
                if (gVar.f3107g != 1) {
                    h1.e("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", eVar.f2948b);
                } else if (eVar.f2948b) {
                    Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
                }
                int size2 = gVar.f3105e.size();
                while (true) {
                    if (i10 < size2) {
                        if (((z) gVar.f3105e.get(i10)).f3338c == eVar) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 == -1) {
                    zVar = null;
                } else {
                    zVar = (z) gVar.f3105e.get(i10);
                }
                if (zVar == null) {
                    z zVar2 = new z(eVar, gVar, gVar.f3102b, gVar.f3108h.a());
                    gVar.f3105e.add(size, zVar2);
                    Iterator it2 = gVar.f3103c.iterator();
                    while (it2.hasNext()) {
                        RecyclerView recyclerView = (RecyclerView) ((WeakReference) it2.next()).get();
                        if (recyclerView != null) {
                            eVar.m(recyclerView);
                        }
                    }
                    if (zVar2.f3340e > 0) {
                        gVar.f3101a.k(gVar.b(zVar2), zVar2.f3340e);
                    }
                    gVar.a();
                }
            } else {
                v(this.f3098d.f3107g != 1);
                return;
            }
        }
        StringBuilder a10 = android.support.v4.media.d.a("Index must be between 0 and ");
        a10.append(gVar.f3105e.size());
        a10.append(". Given:");
        a10.append(size);
        throw new IndexOutOfBoundsException(a10.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int d(RecyclerView.e<? extends RecyclerView.b0> eVar, RecyclerView.b0 b0Var, int i10) {
        g gVar = this.f3098d;
        z zVar = gVar.f3104d.get(b0Var);
        if (zVar == null) {
            return -1;
        }
        int b10 = i10 - gVar.b(zVar);
        int e10 = zVar.f3338c.e();
        if (b10 >= 0 && b10 < e10) {
            return zVar.f3338c.d(eVar, b0Var, b10);
        }
        StringBuilder a10 = w1.h.a("Detected inconsistent adapter updates. The local position of the view holder maps to ", b10, " which is out of bounds for the adapter with size ", e10, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        a10.append(b0Var);
        a10.append("adapter:");
        a10.append(eVar);
        throw new IllegalStateException(a10.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        Iterator it = this.f3098d.f3105e.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((z) it.next()).f3340e;
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long f(int i10) {
        g gVar = this.f3098d;
        g.a c10 = gVar.c(i10);
        z zVar = c10.f3109a;
        long a10 = zVar.f3337b.a(zVar.f3338c.f(c10.f3110b));
        c10.f3111c = false;
        c10.f3109a = null;
        c10.f3110b = -1;
        gVar.f3106f = c10;
        return a10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int g(int i10) {
        g gVar = this.f3098d;
        g.a c10 = gVar.c(i10);
        z zVar = c10.f3109a;
        int b10 = zVar.f3336a.b(zVar.f3338c.g(c10.f3110b));
        c10.f3111c = false;
        c10.f3109a = null;
        c10.f3110b = -1;
        gVar.f3106f = c10;
        return b10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void m(RecyclerView recyclerView) {
        boolean z10;
        g gVar = this.f3098d;
        Iterator it = gVar.f3103c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((WeakReference) it.next()).get() == recyclerView) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            gVar.f3103c.add(new WeakReference(recyclerView));
            Iterator it2 = gVar.f3105e.iterator();
            while (it2.hasNext()) {
                ((z) it2.next()).f3338c.m(recyclerView);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.b0 b0Var, int i10) {
        g gVar = this.f3098d;
        g.a c10 = gVar.c(i10);
        gVar.f3104d.put(b0Var, c10.f3109a);
        z zVar = c10.f3109a;
        zVar.f3338c.c(b0Var, c10.f3110b);
        c10.f3111c = false;
        c10.f3109a = null;
        c10.f3110b = -1;
        gVar.f3106f = c10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        z a10 = this.f3098d.f3102b.a(i10);
        return a10.f3338c.o(recyclerView, a10.f3336a.a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void p(RecyclerView recyclerView) {
        g gVar = this.f3098d;
        int size = gVar.f3103c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) gVar.f3103c.get(size);
            if (weakReference.get() == null) {
                gVar.f3103c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                gVar.f3103c.remove(size);
                break;
            }
        }
        Iterator it = gVar.f3105e.iterator();
        while (it.hasNext()) {
            ((z) it.next()).f3338c.p(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean q(RecyclerView.b0 b0Var) {
        g gVar = this.f3098d;
        z zVar = gVar.f3104d.get(b0Var);
        if (zVar != null) {
            boolean q10 = zVar.f3338c.q(b0Var);
            gVar.f3104d.remove(b0Var);
            return q10;
        }
        throw new IllegalStateException("Cannot find wrapper for " + b0Var + ", seems like it is not bound by this adapter: " + gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void r(RecyclerView.b0 b0Var) {
        this.f3098d.d(b0Var).f3338c.r(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void s(RecyclerView.b0 b0Var) {
        this.f3098d.d(b0Var).f3338c.s(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void t(RecyclerView.b0 b0Var) {
        g gVar = this.f3098d;
        z zVar = gVar.f3104d.get(b0Var);
        if (zVar != null) {
            zVar.f3338c.t(b0Var);
            gVar.f3104d.remove(b0Var);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + b0Var + ", seems like it is not bound by this adapter: " + gVar);
    }
}
