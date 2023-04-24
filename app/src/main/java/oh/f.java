package oh;

import android.widget.ImageView;
import com.topstep.fitcloud.pro.ui.camera.CameraFragment;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class f extends gm.m implements fm.l<ImageView, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ CameraFragment f23543b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CameraFragment cameraFragment) {
        super(1);
        this.f23543b = cameraFragment;
    }

    @Override // fm.l
    public final tl.l k(ImageView imageView) {
        int i10;
        gm.l.f(imageView, "it");
        CameraFragment cameraFragment = this.f23543b;
        if (cameraFragment.f10419y0 == 0) {
            cameraFragment.i1().imgFacing.setImageResource(R.drawable.ic_baseline_camera_rear_24);
            i10 = 1;
        } else {
            cameraFragment.i1().imgFacing.setImageResource(R.drawable.ic_baseline_camera_front_24);
            i10 = 0;
        }
        cameraFragment.f10419y0 = i10;
        this.f23543b.h1();
        return tl.l.f28297a;
    }
}
