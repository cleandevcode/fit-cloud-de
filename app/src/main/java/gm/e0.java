package gm;

import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class e0 {
    public static Collection a(Collection collection) {
        if (!(collection instanceof hm.a) || (collection instanceof hm.b)) {
            return collection;
        }
        d(collection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static List b(List list) {
        if (!(list instanceof hm.a) || (list instanceof hm.c)) {
            return list;
        }
        d(list, "kotlin.collections.MutableList");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x00b9, code lost:
        if (r0 == r3) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(int r3, java.lang.Object r4) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gm.e0.c(int, java.lang.Object):void");
    }

    public static void d(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(android.support.v4.media.a.a(name, " cannot be cast to ", str));
        l.j(e0.class.getName(), classCastException);
        throw classCastException;
    }
}
