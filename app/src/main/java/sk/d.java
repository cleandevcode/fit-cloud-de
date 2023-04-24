package sk;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import tk.o;

/* loaded from: classes2.dex */
public final class d extends o {

    /* renamed from: c */
    public final Handler f27101c;

    /* renamed from: d */
    public final boolean f27102d;

    /* loaded from: classes2.dex */
    public static final class a extends o.c {

        /* renamed from: a */
        public final Handler f27103a;

        /* renamed from: b */
        public final boolean f27104b;

        /* renamed from: c */
        public volatile boolean f27105c;

        public a(Handler handler, boolean z10) {
            this.f27103a = handler;
            this.f27104b = z10;
        }

        @Override // tk.o.c
        @SuppressLint({"NewApi"})
        public final uk.c b(Runnable runnable, long j10, TimeUnit timeUnit) {
            xk.c cVar = xk.c.INSTANCE;
            if (runnable != null) {
                if (timeUnit != null) {
                    if (this.f27105c) {
                        return cVar;
                    }
                    Handler handler = this.f27103a;
                    b bVar = new b(handler, runnable);
                    Message obtain = Message.obtain(handler, bVar);
                    obtain.obj = this;
                    if (this.f27104b) {
                        obtain.setAsynchronous(true);
                    }
                    this.f27103a.sendMessageDelayed(obtain, timeUnit.toMillis(j10));
                    if (this.f27105c) {
                        this.f27103a.removeCallbacks(bVar);
                        return cVar;
                    }
                    return bVar;
                }
                throw new NullPointerException("unit == null");
            }
            throw new NullPointerException("run == null");
        }

        @Override // uk.c
        public final void c() {
            this.f27105c = true;
            this.f27103a.removeCallbacksAndMessages(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Runnable, uk.c {

        /* renamed from: a */
        public final Handler f27106a;

        /* renamed from: b */
        public final Runnable f27107b;

        public b(Handler handler, Runnable runnable) {
            this.f27106a = handler;
            this.f27107b = runnable;
        }

        @Override // uk.c
        public final void c() {
            this.f27106a.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f27107b.run();
            } catch (Throwable th2) {
                ol.a.a(th2);
            }
        }
    }

    public d(Handler handler, boolean z10) {
        this.f27101c = handler;
        this.f27102d = z10;
    }

    @Override // tk.o
    public final o.c b() {
        return new a(this.f27101c, this.f27102d);
    }

    @Override // tk.o
    @SuppressLint({"NewApi"})
    public final uk.c d(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit != null) {
                Handler handler = this.f27101c;
                b bVar = new b(handler, runnable);
                Message obtain = Message.obtain(handler, bVar);
                if (this.f27102d) {
                    obtain.setAsynchronous(true);
                }
                this.f27101c.sendMessageDelayed(obtain, timeUnit.toMillis(j10));
                return bVar;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }
}
