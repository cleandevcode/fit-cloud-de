package androidx.fragment.app;

import androidx.fragment.app.r;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class t extends r.e {

    /* renamed from: a */
    public final /* synthetic */ o.a f2588a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f2589b;

    /* renamed from: c */
    public final /* synthetic */ e.a f2590c;

    /* renamed from: d */
    public final /* synthetic */ androidx.activity.result.b f2591d;

    /* renamed from: e */
    public final /* synthetic */ r f2592e;

    public t(r rVar, s sVar, AtomicReference atomicReference, e.a aVar, androidx.activity.result.b bVar) {
        this.f2592e = rVar;
        this.f2588a = sVar;
        this.f2589b = atomicReference;
        this.f2590c = aVar;
        this.f2591d = bVar;
    }

    @Override // androidx.fragment.app.r.e
    public final void a() {
        r rVar = this.f2592e;
        rVar.getClass();
        this.f2589b.set(((androidx.activity.result.g) this.f2588a.apply(null)).c("fragment_" + rVar.f2514e + "_rq#" + rVar.f2521h0.getAndIncrement(), this.f2592e, this.f2590c, this.f2591d));
    }
}
