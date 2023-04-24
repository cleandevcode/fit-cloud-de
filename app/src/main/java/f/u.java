package f;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d */
    public static u f13983d;

    /* renamed from: a */
    public long f13984a;

    /* renamed from: b */
    public long f13985b;

    /* renamed from: c */
    public int f13986c;

    public final void a(long j10, double d10, double d11) {
        float f10;
        float f11;
        double d12;
        double d13 = (0.01720197f * (((float) (j10 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(f11 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f11) * 3.4906598739326E-4d) + (Math.sin(d13) * 0.03341960161924362d) + d13 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d13) * 0.0053d) + ((float) Math.round((f10 - 9.0E-4f) - d12)) + 9.0E-4f + ((-d11) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d14 = 0.01745329238474369d * d10;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d14))) / (Math.cos(asin) * Math.cos(d14));
        if (sin3 >= 1.0d) {
            this.f13986c = 1;
        } else if (sin3 > -1.0d) {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f13984a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f13985b = round;
            if (round >= j10 || this.f13984a <= j10) {
                this.f13986c = 1;
                return;
            } else {
                this.f13986c = 0;
                return;
            }
        } else {
            this.f13986c = 0;
        }
        this.f13984a = -1L;
        this.f13985b = -1L;
    }
}
