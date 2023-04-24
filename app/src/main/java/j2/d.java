package j2;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.c0;
import androidx.fragment.app.j0;
import androidx.fragment.app.r;
import androidx.navigation.fragment.R;
import gm.l;
import i2.b0;
import i2.h0;
import i2.j;
import i2.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import tl.f;
import ul.n;
import ul.q;

@h0.b("fragment")
@Metadata
/* loaded from: classes.dex */
public class d extends h0<a> {

    /* renamed from: c */
    public final Context f17269c;

    /* renamed from: d */
    public final j0 f17270d;

    /* renamed from: e */
    public final int f17271e;

    /* renamed from: f */
    public final LinkedHashSet f17272f = new LinkedHashSet();

    /* loaded from: classes.dex */
    public static class a extends v {

        /* renamed from: k */
        public String f17273k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0<? extends a> h0Var) {
            super(h0Var);
            l.f(h0Var, "fragmentNavigator");
        }

        @Override // i2.v
        public final boolean equals(Object obj) {
            return obj != null && (obj instanceof a) && super.equals(obj) && l.a(this.f17273k, ((a) obj).f17273k);
        }

        @Override // i2.v
        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.f17273k;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // i2.v
        public final void o(Context context, AttributeSet attributeSet) {
            l.f(context, "context");
            super.o(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.FragmentNavigator);
            l.e(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = obtainAttributes.getString(R.styleable.FragmentNavigator_android_name);
            if (string != null) {
                this.f17273k = string;
            }
            tl.l lVar = tl.l.f28297a;
            obtainAttributes.recycle();
        }

        @Override // i2.v
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.f17273k;
            if (str == null) {
                str = "null";
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            l.e(sb3, "sb.toString()");
            return sb3;
        }
    }

    public d(Context context, j0 j0Var, int i10) {
        this.f17269c = context;
        this.f17270d = j0Var;
        this.f17271e = i10;
    }

    @Override // i2.h0
    public final a a() {
        return new a(this);
    }

    @Override // i2.h0
    public final void d(List list, b0 b0Var) {
        boolean z10;
        if (this.f17270d.O()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            boolean isEmpty = ((List) b().f16318e.getValue()).isEmpty();
            if (b0Var != null && !isEmpty && b0Var.f16232b && this.f17272f.remove(jVar.f16298f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j0 j0Var = this.f17270d;
                String str = jVar.f16298f;
                j0Var.getClass();
                j0Var.w(new j0.p(str), false);
            } else {
                androidx.fragment.app.a k10 = k(jVar, b0Var);
                if (!isEmpty) {
                    String str2 = jVar.f16298f;
                    if (k10.f2570h) {
                        k10.f2569g = true;
                        k10.f2571i = str2;
                    } else {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                }
                k10.d();
            }
            b().d(jVar);
        }
    }

    @Override // i2.h0
    public final void f(j jVar) {
        if (this.f17270d.O()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.a k10 = k(jVar, null);
        if (((List) b().f16318e.getValue()).size() > 1) {
            j0 j0Var = this.f17270d;
            String str = jVar.f16298f;
            j0Var.getClass();
            j0Var.w(new j0.o(str, -1), false);
            String str2 = jVar.f16298f;
            if (k10.f2570h) {
                k10.f2569g = true;
                k10.f2571i = str2;
            } else {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
        }
        k10.d();
        b().b(jVar);
    }

    @Override // i2.h0
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.f17272f.clear();
            n.D(stringArrayList, this.f17272f);
        }
    }

    @Override // i2.h0
    public final Bundle h() {
        if (this.f17272f.isEmpty()) {
            return null;
        }
        return tb.a.e(new f("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.f17272f)));
    }

    @Override // i2.h0
    public final void i(j jVar, boolean z10) {
        l.f(jVar, "popUpTo");
        if (this.f17270d.O()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        if (z10) {
            List list = (List) b().f16318e.getValue();
            j jVar2 = (j) q.H(list);
            for (j jVar3 : q.S(list.subList(list.indexOf(jVar), list.size()))) {
                if (l.a(jVar3, jVar2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + jVar3);
                } else {
                    j0 j0Var = this.f17270d;
                    String str = jVar3.f16298f;
                    j0Var.getClass();
                    j0Var.w(new j0.q(str), false);
                    this.f17272f.add(jVar3.f16298f);
                }
            }
        } else {
            j0 j0Var2 = this.f17270d;
            String str2 = jVar.f16298f;
            j0Var2.getClass();
            j0Var2.w(new j0.o(str2, -1), false);
        }
        b().c(jVar, z10);
    }

    public final androidx.fragment.app.a k(j jVar, b0 b0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        Bundle bundle = jVar.f16295c;
        String str = ((a) jVar.f16294b).f17273k;
        if (str != null) {
            int i14 = 0;
            if (str.charAt(0) == '.') {
                str = this.f17269c.getPackageName() + str;
            }
            c0 G = this.f17270d.G();
            this.f17269c.getClassLoader();
            r a10 = G.a(str);
            l.e(a10, "fragmentManager.fragment…t.classLoader, className)");
            a10.Z0(bundle);
            j0 j0Var = this.f17270d;
            j0Var.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var);
            if (b0Var != null) {
                i10 = b0Var.f16236f;
            } else {
                i10 = -1;
            }
            if (b0Var != null) {
                i11 = b0Var.f16237g;
            } else {
                i11 = -1;
            }
            if (b0Var != null) {
                i12 = b0Var.f16238h;
            } else {
                i12 = -1;
            }
            if (b0Var != null) {
                i13 = b0Var.f16239i;
            } else {
                i13 = -1;
            }
            if (i10 != -1 || i11 != -1 || i12 != -1 || i13 != -1) {
                if (i10 == -1) {
                    i10 = 0;
                }
                if (i11 == -1) {
                    i11 = 0;
                }
                if (i12 == -1) {
                    i12 = 0;
                }
                if (i13 != -1) {
                    i14 = i13;
                }
                aVar.f2564b = i10;
                aVar.f2565c = i11;
                aVar.f2566d = i12;
                aVar.f2567e = i14;
            }
            int i15 = this.f17271e;
            if (i15 != 0) {
                aVar.g(i15, a10, null, 2);
                aVar.k(a10);
                aVar.f2578p = true;
                return aVar;
            }
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        throw new IllegalStateException("Fragment class was not set".toString());
    }
}
