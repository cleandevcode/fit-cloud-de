package pi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import bi.m0;
import com.topstep.fitcloudpro.R;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class h extends b {

    /* renamed from: h */
    public final TextView f24266h;

    /* renamed from: i */
    public final TextView f24267i;

    public h(Context context) {
        super(context);
        View findViewById = findViewById(R.id.tv_time);
        gm.l.e(findViewById, "findViewById(R.id.tv_time)");
        this.f24266h = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.tv_value);
        gm.l.e(findViewById2, "findViewById(R.id.tv_value)");
        this.f24267i = (TextView) findViewById2;
    }

    @Override // pi.b
    public final void c(String str, float f10, float f11) {
        int i10;
        this.f24266h.setText(str);
        int i11 = (int) f10;
        TextView textView = this.f24267i;
        Locale locale = m0.f4330a;
        if (locale != null) {
            String format = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
            gm.l.e(format, "format(locale, format, *args)");
            textView.setText(format);
            if (i11 < 30) {
                i10 = R.color.pressure_level_color1;
            } else if (i11 < 60) {
                i10 = R.color.pressure_level_color2;
            } else if (i11 < 80) {
                i10 = R.color.pressure_level_color3;
            } else {
                i10 = R.color.pressure_level_color4;
            }
            m0.t(this.f24267i, y0.a.b(getContext(), i10));
            return;
        }
        gm.l.l("systemLocale");
        throw null;
    }
}
