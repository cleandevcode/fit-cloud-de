package wb;

import android.content.Context;
import android.content.res.AssetManager;
import com.huawei.hms.framework.network.grs.GrsApp;
import dc.c;
import dc.e;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final ec.a f29778a = new ec.a();

    public static c a(Context context) {
        try {
            AssetManager assets = context.getAssets();
            return new c(new e(assets.open(GrsApp.getInstance().getBrand("/") + "grs_sp.bks")));
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }
}
