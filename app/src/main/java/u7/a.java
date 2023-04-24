package u7;

import android.support.v4.media.d;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a */
    public DecimalFormat f28638a;

    /* renamed from: b */
    public int f28639b;

    public a(int i10) {
        this.f28639b = i10;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        StringBuilder a10 = d.a("###,###,###,##0");
        a10.append(stringBuffer.toString());
        this.f28638a = new DecimalFormat(a10.toString());
    }

    @Override // u7.c
    public final String a(float f10) {
        return this.f28638a.format(f10);
    }
}
