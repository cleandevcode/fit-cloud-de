package t;

import a0.c1;
import android.graphics.Typeface;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.view.View;
import android.widget.EditText;
import androidx.camera.core.s;
import androidx.camera.view.PreviewView;
import d6.w;
import java.util.HashMap;
import p0.c;
import t.g;
import t.u;
import z0.f;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f27446a;

    /* renamed from: b */
    public final /* synthetic */ Object f27447b;

    /* renamed from: c */
    public final /* synthetic */ Object f27448c;

    public /* synthetic */ n(Object obj, Object obj2, int i10) {
        this.f27446a = i10;
        this.f27447b = obj;
        this.f27448c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27446a) {
            case 0:
                ((g.c) this.f27447b).f27415a.onReady((CameraCaptureSession) this.f27448c);
                return;
            case 1:
                ((u.b) this.f27447b).f27456a.onOpened((CameraDevice) this.f27448c);
                return;
            case 2:
                ((x.c) this.f27447b).b((c.a) this.f27448c);
                return;
            case 3:
                ((c1.a) this.f27448c).a(androidx.camera.core.n.this);
                return;
            case 4:
                ((s.e) this.f27447b).a((s.d) this.f27448c);
                return;
            case 5:
                ((z.e) this.f27447b).getClass();
                throw null;
            case 6:
                PreviewView.this.f1858k.a((androidx.camera.core.s) this.f27448c);
                return;
            case 7:
                ((f.e) this.f27447b).d((Typeface) this.f27448c);
                return;
            case 8:
                androidx.lifecycle.e eVar = (androidx.lifecycle.e) this.f27447b;
                Runnable runnable = (Runnable) this.f27448c;
                gm.l.f(eVar, "this$0");
                gm.l.f(runnable, "$runnable");
                if (eVar.f2707d.offer(runnable)) {
                    eVar.a();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
            case 9:
                Runnable runnable2 = (Runnable) this.f27447b;
                m2.c0 c0Var = (m2.c0) this.f27448c;
                gm.l.f(runnable2, "$command");
                gm.l.f(c0Var, "this$0");
                try {
                    runnable2.run();
                    return;
                } finally {
                    c0Var.a();
                }
            case 10:
                View view = (View) this.f27447b;
                q5.e eVar2 = (q5.e) this.f27448c;
                HashMap hashMap = q5.e.f24597e;
                if (!i6.a.b(q5.e.class)) {
                    try {
                        gm.l.f(view, "$view");
                        gm.l.f(eVar2, "this$0");
                        if (view instanceof EditText) {
                            eVar2.b(view);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        i6.a.a(q5.e.class, th2);
                        return;
                    }
                }
                return;
            default:
                d6.w wVar = d6.w.f12811a;
                ((w.b) this.f27447b).b();
                return;
        }
    }
}
