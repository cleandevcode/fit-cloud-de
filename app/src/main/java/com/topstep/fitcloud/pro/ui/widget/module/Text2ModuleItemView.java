package com.topstep.fitcloud.pro.ui.widget.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import bi.m0;
import com.topstep.fitcloud.pro.databinding.Text2ModuleItemViewBinding;
import com.topstep.fitcloudpro.R;
import g7.a;
import gm.l;
import hh.b;
import java.text.DecimalFormat;
import kotlin.Metadata;
import qi.h;

@Metadata
/* loaded from: classes2.dex */
public final class Text2ModuleItemView extends CardView {

    /* renamed from: h */
    public final Text2ModuleItemViewBinding f12483h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Text2ModuleItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        Text2ModuleItemViewBinding inflate = Text2ModuleItemViewBinding.inflate(LayoutInflater.from(context), this);
        l.e(inflate, "inflate(LayoutInflater.from(context), this)");
        this.f12483h = inflate;
        setCardElevation(a.a(context, 1.0f));
    }

    public final void f(boolean z10) {
        String string;
        String str;
        Context context = getContext();
        l.e(context, "context");
        String string2 = context.getString(R.string.realtime_none_temperature);
        l.e(string2, "context.getString(R.stri…ealtime_none_temperature)");
        if (z10) {
            string = context.getString(R.string.unit_centigrade_param, string2);
            str = "{\n            context.ge…de_param, none)\n        }";
        } else {
            string = context.getString(R.string.unit_fahrenheit_param, string2);
            str = "{\n            context.ge…it_param, none)\n        }";
        }
        l.e(string, str);
        TextView textView = this.f12483h.tvText1;
        Context context2 = getContext();
        l.e(context2, "context");
        textView.setText(h.f(context2, R.string.temperature_body, string));
        TextView textView2 = this.f12483h.tvText2;
        Context context3 = getContext();
        l.e(context3, "context");
        textView2.setText(h.f(context3, R.string.temperature_wrist, string));
    }

    public final void g(float f10, float f11, boolean z10) {
        float e10;
        int i10;
        String str;
        float e11;
        int i11;
        String string;
        String str2;
        if (f10 <= 0.0f) {
            TextView textView = this.f12483h.tvText1;
            Context context = getContext();
            l.e(context, "context");
            Context context2 = getContext();
            l.e(context2, "context");
            String string2 = context2.getString(R.string.realtime_none_temperature);
            l.e(string2, "context.getString(R.stri…ealtime_none_temperature)");
            Object[] objArr = new Object[1];
            if (z10) {
                objArr[0] = string2;
                string = context2.getString(R.string.unit_centigrade_param, objArr);
                str2 = "{\n            context.ge…de_param, none)\n        }";
            } else {
                objArr[0] = string2;
                string = context2.getString(R.string.unit_fahrenheit_param, objArr);
                str2 = "{\n            context.ge…it_param, none)\n        }";
            }
            l.e(string, str2);
            textView.setText(h.f(context, R.string.temperature_body, string));
            str = "DECIMAL_2_FORMAT";
        } else {
            TextView textView2 = this.f12483h.tvText1;
            Context context3 = getContext();
            l.e(context3, "context");
            Context context4 = getContext();
            l.e(context4, "context");
            if (z10) {
                e10 = f10;
                i10 = R.string.unit_centigrade_param;
            } else {
                e10 = b.e(f10);
                i10 = R.string.unit_fahrenheit_param;
            }
            Object[] objArr2 = new Object[1];
            DecimalFormat decimalFormat = m0.f4332c;
            if (decimalFormat != null) {
                str = "DECIMAL_2_FORMAT";
                String format = decimalFormat.format(Double.parseDouble(String.valueOf(e10)));
                l.e(format, "DECIMAL_2_FORMAT.format(…ue.toString().toDouble())");
                objArr2[0] = format;
                String string3 = context4.getString(i10, objArr2);
                l.e(string3, "context.getString(strRes…Util.decimal2Str(result))");
                textView2.setText(h.f(context3, R.string.temperature_body, string3));
            } else {
                l.l("DECIMAL_2_FORMAT");
                throw null;
            }
        }
        TextView textView3 = this.f12483h.tvText2;
        Context context5 = getContext();
        l.e(context5, "context");
        Context context6 = getContext();
        l.e(context6, "context");
        if (z10) {
            e11 = f11;
            i11 = R.string.unit_centigrade_param;
        } else {
            e11 = b.e(f11);
            i11 = R.string.unit_fahrenheit_param;
        }
        Object[] objArr3 = new Object[1];
        DecimalFormat decimalFormat2 = m0.f4332c;
        if (decimalFormat2 != null) {
            String format2 = decimalFormat2.format(Double.parseDouble(String.valueOf(e11)));
            l.e(format2, "DECIMAL_2_FORMAT.format(…ue.toString().toDouble())");
            objArr3[0] = format2;
            String string4 = context6.getString(i11, objArr3);
            l.e(string4, "context.getString(strRes…Util.decimal2Str(result))");
            textView3.setText(h.f(context5, R.string.temperature_wrist, string4));
            return;
        }
        l.l(str);
        throw null;
    }

    public final void h(String str, String str2) {
        this.f12483h.tvText1.setText(str);
        this.f12483h.tvText2.setText(str2);
    }
}
