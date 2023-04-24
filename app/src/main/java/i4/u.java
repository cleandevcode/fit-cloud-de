package i4;

import j4.i0;
import j4.t0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/* loaded from: classes.dex */
public final class u implements t0, t {

    /* renamed from: a */
    public static u f16488a = new u();

    @Override // i4.t
    public final int b() {
        return 12;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        if (type == OptionalInt.class) {
            Integer m10 = n4.n.m(aVar.P(null, Integer.class));
            if (m10 == null) {
                return (T) OptionalInt.empty();
            }
            return (T) OptionalInt.of(m10.intValue());
        } else if (type == OptionalLong.class) {
            Long o10 = n4.n.o(aVar.P(null, Long.class));
            if (o10 == null) {
                return (T) OptionalLong.empty();
            }
            return (T) OptionalLong.of(o10.longValue());
        } else if (type == OptionalDouble.class) {
            Double k10 = n4.n.k(aVar.P(null, Double.class));
            if (k10 == null) {
                return (T) OptionalDouble.empty();
            }
            return (T) OptionalDouble.of(k10.doubleValue());
        } else {
            if (!n4.n.f22020i) {
                try {
                    n4.n.f22021j = Class.forName("java.util.Optional");
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    n4.n.f22020i = true;
                    throw th2;
                }
                n4.n.f22020i = true;
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == n4.n.f22021j) {
                    type = parameterizedType.getActualTypeArguments()[0];
                }
            }
            Object P = aVar.P(null, type);
            if (P == null) {
                return (T) Optional.empty();
            }
            return (T) Optional.of(P);
        }
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        Object obj3;
        if (obj == null) {
            i0Var.u();
        } else if (obj instanceof Optional) {
            Optional optional = (Optional) obj;
            if (optional.isPresent()) {
                obj3 = optional.get();
            } else {
                obj3 = null;
            }
            i0Var.s(obj3);
        } else if (obj instanceof OptionalDouble) {
            OptionalDouble optionalDouble = (OptionalDouble) obj;
            if (optionalDouble.isPresent()) {
                i0Var.s(Double.valueOf(optionalDouble.getAsDouble()));
            } else {
                i0Var.u();
            }
        } else if (obj instanceof OptionalInt) {
            OptionalInt optionalInt = (OptionalInt) obj;
            if (optionalInt.isPresent()) {
                i0Var.f17406j.L(optionalInt.getAsInt());
                return;
            }
            i0Var.u();
        } else if (obj instanceof OptionalLong) {
            OptionalLong optionalLong = (OptionalLong) obj;
            if (optionalLong.isPresent()) {
                i0Var.f17406j.P(optionalLong.getAsLong());
                return;
            }
            i0Var.u();
        } else {
            StringBuilder a10 = android.support.v4.media.d.a("not support optional : ");
            a10.append(obj.getClass());
            throw new e4.d(a10.toString());
        }
    }
}
