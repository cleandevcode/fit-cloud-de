package u;

import android.os.Build;
import android.util.Size;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import u.b;
import y.u0;

/* loaded from: classes.dex */
public class h implements b.a {

    /* renamed from: a */
    public final Object f28429a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final List<Surface> f28430a;

        /* renamed from: b */
        public final Size f28431b;

        /* renamed from: c */
        public final int f28432c;

        /* renamed from: d */
        public final int f28433d;

        /* renamed from: e */
        public String f28434e;

        /* renamed from: f */
        public boolean f28435f = false;

        public a(Surface surface) {
            Size size;
            int i10;
            int i11;
            this.f28430a = Collections.singletonList(surface);
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
                declaredMethod.setAccessible(true);
                size = (Size) declaredMethod.invoke(null, surface);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                u0.c("OutputConfigCompat", "Unable to retrieve surface size.", e10);
                size = null;
            }
            this.f28431b = size;
            try {
                Method declaredMethod2 = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class);
                if (Build.VERSION.SDK_INT < 22) {
                    declaredMethod2.setAccessible(true);
                }
                i10 = ((Integer) declaredMethod2.invoke(null, surface)).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                u0.c("OutputConfigCompat", "Unable to retrieve surface format.", e11);
                i10 = 0;
            }
            this.f28432c = i10;
            try {
                i11 = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e12) {
                u0.c("OutputConfigCompat", "Unable to retrieve surface generation id.", e12);
                i11 = -1;
            }
            this.f28433d = i11;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f28431b.equals(aVar.f28431b) && this.f28432c == aVar.f28432c && this.f28433d == aVar.f28433d && this.f28435f == aVar.f28435f && Objects.equals(this.f28434e, aVar.f28434e)) {
                    int min = Math.min(this.f28430a.size(), aVar.f28430a.size());
                    for (int i10 = 0; i10 < min; i10++) {
                        if (this.f28430a.get(i10) != aVar.f28430a.get(i10)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f28430a.hashCode() ^ 31;
            int i10 = this.f28433d ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f28431b.hashCode() ^ ((i10 << 5) - i10);
            int i11 = this.f28432c ^ ((hashCode2 << 5) - hashCode2);
            int i12 = (this.f28435f ? 1 : 0) ^ ((i11 << 5) - i11);
            int i13 = (i12 << 5) - i12;
            String str = this.f28434e;
            return (str == null ? 0 : str.hashCode()) ^ i13;
        }
    }

    public h(Surface surface) {
        this.f28429a = new a(surface);
    }

    public h(Object obj) {
        this.f28429a = obj;
    }

    @Override // u.b.a
    public void a(long j10) {
    }

    @Override // u.b.a
    public void b(Surface surface) {
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!g()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // u.b.a
    public String c() {
        return ((a) this.f28429a).f28434e;
    }

    @Override // u.b.a
    public void d() {
        ((a) this.f28429a).f28435f = true;
    }

    @Override // u.b.a
    public void e(String str) {
        ((a) this.f28429a).f28434e = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return Objects.equals(this.f28429a, ((h) obj).f28429a);
        }
        return false;
    }

    @Override // u.b.a
    public Object f() {
        return null;
    }

    public boolean g() {
        return ((a) this.f28429a).f28435f;
    }

    @Override // u.b.a
    public Surface getSurface() {
        List<Surface> list = ((a) this.f28429a).f28430a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public final int hashCode() {
        return this.f28429a.hashCode();
    }
}
