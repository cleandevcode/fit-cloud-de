package m2;

import android.annotation.SuppressLint;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c0 implements Executor {

    /* renamed from: a */
    public final Executor f20185a;

    /* renamed from: b */
    public final ArrayDeque<Runnable> f20186b;

    /* renamed from: c */
    public Runnable f20187c;

    /* renamed from: d */
    public final Object f20188d;

    public c0(Executor executor) {
        gm.l.f(executor, "executor");
        this.f20185a = executor;
        this.f20186b = new ArrayDeque<>();
        this.f20188d = new Object();
    }

    @SuppressLint({"BanSynchronizedMethods"})
    public final synchronized void a() {
        synchronized (this.f20188d) {
            Runnable poll = this.f20186b.poll();
            Runnable runnable = poll;
            this.f20187c = runnable;
            if (poll != null) {
                this.f20185a.execute(runnable);
            }
            tl.l lVar = tl.l.f28297a;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        gm.l.f(runnable, "command");
        synchronized (this.f20188d) {
            this.f20186b.offer(new t.n(runnable, this, 9));
            if (this.f20187c == null) {
                a();
            }
            tl.l lVar = tl.l.f28297a;
        }
    }
}
