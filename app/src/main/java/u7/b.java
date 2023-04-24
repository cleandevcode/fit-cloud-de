package u7;

import android.support.v4.media.d;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a */
    public DecimalFormat f28640a;

    public b(int i10) {
        b(i10);
    }

    @Override // u7.c
    public final String a(float f10) {
        return this.f28640a.format(f10);
    }

    public final void b(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        StringBuilder a10 = d.a("###,###,###,##0");
        a10.append(stringBuffer.toString());
        this.f28640a = new DecimalFormat(a10.toString());
    }
}
