package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.appcompat.widget.u0;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import g8.e;
import g8.f;
import g8.h;
import g8.i;
import h8.g0;
import h8.i1;
import h8.j1;
import h8.y0;
import i8.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import v8.j;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends h> extends e<R> {

    /* renamed from: j */
    public static final i1 f6061j = new i1(0);

    /* renamed from: e */
    public h f6066e;

    /* renamed from: f */
    public Status f6067f;

    /* renamed from: g */
    public volatile boolean f6068g;

    /* renamed from: h */
    public boolean f6069h;
    @KeepName
    private j1 mResultGuardian;

    /* renamed from: a */
    public final Object f6062a = new Object();

    /* renamed from: b */
    public final CountDownLatch f6063b = new CountDownLatch(1);

    /* renamed from: c */
    public final ArrayList f6064c = new ArrayList();

    /* renamed from: d */
    public final AtomicReference f6065d = new AtomicReference();

    /* renamed from: i */
    public boolean f6070i = false;

    /* loaded from: classes.dex */
    public static class a<R extends h> extends j {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    Log.wtf("BasePendingResult", u0.a("Don't know how to handle message: ", i10), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).c(Status.f6054i);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            i iVar = (i) pair.first;
            h hVar = (h) pair.second;
            try {
                iVar.a();
            } catch (RuntimeException e10) {
                BasePendingResult.h(hVar);
                throw e10;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        new a(Looper.getMainLooper());
        new WeakReference(null);
    }

    public BasePendingResult(g0 g0Var) {
        Looper mainLooper;
        if (g0Var != null) {
            mainLooper = g0Var.f15953b.f15022f;
        } else {
            mainLooper = Looper.getMainLooper();
        }
        new a(mainLooper);
        new WeakReference(g0Var);
    }

    public static void h(h hVar) {
        if (hVar instanceof f) {
            try {
                ((f) hVar).release();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(hVar)), e10);
            }
        }
    }

    public final void a(e.a aVar) {
        synchronized (this.f6062a) {
            if (d()) {
                aVar.a(this.f6067f);
            } else {
                this.f6064c.add(aVar);
            }
        }
    }

    public abstract R b(Status status);

    @Deprecated
    public final void c(Status status) {
        synchronized (this.f6062a) {
            if (!d()) {
                e(b(status));
                this.f6069h = true;
            }
        }
    }

    public final boolean d() {
        return this.f6063b.getCount() == 0;
    }

    public final void e(R r10) {
        synchronized (this.f6062a) {
            if (this.f6069h) {
                h(r10);
                return;
            }
            d();
            p.h("Results have already been set", !d());
            p.h("Result has already been consumed", !this.f6068g);
            g(r10);
        }
    }

    public final h f() {
        h hVar;
        synchronized (this.f6062a) {
            p.h("Result has already been consumed.", !this.f6068g);
            p.h("Result is not ready.", d());
            hVar = this.f6066e;
            this.f6066e = null;
            this.f6068g = true;
        }
        if (((y0) this.f6065d.getAndSet(null)) == null) {
            p.f(hVar);
            return hVar;
        }
        throw null;
    }

    public final void g(h hVar) {
        this.f6066e = hVar;
        this.f6067f = hVar.d();
        this.f6063b.countDown();
        if (this.f6066e instanceof f) {
            this.mResultGuardian = new j1(this);
        }
        ArrayList arrayList = this.f6064c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e.a) arrayList.get(i10)).a(this.f6067f);
        }
        this.f6064c.clear();
    }
}
