package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.os.RemoteException;
import android.util.Log;
import android.widget.ImageButton;
import androidx.emoji2.text.f;
import androidx.emoji2.text.l;
import com.topstep.fitcloud.pro.ui.camera.CameraFragment;
import f1.o;
import java.nio.MappedByteBuffer;
import java.util.concurrent.ExecutorService;
import m2.m;
import s5.d;

/* loaded from: classes.dex */
public final /* synthetic */ class r2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1527a;

    /* renamed from: b */
    public final /* synthetic */ Object f1528b;

    public /* synthetic */ r2(int i10, Object obj) {
        this.f1527a = i10;
        this.f1528b = obj;
    }

    private final void a() {
        l.b bVar = (l.b) this.f1528b;
        synchronized (bVar.f2279d) {
            if (bVar.f2283h != null) {
                try {
                    g1.m d10 = bVar.d();
                    int i10 = d10.f14836e;
                    if (i10 == 2) {
                        synchronized (bVar.f2279d) {
                        }
                    }
                    if (i10 == 0) {
                        int i11 = f1.o.f14038a;
                        o.a.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        l.a aVar = bVar.f2278c;
                        Context context = bVar.f2276a;
                        aVar.getClass();
                        Typeface b10 = a1.g.f221a.b(context, new g1.m[]{d10}, 0);
                        MappedByteBuffer e10 = a1.o.e(bVar.f2276a, d10.f14832a);
                        if (e10 != null && b10 != null) {
                            try {
                                o.a.a("EmojiCompat.MetadataRepo.create");
                                androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(b10, androidx.emoji2.text.m.a(e10));
                                o.a.b();
                                o.a.b();
                                synchronized (bVar.f2279d) {
                                    f.h hVar = bVar.f2283h;
                                    if (hVar != null) {
                                        hVar.b(nVar);
                                    }
                                }
                                bVar.b();
                                return;
                            } catch (Throwable th2) {
                                int i12 = f1.o.f14038a;
                                o.a.b();
                                throw th2;
                            }
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                } catch (Throwable th3) {
                    synchronized (bVar.f2279d) {
                        f.h hVar2 = bVar.f2283h;
                        if (hVar2 != null) {
                            hVar2.a(th3);
                        }
                        bVar.b();
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1527a) {
            case 0:
                ((u2) this.f1528b).c(false);
                return;
            case 1:
                ((a0.j) this.f1528b).a();
                return;
            case 2:
                ((androidx.camera.core.o) this.f1528b).a();
                return;
            case 3:
                androidx.camera.core.g gVar = (androidx.camera.core.g) this.f1528b;
                synchronized (gVar.f1651u) {
                    gVar.f1653w = null;
                    androidx.camera.core.j jVar = gVar.f1652v;
                    if (jVar != null) {
                        gVar.f1652v = null;
                        gVar.f(jVar);
                    }
                }
                return;
            case 4:
                ((ExecutorService) this.f1528b).shutdown();
                return;
            case 5:
                ((z.i) this.f1528b).b();
                return;
            case 6:
                a();
                return;
            case 7:
                t2.b(this.f1528b);
                gm.l.f(null, "this$0");
                throw null;
            case 8:
                m2.o oVar = (m2.o) this.f1528b;
                gm.l.f(oVar, "this$0");
                try {
                    m2.k kVar = oVar.f20248f;
                    if (kVar != null) {
                        oVar.f20246d = kVar.h0(oVar.f20249g, oVar.f20243a);
                        m2.m mVar = oVar.f20244b;
                        m.c cVar = oVar.f20247e;
                        if (cVar != null) {
                            mVar.a(cVar);
                            return;
                        } else {
                            gm.l.l("observer");
                            throw null;
                        }
                    }
                    return;
                } catch (RemoteException e10) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
                    return;
                }
            case 9:
                p5.p pVar = (p5.p) this.f1528b;
                String str = p5.i.f23913a;
                if (!i6.a.b(p5.i.class)) {
                    try {
                        gm.l.f(pVar, "$reason");
                        p5.i.d(pVar);
                        return;
                    } catch (Throwable th2) {
                        i6.a.a(p5.i.class, th2);
                        return;
                    }
                }
                return;
            case 10:
                s5.d dVar = (s5.d) this.f1528b;
                d.a aVar = s5.d.f26589f;
                if (!i6.a.b(s5.d.class)) {
                    try {
                        gm.l.f(dVar, "this$0");
                        dVar.b();
                        return;
                    } catch (Throwable th3) {
                        i6.a.a(s5.d.class, th3);
                        return;
                    }
                }
                return;
            case 11:
                d6.r.f((d6.r) this.f1528b);
                return;
            case 12:
                ImageButton imageButton = (ImageButton) this.f1528b;
                gm.l.f(imageButton, "$this_simulateClick");
                imageButton.invalidate();
                imageButton.setPressed(false);
                return;
            default:
                CameraFragment cameraFragment = (CameraFragment) this.f1528b;
                gm.l.f(cameraFragment, "this$0");
                CameraFragment.a aVar2 = CameraFragment.F0;
                cameraFragment.i1().getRoot().setForeground(null);
                return;
        }
    }
}
