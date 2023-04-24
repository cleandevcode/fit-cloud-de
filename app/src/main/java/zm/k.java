package zm;

import dn.e;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a */
    public ThreadPoolExecutor f32633a;

    /* renamed from: b */
    public final ArrayDeque<e.a> f32634b = new ArrayDeque<>();

    /* renamed from: c */
    public final ArrayDeque<e.a> f32635c = new ArrayDeque<>();

    /* renamed from: d */
    public final ArrayDeque<dn.e> f32636d = new ArrayDeque<>();

    public final void a(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            tl.l lVar = tl.l.f28297a;
        }
        c();
    }

    public final void b(e.a aVar) {
        gm.l.f(aVar, "call");
        aVar.f13232a.decrementAndGet();
        a(this.f32635c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.k.c():void");
    }
}
