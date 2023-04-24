package dn;

import cn.sharesdk.framework.InnerShareParams;
import dn.e;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import zm.d0;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a */
    public final long f13258a;

    /* renamed from: b */
    public final cn.c f13259b;

    /* renamed from: c */
    public final i f13260c;

    /* renamed from: d */
    public final ConcurrentLinkedQueue<h> f13261d;

    /* renamed from: e */
    public final int f13262e;

    public j(cn.d dVar, TimeUnit timeUnit) {
        gm.l.f(dVar, "taskRunner");
        gm.l.f(timeUnit, "timeUnit");
        this.f13262e = 5;
        this.f13258a = timeUnit.toNanos(5L);
        this.f13259b = dVar.f();
        this.f13260c = new i(this, androidx.activity.e.b(new StringBuilder(), an.c.f640f, " ConnectionPool"));
        this.f13261d = new ConcurrentLinkedQueue<>();
    }

    public final boolean a(zm.a aVar, e eVar, List<d0> list, boolean z10) {
        gm.l.f(aVar, InnerShareParams.ADDRESS);
        gm.l.f(eVar, "call");
        Iterator<h> it = this.f13261d.iterator();
        while (true) {
            boolean z11 = false;
            if (!it.hasNext()) {
                return false;
            }
            h next = it.next();
            gm.l.e(next, "connection");
            synchronized (next) {
                if (z10) {
                    if (next.f13245f != null) {
                        z11 = true;
                    }
                    if (!z11) {
                        tl.l lVar = tl.l.f28297a;
                    }
                }
                if (next.h(aVar, list)) {
                    eVar.b(next);
                    return true;
                }
                tl.l lVar2 = tl.l.f28297a;
            }
        }
    }

    public final int b(h hVar, long j10) {
        byte[] bArr = an.c.f635a;
        ArrayList arrayList = hVar.f13254o;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                StringBuilder a10 = android.support.v4.media.d.a("A connection to ");
                a10.append(hVar.f13256q.f32574a.f32518a);
                a10.append(" was leaked. ");
                a10.append("Did you forget to close a response body?");
                String sb2 = a10.toString();
                hn.k.f16188c.getClass();
                hn.k.f16186a.j(((e.b) reference).f13235a, sb2);
                arrayList.remove(i10);
                hVar.f13248i = true;
                if (arrayList.isEmpty()) {
                    hVar.f13255p = j10 - this.f13258a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
