package j2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.activity.e;
import androidx.fragment.app.c0;
import androidx.fragment.app.j0;
import androidx.fragment.app.n0;
import androidx.fragment.app.o;
import androidx.fragment.app.r;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.navigation.fragment.R;
import gm.e0;
import gm.l;
import i2.b0;
import i2.h0;
import i2.j;
import i2.m;
import i2.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import ul.q;

@h0.b("dialog")
@Metadata
/* loaded from: classes.dex */
public final class c extends h0<a> {

    /* renamed from: c */
    public final Context f17264c;

    /* renamed from: d */
    public final j0 f17265d;

    /* renamed from: e */
    public final LinkedHashSet f17266e = new LinkedHashSet();

    /* renamed from: f */
    public final b f17267f = new s() { // from class: j2.b
        @Override // androidx.lifecycle.s
        public final void d(u uVar, k.b bVar) {
            Object obj;
            boolean z10;
            c cVar = c.this;
            l.f(cVar, "this$0");
            if (bVar == k.b.ON_CREATE) {
                o oVar = (o) uVar;
                Iterable<j> iterable = (Iterable) cVar.b().f16318e.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (j jVar : iterable) {
                        if (l.a(jVar.f16298f, oVar.f2540y)) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                    oVar.c1(false, false);
                }
            } else if (bVar == k.b.ON_STOP) {
                o oVar2 = (o) uVar;
                if (!oVar2.e1().isShowing()) {
                    List list = (List) cVar.b().f16318e.getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            if (l.a(((j) obj).f16298f, oVar2.f2540y)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (obj != null) {
                        j jVar2 = (j) obj;
                        if (!l.a(q.O(list), jVar2)) {
                            Log.i("DialogFragmentNavigator", "Dialog " + oVar2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                        }
                        cVar.i(jVar2, false);
                        return;
                    }
                    throw new IllegalStateException(("Dialog " + oVar2 + " has already been popped off of the Navigation back stack").toString());
                }
            }
        }
    };

    /* loaded from: classes.dex */
    public static class a extends v implements i2.d {

        /* renamed from: k */
        public String f17268k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0<? extends a> h0Var) {
            super(h0Var);
            l.f(h0Var, "fragmentNavigator");
        }

        @Override // i2.v
        public final boolean equals(Object obj) {
            return obj != null && (obj instanceof a) && super.equals(obj) && l.a(this.f17268k, ((a) obj).f17268k);
        }

        @Override // i2.v
        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.f17268k;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // i2.v
        public final void o(Context context, AttributeSet attributeSet) {
            l.f(context, "context");
            super.o(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.DialogFragmentNavigator);
            l.e(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = obtainAttributes.getString(R.styleable.DialogFragmentNavigator_android_name);
            if (string != null) {
                this.f17268k = string;
            }
            obtainAttributes.recycle();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [j2.b] */
    public c(Context context, j0 j0Var) {
        this.f17264c = context;
        this.f17265d = j0Var;
    }

    @Override // i2.h0
    public final a a() {
        return new a(this);
    }

    @Override // i2.h0
    public final void d(List list, b0 b0Var) {
        if (this.f17265d.O()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            a aVar = (a) jVar.f16294b;
            String str = aVar.f17268k;
            if (str != null) {
                if (str.charAt(0) == '.') {
                    str = this.f17264c.getPackageName() + str;
                }
                c0 G = this.f17265d.G();
                this.f17264c.getClassLoader();
                r a10 = G.a(str);
                l.e(a10, "fragmentManager.fragment…ader, className\n        )");
                if (o.class.isAssignableFrom(a10.getClass())) {
                    o oVar = (o) a10;
                    oVar.Z0(jVar.f16295c);
                    oVar.Z.a(this.f17267f);
                    oVar.h1(this.f17265d, jVar.f16298f);
                    b().d(jVar);
                } else {
                    StringBuilder a11 = android.support.v4.media.d.a("Dialog destination ");
                    String str2 = aVar.f17268k;
                    if (str2 != null) {
                        throw new IllegalArgumentException(e.b(a11, str2, " is not an instance of DialogFragment").toString());
                    }
                    throw new IllegalStateException("DialogFragment class was not set".toString());
                }
            } else {
                throw new IllegalStateException("DialogFragment class was not set".toString());
            }
        }
    }

    @Override // i2.h0
    public final void e(m.a aVar) {
        androidx.lifecycle.v vVar;
        super.e(aVar);
        for (j jVar : (List) aVar.f16318e.getValue()) {
            o oVar = (o) this.f17265d.E(jVar.f16298f);
            if (oVar != null && (vVar = oVar.Z) != null) {
                vVar.a(this.f17267f);
            } else {
                this.f17266e.add(jVar.f16298f);
            }
        }
        this.f17265d.b(new n0() { // from class: j2.a
            @Override // androidx.fragment.app.n0
            public final void f(j0 j0Var, r rVar) {
                c cVar = c.this;
                l.f(cVar, "this$0");
                LinkedHashSet linkedHashSet = cVar.f17266e;
                String str = rVar.f2540y;
                e0.a(linkedHashSet);
                if (linkedHashSet.remove(str)) {
                    rVar.Z.a(cVar.f17267f);
                }
            }
        });
    }

    @Override // i2.h0
    public final void i(j jVar, boolean z10) {
        l.f(jVar, "popUpTo");
        if (this.f17265d.O()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().f16318e.getValue();
        for (j jVar2 : q.S(list.subList(list.indexOf(jVar), list.size()))) {
            r E = this.f17265d.E(jVar2.f16298f);
            if (E != null) {
                E.Z.c(this.f17267f);
                ((o) E).c1(false, false);
            }
        }
        b().c(jVar, z10);
    }
}
