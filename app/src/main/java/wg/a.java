package wg;

import com.topstep.fitcloud.pro.shared.data.net.json.BaseResultJsonAdapter;
import gm.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import mf.h0;
import mf.t;

/* loaded from: classes2.dex */
public final class a implements t.a {

    /* renamed from: a */
    public static final a f29812a = new a();

    @Override // mf.t.a
    public final t<?> a(Type type, Set<? extends Annotation> set, h0 h0Var) {
        l.f(type, "type");
        l.f(set, "annotations");
        l.f(h0Var, "moshi");
        if (l.a(type, vg.f.class)) {
            return new BaseResultJsonAdapter(h0Var).d();
        }
        return null;
    }
}
