package b0;

import android.util.Rational;
import java.util.Comparator;
import s.h1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final Rational f3924a = new Rational(4, 3);

    /* renamed from: b */
    public static final Rational f3925b = new Rational(3, 4);

    /* renamed from: c */
    public static final Rational f3926c = new Rational(16, 9);

    /* renamed from: d */
    public static final Rational f3927d = new Rational(9, 16);

    /* renamed from: b0.a$a */
    /* loaded from: classes.dex */
    public static final class C0047a implements Comparator<Rational> {

        /* renamed from: a */
        public Rational f3928a;

        public C0047a(Rational rational) {
            this.f3928a = rational;
        }

        @Override // java.util.Comparator
        public final int compare(Rational rational, Rational rational2) {
            Rational rational3 = rational;
            Rational rational4 = rational2;
            if (rational3.equals(rational4)) {
                return 0;
            }
            return (int) Math.signum(Float.valueOf(Math.abs(rational3.floatValue() - this.f3928a.floatValue())).floatValue() - Float.valueOf(Math.abs(rational4.floatValue() - this.f3928a.floatValue())).floatValue());
        }
    }

    public static boolean a(int i10, int i11, Rational rational) {
        h1.f(i11 % 16 == 0);
        double numerator = (rational.getNumerator() * i10) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i11 + (-16))) && numerator < ((double) (i11 + 16));
    }
}
