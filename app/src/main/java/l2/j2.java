package l2;

import java.util.concurrent.CopyOnWriteArrayList;
import l2.h2;

/* loaded from: classes.dex */
public abstract class j2<T> {

    /* renamed from: a */
    public final y f19019a;

    /* renamed from: b */
    public final pm.b0 f19020b;

    /* renamed from: c */
    public w1<T> f19021c = (w1<T>) w1.f19337e;

    /* renamed from: d */
    public h3 f19022d;

    /* renamed from: e */
    public final v0 f19023e;

    /* renamed from: f */
    public final CopyOnWriteArrayList<fm.a<tl.l>> f19024f;

    /* renamed from: g */
    public final d3 f19025g;

    /* renamed from: h */
    public volatile boolean f19026h;

    /* renamed from: i */
    public volatile int f19027i;

    /* renamed from: j */
    public final i2 f19028j;

    /* renamed from: k */
    public final sm.j0 f19029k;

    /* renamed from: l */
    public final sm.w0 f19030l;

    public j2(f fVar, pm.b0 b0Var) {
        this.f19019a = fVar;
        this.f19020b = b0Var;
        v0 v0Var = new v0();
        this.f19023e = v0Var;
        CopyOnWriteArrayList<fm.a<tl.l>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f19024f = copyOnWriteArrayList;
        this.f19025g = new d3(true);
        this.f19028j = new i2(this);
        this.f19029k = v0Var.f19324i;
        this.f19030l = qi.h.c(0, 64, rm.f.DROP_OLDEST);
        copyOnWriteArrayList.add(new g2(this));
    }

    public final void a(q0 q0Var, q0 q0Var2) {
        gm.l.f(q0Var, "source");
        if (gm.l.a(this.f19023e.f19321f, q0Var) && gm.l.a(this.f19023e.f19322g, q0Var2)) {
            return;
        }
        v0 v0Var = this.f19023e;
        v0Var.getClass();
        v0Var.f19316a = true;
        v0Var.f19321f = q0Var;
        v0Var.f19322g = q0Var2;
        v0Var.b();
    }

    public abstract Object b(w1 w1Var, w1 w1Var2, int i10, h2.a.C0332a c0332a, xl.d dVar);
}
