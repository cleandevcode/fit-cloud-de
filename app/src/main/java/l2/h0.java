package l2;

import java.util.concurrent.locks.ReentrantLock;
import l2.j3;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a */
    public final b f18915a = new b(this);

    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a */
        public j3 f18916a;

        /* renamed from: b */
        public final sm.w0 f18917b;

        public a(h0 h0Var) {
            gm.l.f(h0Var, "this$0");
            this.f18917b = qi.h.c(1, 0, rm.f.DROP_OLDEST);
        }
    }

    /* loaded from: classes.dex */
    public final class b {

        /* renamed from: a */
        public final a f18918a;

        /* renamed from: b */
        public final a f18919b;

        /* renamed from: c */
        public j3.a f18920c;

        /* renamed from: d */
        public final ReentrantLock f18921d;

        public b(h0 h0Var) {
            gm.l.f(h0Var, "this$0");
            this.f18918a = new a(h0Var);
            this.f18919b = new a(h0Var);
            this.f18921d = new ReentrantLock();
        }

        public final void a(j3.a aVar, fm.p<? super a, ? super a, tl.l> pVar) {
            ReentrantLock reentrantLock = this.f18921d;
            reentrantLock.lock();
            if (aVar != null) {
                try {
                    this.f18920c = aVar;
                } finally {
                    reentrantLock.unlock();
                }
            }
            pVar.A(this.f18918a, this.f18919b);
            tl.l lVar = tl.l.f28297a;
        }
    }

    public final sm.w0 a(r0 r0Var) {
        gm.l.f(r0Var, "loadType");
        int ordinal = r0Var.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return this.f18915a.f18919b.f18917b;
            }
            throw new IllegalArgumentException("invalid load type for hints");
        }
        return this.f18915a.f18918a.f18917b;
    }
}
