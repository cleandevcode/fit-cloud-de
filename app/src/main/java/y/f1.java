package y;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p0.c;

/* loaded from: classes.dex */
public final class f1 implements a0.b1 {

    /* renamed from: e */
    public final List<Integer> f30704e;

    /* renamed from: f */
    public String f30705f;

    /* renamed from: a */
    public final Object f30700a = new Object();

    /* renamed from: b */
    public final SparseArray<c.a<androidx.camera.core.j>> f30701b = new SparseArray<>();

    /* renamed from: c */
    public final SparseArray<na.a<androidx.camera.core.j>> f30702c = new SparseArray<>();

    /* renamed from: d */
    public final ArrayList f30703d = new ArrayList();

    /* renamed from: g */
    public boolean f30706g = false;

    /* loaded from: classes.dex */
    public class a implements c.InterfaceC0425c<androidx.camera.core.j> {

        /* renamed from: a */
        public final /* synthetic */ int f30707a;

        public a(int i10) {
            f1.this = r1;
            this.f30707a = i10;
        }

        @Override // p0.c.InterfaceC0425c
        public final String g(c.a aVar) {
            synchronized (f1.this.f30700a) {
                f1.this.f30701b.put(this.f30707a, aVar);
            }
            return a0.q.b(android.support.v4.media.d.a("getImageProxy(id: "), this.f30707a, ")");
        }
    }

    public f1(String str, List list) {
        this.f30704e = list;
        this.f30705f = str;
        f();
    }

    @Override // a0.b1
    public final na.a<androidx.camera.core.j> a(int i10) {
        na.a<androidx.camera.core.j> aVar;
        synchronized (this.f30700a) {
            if (this.f30706g) {
                throw new IllegalStateException("ImageProxyBundle already closed.");
            }
            aVar = this.f30702c.get(i10);
            if (aVar == null) {
                throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i10);
            }
        }
        return aVar;
    }

    @Override // a0.b1
    public final List<Integer> b() {
        return Collections.unmodifiableList(this.f30704e);
    }

    public final void c(androidx.camera.core.j jVar) {
        synchronized (this.f30700a) {
            if (this.f30706g) {
                return;
            }
            Integer num = (Integer) jVar.d0().b().a(this.f30705f);
            if (num == null) {
                throw new IllegalArgumentException("CaptureId is null.");
            }
            c.a<androidx.camera.core.j> aVar = this.f30701b.get(num.intValue());
            if (aVar != null) {
                this.f30703d.add(jVar);
                aVar.a(jVar);
                return;
            }
            throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + num);
        }
    }

    public final void d() {
        synchronized (this.f30700a) {
            if (this.f30706g) {
                return;
            }
            Iterator it = this.f30703d.iterator();
            while (it.hasNext()) {
                ((androidx.camera.core.j) it.next()).close();
            }
            this.f30703d.clear();
            this.f30702c.clear();
            this.f30701b.clear();
            this.f30706g = true;
        }
    }

    public final void e() {
        synchronized (this.f30700a) {
            if (this.f30706g) {
                return;
            }
            Iterator it = this.f30703d.iterator();
            while (it.hasNext()) {
                ((androidx.camera.core.j) it.next()).close();
            }
            this.f30703d.clear();
            this.f30702c.clear();
            this.f30701b.clear();
            f();
        }
    }

    public final void f() {
        synchronized (this.f30700a) {
            for (Integer num : this.f30704e) {
                int intValue = num.intValue();
                this.f30702c.put(intValue, p0.c.a(new a(intValue)));
            }
        }
    }
}
