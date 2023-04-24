package s;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.i2;

/* loaded from: classes.dex */
public final class q2 extends i2.a {

    /* renamed from: a */
    public final ArrayList f26135a;

    /* loaded from: classes.dex */
    public static class a extends i2.a {

        /* renamed from: a */
        public final CameraCaptureSession.StateCallback f26136a;

        public a(List<CameraCaptureSession.StateCallback> list) {
            CameraCaptureSession.StateCallback b1Var;
            if (list.isEmpty()) {
                b1Var = new c1();
            } else if (list.size() == 1) {
                b1Var = list.get(0);
            } else {
                b1Var = new b1(list);
            }
            this.f26136a = b1Var;
        }

        @Override // s.i2.a
        public final void k(l2 l2Var) {
            this.f26136a.onActive(l2Var.f().f27412a.f27449a);
        }

        @Override // s.i2.a
        public final void l(l2 l2Var) {
            t.d.b(this.f26136a, l2Var.f().f27412a.f27449a);
        }

        @Override // s.i2.a
        public final void m(i2 i2Var) {
            this.f26136a.onClosed(i2Var.f().f27412a.f27449a);
        }

        @Override // s.i2.a
        public final void n(i2 i2Var) {
            this.f26136a.onConfigureFailed(i2Var.f().f27412a.f27449a);
        }

        @Override // s.i2.a
        public final void o(l2 l2Var) {
            this.f26136a.onConfigured(l2Var.f().f27412a.f27449a);
        }

        @Override // s.i2.a
        public final void p(l2 l2Var) {
            this.f26136a.onReady(l2Var.f().f27412a.f27449a);
        }

        @Override // s.i2.a
        public final void q(i2 i2Var) {
        }

        @Override // s.i2.a
        public final void r(l2 l2Var, Surface surface) {
            t.b.a(this.f26136a, l2Var.f().f27412a.f27449a, surface);
        }
    }

    public q2(List<i2.a> list) {
        ArrayList arrayList = new ArrayList();
        this.f26135a = arrayList;
        arrayList.addAll(list);
    }

    @Override // s.i2.a
    public final void k(l2 l2Var) {
        Iterator it = this.f26135a.iterator();
        while (it.hasNext()) {
            ((i2.a) it.next()).k(l2Var);
        }
    }

    @Override // s.i2.a
    public final void l(l2 l2Var) {
        Iterator it = this.f26135a.iterator();
        while (it.hasNext()) {
            ((i2.a) it.next()).l(l2Var);
        }
    }

    @Override // s.i2.a
    public final void m(i2 i2Var) {
        Iterator it = this.f26135a.iterator();
        while (it.hasNext()) {
            ((i2.a) it.next()).m(i2Var);
        }
    }

    @Override // s.i2.a
    public final void n(i2 i2Var) {
        Iterator it = this.f26135a.iterator();
        while (it.hasNext()) {
            ((i2.a) it.next()).n(i2Var);
        }
    }

    @Override // s.i2.a
    public final void o(l2 l2Var) {
        Iterator it = this.f26135a.iterator();
        while (it.hasNext()) {
            ((i2.a) it.next()).o(l2Var);
        }
    }

    @Override // s.i2.a
    public final void p(l2 l2Var) {
        Iterator it = this.f26135a.iterator();
        while (it.hasNext()) {
            ((i2.a) it.next()).p(l2Var);
        }
    }

    @Override // s.i2.a
    public final void q(i2 i2Var) {
        Iterator it = this.f26135a.iterator();
        while (it.hasNext()) {
            ((i2.a) it.next()).q(i2Var);
        }
    }

    @Override // s.i2.a
    public final void r(l2 l2Var, Surface surface) {
        Iterator it = this.f26135a.iterator();
        while (it.hasNext()) {
            ((i2.a) it.next()).r(l2Var, surface);
        }
    }
}
