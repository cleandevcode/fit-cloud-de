package t4;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a */
    public static final b f27656a;

    /* renamed from: b */
    public static final c f27657b;

    /* renamed from: c */
    public static final e f27658c;

    /* loaded from: classes.dex */
    public class a extends n {
        @Override // t4.n
        public final boolean a() {
            return true;
        }

        @Override // t4.n
        public final boolean b() {
            return true;
        }

        @Override // t4.n
        public final boolean c(r4.a aVar) {
            return aVar == r4.a.REMOTE;
        }

        @Override // t4.n
        public final boolean d(boolean z10, r4.a aVar, r4.c cVar) {
            return (aVar == r4.a.RESOURCE_DISK_CACHE || aVar == r4.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends n {
        @Override // t4.n
        public final boolean a() {
            return false;
        }

        @Override // t4.n
        public final boolean b() {
            return false;
        }

        @Override // t4.n
        public final boolean c(r4.a aVar) {
            return false;
        }

        @Override // t4.n
        public final boolean d(boolean z10, r4.a aVar, r4.c cVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c extends n {
        @Override // t4.n
        public final boolean a() {
            return true;
        }

        @Override // t4.n
        public final boolean b() {
            return false;
        }

        @Override // t4.n
        public final boolean c(r4.a aVar) {
            return (aVar == r4.a.DATA_DISK_CACHE || aVar == r4.a.MEMORY_CACHE) ? false : true;
        }

        @Override // t4.n
        public final boolean d(boolean z10, r4.a aVar, r4.c cVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class d extends n {
        @Override // t4.n
        public final boolean a() {
            return false;
        }

        @Override // t4.n
        public final boolean b() {
            return true;
        }

        @Override // t4.n
        public final boolean c(r4.a aVar) {
            return false;
        }

        @Override // t4.n
        public final boolean d(boolean z10, r4.a aVar, r4.c cVar) {
            return (aVar == r4.a.RESOURCE_DISK_CACHE || aVar == r4.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    public class e extends n {
        @Override // t4.n
        public final boolean a() {
            return true;
        }

        @Override // t4.n
        public final boolean b() {
            return true;
        }

        @Override // t4.n
        public final boolean c(r4.a aVar) {
            return aVar == r4.a.REMOTE;
        }

        @Override // t4.n
        public final boolean d(boolean z10, r4.a aVar, r4.c cVar) {
            return ((z10 && aVar == r4.a.DATA_DISK_CACHE) || aVar == r4.a.LOCAL) && cVar == r4.c.TRANSFORMED;
        }
    }

    static {
        new a();
        f27656a = new b();
        f27657b = new c();
        new d();
        f27658c = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(r4.a aVar);

    public abstract boolean d(boolean z10, r4.a aVar, r4.c cVar);
}
