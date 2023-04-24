package pi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import bi.m0;
import com.topstep.fitcloudpro.R;
import n6.a0;

/* loaded from: classes2.dex */
public final class m extends b {

    /* renamed from: h */
    public final boolean f24273h;

    /* renamed from: i */
    public final TextView f24274i;

    /* renamed from: j */
    public final TextView f24275j;

    /* renamed from: k */
    public final TextView f24276k;

    public m(Context context, boolean z10) {
        super(context);
        this.f24273h = z10;
        View findViewById = findViewById(R.id.tv_time);
        gm.l.e(findViewById, "findViewById(R.id.tv_time)");
        this.f24274i = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.tv_value);
        gm.l.e(findViewById2, "findViewById(R.id.tv_value)");
        TextView textView = (TextView) findViewById2;
        this.f24275j = textView;
        View findViewById3 = findViewById(R.id.tv_value2);
        gm.l.e(findViewById3, "findViewById(R.id.tv_value2)");
        TextView textView2 = (TextView) findViewById3;
        this.f24276k = textView2;
        textView2.setVisibility(0);
        int b10 = y0.a.b(context, R.color.temperature_body_color);
        textView.setTextColor(b10);
        m0.t(textView, b10);
        int b11 = y0.a.b(context, R.color.temperature_wrist_color);
        textView2.setTextColor(b11);
        m0.t(textView2, b11);
    }

    @Override // pi.b
    public final void c(String str, float f10, float f11) {
        this.f24274i.setText(str);
        TextView textView = this.f24275j;
        Context context = getContext();
        gm.l.e(context, "context");
        Context context2 = getContext();
        gm.l.e(context2, "context");
        textView.setText(qi.h.f(context, R.string.temperature_body, a0.q(context2, f10, this.f24273h)));
        TextView textView2 = this.f24276k;
        Context context3 = getContext();
        gm.l.e(context3, "context");
        Context context4 = getContext();
        gm.l.e(context4, "context");
        textView2.setText(qi.h.f(context3, R.string.temperature_wrist, a0.q(context4, f11, this.f24273h)));
    }
}
