package ud;

import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public abstract class b<T> extends Thread {

    /* renamed from: a */
    public volatile boolean f28684a = false;

    /* renamed from: b */
    public final LinkedBlockingDeque<T> f28685b = new LinkedBlockingDeque<>();
}
