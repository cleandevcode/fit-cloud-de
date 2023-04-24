package i2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.common.R;
import i2.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class x extends v implements Iterable<v>, hm.a {

    /* renamed from: o */
    public static final /* synthetic */ int f16417o = 0;

    /* renamed from: k */
    public final o0.i<v> f16418k;

    /* renamed from: l */
    public int f16419l;

    /* renamed from: m */
    public String f16420m;

    /* renamed from: n */
    public String f16421n;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: i2.x$a$a */
        /* loaded from: classes.dex */
        public static final class C0290a extends gm.m implements fm.l<v, v> {

            /* renamed from: b */
            public static final C0290a f16422b = new C0290a();

            public C0290a() {
                super(1);
            }

            @Override // fm.l
            public final v k(v vVar) {
                v vVar2 = vVar;
                gm.l.f(vVar2, "it");
                if (vVar2 instanceof x) {
                    x xVar = (x) vVar2;
                    return xVar.q(xVar.f16419l, true);
                }
                return null;
            }
        }

        public static v a(x xVar) {
            Object next;
            gm.l.f(xVar, "<this>");
            Iterator it = nm.j.H(xVar.q(xVar.f16419l, true), C0290a.f16422b).iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                return (v) next;
            }
            throw new NoSuchElementException("Sequence is empty.");
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Iterator<v>, hm.a {

        /* renamed from: a */
        public int f16423a = -1;

        /* renamed from: b */
        public boolean f16424b;

        public b() {
            x.this = r1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f16423a + 1 < x.this.f16418k.f()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final v next() {
            if (hasNext()) {
                this.f16424b = true;
                o0.i<v> iVar = x.this.f16418k;
                int i10 = this.f16423a + 1;
                this.f16423a = i10;
                v g10 = iVar.g(i10);
                gm.l.e(g10, "nodes.valueAt(++index)");
                return g10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.f16424b) {
                o0.i<v> iVar = x.this.f16418k;
                iVar.g(this.f16423a).f16404b = null;
                int i10 = this.f16423a;
                Object[] objArr = iVar.f22556c;
                Object obj = objArr[i10];
                Object obj2 = o0.i.f22553e;
                if (obj != obj2) {
                    objArr[i10] = obj2;
                    iVar.f22554a = true;
                }
                this.f16423a = i10 - 1;
                this.f16424b = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(h0<? extends x> h0Var) {
        super(h0Var);
        gm.l.f(h0Var, "navGraphNavigator");
        this.f16418k = new o0.i<>();
    }

    @Override // i2.v
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof x)) {
            ArrayList I = nm.n.I(nm.j.G(o0.k.a(this.f16418k)));
            x xVar = (x) obj;
            o0.j a10 = o0.k.a(xVar.f16418k);
            while (a10.hasNext()) {
                I.remove((v) a10.next());
            }
            if (super.equals(obj) && this.f16418k.f() == xVar.f16418k.f() && this.f16419l == xVar.f16419l && I.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // i2.v
    public final int hashCode() {
        int i10 = this.f16419l;
        o0.i<v> iVar = this.f16418k;
        int f10 = iVar.f();
        for (int i11 = 0; i11 < f10; i11++) {
            if (iVar.f22554a) {
                iVar.c();
            }
            i10 = (((i10 * 31) + iVar.f22555b[i11]) * 31) + iVar.g(i11).hashCode();
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator<v> iterator() {
        return new b();
    }

    @Override // i2.v
    public final v.b n(j4.j jVar) {
        v.b n10 = super.n(jVar);
        ArrayList arrayList = new ArrayList();
        b bVar = new b();
        while (bVar.hasNext()) {
            v.b n11 = ((v) bVar.next()).n(jVar);
            if (n11 != null) {
                arrayList.add(n11);
            }
        }
        return (v.b) ul.q.P(ul.i.A(new v.b[]{n10, (v.b) ul.q.P(arrayList)}));
    }

    @Override // i2.v
    public final void o(Context context, AttributeSet attributeSet) {
        boolean z10;
        String valueOf;
        gm.l.f(context, "context");
        super.o(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.NavGraphNavigator);
        gm.l.e(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        int resourceId = obtainAttributes.getResourceId(R.styleable.NavGraphNavigator_startDestination, 0);
        if (resourceId != this.f16410h) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f16421n != null) {
                this.f16419l = 0;
                this.f16421n = null;
            }
            this.f16419l = resourceId;
            this.f16420m = null;
            if (resourceId <= 16777215) {
                valueOf = String.valueOf(resourceId);
            } else {
                try {
                    valueOf = context.getResources().getResourceName(resourceId);
                } catch (Resources.NotFoundException unused) {
                    valueOf = String.valueOf(resourceId);
                }
                gm.l.e(valueOf, "try {\n                co….toString()\n            }");
            }
            this.f16420m = valueOf;
            tl.l lVar = tl.l.f28297a;
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
    }

    public final void p(v vVar) {
        boolean z10;
        boolean z11;
        gm.l.f(vVar, "node");
        int i10 = vVar.f16410h;
        String str = vVar.f16411i;
        boolean z12 = false;
        if (i10 == 0 && str == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            String str2 = this.f16411i;
            if (str2 != null && !(!gm.l.a(str, str2))) {
                throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same route as graph " + this).toString());
            }
            if (i10 != this.f16410h) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                v vVar2 = (v) this.f16418k.d(i10, null);
                if (vVar2 == vVar) {
                    return;
                }
                if (vVar.f16404b == null) {
                    z12 = true;
                }
                if (z12) {
                    if (vVar2 != null) {
                        vVar2.f16404b = null;
                    }
                    vVar.f16404b = this;
                    this.f16418k.e(vVar.f16410h, vVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
            }
            throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same id as graph " + this).toString());
        }
        throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
    }

    public final v q(int i10, boolean z10) {
        x xVar;
        v vVar = (v) this.f16418k.d(i10, null);
        if (vVar == null) {
            if (!z10 || (xVar = this.f16404b) == null) {
                return null;
            }
            return xVar.q(i10, true);
        }
        return vVar;
    }

    public final v r(String str, boolean z10) {
        x xVar;
        boolean z11;
        gm.l.f(str, "route");
        v vVar = (v) this.f16418k.d(("android-app://androidx.navigation/" + str).hashCode(), null);
        if (vVar == null) {
            if (!z10 || (xVar = this.f16404b) == null) {
                return null;
            }
            if (om.h.W(str)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return null;
            }
            return xVar.r(str, true);
        }
        return vVar;
    }

    @Override // i2.v
    public final String toString() {
        boolean z10;
        v vVar;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        String str2 = this.f16421n;
        if (str2 != null && !om.h.W(str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            vVar = r(str2, true);
        } else {
            vVar = null;
        }
        if (vVar == null) {
            vVar = q(this.f16419l, true);
        }
        sb2.append(" startDestination=");
        if (vVar == null) {
            str = this.f16421n;
            if (str == null && (str = this.f16420m) == null) {
                StringBuilder a10 = android.support.v4.media.d.a("0x");
                a10.append(Integer.toHexString(this.f16419l));
                str = a10.toString();
            }
        } else {
            sb2.append("{");
            sb2.append(vVar.toString());
            str = "}";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        gm.l.e(sb3, "sb.toString()");
        return sb3;
    }
}
