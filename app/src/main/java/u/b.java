package u;

import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final a f28423a;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j10);

        void b(Surface surface);

        String c();

        void d();

        void e(String str);

        Object f();

        Surface getSurface();
    }

    public b(int i10, Surface surface) {
        a cVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            cVar = new g(i10, surface);
        } else if (i11 >= 28) {
            cVar = new f(i10, surface);
        } else if (i11 >= 26) {
            cVar = new d(i10, surface);
        } else if (i11 < 24) {
            this.f28423a = new h(surface);
            return;
        } else {
            cVar = new c(i10, surface);
        }
        this.f28423a = cVar;
    }

    public b(c cVar) {
        this.f28423a = cVar;
    }

    public final void a(String str) {
        this.f28423a.e(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f28423a.equals(((b) obj).f28423a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28423a.hashCode();
    }
}
