package zm;

import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class c0 implements Closeable {

    /* renamed from: a */
    public static final a f32573a = new a();

    /* loaded from: classes2.dex */
    public static final class a {
    }

    public abstract long a();

    public abstract s b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        an.c.b(h());
    }

    public abstract ln.g h();
}
