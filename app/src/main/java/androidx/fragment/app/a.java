package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.j0;
import androidx.fragment.app.s0;
import androidx.lifecycle.k;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a extends s0 implements j0.n {

    /* renamed from: q */
    public final j0 f2306q;

    /* renamed from: r */
    public boolean f2307r;

    /* renamed from: s */
    public int f2308s;

    /* renamed from: t */
    public boolean f2309t;

    public a(a aVar) {
        aVar.f2306q.G();
        d0<?> d0Var = aVar.f2306q.f2413u;
        if (d0Var != null) {
            d0Var.f2340b.getClassLoader();
        }
        Iterator<s0.a> it = aVar.f2563a.iterator();
        while (it.hasNext()) {
            this.f2563a.add(new s0.a(it.next()));
        }
        this.f2564b = aVar.f2564b;
        this.f2565c = aVar.f2565c;
        this.f2566d = aVar.f2566d;
        this.f2567e = aVar.f2567e;
        this.f2568f = aVar.f2568f;
        this.f2569g = aVar.f2569g;
        this.f2570h = aVar.f2570h;
        this.f2571i = aVar.f2571i;
        this.f2574l = aVar.f2574l;
        this.f2575m = aVar.f2575m;
        this.f2572j = aVar.f2572j;
        this.f2573k = aVar.f2573k;
        if (aVar.f2576n != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f2576n = arrayList;
            arrayList.addAll(aVar.f2576n);
        }
        if (aVar.f2577o != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f2577o = arrayList2;
            arrayList2.addAll(aVar.f2577o);
        }
        this.f2578p = aVar.f2578p;
        this.f2308s = -1;
        this.f2309t = false;
        this.f2306q = aVar.f2306q;
        this.f2307r = aVar.f2307r;
        this.f2308s = aVar.f2308s;
        this.f2309t = aVar.f2309t;
    }

    @Override // androidx.fragment.app.j0.n
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (j0.J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f2569g) {
            j0 j0Var = this.f2306q;
            if (j0Var.f2396d == null) {
                j0Var.f2396d = new ArrayList<>();
            }
            j0Var.f2396d.add(this);
            return true;
        }
        return true;
    }

    public final void c(int i10) {
        if (!this.f2569g) {
            return;
        }
        if (j0.J(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
        }
        int size = this.f2563a.size();
        for (int i11 = 0; i11 < size; i11++) {
            s0.a aVar = this.f2563a.get(i11);
            r rVar = aVar.f2580b;
            if (rVar != null) {
                rVar.f2533r += i10;
                if (j0.J(2)) {
                    StringBuilder a10 = android.support.v4.media.d.a("Bump nesting of ");
                    a10.append(aVar.f2580b);
                    a10.append(" to ");
                    a10.append(aVar.f2580b.f2533r);
                    Log.v("FragmentManager", a10.toString());
                }
            }
        }
    }

    public final int d() {
        return e(false);
    }

    public final int e(boolean z10) {
        int i10;
        if (!this.f2307r) {
            if (j0.J(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new c1());
                h("  ", printWriter, true);
                printWriter.close();
            }
            this.f2307r = true;
            if (this.f2569g) {
                i10 = this.f2306q.f2401i.getAndIncrement();
            } else {
                i10 = -1;
            }
            this.f2308s = i10;
            this.f2306q.w(this, z10);
            return this.f2308s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void f() {
        if (!this.f2569g) {
            this.f2570h = false;
            this.f2306q.z(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void g(int i10, r rVar, String str, int i11) {
        String str2 = rVar.X;
        if (str2 != null) {
            a2.b.d(rVar, str2);
        }
        Class<?> cls = rVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = rVar.f2540y;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + rVar + ": was " + rVar.f2540y + " now " + str);
                }
                rVar.f2540y = str;
            }
            if (i10 != 0) {
                if (i10 != -1) {
                    int i12 = rVar.f2538w;
                    if (i12 != 0 && i12 != i10) {
                        throw new IllegalStateException("Can't change container ID of fragment " + rVar + ": was " + rVar.f2538w + " now " + i10);
                    }
                    rVar.f2538w = i10;
                    rVar.f2539x = i10;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + rVar + " with tag " + str + " to container view with no id");
                }
            }
            b(new s0.a(i11, rVar));
            rVar.f2534s = this.f2306q;
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Fragment ");
        a10.append(cls.getCanonicalName());
        a10.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(a10.toString());
    }

    public final void h(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2571i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2308s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2307r);
            if (this.f2568f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2568f));
            }
            if (this.f2564b != 0 || this.f2565c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2564b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2565c));
            }
            if (this.f2566d != 0 || this.f2567e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2566d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2567e));
            }
            if (this.f2572j != 0 || this.f2573k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2572j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2573k);
            }
            if (this.f2574l != 0 || this.f2575m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2574l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2575m);
            }
        }
        if (!this.f2563a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f2563a.size();
            for (int i10 = 0; i10 < size; i10++) {
                s0.a aVar = this.f2563a.get(i10);
                switch (aVar.f2579a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder a10 = android.support.v4.media.d.a("cmd=");
                        a10.append(aVar.f2579a);
                        str2 = a10.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2580b);
                if (z10) {
                    if (aVar.f2582d != 0 || aVar.f2583e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2582d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2583e));
                    }
                    if (aVar.f2584f != 0 || aVar.f2585g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2584f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2585g));
                    }
                }
            }
        }
    }

    public final a i(r rVar) {
        j0 j0Var = rVar.f2534s;
        if (j0Var != null && j0Var != this.f2306q) {
            StringBuilder a10 = android.support.v4.media.d.a("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            a10.append(rVar.toString());
            a10.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(a10.toString());
        }
        b(new s0.a(3, rVar));
        return this;
    }

    public final a j(r rVar, k.c cVar) {
        if (rVar.f2534s == this.f2306q) {
            if (cVar == k.c.INITIALIZED && rVar.f2508a > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
            } else if (cVar != k.c.DESTROYED) {
                b(new s0.a(rVar, cVar));
                return this;
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        StringBuilder a10 = android.support.v4.media.d.a("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
        a10.append(this.f2306q);
        throw new IllegalArgumentException(a10.toString());
    }

    public final a k(r rVar) {
        j0 j0Var;
        if (rVar != null && (j0Var = rVar.f2534s) != null && j0Var != this.f2306q) {
            StringBuilder a10 = android.support.v4.media.d.a("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
            a10.append(rVar.toString());
            a10.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(a10.toString());
        }
        b(new s0.a(8, rVar));
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2308s >= 0) {
            sb2.append(" #");
            sb2.append(this.f2308s);
        }
        if (this.f2571i != null) {
            sb2.append(" ");
            sb2.append(this.f2571i);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public a(j0 j0Var) {
        j0Var.G();
        d0<?> d0Var = j0Var.f2413u;
        if (d0Var != null) {
            d0Var.f2340b.getClassLoader();
        }
        this.f2308s = -1;
        this.f2309t = false;
        this.f2306q = j0Var;
    }
}
