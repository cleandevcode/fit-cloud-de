package mg;

import android.os.CancellationSignal;
import java.util.Date;

/* loaded from: classes2.dex */
public final /* synthetic */ class j {
    public static CancellationSignal a(Date date, m2.y yVar, int i10) {
        yVar.p(i10, dg.a.b(date));
        return new CancellationSignal();
    }

    public static /* synthetic */ String b(int i10) {
        return i10 == 1 ? "BLOOD_GLUCOSE_METER" : "null";
    }
}
