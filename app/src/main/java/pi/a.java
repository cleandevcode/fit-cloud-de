package pi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import bi.m0;
import com.topstep.fitcloudpro.R;
import n6.a0;

/* loaded from: classes2.dex */
public final class a extends b {

    /* renamed from: h */
    public final TextView f24252h;

    /* renamed from: i */
    public final TextView f24253i;

    /* renamed from: j */
    public final TextView f24254j;

    public a(Context context) {
        super(context);
        View findViewById = findViewById(R.id.tv_time);
        gm.l.e(findViewById, "findViewById(R.id.tv_time)");
        this.f24252h = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.tv_value);
        gm.l.e(findViewById2, "findViewById(R.id.tv_value)");
        TextView textView = (TextView) findViewById2;
        this.f24253i = textView;
        View findViewById3 = findViewById(R.id.tv_value2);
        gm.l.e(findViewById3, "findViewById(R.id.tv_value2)");
        TextView textView2 = (TextView) findViewById3;
        this.f24254j = textView2;
        textView2.setVisibility(0);
        m0.s(textView);
        m0.s(textView2);
    }

    @Override // pi.b
    public final void c(String str, float f10, float f11) {
        this.f24252h.setText(str);
        TextView textView = this.f24253i;
        Context context = getContext();
        gm.l.e(context, "context");
        Context context2 = getContext();
        gm.l.e(context2, "context");
        textView.setText(qi.h.f(context, R.string.user_info_sbp, a0.b(context2, (int) f10)));
        TextView textView2 = this.f24254j;
        Context context3 = getContext();
        gm.l.e(context3, "context");
        Context context4 = getContext();
        gm.l.e(context4, "context");
        textView2.setText(qi.h.f(context3, R.string.user_info_dbp, a0.b(context4, (int) f11)));
    }
}
