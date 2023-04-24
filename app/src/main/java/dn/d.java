package dn;

import cn.sharesdk.framework.InnerShareParams;
import com.huawei.hms.scankit.C0637e;
import dn.l;
import gn.x;
import java.io.IOException;
import zm.d0;
import zm.m;
import zm.q;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    public l.a f13204a;

    /* renamed from: b */
    public l f13205b;

    /* renamed from: c */
    public int f13206c;

    /* renamed from: d */
    public int f13207d;

    /* renamed from: e */
    public int f13208e;

    /* renamed from: f */
    public d0 f13209f;

    /* renamed from: g */
    public final j f13210g;

    /* renamed from: h */
    public final zm.a f13211h;

    /* renamed from: i */
    public final e f13212i;

    /* renamed from: j */
    public final m f13213j;

    public d(j jVar, zm.a aVar, e eVar, m mVar) {
        gm.l.f(jVar, "connectionPool");
        gm.l.f(mVar, "eventListener");
        this.f13210g = jVar;
        this.f13211h = aVar;
        this.f13212i = eVar;
        this.f13213j = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:357:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x02b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0325 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final dn.h a(int r15, int r16, int r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.d.a(int, int, int, boolean, boolean):dn.h");
    }

    public final boolean b(q qVar) {
        gm.l.f(qVar, InnerShareParams.URL);
        q qVar2 = this.f13211h.f32518a;
        if (qVar.f32662f == qVar2.f32662f && gm.l.a(qVar.f32661e, qVar2.f32661e)) {
            return true;
        }
        return false;
    }

    public final void c(IOException iOException) {
        gm.l.f(iOException, C0637e.f7371a);
        this.f13209f = null;
        if ((iOException instanceof x) && ((x) iOException).f15680a == gn.b.REFUSED_STREAM) {
            this.f13206c++;
        } else if (iOException instanceof gn.a) {
            this.f13207d++;
        } else {
            this.f13208e++;
        }
    }
}
