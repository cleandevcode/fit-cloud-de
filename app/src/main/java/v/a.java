package v;

import a0.q1;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;

/* loaded from: classes.dex */
public final class a implements q1 {

    /* renamed from: a */
    public final Range<Integer> f28957a;

    public a(t.t tVar) {
        Range[] rangeArr = (Range[]) tVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range<Integer> range3 = new Range<>(Integer.valueOf(((Integer) range2.getLower()).intValue() >= 1000 ? ((Integer) range2.getLower()).intValue() / 1000 : ((Integer) range2.getLower()).intValue()), Integer.valueOf(((Integer) range2.getUpper()).intValue() >= 1000 ? ((Integer) range2.getUpper()).intValue() / 1000 : ((Integer) range2.getUpper()).intValue()));
                if (range3.getUpper().intValue() == 30 && (range == null || range3.getLower().intValue() < range.getLower().intValue())) {
                    range = range3;
                }
            }
        }
        this.f28957a = range;
    }
}
