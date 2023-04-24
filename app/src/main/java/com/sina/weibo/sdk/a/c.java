package com.sina.weibo.sdk.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public abstract class c<Params, Progress, Result> {
    public final d<Params, Result> M;
    public final FutureTask<Result> N;
    public Params[] P;
    public volatile int L = b.U;
    public int O = 5;

    /* renamed from: x */
    public Handler f9482x = new Handler(Looper.getMainLooper()) { // from class: com.sina.weibo.sdk.a.c.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            a aVar = (a) message.obj;
            if (message.what != 1) {
                return;
            }
            c.a(aVar.S, aVar.T[0]);
            message.obj = null;
        }
    };

    /* renamed from: com.sina.weibo.sdk.a.c$4 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] R;

        static {
            int[] iArr = new int[b.m().length];
            R = iArr;
            try {
                iArr[b.V - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                R[b.W - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a<Data> {
        public final c S;
        public final Data[] T;

        public a(c cVar, Data... dataArr) {
            this.S = cVar;
            this.T = dataArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static final int U = 1;
        public static final int V = 2;
        public static final int W = 3;
        private static final /* synthetic */ int[] X = {1, 2, 3};

        public static int[] m() {
            return (int[]) X.clone();
        }
    }

    /* renamed from: com.sina.weibo.sdk.a.c$c */
    /* loaded from: classes.dex */
    public abstract class AbstractC0119c extends FutureTask<Result> implements Comparable<Object> {
        public int priority;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC0119c(d dVar) {
            super(dVar);
            c.this = r1;
            this.priority = dVar.priority;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d<Params, Result> implements Callable<Result> {
        public Params[] Y;
        public int priority;

        private d() {
            this.priority = 10;
        }

        public /* synthetic */ d(byte b10) {
            this();
        }
    }

    public c() {
        d<Params, Result> dVar = new d<Params, Result>() { // from class: com.sina.weibo.sdk.a.c.2
            @Override // java.util.concurrent.Callable
            public final Result call() {
                Process.setThreadPriority(c.this.O);
                return (Result) c.this.l();
            }
        };
        this.M = dVar;
        this.N = new c<Params, Progress, Result>.AbstractC0119c(dVar) { // from class: com.sina.weibo.sdk.a.c.3
            @Override // java.lang.Comparable
            public final int compareTo(Object obj) {
                return 0;
            }

            @Override // java.util.concurrent.FutureTask
            public final void done() {
                Message obtainMessage;
                try {
                    Result result = get();
                    c cVar = c.this;
                    obtainMessage = cVar.f9482x.obtainMessage(1, new a(cVar, result));
                } catch (InterruptedException unused) {
                    throw new RuntimeException("An error occur while execute doInBackground().");
                } catch (CancellationException unused2) {
                    obtainMessage = c.this.f9482x.obtainMessage(3, new a(c.this, null));
                } catch (ExecutionException unused3) {
                    throw new RuntimeException("An error occur while execute doInBackground().");
                }
                obtainMessage.sendToTarget();
            }
        };
    }

    public static /* synthetic */ void a(c cVar, Object obj) {
        cVar.onPostExecute(obj);
        cVar.L = b.W;
    }

    public abstract Result l();

    public void onPostExecute(Result result) {
    }
}
