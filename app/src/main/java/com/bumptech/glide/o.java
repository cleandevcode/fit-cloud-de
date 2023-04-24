package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.manager.q;
import com.bumptech.glide.manager.x;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class o implements ComponentCallbacks2, com.bumptech.glide.manager.j {

    /* renamed from: k */
    public static final i5.g f5793k;

    /* renamed from: a */
    public final com.bumptech.glide.b f5794a;

    /* renamed from: b */
    public final Context f5795b;

    /* renamed from: c */
    public final com.bumptech.glide.manager.i f5796c;

    /* renamed from: d */
    public final q f5797d;

    /* renamed from: e */
    public final com.bumptech.glide.manager.p f5798e;

    /* renamed from: f */
    public final x f5799f;

    /* renamed from: g */
    public final a f5800g;

    /* renamed from: h */
    public final com.bumptech.glide.manager.b f5801h;

    /* renamed from: i */
    public final CopyOnWriteArrayList<i5.f<Object>> f5802i;

    /* renamed from: j */
    public i5.g f5803j;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            o.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o oVar = o.this;
            oVar.f5796c.f(oVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends j5.d<View, Object> {
        public b(View view) {
            super(view);
        }

        @Override // j5.h
        public final void c(Object obj) {
        }

        @Override // j5.h
        public final void e(Drawable drawable) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements b.a {

        /* renamed from: a */
        public final q f5805a;

        public c(q qVar) {
            o.this = r1;
            this.f5805a = qVar;
        }

        @Override // com.bumptech.glide.manager.b.a
        public final void a(boolean z10) {
            if (z10) {
                synchronized (o.this) {
                    this.f5805a.b();
                }
            }
        }
    }

    static {
        i5.g c10 = new i5.g().c(Bitmap.class);
        c10.f16519t = true;
        f5793k = c10;
        new i5.g().c(e5.c.class).f16519t = true;
        i5.g gVar = (i5.g) ((i5.g) new i5.g().d(t4.n.f27657b).l()).p();
    }

    public o(com.bumptech.glide.b bVar, com.bumptech.glide.manager.i iVar, com.bumptech.glide.manager.p pVar, Context context) {
        boolean z10;
        com.bumptech.glide.manager.b mVar;
        i5.g gVar;
        String str;
        q qVar = new q();
        com.bumptech.glide.manager.c cVar = bVar.f5665f;
        this.f5799f = new x();
        a aVar = new a();
        this.f5800g = aVar;
        this.f5794a = bVar;
        this.f5796c = iVar;
        this.f5798e = pVar;
        this.f5797d = qVar;
        this.f5795b = context;
        Context applicationContext = context.getApplicationContext();
        c cVar2 = new c(qVar);
        ((com.bumptech.glide.manager.e) cVar).getClass();
        if (y0.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z10) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z10) {
            mVar = new com.bumptech.glide.manager.d(applicationContext, cVar2);
        } else {
            mVar = new com.bumptech.glide.manager.m();
        }
        this.f5801h = mVar;
        char[] cArr = m5.l.f20382a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            m5.l.f().post(aVar);
        } else {
            iVar.f(this);
        }
        iVar.f(mVar);
        this.f5802i = new CopyOnWriteArrayList<>(bVar.f5662c.f5672e);
        h hVar = bVar.f5662c;
        synchronized (hVar) {
            if (hVar.f5677j == null) {
                ((com.bumptech.glide.c) hVar.f5671d).getClass();
                i5.g gVar2 = new i5.g();
                gVar2.f16519t = true;
                hVar.f5677j = gVar2;
            }
            gVar = hVar.f5677j;
        }
        synchronized (this) {
            i5.g clone = gVar.clone();
            if (clone.f16519t && !clone.f16521v) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            clone.f16521v = true;
            clone.f16519t = true;
            this.f5803j = clone;
        }
        synchronized (bVar.f5666g) {
            if (!bVar.f5666g.contains(this)) {
                bVar.f5666g.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public final n<Bitmap> i() {
        return new n(this.f5794a, this, Bitmap.class, this.f5795b).x(f5793k);
    }

    public final void j(j5.h<?> hVar) {
        boolean z10;
        if (hVar == null) {
            return;
        }
        boolean n10 = n(hVar);
        i5.d g10 = hVar.g();
        if (!n10) {
            com.bumptech.glide.b bVar = this.f5794a;
            synchronized (bVar.f5666g) {
                Iterator it = bVar.f5666g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((o) it.next()).n(hVar)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
            }
            if (!z10 && g10 != null) {
                hVar.b(null);
                g10.clear();
            }
        }
    }

    public final n<Drawable> k(Object obj) {
        return new n(this.f5794a, this, Drawable.class, this.f5795b).C(obj);
    }

    public final synchronized void l() {
        q qVar = this.f5797d;
        qVar.f5756c = true;
        Iterator it = m5.l.e(qVar.f5754a).iterator();
        while (it.hasNext()) {
            i5.d dVar = (i5.d) it.next();
            if (dVar.isRunning()) {
                dVar.pause();
                qVar.f5755b.add(dVar);
            }
        }
    }

    public final synchronized void m() {
        q qVar = this.f5797d;
        qVar.f5756c = false;
        Iterator it = m5.l.e(qVar.f5754a).iterator();
        while (it.hasNext()) {
            i5.d dVar = (i5.d) it.next();
            if (!dVar.i() && !dVar.isRunning()) {
                dVar.h();
            }
        }
        qVar.f5755b.clear();
    }

    public final synchronized boolean n(j5.h<?> hVar) {
        i5.d g10 = hVar.g();
        if (g10 == null) {
            return true;
        }
        if (this.f5797d.a(g10)) {
            this.f5799f.f5790a.remove(hVar);
            hVar.b(null);
            return true;
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.j
    public final synchronized void onDestroy() {
        this.f5799f.onDestroy();
        Iterator it = m5.l.e(this.f5799f.f5790a).iterator();
        while (it.hasNext()) {
            j((j5.h) it.next());
        }
        this.f5799f.f5790a.clear();
        q qVar = this.f5797d;
        Iterator it2 = m5.l.e(qVar.f5754a).iterator();
        while (it2.hasNext()) {
            qVar.a((i5.d) it2.next());
        }
        qVar.f5755b.clear();
        this.f5796c.g(this);
        this.f5796c.g(this.f5801h);
        m5.l.f().removeCallbacks(this.f5800g);
        this.f5794a.d(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.j
    public final synchronized void onStart() {
        m();
        this.f5799f.onStart();
    }

    @Override // com.bumptech.glide.manager.j
    public final synchronized void onStop() {
        l();
        this.f5799f.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f5797d + ", treeNode=" + this.f5798e + "}";
    }
}
