package androidx.camera.core;

import android.graphics.Rect;
import androidx.camera.core.s;

/* loaded from: classes.dex */
public final class c extends s.d {

    /* renamed from: a */
    public final Rect f1618a;

    /* renamed from: b */
    public final int f1619b;

    /* renamed from: c */
    public final int f1620c;

    public c(Rect rect, int i10, int i11) {
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f1618a = rect;
        this.f1619b = i10;
        this.f1620c = i11;
    }

    @Override // androidx.camera.core.s.d
    public final Rect a() {
        return this.f1618a;
    }

    @Override // androidx.camera.core.s.d
    public final int b() {
        return this.f1619b;
    }

    @Override // androidx.camera.core.s.d
    public final int c() {
        return this.f1620c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s.d) {
            s.d dVar = (s.d) obj;
            return this.f1618a.equals(dVar.a()) && this.f1619b == dVar.b() && this.f1620c == dVar.c();
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1618a.hashCode() ^ 1000003) * 1000003) ^ this.f1619b) * 1000003) ^ this.f1620c;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("TransformationInfo{cropRect=");
        a10.append(this.f1618a);
        a10.append(", rotationDegrees=");
        a10.append(this.f1619b);
        a10.append(", targetRotation=");
        return a0.q.b(a10, this.f1620c, "}");
    }
}
