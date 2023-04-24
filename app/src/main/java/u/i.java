package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import s.m2;
import u.c;
import u.d;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public final c f28436a;

    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a */
        public final SessionConfiguration f28437a;

        /* renamed from: b */
        public final List<u.b> f28438b;

        public a(ArrayList arrayList, Executor executor, m2 m2Var) {
            u.c cVar;
            SessionConfiguration sessionConfiguration = new SessionConfiguration(0, i.a(arrayList), executor, m2Var);
            this.f28437a = sessionConfiguration;
            List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
            ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
            for (OutputConfiguration outputConfiguration : outputConfigurations) {
                u.b bVar = null;
                if (outputConfiguration != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 33) {
                        cVar = new g(outputConfiguration);
                    } else if (i10 >= 28) {
                        cVar = new f(outputConfiguration);
                    } else if (i10 >= 26) {
                        cVar = new d(new d.a(outputConfiguration));
                    } else if (i10 >= 24) {
                        cVar = new u.c(new c.a(outputConfiguration));
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        bVar = new u.b(cVar);
                    }
                }
                arrayList2.add(bVar);
            }
            this.f28438b = Collections.unmodifiableList(arrayList2);
        }

        @Override // u.i.c
        public final u.a a() {
            return u.a.a(this.f28437a.getInputConfiguration());
        }

        @Override // u.i.c
        public final CameraCaptureSession.StateCallback b() {
            return this.f28437a.getStateCallback();
        }

        @Override // u.i.c
        public final Object c() {
            return this.f28437a;
        }

        @Override // u.i.c
        public final Executor d() {
            return this.f28437a.getExecutor();
        }

        @Override // u.i.c
        public final void e(u.a aVar) {
            this.f28437a.setInputConfiguration((InputConfiguration) aVar.f28421a.a());
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f28437a, ((a) obj).f28437a);
            }
            return false;
        }

        @Override // u.i.c
        public final int f() {
            return this.f28437a.getSessionType();
        }

        @Override // u.i.c
        public final List<u.b> g() {
            return this.f28438b;
        }

        @Override // u.i.c
        public final void h(CaptureRequest captureRequest) {
            this.f28437a.setSessionParameters(captureRequest);
        }

        public final int hashCode() {
            return this.f28437a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a */
        public final List<u.b> f28439a;

        /* renamed from: b */
        public final CameraCaptureSession.StateCallback f28440b;

        /* renamed from: c */
        public final Executor f28441c;

        /* renamed from: e */
        public u.a f28443e = null;

        /* renamed from: d */
        public final int f28442d = 0;

        public b(ArrayList arrayList, Executor executor, m2 m2Var) {
            this.f28439a = Collections.unmodifiableList(new ArrayList(arrayList));
            this.f28440b = m2Var;
            this.f28441c = executor;
        }

        @Override // u.i.c
        public final u.a a() {
            return this.f28443e;
        }

        @Override // u.i.c
        public final CameraCaptureSession.StateCallback b() {
            return this.f28440b;
        }

        @Override // u.i.c
        public final Object c() {
            return null;
        }

        @Override // u.i.c
        public final Executor d() {
            return this.f28441c;
        }

        @Override // u.i.c
        public final void e(u.a aVar) {
            if (this.f28442d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f28443e = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f28443e, bVar.f28443e) && this.f28442d == bVar.f28442d && this.f28439a.size() == bVar.f28439a.size()) {
                    for (int i10 = 0; i10 < this.f28439a.size(); i10++) {
                        if (!this.f28439a.get(i10).equals(bVar.f28439a.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // u.i.c
        public final int f() {
            return this.f28442d;
        }

        @Override // u.i.c
        public final List<u.b> g() {
            return this.f28439a;
        }

        @Override // u.i.c
        public final void h(CaptureRequest captureRequest) {
        }

        public final int hashCode() {
            int hashCode = this.f28439a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            u.a aVar = this.f28443e;
            int hashCode2 = (aVar == null ? 0 : aVar.hashCode()) ^ i10;
            return this.f28442d ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        u.a a();

        CameraCaptureSession.StateCallback b();

        Object c();

        Executor d();

        void e(u.a aVar);

        int f();

        List<u.b> g();

        void h(CaptureRequest captureRequest);
    }

    public i(ArrayList arrayList, Executor executor, m2 m2Var) {
        this.f28436a = Build.VERSION.SDK_INT < 28 ? new b(arrayList, executor, m2Var) : new a(arrayList, executor, m2Var);
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((u.b) it.next()).f28423a.f());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f28436a.equals(((i) obj).f28436a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28436a.hashCode();
    }
}
