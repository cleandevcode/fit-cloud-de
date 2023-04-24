package m5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i<T, Y> {

    /* renamed from: a */
    public final LinkedHashMap f20373a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public long f20374b;

    /* renamed from: c */
    public long f20375c;

    /* loaded from: classes.dex */
    public static final class a<Y> {

        /* renamed from: a */
        public final Y f20376a;

        /* renamed from: b */
        public final int f20377b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, Object obj) {
            this.f20376a = obj;
            this.f20377b = i10;
        }
    }

    public i(long j10) {
        this.f20374b = j10;
    }

    public final synchronized Y a(T t10) {
        a aVar;
        aVar = (a) this.f20373a.get(t10);
        return aVar != null ? aVar.f20376a : null;
    }

    public int b(Y y10) {
        return 1;
    }

    public void c(T t10, Y y10) {
    }

    public final synchronized Y d(T t10, Y y10) {
        a aVar;
        int b10 = b(y10);
        long j10 = b10;
        Y y11 = null;
        if (j10 >= this.f20374b) {
            c(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f20375c += j10;
        }
        LinkedHashMap linkedHashMap = this.f20373a;
        if (y10 == null) {
            aVar = null;
        } else {
            aVar = new a(b10, y10);
        }
        a aVar2 = (a) linkedHashMap.put(t10, aVar);
        if (aVar2 != null) {
            this.f20375c -= aVar2.f20377b;
            if (!aVar2.f20376a.equals(y10)) {
                c(t10, aVar2.f20376a);
            }
        }
        e(this.f20374b);
        if (aVar2 != null) {
            y11 = aVar2.f20376a;
        }
        return y11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(long j10) {
        while (this.f20375c > j10) {
            Iterator it = this.f20373a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f20375c -= aVar.f20377b;
            Object key = entry.getKey();
            it.remove();
            c(key, aVar.f20376a);
        }
    }
}
