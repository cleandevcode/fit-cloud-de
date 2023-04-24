package s;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import y.q;

/* loaded from: classes.dex */
public final class e0 implements a0.a0 {

    /* renamed from: a */
    public final String f25939a;

    /* renamed from: b */
    public final t.t f25940b;

    /* renamed from: d */
    public r f25942d;

    /* renamed from: e */
    public final a<y.q> f25943e;

    /* renamed from: g */
    public final a0.r1 f25945g;

    /* renamed from: c */
    public final Object f25941c = new Object();

    /* renamed from: f */
    public ArrayList f25944f = null;

    /* loaded from: classes.dex */
    public static class a<T> extends androidx.lifecycle.z<T> {

        /* renamed from: m */
        public LiveData<T> f25946m;

        /* renamed from: n */
        public final T f25947n;

        /* JADX WARN: Multi-variable type inference failed */
        public a(y.d dVar) {
            this.f25947n = dVar;
        }

        @Override // androidx.lifecycle.LiveData
        public final T d() {
            LiveData<T> liveData = this.f25946m;
            return liveData == null ? this.f25947n : liveData.d();
        }
    }

    public e0(String str, t.d0 d0Var) {
        str.getClass();
        this.f25939a = str;
        t.t b10 = d0Var.b(str);
        this.f25940b = b10;
        this.f25945g = rm.l.f(b10);
        new d(str, b10);
        this.f25943e = new a<>(new y.d(q.b.CLOSED, null));
    }

    @Override // y.n
    public final a a() {
        return this.f25943e;
    }

    @Override // a0.a0
    public final String b() {
        return this.f25939a;
    }

    @Override // a0.a0
    public final Integer c() {
        Integer num = (Integer) this.f25940b.a(CameraCharacteristics.LENS_FACING);
        num.getClass();
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                return null;
            }
            return 1;
        }
        return 0;
    }

    @Override // a0.a0
    public final void d(c0.a aVar, k0.e eVar) {
        synchronized (this.f25941c) {
            r rVar = this.f25942d;
            if (rVar == null) {
                if (this.f25944f == null) {
                    this.f25944f = new ArrayList();
                }
                this.f25944f.add(new Pair(eVar, aVar));
                return;
            }
            rVar.f26138c.execute(new k(rVar, aVar, eVar, 0));
        }
    }

    @Override // y.n
    public final int e(int i10) {
        Integer num = (Integer) this.f25940b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        int intValue = num.intValue();
        int u10 = b0.c.u(i10);
        Integer c10 = c();
        boolean z10 = true;
        return b0.c.n(u10, intValue, (c10 == null || 1 != c10.intValue()) ? false : false);
    }

    @Override // a0.a0
    public final void f(a0.j jVar) {
        synchronized (this.f25941c) {
            r rVar = this.f25942d;
            if (rVar == null) {
                ArrayList arrayList = this.f25944f;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == jVar) {
                        it.remove();
                    }
                }
                return;
            }
            rVar.f26138c.execute(new g(rVar, jVar, 0));
        }
    }

    @Override // a0.a0
    public final a0.r1 g() {
        return this.f25945g;
    }

    public final String h() {
        return i() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    public final int i() {
        Integer num = (Integer) this.f25940b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue();
    }

    public final void j(r rVar) {
        String str;
        synchronized (this.f25941c) {
            this.f25942d = rVar;
            ArrayList arrayList = this.f25944f;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    r rVar2 = this.f25942d;
                    rVar2.f26138c.execute(new k(rVar2, (Executor) pair.second, (a0.j) pair.first, 0));
                }
                this.f25944f = null;
            }
        }
        int i10 = i();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            str = androidx.appcompat.widget.u0.a("Unknown value: ", i10);
                        } else {
                            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
                        }
                    } else {
                        str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
                    }
                } else {
                    str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
                }
            } else {
                str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
            }
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        }
        y.u0.d("Camera2CameraInfo", "Device Level: " + str);
    }
}
