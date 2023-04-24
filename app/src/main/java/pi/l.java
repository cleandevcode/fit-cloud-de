package pi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import bi.m0;
import com.topstep.fitcloudpro.R;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class l extends s7.h {

    /* renamed from: d */
    public final TextView f24272d;

    public l(Context context) {
        super(context, R.layout.layout_bar_chart_marker);
        View findViewById = findViewById(R.id.tv_value);
        gm.l.e(findViewById, "findViewById(R.id.tv_value)");
        this.f24272d = (TextView) findViewById;
    }

    @Override // s7.h, s7.d
    public final void b(t7.k kVar, v7.c cVar) {
        t7.c cVar2;
        float[] fArr;
        boolean z10;
        int i10;
        float f10 = 0.0f;
        if (kVar instanceof t7.h) {
            t7.h hVar = (t7.h) kVar;
        } else {
            if ((kVar instanceof t7.c) && (fArr = (cVar2 = (t7.c) kVar).f27802d) != null) {
                if (fArr.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((!z10) && (i10 = cVar.f29162g) != -1 && i10 < fArr.length) {
                    if (i10 >= 0) {
                        int i11 = 0;
                        while (true) {
                            f10 += cVar2.f27802d[i11];
                            if (i11 == i10) {
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
            f10 = kVar.a();
        }
        int i12 = (int) f10;
        TextView textView = this.f24272d;
        Locale locale = m0.f4330a;
        if (locale != null) {
            String format = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
            gm.l.e(format, "format(locale, format, *args)");
            textView.setText(format);
            super.b(kVar, cVar);
            return;
        }
        gm.l.l("systemLocale");
        throw null;
    }

    @Override // s7.h
    public a8.c getOffset() {
        return new a8.c(-(getWidth() / 2.0f), -getHeight());
    }
}
