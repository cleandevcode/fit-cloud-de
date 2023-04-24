package u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import s.h1;

/* loaded from: classes.dex */
public class d extends c {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final OutputConfiguration f28427a;

        /* renamed from: b */
        public String f28428b;

        public a(OutputConfiguration outputConfiguration) {
            this.f28427a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return Objects.equals(this.f28427a, aVar.f28427a) && Objects.equals(this.f28428b, aVar.f28428b);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f28427a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            String str = this.f28428b;
            return (str == null ? 0 : str.hashCode()) ^ i10;
        }
    }

    public d(int i10, Surface surface) {
        super(new a(new OutputConfiguration(i10, surface)));
    }

    public d(Object obj) {
        super(obj);
    }

    @Override // u.h, u.b.a
    public final void b(Surface surface) {
        ((OutputConfiguration) f()).addSurface(surface);
    }

    @Override // u.c, u.h, u.b.a
    public String c() {
        return ((a) this.f28429a).f28428b;
    }

    @Override // u.c, u.h, u.b.a
    public final void d() {
        ((OutputConfiguration) f()).enableSurfaceSharing();
    }

    @Override // u.c, u.h, u.b.a
    public void e(String str) {
        ((a) this.f28429a).f28428b = str;
    }

    @Override // u.c, u.h, u.b.a
    public Object f() {
        h1.f(this.f28429a instanceof a);
        return ((a) this.f28429a).f28427a;
    }

    @Override // u.c, u.h
    public final boolean g() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }
}
