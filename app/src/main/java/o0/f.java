package o0;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class f<K, V> {

    /* renamed from: a */
    public final LinkedHashMap<K, V> f22526a;

    /* renamed from: b */
    public int f22527b;

    /* renamed from: c */
    public int f22528c;

    /* renamed from: d */
    public int f22529d;

    /* renamed from: e */
    public int f22530e;

    public f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f22528c = i10;
        this.f22526a = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V a(K k10) {
        if (k10 != null) {
            synchronized (this) {
                V v10 = this.f22526a.get(k10);
                if (v10 != null) {
                    this.f22529d++;
                    return v10;
                }
                this.f22530e++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x005d, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V b(K r3, V r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L83
            monitor-enter(r2)
            int r0 = r2.f22527b     // Catch: java.lang.Throwable -> L80
            int r0 = r0 + 1
            r2.f22527b = r0     // Catch: java.lang.Throwable -> L80
            java.util.LinkedHashMap<K, V> r0 = r2.f22526a     // Catch: java.lang.Throwable -> L80
            java.lang.Object r3 = r0.put(r3, r4)     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L17
            int r4 = r2.f22527b     // Catch: java.lang.Throwable -> L80
            int r4 = r4 + (-1)
            r2.f22527b = r4     // Catch: java.lang.Throwable -> L80
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L80
            int r4 = r2.f22528c
        L1a:
            monitor-enter(r2)
            int r0 = r2.f22527b     // Catch: java.lang.Throwable -> L7d
            if (r0 < 0) goto L5e
            java.util.LinkedHashMap<K, V> r0 = r2.f22526a     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L2b
            int r0 = r2.f22527b     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L5e
        L2b:
            int r0 = r2.f22527b     // Catch: java.lang.Throwable -> L7d
            if (r0 <= r4) goto L5c
            java.util.LinkedHashMap<K, V> r0 = r2.f22526a     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L38
            goto L5c
        L38:
            java.util.LinkedHashMap<K, V> r0 = r2.f22526a     // Catch: java.lang.Throwable -> L7d
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L7d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L7d
            r0.getValue()     // Catch: java.lang.Throwable -> L7d
            java.util.LinkedHashMap<K, V> r0 = r2.f22526a     // Catch: java.lang.Throwable -> L7d
            r0.remove(r1)     // Catch: java.lang.Throwable -> L7d
            int r0 = r2.f22527b     // Catch: java.lang.Throwable -> L7d
            int r0 = r0 + (-1)
            r2.f22527b = r0     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            goto L1a
        L5c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            return r3
        L5e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r4.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L7d
            r4.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r4.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7d
            throw r3     // Catch: java.lang.Throwable -> L7d
        L7d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            throw r3
        L80:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L80
            throw r3
        L83:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key == null || value == null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.f.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f22529d;
        i11 = this.f22530e + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f22528c), Integer.valueOf(this.f22529d), Integer.valueOf(this.f22530e), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }
}
