package oh;

import android.net.Uri;
import android.os.Build;
import androidx.camera.core.h;
import com.topstep.fitcloud.pro.ui.camera.CameraFragment;
import com.topstep.fitcloud.pro.ui.widget.CountDownView;
import com.topstep.fitcloudpro.R;
import fm.p;
import mf.a0;
import p000do.a;
import pm.e0;
import y.n0;

/* loaded from: classes2.dex */
public final class d implements h.m {

    /* renamed from: a */
    public final /* synthetic */ CameraFragment f23539a;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.camera.CameraFragment$shutter$1$onError$1", f = "CameraFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public final /* synthetic */ CameraFragment f23540e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CameraFragment cameraFragment, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f23540e = cameraFragment;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f23540e, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            CameraFragment cameraFragment = this.f23540e;
            CameraFragment.a aVar = CameraFragment.F0;
            d7.e.d(cameraFragment.f1(), R.string.photo_take_failed, null, 0, 30);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.camera.CameraFragment$shutter$1$onImageSaved$2", f = "CameraFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public final /* synthetic */ CameraFragment f23541e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CameraFragment cameraFragment, xl.d<? super b> dVar) {
            super(2, dVar);
            this.f23541e = cameraFragment;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b(this.f23541e, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            CameraFragment cameraFragment = this.f23541e;
            CameraFragment.a aVar = CameraFragment.F0;
            d7.e.h(cameraFragment.f1(), R.string.photo_take_success, false, 0, 30);
            return tl.l.f28297a;
        }
    }

    public d(CameraFragment cameraFragment) {
        this.f23539a = cameraFragment;
    }

    @Override // androidx.camera.core.h.m
    public final void a(h.o oVar) {
        CameraFragment cameraFragment = this.f23539a;
        CameraFragment.a aVar = CameraFragment.F0;
        CountDownView countDownView = cameraFragment.i1().countDownView;
        countDownView.f12251c.play(countDownView.f12254f, 1.0f, 1.0f, 0, 0, 1.0f);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f23539a.i1().getRoot().postDelayed(new androidx.activity.b(10, this.f23539a), 100L);
        }
        Uri uri = oVar.f1705a;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Camera");
        bVar.h("Photo capture succeeded: " + uri, new Object[0]);
        rm.l.g(this.f23539a).e(new b(this.f23539a, null));
    }

    @Override // androidx.camera.core.h.m
    public final void b(n0 n0Var) {
        gm.l.f(n0Var, "exc");
        a.b bVar = p000do.a.f13275a;
        bVar.t("Camera");
        bVar.e(n0Var, "Photo capture failed: " + n0Var.getMessage(), new Object[0]);
        rm.l.g(this.f23539a).e(new a(this.f23539a, null));
    }
}
