package b7;

import android.content.Context;
import android.os.RemoteException;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import gm.l;
import java.lang.ref.WeakReference;
import x6.f;
import x6.g;
import y6.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final WeakReference<Context> f4026a;

    /* renamed from: b */
    public WeakReference<a> f4027b;

    /* renamed from: c */
    public f f4028c;

    /* renamed from: d */
    public boolean f4029d;

    /* renamed from: e */
    public final d f4030e;

    /* renamed from: f */
    public final c f4031f;

    /* loaded from: classes.dex */
    public static class a extends g.a {
        public void a0() {
        }

        @Override // x6.g
        public void b(int i10) {
        }

        @Override // x6.g
        public void g(int i10) {
        }

        public void k() {
        }

        @Override // x6.g
        public void o0(y6.f fVar) {
            l.f(fVar, "latLng");
        }

        @Override // x6.g
        public void s0(int i10) {
        }

        @Override // x6.g
        public void y(double d10, double d11) {
        }
    }

    public b(SportingActivity sportingActivity, a aVar) {
        l.f(sportingActivity, "context");
        l.f(aVar, "simpleCallback");
        this.f4026a = new WeakReference<>(sportingActivity);
        this.f4027b = new WeakReference<>(aVar);
        this.f4030e = new d(this);
        this.f4031f = new c(this);
    }

    public final e a() {
        try {
            f fVar = this.f4028c;
            if (fVar != null) {
                return fVar.r0();
            }
            return null;
        } catch (RemoteException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
