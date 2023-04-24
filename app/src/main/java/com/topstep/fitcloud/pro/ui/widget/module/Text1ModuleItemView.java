package com.topstep.fitcloud.pro.ui.widget.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import bi.m0;
import com.topstep.fitcloud.pro.databinding.Text1ModuleItemViewBinding;
import com.topstep.fitcloudpro.R;
import g7.a;
import gm.l;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import n6.a0;

@Metadata
/* loaded from: classes2.dex */
public final class Text1ModuleItemView extends CardView {

    /* renamed from: h */
    public final Text1ModuleItemViewBinding f12482h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Text1ModuleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        Text1ModuleItemViewBinding inflate = Text1ModuleItemViewBinding.inflate(LayoutInflater.from(context), this);
        l.e(inflate, "inflate(LayoutInflater.from(context), this)");
        this.f12482h = inflate;
        setCardElevation(a.a(context, 1.0f));
    }

    public final void f(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            TextView textView = this.f12482h.tvText1;
            Context context = getContext();
            l.e(context, "context");
            String string = context.getString(R.string.unit_mmhg_param, a0.a(i10, i11));
            l.e(string, "context.getString(R.stri…oodPressureStr(sbp, dbp))");
            textView.setText(string);
            return;
        }
        this.f12482h.tvText1.setText(R.string.realtime_none_sbp_dbp);
    }

    public final void g(int i10) {
        if (i10 <= 0) {
            this.f12482h.tvText1.setText(R.string.realtime_none_normal);
            return;
        }
        TextView textView = this.f12482h.tvText1;
        Context context = getContext();
        l.e(context, "context");
        String string = context.getString(R.string.unit_frequency_per_minute_param, Integer.valueOf(i10));
        l.e(string, "context.getString(R.stri…_per_minute_param, value)");
        textView.setText(string);
    }

    public final void h(int i10) {
        if (i10 <= 0) {
            this.f12482h.tvText1.setText(R.string.realtime_none_normal);
            return;
        }
        TextView textView = this.f12482h.tvText1;
        Context context = getContext();
        l.e(context, "context");
        String string = context.getString(R.string.percent_param, Integer.valueOf(i10));
        l.e(string, "context.getString(R.string.percent_param, value)");
        textView.setText(string);
    }

    public final void i(int i10) {
        String string;
        String str;
        if (i10 <= 0) {
            this.f12482h.tvText1.setText(R.string.realtime_none_normal);
            return;
        }
        TextView textView = this.f12482h.tvText1;
        Context context = getContext();
        l.e(context, "context");
        StringBuilder sb2 = new StringBuilder();
        Locale locale = m0.f4330a;
        if (locale != null) {
            String format = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            l.e(format, "format(locale, format, *args)");
            sb2.append(format);
            sb2.append('(');
            if (i10 < 30) {
                string = context.getString(R.string.pressure_result_1);
                str = "{\n            context.ge…ssure_result_1)\n        }";
            } else if (i10 < 60) {
                string = context.getString(R.string.pressure_result_2);
                str = "{\n            context.ge…ssure_result_2)\n        }";
            } else if (i10 < 80) {
                string = context.getString(R.string.pressure_result_3);
                str = "{\n            context.ge…ssure_result_3)\n        }";
            } else {
                string = context.getString(R.string.pressure_result_4);
                str = "{\n            context.ge…ssure_result_4)\n        }";
            }
            l.e(string, str);
            sb2.append(string);
            sb2.append(')');
            textView.setText(sb2.toString());
            return;
        }
        l.l("systemLocale");
        throw null;
    }
}
