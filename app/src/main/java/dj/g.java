package dj;

import fm.l;
import gm.m;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class g extends m implements l<uc.e, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ AtomicInteger f13120b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AtomicInteger atomicInteger) {
        super(1);
        this.f13120b = atomicInteger;
    }

    @Override // fm.l
    public final tl.l k(uc.e eVar) {
        this.f13120b.incrementAndGet();
        return tl.l.f28297a;
    }
}
