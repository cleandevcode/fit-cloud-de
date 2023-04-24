package androidx.camera.view;

import a0.a0;
import a0.b0;
import a0.l1;
import androidx.camera.view.PreviewView;
import y.u0;

/* loaded from: classes.dex */
public final class a implements l1<b0.a> {

    /* renamed from: a */
    public final a0 f1874a;

    /* renamed from: b */
    public final androidx.lifecycle.a0<PreviewView.g> f1875b;

    /* renamed from: c */
    public PreviewView.g f1876c;

    /* renamed from: d */
    public final c f1877d;

    /* renamed from: e */
    public d0.d f1878e;

    /* renamed from: f */
    public boolean f1879f = false;

    public a(a0 a0Var, androidx.lifecycle.a0<PreviewView.g> a0Var2, c cVar) {
        this.f1874a = a0Var;
        this.f1875b = a0Var2;
        this.f1877d = cVar;
        synchronized (this) {
            this.f1876c = a0Var2.d();
        }
    }

    public final void a(PreviewView.g gVar) {
        synchronized (this) {
            if (this.f1876c.equals(gVar)) {
                return;
            }
            this.f1876c = gVar;
            u0.a("StreamStateObserver", "Update Preview stream state to " + gVar);
            this.f1875b.k(gVar);
        }
    }
}
