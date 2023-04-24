package pi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class k extends s7.h {

    /* renamed from: d */
    public final TextView f24271d;

    public k(Context context) {
        super(context, R.layout.layout_bar_chart_marker);
        View findViewById = findViewById(R.id.tv_value);
        gm.l.e(findViewById, "findViewById(R.id.tv_value)");
        this.f24271d = (TextView) findViewById;
    }

    @Override // s7.h, s7.d
    public final void b(t7.k kVar, v7.c cVar) {
        float a10;
        boolean z10;
        int i10;
        float[] fArr = ((t7.c) kVar).f27802d;
        if (fArr != null) {
            if (fArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((!z10) && (i10 = cVar.f29162g) != -1 && i10 < fArr.length) {
                a10 = fArr[i10];
                int i11 = (int) (a10 * 3600);
                TextView textView = this.f24271d;
                Context context = getContext();
                gm.l.e(context, "context");
                String string = context.getString(R.string.unit_hour_minute_param, Integer.valueOf(i11 / 3600), Integer.valueOf((i11 % 3600) / 60));
                gm.l.e(string, "context.getString(R.stri…3600, second % 3600 / 60)");
                textView.setText(string);
                super.b(kVar, cVar);
            }
        }
        a10 = kVar.a();
        int i112 = (int) (a10 * 3600);
        TextView textView2 = this.f24271d;
        Context context2 = getContext();
        gm.l.e(context2, "context");
        String string2 = context2.getString(R.string.unit_hour_minute_param, Integer.valueOf(i112 / 3600), Integer.valueOf((i112 % 3600) / 60));
        gm.l.e(string2, "context.getString(R.stri…3600, second % 3600 / 60)");
        textView2.setText(string2);
        super.b(kVar, cVar);
    }

    @Override // s7.h
    public a8.c getOffset() {
        return new a8.c(-(getWidth() / 2.0f), -getHeight());
    }
}
