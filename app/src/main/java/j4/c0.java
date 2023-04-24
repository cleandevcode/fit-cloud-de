package j4;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c0 implements t0, i4.t {

    /* renamed from: a */
    public static c0 f17335a = new c0();

    @Override // i4.t
    public final int b() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.common.collect.ArrayListMultimap, T] */
    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        if (type == ArrayListMultimap.class) {
            ?? r42 = (T) ArrayListMultimap.create();
            for (Map.Entry<String, Object> entry : aVar.L().entrySet()) {
                Object value = entry.getValue();
                boolean z10 = value instanceof Collection;
                String key = entry.getKey();
                if (z10) {
                    r42.putAll(key, (List) value);
                } else {
                    r42.put(key, value);
                }
            }
            return r42;
        }
        return null;
    }

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        d1 d1Var = i0Var.f17406j;
        if (obj instanceof Multimap) {
            i0Var.s(((Multimap) obj).asMap());
        }
    }
}
