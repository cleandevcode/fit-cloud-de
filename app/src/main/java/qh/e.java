package qh;

import android.widget.TextView;
import bi.m0;
import com.topstep.fitcloudpro.R;
import gm.l;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import qh.a;

/* loaded from: classes2.dex */
public final class e extends a<vf.f> {
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a.C0450a c0450a, int i10) {
        a.C0450a c0450a2 = c0450a;
        List<? extends T> list = this.f24818e;
        if (list != 0) {
            vf.f fVar = (vf.f) list.get(i10);
            c0450a2.f24820u.tvTime.setText(this.f24817d.format(fVar.f29279a));
            c0450a2.f24820u.tvUnit.setText(R.string.unit_frequency_per_minute);
            TextView textView = c0450a2.f24820u.tvValue;
            int i11 = fVar.f29280b;
            Locale locale = m0.f4330a;
            if (locale != null) {
                String format = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
                l.e(format, "format(locale, format, *args)");
                textView.setText(format);
                p.b.g(c0450a2.f2927a, new d(c0450a2, this, list));
                return;
            }
            l.l("systemLocale");
            throw null;
        }
    }
}
