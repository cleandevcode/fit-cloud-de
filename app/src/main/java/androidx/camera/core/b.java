package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.s;

/* loaded from: classes.dex */
public final class b extends s.c {

    /* renamed from: a */
    public final int f1616a;

    /* renamed from: b */
    public final Surface f1617b;

    public b(int i10, Surface surface) {
        this.f1616a = i10;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f1617b = surface;
    }

    @Override // androidx.camera.core.s.c
    public final int a() {
        return this.f1616a;
    }

    @Override // androidx.camera.core.s.c
    public final Surface b() {
        return this.f1617b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s.c) {
            s.c cVar = (s.c) obj;
            return this.f1616a == cVar.a() && this.f1617b.equals(cVar.b());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1616a ^ 1000003) * 1000003) ^ this.f1617b.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Result{resultCode=");
        a10.append(this.f1616a);
        a10.append(", surface=");
        a10.append(this.f1617b);
        a10.append("}");
        return a10.toString();
    }
}
