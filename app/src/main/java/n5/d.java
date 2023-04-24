package n5;

/* loaded from: classes.dex */
public abstract class d {

    /* loaded from: classes.dex */
    public static class a extends d {

        /* renamed from: a */
        public volatile boolean f22042a;

        public final void a() {
            if (this.f22042a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
