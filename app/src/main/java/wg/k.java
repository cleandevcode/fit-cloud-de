package wg;

import com.topstep.fitcloud.pro.shared.data.net.json.StringNotBlank;
import gm.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import mf.h0;
import mf.t;

/* loaded from: classes2.dex */
public final class k implements t.a {

    /* renamed from: a */
    public static final k f29827a = new k();

    @Override // mf.t.a
    public final t<?> a(Type type, Set<? extends Annotation> set, h0 h0Var) {
        l.f(type, "type");
        l.f(set, "annotations");
        l.f(h0Var, "moshi");
        if (!l.a(type, String.class) || set.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof StringNotBlank) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return new j().d();
        }
        return null;
    }
}
