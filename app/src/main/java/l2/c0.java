package l2;

import java.util.ArrayList;
import java.util.List;
import l2.b1;
import l2.n0;

/* loaded from: classes.dex */
public final class c0<T> {

    /* renamed from: a */
    public int f18766a;

    /* renamed from: b */
    public int f18767b;

    /* renamed from: c */
    public final ul.g<g3<T>> f18768c = new ul.g<>();

    /* renamed from: d */
    public final w0 f18769d = new w0();

    /* renamed from: e */
    public q0 f18770e;

    /* renamed from: f */
    public boolean f18771f;

    public final void a(b1<T> b1Var) {
        gm.l.f(b1Var, "event");
        this.f18771f = true;
        int i10 = 0;
        if (b1Var instanceof b1.b) {
            b1.b bVar = (b1.b) b1Var;
            this.f18769d.b(bVar.f18737e);
            this.f18770e = bVar.f18738f;
            int ordinal = bVar.f18733a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.f18767b = bVar.f18736d;
                    } else {
                        return;
                    }
                } else {
                    this.f18766a = bVar.f18735c;
                    int size = bVar.f18734b.size() - 1;
                    lm.i iVar = new lm.i(size, bi.r.A(size, 0, -1), -1);
                    while (iVar.f20076c) {
                        this.f18768c.addFirst(bVar.f18734b.get(iVar.nextInt()));
                    }
                    return;
                }
            } else {
                this.f18768c.clear();
                this.f18767b = bVar.f18736d;
                this.f18766a = bVar.f18735c;
            }
            this.f18768c.addAll(bVar.f18734b);
        } else if (b1Var instanceof b1.a) {
            b1.a aVar = (b1.a) b1Var;
            this.f18769d.c(aVar.f18728a, n0.c.f19109c);
            int ordinal2 = aVar.f18728a.ordinal();
            if (ordinal2 != 1) {
                if (ordinal2 == 2) {
                    this.f18767b = aVar.f18731d;
                    int b10 = aVar.b();
                    while (i10 < b10) {
                        this.f18768c.removeLast();
                        i10++;
                    }
                    return;
                }
                throw new IllegalArgumentException("Page drop type must be prepend or append");
            }
            this.f18766a = aVar.f18731d;
            int b11 = aVar.b();
            while (i10 < b11) {
                this.f18768c.removeFirst();
                i10++;
            }
        } else if (b1Var instanceof b1.c) {
            b1.c cVar = (b1.c) b1Var;
            this.f18769d.b(cVar.f18753a);
            this.f18770e = cVar.f18754b;
        }
    }

    public final List<b1<T>> b() {
        Object cVar;
        if (this.f18771f) {
            ArrayList arrayList = new ArrayList();
            q0 d10 = this.f18769d.d();
            if (!this.f18768c.isEmpty()) {
                b1.b<Object> bVar = b1.b.f18732g;
                cVar = b1.b.a.a(ul.q.Y(this.f18768c), this.f18766a, this.f18767b, d10, this.f18770e);
            } else {
                cVar = new b1.c(d10, this.f18770e);
            }
            arrayList.add(cVar);
            return arrayList;
        }
        return ul.s.f28879a;
    }
}
