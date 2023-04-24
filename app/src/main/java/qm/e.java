package qm;

import fm.l;
import gm.m;

/* loaded from: classes2.dex */
public final class e extends m implements l<Throwable, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ f f24989b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f24990c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, d dVar) {
        super(1);
        this.f24989b = fVar;
        this.f24990c = dVar;
    }

    @Override // fm.l
    public final tl.l k(Throwable th2) {
        this.f24989b.f24991c.removeCallbacks(this.f24990c);
        return tl.l.f28297a;
    }
}
