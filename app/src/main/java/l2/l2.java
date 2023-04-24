package l2;

import java.util.List;

/* loaded from: classes.dex */
public abstract class l2<Key, Value> {

    /* renamed from: a */
    public final k0 f19073a = new k0();

    /* loaded from: classes.dex */
    public static abstract class a<Key> {

        /* renamed from: a */
        public final int f19074a;

        /* renamed from: l2.l2$a$a */
        /* loaded from: classes.dex */
        public static final class C0335a<Key> extends a<Key> {

            /* renamed from: b */
            public final Key f19075b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0335a(int i10, Object obj, boolean z10) {
                super(i10, z10);
                gm.l.f(obj, "key");
                this.f19075b = obj;
            }

            @Override // l2.l2.a
            public final Key a() {
                return this.f19075b;
            }
        }

        /* loaded from: classes.dex */
        public static final class b<Key> extends a<Key> {

            /* renamed from: b */
            public final Key f19076b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(int i10, Object obj, boolean z10) {
                super(i10, z10);
                gm.l.f(obj, "key");
                this.f19076b = obj;
            }

            @Override // l2.l2.a
            public final Key a() {
                return this.f19076b;
            }
        }

        /* loaded from: classes.dex */
        public static final class c<Key> extends a<Key> {

            /* renamed from: b */
            public final Key f19077b;

            /* JADX WARN: Multi-variable type inference failed */
            public c(int i10, Object obj, boolean z10) {
                super(i10, z10);
                this.f19077b = obj;
            }

            @Override // l2.l2.a
            public final Key a() {
                return this.f19077b;
            }
        }

        public a(int i10, boolean z10) {
            this.f19074a = i10;
        }

        public abstract Key a();
    }

    /* loaded from: classes.dex */
    public static abstract class b<Key, Value> {

        /* loaded from: classes.dex */
        public static final class a<Key, Value> extends b<Key, Value> {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    ((a) obj).getClass();
                    return gm.l.a(null, null);
                }
                return false;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Error(throwable=null)";
            }
        }

        /* renamed from: l2.l2$b$b */
        /* loaded from: classes.dex */
        public static final class C0336b<Key, Value> extends b<Key, Value> {
        }

        /* loaded from: classes.dex */
        public static final class c<Key, Value> extends b<Key, Value> {

            /* renamed from: a */
            public final List<Value> f19078a;

            /* renamed from: b */
            public final Key f19079b;

            /* renamed from: c */
            public final Key f19080c;

            /* renamed from: d */
            public final int f19081d;

            /* renamed from: e */
            public final int f19082e;

            static {
                new c(ul.s.f28879a, null, null, 0, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public c(List list, Integer num, Integer num2, int i10, int i11) {
                boolean z10;
                this.f19078a = list;
                this.f19079b = num;
                this.f19080c = num2;
                this.f19081d = i10;
                this.f19082e = i11;
                boolean z11 = true;
                if (i10 != Integer.MIN_VALUE && i10 < 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (i11 != Integer.MIN_VALUE && i11 < 0) {
                        z11 = false;
                    }
                    if (z11) {
                        return;
                    }
                    throw new IllegalArgumentException("itemsAfter cannot be negative".toString());
                }
                throw new IllegalArgumentException("itemsBefore cannot be negative".toString());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return gm.l.a(this.f19078a, cVar.f19078a) && gm.l.a(this.f19079b, cVar.f19079b) && gm.l.a(this.f19080c, cVar.f19080c) && this.f19081d == cVar.f19081d && this.f19082e == cVar.f19082e;
                }
                return false;
            }

            public final int hashCode() {
                int hashCode = this.f19078a.hashCode() * 31;
                Key key = this.f19079b;
                int hashCode2 = (hashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.f19080c;
                return ((((hashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31) + this.f19081d) * 31) + this.f19082e;
            }

            public final String toString() {
                StringBuilder a10 = android.support.v4.media.d.a("Page(data=");
                a10.append(this.f19078a);
                a10.append(", prevKey=");
                a10.append(this.f19079b);
                a10.append(", nextKey=");
                a10.append(this.f19080c);
                a10.append(", itemsBefore=");
                a10.append(this.f19081d);
                a10.append(", itemsAfter=");
                return a1.b.a(a10, this.f19082e, ')');
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends gm.m implements fm.l<fm.a<? extends tl.l>, tl.l> {

        /* renamed from: b */
        public static final c f19083b = new c();

        public c() {
            super(1);
        }

        @Override // fm.l
        public final tl.l k(fm.a<? extends tl.l> aVar) {
            fm.a<? extends tl.l> aVar2 = aVar;
            gm.l.f(aVar2, "it");
            aVar2.m();
            return tl.l.f28297a;
        }
    }

    public boolean a() {
        return this instanceof lg.h0;
    }

    public abstract Key b(m2<Key, Value> m2Var);

    public abstract Object c(a aVar, zl.c cVar);
}
