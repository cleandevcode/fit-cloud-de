package u6;

import com.github.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$observer$1;

/* loaded from: classes.dex */
public final class n extends gm.m implements fm.l<Throwable, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ androidx.lifecycle.k f28600b;

    /* renamed from: c */
    public final /* synthetic */ MavericksLifecycleAwareFlowKt$startedChannel$observer$1 f28601c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.lifecycle.k kVar, MavericksLifecycleAwareFlowKt$startedChannel$observer$1 mavericksLifecycleAwareFlowKt$startedChannel$observer$1) {
        super(1);
        this.f28600b = kVar;
        this.f28601c = mavericksLifecycleAwareFlowKt$startedChannel$observer$1;
    }

    @Override // fm.l
    public final tl.l k(Throwable th2) {
        this.f28600b.c(this.f28601c);
        return tl.l.f28297a;
    }
}
