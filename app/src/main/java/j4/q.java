package j4;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q implements i4.t {
    @Override // i4.t
    public final int b() {
        return 4;
    }

    @Override // i4.t
    public final <T> T d(h4.a aVar, Type type, Object obj) {
        String t10;
        boolean z10;
        h4.c cVar = aVar.f15774f;
        if (cVar.h0() == 4) {
            t10 = cVar.W();
            cVar.J(16);
        } else if (cVar.h0() == 2) {
            Number b02 = cVar.b0();
            cVar.J(16);
            t10 = b02.toString();
        } else {
            Object D = aVar.D();
            if (D instanceof String) {
                t10 = (String) D;
            } else if (D instanceof Collection) {
                Collection<String> collection = (Collection) D;
                Iterator it = collection.iterator();
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if ((next instanceof String) && ((String) next).length() != 1) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    char[] cArr = new char[collection.size()];
                    int i10 = 0;
                    for (String str : collection) {
                        cArr[i10] = str.charAt(0);
                        i10++;
                    }
                    return cArr;
                }
                throw new e4.d("can not cast to char[]");
            } else if (D == null) {
                return null;
            } else {
                t10 = e4.a.t(D);
            }
        }
        return (T) t10.toCharArray();
    }
}
