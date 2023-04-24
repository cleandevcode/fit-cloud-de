package oh;

import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;
import com.topstep.fitcloud.pro.ui.camera.CameraFragment;
import p000do.a;

/* loaded from: classes2.dex */
public final class h extends gm.m implements fm.l<ImageView, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ CameraFragment f23545b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CameraFragment cameraFragment) {
        super(1);
        this.f23545b = cameraFragment;
    }

    @Override // fm.l
    public final tl.l k(ImageView imageView) {
        gm.l.f(imageView, "it");
        try {
            Intent a10 = y0.c.a("android.intent.action.MAIN", "android.intent.category.APP_GALLERY");
            gm.l.e(a10, "makeMainSelectorActivity…ent.CATEGORY_APP_GALLERY)");
            a10.addFlags(1073741824);
            this.f23545b.b1(a10);
        } catch (Exception e10) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("Camera");
            bVar.q(e10);
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("content://media/internal/images/media"));
                intent.addFlags(1073741824);
                this.f23545b.b1(intent);
            } catch (Exception e11) {
                a.b bVar2 = p000do.a.f13275a;
                bVar2.t("Camera");
                bVar2.q(e11);
            }
        }
        return tl.l.f28297a;
    }
}
