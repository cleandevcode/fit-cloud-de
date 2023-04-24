package ph;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.topstep.fitcloud.pro.ui.widget.HealthCalendarView;
import com.topstep.fitcloudpro.R;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class f0 extends f.q {
    public static final /* synthetic */ int C0 = 0;
    public final SimpleDateFormat B0 = bi.m0.k("yyyy-MMM");

    /* loaded from: classes2.dex */
    public interface a {
        void w(Date date);
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        Serializable serializable;
        Object obj;
        View inflate = k0().inflate(R.layout.dialog_health_calendar, (ViewGroup) null);
        gm.l.e(inflate, "layoutInflater.inflate(R…og_health_calendar, null)");
        ImageView imageView = (ImageView) inflate.findViewById(R.id.img_arrow_left);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.img_arrow_right);
        final TextView textView = (TextView) inflate.findViewById(R.id.tv_date);
        View findViewById = inflate.findViewById(R.id.calendar_view);
        gm.l.e(findViewById, "view.findViewById(R.id.calendar_view)");
        final HealthCalendarView healthCalendarView = (HealthCalendarView) findViewById;
        Bundle g02 = g0();
        if (g02 != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                serializable = g02.getSerializable("select_date", Date.class);
            } else {
                Serializable serializable2 = g02.getSerializable("select_date");
                if (!(serializable2 instanceof Date)) {
                    serializable2 = null;
                }
                serializable = (Date) serializable2;
            }
            Date date = (Date) serializable;
            if (i10 >= 33) {
                obj = g02.getSerializable("mark_date", Date[].class);
            } else {
                Object serializable3 = g02.getSerializable("mark_date");
                obj = (Date[]) (serializable3 instanceof Date[] ? serializable3 : null);
            }
            Calendar calendar = Calendar.getInstance();
            Date date2 = new Date();
            calendar.setTime(date2);
            calendar.set(5, calendar.get(5) - 30);
            healthCalendarView.b(date, calendar.getTime(), date2, (Date[]) obj);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: ph.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthCalendarView healthCalendarView2 = HealthCalendarView.this;
                TextView textView2 = textView;
                f0 f0Var = this;
                int i11 = f0.C0;
                gm.l.f(healthCalendarView2, "$calendarView");
                gm.l.f(f0Var, "this$0");
                healthCalendarView2.f12347g.setTime(healthCalendarView2.f12348h);
                Calendar calendar2 = healthCalendarView2.f12347g;
                calendar2.set(2, calendar2.get(2) - 1);
                healthCalendarView2.f12348h = healthCalendarView2.f12347g.getTime();
                healthCalendarView2.invalidate();
                textView2.setText(f0Var.B0.format(healthCalendarView2.getYearMonth()));
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: ph.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthCalendarView healthCalendarView2 = HealthCalendarView.this;
                TextView textView2 = textView;
                f0 f0Var = this;
                int i11 = f0.C0;
                gm.l.f(healthCalendarView2, "$calendarView");
                gm.l.f(f0Var, "this$0");
                healthCalendarView2.f12347g.setTime(healthCalendarView2.f12348h);
                Calendar calendar2 = healthCalendarView2.f12347g;
                calendar2.set(2, calendar2.get(2) + 1);
                healthCalendarView2.f12348h = healthCalendarView2.f12347g.getTime();
                healthCalendarView2.invalidate();
                textView2.setText(f0Var.B0.format(healthCalendarView2.getYearMonth()));
            }
        });
        healthCalendarView.setOnDateSelectListener(new jc.f(3, this));
        textView.setText(this.B0.format(healthCalendarView.getYearMonth()));
        v9.b bVar = new v9.b(V0());
        bVar.m(inflate);
        return bVar.a();
    }
}
