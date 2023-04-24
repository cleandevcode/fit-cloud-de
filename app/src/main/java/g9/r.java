package g9;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a */
    public final Object f15053a = new Object();

    /* renamed from: b */
    public ArrayDeque f15054b;

    /* renamed from: c */
    public boolean f15055c;

    public final void a(q qVar) {
        synchronized (this.f15053a) {
            if (this.f15054b == null) {
                this.f15054b = new ArrayDeque();
            }
            this.f15054b.add(qVar);
        }
    }

    public final void b(t tVar) {
        q qVar;
        synchronized (this.f15053a) {
            if (this.f15054b != null && !this.f15055c) {
                this.f15055c = true;
                while (true) {
                    synchronized (this.f15053a) {
                        qVar = (q) this.f15054b.poll();
                        if (qVar == null) {
                            this.f15055c = false;
                            return;
                        }
                    }
                    qVar.a(tVar);
                }
            }
        }
    }
}
