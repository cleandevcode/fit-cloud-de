package oh;

import android.widget.ImageView;
import com.topstep.fitcloud.pro.ui.camera.CameraFragment;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class g extends gm.m implements fm.l<ImageView, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ CameraFragment f23544b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CameraFragment cameraFragment) {
        super(1);
        this.f23544b = cameraFragment;
    }

    @Override // fm.l
    public final tl.l k(ImageView imageView) {
        ImageView imageView2;
        int i10;
        gm.l.f(imageView, "it");
        CameraFragment cameraFragment = this.f23544b;
        androidx.camera.core.h hVar = cameraFragment.A0;
        if (hVar != null) {
            int D = hVar.D();
            if (D != 0) {
                if (D != 1) {
                    if (D == 2) {
                        hVar.I(0);
                        imageView2 = cameraFragment.i1().imgFlash;
                        i10 = R.drawable.ic_baseline_flash_auto_24;
                    }
                } else {
                    hVar.I(2);
                    imageView2 = cameraFragment.i1().imgFlash;
                    i10 = R.drawable.ic_baseline_flash_off_24;
                }
            } else {
                hVar.I(1);
                imageView2 = cameraFragment.i1().imgFlash;
                i10 = R.drawable.ic_baseline_flash_on_24;
            }
            imageView2.setImageResource(i10);
        }
        return tl.l.f28297a;
    }
}
