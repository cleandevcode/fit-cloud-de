package ao;

import ao.h;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class g implements c<Object, b<?>> {

    /* renamed from: a */
    public final /* synthetic */ Type f3810a;

    /* renamed from: b */
    public final /* synthetic */ Executor f3811b;

    public g(Type type, Executor executor) {
        this.f3810a = type;
        this.f3811b = executor;
    }

    @Override // ao.c
    public final Type a() {
        return this.f3810a;
    }

    @Override // ao.c
    public final Object b(s sVar) {
        Executor executor = this.f3811b;
        return executor == null ? sVar : new h.a(executor, sVar);
    }
}
