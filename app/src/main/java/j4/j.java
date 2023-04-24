package j4;

import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public final /* synthetic */ int f17414a;

    /* renamed from: b */
    public final Object f17415b;

    /* renamed from: c */
    public final Object f17416c;

    /* renamed from: d */
    public final Object f17417d;

    public j() {
        this.f17414a = 2;
        this.f17416c = new ReentrantLock();
        this.f17417d = bi.r.c(l2.q0.f19199d);
        this.f17415b = new l2.a();
    }

    public final Object a(fm.l lVar) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f17416c;
        reentrantLock.lock();
        try {
            Object k10 = lVar.k((l2.a) this.f17415b);
            l2.a aVar = (l2.a) this.f17415b;
            ((sm.r0) this.f17417d).setValue(new l2.q0(aVar.b(l2.r0.REFRESH), aVar.b(l2.r0.PREPEND), aVar.b(l2.r0.APPEND)));
            return k10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String toString() {
        switch (this.f17414a) {
            case 1:
                StringBuilder a10 = p.a.a("NavDeepLinkRequest", "{");
                if (((Uri) this.f17416c) != null) {
                    a10.append(" uri=");
                    a10.append(String.valueOf((Uri) this.f17416c));
                }
                if (((String) this.f17415b) != null) {
                    a10.append(" action=");
                    a10.append((String) this.f17415b);
                }
                if (((String) this.f17417d) != null) {
                    a10.append(" mimetype=");
                    a10.append((String) this.f17417d);
                }
                a10.append(" }");
                String sb2 = a10.toString();
                gm.l.e(sb2, "sb.toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        this.f17414a = 1;
    }

    public /* synthetic */ j(Uri uri, String str, String str2) {
        this.f17414a = 1;
        this.f17416c = uri;
        this.f17415b = str;
        this.f17417d = str2;
    }

    public j(Class cls, n4.c cVar) {
        this.f17414a = 0;
        this.f17416c = cls;
        this.f17417d = cVar;
        this.f17415b = cVar.f21963q;
    }
}
