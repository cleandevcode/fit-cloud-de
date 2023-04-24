package sa;

/* loaded from: classes.dex */
public final class u extends v {
    @Override // sa.v
    public final <T> T b(Class<T> cls) {
        throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
    }
}
