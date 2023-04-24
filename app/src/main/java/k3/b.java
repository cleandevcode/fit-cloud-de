package k3;

import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public boolean f18188a;

    /* renamed from: b */
    public boolean f18189b;

    /* renamed from: c */
    public boolean f18190c;

    /* renamed from: d */
    public boolean f18191d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f18188a = z10;
        this.f18189b = z11;
        this.f18190c = z12;
        this.f18191d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f18188a == bVar.f18188a && this.f18189b == bVar.f18189b && this.f18190c == bVar.f18190c && this.f18191d == bVar.f18191d;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int hashCode() {
        ?? r02 = this.f18188a;
        int i10 = r02;
        if (this.f18189b) {
            i10 = r02 + 16;
        }
        int i11 = i10;
        if (this.f18190c) {
            i11 = i10 + DfuBaseService.ERROR_REMOTE_TYPE_LEGACY;
        }
        return this.f18191d ? i11 + 4096 : i11;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f18188a), Boolean.valueOf(this.f18189b), Boolean.valueOf(this.f18190c), Boolean.valueOf(this.f18191d));
    }
}
