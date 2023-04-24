package e0;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a */
    public final float f13282a;

    /* renamed from: b */
    public final float f13283b;

    /* renamed from: c */
    public final float f13284c;

    /* renamed from: d */
    public final float f13285d;

    public a(float f10, float f11, float f12, float f13) {
        this.f13282a = f10;
        this.f13283b = f11;
        this.f13284c = f12;
        this.f13285d = f13;
    }

    @Override // e0.f
    public final float a() {
        return this.f13285d;
    }

    @Override // e0.f
    public final float b() {
        return this.f13283b;
    }

    @Override // e0.f
    public final float c() {
        return this.f13284c;
    }

    @Override // e0.f
    public final float d() {
        return this.f13282a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return Float.floatToIntBits(this.f13282a) == Float.floatToIntBits(fVar.d()) && Float.floatToIntBits(this.f13283b) == Float.floatToIntBits(fVar.b()) && Float.floatToIntBits(this.f13284c) == Float.floatToIntBits(fVar.c()) && Float.floatToIntBits(this.f13285d) == Float.floatToIntBits(fVar.a());
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f13282a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f13283b)) * 1000003) ^ Float.floatToIntBits(this.f13284c)) * 1000003) ^ Float.floatToIntBits(this.f13285d);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ImmutableZoomState{zoomRatio=");
        a10.append(this.f13282a);
        a10.append(", maxZoomRatio=");
        a10.append(this.f13283b);
        a10.append(", minZoomRatio=");
        a10.append(this.f13284c);
        a10.append(", linearZoom=");
        a10.append(this.f13285d);
        a10.append("}");
        return a10.toString();
    }
}
