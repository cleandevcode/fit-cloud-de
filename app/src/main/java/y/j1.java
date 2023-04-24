package y;

import a0.d2;
import android.content.Context;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.s;
import com.topstep.fitcloud.pro.MyApplication;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p0.c;
import s.h1;
import si.f;

/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements c.InterfaceC0425c, f.a {

    /* renamed from: a */
    public final /* synthetic */ int f30723a;

    /* renamed from: b */
    public final /* synthetic */ Object f30724b;

    /* renamed from: c */
    public final /* synthetic */ Object f30725c;

    public /* synthetic */ j1(Object obj, Object obj2, int i10) {
        this.f30723a = i10;
        this.f30724b = obj;
        this.f30725c = obj2;
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        MyApplication myApplication;
        sf.v vVar;
        Context context = (Context) this.f30724b;
        f.a aVar = (f.a) this.f30725c;
        gm.l.f(context, "$context");
        if (si.f.c(si.f.f27071a, context, h7.a.p("android.permission.READ_PHONE_STATE"))) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof MyApplication) {
                myApplication = (MyApplication) applicationContext;
            } else {
                myApplication = null;
            }
            if (myApplication != null && (vVar = myApplication.f9542i) != null) {
                vVar.a();
            }
        }
        if (aVar != null) {
            aVar.b(z10);
        }
    }

    @Override // p0.c.InterfaceC0425c
    public final String g(final c.a aVar) {
        switch (this.f30723a) {
            case 0:
                ((AtomicReference) this.f30724b).set(aVar);
                return ((String) this.f30725c) + "-cancellation";
            case 1:
                j0.d dVar = (j0.d) this.f30724b;
                dVar.f17234n = aVar;
                return "SettableFuture size: " + ((Size) this.f30725c) + " hashCode: " + dVar.hashCode();
            default:
                androidx.camera.view.f fVar = (androidx.camera.view.f) this.f30724b;
                Surface surface = (Surface) this.f30725c;
                fVar.getClass();
                u0.a("TextureViewImpl", "Surface set on Preview.");
                fVar.f1904h.a(surface, o8.b.i(), new j1.a() { // from class: z.g
                    @Override // j1.a
                    public final void accept(Object obj) {
                        boolean z10;
                        switch (r1) {
                            case 0:
                                h hVar = (h) aVar;
                                androidx.camera.core.j jVar = (androidx.camera.core.j) obj;
                                hVar.getClass();
                                p.b.f();
                                if (hVar.f31832a != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                h1.k(null, z10);
                                d2 b10 = jVar.d0().b();
                                hVar.f31832a.getClass();
                                Object a10 = b10.a(null);
                                Objects.requireNonNull(a10);
                                ((Integer) a10).intValue();
                                hVar.f31832a.getClass();
                                throw null;
                            default:
                                ((c.a) aVar).a((s.c) obj);
                                return;
                        }
                    }
                });
                return "provideSurface[request=" + fVar.f1904h + " surface=" + surface + "]";
        }
    }
}
