package s;

import a0.h0;
import a0.l0;
import a0.u1;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import android.view.Surface;
import d0.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p0.c;
import s.i2;
import s.q2;

/* loaded from: classes.dex */
public final class n1 implements q1 {

    /* renamed from: e */
    public p2 f26089e;

    /* renamed from: f */
    public i2 f26090f;

    /* renamed from: g */
    public a0.u1 f26091g;

    /* renamed from: l */
    public int f26096l;

    /* renamed from: m */
    public c.d f26097m;

    /* renamed from: n */
    public c.a<Void> f26098n;

    /* renamed from: a */
    public final Object f26085a = new Object();

    /* renamed from: b */
    public final ArrayList f26086b = new ArrayList();

    /* renamed from: c */
    public final a f26087c = new a();

    /* renamed from: h */
    public a0.n1 f26092h = a0.n1.A;

    /* renamed from: i */
    public r.c f26093i = new r.c(new r.b[0]);

    /* renamed from: j */
    public final HashMap f26094j = new HashMap();

    /* renamed from: k */
    public List<a0.m0> f26095k = Collections.emptyList();

    /* renamed from: o */
    public final w.m f26099o = new w.m();

    /* renamed from: p */
    public final w.p f26100p = new w.p();

    /* renamed from: d */
    public final c f26088d = new c();

    /* loaded from: classes.dex */
    public class a extends CameraCaptureSession.CaptureCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements d0.c<Void> {
        public b() {
            n1.this = r1;
        }

        @Override // d0.c
        public final void onFailure(Throwable th2) {
            synchronized (n1.this.f26085a) {
                try {
                    n1.this.f26089e.f26122a.stop();
                    int b10 = c0.b(n1.this.f26096l);
                    if ((b10 == 3 || b10 == 5 || b10 == 6) && !(th2 instanceof CancellationException)) {
                        y.u0.i("CaptureSession", "Opening session with fail " + p1.b(n1.this.f26096l), th2);
                        n1.this.h();
                    }
                } finally {
                }
            }
        }

        @Override // d0.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    /* loaded from: classes.dex */
    public final class c extends i2.a {
        public c() {
            n1.this = r1;
        }

        @Override // s.i2.a
        public final void n(i2 i2Var) {
            synchronized (n1.this.f26085a) {
                try {
                    switch (c0.b(n1.this.f26096l)) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + p1.b(n1.this.f26096l));
                        case 3:
                        case 5:
                        case 6:
                            n1.this.h();
                            break;
                        case 7:
                            y.u0.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    y.u0.b("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + p1.b(n1.this.f26096l));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // s.i2.a
        public final void o(l2 l2Var) {
            synchronized (n1.this.f26085a) {
                try {
                    switch (c0.b(n1.this.f26096l)) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + p1.b(n1.this.f26096l));
                        case 3:
                            n1 n1Var = n1.this;
                            n1Var.f26096l = 5;
                            n1Var.f26090f = l2Var;
                            if (n1Var.f26091g != null) {
                                r.c cVar = n1Var.f26093i;
                                cVar.getClass();
                                List<r.b> unmodifiableList = Collections.unmodifiableList(new ArrayList(cVar.f96a));
                                ArrayList arrayList = new ArrayList();
                                for (r.b bVar : unmodifiableList) {
                                    arrayList.add(bVar);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((r.b) it.next()).getClass();
                                }
                                if (!arrayList2.isEmpty()) {
                                    n1 n1Var2 = n1.this;
                                    n1Var2.j(n1Var2.n(arrayList2));
                                }
                            }
                            y.u0.a("CaptureSession", "Attempting to send capture request onConfigured");
                            n1 n1Var3 = n1.this;
                            n1Var3.l(n1Var3.f26091g);
                            n1.this.k();
                            break;
                        case 5:
                            n1.this.f26090f = l2Var;
                            break;
                        case 6:
                            l2Var.close();
                            break;
                    }
                    y.u0.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + p1.b(n1.this.f26096l));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // s.i2.a
        public final void p(l2 l2Var) {
            synchronized (n1.this.f26085a) {
                try {
                    if (c0.b(n1.this.f26096l) == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + p1.b(n1.this.f26096l));
                    }
                    y.u0.a("CaptureSession", "CameraCaptureSession.onReady() " + p1.b(n1.this.f26096l));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // s.i2.a
        public final void q(i2 i2Var) {
            synchronized (n1.this.f26085a) {
                try {
                    if (n1.this.f26096l == 1) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + p1.b(n1.this.f26096l));
                    }
                    y.u0.a("CaptureSession", "onSessionFinished()");
                    n1.this.h();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public n1() {
        this.f26096l = 1;
        this.f26096l = 2;
    }

    public static f0 g(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback f0Var;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0.j jVar = (a0.j) it.next();
            if (jVar == null) {
                f0Var = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                k1.a(jVar, arrayList2);
                if (arrayList2.size() == 1) {
                    f0Var = (CameraCaptureSession.CaptureCallback) arrayList2.get(0);
                } else {
                    f0Var = new f0(arrayList2);
                }
            }
            arrayList.add(f0Var);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new f0(arrayList);
    }

    public static u.b i(u1.e eVar, HashMap hashMap, String str) {
        Surface surface = (Surface) hashMap.get(eVar.d());
        h1.i(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        u.b bVar = new u.b(eVar.e(), surface);
        if (str == null) {
            str = eVar.b();
        }
        bVar.a(str);
        if (!eVar.c().isEmpty()) {
            bVar.f28423a.d();
            for (a0.m0 m0Var : eVar.c()) {
                Surface surface2 = (Surface) hashMap.get(m0Var);
                h1.i(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                bVar.f28423a.b(surface2);
            }
        }
        return bVar;
    }

    public static a0.j1 m(ArrayList arrayList) {
        a0.j1 B = a0.j1.B();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a0.l0 l0Var = ((a0.h0) it.next()).f83b;
            for (l0.a<?> aVar : l0Var.d()) {
                Object obj = null;
                Object e10 = l0Var.e(aVar, null);
                if (B.z(aVar)) {
                    try {
                        obj = B.c(aVar);
                    } catch (IllegalArgumentException unused) {
                    }
                    if (!Objects.equals(obj, e10)) {
                        StringBuilder a10 = android.support.v4.media.d.a("Detect conflicting option ");
                        a10.append(aVar.b());
                        a10.append(" : ");
                        a10.append(e10);
                        a10.append(" != ");
                        a10.append(obj);
                        y.u0.a("CaptureSession", a10.toString());
                    }
                } else {
                    B.E(aVar, e10);
                }
            }
        }
        return B;
    }

    @Override // s.q1
    public final void a() {
        ArrayList<a0.h0> arrayList;
        synchronized (this.f26085a) {
            if (!this.f26086b.isEmpty()) {
                arrayList = new ArrayList(this.f26086b);
                this.f26086b.clear();
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (a0.h0 h0Var : arrayList) {
                for (a0.j jVar : h0Var.f85d) {
                    jVar.a();
                }
            }
        }
    }

    @Override // s.q1
    public final void b(a0.u1 u1Var) {
        synchronized (this.f26085a) {
            try {
                switch (c0.b(this.f26096l)) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + p1.b(this.f26096l));
                    case 1:
                    case 2:
                    case 3:
                        this.f26091g = u1Var;
                        break;
                    case 4:
                        this.f26091g = u1Var;
                        if (u1Var != null) {
                            if (!this.f26094j.keySet().containsAll(u1Var.b())) {
                                y.u0.b("CaptureSession", "Does not have the proper configured lists");
                                return;
                            }
                            y.u0.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            l(this.f26091g);
                            break;
                        } else {
                            return;
                        }
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // s.q1
    public final na.a<Void> c(final a0.u1 u1Var, final CameraDevice cameraDevice, p2 p2Var) {
        synchronized (this.f26085a) {
            try {
                if (c0.b(this.f26096l) != 1) {
                    y.u0.b("CaptureSession", "Open not allowed in state: " + p1.b(this.f26096l));
                    return new i.a(new IllegalStateException("open() should not allow the state: " + p1.b(this.f26096l)));
                }
                this.f26096l = 3;
                ArrayList arrayList = new ArrayList(u1Var.b());
                this.f26095k = arrayList;
                this.f26089e = p2Var;
                d0.d d10 = d0.d.b(p2Var.f26122a.a(arrayList)).d(new d0.a() { // from class: s.l1
                    @Override // d0.a
                    public final na.a apply(Object obj) {
                        int b10;
                        na.a<Void> aVar;
                        InputConfiguration inputConfiguration;
                        n1 n1Var = n1.this;
                        a0.u1 u1Var2 = u1Var;
                        CameraDevice cameraDevice2 = cameraDevice;
                        List list = (List) obj;
                        synchronized (n1Var.f26085a) {
                            try {
                                b10 = c0.b(n1Var.f26096l);
                            } catch (CameraAccessException e10) {
                                aVar = new i.a<>(e10);
                            } finally {
                            }
                            if (b10 != 0 && b10 != 1) {
                                if (b10 != 2) {
                                    if (b10 != 4) {
                                        aVar = new i.a<>(new CancellationException("openCaptureSession() not execute in state: " + p1.b(n1Var.f26096l)));
                                    }
                                } else {
                                    n1Var.f26094j.clear();
                                    for (int i10 = 0; i10 < list.size(); i10++) {
                                        n1Var.f26094j.put(n1Var.f26095k.get(i10), (Surface) list.get(i10));
                                    }
                                    n1Var.f26096l = 4;
                                    y.u0.a("CaptureSession", "Opening capture session.");
                                    q2 q2Var = new q2(Arrays.asList(n1Var.f26088d, new q2.a(u1Var2.f184c)));
                                    a0.l0 l0Var = u1Var2.f187f.f83b;
                                    r.a aVar2 = new r.a(l0Var);
                                    r.c cVar = (r.c) l0Var.e(r.a.E, new r.c(new r.b[0]));
                                    n1Var.f26093i = cVar;
                                    cVar.getClass();
                                    List<r.b> unmodifiableList = Collections.unmodifiableList(new ArrayList(cVar.f96a));
                                    ArrayList arrayList2 = new ArrayList();
                                    for (r.b bVar : unmodifiableList) {
                                        arrayList2.add(bVar);
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        ((r.b) it.next()).getClass();
                                    }
                                    h0.a aVar3 = new h0.a(u1Var2.f187f);
                                    Iterator it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        aVar3.c(((a0.h0) it2.next()).f83b);
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    CaptureRequest captureRequest = null;
                                    String str = (String) aVar2.f30082y.e(r.a.G, null);
                                    for (u1.e eVar : u1Var2.f182a) {
                                        u.b i11 = n1.i(eVar, n1Var.f26094j, str);
                                        a0.l0 l0Var2 = u1Var2.f187f.f83b;
                                        a0.d dVar = r.a.A;
                                        if (l0Var2.z(dVar)) {
                                            i11.f28423a.a(((Long) u1Var2.f187f.f83b.c(dVar)).longValue());
                                        }
                                        arrayList4.add(i11);
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it3 = arrayList4.iterator();
                                    while (it3.hasNext()) {
                                        u.b bVar2 = (u.b) it3.next();
                                        if (!arrayList5.contains(bVar2.f28423a.getSurface())) {
                                            arrayList5.add(bVar2.f28423a.getSurface());
                                            arrayList6.add(bVar2);
                                        }
                                    }
                                    l2 l2Var = (l2) n1Var.f26089e.f26122a;
                                    l2Var.f26066f = q2Var;
                                    u.i iVar = new u.i(arrayList6, l2Var.f26064d, new m2(l2Var));
                                    if (u1Var2.f187f.f84c == 5 && (inputConfiguration = u1Var2.f188g) != null) {
                                        iVar.f28436a.e(u.a.a(inputConfiguration));
                                    }
                                    a0.h0 d11 = aVar3.d();
                                    if (cameraDevice2 != null) {
                                        CaptureRequest.Builder createCaptureRequest = cameraDevice2.createCaptureRequest(d11.f84c);
                                        v0.a(createCaptureRequest, d11.f83b);
                                        captureRequest = createCaptureRequest.build();
                                    }
                                    if (captureRequest != null) {
                                        iVar.f28436a.h(captureRequest);
                                    }
                                    aVar = n1Var.f26089e.f26122a.e(cameraDevice2, iVar, n1Var.f26095k);
                                }
                            }
                            aVar = new i.a<>(new IllegalStateException("openCaptureSession() should not be possible in state: " + p1.b(n1Var.f26096l)));
                        }
                        return aVar;
                    }
                }, ((l2) this.f26089e.f26122a).f26064d);
                d0.f.a(d10, new b(), ((l2) this.f26089e.f26122a).f26064d);
                return d0.f.f(d10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s.q1
    public final void close() {
        synchronized (this.f26085a) {
            try {
                int b10 = c0.b(this.f26096l);
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 == 4) {
                                    if (this.f26091g != null) {
                                        r.c cVar = this.f26093i;
                                        cVar.getClass();
                                        List<r.b> unmodifiableList = Collections.unmodifiableList(new ArrayList(cVar.f96a));
                                        ArrayList arrayList = new ArrayList();
                                        for (r.b bVar : unmodifiableList) {
                                            arrayList.add(bVar);
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            ((r.b) it.next()).getClass();
                                        }
                                        if (!arrayList2.isEmpty()) {
                                            try {
                                                e(n(arrayList2));
                                            } catch (IllegalStateException e10) {
                                                y.u0.c("CaptureSession", "Unable to issue the request before close the capture session", e10);
                                            }
                                        }
                                    }
                                }
                            }
                            p2 p2Var = this.f26089e;
                            h1.i(p2Var, "The Opener shouldn't null in state:" + p1.b(this.f26096l));
                            this.f26089e.f26122a.stop();
                            this.f26096l = 6;
                            this.f26091g = null;
                        } else {
                            p2 p2Var2 = this.f26089e;
                            h1.i(p2Var2, "The Opener shouldn't null in state:" + p1.b(this.f26096l));
                            this.f26089e.f26122a.stop();
                        }
                    }
                    this.f26096l = 8;
                } else {
                    throw new IllegalStateException("close() should not be possible in state: " + p1.b(this.f26096l));
                }
            } finally {
            }
        }
    }

    @Override // s.q1
    public final List<a0.h0> d() {
        List<a0.h0> unmodifiableList;
        synchronized (this.f26085a) {
            unmodifiableList = Collections.unmodifiableList(this.f26086b);
        }
        return unmodifiableList;
    }

    @Override // s.q1
    public final void e(List<a0.h0> list) {
        synchronized (this.f26085a) {
            try {
                switch (c0.b(this.f26096l)) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + p1.b(this.f26096l));
                    case 1:
                    case 2:
                    case 3:
                        this.f26086b.addAll(list);
                        break;
                    case 4:
                        this.f26086b.addAll(list);
                        k();
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // s.q1
    public final a0.u1 f() {
        a0.u1 u1Var;
        synchronized (this.f26085a) {
            u1Var = this.f26091g;
        }
        return u1Var;
    }

    public final void h() {
        if (this.f26096l == 8) {
            y.u0.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f26096l = 8;
        this.f26090f = null;
        c.a<Void> aVar = this.f26098n;
        if (aVar != null) {
            aVar.a(null);
            this.f26098n = null;
        }
    }

    public final void j(ArrayList arrayList) {
        a1 a1Var;
        ArrayList arrayList2;
        boolean z10;
        boolean z11;
        a0.s sVar;
        synchronized (this.f26085a) {
            if (arrayList.isEmpty()) {
                return;
            }
            try {
                a1Var = new a1();
                arrayList2 = new ArrayList();
                y.u0.a("CaptureSession", "Issuing capture request.");
                Iterator it = arrayList.iterator();
                z10 = false;
                while (it.hasNext()) {
                    a0.h0 h0Var = (a0.h0) it.next();
                    if (h0Var.a().isEmpty()) {
                        y.u0.a("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator<a0.m0> it2 = h0Var.a().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                a0.m0 next = it2.next();
                                if (!this.f26094j.containsKey(next)) {
                                    y.u0.a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                    z11 = false;
                                    break;
                                }
                            } else {
                                z11 = true;
                                break;
                            }
                        }
                        if (z11) {
                            if (h0Var.f84c == 2) {
                                z10 = true;
                            }
                            h0.a aVar = new h0.a(h0Var);
                            if (h0Var.f84c == 5 && (sVar = h0Var.f88g) != null) {
                                aVar.f95g = sVar;
                            }
                            a0.u1 u1Var = this.f26091g;
                            if (u1Var != null) {
                                aVar.c(u1Var.f187f.f83b);
                            }
                            aVar.c(this.f26092h);
                            aVar.c(h0Var.f83b);
                            CaptureRequest b10 = v0.b(aVar.d(), this.f26090f.d(), this.f26094j);
                            if (b10 == null) {
                                y.u0.a("CaptureSession", "Skipping issuing request without surface.");
                                return;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (a0.j jVar : h0Var.f85d) {
                                k1.a(jVar, arrayList3);
                            }
                            a1Var.a(b10, arrayList3);
                            arrayList2.add(b10);
                        }
                    }
                }
            } catch (CameraAccessException e10) {
                y.u0.b("CaptureSession", "Unable to access camera: " + e10.getMessage());
                Thread.dumpStack();
            }
            if (!arrayList2.isEmpty()) {
                if (this.f26099o.a(arrayList2, z10)) {
                    this.f26090f.h();
                    a1Var.f25912b = new q0(1, this);
                }
                if (this.f26100p.b(arrayList2, z10)) {
                    a1Var.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new o1(this)));
                }
                this.f26090f.j(arrayList2, a1Var);
                return;
            }
            y.u0.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
        }
    }

    public final void k() {
        if (this.f26086b.isEmpty()) {
            return;
        }
        try {
            j(this.f26086b);
        } finally {
            this.f26086b.clear();
        }
    }

    public final void l(a0.u1 u1Var) {
        synchronized (this.f26085a) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            if (u1Var == null) {
                y.u0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return;
            }
            a0.h0 h0Var = u1Var.f187f;
            if (h0Var.a().isEmpty()) {
                y.u0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f26090f.h();
                } catch (CameraAccessException e10) {
                    y.u0.b("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                return;
            }
            try {
                y.u0.a("CaptureSession", "Issuing request for session.");
                h0.a aVar = new h0.a(h0Var);
                r.c cVar = this.f26093i;
                cVar.getClass();
                List<r.b> unmodifiableList = Collections.unmodifiableList(new ArrayList(cVar.f96a));
                ArrayList arrayList = new ArrayList();
                for (r.b bVar : unmodifiableList) {
                    arrayList.add(bVar);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((r.b) it.next()).getClass();
                }
                a0.j1 m10 = m(arrayList2);
                this.f26092h = m10;
                aVar.c(m10);
                CaptureRequest b10 = v0.b(aVar.d(), this.f26090f.d(), this.f26094j);
                if (b10 == null) {
                    y.u0.a("CaptureSession", "Skipping issuing empty request for session.");
                    return;
                } else {
                    this.f26090f.g(b10, g(h0Var.f85d, this.f26087c));
                    return;
                }
            } catch (CameraAccessException e11) {
                y.u0.b("CaptureSession", "Unable to access camera: " + e11.getMessage());
                Thread.dumpStack();
                return;
            }
            throw th2;
        }
    }

    public final ArrayList n(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a0.h0 h0Var = (a0.h0) it.next();
            HashSet hashSet = new HashSet();
            a0.j1.B();
            ArrayList arrayList3 = new ArrayList();
            a0.k1.c();
            hashSet.addAll(h0Var.f82a);
            a0.j1 C = a0.j1.C(h0Var.f83b);
            arrayList3.addAll(h0Var.f85d);
            boolean z10 = h0Var.f86e;
            a0.d2 d2Var = h0Var.f87f;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : d2Var.b()) {
                arrayMap.put(str, d2Var.a(str));
            }
            a0.k1 k1Var = new a0.k1(arrayMap);
            for (a0.m0 m0Var : this.f26091g.f187f.a()) {
                hashSet.add(m0Var);
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            a0.n1 A = a0.n1.A(C);
            a0.d2 d2Var2 = a0.d2.f45b;
            ArrayMap arrayMap2 = new ArrayMap();
            for (String str2 : k1Var.b()) {
                arrayMap2.put(str2, k1Var.a(str2));
            }
            arrayList2.add(new a0.h0(arrayList4, A, 1, arrayList3, z10, new a0.d2(arrayMap2), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0038 A[Catch: all -> 0x0016, LOOP:0: B:54:0x0032->B:56:0x0038, LOOP_END, TryCatch #0 {all -> 0x0016, blocks: (B:45:0x0003, B:46:0x0009, B:74:0x00dc, B:48:0x000e, B:50:0x0012, B:53:0x0019, B:54:0x0032, B:56:0x0038, B:57:0x0042, B:58:0x0046, B:60:0x004c, B:61:0x0056, B:63:0x007f, B:64:0x0083, B:66:0x0087, B:67:0x0093, B:68:0x0095, B:70:0x0097, B:71:0x00ba, B:72:0x00bf, B:73:0x00db), top: B:79:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004c A[Catch: all -> 0x0016, LOOP:1: B:58:0x0046->B:60:0x004c, LOOP_END, TryCatch #0 {all -> 0x0016, blocks: (B:45:0x0003, B:46:0x0009, B:74:0x00dc, B:48:0x000e, B:50:0x0012, B:53:0x0019, B:54:0x0032, B:56:0x0038, B:57:0x0042, B:58:0x0046, B:60:0x004c, B:61:0x0056, B:63:0x007f, B:64:0x0083, B:66:0x0087, B:67:0x0093, B:68:0x0095, B:70:0x0097, B:71:0x00ba, B:72:0x00bf, B:73:0x00db), top: B:79:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007f A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:45:0x0003, B:46:0x0009, B:74:0x00dc, B:48:0x000e, B:50:0x0012, B:53:0x0019, B:54:0x0032, B:56:0x0038, B:57:0x0042, B:58:0x0046, B:60:0x004c, B:61:0x0056, B:63:0x007f, B:64:0x0083, B:66:0x0087, B:67:0x0093, B:68:0x0095, B:70:0x0097, B:71:0x00ba, B:72:0x00bf, B:73:0x00db), top: B:79:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0087 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:45:0x0003, B:46:0x0009, B:74:0x00dc, B:48:0x000e, B:50:0x0012, B:53:0x0019, B:54:0x0032, B:56:0x0038, B:57:0x0042, B:58:0x0046, B:60:0x004c, B:61:0x0056, B:63:0x007f, B:64:0x0083, B:66:0x0087, B:67:0x0093, B:68:0x0095, B:70:0x0097, B:71:0x00ba, B:72:0x00bf, B:73:0x00db), top: B:79:0x0003 }] */
    @Override // s.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final na.a release() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f26085a
            monitor-enter(r0)
            int r1 = r4.f26096l     // Catch: java.lang.Throwable -> L16
            int r1 = s.c0.b(r1)     // Catch: java.lang.Throwable -> L16
            switch(r1) {
                case 0: goto Lbf;
                case 1: goto Lba;
                case 2: goto L97;
                case 3: goto L19;
                case 4: goto Le;
                case 5: goto Le;
                case 6: goto L83;
                default: goto Lc;
            }     // Catch: java.lang.Throwable -> L16
        Lc:
            goto Ldc
        Le:
            s.i2 r1 = r4.f26090f     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L19
            r1.close()     // Catch: java.lang.Throwable -> L16
            goto L19
        L16:
            r1 = move-exception
            goto Le3
        L19:
            r.c r1 = r4.f26093i     // Catch: java.lang.Throwable -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L16
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            java.util.HashSet r1 = r1.f96a     // Catch: java.lang.Throwable -> L16
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L16
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)     // Catch: java.lang.Throwable -> L16
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L16
        L32:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L42
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L16
            r.b r3 = (r.b) r3     // Catch: java.lang.Throwable -> L16
            r2.add(r3)     // Catch: java.lang.Throwable -> L16
            goto L32
        L42:
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L16
        L46:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L16
            r.b r2 = (r.b) r2     // Catch: java.lang.Throwable -> L16
            r2.getClass()     // Catch: java.lang.Throwable -> L16
            goto L46
        L56:
            r1 = 7
            r4.f26096l = r1     // Catch: java.lang.Throwable -> L16
            s.p2 r1 = r4.f26089e     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = "The Opener shouldn't null in state:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L16
            int r3 = r4.f26096l     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = s.p1.b(r3)     // Catch: java.lang.Throwable -> L16
            r2.append(r3)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L16
            s.h1.i(r1, r2)     // Catch: java.lang.Throwable -> L16
            s.p2 r1 = r4.f26089e     // Catch: java.lang.Throwable -> L16
            s.p2$b r1 = r1.f26122a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.stop()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L83
            r4.h()     // Catch: java.lang.Throwable -> L16
            goto Ldc
        L83:
            p0.c$d r1 = r4.f26097m     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L93
            s.m1 r1 = new s.m1     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L16
            p0.c$d r1 = p0.c.a(r1)     // Catch: java.lang.Throwable -> L16
            r4.f26097m = r1     // Catch: java.lang.Throwable -> L16
        L93:
            p0.c$d r1 = r4.f26097m     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r1
        L97:
            s.p2 r1 = r4.f26089e     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = "The Opener shouldn't null in state:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L16
            int r3 = r4.f26096l     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = s.p1.b(r3)     // Catch: java.lang.Throwable -> L16
            r2.append(r3)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L16
            s.h1.i(r1, r2)     // Catch: java.lang.Throwable -> L16
            s.p2 r1 = r4.f26089e     // Catch: java.lang.Throwable -> L16
            s.p2$b r1 = r1.f26122a     // Catch: java.lang.Throwable -> L16
            r1.stop()     // Catch: java.lang.Throwable -> L16
        Lba:
            r1 = 8
            r4.f26096l = r1     // Catch: java.lang.Throwable -> L16
            goto Ldc
        Lbf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = "release() should not be possible in state: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L16
            int r3 = r4.f26096l     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = s.p1.b(r3)     // Catch: java.lang.Throwable -> L16
            r2.append(r3)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        Ldc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            r0 = 0
            d0.i$c r0 = d0.f.e(r0)
            return r0
        Le3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s.n1.release():na.a");
    }
}
