package androidx.camera.lifecycle;

import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.u;
import e0.e;

/* loaded from: classes.dex */
public final class a extends LifecycleCameraRepository.a {

    /* renamed from: a */
    public final u f1834a;

    /* renamed from: b */
    public final e.b f1835b;

    public a(u uVar, e.b bVar) {
        if (uVar == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f1834a = uVar;
        if (bVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f1835b = bVar;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.a
    public final e.b a() {
        return this.f1835b;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.a
    public final u b() {
        return this.f1834a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LifecycleCameraRepository.a) {
            LifecycleCameraRepository.a aVar = (LifecycleCameraRepository.a) obj;
            return this.f1834a.equals(aVar.b()) && this.f1835b.equals(aVar.a());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1834a.hashCode() ^ 1000003) * 1000003) ^ this.f1835b.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Key{lifecycleOwner=");
        a10.append(this.f1834a);
        a10.append(", cameraId=");
        a10.append(this.f1835b);
        a10.append("}");
        return a10.toString();
    }
}
