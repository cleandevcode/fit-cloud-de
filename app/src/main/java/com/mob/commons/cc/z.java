package com.mob.commons.cc;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a */
    private a f8362a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private Number f8363a;

        /* renamed from: b */
        private Number f8364b;

        /* renamed from: c */
        private Number f8365c;

        /* renamed from: d */
        private Number f8366d;

        /* renamed from: e */
        private boolean f8367e;

        public a(Number number, Number number2, Number number3) {
            Number[] numberArr = {number, number2, number3};
            int[] iArr = {0, 0, 0};
            for (int i10 = 0; i10 < 3; i10++) {
                Number number4 = numberArr[i10];
                if (number4 != null) {
                    if (number4 instanceof Byte) {
                        iArr[i10] = 1;
                    } else if (number4 instanceof Short) {
                        iArr[i10] = 2;
                    } else if (number4 instanceof Integer) {
                        iArr[i10] = 3;
                    } else if (number4 instanceof Long) {
                        iArr[i10] = 4;
                    } else if (number4 instanceof Float) {
                        iArr[i10] = 5;
                    } else if (number4 instanceof Double) {
                        iArr[i10] = 6;
                    }
                }
            }
            int i11 = 0;
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr[i12];
                if (i11 < i13) {
                    i11 = i13;
                }
            }
            if (number != null) {
                switch (i11) {
                    case 1:
                        number = Byte.valueOf(Double.valueOf(String.valueOf(number)).byteValue());
                        break;
                    case 2:
                        number = Short.valueOf(Double.valueOf(String.valueOf(number)).shortValue());
                        break;
                    case 3:
                        number = Integer.valueOf(Double.valueOf(String.valueOf(number)).intValue());
                        break;
                    case 4:
                        number = Long.valueOf(Double.valueOf(String.valueOf(number)).longValue());
                        break;
                    case 5:
                        number = Float.valueOf(Double.valueOf(String.valueOf(number)).floatValue());
                        break;
                    case 6:
                        number = Double.valueOf(String.valueOf(number));
                        break;
                }
            } else {
                number = new Number[]{Integer.MIN_VALUE, Byte.MIN_VALUE, Short.MIN_VALUE, Integer.MIN_VALUE, Long.MIN_VALUE, Float.valueOf(Float.MIN_VALUE), Double.valueOf(Double.MIN_VALUE)}[i11];
            }
            if (number2 != null) {
                switch (i11) {
                    case 1:
                        number2 = Byte.valueOf(Double.valueOf(String.valueOf(number2)).byteValue());
                        break;
                    case 2:
                        number2 = Short.valueOf(Double.valueOf(String.valueOf(number2)).shortValue());
                        break;
                    case 3:
                        number2 = Integer.valueOf(Double.valueOf(String.valueOf(number2)).intValue());
                        break;
                    case 4:
                        number2 = Long.valueOf(Double.valueOf(String.valueOf(number2)).longValue());
                        break;
                    case 5:
                        number2 = Float.valueOf(Double.valueOf(String.valueOf(number2)).floatValue());
                        break;
                    case 6:
                        number2 = Double.valueOf(String.valueOf(number2));
                        break;
                }
            } else {
                number2 = new Number[]{Integer.MAX_VALUE, Byte.MAX_VALUE, Short.MAX_VALUE, Integer.MAX_VALUE, Long.MAX_VALUE, Float.valueOf(Float.MAX_VALUE), Double.valueOf(Double.MAX_VALUE)}[i11];
            }
            this.f8363a = number;
            this.f8364b = number2;
            this.f8365c = number3;
            boolean z10 = ((Comparable) number).compareTo(number2) > 0;
            this.f8367e = z10;
            if (this.f8365c == null) {
                this.f8365c = Integer.valueOf(z10 ? -1 : 1);
            }
        }

        public boolean a() {
            Number number = this.f8366d;
            if (number == null) {
                number = this.f8363a;
            }
            Comparable comparable = (Comparable) number;
            return this.f8367e ? comparable.compareTo(this.f8364b) >= 0 : comparable.compareTo(this.f8364b) <= 0;
        }

        public Number b() {
            int byteValue;
            int byteValue2;
            Number valueOf;
            if (this.f8366d == null) {
                this.f8366d = this.f8363a;
            }
            Number number = this.f8366d;
            Number number2 = this.f8365c;
            if (number2 instanceof Double) {
                valueOf = Double.valueOf(this.f8365c.doubleValue() + number.doubleValue());
            } else if (number2 instanceof Float) {
                valueOf = Float.valueOf(this.f8365c.floatValue() + number.floatValue());
            } else if (number2 instanceof Long) {
                valueOf = Long.valueOf(this.f8365c.longValue() + number.longValue());
            } else {
                if (number2 instanceof Integer) {
                    byteValue = number.intValue();
                    byteValue2 = this.f8365c.intValue();
                } else if (number2 instanceof Short) {
                    byteValue = number.shortValue();
                    byteValue2 = this.f8365c.shortValue();
                } else {
                    byteValue = number.byteValue();
                    byteValue2 = this.f8365c.byteValue();
                }
                valueOf = Integer.valueOf(byteValue2 + byteValue);
            }
            this.f8366d = valueOf;
            return number;
        }
    }

    public z(Number number, Number number2, Number number3) {
        this.f8362a = new a(number, number2, number3);
    }

    public a a() {
        return this.f8362a;
    }

    public boolean a(Number number) {
        return ((Comparable) this.f8362a.f8363a).compareTo(number) <= 0 && ((Comparable) this.f8362a.f8364b).compareTo(number) >= 0;
    }

    public boolean b(Number number) {
        return a(number);
    }

    public Number[] b() {
        return new Number[]{this.f8362a.f8363a, this.f8362a.f8364b};
    }
}
