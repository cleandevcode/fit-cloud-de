package oh;

import android.widget.ImageButton;
import com.topstep.fitcloud.pro.ui.camera.CameraFragment;
import com.topstep.fitcloud.pro.ui.widget.CountDownView;

/* loaded from: classes2.dex */
public final class e extends gm.m implements fm.l<ImageButton, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ CameraFragment f23542b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CameraFragment cameraFragment) {
        super(1);
        this.f23542b = cameraFragment;
    }

    @Override // fm.l
    public final tl.l k(ImageButton imageButton) {
        boolean z10;
        gm.l.f(imageButton, "it");
        CameraFragment cameraFragment = this.f23542b;
        if (cameraFragment.A0 != null) {
            if (cameraFragment.i1().countDownView.f12256h > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                CountDownView countDownView = cameraFragment.i1().countDownView;
                if (countDownView.f12256h > 0) {
                    countDownView.f12256h = 0;
                    countDownView.f12255g.removeMessages(1);
                    countDownView.f12249a.setText((CharSequence) null);
                }
            }
            CountDownView countDownView2 = cameraFragment.i1().countDownView;
            countDownView2.f12249a.setText((CharSequence) null);
            countDownView2.f12258j = true;
            countDownView2.a(3);
        }
        return tl.l.f28297a;
    }
}
