package z6;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.github.kilnn.sport.R;
import d9.k;
import gm.l;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a */
    public final ViewGroup f31984a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Context f31985a;

        /* renamed from: b */
        public final int f31986b;

        /* renamed from: c */
        public final int f31987c;

        /* renamed from: d */
        public final int f31988d;

        /* renamed from: e */
        public final int f31989e;

        /* renamed from: f */
        public final int f31990f;

        /* renamed from: g */
        public final int f31991g;

        /* renamed from: h */
        public final int f31992h;

        /* renamed from: i */
        public final int f31993i;

        /* renamed from: j */
        public final int f31994j;

        public a(Context context, int i10, int i11, int i12) {
            int i13 = R.drawable.ic_current_location;
            int i14 = R.drawable.ic_sport_start;
            int i15 = R.drawable.ic_sport_end;
            l.f(context, "context");
            this.f31985a = context;
            this.f31986b = -1157586711;
            this.f31987c = i10;
            this.f31988d = i13;
            this.f31989e = i14;
            this.f31990f = i15;
            this.f31991g = i11;
            this.f31992h = i12;
            this.f31993i = -14671830;
            this.f31994j = -1;
        }
    }

    public c(a aVar, FrameLayout frameLayout) {
        this.f31984a = frameLayout;
    }

    public final void a(Bundle bundle) {
        f fVar = ((g) this).f32007b;
        b9.b bVar = (b9.b) fVar.f31978d;
        bVar.getClass();
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            b9.h hVar = bVar.f4038a;
            hVar.getClass();
            hVar.c(bundle, new p8.d(hVar, bundle));
            if (bVar.f4038a.f23955a == null) {
                p8.a.a(bVar);
            }
            StrictMode.setThreadPolicy(threadPolicy);
            ((b9.b) fVar.f31978d).b(fVar);
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th2;
        }
    }

    public final void b() {
        f fVar = ((g) this).f32007b;
        b9.h hVar = ((b9.b) fVar.f31978d).f4038a;
        b9.g gVar = hVar.f23955a;
        if (gVar != null) {
            try {
                gVar.f4046b.onDestroy();
            } catch (RemoteException e10) {
                throw new k(e10);
            }
        } else {
            hVar.b(1);
        }
        fVar.f32002j = null;
    }

    public final void c() {
        b9.g gVar = ((b9.b) ((g) this).f32007b.f31978d).f4038a.f23955a;
        if (gVar != null) {
            try {
                gVar.f4046b.onLowMemory();
            } catch (RemoteException e10) {
                throw new k(e10);
            }
        }
    }

    public final void d() {
        f fVar = ((g) this).f32007b;
        fVar.f31977c = false;
        b9.h hVar = ((b9.b) fVar.f31978d).f4038a;
        b9.g gVar = hVar.f23955a;
        if (gVar != null) {
            try {
                gVar.f4046b.onPause();
                return;
            } catch (RemoteException e10) {
                throw new k(e10);
            }
        }
        hVar.b(5);
    }

    public final void e() {
        f fVar = ((g) this).f32007b;
        fVar.f31977c = true;
        b9.h hVar = ((b9.b) fVar.f31978d).f4038a;
        hVar.getClass();
        hVar.c(null, new p8.g(hVar));
        fVar.d();
    }

    public final void f(Bundle bundle) {
        l.f(bundle, "outState");
        f fVar = ((g) this).f32007b;
        fVar.getClass();
        b9.h hVar = ((b9.b) fVar.f31978d).f4038a;
        b9.g gVar = hVar.f23955a;
        if (gVar != null) {
            try {
                Bundle bundle2 = new Bundle();
                c9.k.b(bundle, bundle2);
                gVar.f4046b.onSaveInstanceState(bundle2);
                c9.k.b(bundle2, bundle);
                return;
            } catch (RemoteException e10) {
                throw new k(e10);
            }
        }
        Bundle bundle3 = hVar.f23956b;
        if (bundle3 != null) {
            bundle.putAll(bundle3);
        }
    }

    public final void g() {
        b9.h hVar = ((b9.b) ((g) this).f32007b.f31978d).f4038a;
        hVar.getClass();
        hVar.c(null, new p8.f(hVar));
    }

    public final void h() {
        b9.h hVar = ((b9.b) ((g) this).f32007b.f31978d).f4038a;
        b9.g gVar = hVar.f23955a;
        if (gVar != null) {
            try {
                gVar.f4046b.onStop();
                return;
            } catch (RemoteException e10) {
                throw new k(e10);
            }
        }
        hVar.b(4);
    }

    public final void i(List<y6.f> list) {
        f fVar = ((g) this).f32007b;
        fVar.f32001i.clear();
        if (list != null && (!list.isEmpty())) {
            fVar.f32001i.addAll(list);
        }
        fVar.d();
    }
}
