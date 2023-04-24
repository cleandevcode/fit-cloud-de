package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.e2;
import androidx.fragment.R;
import androidx.fragment.app.r;
import androidx.fragment.app.s0;
import androidx.lifecycle.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import no.nordicsemi.android.dfu.DfuBaseService;
import s.m1;

/* loaded from: classes.dex */
public abstract class j0 {
    public androidx.activity.result.f A;
    public androidx.activity.result.f B;
    public androidx.activity.result.f C;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public ArrayList<androidx.fragment.app.a> J;
    public ArrayList<Boolean> K;
    public ArrayList<r> L;
    public m0 M;

    /* renamed from: b */
    public boolean f2394b;

    /* renamed from: d */
    public ArrayList<androidx.fragment.app.a> f2396d;

    /* renamed from: e */
    public ArrayList<r> f2397e;

    /* renamed from: g */
    public OnBackPressedDispatcher f2399g;

    /* renamed from: u */
    public d0<?> f2413u;

    /* renamed from: v */
    public a0 f2414v;

    /* renamed from: w */
    public r f2415w;

    /* renamed from: x */
    public r f2416x;

    /* renamed from: a */
    public final ArrayList<n> f2393a = new ArrayList<>();

    /* renamed from: c */
    public final r0 f2395c = new r0();

    /* renamed from: f */
    public final e0 f2398f = new e0(this);

    /* renamed from: h */
    public final b f2400h = new b();

    /* renamed from: i */
    public final AtomicInteger f2401i = new AtomicInteger();

    /* renamed from: j */
    public final Map<String, androidx.fragment.app.c> f2402j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map<String, Bundle> f2403k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    public final Map<String, m> f2404l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public final f0 f2405m = new f0(this);

    /* renamed from: n */
    public final CopyOnWriteArrayList<n0> f2406n = new CopyOnWriteArrayList<>();

    /* renamed from: o */
    public final g0 f2407o = new j1.a() { // from class: androidx.fragment.app.g0
        @Override // j1.a
        public final void accept(Object obj) {
            j0 j0Var = j0.this;
            Configuration configuration = (Configuration) obj;
            if (j0Var.L()) {
                j0Var.i(false, configuration);
            }
        }
    };

    /* renamed from: p */
    public final h0 f2408p = new j1.a() { // from class: androidx.fragment.app.h0
        @Override // j1.a
        public final void accept(Object obj) {
            j0 j0Var = j0.this;
            Integer num = (Integer) obj;
            if (j0Var.L() && num.intValue() == 80) {
                j0Var.m(false);
            }
        }
    };

    /* renamed from: q */
    public final z.b f2409q = new z.b(2, this);

    /* renamed from: r */
    public final v f2410r = new v(1, this);

    /* renamed from: s */
    public final c f2411s = new c();

    /* renamed from: t */
    public int f2412t = -1;

    /* renamed from: y */
    public d f2417y = new d();

    /* renamed from: z */
    public e f2418z = new e();
    public ArrayDeque<l> D = new ArrayDeque<>();
    public f N = new f();

    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.b<Map<String, Boolean>> {

        /* renamed from: a */
        public final /* synthetic */ j0 f2419a;

        public a(k0 k0Var) {
            this.f2419a = k0Var;
        }

        @Override // androidx.activity.result.b
        @SuppressLint({"SyntheticAccessor"})
        public final void a(Map<String, Boolean> map) {
            String b10;
            int i10;
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((Boolean) arrayList.get(i11)).booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = -1;
                }
                iArr[i11] = i10;
            }
            l pollFirst = this.f2419a.D.pollFirst();
            if (pollFirst == null) {
                b10 = "No permissions were requested for " + this;
            } else {
                String str = pollFirst.f2427a;
                if (this.f2419a.f2395c.c(str) == null) {
                    b10 = a.b.b("Permission request result delivered for unknown Fragment ", str);
                } else {
                    return;
                }
            }
            Log.w("FragmentManager", b10);
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.activity.k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(false);
            j0.this = r1;
        }

        @Override // androidx.activity.k
        public final void a() {
            j0 j0Var = j0.this;
            j0Var.y(true);
            if (j0Var.f2400h.f745a) {
                j0Var.R();
            } else {
                j0Var.f2399g.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements k1.x {
        public c() {
            j0.this = r1;
        }

        @Override // k1.x
        public final boolean a(MenuItem menuItem) {
            return j0.this.p();
        }

        @Override // k1.x
        public final void b(Menu menu) {
            j0.this.q();
        }

        @Override // k1.x
        public final void c(Menu menu, MenuInflater menuInflater) {
            j0.this.k();
        }

        @Override // k1.x
        public final void d(Menu menu) {
            j0.this.t();
        }
    }

    /* loaded from: classes.dex */
    public class d extends c0 {
        public d() {
            j0.this = r1;
        }

        @Override // androidx.fragment.app.c0
        public final r a(String str) {
            Context context = j0.this.f2413u.f2340b;
            Object obj = r.f2507k0;
            try {
                return c0.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new r.d(android.support.v4.media.a.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
            } catch (InstantiationException e11) {
                throw new r.d(android.support.v4.media.a.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
            } catch (NoSuchMethodException e12) {
                throw new r.d(android.support.v4.media.a.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
            } catch (InvocationTargetException e13) {
                throw new r.d(android.support.v4.media.a.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements j1 {
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
            j0.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j0.this.y(true);
        }
    }

    /* loaded from: classes.dex */
    public class g implements n0 {

        /* renamed from: a */
        public final /* synthetic */ r f2424a;

        public g(r rVar) {
            this.f2424a = rVar;
        }

        @Override // androidx.fragment.app.n0
        public final void f(j0 j0Var, r rVar) {
            this.f2424a.getClass();
        }
    }

    /* loaded from: classes.dex */
    public class h implements androidx.activity.result.b<androidx.activity.result.a> {

        /* renamed from: a */
        public final /* synthetic */ j0 f2425a;

        public h(k0 k0Var) {
            this.f2425a = k0Var;
        }

        @Override // androidx.activity.result.b
        public final void a(androidx.activity.result.a aVar) {
            StringBuilder a10;
            androidx.activity.result.a aVar2 = aVar;
            l pollFirst = this.f2425a.D.pollFirst();
            if (pollFirst == null) {
                a10 = new StringBuilder();
                a10.append("No Activities were started for result for ");
                a10.append(this);
            } else {
                String str = pollFirst.f2427a;
                int i10 = pollFirst.f2428b;
                r c10 = this.f2425a.f2395c.c(str);
                if (c10 == null) {
                    a10 = p.a.a("Activity result delivered for unknown Fragment ", str);
                } else {
                    c10.y0(i10, aVar2.f751a, aVar2.f752b);
                    return;
                }
            }
            Log.w("FragmentManager", a10.toString());
        }
    }

    /* loaded from: classes.dex */
    public class i implements androidx.activity.result.b<androidx.activity.result.a> {

        /* renamed from: a */
        public final /* synthetic */ j0 f2426a;

        public i(k0 k0Var) {
            this.f2426a = k0Var;
        }

        @Override // androidx.activity.result.b
        public final void a(androidx.activity.result.a aVar) {
            StringBuilder a10;
            androidx.activity.result.a aVar2 = aVar;
            l pollFirst = this.f2426a.D.pollFirst();
            if (pollFirst == null) {
                a10 = new StringBuilder();
                a10.append("No IntentSenders were started for ");
                a10.append(this);
            } else {
                String str = pollFirst.f2427a;
                int i10 = pollFirst.f2428b;
                r c10 = this.f2426a.f2395c.c(str);
                if (c10 == null) {
                    a10 = p.a.a("Intent Sender result delivered for unknown Fragment ", str);
                } else {
                    c10.y0(i10, aVar2.f751a, aVar2.f752b);
                    return;
                }
            }
            Log.w("FragmentManager", a10.toString());
        }
    }

    /* loaded from: classes.dex */
    public static class j extends e.a<androidx.activity.result.i, androidx.activity.result.a> {
        @Override // e.a
        public final Intent a(ComponentActivity componentActivity, Object obj) {
            Bundle bundleExtra;
            androidx.activity.result.i iVar = (androidx.activity.result.i) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = iVar.f772b;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    iVar = new androidx.activity.result.i(iVar.f771a, null, iVar.f773c, iVar.f774d);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar);
            if (j0.J(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // e.a
        public final Object c(Intent intent, int i10) {
            return new androidx.activity.result.a(intent, i10);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a */
        public String f2427a;

        /* renamed from: b */
        public int f2428b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i10) {
                return new l[i10];
            }
        }

        public l(Parcel parcel) {
            this.f2427a = parcel.readString();
            this.f2428b = parcel.readInt();
        }

        public l(String str, int i10) {
            this.f2427a = str;
            this.f2428b = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f2427a);
            parcel.writeInt(this.f2428b);
        }
    }

    /* loaded from: classes.dex */
    public static class m implements o0 {

        /* renamed from: a */
        public final androidx.lifecycle.k f2429a;

        /* renamed from: b */
        public final o0 f2430b;

        /* renamed from: c */
        public final androidx.lifecycle.s f2431c;

        public m(androidx.lifecycle.k kVar, m1 m1Var, androidx.lifecycle.s sVar) {
            this.f2429a = kVar;
            this.f2430b = m1Var;
            this.f2431c = sVar;
        }

        @Override // androidx.fragment.app.o0
        public final void e(Bundle bundle, String str) {
            this.f2430b.e(bundle, str);
        }
    }

    /* loaded from: classes.dex */
    public interface n {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class o implements n {

        /* renamed from: a */
        public final String f2432a;

        /* renamed from: b */
        public final int f2433b;

        /* renamed from: c */
        public final int f2434c = 1;

        public o(String str, int i10) {
            j0.this = r1;
            this.f2432a = str;
            this.f2433b = i10;
        }

        @Override // androidx.fragment.app.j0.n
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            r rVar = j0.this.f2416x;
            if (rVar == null || this.f2433b >= 0 || this.f2432a != null || !rVar.h0().R()) {
                return j0.this.T(arrayList, arrayList2, this.f2432a, this.f2433b, this.f2434c);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class p implements n {

        /* renamed from: a */
        public final String f2436a;

        public p(String str) {
            j0.this = r1;
            this.f2436a = str;
        }

        @Override // androidx.fragment.app.j0.n
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            j0 j0Var = j0.this;
            androidx.fragment.app.c remove = j0Var.f2402j.remove(this.f2436a);
            boolean z10 = false;
            if (remove != null) {
                HashMap hashMap = new HashMap();
                Iterator<androidx.fragment.app.a> it = arrayList.iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.a next = it.next();
                    if (next.f2309t) {
                        Iterator<s0.a> it2 = next.f2563a.iterator();
                        while (it2.hasNext()) {
                            r rVar = it2.next().f2580b;
                            if (rVar != null) {
                                hashMap.put(rVar.f2514e, rVar);
                            }
                        }
                    }
                }
                HashMap hashMap2 = new HashMap(remove.f2331a.size());
                for (String str : remove.f2331a) {
                    r rVar2 = (r) hashMap.get(str);
                    if (rVar2 != null) {
                        hashMap2.put(rVar2.f2514e, rVar2);
                    } else {
                        p0 i10 = j0Var.f2395c.i(str, null);
                        if (i10 != null) {
                            r a10 = i10.a(j0Var.G(), j0Var.f2413u.f2340b.getClassLoader());
                            hashMap2.put(a10.f2514e, a10);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (androidx.fragment.app.b bVar : remove.f2332b) {
                    bVar.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var);
                    bVar.a(aVar);
                    for (int i11 = 0; i11 < bVar.f2316b.size(); i11++) {
                        String str2 = bVar.f2316b.get(i11);
                        if (str2 != null) {
                            r rVar3 = (r) hashMap2.get(str2);
                            if (rVar3 != null) {
                                aVar.f2563a.get(i11).f2580b = rVar3;
                            } else {
                                StringBuilder a11 = android.support.v4.media.d.a("Restoring FragmentTransaction ");
                                a11.append(bVar.f2320f);
                                a11.append(" failed due to missing saved state for Fragment (");
                                a11.append(str2);
                                a11.append(")");
                                throw new IllegalStateException(a11.toString());
                            }
                        }
                    }
                    arrayList3.add(aVar);
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ((androidx.fragment.app.a) it3.next()).a(arrayList, arrayList2);
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* loaded from: classes.dex */
    public class q implements n {

        /* renamed from: a */
        public final String f2438a;

        public q(String str) {
            j0.this = r1;
            this.f2438a = str;
        }

        @Override // androidx.fragment.app.j0.n
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            String str;
            StringBuilder sb2;
            int i10;
            j0 j0Var = j0.this;
            String str2 = this.f2438a;
            int C = j0Var.C(true, str2, -1);
            if (C < 0) {
                return false;
            }
            for (int i11 = C; i11 < j0Var.f2396d.size(); i11++) {
                androidx.fragment.app.a aVar = j0Var.f2396d.get(i11);
                if (!aVar.f2578p) {
                    j0Var.g0(new IllegalArgumentException("saveBackStack(\"" + str2 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
                    throw null;
                }
            }
            HashSet hashSet = new HashSet();
            int i12 = C;
            while (true) {
                int i13 = 2;
                if (i12 < j0Var.f2396d.size()) {
                    androidx.fragment.app.a aVar2 = j0Var.f2396d.get(i12);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    Iterator<s0.a> it = aVar2.f2563a.iterator();
                    while (it.hasNext()) {
                        s0.a next = it.next();
                        r rVar = next.f2580b;
                        if (rVar != null) {
                            if (!next.f2581c || (i10 = next.f2579a) == 1 || i10 == i13 || i10 == 8) {
                                hashSet.add(rVar);
                                hashSet2.add(rVar);
                            }
                            int i14 = next.f2579a;
                            if (i14 == 1 || i14 == 2) {
                                hashSet3.add(rVar);
                            }
                            i13 = 2;
                        }
                    }
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder a10 = androidx.activity.result.d.a("saveBackStack(\"", str2, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        if (hashSet2.size() == 1) {
                            sb2 = android.support.v4.media.d.a(" ");
                            sb2.append(hashSet2.iterator().next());
                        } else {
                            sb2 = new StringBuilder();
                            sb2.append("s ");
                            sb2.append(hashSet2);
                        }
                        a10.append(sb2.toString());
                        a10.append(" in ");
                        a10.append(aVar2);
                        a10.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        j0Var.g0(new IllegalArgumentException(a10.toString()));
                        throw null;
                    }
                    i12++;
                } else {
                    ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                    while (!arrayDeque.isEmpty()) {
                        r rVar2 = (r) arrayDeque.removeFirst();
                        if (rVar2.B) {
                            StringBuilder a11 = androidx.activity.result.d.a("saveBackStack(\"", str2, "\") must not contain retained fragments. Found ");
                            if (hashSet.contains(rVar2)) {
                                str = "direct reference to retained ";
                            } else {
                                str = "retained child ";
                            }
                            a11.append(str);
                            a11.append("fragment ");
                            a11.append(rVar2);
                            j0Var.g0(new IllegalArgumentException(a11.toString()));
                            throw null;
                        }
                        Iterator it2 = rVar2.f2536u.f2395c.e().iterator();
                        while (it2.hasNext()) {
                            r rVar3 = (r) it2.next();
                            if (rVar3 != null) {
                                arrayDeque.addLast(rVar3);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((r) it3.next()).f2514e);
                    }
                    ArrayList arrayList4 = new ArrayList(j0Var.f2396d.size() - C);
                    for (int i15 = C; i15 < j0Var.f2396d.size(); i15++) {
                        arrayList4.add(null);
                    }
                    androidx.fragment.app.c cVar = new androidx.fragment.app.c(arrayList3, arrayList4);
                    for (int size = j0Var.f2396d.size() - 1; size >= C; size--) {
                        androidx.fragment.app.a remove = j0Var.f2396d.remove(size);
                        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(remove);
                        int size2 = aVar3.f2563a.size();
                        while (true) {
                            size2--;
                            if (size2 >= 0) {
                                s0.a aVar4 = aVar3.f2563a.get(size2);
                                if (aVar4.f2581c) {
                                    if (aVar4.f2579a == 8) {
                                        aVar4.f2581c = false;
                                        size2--;
                                        aVar3.f2563a.remove(size2);
                                    } else {
                                        int i16 = aVar4.f2580b.f2539x;
                                        aVar4.f2579a = 2;
                                        aVar4.f2581c = false;
                                        for (int i17 = size2 - 1; i17 >= 0; i17--) {
                                            s0.a aVar5 = aVar3.f2563a.get(i17);
                                            if (aVar5.f2581c && aVar5.f2580b.f2539x == i16) {
                                                aVar3.f2563a.remove(i17);
                                                size2--;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        arrayList4.set(size - C, new androidx.fragment.app.b(aVar3));
                        remove.f2309t = true;
                        arrayList.add(remove);
                        arrayList2.add(Boolean.TRUE);
                    }
                    j0Var.f2402j.put(str2, cVar);
                    return true;
                }
            }
        }
    }

    public static boolean J(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean K(r rVar) {
        Iterator it = rVar.f2536u.f2395c.e().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            r rVar2 = (r) it.next();
            if (rVar2 != null) {
                z10 = K(rVar2);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(r rVar) {
        if (rVar == null) {
            return true;
        }
        return rVar.D && (rVar.f2534s == null || M(rVar.f2537v));
    }

    public static boolean N(r rVar) {
        if (rVar == null) {
            return true;
        }
        j0 j0Var = rVar.f2534s;
        if (rVar.equals(j0Var.f2416x) && N(j0Var.f2415w)) {
            return true;
        }
        return false;
    }

    public static void e0(r rVar) {
        if (J(2)) {
            Log.v("FragmentManager", "show: " + rVar);
        }
        if (rVar.f2541z) {
            rVar.f2541z = false;
            rVar.U = !rVar.U;
        }
    }

    public final void A(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        ArrayList<androidx.fragment.app.a> arrayList3;
        int i12;
        ViewGroup viewGroup;
        j0 j0Var;
        j0 j0Var2;
        r rVar;
        int i13;
        int i14;
        int i15;
        ArrayList<androidx.fragment.app.a> arrayList4 = arrayList;
        ArrayList<Boolean> arrayList5 = arrayList2;
        int i16 = i11;
        boolean z10 = arrayList4.get(i10).f2578p;
        ArrayList<r> arrayList6 = this.L;
        if (arrayList6 == null) {
            this.L = new ArrayList<>();
        } else {
            arrayList6.clear();
        }
        this.L.addAll(this.f2395c.f());
        r rVar2 = this.f2416x;
        boolean z11 = false;
        int i17 = i10;
        while (true) {
            int i18 = 1;
            if (i17 < i16) {
                androidx.fragment.app.a aVar = arrayList4.get(i17);
                int i19 = 3;
                if (!arrayList5.get(i17).booleanValue()) {
                    ArrayList<r> arrayList7 = this.L;
                    int i20 = 0;
                    while (i20 < aVar.f2563a.size()) {
                        s0.a aVar2 = aVar.f2563a.get(i20);
                        int i21 = aVar2.f2579a;
                        if (i21 != i18) {
                            if (i21 == 2) {
                                r rVar3 = aVar2.f2580b;
                                int i22 = rVar3.f2539x;
                                int size = arrayList7.size() - 1;
                                boolean z12 = false;
                                while (size >= 0) {
                                    r rVar4 = arrayList7.get(size);
                                    if (rVar4.f2539x != i22) {
                                        i14 = i22;
                                    } else if (rVar4 == rVar3) {
                                        i14 = i22;
                                        z12 = true;
                                    } else {
                                        if (rVar4 == rVar2) {
                                            i14 = i22;
                                            i15 = 0;
                                            aVar.f2563a.add(i20, new s0.a(9, rVar4, 0));
                                            i20++;
                                            rVar2 = null;
                                        } else {
                                            i14 = i22;
                                            i15 = 0;
                                        }
                                        s0.a aVar3 = new s0.a(3, rVar4, i15);
                                        aVar3.f2582d = aVar2.f2582d;
                                        aVar3.f2584f = aVar2.f2584f;
                                        aVar3.f2583e = aVar2.f2583e;
                                        aVar3.f2585g = aVar2.f2585g;
                                        aVar.f2563a.add(i20, aVar3);
                                        arrayList7.remove(rVar4);
                                        i20++;
                                    }
                                    size--;
                                    i22 = i14;
                                }
                                if (z12) {
                                    aVar.f2563a.remove(i20);
                                    i20--;
                                } else {
                                    aVar2.f2579a = 1;
                                    aVar2.f2581c = true;
                                    arrayList7.add(rVar3);
                                }
                            } else if (i21 == i19 || i21 == 6) {
                                arrayList7.remove(aVar2.f2580b);
                                r rVar5 = aVar2.f2580b;
                                if (rVar5 == rVar2) {
                                    aVar.f2563a.add(i20, new s0.a(9, rVar5));
                                    i20++;
                                    i13 = 1;
                                    rVar2 = null;
                                    i20 += i13;
                                    i18 = 1;
                                    i19 = 3;
                                }
                            } else if (i21 != 7) {
                                if (i21 == 8) {
                                    aVar.f2563a.add(i20, new s0.a(9, rVar2, 0));
                                    aVar2.f2581c = true;
                                    i20++;
                                    rVar2 = aVar2.f2580b;
                                }
                            }
                            i13 = 1;
                            i20 += i13;
                            i18 = 1;
                            i19 = 3;
                        }
                        i13 = 1;
                        arrayList7.add(aVar2.f2580b);
                        i20 += i13;
                        i18 = 1;
                        i19 = 3;
                    }
                } else {
                    int i23 = 1;
                    ArrayList<r> arrayList8 = this.L;
                    int size2 = aVar.f2563a.size() - 1;
                    while (size2 >= 0) {
                        s0.a aVar4 = aVar.f2563a.get(size2);
                        int i24 = aVar4.f2579a;
                        if (i24 != i23) {
                            if (i24 != 3) {
                                switch (i24) {
                                    case 8:
                                        rVar = null;
                                        rVar2 = rVar;
                                        break;
                                    case 9:
                                        rVar = aVar4.f2580b;
                                        rVar2 = rVar;
                                        break;
                                    case 10:
                                        aVar4.f2587i = aVar4.f2586h;
                                        break;
                                }
                                size2--;
                                i23 = 1;
                            }
                            arrayList8.add(aVar4.f2580b);
                            size2--;
                            i23 = 1;
                        }
                        arrayList8.remove(aVar4.f2580b);
                        size2--;
                        i23 = 1;
                    }
                }
                z11 = z11 || aVar.f2569g;
                i17++;
                arrayList4 = arrayList;
                arrayList5 = arrayList2;
                i16 = i11;
            } else {
                this.L.clear();
                if (z10 || this.f2412t < 1) {
                    arrayList3 = arrayList;
                    i12 = i11;
                } else {
                    int i25 = i10;
                    i12 = i11;
                    while (true) {
                        arrayList3 = arrayList;
                        if (i25 < i12) {
                            Iterator<s0.a> it = arrayList3.get(i25).f2563a.iterator();
                            while (it.hasNext()) {
                                r rVar6 = it.next().f2580b;
                                if (rVar6 != null && rVar6.f2534s != null) {
                                    this.f2395c.g(g(rVar6));
                                }
                            }
                            i25++;
                        }
                    }
                }
                for (int i26 = i10; i26 < i12; i26++) {
                    androidx.fragment.app.a aVar5 = arrayList3.get(i26);
                    if (arrayList2.get(i26).booleanValue()) {
                        aVar5.c(-1);
                        for (int size3 = aVar5.f2563a.size() - 1; size3 >= 0; size3--) {
                            s0.a aVar6 = aVar5.f2563a.get(size3);
                            r rVar7 = aVar6.f2580b;
                            if (rVar7 != null) {
                                rVar7.f2528m = aVar5.f2309t;
                                if (rVar7.Q != null) {
                                    rVar7.e0().f2544a = true;
                                }
                                int i27 = aVar5.f2568f;
                                int i28 = DfuBaseService.ERROR_FILE_IO_EXCEPTION;
                                if (i27 == 4097) {
                                    i28 = 8194;
                                } else if (i27 == 8194) {
                                    i28 = DfuBaseService.ERROR_FILE_NOT_FOUND;
                                } else if (i27 != 8197) {
                                    i28 = i27 != 4099 ? i27 != 4100 ? 0 : 8197 : DfuBaseService.ERROR_FILE_INVALID;
                                }
                                if (rVar7.Q != null || i28 != 0) {
                                    rVar7.e0();
                                    rVar7.Q.f2549f = i28;
                                }
                                ArrayList<String> arrayList9 = aVar5.f2577o;
                                ArrayList<String> arrayList10 = aVar5.f2576n;
                                rVar7.e0();
                                r.c cVar = rVar7.Q;
                                cVar.f2550g = arrayList9;
                                cVar.f2551h = arrayList10;
                            }
                            switch (aVar6.f2579a) {
                                case 1:
                                    rVar7.Y0(aVar6.f2582d, aVar6.f2583e, aVar6.f2584f, aVar6.f2585g);
                                    aVar5.f2306q.Z(rVar7, true);
                                    aVar5.f2306q.U(rVar7);
                                    break;
                                case 2:
                                default:
                                    StringBuilder a10 = android.support.v4.media.d.a("Unknown cmd: ");
                                    a10.append(aVar6.f2579a);
                                    throw new IllegalArgumentException(a10.toString());
                                case 3:
                                    rVar7.Y0(aVar6.f2582d, aVar6.f2583e, aVar6.f2584f, aVar6.f2585g);
                                    aVar5.f2306q.a(rVar7);
                                    break;
                                case 4:
                                    rVar7.Y0(aVar6.f2582d, aVar6.f2583e, aVar6.f2584f, aVar6.f2585g);
                                    aVar5.f2306q.getClass();
                                    e0(rVar7);
                                    break;
                                case 5:
                                    rVar7.Y0(aVar6.f2582d, aVar6.f2583e, aVar6.f2584f, aVar6.f2585g);
                                    aVar5.f2306q.Z(rVar7, true);
                                    aVar5.f2306q.I(rVar7);
                                    break;
                                case 6:
                                    rVar7.Y0(aVar6.f2582d, aVar6.f2583e, aVar6.f2584f, aVar6.f2585g);
                                    aVar5.f2306q.d(rVar7);
                                    break;
                                case 7:
                                    rVar7.Y0(aVar6.f2582d, aVar6.f2583e, aVar6.f2584f, aVar6.f2585g);
                                    aVar5.f2306q.Z(rVar7, true);
                                    aVar5.f2306q.h(rVar7);
                                    break;
                                case 8:
                                    j0Var2 = aVar5.f2306q;
                                    rVar7 = null;
                                    j0Var2.c0(rVar7);
                                    break;
                                case 9:
                                    j0Var2 = aVar5.f2306q;
                                    j0Var2.c0(rVar7);
                                    break;
                                case 10:
                                    aVar5.f2306q.b0(rVar7, aVar6.f2586h);
                                    break;
                            }
                        }
                        continue;
                    } else {
                        aVar5.c(1);
                        int size4 = aVar5.f2563a.size();
                        for (int i29 = 0; i29 < size4; i29++) {
                            s0.a aVar7 = aVar5.f2563a.get(i29);
                            r rVar8 = aVar7.f2580b;
                            if (rVar8 != null) {
                                rVar8.f2528m = aVar5.f2309t;
                                if (rVar8.Q != null) {
                                    rVar8.e0().f2544a = false;
                                }
                                int i30 = aVar5.f2568f;
                                if (rVar8.Q != null || i30 != 0) {
                                    rVar8.e0();
                                    rVar8.Q.f2549f = i30;
                                }
                                ArrayList<String> arrayList11 = aVar5.f2576n;
                                ArrayList<String> arrayList12 = aVar5.f2577o;
                                rVar8.e0();
                                r.c cVar2 = rVar8.Q;
                                cVar2.f2550g = arrayList11;
                                cVar2.f2551h = arrayList12;
                            }
                            switch (aVar7.f2579a) {
                                case 1:
                                    rVar8.Y0(aVar7.f2582d, aVar7.f2583e, aVar7.f2584f, aVar7.f2585g);
                                    aVar5.f2306q.Z(rVar8, false);
                                    aVar5.f2306q.a(rVar8);
                                    break;
                                case 2:
                                default:
                                    StringBuilder a11 = android.support.v4.media.d.a("Unknown cmd: ");
                                    a11.append(aVar7.f2579a);
                                    throw new IllegalArgumentException(a11.toString());
                                case 3:
                                    rVar8.Y0(aVar7.f2582d, aVar7.f2583e, aVar7.f2584f, aVar7.f2585g);
                                    aVar5.f2306q.U(rVar8);
                                    break;
                                case 4:
                                    rVar8.Y0(aVar7.f2582d, aVar7.f2583e, aVar7.f2584f, aVar7.f2585g);
                                    aVar5.f2306q.I(rVar8);
                                    break;
                                case 5:
                                    rVar8.Y0(aVar7.f2582d, aVar7.f2583e, aVar7.f2584f, aVar7.f2585g);
                                    aVar5.f2306q.Z(rVar8, false);
                                    aVar5.f2306q.getClass();
                                    e0(rVar8);
                                    break;
                                case 6:
                                    rVar8.Y0(aVar7.f2582d, aVar7.f2583e, aVar7.f2584f, aVar7.f2585g);
                                    aVar5.f2306q.h(rVar8);
                                    break;
                                case 7:
                                    rVar8.Y0(aVar7.f2582d, aVar7.f2583e, aVar7.f2584f, aVar7.f2585g);
                                    aVar5.f2306q.Z(rVar8, false);
                                    aVar5.f2306q.d(rVar8);
                                    break;
                                case 8:
                                    j0Var = aVar5.f2306q;
                                    j0Var.c0(rVar8);
                                    break;
                                case 9:
                                    j0Var = aVar5.f2306q;
                                    rVar8 = null;
                                    j0Var.c0(rVar8);
                                    break;
                                case 10:
                                    aVar5.f2306q.b0(rVar8, aVar7.f2587i);
                                    break;
                            }
                        }
                        continue;
                    }
                }
                boolean booleanValue = arrayList2.get(i12 - 1).booleanValue();
                for (int i31 = i10; i31 < i12; i31++) {
                    androidx.fragment.app.a aVar8 = arrayList3.get(i31);
                    if (booleanValue) {
                        for (int size5 = aVar8.f2563a.size() - 1; size5 >= 0; size5--) {
                            r rVar9 = aVar8.f2563a.get(size5).f2580b;
                            if (rVar9 != null) {
                                g(rVar9).k();
                            }
                        }
                    } else {
                        Iterator<s0.a> it2 = aVar8.f2563a.iterator();
                        while (it2.hasNext()) {
                            r rVar10 = it2.next().f2580b;
                            if (rVar10 != null) {
                                g(rVar10).k();
                            }
                        }
                    }
                }
                P(this.f2412t, true);
                HashSet hashSet = new HashSet();
                for (int i32 = i10; i32 < i12; i32++) {
                    Iterator<s0.a> it3 = arrayList3.get(i32).f2563a.iterator();
                    while (it3.hasNext()) {
                        r rVar11 = it3.next().f2580b;
                        if (rVar11 != null && (viewGroup = rVar11.F) != null) {
                            hashSet.add(f1.f(viewGroup, H()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    f1 f1Var = (f1) it4.next();
                    f1Var.f2364d = booleanValue;
                    f1Var.g();
                    f1Var.c();
                }
                for (int i33 = i10; i33 < i12; i33++) {
                    androidx.fragment.app.a aVar9 = arrayList3.get(i33);
                    if (arrayList2.get(i33).booleanValue() && aVar9.f2308s >= 0) {
                        aVar9.f2308s = -1;
                    }
                    aVar9.getClass();
                }
                return;
            }
        }
    }

    public final r B(String str) {
        return this.f2395c.b(str);
    }

    public final int C(boolean z10, String str, int i10) {
        ArrayList<androidx.fragment.app.a> arrayList = this.f2396d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f2396d.size() - 1;
        }
        int size = this.f2396d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f2396d.get(size);
            if ((str != null && str.equals(aVar.f2571i)) || (i10 >= 0 && i10 == aVar.f2308s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z10) {
            while (size > 0) {
                androidx.fragment.app.a aVar2 = this.f2396d.get(size - 1);
                if ((str != null && str.equals(aVar2.f2571i)) || (i10 >= 0 && i10 == aVar2.f2308s)) {
                    size--;
                } else {
                    return size;
                }
            }
            return size;
        } else if (size == this.f2396d.size() - 1) {
            return -1;
        } else {
            return size + 1;
        }
    }

    public final r D(int i10) {
        r0 r0Var = this.f2395c;
        int size = r0Var.f2558a.size();
        while (true) {
            size--;
            if (size >= 0) {
                r rVar = r0Var.f2558a.get(size);
                if (rVar != null && rVar.f2538w == i10) {
                    return rVar;
                }
            } else {
                for (q0 q0Var : r0Var.f2559b.values()) {
                    if (q0Var != null) {
                        r rVar2 = q0Var.f2503c;
                        if (rVar2.f2538w == i10) {
                            return rVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final r E(String str) {
        r0 r0Var = this.f2395c;
        if (str != null) {
            int size = r0Var.f2558a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                r rVar = r0Var.f2558a.get(size);
                if (rVar != null && str.equals(rVar.f2540y)) {
                    return rVar;
                }
            }
        }
        if (str != null) {
            for (q0 q0Var : r0Var.f2559b.values()) {
                if (q0Var != null) {
                    r rVar2 = q0Var.f2503c;
                    if (str.equals(rVar2.f2540y)) {
                        return rVar2;
                    }
                }
            }
        } else {
            r0Var.getClass();
        }
        return null;
    }

    public final ViewGroup F(r rVar) {
        ViewGroup viewGroup = rVar.F;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rVar.f2539x > 0 && this.f2414v.x()) {
            View u10 = this.f2414v.u(rVar.f2539x);
            if (u10 instanceof ViewGroup) {
                return (ViewGroup) u10;
            }
        }
        return null;
    }

    public final c0 G() {
        r rVar = this.f2415w;
        return rVar != null ? rVar.f2534s.G() : this.f2417y;
    }

    public final j1 H() {
        r rVar = this.f2415w;
        return rVar != null ? rVar.f2534s.H() : this.f2418z;
    }

    public final void I(r rVar) {
        if (J(2)) {
            Log.v("FragmentManager", "hide: " + rVar);
        }
        if (rVar.f2541z) {
            return;
        }
        rVar.f2541z = true;
        rVar.U = true ^ rVar.U;
        d0(rVar);
    }

    public final boolean L() {
        r rVar = this.f2415w;
        if (rVar == null) {
            return true;
        }
        return rVar.t0() && this.f2415w.m0().L();
    }

    public final boolean O() {
        return this.F || this.G;
    }

    public final void P(int i10, boolean z10) {
        d0<?> d0Var;
        if (this.f2413u == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z10 && i10 == this.f2412t) {
            return;
        }
        this.f2412t = i10;
        r0 r0Var = this.f2395c;
        Iterator<r> it = r0Var.f2558a.iterator();
        while (it.hasNext()) {
            q0 q0Var = r0Var.f2559b.get(it.next().f2514e);
            if (q0Var != null) {
                q0Var.k();
            }
        }
        Iterator<q0> it2 = r0Var.f2559b.values().iterator();
        while (true) {
            boolean z11 = false;
            if (!it2.hasNext()) {
                break;
            }
            q0 next = it2.next();
            if (next != null) {
                next.k();
                r rVar = next.f2503c;
                if (rVar.f2527l && !rVar.v0()) {
                    z11 = true;
                }
                if (z11) {
                    if (rVar.f2528m && !r0Var.f2560c.containsKey(rVar.f2514e)) {
                        next.p();
                    }
                    r0Var.h(next);
                }
            }
        }
        f0();
        if (this.E && (d0Var = this.f2413u) != null && this.f2412t == 7) {
            d0Var.L();
            this.E = false;
        }
    }

    public final void Q() {
        if (this.f2413u == null) {
            return;
        }
        this.F = false;
        this.G = false;
        this.M.f2465i = false;
        for (r rVar : this.f2395c.f()) {
            if (rVar != null) {
                rVar.f2536u.Q();
            }
        }
    }

    public final boolean R() {
        return S(-1, 0);
    }

    public final boolean S(int i10, int i11) {
        y(false);
        x(true);
        r rVar = this.f2416x;
        if (rVar != null && i10 < 0 && rVar.h0().R()) {
            return true;
        }
        boolean T = T(this.J, this.K, null, i10, i11);
        if (T) {
            this.f2394b = true;
            try {
                V(this.J, this.K);
            } finally {
                e();
            }
        }
        h0();
        if (this.I) {
            this.I = false;
            f0();
        }
        this.f2395c.f2559b.values().removeAll(Collections.singleton(null));
        return T;
    }

    public final boolean T(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int C = C((i11 & 1) != 0, str, i10);
        if (C < 0) {
            return false;
        }
        for (int size = this.f2396d.size() - 1; size >= C; size--) {
            arrayList.add(this.f2396d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(r rVar) {
        if (J(2)) {
            Log.v("FragmentManager", "remove: " + rVar + " nesting=" + rVar.f2533r);
        }
        boolean z10 = !rVar.v0();
        if (!rVar.A || z10) {
            r0 r0Var = this.f2395c;
            synchronized (r0Var.f2558a) {
                r0Var.f2558a.remove(rVar);
            }
            rVar.f2526k = false;
            if (K(rVar)) {
                this.E = true;
            }
            rVar.f2527l = true;
            d0(rVar);
        }
    }

    public final void V(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f2578p) {
                if (i11 != i10) {
                    A(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f2578p) {
                        i11++;
                    }
                }
                A(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            A(arrayList, arrayList2, i11, size);
        }
    }

    public final void W(Parcelable parcelable) {
        int i10;
        q0 q0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f2413u.f2340b.getClassLoader());
                this.f2403k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f2413u.f2340b.getClassLoader());
                arrayList.add((p0) bundle.getParcelable("state"));
            }
        }
        r0 r0Var = this.f2395c;
        r0Var.f2560c.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p0 p0Var = (p0) it.next();
            r0Var.f2560c.put(p0Var.f2488b, p0Var);
        }
        l0 l0Var = (l0) bundle3.getParcelable("state");
        if (l0Var == null) {
            return;
        }
        this.f2395c.f2559b.clear();
        Iterator<String> it2 = l0Var.f2443a.iterator();
        while (it2.hasNext()) {
            p0 i11 = this.f2395c.i(it2.next(), null);
            if (i11 != null) {
                r rVar = this.M.f2460d.get(i11.f2488b);
                if (rVar != null) {
                    if (J(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + rVar);
                    }
                    q0Var = new q0(this.f2405m, this.f2395c, rVar, i11);
                } else {
                    q0Var = new q0(this.f2405m, this.f2395c, this.f2413u.f2340b.getClassLoader(), G(), i11);
                }
                r rVar2 = q0Var.f2503c;
                rVar2.f2534s = this;
                if (J(2)) {
                    StringBuilder a10 = android.support.v4.media.d.a("restoreSaveState: active (");
                    a10.append(rVar2.f2514e);
                    a10.append("): ");
                    a10.append(rVar2);
                    Log.v("FragmentManager", a10.toString());
                }
                q0Var.m(this.f2413u.f2340b.getClassLoader());
                this.f2395c.g(q0Var);
                q0Var.f2505e = this.f2412t;
            }
        }
        m0 m0Var = this.M;
        m0Var.getClass();
        Iterator it3 = new ArrayList(m0Var.f2460d.values()).iterator();
        while (true) {
            i10 = 0;
            if (!it3.hasNext()) {
                break;
            }
            r rVar3 = (r) it3.next();
            if (this.f2395c.f2559b.get(rVar3.f2514e) != null) {
                i10 = 1;
            }
            if (i10 == 0) {
                if (J(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + rVar3 + " that was not found in the set of active Fragments " + l0Var.f2443a);
                }
                this.M.h(rVar3);
                rVar3.f2534s = this;
                q0 q0Var2 = new q0(this.f2405m, this.f2395c, rVar3);
                q0Var2.f2505e = 1;
                q0Var2.k();
                rVar3.f2527l = true;
                q0Var2.k();
            }
        }
        r0 r0Var2 = this.f2395c;
        ArrayList<String> arrayList2 = l0Var.f2444b;
        r0Var2.f2558a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                r b10 = r0Var2.b(str3);
                if (b10 != null) {
                    if (J(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b10);
                    }
                    r0Var2.a(b10);
                } else {
                    throw new IllegalStateException(android.support.v4.media.a.a("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (l0Var.f2445c != null) {
            this.f2396d = new ArrayList<>(l0Var.f2445c.length);
            int i12 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = l0Var.f2445c;
                if (i12 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.b bVar = bVarArr[i12];
                bVar.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                bVar.a(aVar);
                aVar.f2308s = bVar.f2321g;
                for (int i13 = 0; i13 < bVar.f2316b.size(); i13++) {
                    String str4 = bVar.f2316b.get(i13);
                    if (str4 != null) {
                        aVar.f2563a.get(i13).f2580b = B(str4);
                    }
                }
                aVar.c(1);
                if (J(2)) {
                    StringBuilder a11 = e2.a("restoreAllState: back stack #", i12, " (index ");
                    a11.append(aVar.f2308s);
                    a11.append("): ");
                    a11.append(aVar);
                    Log.v("FragmentManager", a11.toString());
                    PrintWriter printWriter = new PrintWriter(new c1());
                    aVar.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2396d.add(aVar);
                i12++;
            }
        } else {
            this.f2396d = null;
        }
        this.f2401i.set(l0Var.f2446d);
        String str5 = l0Var.f2447e;
        if (str5 != null) {
            r B = B(str5);
            this.f2416x = B;
            r(B);
        }
        ArrayList<String> arrayList3 = l0Var.f2448f;
        if (arrayList3 != null) {
            while (i10 < arrayList3.size()) {
                this.f2402j.put(arrayList3.get(i10), l0Var.f2449g.get(i10));
                i10++;
            }
        }
        this.D = new ArrayDeque<>(l0Var.f2450h);
    }

    public final Bundle X() {
        int i10;
        androidx.fragment.app.b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            f1 f1Var = (f1) it.next();
            if (f1Var.f2365e) {
                if (J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                f1Var.f2365e = false;
                f1Var.c();
            }
        }
        Iterator it2 = f().iterator();
        while (it2.hasNext()) {
            ((f1) it2.next()).e();
        }
        y(true);
        this.F = true;
        this.M.f2465i = true;
        r0 r0Var = this.f2395c;
        r0Var.getClass();
        ArrayList<String> arrayList2 = new ArrayList<>(r0Var.f2559b.size());
        for (q0 q0Var : r0Var.f2559b.values()) {
            if (q0Var != null) {
                r rVar = q0Var.f2503c;
                q0Var.p();
                arrayList2.add(rVar.f2514e);
                if (J(2)) {
                    Log.v("FragmentManager", "Saved state of " + rVar + ": " + rVar.f2509b);
                }
            }
        }
        r0 r0Var2 = this.f2395c;
        r0Var2.getClass();
        ArrayList arrayList3 = new ArrayList(r0Var2.f2560c.values());
        if (arrayList3.isEmpty()) {
            if (J(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        } else {
            r0 r0Var3 = this.f2395c;
            synchronized (r0Var3.f2558a) {
                bVarArr = null;
                if (r0Var3.f2558a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(r0Var3.f2558a.size());
                    Iterator<r> it3 = r0Var3.f2558a.iterator();
                    while (it3.hasNext()) {
                        r next = it3.next();
                        arrayList.add(next.f2514e);
                        if (J(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f2514e + "): " + next);
                        }
                    }
                }
            }
            ArrayList<androidx.fragment.app.a> arrayList4 = this.f2396d;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                bVarArr = new androidx.fragment.app.b[size];
                for (i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new androidx.fragment.app.b(this.f2396d.get(i10));
                    if (J(2)) {
                        StringBuilder a10 = e2.a("saveAllState: adding back stack #", i10, ": ");
                        a10.append(this.f2396d.get(i10));
                        Log.v("FragmentManager", a10.toString());
                    }
                }
            }
            l0 l0Var = new l0();
            l0Var.f2443a = arrayList2;
            l0Var.f2444b = arrayList;
            l0Var.f2445c = bVarArr;
            l0Var.f2446d = this.f2401i.get();
            r rVar2 = this.f2416x;
            if (rVar2 != null) {
                l0Var.f2447e = rVar2.f2514e;
            }
            l0Var.f2448f.addAll(this.f2402j.keySet());
            l0Var.f2449g.addAll(this.f2402j.values());
            l0Var.f2450h = new ArrayList<>(this.D);
            bundle.putParcelable("state", l0Var);
            for (String str : this.f2403k.keySet()) {
                bundle.putBundle(a.b.b("result_", str), this.f2403k.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                p0 p0Var = (p0) it4.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", p0Var);
                StringBuilder a11 = android.support.v4.media.d.a("fragment_");
                a11.append(p0Var.f2488b);
                bundle.putBundle(a11.toString(), bundle2);
            }
        }
        return bundle;
    }

    public final void Y() {
        synchronized (this.f2393a) {
            boolean z10 = true;
            if (this.f2393a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f2413u.f2341c.removeCallbacks(this.N);
                this.f2413u.f2341c.post(this.N);
                h0();
            }
        }
    }

    public final void Z(r rVar, boolean z10) {
        ViewGroup F = F(rVar);
        if (F == null || !(F instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) F).setDrawDisappearingViewsLast(!z10);
    }

    public final q0 a(r rVar) {
        String str = rVar.X;
        if (str != null) {
            a2.b.d(rVar, str);
        }
        if (J(2)) {
            Log.v("FragmentManager", "add: " + rVar);
        }
        q0 g10 = g(rVar);
        rVar.f2534s = this;
        this.f2395c.g(g10);
        if (!rVar.A) {
            this.f2395c.a(rVar);
            rVar.f2527l = false;
            if (rVar.H == null) {
                rVar.U = false;
            }
            if (K(rVar)) {
                this.E = true;
            }
        }
        return g10;
    }

    @SuppressLint({"SyntheticAccessor"})
    public final void a0(androidx.lifecycle.u uVar, final m1 m1Var) {
        final androidx.lifecycle.v a02 = uVar.a0();
        if (a02.f2790c == k.c.DESTROYED) {
            return;
        }
        androidx.lifecycle.s sVar = new androidx.lifecycle.s() { // from class: androidx.fragment.app.FragmentManager$6

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f2302a = "key_select_audios";

            @Override // androidx.lifecycle.s
            public final void d(androidx.lifecycle.u uVar2, k.b bVar) {
                Bundle bundle;
                if (bVar == k.b.ON_START && (bundle = j0.this.f2403k.get(this.f2302a)) != null) {
                    m1Var.e(bundle, this.f2302a);
                    j0 j0Var = j0.this;
                    String str = this.f2302a;
                    j0Var.f2403k.remove(str);
                    if (j0.J(2)) {
                        Log.v("FragmentManager", "Clearing fragment result with key " + str);
                    }
                }
                if (bVar == k.b.ON_DESTROY) {
                    a02.c(this);
                    j0.this.f2404l.remove(this.f2302a);
                }
            }
        };
        a02.a(sVar);
        m put = this.f2404l.put("key_select_audios", new m(a02, m1Var, sVar));
        if (put != null) {
            put.f2429a.c(put.f2431c);
        }
        if (J(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key key_select_audios lifecycleOwner " + a02 + " and listener " + m1Var);
        }
    }

    public final void b(n0 n0Var) {
        this.f2406n.add(n0Var);
    }

    public final void b0(r rVar, k.c cVar) {
        if (rVar.equals(B(rVar.f2514e)) && (rVar.f2535t == null || rVar.f2534s == this)) {
            rVar.Y = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + rVar + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ac  */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.fragment.app.d0<?> r5, androidx.fragment.app.a0 r6, androidx.fragment.app.r r7) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j0.c(androidx.fragment.app.d0, androidx.fragment.app.a0, androidx.fragment.app.r):void");
    }

    public final void c0(r rVar) {
        if (rVar == null || (rVar.equals(B(rVar.f2514e)) && (rVar.f2535t == null || rVar.f2534s == this))) {
            r rVar2 = this.f2416x;
            this.f2416x = rVar;
            r(rVar2);
            r(this.f2416x);
            return;
        }
        throw new IllegalArgumentException("Fragment " + rVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void d(r rVar) {
        if (J(2)) {
            Log.v("FragmentManager", "attach: " + rVar);
        }
        if (rVar.A) {
            rVar.A = false;
            if (rVar.f2526k) {
                return;
            }
            this.f2395c.a(rVar);
            if (J(2)) {
                Log.v("FragmentManager", "add from attach: " + rVar);
            }
            if (K(rVar)) {
                this.E = true;
            }
        }
    }

    public final void d0(r rVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup F = F(rVar);
        if (F != null) {
            r.c cVar = rVar.Q;
            boolean z10 = false;
            if (cVar == null) {
                i10 = 0;
            } else {
                i10 = cVar.f2545b;
            }
            if (cVar == null) {
                i11 = 0;
            } else {
                i11 = cVar.f2546c;
            }
            int i14 = i11 + i10;
            if (cVar == null) {
                i12 = 0;
            } else {
                i12 = cVar.f2547d;
            }
            int i15 = i12 + i14;
            if (cVar == null) {
                i13 = 0;
            } else {
                i13 = cVar.f2548e;
            }
            if (i13 + i15 > 0) {
                int i16 = R.id.visible_removing_fragment_view_tag;
                if (F.getTag(i16) == null) {
                    F.setTag(i16, rVar);
                }
                r rVar2 = (r) F.getTag(i16);
                r.c cVar2 = rVar.Q;
                if (cVar2 != null) {
                    z10 = cVar2.f2544a;
                }
                if (rVar2.Q != null) {
                    rVar2.e0().f2544a = z10;
                }
            }
        }
    }

    public final void e() {
        this.f2394b = false;
        this.K.clear();
        this.J.clear();
    }

    public final HashSet f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2395c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((q0) it.next()).f2503c.F;
            if (viewGroup != null) {
                hashSet.add(f1.f(viewGroup, H()));
            }
        }
        return hashSet;
    }

    public final void f0() {
        Iterator it = this.f2395c.d().iterator();
        while (it.hasNext()) {
            q0 q0Var = (q0) it.next();
            r rVar = q0Var.f2503c;
            if (rVar.L) {
                if (this.f2394b) {
                    this.I = true;
                } else {
                    rVar.L = false;
                    q0Var.k();
                }
            }
        }
    }

    public final q0 g(r rVar) {
        r0 r0Var = this.f2395c;
        q0 q0Var = r0Var.f2559b.get(rVar.f2514e);
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0(this.f2405m, this.f2395c, rVar);
        q0Var2.m(this.f2413u.f2340b.getClassLoader());
        q0Var2.f2505e = this.f2412t;
        return q0Var2;
    }

    public final void g0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new c1());
        d0<?> d0Var = this.f2413u;
        try {
            if (d0Var != null) {
                d0Var.H(printWriter, new String[0]);
            } else {
                v("  ", null, printWriter, new String[0]);
            }
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
        }
        throw runtimeException;
    }

    public final void h(r rVar) {
        if (J(2)) {
            Log.v("FragmentManager", "detach: " + rVar);
        }
        if (!rVar.A) {
            rVar.A = true;
            if (rVar.f2526k) {
                if (J(2)) {
                    Log.v("FragmentManager", "remove from detach: " + rVar);
                }
                r0 r0Var = this.f2395c;
                synchronized (r0Var.f2558a) {
                    r0Var.f2558a.remove(rVar);
                }
                rVar.f2526k = false;
                if (K(rVar)) {
                    this.E = true;
                }
                d0(rVar);
            }
        }
    }

    public final void h0() {
        int i10;
        synchronized (this.f2393a) {
            boolean z10 = true;
            if (!this.f2393a.isEmpty()) {
                this.f2400h.f745a = true;
                return;
            }
            b bVar = this.f2400h;
            ArrayList<androidx.fragment.app.a> arrayList = this.f2396d;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            bVar.f745a = (i10 <= 0 || !N(this.f2415w)) ? false : false;
        }
    }

    public final void i(boolean z10, Configuration configuration) {
        if (z10 && (this.f2413u instanceof y0.d)) {
            g0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (r rVar : this.f2395c.f()) {
            if (rVar != null) {
                rVar.onConfigurationChanged(configuration);
                if (z10) {
                    rVar.f2536u.i(true, configuration);
                }
            }
        }
    }

    public final boolean j() {
        if (this.f2412t < 1) {
            return false;
        }
        for (r rVar : this.f2395c.f()) {
            if (rVar != null) {
                if (!rVar.f2541z ? rVar.f2536u.j() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        boolean z10;
        if (this.f2412t < 1) {
            return false;
        }
        ArrayList<r> arrayList = null;
        boolean z11 = false;
        for (r rVar : this.f2395c.f()) {
            if (rVar != null && M(rVar)) {
                if (!rVar.f2541z) {
                    z10 = rVar.f2536u.k() | false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(rVar);
                    z11 = true;
                }
            }
        }
        if (this.f2397e != null) {
            for (int i10 = 0; i10 < this.f2397e.size(); i10++) {
                r rVar2 = this.f2397e.get(i10);
                if (arrayList == null || !arrayList.contains(rVar2)) {
                    rVar2.getClass();
                }
            }
        }
        this.f2397e = arrayList;
        return z11;
    }

    public final void l() {
        boolean z10 = true;
        this.H = true;
        y(true);
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((f1) it.next()).e();
        }
        d0<?> d0Var = this.f2413u;
        if (d0Var instanceof androidx.lifecycle.y0) {
            z10 = this.f2395c.f2561d.f2464h;
        } else {
            Context context = d0Var.f2340b;
            if (context instanceof Activity) {
                z10 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z10) {
            for (androidx.fragment.app.c cVar : this.f2402j.values()) {
                for (String str : cVar.f2331a) {
                    m0 m0Var = this.f2395c.f2561d;
                    m0Var.getClass();
                    if (J(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    m0Var.g(str);
                }
            }
        }
        u(-1);
        d0<?> d0Var2 = this.f2413u;
        if (d0Var2 instanceof y0.e) {
            ((y0.e) d0Var2).j(this.f2408p);
        }
        d0<?> d0Var3 = this.f2413u;
        if (d0Var3 instanceof y0.d) {
            ((y0.d) d0Var3).m(this.f2407o);
        }
        d0<?> d0Var4 = this.f2413u;
        if (d0Var4 instanceof x0.d0) {
            ((x0.d0) d0Var4).l(this.f2409q);
        }
        d0<?> d0Var5 = this.f2413u;
        if (d0Var5 instanceof x0.e0) {
            ((x0.e0) d0Var5).g(this.f2410r);
        }
        d0<?> d0Var6 = this.f2413u;
        if (d0Var6 instanceof k1.i) {
            ((k1.i) d0Var6).A(this.f2411s);
        }
        this.f2413u = null;
        this.f2414v = null;
        this.f2415w = null;
        if (this.f2399g != null) {
            Iterator<androidx.activity.a> it2 = this.f2400h.f746b.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.f2399g = null;
        }
        androidx.activity.result.f fVar = this.A;
        if (fVar != null) {
            fVar.c();
            this.B.c();
            this.C.c();
        }
    }

    public final void m(boolean z10) {
        if (z10 && (this.f2413u instanceof y0.e)) {
            g0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (r rVar : this.f2395c.f()) {
            if (rVar != null) {
                rVar.onLowMemory();
                if (z10) {
                    rVar.f2536u.m(true);
                }
            }
        }
    }

    public final void n(boolean z10, boolean z11) {
        if (z11 && (this.f2413u instanceof x0.d0)) {
            g0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (r rVar : this.f2395c.f()) {
            if (rVar != null && z11) {
                rVar.f2536u.n(z10, true);
            }
        }
    }

    public final void o() {
        Iterator it = this.f2395c.e().iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.u0();
                rVar.f2536u.o();
            }
        }
    }

    public final boolean p() {
        if (this.f2412t < 1) {
            return false;
        }
        for (r rVar : this.f2395c.f()) {
            if (rVar != null) {
                if (!rVar.f2541z ? rVar.f2536u.p() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f2412t < 1) {
            return;
        }
        for (r rVar : this.f2395c.f()) {
            if (rVar != null && !rVar.f2541z) {
                rVar.f2536u.q();
            }
        }
    }

    public final void r(r rVar) {
        if (rVar != null && rVar.equals(B(rVar.f2514e))) {
            rVar.f2534s.getClass();
            boolean N = N(rVar);
            Boolean bool = rVar.f2524j;
            if (bool == null || bool.booleanValue() != N) {
                rVar.f2524j = Boolean.valueOf(N);
                rVar.J0(N);
                k0 k0Var = rVar.f2536u;
                k0Var.h0();
                k0Var.r(k0Var.f2416x);
            }
        }
    }

    public final void s(boolean z10, boolean z11) {
        if (z11 && (this.f2413u instanceof x0.e0)) {
            g0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (r rVar : this.f2395c.f()) {
            if (rVar != null && z11) {
                rVar.f2536u.s(z10, true);
            }
        }
    }

    public final boolean t() {
        if (this.f2412t < 1) {
            return false;
        }
        boolean z10 = false;
        for (r rVar : this.f2395c.f()) {
            if (rVar != null && M(rVar)) {
                if (!rVar.f2541z ? rVar.f2536u.t() | false : false) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        r rVar = this.f2415w;
        if (rVar != null) {
            sb2.append(rVar.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f2415w;
        } else {
            d0<?> d0Var = this.f2413u;
            if (d0Var == null) {
                sb2.append("null");
                sb2.append("}}");
                return sb2.toString();
            }
            sb2.append(d0Var.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f2413u;
        }
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}");
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i10) {
        try {
            this.f2394b = true;
            for (q0 q0Var : this.f2395c.f2559b.values()) {
                if (q0Var != null) {
                    q0Var.f2505e = i10;
                }
            }
            P(i10, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((f1) it.next()).e();
            }
            this.f2394b = false;
            y(true);
        } catch (Throwable th2) {
            this.f2394b = false;
            throw th2;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String b10 = a.b.b(str, "    ");
        r0 r0Var = this.f2395c;
        r0Var.getClass();
        String str2 = str + "    ";
        if (!r0Var.f2559b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (q0 q0Var : r0Var.f2559b.values()) {
                printWriter.print(str);
                if (q0Var != null) {
                    r rVar = q0Var.f2503c;
                    printWriter.println(rVar);
                    rVar.d0(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = r0Var.f2558a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(r0Var.f2558a.get(i10).toString());
            }
        }
        ArrayList<r> arrayList = this.f2397e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f2397e.get(i11).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f2396d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                androidx.fragment.app.a aVar = this.f2396d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.h(b10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2401i.get());
        synchronized (this.f2393a) {
            int size4 = this.f2393a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size4; i13++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println((n) this.f2393a.get(i13));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2413u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2414v);
        if (this.f2415w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2415w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2412t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.F);
        printWriter.print(" mStopped=");
        printWriter.print(this.G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.H);
        if (this.E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.E);
        }
    }

    public final void w(n nVar, boolean z10) {
        if (!z10) {
            if (this.f2413u == null) {
                if (this.H) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (O()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2393a) {
            if (this.f2413u == null) {
                if (z10) {
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            }
            this.f2393a.add(nVar);
            Y();
        }
    }

    public final void x(boolean z10) {
        if (!this.f2394b) {
            if (this.f2413u == null) {
                if (this.H) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f2413u.f2341c.getLooper()) {
                if (!z10 && O()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.J == null) {
                    this.J = new ArrayList<>();
                    this.K = new ArrayList<>();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean y(boolean z10) {
        boolean z11;
        x(z10);
        boolean z12 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList = this.J;
            ArrayList<Boolean> arrayList2 = this.K;
            synchronized (this.f2393a) {
                if (this.f2393a.isEmpty()) {
                    z11 = false;
                } else {
                    int size = this.f2393a.size();
                    z11 = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        z11 |= this.f2393a.get(i10).a(arrayList, arrayList2);
                    }
                    this.f2393a.clear();
                    this.f2413u.f2341c.removeCallbacks(this.N);
                }
            }
            if (!z11) {
                break;
            }
            this.f2394b = true;
            try {
                V(this.J, this.K);
                e();
                z12 = true;
            } catch (Throwable th2) {
                e();
                throw th2;
            }
        }
        h0();
        if (this.I) {
            this.I = false;
            f0();
        }
        this.f2395c.f2559b.values().removeAll(Collections.singleton(null));
        return z12;
    }

    public final void z(n nVar, boolean z10) {
        if (z10 && (this.f2413u == null || this.H)) {
            return;
        }
        x(z10);
        if (nVar.a(this.J, this.K)) {
            this.f2394b = true;
            try {
                V(this.J, this.K);
            } finally {
                e();
            }
        }
        h0();
        if (this.I) {
            this.I = false;
            f0();
        }
        this.f2395c.f2559b.values().removeAll(Collections.singleton(null));
    }
}
