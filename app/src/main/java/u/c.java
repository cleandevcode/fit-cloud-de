package u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import s.h1;

/* loaded from: classes.dex */
public class c extends h {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final OutputConfiguration f28424a;

        /* renamed from: b */
        public String f28425b;

        /* renamed from: c */
        public boolean f28426c;

        public a(OutputConfiguration outputConfiguration) {
            this.f28424a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return Objects.equals(this.f28424a, aVar.f28424a) && this.f28426c == aVar.f28426c && Objects.equals(this.f28425b, aVar.f28425b);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f28424a.hashCode() ^ 31;
            int i10 = (this.f28426c ? 1 : 0) ^ ((hashCode << 5) - hashCode);
            int i11 = (i10 << 5) - i10;
            String str = this.f28425b;
            return (str == null ? 0 : str.hashCode()) ^ i11;
        }
    }

    public c(int i10, Surface surface) {
        super(new a(new OutputConfiguration(i10, surface)));
    }

    public c(Object obj) {
        super(obj);
    }

    @Override // u.h, u.b.a
    public String c() {
        return ((a) this.f28429a).f28425b;
    }

    @Override // u.h, u.b.a
    public void d() {
        ((a) this.f28429a).f28426c = true;
    }

    @Override // u.h, u.b.a
    public void e(String str) {
        ((a) this.f28429a).f28425b = str;
    }

    @Override // u.h, u.b.a
    public Object f() {
        h1.f(this.f28429a instanceof a);
        return ((a) this.f28429a).f28424a;
    }

    @Override // u.h
    public boolean g() {
        return ((a) this.f28429a).f28426c;
    }

    @Override // u.h, u.b.a
    public final Surface getSurface() {
        return ((OutputConfiguration) f()).getSurface();
    }
}
