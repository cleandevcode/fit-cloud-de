package androidx.lifecycle;

import androidx.lifecycle.k;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends p implements s {

    /* renamed from: a */
    public final k f2635a;

    /* renamed from: b */
    public final xl.f f2636b;

    public LifecycleCoroutineScopeImpl(k kVar, xl.f fVar) {
        gm.l.f(fVar, "coroutineContext");
        this.f2635a = kVar;
        this.f2636b = fVar;
        if (kVar.b() == k.c.DESTROYED) {
            bi.m0.f(fVar, null);
        }
    }

    @Override // pm.e0
    public final xl.f E() {
        return this.f2636b;
    }

    @Override // androidx.lifecycle.p
    public final k a() {
        return this.f2635a;
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, k.b bVar) {
        if (this.f2635a.b().compareTo(k.c.DESTROYED) <= 0) {
            this.f2635a.c(this);
            bi.m0.f(this.f2636b, null);
        }
    }
}
