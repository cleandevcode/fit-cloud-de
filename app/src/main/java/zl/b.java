package zl;

/* loaded from: classes2.dex */
public final class b implements xl.d<Object> {

    /* renamed from: a */
    public static final b f32508a = new b();

    @Override // xl.d
    public final xl.f e() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // xl.d
    public final void l(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
