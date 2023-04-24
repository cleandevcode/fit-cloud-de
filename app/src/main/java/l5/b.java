package l5;

import android.support.v4.media.d;
import b0.c;
import java.security.MessageDigest;
import r4.f;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: b */
    public final Object f19393b;

    public b(Object obj) {
        c.i(obj);
        this.f19393b = obj;
    }

    @Override // r4.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f19393b.toString().getBytes(f.f25212a));
    }

    @Override // r4.f
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f19393b.equals(((b) obj).f19393b);
        }
        return false;
    }

    @Override // r4.f
    public final int hashCode() {
        return this.f19393b.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = d.a("ObjectKey{object=");
        a10.append(this.f19393b);
        a10.append('}');
        return a10.toString();
    }
}
