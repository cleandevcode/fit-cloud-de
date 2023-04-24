package rj;

import jh.v;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public final boolean f25766a;

    /* renamed from: b */
    public final int f25767b;

    /* renamed from: c */
    public final int f25768c;

    public b(int i10, int i11, boolean z10) {
        this.f25766a = z10;
        this.f25767b = i10;
        this.f25768c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f25766a == bVar.f25766a && this.f25767b == bVar.f25767b && this.f25768c == bVar.f25768c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        boolean z10 = this.f25766a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = this.f25767b;
        return this.f25768c + ((i10 + (r02 * 31)) * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcBatteryStatus(isCharging=");
        c10.append(this.f25766a);
        c10.append(", batteryCount=");
        c10.append(this.f25767b);
        c10.append(", percentage=");
        return v.b(c10, this.f25768c, ')');
    }
}
