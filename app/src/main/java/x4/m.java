package x4;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class m<A, B> {

    /* renamed from: a */
    public final l f30230a = new l();

    /* loaded from: classes.dex */
    public static final class a<A> {

        /* renamed from: d */
        public static final ArrayDeque f30231d;

        /* renamed from: a */
        public int f30232a;

        /* renamed from: b */
        public int f30233b;

        /* renamed from: c */
        public A f30234c;

        static {
            char[] cArr = m5.l.f20382a;
            f30231d = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = f30231d;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f30234c = obj;
            aVar.f30233b = 0;
            aVar.f30232a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f30233b == aVar.f30233b && this.f30232a == aVar.f30232a && this.f30234c.equals(aVar.f30234c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f30234c.hashCode() + (((this.f30232a * 31) + this.f30233b) * 31);
        }
    }
}
