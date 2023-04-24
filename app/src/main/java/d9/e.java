package d9;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final y8.b f12874a;

    public e(y8.b bVar) {
        this.f12874a = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            try {
                return this.f12874a.e0(((e) obj).f12874a);
            } catch (RemoteException e10) {
                throw new k(e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        try {
            return this.f12874a.I();
        } catch (RemoteException e10) {
            throw new k(e10);
        }
    }
}
