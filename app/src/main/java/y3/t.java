package y3;

import com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$observer$1;

/* loaded from: classes.dex */
public final class t extends gm.m implements fm.l<Throwable, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ androidx.lifecycle.k f31071b;

    /* renamed from: c */
    public final /* synthetic */ MavericksLifecycleAwareFlowKt$startedChannel$observer$1 f31072c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.lifecycle.k kVar, MavericksLifecycleAwareFlowKt$startedChannel$observer$1 mavericksLifecycleAwareFlowKt$startedChannel$observer$1) {
        super(1);
        this.f31071b = kVar;
        this.f31072c = mavericksLifecycleAwareFlowKt$startedChannel$observer$1;
    }

    @Override // fm.l
    public final tl.l k(Throwable th2) {
        this.f31071b.c(this.f31072c);
        return tl.l.f28297a;
    }
}
