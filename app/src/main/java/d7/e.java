package d7;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.j0;
import androidx.fragment.app.r;
import com.topstep.fitcloudpro.R;
import d7.a;
import gm.l;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final Context f12859a;

    /* renamed from: b */
    public final j0 f12860b;

    /* renamed from: c */
    public final String f12861c;

    /* renamed from: d */
    public final int f12862d;

    /* renamed from: e */
    public final int f12863e;

    /* renamed from: f */
    public WeakReference<d> f12864f;

    public e(Context context, j0 j0Var, String str, int i10) {
        l.f(context, "context");
        this.f12859a = context;
        this.f12860b = j0Var;
        this.f12861c = str;
        this.f12862d = 1;
        this.f12863e = i10;
    }

    public static void d(e eVar, int i10, a.b bVar, int i11, int i12) {
        int i13;
        String str;
        if ((i12 & 8) != 0) {
            bVar = a.f12825a;
        }
        a.b bVar2 = bVar;
        if ((i12 & 16) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        eVar.getClass();
        l.f(bVar2, "autoCancel");
        if (i10 != 0) {
            str = eVar.f12859a.getString(i10);
        } else {
            str = null;
        }
        eVar.c(str, false, false, bVar2, i13);
    }

    public static void e(e eVar, String str) {
        eVar.c(str, false, false, a.f12825a, 0);
    }

    public static void f(e eVar, int i10) {
        String str;
        a.b bVar = a.f12825a;
        eVar.getClass();
        l.f(bVar, "autoCancel");
        if (i10 != 0) {
            str = eVar.f12859a.getString(i10);
        } else {
            str = null;
        }
        String str2 = str;
        d b10 = eVar.b();
        b10.i1(1, str2, false, false, bVar, 0);
        b10.h1(eVar.f12860b, eVar.f12861c);
    }

    public static void g(e eVar) {
        a.c cVar = a.c.f12828b;
        eVar.getClass();
        l.f(cVar, "autoCancel");
        String string = eVar.f12859a.getString(R.string.tip_please_wait);
        d b10 = eVar.b();
        b10.i1(4, string, true, false, cVar, 0);
        b10.h1(eVar.f12860b, eVar.f12861c);
    }

    public static void h(e eVar, int i10, boolean z10, int i11, int i12) {
        boolean z11;
        a.b bVar;
        int i13;
        String str;
        if ((i12 & 2) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if ((i12 & 8) != 0) {
            bVar = a.f12825a;
        } else {
            bVar = null;
        }
        if ((i12 & 16) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        eVar.getClass();
        l.f(bVar, "autoCancel");
        if (i10 != 0) {
            str = eVar.f12859a.getString(i10);
        } else {
            str = null;
        }
        d b10 = eVar.b();
        b10.i1(2, str, z11, false, bVar, i13);
        b10.h1(eVar.f12860b, eVar.f12861c);
    }

    public final void a() {
        WeakReference<d> weakReference = this.f12864f;
        d dVar = weakReference != null ? weakReference.get() : null;
        if (dVar == null) {
            r E = this.f12860b.E(this.f12861c);
            d dVar2 = E instanceof d ? (d) E : null;
            if (dVar2 != null) {
                this.f12864f = new WeakReference<>(dVar2);
            }
            dVar = dVar2;
        }
        if (dVar != null) {
            dVar.c1(false, false);
        }
    }

    public final d b() {
        a();
        d dVar = new d();
        int i10 = this.f12862d;
        int i11 = this.f12863e;
        if (j0.J(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + dVar + " to " + i10 + ", " + i11);
        }
        dVar.f2470p0 = i10;
        if (i10 == 2 || i10 == 3) {
            dVar.f2471q0 = 16973913;
        }
        if (i11 != 0) {
            dVar.f2471q0 = i11;
        }
        this.f12864f = new WeakReference<>(dVar);
        return dVar;
    }

    public final void c(String str, boolean z10, boolean z11, a aVar, int i10) {
        l.f(aVar, "autoCancel");
        d b10 = b();
        b10.i1(3, str, z10, z11, aVar, i10);
        b10.h1(this.f12860b, this.f12861c);
    }
}
