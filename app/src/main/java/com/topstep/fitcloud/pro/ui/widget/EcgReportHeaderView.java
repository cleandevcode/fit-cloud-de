package com.topstep.fitcloud.pro.ui.widget;

import a.b;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.topstep.fitcloudpro.R;
import java.util.List;
import vf.d;

/* loaded from: classes2.dex */
public class EcgReportHeaderView extends FrameLayout {

    /* renamed from: a */
    public int f12284a;

    public EcgReportHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12284a = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void setEcgInfo(d dVar) {
        int i10;
        ((TextView) findViewById(R.id.text_hr)).setText(R.string.ecg_report_avg_heart_rate);
        ((TextView) findViewById(R.id.tv_hr)).setText(getResources().getString(R.string.unit_frequency_per_minute_param, Integer.valueOf(dVar.f29273a)));
        ((TextView) findViewById(R.id.text_result)).setText(R.string.ecg_report_diagnosis);
        List<Integer> list = dVar.f29274b;
        if (list != null && list.size() > 0 && !list.contains(0)) {
            String str = "";
            boolean z10 = false;
            for (Integer num : list) {
                switch (num.intValue()) {
                    case 1:
                        i10 = R.string.ecg_report_diagnosis_result4;
                        break;
                    case 2:
                        i10 = R.string.ecg_report_diagnosis_result3;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        if (!z10) {
                            i10 = R.string.ecg_report_diagnosis_result9;
                            z10 = true;
                            break;
                        }
                        i10 = 0;
                        break;
                    case 8:
                        i10 = R.string.ecg_report_diagnosis_result8;
                        break;
                    case 9:
                        i10 = R.string.ecg_report_diagnosis_result6;
                        break;
                    case 10:
                        i10 = R.string.ecg_report_diagnosis_result2;
                        break;
                    case 11:
                        i10 = R.string.ecg_report_diagnosis_result1;
                        break;
                    case 17:
                        i10 = R.string.ecg_report_diagnosis_result7;
                        break;
                    case 18:
                        i10 = R.string.ecg_report_diagnosis_result5;
                        break;
                    default:
                        i10 = 0;
                        break;
                }
                if (i10 != 0) {
                    if (!TextUtils.isEmpty(str)) {
                        str = b.b(str, "、");
                    }
                    StringBuilder a10 = android.support.v4.media.d.a(str);
                    a10.append(getResources().getString(i10));
                    str = a10.toString();
                }
            }
            ((TextView) findViewById(R.id.tv_result)).setText(getResources().getString(R.string.ecg_report_diagnosis_unusual, str));
        } else {
            ((TextView) findViewById(R.id.tv_result)).setText(R.string.ecg_report_diagnosis_normal);
        }
        ((TextView) findViewById(R.id.tv_result_des)).setText(R.string.ecg_report_diagnosis_des);
    }

    public void setAlgorithmResult(d dVar) {
        if (this.f12284a == 0) {
            return;
        }
        setEcgInfo(dVar);
    }
}
