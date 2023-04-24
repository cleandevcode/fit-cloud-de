package i4;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public abstract class e implements t {
    @Override // i4.t
    public <T> T d(h4.a aVar, Type type, Object obj) {
        return (T) f(aVar, type, obj, null, 0);
    }

    public abstract <T> T f(h4.a aVar, Type type, Object obj, String str, int i10);
}
