package ag;

import android.support.v4.media.d;
import l2.o0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final boolean f462a;

    /* renamed from: b */
    public final boolean f463b;

    /* renamed from: c */
    public final boolean f464c;

    public a(boolean z10, boolean z11, boolean z12) {
        this.f462a = z10;
        this.f463b = z11;
        this.f464c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f462a == aVar.f462a && this.f463b == aVar.f463b && this.f464c == aVar.f464c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public final int hashCode() {
        boolean z10 = this.f462a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f463b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z11 = this.f464c;
        return i12 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder a10 = d.a("Notice(appUpgradeable=");
        a10.append(this.f462a);
        a10.append(", hardwareUpgradeable=");
        a10.append(this.f463b);
        a10.append(", friendMsgUnread=");
        return o0.a(a10, this.f464c, ')');
    }
}
