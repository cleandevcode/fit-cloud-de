package oh;

import com.topstep.fitcloud.pro.ui.camera.CameraFragment;
import p000do.a;
import y.q;

/* loaded from: classes2.dex */
public final class c extends gm.m implements fm.l<q, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ CameraFragment f23538b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CameraFragment cameraFragment) {
        super(1);
        this.f23538b = cameraFragment;
    }

    @Override // fm.l
    public final tl.l k(q qVar) {
        q qVar2 = qVar;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Camera");
        bVar.h("cameraState:%s", qVar2.b());
        q.a a10 = qVar2.a();
        if (a10 != null) {
            CameraFragment cameraFragment = this.f23538b;
            CameraFragment.a aVar = CameraFragment.F0;
            d7.e f12 = cameraFragment.f1();
            StringBuilder a11 = android.support.v4.media.d.a("Camera error:");
            a11.append(a10.b());
            d7.e.e(f12, a11.toString());
        }
        return tl.l.f28297a;
    }
}
