package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.appcompat.widget.r2;
import androidx.emoji2.text.f;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s.h1;

/* loaded from: classes.dex */
public final class l extends f.c {

    /* renamed from: d */
    public static final a f2275d = new a();

    /* loaded from: classes.dex */
    public static class a {
    }

    /* loaded from: classes.dex */
    public static class b implements f.g {

        /* renamed from: a */
        public final Context f2276a;

        /* renamed from: b */
        public final g1.f f2277b;

        /* renamed from: c */
        public final a f2278c;

        /* renamed from: d */
        public final Object f2279d;

        /* renamed from: e */
        public Handler f2280e;

        /* renamed from: f */
        public Executor f2281f;

        /* renamed from: g */
        public ThreadPoolExecutor f2282g;

        /* renamed from: h */
        public f.h f2283h;

        public b(Context context, g1.f fVar) {
            a aVar = l.f2275d;
            this.f2279d = new Object();
            h1.i(context, "Context cannot be null");
            this.f2276a = context.getApplicationContext();
            this.f2277b = fVar;
            this.f2278c = aVar;
        }

        @Override // androidx.emoji2.text.f.g
        public final void a(f.h hVar) {
            synchronized (this.f2279d) {
                this.f2283h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f2279d) {
                this.f2283h = null;
                Handler handler = this.f2280e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f2280e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2282g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2281f = null;
                this.f2282g = null;
            }
        }

        public final void c() {
            synchronized (this.f2279d) {
                if (this.f2283h == null) {
                    return;
                }
                if (this.f2281f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f2282g = threadPoolExecutor;
                    this.f2281f = threadPoolExecutor;
                }
                this.f2281f.execute(new r2(6, this));
            }
        }

        public final g1.m d() {
            try {
                a aVar = this.f2278c;
                Context context = this.f2276a;
                g1.f fVar = this.f2277b;
                aVar.getClass();
                g1.l a10 = g1.e.a(context, fVar);
                if (a10.f14830a == 0) {
                    g1.m[] mVarArr = a10.f14831b;
                    if (mVarArr != null && mVarArr.length != 0) {
                        return mVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(a0.q.b(android.support.v4.media.d.a("fetchFonts failed ("), a10.f14830a, ")"));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public l(Context context, g1.f fVar) {
        super(new b(context, fVar));
    }
}
