package dn;

import java.net.Socket;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class i extends cn.a {

    /* renamed from: e */
    public final /* synthetic */ j f13257e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str) {
        super(str, true);
        this.f13257e = jVar;
    }

    @Override // cn.a
    public final long a() {
        j jVar = this.f13257e;
        long nanoTime = System.nanoTime();
        Iterator<h> it = jVar.f13261d.iterator();
        int i10 = 0;
        long j10 = Long.MIN_VALUE;
        h hVar = null;
        int i11 = 0;
        while (it.hasNext()) {
            h next = it.next();
            gm.l.e(next, "connection");
            synchronized (next) {
                if (jVar.b(next, nanoTime) > 0) {
                    i11++;
                } else {
                    i10++;
                    long j11 = nanoTime - next.f13255p;
                    if (j11 > j10) {
                        tl.l lVar = tl.l.f28297a;
                        hVar = next;
                        j10 = j11;
                    } else {
                        tl.l lVar2 = tl.l.f28297a;
                    }
                }
            }
        }
        long j12 = jVar.f13258a;
        if (j10 < j12 && i10 <= jVar.f13262e) {
            if (i10 > 0) {
                return j12 - j10;
            }
            if (i11 <= 0) {
                return -1L;
            }
            return j12;
        }
        gm.l.c(hVar);
        synchronized (hVar) {
            if (!(!hVar.f13254o.isEmpty()) && hVar.f13255p + j10 == nanoTime) {
                hVar.f13248i = true;
                jVar.f13261d.remove(hVar);
                Socket socket = hVar.f13242c;
                gm.l.c(socket);
                an.c.c(socket);
                if (!jVar.f13261d.isEmpty()) {
                    return 0L;
                }
                jVar.f13259b.a();
                return 0L;
            }
            return 0L;
        }
    }
}
