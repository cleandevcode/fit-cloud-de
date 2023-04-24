package xl;

import a0.a2;
import fm.p;
import gm.l;
import gm.m;
import gm.z;
import java.io.Serializable;
import xl.f;

/* loaded from: classes2.dex */
public final class c implements f, Serializable {

    /* renamed from: a */
    public final f f30623a;

    /* renamed from: b */
    public final f.b f30624b;

    /* loaded from: classes2.dex */
    public static final class a implements Serializable {

        /* renamed from: a */
        public final f[] f30625a;

        public a(f[] fVarArr) {
            this.f30625a = fVarArr;
        }

        private final Object readResolve() {
            f[] fVarArr = this.f30625a;
            f fVar = g.f30632a;
            for (f fVar2 : fVarArr) {
                fVar = fVar.s(fVar2);
            }
            return fVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements p<String, f.b, String> {

        /* renamed from: b */
        public static final b f30626b = new b();

        public b() {
            super(2);
        }

        @Override // fm.p
        public final String A(String str, f.b bVar) {
            String str2 = str;
            f.b bVar2 = bVar;
            l.f(str2, "acc");
            l.f(bVar2, "element");
            if (str2.length() == 0) {
                return bVar2.toString();
            }
            return str2 + ", " + bVar2;
        }
    }

    /* renamed from: xl.c$c */
    /* loaded from: classes2.dex */
    public static final class C0562c extends m implements p<tl.l, f.b, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ f[] f30627b;

        /* renamed from: c */
        public final /* synthetic */ z f30628c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0562c(f[] fVarArr, z zVar) {
            super(2);
            this.f30627b = fVarArr;
            this.f30628c = zVar;
        }

        @Override // fm.p
        public final tl.l A(tl.l lVar, f.b bVar) {
            f.b bVar2 = bVar;
            l.f(lVar, "<anonymous parameter 0>");
            l.f(bVar2, "element");
            f[] fVarArr = this.f30627b;
            z zVar = this.f30628c;
            int i10 = zVar.f15508a;
            zVar.f15508a = i10 + 1;
            fVarArr[i10] = bVar2;
            return tl.l.f28297a;
        }
    }

    public c(f.b bVar, f fVar) {
        l.f(fVar, "left");
        l.f(bVar, "element");
        this.f30623a = fVar;
        this.f30624b = bVar;
    }

    private final Object writeReplace() {
        int c10 = c();
        f[] fVarArr = new f[c10];
        z zVar = new z();
        Z(tl.l.f28297a, new C0562c(fVarArr, zVar));
        if (zVar.f15508a == c10) {
            return new a(fVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // xl.f
    public final <R> R Z(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.A((Object) this.f30623a.Z(r10, pVar), this.f30624b);
    }

    @Override // xl.f
    public final <E extends f.b> E b(f.c<E> cVar) {
        l.f(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e10 = (E) cVar2.f30624b.b(cVar);
            if (e10 != null) {
                return e10;
            }
            f fVar = cVar2.f30623a;
            if (!(fVar instanceof c)) {
                return (E) fVar.b(cVar);
            }
            cVar2 = (c) fVar;
        }
    }

    public final int c() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            f fVar = cVar.f30623a;
            cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.c() != c()) {
                return false;
            }
            c cVar2 = this;
            while (true) {
                f.b bVar = cVar2.f30624b;
                if (!l.a(cVar.b(bVar.getKey()), bVar)) {
                    z10 = false;
                    break;
                }
                f fVar = cVar2.f30623a;
                if (fVar instanceof c) {
                    cVar2 = (c) fVar;
                } else {
                    l.d(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    f.b bVar2 = (f.b) fVar;
                    z10 = l.a(cVar.b(bVar2.getKey()), bVar2);
                    break;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f30624b.hashCode() + this.f30623a.hashCode();
    }

    @Override // xl.f
    public final f s(f fVar) {
        return f.a.a(this, fVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        return a2.a(sb2, (String) Z("", b.f30626b), ']');
    }

    @Override // xl.f
    public final f y(f.c<?> cVar) {
        l.f(cVar, "key");
        if (this.f30624b.b(cVar) != null) {
            return this.f30623a;
        }
        f y10 = this.f30623a.y(cVar);
        return y10 == this.f30623a ? this : y10 == g.f30632a ? this.f30624b : new c(this.f30624b, y10);
    }
}
