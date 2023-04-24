package androidx.camera.lifecycle;

import a0.b0;
import a0.i2;
import a0.t0;
import a0.v;
import a0.y;
import androidx.camera.core.t;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.k;
import d0.f;
import d0.i;
import e0.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p0.c;
import s.h1;
import y.g;
import y.m;
import y.o;
import y.p;
import y.u;

/* loaded from: classes.dex */
public final class e implements o {

    /* renamed from: f */
    public static final e f1841f = new e();

    /* renamed from: b */
    public c.d f1843b;

    /* renamed from: e */
    public u f1846e;

    /* renamed from: a */
    public final Object f1842a = new Object();

    /* renamed from: c */
    public i.c f1844c = f.e(null);

    /* renamed from: d */
    public final LifecycleCameraRepository f1845d = new LifecycleCameraRepository();

    public final g a(androidx.lifecycle.u uVar, p pVar, t... tVarArr) {
        LifecycleCamera lifecycleCamera;
        Collection<LifecycleCamera> unmodifiableCollection;
        LifecycleCamera lifecycleCamera2;
        boolean contains;
        List emptyList = Collections.emptyList();
        p.b.f();
        LinkedHashSet linkedHashSet = new LinkedHashSet(pVar.f30749a);
        for (t tVar : tVarArr) {
            p r10 = tVar.f1805f.r();
            if (r10 != null) {
                Iterator<m> it = r10.f30749a.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(it.next());
                }
            }
        }
        LinkedHashSet<b0> a10 = new p(linkedHashSet).a(this.f1846e.f30771a.a());
        if (!a10.isEmpty()) {
            e.b bVar = new e.b(a10);
            LifecycleCameraRepository lifecycleCameraRepository = this.f1845d;
            synchronized (lifecycleCameraRepository.f1828a) {
                lifecycleCamera = (LifecycleCamera) lifecycleCameraRepository.f1829b.get(new a(uVar, bVar));
            }
            LifecycleCameraRepository lifecycleCameraRepository2 = this.f1845d;
            synchronized (lifecycleCameraRepository2.f1828a) {
                unmodifiableCollection = Collections.unmodifiableCollection(lifecycleCameraRepository2.f1829b.values());
            }
            for (t tVar2 : tVarArr) {
                for (LifecycleCamera lifecycleCamera3 : unmodifiableCollection) {
                    synchronized (lifecycleCamera3.f1824a) {
                        contains = ((ArrayList) lifecycleCamera3.f1826c.q()).contains(tVar2);
                    }
                    if (contains && lifecycleCamera3 != lifecycleCamera) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", tVar2));
                    }
                }
            }
            boolean z10 = false;
            if (lifecycleCamera == null) {
                LifecycleCameraRepository lifecycleCameraRepository3 = this.f1845d;
                u uVar2 = this.f1846e;
                y yVar = uVar2.f30777g;
                if (yVar != null) {
                    i2 i2Var = uVar2.f30778h;
                    if (i2Var != null) {
                        e0.e eVar = new e0.e(a10, yVar, i2Var);
                        synchronized (lifecycleCameraRepository3.f1828a) {
                            if (lifecycleCameraRepository3.f1829b.get(new a(uVar, eVar.f13293d)) == null) {
                                z10 = true;
                            }
                            h1.e("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", z10);
                            if (uVar.a0().f2790c != k.c.DESTROYED) {
                                lifecycleCamera2 = new LifecycleCamera(uVar, eVar);
                                if (((ArrayList) eVar.q()).isEmpty()) {
                                    synchronized (lifecycleCamera2.f1824a) {
                                        if (!lifecycleCamera2.f1827d) {
                                            lifecycleCamera2.onStop(uVar);
                                            lifecycleCamera2.f1827d = true;
                                        }
                                    }
                                }
                                lifecycleCameraRepository3.d(lifecycleCamera2);
                            } else {
                                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
                            }
                        }
                        lifecycleCamera = lifecycleCamera2;
                    } else {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            Iterator<m> it2 = pVar.f30749a.iterator();
            while (it2.hasNext()) {
                m next = it2.next();
                if (next.a() != m.f30737a) {
                    v a11 = t0.a(next.a());
                    lifecycleCamera.b();
                    a11.b();
                }
            }
            lifecycleCamera.e(null);
            if (tVarArr.length != 0) {
                this.f1845d.a(lifecycleCamera, emptyList, Arrays.asList(tVarArr));
            }
            return lifecycleCamera;
        }
        throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
    }

    public final void b() {
        androidx.lifecycle.u uVar;
        p.b.f();
        LifecycleCameraRepository lifecycleCameraRepository = this.f1845d;
        synchronized (lifecycleCameraRepository.f1828a) {
            for (LifecycleCameraRepository.a aVar : lifecycleCameraRepository.f1829b.keySet()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) lifecycleCameraRepository.f1829b.get(aVar);
                synchronized (lifecycleCamera.f1824a) {
                    e0.e eVar = lifecycleCamera.f1826c;
                    eVar.s((ArrayList) eVar.q());
                }
                synchronized (lifecycleCamera.f1824a) {
                    uVar = lifecycleCamera.f1825b;
                }
                lifecycleCameraRepository.f(uVar);
            }
        }
    }
}
