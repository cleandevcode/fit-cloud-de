package jj;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class d0 implements c {

    /* renamed from: a */
    public final wi.a f17881a;

    /* renamed from: b */
    public final b f17882b;

    /* renamed from: c */
    public final vi.d f17883c;

    /* renamed from: d */
    public volatile boolean f17884d;

    /* renamed from: e */
    public final ql.d<Integer> f17885e;

    /* renamed from: f */
    public volatile int f17886f;

    /* renamed from: g */
    public final AtomicInteger f17887g;

    /* renamed from: h */
    public final g0 f17888h;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public d0(wi.k kVar, l lVar, vi.d dVar) {
        gm.l.f(kVar, "connector");
        gm.l.f(lVar, "configFeature");
        gm.l.f(dVar, "processVisibilityManager");
        this.f17881a = kVar;
        this.f17882b = lVar;
        this.f17883c = dVar;
        this.f17885e = new ql.b().G();
        this.f17887g = new AtomicInteger(0);
        this.f17888h = new g0(this);
    }
}
