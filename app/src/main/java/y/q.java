package y;

/* loaded from: classes.dex */
public abstract class q {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract Throwable a();

        public abstract int b();
    }

    /* loaded from: classes.dex */
    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public abstract a a();

    public abstract b b();
}
