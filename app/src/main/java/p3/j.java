package p3;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: b */
    public final Executor f23810b;

    /* renamed from: d */
    public volatile Runnable f23812d;

    /* renamed from: a */
    public final ArrayDeque<a> f23809a = new ArrayDeque<>();

    /* renamed from: c */
    public final Object f23811c = new Object();

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        public final j f23813a;

        /* renamed from: b */
        public final Runnable f23814b;

        public a(j jVar, Runnable runnable) {
            this.f23813a = jVar;
            this.f23814b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f23814b.run();
            } finally {
                this.f23813a.a();
            }
        }
    }

    public j(ExecutorService executorService) {
        this.f23810b = executorService;
    }

    public final void a() {
        synchronized (this.f23811c) {
            a poll = this.f23809a.poll();
            this.f23812d = poll;
            if (poll != null) {
                this.f23810b.execute(this.f23812d);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f23811c) {
            this.f23809a.add(new a(this, runnable));
            if (this.f23812d == null) {
                a();
            }
        }
    }
}
