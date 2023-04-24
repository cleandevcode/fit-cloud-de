package pg;

/* loaded from: classes2.dex */
public final class f extends j {

    /* renamed from: d */
    public final long f24036d;

    /* renamed from: e */
    public final int f24037e;

    /* renamed from: f */
    public final float f24038f;

    /* renamed from: g */
    public final int f24039g;

    /* renamed from: h */
    public final long f24040h;

    public f(long j10, int i10, float f10, int i11, long j11) {
        super(j11);
        this.f24036d = j10;
        this.f24037e = i10;
        this.f24038f = f10;
        this.f24039g = i11;
        this.f24040h = j11;
    }

    @Override // pg.j
    public final long a() {
        return this.f24040h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f24036d == fVar.f24036d && this.f24037e == fVar.f24037e && Float.compare(this.f24038f, fVar.f24038f) == 0 && this.f24039g == fVar.f24039g && this.f24040h == fVar.f24040h;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f24036d;
        float f10 = this.f24038f;
        long j11 = this.f24040h;
        return ((t0.e.b(f10, ((((int) (j10 ^ (j10 >>> 32))) * 31) + this.f24037e) * 31, 31) + this.f24039g) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ExerciseGoalEntity(userId=");
        a10.append(this.f24036d);
        a10.append(", step=");
        a10.append(this.f24037e);
        a10.append(", distance=");
        a10.append(this.f24038f);
        a10.append(", calorie=");
        a10.append(this.f24039g);
        a10.append(", lastModifyTime=");
        return d4.b.a(a10, this.f24040h, ')');
    }
}
