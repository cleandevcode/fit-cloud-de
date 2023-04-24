package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.f;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import f1.o;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements u2.a<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends f.c {
        public a(Context context) {
            super(new b(context));
            this.f2249b = 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements f.g {

        /* renamed from: a */
        public final Context f2230a;

        public b(Context context) {
            this.f2230a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.g
        public final void a(f.h hVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new g(this, hVar, threadPoolExecutor, 0));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                int i10 = f1.o.f14038a;
                o.a.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.f2236j != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f.a().c();
                }
                o.a.b();
            } catch (Throwable th2) {
                int i11 = f1.o.f14038a;
                o.a.b();
                throw th2;
            }
        }
    }

    @Override // u2.a
    public final List<Class<? extends u2.a<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // u2.a
    /* renamed from: c */
    public final Boolean b(Context context) {
        Object obj;
        a aVar = new a(context);
        if (f.f2236j == null) {
            synchronized (f.f2235i) {
                if (f.f2236j == null) {
                    f.f2236j = new f(aVar);
                }
            }
        }
        androidx.startup.a c10 = androidx.startup.a.c(context);
        c10.getClass();
        synchronized (androidx.startup.a.f3352e) {
            try {
                obj = c10.f3353a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c10.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final v a02 = ((u) obj).a0();
        a02.a(new androidx.lifecycle.g() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.g
            public final /* synthetic */ void c(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onDestroy(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onPause(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final void onResume(u uVar) {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = androidx.emoji2.text.b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new c(), 500L);
                a02.c(this);
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onStart(u uVar) {
            }

            @Override // androidx.lifecycle.g
            public final /* synthetic */ void onStop(u uVar) {
            }
        });
        return Boolean.TRUE;
    }
}
