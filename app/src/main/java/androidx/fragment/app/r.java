package androidx.fragment.app;

import a2.b;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.j0;
import androidx.lifecycle.k;
import androidx.lifecycle.runtime.R;
import androidx.lifecycle.v0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import y0.a;

/* loaded from: classes.dex */
public class r implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.u, androidx.lifecycle.y0, androidx.lifecycle.i, q2.c {

    /* renamed from: k0 */
    public static final Object f2507k0 = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public ViewGroup F;
    public View H;
    public boolean L;
    public boolean M;
    public c Q;
    public boolean U;
    public LayoutInflater V;
    public boolean W;
    public String X;
    public k.c Y;
    public androidx.lifecycle.v Z;

    /* renamed from: a */
    public int f2508a;

    /* renamed from: b */
    public Bundle f2509b;

    /* renamed from: c */
    public SparseArray<Parcelable> f2510c;

    /* renamed from: c0 */
    public a1 f2511c0;

    /* renamed from: d */
    public Bundle f2512d;

    /* renamed from: d0 */
    public androidx.lifecycle.a0<androidx.lifecycle.u> f2513d0;

    /* renamed from: e */
    public String f2514e;

    /* renamed from: e0 */
    public androidx.lifecycle.p0 f2515e0;

    /* renamed from: f */
    public Bundle f2516f;

    /* renamed from: f0 */
    public q2.b f2517f0;

    /* renamed from: g */
    public r f2518g;

    /* renamed from: g0 */
    public int f2519g0;

    /* renamed from: h */
    public String f2520h;

    /* renamed from: h0 */
    public final AtomicInteger f2521h0;

    /* renamed from: i */
    public int f2522i;

    /* renamed from: i0 */
    public final ArrayList<e> f2523i0;

    /* renamed from: j */
    public Boolean f2524j;

    /* renamed from: j0 */
    public final a f2525j0;

    /* renamed from: k */
    public boolean f2526k;

    /* renamed from: l */
    public boolean f2527l;

    /* renamed from: m */
    public boolean f2528m;

    /* renamed from: n */
    public boolean f2529n;

    /* renamed from: o */
    public boolean f2530o;

    /* renamed from: p */
    public boolean f2531p;

    /* renamed from: q */
    public boolean f2532q;

    /* renamed from: r */
    public int f2533r;

    /* renamed from: s */
    public j0 f2534s;

    /* renamed from: t */
    public d0<?> f2535t;

    /* renamed from: u */
    public k0 f2536u;

    /* renamed from: v */
    public r f2537v;

    /* renamed from: w */
    public int f2538w;

    /* renamed from: x */
    public int f2539x;

    /* renamed from: y */
    public String f2540y;

    /* renamed from: z */
    public boolean f2541z;

    /* loaded from: classes.dex */
    public class a extends e {
        public a() {
            r.this = r1;
        }

        @Override // androidx.fragment.app.r.e
        public final void a() {
            r.this.f2517f0.a();
            androidx.lifecycle.m0.b(r.this);
        }
    }

    /* loaded from: classes.dex */
    public class b extends a0 {
        public b() {
            r.this = r1;
        }

        @Override // androidx.fragment.app.a0
        public final View u(int i10) {
            View view = r.this.H;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException(n.a(android.support.v4.media.d.a("Fragment "), r.this, " does not have a view"));
        }

        @Override // androidx.fragment.app.a0
        public final boolean x() {
            return r.this.H != null;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public boolean f2544a;

        /* renamed from: b */
        public int f2545b;

        /* renamed from: c */
        public int f2546c;

        /* renamed from: d */
        public int f2547d;

        /* renamed from: e */
        public int f2548e;

        /* renamed from: f */
        public int f2549f;

        /* renamed from: g */
        public ArrayList<String> f2550g;

        /* renamed from: h */
        public ArrayList<String> f2551h;

        /* renamed from: i */
        public Object f2552i;

        /* renamed from: j */
        public Object f2553j;

        /* renamed from: k */
        public Object f2554k;

        /* renamed from: l */
        public float f2555l;

        /* renamed from: m */
        public View f2556m;

        public c() {
            Object obj = r.f2507k0;
            this.f2552i = obj;
            this.f2553j = obj;
            this.f2554k = obj;
            this.f2555l = 1.0f;
            this.f2556m = null;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends RuntimeException {
        public d(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public abstract void a();
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a */
        public final Bundle f2557a;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new f[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }
        }

        public f(Bundle bundle) {
            this.f2557a = bundle;
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f2557a = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f2557a);
        }
    }

    public r() {
        this.f2508a = -1;
        this.f2514e = UUID.randomUUID().toString();
        this.f2520h = null;
        this.f2524j = null;
        this.f2536u = new k0();
        this.D = true;
        this.M = true;
        this.Y = k.c.RESUMED;
        this.f2513d0 = new androidx.lifecycle.a0<>();
        this.f2521h0 = new AtomicInteger();
        this.f2523i0 = new ArrayList<>();
        this.f2525j0 = new a();
        r0();
    }

    public r(int i10) {
        this();
        this.f2519g0 = i10;
    }

    public void A0(Context context) {
        Activity activity;
        this.E = true;
        d0<?> d0Var = this.f2535t;
        if (d0Var == null) {
            activity = null;
        } else {
            activity = d0Var.f2339a;
        }
        if (activity != null) {
            this.E = false;
            z0(activity);
        }
    }

    public void B0(Bundle bundle) {
        boolean z10;
        Parcelable parcelable;
        this.E = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f2536u.W(parcelable);
            k0 k0Var = this.f2536u;
            k0Var.F = false;
            k0Var.G = false;
            k0Var.M.f2465i = false;
            k0Var.u(1);
        }
        k0 k0Var2 = this.f2536u;
        if (k0Var2.f2412t >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            k0Var2.F = false;
            k0Var2.G = false;
            k0Var2.M.f2465i = false;
            k0Var2.u(1);
        }
    }

    @Override // q2.c
    public final q2.a C() {
        return this.f2517f0.f24512b;
    }

    public View C0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f2519g0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    @Deprecated
    public final void D(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        if (this.f2535t != null) {
            j0 m02 = m0();
            if (m02.A != null) {
                m02.D.addLast(new j0.l(this.f2514e, i10));
                m02.A.b(intent);
                return;
            }
            d0<?> d0Var = m02.f2413u;
            if (i10 == -1) {
                Context context = d0Var.f2340b;
                Object obj = y0.a.f30807a;
                a.C0565a.b(context, intent, null);
                return;
            }
            d0Var.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(p.a("Fragment ", this, " not attached to Activity"));
    }

    public void D0() {
        this.E = true;
    }

    public void E0() {
        this.E = true;
    }

    public void F0() {
        this.E = true;
    }

    public LayoutInflater G0(Bundle bundle) {
        d0<?> d0Var = this.f2535t;
        if (d0Var != null) {
            LayoutInflater J = d0Var.J();
            J.setFactory2(this.f2536u.f2398f);
            return J;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void H0(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.E = true;
        d0<?> d0Var = this.f2535t;
        if (d0Var == null) {
            activity = null;
        } else {
            activity = d0Var.f2339a;
        }
        if (activity != null) {
            this.E = true;
        }
    }

    public void I0() {
        this.E = true;
    }

    public void J0(boolean z10) {
    }

    public void K0() {
        this.E = true;
    }

    public void L0(Bundle bundle) {
    }

    public void M0() {
        this.E = true;
    }

    public void N0() {
        this.E = true;
    }

    public void O0(View view, Bundle bundle) {
    }

    public void P0(Bundle bundle) {
        this.E = true;
    }

    public void Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2536u.Q();
        boolean z10 = true;
        this.f2532q = true;
        this.f2511c0 = new a1(this, z());
        View C0 = C0(layoutInflater, viewGroup, bundle);
        this.H = C0;
        if (C0 != null) {
            this.f2511c0.d();
            this.H.setTag(R.id.view_tree_lifecycle_owner, this.f2511c0);
            this.H.setTag(androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner, this.f2511c0);
            View view = this.H;
            a1 a1Var = this.f2511c0;
            gm.l.f(view, "<this>");
            view.setTag(androidx.savedstate.R.id.view_tree_saved_state_registry_owner, a1Var);
            this.f2513d0.j(this.f2511c0);
            return;
        }
        if (this.f2511c0.f2313d == null) {
            z10 = false;
        }
        if (!z10) {
            this.f2511c0 = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final q R0(androidx.activity.result.b bVar, e.a aVar) {
        s sVar = new s(this);
        if (this.f2508a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            S0(new t(this, sVar, atomicReference, aVar, bVar));
            return new q(atomicReference);
        }
        throw new IllegalStateException(p.a("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    public final void S0(e eVar) {
        if (this.f2508a >= 0) {
            eVar.a();
        } else {
            this.f2523i0.add(eVar);
        }
    }

    public final x T0() {
        x f02 = f0();
        if (f02 != null) {
            return f02;
        }
        throw new IllegalStateException(p.a("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle U0() {
        Bundle bundle = this.f2516f;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(p.a("Fragment ", this, " does not have any arguments."));
    }

    public final Context V0() {
        Context i02 = i0();
        if (i02 != null) {
            return i02;
        }
        throw new IllegalStateException(p.a("Fragment ", this, " not attached to a context."));
    }

    public final r W0() {
        r rVar = this.f2537v;
        if (rVar == null) {
            if (i0() == null) {
                throw new IllegalStateException(p.a("Fragment ", this, " is not attached to any Fragment or host"));
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + i0());
        }
        return rVar;
    }

    public final View X0() {
        View view = this.H;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(p.a("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void Y0(int i10, int i11, int i12, int i13) {
        if (this.Q == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        e0().f2545b = i10;
        e0().f2546c = i11;
        e0().f2547d = i12;
        e0().f2548e = i13;
    }

    public void Z0(Bundle bundle) {
        boolean O;
        j0 j0Var = this.f2534s;
        if (j0Var != null) {
            if (j0Var == null) {
                O = false;
            } else {
                O = j0Var.O();
            }
            if (O) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f2516f = bundle;
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.v a0() {
        return this.Z;
    }

    @Deprecated
    public final void a1() {
        b.c cVar = a2.b.f241a;
        a2.f fVar = new a2.f(this);
        a2.b.c(fVar);
        b.c a10 = a2.b.a(this);
        if (a10.f250a.contains(b.a.DETECT_RETAIN_INSTANCE_USAGE) && a2.b.f(a10, getClass(), a2.f.class)) {
            a2.b.b(a10, fVar);
        }
        this.B = true;
        j0 j0Var = this.f2534s;
        if (j0Var != null) {
            j0Var.M.e(this);
        } else {
            this.C = true;
        }
    }

    public final void b1(@SuppressLint({"UnknownNullness"}) Intent intent) {
        d0<?> d0Var = this.f2535t;
        if (d0Var != null) {
            Context context = d0Var.f2340b;
            Object obj = y0.a.f30807a;
            a.C0565a.b(context, intent, null);
            return;
        }
        throw new IllegalStateException(p.a("Fragment ", this, " not attached to Activity"));
    }

    public a0 c0() {
        return new b();
    }

    public void d0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2538w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2539x));
        printWriter.print(" mTag=");
        printWriter.println(this.f2540y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2508a);
        printWriter.print(" mWho=");
        printWriter.print(this.f2514e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2533r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2526k);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2527l);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2529n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2530o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f2541z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.D);
        printWriter.print(" mHasMenu=");
        int i17 = 0;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.M);
        if (this.f2534s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2534s);
        }
        if (this.f2535t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2535t);
        }
        if (this.f2537v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2537v);
        }
        if (this.f2516f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2516f);
        }
        if (this.f2509b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2509b);
        }
        if (this.f2510c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2510c);
        }
        if (this.f2512d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2512d);
        }
        r rVar = this.f2518g;
        if (rVar == null) {
            j0 j0Var = this.f2534s;
            if (j0Var != null && (str2 = this.f2520h) != null) {
                rVar = j0Var.B(str2);
            } else {
                rVar = null;
            }
        }
        if (rVar != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(rVar);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2522i);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        c cVar = this.Q;
        if (cVar == null) {
            z10 = false;
        } else {
            z10 = cVar.f2544a;
        }
        printWriter.println(z10);
        c cVar2 = this.Q;
        if (cVar2 == null) {
            i10 = 0;
        } else {
            i10 = cVar2.f2545b;
        }
        if (i10 != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            c cVar3 = this.Q;
            if (cVar3 == null) {
                i16 = 0;
            } else {
                i16 = cVar3.f2545b;
            }
            printWriter.println(i16);
        }
        c cVar4 = this.Q;
        if (cVar4 == null) {
            i11 = 0;
        } else {
            i11 = cVar4.f2546c;
        }
        if (i11 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            c cVar5 = this.Q;
            if (cVar5 == null) {
                i15 = 0;
            } else {
                i15 = cVar5.f2546c;
            }
            printWriter.println(i15);
        }
        c cVar6 = this.Q;
        if (cVar6 == null) {
            i12 = 0;
        } else {
            i12 = cVar6.f2547d;
        }
        if (i12 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            c cVar7 = this.Q;
            if (cVar7 == null) {
                i14 = 0;
            } else {
                i14 = cVar7.f2547d;
            }
            printWriter.println(i14);
        }
        c cVar8 = this.Q;
        if (cVar8 == null) {
            i13 = 0;
        } else {
            i13 = cVar8.f2548e;
        }
        if (i13 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            c cVar9 = this.Q;
            if (cVar9 != null) {
                i17 = cVar9.f2548e;
            }
            printWriter.println(i17);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.F);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        if (i0() != null) {
            e2.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2536u + ":");
        this.f2536u.v(a.b.b(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final c e0() {
        if (this.Q == null) {
            this.Q = new c();
        }
        return this.Q;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final x f0() {
        d0<?> d0Var = this.f2535t;
        if (d0Var == null) {
            return null;
        }
        return (x) d0Var.f2339a;
    }

    public final Bundle g0() {
        return this.f2516f;
    }

    public final j0 h0() {
        if (this.f2535t != null) {
            return this.f2536u;
        }
        throw new IllegalStateException(p.a("Fragment ", this, " has not been attached yet."));
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public Context i0() {
        d0<?> d0Var = this.f2535t;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f2340b;
    }

    public final Object j0() {
        d0<?> d0Var = this.f2535t;
        if (d0Var == null) {
            return null;
        }
        return d0Var.I();
    }

    public final LayoutInflater k0() {
        LayoutInflater layoutInflater = this.V;
        if (layoutInflater == null) {
            LayoutInflater G0 = G0(null);
            this.V = G0;
            return G0;
        }
        return layoutInflater;
    }

    public final int l0() {
        k.c cVar = this.Y;
        return (cVar == k.c.INITIALIZED || this.f2537v == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.f2537v.l0());
    }

    public final j0 m0() {
        j0 j0Var = this.f2534s;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException(p.a("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources n0() {
        return V0().getResources();
    }

    public final String o0(int i10) {
        return n0().getString(i10);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.E = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        T0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.E = true;
    }

    public final String p0(int i10, Object... objArr) {
        return n0().getString(i10, objArr);
    }

    public final a1 q0() {
        a1 a1Var = this.f2511c0;
        if (a1Var != null) {
            return a1Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public v0.b r() {
        if (this.f2534s != null) {
            if (this.f2515e0 == null) {
                Application application = null;
                Context applicationContext = V0().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && j0.J(3)) {
                    StringBuilder a10 = android.support.v4.media.d.a("Could not find Application instance from Context ");
                    a10.append(V0().getApplicationContext());
                    a10.append(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                    Log.d("FragmentManager", a10.toString());
                }
                this.f2515e0 = new androidx.lifecycle.p0(application, this, this.f2516f);
            }
            return this.f2515e0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final void r0() {
        this.Z = new androidx.lifecycle.v(this);
        this.f2517f0 = new q2.b(this);
        this.f2515e0 = null;
        if (!this.f2523i0.contains(this.f2525j0)) {
            S0(this.f2525j0);
        }
    }

    @Override // androidx.lifecycle.i
    public final d2.c s() {
        Application application;
        Context applicationContext = V0().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && j0.J(3)) {
            StringBuilder a10 = android.support.v4.media.d.a("Could not find Application instance from Context ");
            a10.append(V0().getApplicationContext());
            a10.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            Log.d("FragmentManager", a10.toString());
        }
        d2.c cVar = new d2.c(0);
        if (application != null) {
            cVar.f12611a.put(androidx.lifecycle.u0.f2788a, application);
        }
        cVar.f12611a.put(androidx.lifecycle.m0.f2748a, this);
        cVar.f12611a.put(androidx.lifecycle.m0.f2749b, this);
        Bundle bundle = this.f2516f;
        if (bundle != null) {
            cVar.f12611a.put(androidx.lifecycle.m0.f2750c, bundle);
        }
        return cVar;
    }

    public final void s0() {
        r0();
        this.X = this.f2514e;
        this.f2514e = UUID.randomUUID().toString();
        this.f2526k = false;
        this.f2527l = false;
        this.f2529n = false;
        this.f2530o = false;
        this.f2531p = false;
        this.f2533r = 0;
        this.f2534s = null;
        this.f2536u = new k0();
        this.f2535t = null;
        this.f2538w = 0;
        this.f2539x = 0;
        this.f2540y = null;
        this.f2541z = false;
        this.A = false;
    }

    public final boolean t0() {
        return this.f2535t != null && this.f2526k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f2514e);
        if (this.f2538w != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f2538w));
        }
        if (this.f2540y != null) {
            sb2.append(" tag=");
            sb2.append(this.f2540y);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final boolean u0() {
        if (!this.f2541z) {
            j0 j0Var = this.f2534s;
            if (j0Var == null) {
                return false;
            }
            r rVar = this.f2537v;
            j0Var.getClass();
            if (!(rVar == null ? false : rVar.u0())) {
                return false;
            }
        }
        return true;
    }

    public final boolean v0() {
        return this.f2533r > 0;
    }

    public final boolean w0() {
        View view;
        return (!t0() || u0() || (view = this.H) == null || view.getWindowToken() == null || this.H.getVisibility() != 0) ? false : true;
    }

    @Deprecated
    public void x0() {
        this.E = true;
    }

    @Deprecated
    public void y0(int i10, int i11, Intent intent) {
        if (j0.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    @Override // androidx.lifecycle.y0
    public final androidx.lifecycle.x0 z() {
        if (this.f2534s != null) {
            if (l0() != 1) {
                m0 m0Var = this.f2534s.M;
                androidx.lifecycle.x0 x0Var = m0Var.f2462f.get(this.f2514e);
                if (x0Var == null) {
                    androidx.lifecycle.x0 x0Var2 = new androidx.lifecycle.x0();
                    m0Var.f2462f.put(this.f2514e, x0Var2);
                    return x0Var2;
                }
                return x0Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Deprecated
    public void z0(Activity activity) {
        this.E = true;
    }
}
