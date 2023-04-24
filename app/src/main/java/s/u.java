package s;

import a2.b;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.net.Uri;
import android.util.Pair;
import android.view.Surface;
import androidx.camera.core.h;
import b6.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o5.d0;
import o5.y;
import t.d0;
import t.g;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26208a;

    /* renamed from: b */
    public final /* synthetic */ Object f26209b;

    /* renamed from: c */
    public final /* synthetic */ Object f26210c;

    public /* synthetic */ u(Object obj, Object obj2, int i10) {
        this.f26208a = i10;
        this.f26209b = obj;
        this.f26210c = obj2;
    }

    public /* synthetic */ u(String str, String str2) {
        this.f26208a = 10;
        this.f26210c = str;
        this.f26209b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26208a) {
            case 0:
                a0 a0Var = (a0) this.f26209b;
                String str = (String) this.f26210c;
                a0Var.getClass();
                a0Var.q("Use case " + str + " INACTIVE", null);
                a0Var.f25869a.d(str);
                a0Var.H();
                return;
            case 1:
                ((Surface) this.f26209b).release();
                ((SurfaceTexture) this.f26210c).release();
                return;
            case 2:
                ((g.c) this.f26209b).f27415a.onClosed((CameraCaptureSession) this.f26210c);
                return;
            case 3:
                ((d0.a) this.f26209b).f27407b.onCameraUnavailable((String) this.f26210c);
                return;
            case 4:
                ((h.i) this.f26209b).f1684e.a((androidx.camera.core.j) this.f26210c);
                return;
            case 5:
                ((h.c) ((androidx.camera.core.k) this.f26209b).f1713f).f1670a.a(new h.o((Uri) this.f26210c));
                return;
            case 6:
                h.o oVar = (h.o) this.f26210c;
                h.m c10 = ((z.j) this.f26209b).c();
                Objects.requireNonNull(c10);
                Objects.requireNonNull(oVar);
                c10.a(oVar);
                return;
            case 7:
                b.c cVar = (b.c) this.f26209b;
                b.c cVar2 = a2.b.f241a;
                gm.l.f(cVar, "$policy");
                gm.l.f((a2.g) this.f26210c, "$violation");
                cVar.getClass();
                throw null;
            case 8:
                ArrayList arrayList = (ArrayList) this.f26209b;
                o5.d0 d0Var = (o5.d0) this.f26210c;
                gm.l.f(arrayList, "$callbacks");
                gm.l.f(d0Var, "$requests");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    Object obj = pair.second;
                    gm.l.e(obj, "pair.second");
                    ((y.b) pair.first).b((o5.e0) obj);
                }
                Iterator it2 = d0Var.f22693d.iterator();
                while (it2.hasNext()) {
                    ((d0.a) it2.next()).a(d0Var);
                }
                return;
            case 9:
                Integer num = (Integer) this.f26209b;
                List list = (List) this.f26210c;
                gm.l.f(list, "$processedEvents");
                if (!ul.q.F(r5.f.f25262a, num) && ul.q.F(r5.f.f25263b, num)) {
                    if (r5.f.f25266e >= 5) {
                        r5.f.b().clear();
                        r5.f.f25266e = 0;
                        return;
                    }
                    r5.f.b().addAll(0, list);
                    r5.f.f25266e++;
                    return;
                }
                return;
            default:
                String str2 = (String) this.f26210c;
                String str3 = (String) this.f26209b;
                gm.l.f(str2, "$queriedEvent");
                gm.l.f(str3, "$buttonText");
                HashSet hashSet = b6.f.f4019e;
                f.a.c(str2, str3, new float[0]);
                return;
        }
    }
}
