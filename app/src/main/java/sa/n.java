package sa;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class n extends Number {

    /* renamed from: a */
    public final String f26775a;

    public n(String str) {
        this.f26775a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new BigDecimal(this.f26775a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f26775a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            String str = this.f26775a;
            String str2 = ((n) obj).f26775a;
            return str == str2 || str.equals(str2);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f26775a);
    }

    public final int hashCode() {
        return this.f26775a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f26775a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f26775a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f26775a);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f26775a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f26775a).longValue();
        }
    }

    public final String toString() {
        return this.f26775a;
    }
}
