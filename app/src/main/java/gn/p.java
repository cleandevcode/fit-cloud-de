package gn;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import en.j;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;
import ln.y;
import zm.a0;
import zm.p;

/* loaded from: classes2.dex */
public final class p implements en.d {

    /* renamed from: g */
    public static final List<String> f15621g = an.c.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List<String> f15622h = an.c.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public volatile r f15623a;

    /* renamed from: b */
    public final zm.v f15624b;

    /* renamed from: c */
    public volatile boolean f15625c;

    /* renamed from: d */
    public final dn.h f15626d;

    /* renamed from: e */
    public final en.g f15627e;

    /* renamed from: f */
    public final f f15628f;

    public p(zm.u uVar, dn.h hVar, en.g gVar, f fVar) {
        gm.l.f(hVar, "connection");
        this.f15626d = hVar;
        this.f15627e = gVar;
        this.f15628f = fVar;
        List<zm.v> list = uVar.f32714r;
        zm.v vVar = zm.v.H2_PRIOR_KNOWLEDGE;
        this.f15624b = list.contains(vVar) ? vVar : zm.v.HTTP_2;
    }

    @Override // en.d
    public final void a() {
        r rVar = this.f15623a;
        gm.l.c(rVar);
        rVar.f().close();
    }

    @Override // en.d
    public final long b(a0 a0Var) {
        if (en.e.a(a0Var)) {
            return an.c.i(a0Var);
        }
        return 0L;
    }

    @Override // en.d
    public final a0.a c(boolean z10) {
        zm.p pVar;
        r rVar = this.f15623a;
        gm.l.c(rVar);
        synchronized (rVar) {
            rVar.f15648i.h();
            while (rVar.f15644e.isEmpty() && rVar.f15650k == null) {
                rVar.j();
            }
            rVar.f15648i.l();
            if (!rVar.f15644e.isEmpty()) {
                zm.p removeFirst = rVar.f15644e.removeFirst();
                gm.l.e(removeFirst, "headersQueue.removeFirst()");
                pVar = removeFirst;
            } else {
                IOException iOException = rVar.f15651l;
                if (iOException == null) {
                    b bVar = rVar.f15650k;
                    gm.l.c(bVar);
                    throw new x(bVar);
                }
                throw iOException;
            }
        }
        zm.v vVar = this.f15624b;
        gm.l.f(vVar, "protocol");
        p.a aVar = new p.a();
        int length = pVar.f32653a.length / 2;
        en.j jVar = null;
        for (int i10 = 0; i10 < length; i10++) {
            String f10 = pVar.f(i10);
            String j10 = pVar.j(i10);
            if (gm.l.a(f10, ":status")) {
                jVar = j.a.a("HTTP/1.1 " + j10);
            } else if (!f15622h.contains(f10)) {
                aVar.b(f10, j10);
            }
        }
        if (jVar != null) {
            a0.a aVar2 = new a0.a();
            aVar2.f32543b = vVar;
            aVar2.f32544c = jVar.f13865b;
            String str = jVar.f13866c;
            gm.l.f(str, CrashHianalyticsData.MESSAGE);
            aVar2.f32545d = str;
            aVar2.f32547f = aVar.c().i();
            if (z10 && aVar2.f32544c == 100) {
                return null;
            }
            return aVar2;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // en.d
    public final void cancel() {
        this.f15625c = true;
        r rVar = this.f15623a;
        if (rVar != null) {
            rVar.e(b.CANCEL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0119 A[Catch: all -> 0x01c3, TryCatch #2 {, blocks: (B:136:0x00d8, B:155:0x0124, B:156:0x0125, B:157:0x0127, B:169:0x015c, B:137:0x00d9, B:139:0x00e0, B:140:0x00e5, B:142:0x00e9, B:144:0x00ff, B:146:0x0107, B:151:0x0113, B:153:0x0119, B:154:0x0122, B:195:0x01bd, B:196:0x01c2, B:158:0x0128, B:160:0x012c, B:165:0x0147, B:166:0x0149, B:168:0x0158, B:190:0x01b2, B:191:0x01b9), top: B:203:0x00d8 }] */
    @Override // en.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(zm.w r19) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gn.p.d(zm.w):void");
    }

    @Override // en.d
    public final y e(a0 a0Var) {
        r rVar = this.f15623a;
        gm.l.c(rVar);
        return rVar.f15646g;
    }

    @Override // en.d
    public final void f() {
        this.f15628f.flush();
    }

    @Override // en.d
    public final ln.w g(zm.w wVar, long j10) {
        r rVar = this.f15623a;
        gm.l.c(rVar);
        return rVar.f();
    }

    @Override // en.d
    public final dn.h getConnection() {
        return this.f15626d;
    }
}
