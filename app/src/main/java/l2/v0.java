package l2;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l2.n0;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a */
    public boolean f19316a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<fm.l<u, tl.l>> f19317b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public n0 f19318c;

    /* renamed from: d */
    public n0 f19319d;

    /* renamed from: e */
    public n0 f19320e;

    /* renamed from: f */
    public q0 f19321f;

    /* renamed from: g */
    public q0 f19322g;

    /* renamed from: h */
    public final sm.g1 f19323h;

    /* renamed from: i */
    public final sm.j0 f19324i;

    public v0() {
        n0.c cVar = n0.c.f19109c;
        this.f19318c = cVar;
        this.f19319d = cVar;
        this.f19320e = cVar;
        this.f19321f = q0.f19199d;
        sm.g1 c10 = bi.r.c(null);
        this.f19323h = c10;
        this.f19324i = new sm.j0(c10);
    }

    public static n0 a(n0 n0Var, n0 n0Var2, n0 n0Var3, n0 n0Var4) {
        return n0Var4 == null ? n0Var3 : (!(n0Var instanceof n0.b) || ((n0Var2 instanceof n0.c) && (n0Var4 instanceof n0.c)) || (n0Var4 instanceof n0.a)) ? n0Var4 : n0Var;
    }

    public final void b() {
        n0 n0Var;
        n0 n0Var2;
        n0 n0Var3;
        n0 n0Var4 = this.f19318c;
        n0 n0Var5 = this.f19321f.f19200a;
        q0 q0Var = this.f19322g;
        u uVar = null;
        if (q0Var == null) {
            n0Var = null;
        } else {
            n0Var = q0Var.f19200a;
        }
        this.f19318c = a(n0Var4, n0Var5, n0Var5, n0Var);
        n0 n0Var6 = this.f19319d;
        q0 q0Var2 = this.f19321f;
        n0 n0Var7 = q0Var2.f19200a;
        n0 n0Var8 = q0Var2.f19201b;
        q0 q0Var3 = this.f19322g;
        if (q0Var3 == null) {
            n0Var2 = null;
        } else {
            n0Var2 = q0Var3.f19201b;
        }
        this.f19319d = a(n0Var6, n0Var7, n0Var8, n0Var2);
        n0 n0Var9 = this.f19320e;
        q0 q0Var4 = this.f19321f;
        n0 n0Var10 = q0Var4.f19200a;
        n0 n0Var11 = q0Var4.f19202c;
        q0 q0Var5 = this.f19322g;
        if (q0Var5 == null) {
            n0Var3 = null;
        } else {
            n0Var3 = q0Var5.f19202c;
        }
        n0 a10 = a(n0Var9, n0Var10, n0Var11, n0Var3);
        this.f19320e = a10;
        if (this.f19316a) {
            uVar = new u(this.f19318c, this.f19319d, a10, this.f19321f, this.f19322g);
        }
        if (uVar != null) {
            this.f19323h.setValue(uVar);
            Iterator<fm.l<u, tl.l>> it = this.f19317b.iterator();
            while (it.hasNext()) {
                it.next().k(uVar);
            }
        }
    }
}
