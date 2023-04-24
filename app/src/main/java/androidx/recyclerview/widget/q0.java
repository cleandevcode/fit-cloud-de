package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a */
    public final o0.h<RecyclerView.b0, a> f3209a = new o0.h<>();

    /* renamed from: b */
    public final o0.e<RecyclerView.b0> f3210b = new o0.e<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d */
        public static j1.e f3211d = new j1.e(20, 0);

        /* renamed from: a */
        public int f3212a;

        /* renamed from: b */
        public RecyclerView.j.c f3213b;

        /* renamed from: c */
        public RecyclerView.j.c f3214c;

        public static a a() {
            a aVar = (a) f3211d.acquire();
            return aVar == null ? new a() : aVar;
        }
    }

    public final void a(RecyclerView.b0 b0Var, RecyclerView.j.c cVar) {
        a orDefault = this.f3209a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f3209a.put(b0Var, orDefault);
        }
        orDefault.f3214c = cVar;
        orDefault.f3212a |= 8;
    }

    public final void b(RecyclerView.b0 b0Var, RecyclerView.j.c cVar) {
        a orDefault = this.f3209a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f3209a.put(b0Var, orDefault);
        }
        orDefault.f3213b = cVar;
        orDefault.f3212a |= 4;
    }

    public final RecyclerView.j.c c(RecyclerView.b0 b0Var, int i10) {
        a m10;
        RecyclerView.j.c cVar;
        int f10 = this.f3209a.f(b0Var);
        if (f10 >= 0 && (m10 = this.f3209a.m(f10)) != null) {
            int i11 = m10.f3212a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                m10.f3212a = i12;
                if (i10 == 4) {
                    cVar = m10.f3213b;
                } else if (i10 == 8) {
                    cVar = m10.f3214c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    this.f3209a.k(f10);
                    m10.f3212a = 0;
                    m10.f3213b = null;
                    m10.f3214c = null;
                    a.f3211d.release(m10);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void d(RecyclerView.b0 b0Var) {
        a orDefault = this.f3209a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f3212a &= -2;
    }

    public final void e(RecyclerView.b0 b0Var) {
        int i10 = this.f3210b.i() - 1;
        while (true) {
            if (i10 < 0) {
                break;
            } else if (b0Var == this.f3210b.l(i10)) {
                o0.e<RecyclerView.b0> eVar = this.f3210b;
                Object[] objArr = eVar.f22524c;
                Object obj = objArr[i10];
                Object obj2 = o0.e.f22521e;
                if (obj != obj2) {
                    objArr[i10] = obj2;
                    eVar.f22522a = true;
                }
            } else {
                i10--;
            }
        }
        a remove = this.f3209a.remove(b0Var);
        if (remove != null) {
            remove.f3212a = 0;
            remove.f3213b = null;
            remove.f3214c = null;
            a.f3211d.release(remove);
        }
    }
}
