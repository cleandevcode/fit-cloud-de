package v4;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final HashMap f29038a = new HashMap();

    /* renamed from: b */
    public final b f29039b = new b();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final ReentrantLock f29040a = new ReentrantLock();

        /* renamed from: b */
        public int f29041b;
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final ArrayDeque f29042a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            Object obj = this.f29038a.get(str);
            b0.c.i(obj);
            aVar = (a) obj;
            int i10 = aVar.f29041b;
            if (i10 >= 1) {
                int i11 = i10 - 1;
                aVar.f29041b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f29038a.remove(str);
                    if (aVar2.equals(aVar)) {
                        b bVar = this.f29039b;
                        synchronized (bVar.f29042a) {
                            if (bVar.f29042a.size() < 10) {
                                bVar.f29042a.offer(aVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f29041b);
            }
        }
        aVar.f29040a.unlock();
    }
}
