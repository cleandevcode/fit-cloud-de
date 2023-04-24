package qa;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q extends l {

    /* renamed from: a */
    public final Serializable f24665a;

    public q(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f24665a = bool;
    }

    public q(Number number) {
        Objects.requireNonNull(number);
        this.f24665a = number;
    }

    public q(String str) {
        Objects.requireNonNull(str);
        this.f24665a = str;
    }

    public static boolean j(q qVar) {
        Serializable serializable = qVar.f24665a;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        Serializable serializable = this.f24665a;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(i());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f24665a == null) {
            return qVar.f24665a == null;
        } else if (j(this) && j(qVar)) {
            return f().longValue() == qVar.f().longValue();
        } else {
            Serializable serializable = this.f24665a;
            if ((serializable instanceof Number) && (qVar.f24665a instanceof Number)) {
                double doubleValue = f().doubleValue();
                double doubleValue2 = qVar.f().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
                return true;
            }
            return serializable.equals(qVar.f24665a);
        }
    }

    public final Number f() {
        Serializable serializable = this.f24665a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new sa.n((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.f24665a == null) {
            return 31;
        }
        if (j(this)) {
            doubleToLongBits = f().longValue();
        } else {
            Serializable serializable = this.f24665a;
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(f().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public final String i() {
        Serializable serializable = this.f24665a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return f().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        StringBuilder a10 = android.support.v4.media.d.a("Unexpected value type: ");
        a10.append(this.f24665a.getClass());
        throw new AssertionError(a10.toString());
    }
}
