package um;

import xl.f;

/* loaded from: classes2.dex */
public final class b0 implements f.c<a0<?>> {

    /* renamed from: a */
    public final ThreadLocal<?> f28891a;

    public b0(ThreadLocal<?> threadLocal) {
        this.f28891a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && gm.l.a(this.f28891a, ((b0) obj).f28891a);
    }

    public final int hashCode() {
        return this.f28891a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ThreadLocalKey(threadLocal=");
        a10.append(this.f28891a);
        a10.append(')');
        return a10.toString();
    }
}
