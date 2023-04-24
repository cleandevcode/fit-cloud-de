package u;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final c f28421a;

    /* renamed from: u.a$a */
    /* loaded from: classes.dex */
    public static class C0509a implements c {

        /* renamed from: a */
        public final InputConfiguration f28422a;

        public C0509a(Object obj) {
            this.f28422a = (InputConfiguration) obj;
        }

        @Override // u.a.c
        public final Object a() {
            return this.f28422a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f28422a, ((c) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f28422a.hashCode();
        }

        public final String toString() {
            return this.f28422a.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends C0509a {
        public b(Object obj) {
            super(obj);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        Object a();
    }

    public a(C0509a c0509a) {
        this.f28421a = c0509a;
    }

    public static a a(Object obj) {
        int i10;
        if (obj != null && (i10 = Build.VERSION.SDK_INT) >= 23) {
            return i10 >= 31 ? new a(new b(obj)) : new a(new C0509a(obj));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f28421a.equals(((a) obj).f28421a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28421a.hashCode();
    }

    public final String toString() {
        return this.f28421a.toString();
    }
}
