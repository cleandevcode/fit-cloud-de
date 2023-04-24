package qh;

import android.content.Context;
import android.widget.TextView;
import bi.m0;
import com.topstep.fitcloudpro.R;
import gm.l;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import qh.a;

/* loaded from: classes2.dex */
public final class g extends a<vf.k> {
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a.C0450a c0450a, int i10) {
        Context context;
        int i11;
        a.C0450a c0450a2 = c0450a;
        List<? extends T> list = this.f24818e;
        if (list != 0) {
            vf.k kVar = (vf.k) list.get(i10);
            c0450a2.f24820u.tvTime.setText(this.f24817d.format(kVar.f29287a));
            int i12 = kVar.f29288b;
            if (i12 < 90) {
                context = c0450a2.f2927a.getContext();
                i11 = R.color.oxygen_des_color1;
            } else if (i12 <= 93) {
                context = c0450a2.f2927a.getContext();
                i11 = R.color.oxygen_des_color2;
            } else {
                context = c0450a2.f2927a.getContext();
                i11 = R.color.oxygen_des_color3;
            }
            int b10 = y0.a.b(context, i11);
            c0450a2.f24820u.tvUnit.setText(R.string.percent);
            c0450a2.f24820u.tvUnit.setTextColor(b10);
            TextView textView = c0450a2.f24820u.tvValue;
            int i13 = kVar.f29288b;
            Locale locale = m0.f4330a;
            if (locale != null) {
                String format = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
                l.e(format, "format(locale, format, *args)");
                textView.setText(format);
                c0450a2.f24820u.tvValue.setTextColor(b10);
                p.b.g(c0450a2.f2927a, new f(c0450a2, this, list));
                return;
            }
            l.l("systemLocale");
            throw null;
        }
    }
}
