package pi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import bi.m0;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class g extends b {

    /* renamed from: h */
    public final TextView f24264h;

    /* renamed from: i */
    public final TextView f24265i;

    public g(Context context) {
        super(context);
        View findViewById = findViewById(R.id.tv_time);
        gm.l.e(findViewById, "findViewById(R.id.tv_time)");
        this.f24264h = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.tv_value);
        gm.l.e(findViewById2, "findViewById(R.id.tv_value)");
        TextView textView = (TextView) findViewById2;
        this.f24265i = textView;
        m0.s(textView);
    }

    @Override // pi.b
    public final void c(String str, float f10, float f11) {
        this.f24264h.setText(str);
        TextView textView = this.f24265i;
        Context context = getContext();
        gm.l.e(context, "context");
        Context context2 = getContext();
        gm.l.e(context2, "context");
        String string = context2.getString(R.string.percent_param, Integer.valueOf((int) f10));
        gm.l.e(string, "context.getString(R.string.percent_param, value)");
        textView.setText(qi.h.f(context, R.string.oxygen_module, string));
    }
}
