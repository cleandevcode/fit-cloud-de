package androidx.camera.lifecycle;

import androidx.lifecycle.c0;
import androidx.lifecycle.k;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import e0.e;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import s.h1;

/* loaded from: classes.dex */
public final class LifecycleCameraRepository {

    /* renamed from: a */
    public final Object f1828a = new Object();

    /* renamed from: b */
    public final HashMap f1829b = new HashMap();

    /* renamed from: c */
    public final HashMap f1830c = new HashMap();

    /* renamed from: d */
    public final ArrayDeque<u> f1831d = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public static class LifecycleCameraRepositoryObserver implements t {

        /* renamed from: a */
        public final LifecycleCameraRepository f1832a;

        /* renamed from: b */
        public final u f1833b;

        public LifecycleCameraRepositoryObserver(u uVar, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f1833b = uVar;
            this.f1832a = lifecycleCameraRepository;
        }

        @c0(k.b.ON_DESTROY)
        public void onDestroy(u uVar) {
            LifecycleCameraRepository lifecycleCameraRepository = this.f1832a;
            synchronized (lifecycleCameraRepository.f1828a) {
                LifecycleCameraRepositoryObserver b10 = lifecycleCameraRepository.b(uVar);
                if (b10 != null) {
                    lifecycleCameraRepository.f(uVar);
                    for (a aVar : (Set) lifecycleCameraRepository.f1830c.get(b10)) {
                        lifecycleCameraRepository.f1829b.remove(aVar);
                    }
                    lifecycleCameraRepository.f1830c.remove(b10);
                    b10.f1833b.a0().c(b10);
                }
            }
        }

        @c0(k.b.ON_START)
        public void onStart(u uVar) {
            this.f1832a.e(uVar);
        }

        @c0(k.b.ON_STOP)
        public void onStop(u uVar) {
            this.f1832a.f(uVar);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract e.b a();

        public abstract u b();
    }

    public final void a(LifecycleCamera lifecycleCamera, List list, List list2) {
        boolean z10;
        u uVar;
        synchronized (this.f1828a) {
            if (!list2.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            h1.f(z10);
            synchronized (lifecycleCamera.f1824a) {
                uVar = lifecycleCamera.f1825b;
            }
            for (a aVar : (Set) this.f1830c.get(b(uVar))) {
                LifecycleCamera lifecycleCamera2 = (LifecycleCamera) this.f1829b.get(aVar);
                lifecycleCamera2.getClass();
                if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.f().isEmpty()) {
                    throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                }
            }
            try {
                e0.e eVar = lifecycleCamera.f1826c;
                synchronized (eVar.f13298i) {
                    eVar.f13295f = null;
                }
                e0.e eVar2 = lifecycleCamera.f1826c;
                synchronized (eVar2.f13298i) {
                    eVar2.f13296g = list;
                }
                synchronized (lifecycleCamera.f1824a) {
                    lifecycleCamera.f1826c.c(list2);
                }
                if (uVar.a0().f2790c.a(k.c.STARTED)) {
                    e(uVar);
                }
            } catch (e.a e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
    }

    public final LifecycleCameraRepositoryObserver b(u uVar) {
        synchronized (this.f1828a) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.f1830c.keySet()) {
                if (uVar.equals(lifecycleCameraRepositoryObserver.f1833b)) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    public final boolean c(u uVar) {
        synchronized (this.f1828a) {
            LifecycleCameraRepositoryObserver b10 = b(uVar);
            if (b10 == null) {
                return false;
            }
            for (a aVar : (Set) this.f1830c.get(b10)) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f1829b.get(aVar);
                lifecycleCamera.getClass();
                if (!lifecycleCamera.f().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void d(LifecycleCamera lifecycleCamera) {
        u uVar;
        Set hashSet;
        synchronized (this.f1828a) {
            synchronized (lifecycleCamera.f1824a) {
                uVar = lifecycleCamera.f1825b;
            }
            androidx.camera.lifecycle.a aVar = new androidx.camera.lifecycle.a(uVar, lifecycleCamera.f1826c.f13293d);
            LifecycleCameraRepositoryObserver b10 = b(uVar);
            if (b10 != null) {
                hashSet = (Set) this.f1830c.get(b10);
            } else {
                hashSet = new HashSet();
            }
            hashSet.add(aVar);
            this.f1829b.put(aVar, lifecycleCamera);
            if (b10 == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(uVar, this);
                this.f1830c.put(lifecycleCameraRepositoryObserver, hashSet);
                uVar.a0().a(lifecycleCameraRepositoryObserver);
            }
        }
    }

    public final void e(u uVar) {
        ArrayDeque<u> arrayDeque;
        synchronized (this.f1828a) {
            if (c(uVar)) {
                if (!this.f1831d.isEmpty()) {
                    u peek = this.f1831d.peek();
                    if (!uVar.equals(peek)) {
                        g(peek);
                        this.f1831d.remove(uVar);
                        arrayDeque = this.f1831d;
                    }
                    h(uVar);
                }
                arrayDeque = this.f1831d;
                arrayDeque.push(uVar);
                h(uVar);
            }
        }
    }

    public final void f(u uVar) {
        synchronized (this.f1828a) {
            this.f1831d.remove(uVar);
            g(uVar);
            if (!this.f1831d.isEmpty()) {
                h(this.f1831d.peek());
            }
        }
    }

    public final void g(u uVar) {
        synchronized (this.f1828a) {
            LifecycleCameraRepositoryObserver b10 = b(uVar);
            if (b10 == null) {
                return;
            }
            for (a aVar : (Set) this.f1830c.get(b10)) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f1829b.get(aVar);
                lifecycleCamera.getClass();
                synchronized (lifecycleCamera.f1824a) {
                    if (!lifecycleCamera.f1827d) {
                        lifecycleCamera.onStop(lifecycleCamera.f1825b);
                        lifecycleCamera.f1827d = true;
                    }
                }
            }
        }
    }

    public final void h(u uVar) {
        synchronized (this.f1828a) {
            for (a aVar : (Set) this.f1830c.get(b(uVar))) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f1829b.get(aVar);
                lifecycleCamera.getClass();
                if (!lifecycleCamera.f().isEmpty()) {
                    lifecycleCamera.m();
                }
            }
        }
    }
}
