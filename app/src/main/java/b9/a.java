package b9;

import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import d9.k;
import f.s;
import i8.p;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final c9.b f4036a;

    /* renamed from: b */
    public w.d f4037b;

    /* renamed from: b9.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0054a {
    }

    public a(c9.b bVar) {
        new HashMap();
        p.f(bVar);
        this.f4036a = bVar;
    }

    public final d9.e a(d9.f fVar) {
        try {
            y8.b d02 = this.f4036a.d0(fVar);
            if (d02 != null) {
                return new d9.e(d02);
            }
            return null;
        } catch (RemoteException e10) {
            throw new k(e10);
        }
    }

    public final CameraPosition b() {
        try {
            return this.f4036a.w();
        } catch (RemoteException e10) {
            throw new k(e10);
        }
    }

    public final s c() {
        try {
            return new s(this.f4036a.i0());
        } catch (RemoteException e10) {
            throw new k(e10);
        }
    }

    public final w.d d() {
        try {
            if (this.f4037b == null) {
                this.f4037b = new w.d(this.f4036a.X());
            }
            return this.f4037b;
        } catch (RemoteException e10) {
            throw new k(e10);
        }
    }

    public final void e(x2.i iVar) {
        try {
            this.f4036a.C((p8.b) iVar.f30183b);
        } catch (RemoteException e10) {
            throw new k(e10);
        }
    }
}
