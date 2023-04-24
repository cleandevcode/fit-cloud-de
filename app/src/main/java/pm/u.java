package pm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24395b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f24396a;

    public u(Throwable th2, boolean z10) {
        this.f24396a = th2;
        this._handled = z10 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f24396a + ']';
    }
}
