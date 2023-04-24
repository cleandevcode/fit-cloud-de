package cn;

import bi.r;
import gm.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public boolean f4961a;

    /* renamed from: b */
    public a f4962b;

    /* renamed from: c */
    public final ArrayList f4963c;

    /* renamed from: d */
    public boolean f4964d;

    /* renamed from: e */
    public final d f4965e;

    /* renamed from: f */
    public final String f4966f;

    public c(d dVar, String str) {
        l.f(dVar, "taskRunner");
        l.f(str, "name");
        this.f4965e = dVar;
        this.f4966f = str;
        this.f4963c = new ArrayList();
    }

    public final void a() {
        byte[] bArr = an.c.f635a;
        synchronized (this.f4965e) {
            if (b()) {
                this.f4965e.e(this);
            }
            tl.l lVar = tl.l.f28297a;
        }
    }

    public final boolean b() {
        a aVar = this.f4962b;
        if (aVar != null && aVar.f4959d) {
            this.f4964d = true;
        }
        boolean z10 = false;
        for (int size = this.f4963c.size() - 1; size >= 0; size--) {
            if (((a) this.f4963c.get(size)).f4959d) {
                a aVar2 = (a) this.f4963c.get(size);
                d dVar = d.f4967h;
                if (d.f4968i.isLoggable(Level.FINE)) {
                    r.d(aVar2, this, "canceled");
                }
                this.f4963c.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(a aVar, long j10) {
        l.f(aVar, "task");
        synchronized (this.f4965e) {
            if (this.f4961a) {
                if (aVar.f4959d) {
                    d.f4969j.getClass();
                    if (d.f4968i.isLoggable(Level.FINE)) {
                        r.d(aVar, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                d.f4969j.getClass();
                if (d.f4968i.isLoggable(Level.FINE)) {
                    r.d(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (d(aVar, j10, false)) {
                this.f4965e.e(this);
            }
            tl.l lVar = tl.l.f28297a;
        }
    }

    public final boolean d(a aVar, long j10, boolean z10) {
        boolean z11;
        StringBuilder sb2;
        String str;
        boolean z12;
        l.f(aVar, "task");
        c cVar = aVar.f4956a;
        if (cVar != this) {
            if (cVar == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                aVar.f4956a = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        long b10 = this.f4965e.f4976g.b();
        long j11 = b10 + j10;
        int indexOf = this.f4963c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f4957b <= j11) {
                d dVar = d.f4967h;
                if (d.f4968i.isLoggable(Level.FINE)) {
                    r.d(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f4963c.remove(indexOf);
        }
        aVar.f4957b = j11;
        d dVar2 = d.f4967h;
        if (d.f4968i.isLoggable(Level.FINE)) {
            if (z10) {
                sb2 = new StringBuilder();
                str = "run again after ";
            } else {
                sb2 = new StringBuilder();
                str = "scheduled after ";
            }
            sb2.append(str);
            sb2.append(r.z(j11 - b10));
            r.d(aVar, this, sb2.toString());
        }
        Iterator it = this.f4963c.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((a) it.next()).f4957b - b10 > j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = this.f4963c.size();
        }
        this.f4963c.add(i10, aVar);
        if (i10 == 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        byte[] bArr = an.c.f635a;
        synchronized (this.f4965e) {
            this.f4961a = true;
            if (b()) {
                this.f4965e.e(this);
            }
            tl.l lVar = tl.l.f28297a;
        }
    }

    public final String toString() {
        return this.f4966f;
    }
}
