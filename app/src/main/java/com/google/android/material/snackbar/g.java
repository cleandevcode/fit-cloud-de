package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e */
    public static g f6673e;

    /* renamed from: a */
    public final Object f6674a = new Object();

    /* renamed from: b */
    public final Handler f6675b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c */
    public c f6676c;

    /* renamed from: d */
    public c f6677d;

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
            g.this = r1;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            g gVar = g.this;
            c cVar = (c) message.obj;
            synchronized (gVar.f6674a) {
                if (gVar.f6676c == cVar || gVar.f6677d == cVar) {
                    gVar.a(cVar, 2);
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void b();

        void c(int i10);
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final WeakReference<b> f6679a;

        /* renamed from: b */
        public int f6680b;

        /* renamed from: c */
        public boolean f6681c;

        public c(int i10, BaseTransientBottomBar.c cVar) {
            this.f6679a = new WeakReference<>(cVar);
            this.f6680b = i10;
        }
    }

    public static g b() {
        if (f6673e == null) {
            f6673e = new g();
        }
        return f6673e;
    }

    public final boolean a(c cVar, int i10) {
        b bVar = cVar.f6679a.get();
        if (bVar != null) {
            this.f6675b.removeCallbacksAndMessages(cVar);
            bVar.c(i10);
            return true;
        }
        return false;
    }

    public final boolean c(BaseTransientBottomBar.c cVar) {
        c cVar2 = this.f6676c;
        if (cVar2 != null) {
            if (cVar != null && cVar2.f6679a.get() == cVar) {
                return true;
            }
        }
        return false;
    }

    public final void d(c cVar) {
        int i10 = cVar.f6680b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f6675b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f6675b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }
}
