package l2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import l2.b1;
import l2.j3;
import l2.l2;
import l2.n0;

/* loaded from: classes.dex */
public final class t1<Key, Value> {

    /* renamed from: a */
    public final a2 f19253a;

    /* renamed from: b */
    public final ArrayList f19254b;

    /* renamed from: c */
    public final ArrayList f19255c;

    /* renamed from: d */
    public int f19256d;

    /* renamed from: e */
    public int f19257e;

    /* renamed from: f */
    public int f19258f;

    /* renamed from: g */
    public int f19259g;

    /* renamed from: h */
    public int f19260h;

    /* renamed from: i */
    public final rm.a f19261i;

    /* renamed from: j */
    public final rm.a f19262j;

    /* renamed from: k */
    public final LinkedHashMap f19263k;

    /* renamed from: l */
    public w0 f19264l;

    /* loaded from: classes.dex */
    public static final class a<Key, Value> {

        /* renamed from: a */
        public final ym.c f19265a;

        /* renamed from: b */
        public final t1<Key, Value> f19266b;

        public a(a2 a2Var) {
            gm.l.f(a2Var, "config");
            this.f19265a = rm.b.a();
            this.f19266b = new t1<>(a2Var);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19267a;

        static {
            int[] iArr = new int[r0.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            f19267a = iArr;
        }
    }

    public t1(a2 a2Var) {
        this.f19253a = a2Var;
        ArrayList arrayList = new ArrayList();
        this.f19254b = arrayList;
        this.f19255c = arrayList;
        this.f19261i = jh.v.a(-1, null, 6);
        this.f19262j = jh.v.a(-1, null, 6);
        this.f19263k = new LinkedHashMap();
        w0 w0Var = new w0();
        w0Var.c(r0.REFRESH, n0.b.f19107b);
        tl.l lVar = tl.l.f28297a;
        this.f19264l = w0Var;
    }

    public final m2<Key, Value> a(j3.a aVar) {
        Integer valueOf;
        int size;
        List Y = ul.q.Y(this.f19255c);
        if (aVar == null) {
            valueOf = null;
        } else {
            int d10 = d();
            int i10 = -this.f19256d;
            int k10 = h7.a.k(this.f19255c) - this.f19256d;
            int i11 = aVar.f19035e;
            if (i10 < i11) {
                int i12 = i10;
                while (true) {
                    int i13 = i12 + 1;
                    if (i12 > k10) {
                        this.f19253a.getClass();
                        size = 20;
                    } else {
                        size = ((l2.b.c) this.f19255c.get(i12 + this.f19256d)).f19078a.size();
                    }
                    d10 += size;
                    if (i13 >= i11) {
                        break;
                    }
                    i12 = i13;
                }
            }
            int i14 = d10 + aVar.f19036f;
            if (aVar.f19035e < i10) {
                this.f19253a.getClass();
                i14 -= 20;
            }
            valueOf = Integer.valueOf(i14);
        }
        return new m2<>(Y, valueOf, this.f19253a, d());
    }

    public final void b(b1.a<Value> aVar) {
        boolean z10;
        int i10;
        rm.a aVar2;
        int i11 = 0;
        if (aVar.b() <= this.f19255c.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f19263k.remove(aVar.f18728a);
            this.f19264l.c(aVar.f18728a, n0.c.f19109c);
            int ordinal = aVar.f18728a.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    int b10 = aVar.b();
                    for (int i12 = 0; i12 < b10; i12++) {
                        this.f19254b.remove(this.f19255c.size() - 1);
                    }
                    int i13 = aVar.f18731d;
                    if (i13 != Integer.MIN_VALUE) {
                        i11 = i13;
                    }
                    this.f19258f = i11;
                    i10 = this.f19260h + 1;
                    this.f19260h = i10;
                    aVar2 = this.f19262j;
                } else {
                    throw new IllegalArgumentException(gm.l.k(aVar.f18728a, "cannot drop "));
                }
            } else {
                int b11 = aVar.b();
                for (int i14 = 0; i14 < b11; i14++) {
                    this.f19254b.remove(0);
                }
                this.f19256d -= aVar.b();
                int i15 = aVar.f18731d;
                if (i15 != Integer.MIN_VALUE) {
                    i11 = i15;
                }
                this.f19257e = i11;
                i10 = this.f19259g + 1;
                this.f19259g = i10;
                aVar2 = this.f19261i;
            }
            aVar2.p(Integer.valueOf(i10));
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("invalid drop count. have ");
        a10.append(this.f19255c.size());
        a10.append(" but wanted to drop ");
        a10.append(aVar.b());
        throw new IllegalStateException(a10.toString().toString());
    }

    public final b1.a<Value> c(r0 r0Var, j3 j3Var) {
        boolean z10;
        int k10;
        int k11;
        int i10;
        Object obj;
        int i11;
        gm.l.f(r0Var, "loadType");
        gm.l.f(j3Var, "hint");
        b1.a<Value> aVar = null;
        if (this.f19253a.f18712d == Integer.MAX_VALUE || this.f19255c.size() <= 2) {
            return null;
        }
        Iterator it = this.f19255c.iterator();
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            i13 += ((l2.b.c) it.next()).f19078a.size();
        }
        if (i13 <= this.f19253a.f18712d) {
            return null;
        }
        if (r0Var != r0.REFRESH) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i14 = 0;
            int i15 = 0;
            while (i14 < this.f19255c.size()) {
                Iterator it2 = this.f19255c.iterator();
                int i16 = 0;
                while (it2.hasNext()) {
                    i16 += ((l2.b.c) it2.next()).f19078a.size();
                }
                if (i16 - i15 <= this.f19253a.f18712d) {
                    break;
                }
                int[] iArr = b.f19267a;
                if (iArr[r0Var.ordinal()] == 2) {
                    obj = this.f19255c.get(i14);
                } else {
                    ArrayList arrayList = this.f19255c;
                    obj = arrayList.get(h7.a.k(arrayList) - i14);
                }
                int size = ((l2.b.c) obj).f19078a.size();
                if (iArr[r0Var.ordinal()] == 2) {
                    i11 = j3Var.f19031a;
                } else {
                    i11 = j3Var.f19032b;
                }
                if ((i11 - i15) - size < this.f19253a.f18709a) {
                    break;
                }
                i15 += size;
                i14++;
            }
            if (i14 != 0) {
                int[] iArr2 = b.f19267a;
                if (iArr2[r0Var.ordinal()] == 2) {
                    k10 = -this.f19256d;
                } else {
                    k10 = (h7.a.k(this.f19255c) - this.f19256d) - (i14 - 1);
                }
                if (iArr2[r0Var.ordinal()] == 2) {
                    k11 = (i14 - 1) - this.f19256d;
                } else {
                    k11 = h7.a.k(this.f19255c) - this.f19256d;
                }
                boolean z11 = this.f19253a.f18710b;
                if (z11) {
                    if (r0Var == r0.PREPEND) {
                        i10 = d();
                    } else {
                        if (z11) {
                            i12 = this.f19258f;
                        }
                        i10 = i12;
                    }
                    i12 = i10 + i15;
                }
                aVar = new b1.a<>(r0Var, k10, k11, i12);
            }
            return aVar;
        }
        throw new IllegalArgumentException(gm.l.k(r0Var, "Drop LoadType must be PREPEND or APPEND, but got ").toString());
    }

    public final int d() {
        if (this.f19253a.f18710b) {
            return this.f19257e;
        }
        return 0;
    }

    public final boolean e(int i10, r0 r0Var, l2.b.c<Key, Value> cVar) {
        boolean z10;
        LinkedHashMap linkedHashMap;
        r0 r0Var2;
        int i11;
        gm.l.f(r0Var, "loadType");
        gm.l.f(cVar, "page");
        int ordinal = r0Var.ordinal();
        int i12 = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (!this.f19255c.isEmpty()) {
                        if (i10 != this.f19260h) {
                            return false;
                        }
                        this.f19254b.add(cVar);
                        int i13 = cVar.f19082e;
                        if (i13 == Integer.MIN_VALUE) {
                            if (this.f19253a.f18710b) {
                                i11 = this.f19258f;
                            } else {
                                i11 = 0;
                            }
                            i13 = i11 - cVar.f19078a.size();
                            if (i13 < 0) {
                                i13 = 0;
                            }
                        }
                        if (i13 != Integer.MIN_VALUE) {
                            i12 = i13;
                        }
                        this.f19258f = i12;
                        linkedHashMap = this.f19263k;
                        r0Var2 = r0.APPEND;
                    } else {
                        throw new IllegalStateException("should've received an init before append".toString());
                    }
                }
            } else if (!this.f19255c.isEmpty()) {
                if (i10 != this.f19259g) {
                    return false;
                }
                this.f19254b.add(0, cVar);
                this.f19256d++;
                int i14 = cVar.f19081d;
                if (i14 == Integer.MIN_VALUE && (i14 = d() - cVar.f19078a.size()) < 0) {
                    i14 = 0;
                }
                if (i14 != Integer.MIN_VALUE) {
                    i12 = i14;
                }
                this.f19257e = i12;
                linkedHashMap = this.f19263k;
                r0Var2 = r0.PREPEND;
            } else {
                throw new IllegalStateException("should've received an init before prepend".toString());
            }
            linkedHashMap.remove(r0Var2);
        } else if (this.f19255c.isEmpty()) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f19254b.add(cVar);
                this.f19256d = 0;
                int i15 = cVar.f19082e;
                if (i15 == Integer.MIN_VALUE) {
                    i15 = 0;
                }
                this.f19258f = i15;
                int i16 = cVar.f19081d;
                if (i16 != Integer.MIN_VALUE) {
                    i12 = i16;
                }
                this.f19257e = i12;
            } else {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
        } else {
            throw new IllegalStateException("cannot receive multiple init calls".toString());
        }
        return true;
    }

    public final b1.b f(l2.b.c cVar, r0 r0Var) {
        int i10;
        int i11;
        gm.l.f(cVar, "<this>");
        int ordinal = r0Var.ordinal();
        int i12 = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i10 = (this.f19255c.size() - this.f19256d) - 1;
                } else {
                    throw new qa.p();
                }
            } else {
                i10 = 0 - this.f19256d;
            }
        } else {
            i10 = 0;
        }
        List p10 = h7.a.p(new g3(i10, cVar.f19078a));
        int ordinal2 = r0Var.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 == 2) {
                    b1.b<Object> bVar = b1.b.f18732g;
                    if (this.f19253a.f18710b) {
                        i11 = this.f19258f;
                    } else {
                        i11 = 0;
                    }
                    return new b1.b(r0.APPEND, p10, -1, i11, this.f19264l.d(), null);
                }
                throw new qa.p();
            }
            b1.b<Object> bVar2 = b1.b.f18732g;
            return new b1.b(r0.PREPEND, p10, d(), -1, this.f19264l.d(), null);
        }
        b1.b<Object> bVar3 = b1.b.f18732g;
        int d10 = d();
        if (this.f19253a.f18710b) {
            i12 = this.f19258f;
        }
        return b1.b.a.a(p10, d10, i12, this.f19264l.d(), null);
    }
}
