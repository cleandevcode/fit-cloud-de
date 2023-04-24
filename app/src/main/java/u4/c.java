package u4;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a */
    public Object f28477a;

    public c() {
        char[] cArr = m5.l.f20382a;
        this.f28477a = new ArrayDeque(20);
    }

    public abstract l a();

    public final l b() {
        l lVar = (l) ((Queue) this.f28477a).poll();
        return lVar == null ? a() : lVar;
    }

    public final void c(l lVar) {
        if (((Queue) this.f28477a).size() < 20) {
            ((Queue) this.f28477a).offer(lVar);
        }
    }
}
