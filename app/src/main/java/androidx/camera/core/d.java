package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.j;
import java.util.HashSet;
import java.util.Iterator;
import y.o0;

/* loaded from: classes.dex */
public abstract class d implements j {

    /* renamed from: b */
    public final j f1622b;

    /* renamed from: a */
    public final Object f1621a = new Object();

    /* renamed from: c */
    public final HashSet f1623c = new HashSet();

    /* loaded from: classes.dex */
    public interface a {
        void a(j jVar);
    }

    public d(j jVar) {
        this.f1622b = jVar;
    }

    public final void a(a aVar) {
        synchronized (this.f1621a) {
            this.f1623c.add(aVar);
        }
    }

    @Override // androidx.camera.core.j
    public int c() {
        return this.f1622b.c();
    }

    @Override // androidx.camera.core.j, java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.f1622b.close();
        synchronized (this.f1621a) {
            hashSet = new HashSet(this.f1623c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this);
        }
    }

    @Override // androidx.camera.core.j
    public o0 d0() {
        return this.f1622b.d0();
    }

    @Override // androidx.camera.core.j
    public int f() {
        return this.f1622b.f();
    }

    @Override // androidx.camera.core.j
    public final int getFormat() {
        return this.f1622b.getFormat();
    }

    @Override // androidx.camera.core.j
    public final j.a[] l() {
        return this.f1622b.l();
    }

    @Override // androidx.camera.core.j
    public final Image s0() {
        return this.f1622b.s0();
    }

    @Override // androidx.camera.core.j
    public Rect z() {
        return this.f1622b.z();
    }
}
