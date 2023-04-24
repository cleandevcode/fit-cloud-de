package v;

import a0.q1;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import y.u0;

/* loaded from: classes.dex */
public final class e implements q1 {

    /* renamed from: a */
    public final List<Size> f28959a;

    public e(t.t tVar) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) tVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            u0.b("CamcorderProfileResolutionQuirk", "StreamConfigurationMap is null");
        }
        Size[] sizeArr = null;
        if (Build.VERSION.SDK_INT < 23) {
            if (streamConfigurationMap != null) {
                sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            }
        } else if (streamConfigurationMap != null) {
            sizeArr = streamConfigurationMap.getOutputSizes(34);
        }
        List<Size> asList = sizeArr != null ? Arrays.asList((Size[]) sizeArr.clone()) : Collections.emptyList();
        this.f28959a = asList;
        u0.a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + asList);
    }
}
