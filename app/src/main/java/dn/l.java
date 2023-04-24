package dn;

import cn.sharesdk.framework.InnerShareParams;
import f.s;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import zm.d0;
import zm.m;
import zm.q;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a */
    public List<? extends Proxy> f13265a;

    /* renamed from: b */
    public int f13266b;

    /* renamed from: c */
    public List<? extends InetSocketAddress> f13267c;

    /* renamed from: d */
    public final ArrayList f13268d;

    /* renamed from: e */
    public final zm.a f13269e;

    /* renamed from: f */
    public final s f13270f;

    /* renamed from: g */
    public final zm.d f13271g;

    /* renamed from: h */
    public final m f13272h;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public int f13273a;

        /* renamed from: b */
        public final List<d0> f13274b;

        public a(ArrayList arrayList) {
            this.f13274b = arrayList;
        }

        public final boolean a() {
            return this.f13273a < this.f13274b.size();
        }
    }

    public l(zm.a aVar, s sVar, e eVar, m mVar) {
        boolean z10;
        List<? extends Proxy> t10;
        gm.l.f(aVar, InnerShareParams.ADDRESS);
        gm.l.f(sVar, "routeDatabase");
        gm.l.f(eVar, "call");
        gm.l.f(mVar, "eventListener");
        this.f13269e = aVar;
        this.f13270f = sVar;
        this.f13271g = eVar;
        this.f13272h = mVar;
        ul.s sVar2 = ul.s.f28879a;
        this.f13265a = sVar2;
        this.f13267c = sVar2;
        this.f13268d = new ArrayList();
        q qVar = aVar.f32518a;
        Proxy proxy = aVar.f32527j;
        gm.l.f(qVar, InnerShareParams.URL);
        if (proxy != null) {
            t10 = h7.a.p(proxy);
        } else {
            URI g10 = qVar.g();
            if (g10.getHost() == null) {
                t10 = an.c.j(Proxy.NO_PROXY);
            } else {
                List<Proxy> select = aVar.f32528k.select(g10);
                if (select != null && !select.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    t10 = an.c.j(Proxy.NO_PROXY);
                } else {
                    t10 = an.c.t(select);
                }
            }
        }
        this.f13265a = t10;
        this.f13266b = 0;
    }

    public final boolean a() {
        boolean z10;
        if (this.f13266b < this.f13265a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (!this.f13268d.isEmpty())) {
            return true;
        }
        return false;
    }
}
