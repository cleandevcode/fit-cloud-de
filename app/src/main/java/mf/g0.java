package mf;

import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import mf.t;

/* loaded from: classes.dex */
public final class g0<K, V> extends t<Map<K, V>> {

    /* renamed from: c */
    public static final a f20569c = new a();

    /* renamed from: a */
    public final t<K> f20570a;

    /* renamed from: b */
    public final t<V> f20571b;

    /* loaded from: classes.dex */
    public class a implements t.a {
        @Override // mf.t.a
        public final t<?> a(Type type, Set<? extends Annotation> set, h0 h0Var) {
            Class<?> c10;
            Type[] actualTypeArguments;
            if (!set.isEmpty() || (c10 = l0.c(type)) != Map.class) {
                return null;
            }
            if (type == Properties.class) {
                actualTypeArguments = new Type[]{String.class, String.class};
            } else if (Map.class.isAssignableFrom(c10)) {
                Type i10 = nf.b.i(type, c10, nf.b.c(type, c10, Map.class), new LinkedHashSet());
                actualTypeArguments = i10 instanceof ParameterizedType ? ((ParameterizedType) i10).getActualTypeArguments() : new Type[]{Object.class, Object.class};
            } else {
                throw new IllegalArgumentException();
            }
            return new g0(h0Var, actualTypeArguments[0], actualTypeArguments[1]).d();
        }
    }

    public g0(h0 h0Var, Type type, Type type2) {
        this.f20570a = h0Var.b(type);
        this.f20571b = h0Var.b(type2);
    }

    @Override // mf.t
    public final Object b(y yVar) {
        f0 f0Var = new f0();
        yVar.b();
        while (yVar.q()) {
            yVar.I();
            K b10 = this.f20570a.b(yVar);
            V b11 = this.f20571b.b(yVar);
            Object put = f0Var.put(b10, b11);
            if (put != null) {
                throw new v("Map key '" + b10 + "' has multiple values at path " + yVar.k() + ": " + put + " and " + b11);
            }
        }
        yVar.j();
        return f0Var;
    }

    @Override // mf.t
    public final void f(e0 e0Var, Object obj) {
        e0Var.b();
        for (Map.Entry<K, V> entry : ((Map) obj).entrySet()) {
            if (entry.getKey() != null) {
                int y10 = e0Var.y();
                if (y10 != 5 && y10 != 3) {
                    throw new IllegalStateException("Nesting problem.");
                }
                e0Var.f20534g = true;
                this.f20570a.f(e0Var, entry.getKey());
                this.f20571b.f(e0Var, entry.getValue());
            } else {
                StringBuilder a10 = android.support.v4.media.d.a("Map key is null at ");
                a10.append(e0Var.q());
                throw new v(a10.toString());
            }
        }
        e0Var.k();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("JsonAdapter(");
        a10.append(this.f20570a);
        a10.append(ContainerUtils.KEY_VALUE_DELIMITER);
        a10.append(this.f20571b);
        a10.append(")");
        return a10.toString();
    }
}
