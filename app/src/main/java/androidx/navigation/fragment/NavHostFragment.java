package androidx.navigation.fragment;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.fragment.app.r;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import gm.b;
import gm.l;
import i2.a0;
import i2.h0;
import i2.j;
import i2.j0;
import i2.k;
import i2.q;
import i2.z;
import j2.c;
import j2.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ul.g;

@Metadata
/* loaded from: classes.dex */
public class NavHostFragment extends r {

    /* renamed from: q0 */
    public static final /* synthetic */ int f2822q0 = 0;

    /* renamed from: l0 */
    public z f2823l0;

    /* renamed from: m0 */
    public Boolean f2824m0;

    /* renamed from: n0 */
    public View f2825n0;

    /* renamed from: o0 */
    public int f2826o0;

    /* renamed from: p0 */
    public boolean f2827p0;

    @Override // androidx.fragment.app.r
    public void A0(Context context) {
        l.f(context, "context");
        super.A0(context);
        if (this.f2827p0) {
            a aVar = new a(m0());
            aVar.k(this);
            aVar.d();
        }
    }

    @Override // androidx.fragment.app.r
    public void B0(Bundle bundle) {
        boolean z10;
        Bundle bundle2;
        v a02;
        Context V0 = V0();
        z zVar = new z(V0);
        this.f2823l0 = zVar;
        if (!l.a(this, zVar.f16334m)) {
            u uVar = zVar.f16334m;
            if (uVar != null && (a02 = uVar.a0()) != null) {
                a02.c(zVar.f16339r);
            }
            zVar.f16334m = this;
            this.Z.a(zVar.f16339r);
        }
        while (true) {
            if (!(V0 instanceof ContextWrapper)) {
                break;
            } else if (V0 instanceof androidx.activity.l) {
                z zVar2 = this.f2823l0;
                l.c(zVar2);
                OnBackPressedDispatcher b10 = ((androidx.activity.l) V0).b();
                l.e(b10, "context as OnBackPressed…).onBackPressedDispatcher");
                if (!l.a(b10, zVar2.f16335n)) {
                    u uVar2 = zVar2.f16334m;
                    if (uVar2 != null) {
                        Iterator<androidx.activity.a> it = zVar2.f16340s.f746b.iterator();
                        while (it.hasNext()) {
                            it.next().cancel();
                        }
                        zVar2.f16335n = b10;
                        b10.a(uVar2, zVar2.f16340s);
                        v a03 = uVar2.a0();
                        a03.c(zVar2.f16339r);
                        a03.a(zVar2.f16339r);
                    } else {
                        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
                    }
                }
            } else {
                V0 = ((ContextWrapper) V0).getBaseContext();
                l.e(V0, "context.baseContext");
            }
        }
        z zVar3 = this.f2823l0;
        l.c(zVar3);
        Boolean bool = this.f2824m0;
        int i10 = 0;
        if (bool != null && bool.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zVar3.f16341t = z10;
        zVar3.A();
        Bundle bundle3 = null;
        this.f2824m0 = null;
        z zVar4 = this.f2823l0;
        l.c(zVar4);
        x0 z11 = z();
        q qVar = zVar4.f16336o;
        q.a aVar = q.f16376e;
        if (!l.a(qVar, (q) new v0(z11, aVar, 0).a(q.class))) {
            if (zVar4.f16328g.isEmpty()) {
                zVar4.f16336o = (q) new v0(z11, aVar, 0).a(q.class);
            } else {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
            }
        }
        z zVar5 = this.f2823l0;
        l.c(zVar5);
        j0 j0Var = zVar5.f16342u;
        Context V02 = V0();
        androidx.fragment.app.j0 h02 = h0();
        l.e(h02, "childFragmentManager");
        j0Var.a(new c(V02, h02));
        j0 j0Var2 = zVar5.f16342u;
        Context V03 = V0();
        androidx.fragment.app.j0 h03 = h0();
        l.e(h03, "childFragmentManager");
        int i11 = this.f2538w;
        if (i11 == 0 || i11 == -1) {
            i11 = R.id.nav_host_fragment_container;
        }
        j0Var2.a(new d(V03, h03, i11));
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f2827p0 = true;
                a aVar2 = new a(m0());
                aVar2.k(this);
                aVar2.d();
            }
            this.f2826o0 = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            z zVar6 = this.f2823l0;
            l.c(zVar6);
            bundle2.setClassLoader(zVar6.f16322a.getClassLoader());
            zVar6.f16325d = bundle2.getBundle("android-support-nav:controller:navigatorState");
            zVar6.f16326e = bundle2.getParcelableArray("android-support-nav:controller:backStack");
            zVar6.f16333l.clear();
            int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
            if (intArray != null && stringArrayList != null) {
                int length = intArray.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    zVar6.f16332k.put(Integer.valueOf(intArray[i12]), stringArrayList.get(i13));
                    i12++;
                    i13++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle2.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                    if (parcelableArray != null) {
                        LinkedHashMap linkedHashMap = zVar6.f16333l;
                        l.e(str, "id");
                        g gVar = new g(parcelableArray.length);
                        b i14 = ih.v.i(parcelableArray);
                        while (i14.hasNext()) {
                            Parcelable parcelable = (Parcelable) i14.next();
                            if (parcelable != null) {
                                gVar.addLast((k) parcelable);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            }
                        }
                        linkedHashMap.put(str, gVar);
                    }
                }
            }
            zVar6.f16327f = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        if (this.f2826o0 != 0) {
            z zVar7 = this.f2823l0;
            l.c(zVar7);
            zVar7.w(this.f2826o0);
        } else {
            Bundle bundle4 = this.f2516f;
            if (bundle4 != null) {
                i10 = bundle4.getInt("android-support-nav:fragment:graphId");
            }
            if (bundle4 != null) {
                bundle3 = bundle4.getBundle("android-support-nav:fragment:startDestinationArgs");
            }
            if (i10 != 0) {
                z zVar8 = this.f2823l0;
                l.c(zVar8);
                zVar8.x(((a0) zVar8.B.getValue()).b(i10), bundle3);
            }
        }
        super.B0(bundle);
    }

    @Override // androidx.fragment.app.r
    public final View C0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.f(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        l.e(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i10 = this.f2538w;
        if (i10 == 0 || i10 == -1) {
            i10 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i10);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        View view = this.f2825n0;
        if (view != null && m6.c.a(view) == this.f2823l0) {
            view.setTag(androidx.navigation.R.id.nav_controller_view_tag, null);
        }
        this.f2825n0 = null;
    }

    @Override // androidx.fragment.app.r
    public final void H0(Context context, AttributeSet attributeSet, Bundle bundle) {
        l.f(context, "context");
        l.f(attributeSet, "attrs");
        super.H0(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.navigation.R.styleable.NavHost);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(androidx.navigation.R.styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.f2826o0 = resourceId;
        }
        tl.l lVar = tl.l.f28297a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.NavHostFragment);
        l.e(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(R.styleable.NavHostFragment_defaultNavHost, false)) {
            this.f2827p0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.r
    public final void J0(boolean z10) {
        z zVar = this.f2823l0;
        if (zVar != null) {
            zVar.f16341t = z10;
            zVar.A();
            return;
        }
        this.f2824m0 = Boolean.valueOf(z10);
    }

    @Override // androidx.fragment.app.r
    public final void L0(Bundle bundle) {
        Bundle bundle2;
        z zVar = this.f2823l0;
        l.c(zVar);
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry : ul.z.E(zVar.f16342u.f16309a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle h10 = ((h0) entry.getValue()).h();
            if (h10 != null) {
                arrayList.add(str);
                bundle3.putBundle(str, h10);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        } else {
            bundle2 = null;
        }
        if (!zVar.f16328g.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            g<j> gVar = zVar.f16328g;
            Parcelable[] parcelableArr = new Parcelable[gVar.f28874c];
            Iterator<j> it = gVar.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new k(it.next());
                i10++;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!zVar.f16332k.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            int[] iArr = new int[zVar.f16332k.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i11 = 0;
            for (Map.Entry entry2 : zVar.f16332k.entrySet()) {
                iArr[i11] = ((Number) entry2.getKey()).intValue();
                arrayList2.add((String) entry2.getValue());
                i11++;
            }
            bundle2.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle2.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!zVar.f16333l.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : zVar.f16333l.entrySet()) {
                String str2 = (String) entry3.getKey();
                g gVar2 = (g) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[gVar2.f28874c];
                Iterator<E> it2 = gVar2.iterator();
                int i12 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        parcelableArr2[i12] = (k) next;
                        i12 = i13;
                    } else {
                        h7.a.z();
                        throw null;
                    }
                }
                bundle2.putParcelableArray(a.b.b("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle2.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (zVar.f16327f) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", zVar.f16327f);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.f2827p0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i14 = this.f2826o0;
        if (i14 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i14);
        }
    }

    @Override // androidx.fragment.app.r
    public void O0(View view, Bundle bundle) {
        l.f(view, "view");
        if (view instanceof ViewGroup) {
            z zVar = this.f2823l0;
            int i10 = androidx.navigation.R.id.nav_controller_view_tag;
            view.setTag(i10, zVar);
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    View view2 = (View) parent;
                    this.f2825n0 = view2;
                    if (view2.getId() == this.f2538w) {
                        View view3 = this.f2825n0;
                        l.c(view3);
                        view3.setTag(i10, this.f2823l0);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }

    public final z c1() {
        z zVar = this.f2823l0;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()".toString());
    }
}
