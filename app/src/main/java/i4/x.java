package i4;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class x extends l {

    /* renamed from: c */
    public final int f16490c;

    /* renamed from: d */
    public final List f16491d;

    /* renamed from: e */
    public final h4.a f16492e;

    /* renamed from: f */
    public final Object f16493f;

    /* renamed from: g */
    public final Map f16494g;

    /* renamed from: h */
    public final Collection f16495h;

    public x(h4.a aVar, List list, int i10) {
        super(null, null);
        this.f16492e = aVar;
        this.f16490c = i10;
        this.f16491d = list;
        this.f16493f = null;
        this.f16494g = null;
        this.f16495h = null;
    }

    public x(Collection collection) {
        super(null, null);
        this.f16492e = null;
        this.f16490c = -1;
        this.f16491d = null;
        this.f16493f = null;
        this.f16494g = null;
        this.f16495h = collection;
    }

    public x(Map map, Object obj) {
        super(null, null);
        this.f16492e = null;
        this.f16490c = -1;
        this.f16491d = null;
        this.f16493f = obj;
        this.f16494g = map;
        this.f16495h = null;
    }

    @Override // i4.l
    public final void c(h4.a aVar, Object obj, Type type, HashMap hashMap) {
    }

    @Override // i4.l
    public final void d(Object obj, Object obj2) {
        e4.b bVar;
        Object obj3;
        Map map = this.f16494g;
        if (map != null) {
            map.put(this.f16493f, obj2);
            return;
        }
        Collection collection = this.f16495h;
        if (collection != null) {
            collection.add(obj2);
            return;
        }
        this.f16491d.set(this.f16490c, obj2);
        List list = this.f16491d;
        if ((list instanceof e4.b) && (obj3 = (bVar = (e4.b) list).f13348j) != null && Array.getLength(obj3) > this.f16490c) {
            Type type = bVar.f13349k;
            if (type != null) {
                obj2 = n4.n.d(obj2, type, this.f16492e.f15771c);
            }
            Array.set(obj3, this.f16490c, obj2);
        }
    }
}
