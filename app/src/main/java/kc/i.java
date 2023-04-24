package kc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class i implements v3.c<ExecutorService> {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final i f18334a = new i();
    }

    @Override // w3.a
    public final Object get() {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        b0.c.j(newCachedThreadPool);
        return newCachedThreadPool;
    }
}
