package th;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.m0;
import com.topstep.fitcloud.pro.databinding.ItemAlarmListBinding;
import com.topstep.fitcloudpro.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import th.k;

/* loaded from: classes2.dex */
public final class k extends RecyclerView.e<a> {

    /* renamed from: d */
    public final f f28202d;

    /* renamed from: e */
    public b f28203e;

    /* renamed from: f */
    public List<? extends rj.a> f28204f;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemAlarmListBinding f28205u;

        public a(ItemAlarmListBinding itemAlarmListBinding) {
            super(itemAlarmListBinding.getRoot());
            this.f28205u = itemAlarmListBinding;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i10);

        void b(int i10, rj.a aVar);

        void c(int i10, rj.a aVar);
    }

    public k(f fVar) {
        gm.l.f(fVar, "helper");
        this.f28202d = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        List<? extends rj.a> list = this.f28204f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        final rj.a aVar2;
        boolean z10;
        final a aVar3 = aVar;
        List<? extends rj.a> list = this.f28204f;
        if (list != null && (aVar2 = list.get(i10)) != null) {
            Context context = aVar3.f2927a.getContext();
            f fVar = this.f28202d;
            gm.l.e(context, "context");
            Boolean bool = fVar.f28186a;
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                boolean is24HourFormat = DateFormat.is24HourFormat(context);
                fVar.f28186a = Boolean.valueOf(is24HourFormat);
                z10 = is24HourFormat;
            }
            if (z10) {
                aVar3.f28205u.tvAmPm.setVisibility(8);
                TextView textView = aVar3.f28205u.tvTime;
                int i11 = aVar2.f25761e;
                int i12 = aVar2.f25762f;
                Locale locale = m0.f4330a;
                if (locale != null) {
                    String format = String.format(locale, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i11), Integer.valueOf(i12)}, 2));
                    gm.l.e(format, "format(locale, format, *args)");
                    textView.setText(format);
                } else {
                    gm.l.l("systemLocale");
                    throw null;
                }
            } else {
                aVar3.f28205u.tvAmPm.setVisibility(0);
                int i13 = aVar2.f25761e;
                if (i13 < 12) {
                    aVar3.f28205u.tvAmPm.setText(R.string.ds_alarm_am);
                    if (i13 == 0) {
                        i13 = 12;
                    }
                } else {
                    aVar3.f28205u.tvAmPm.setText(R.string.ds_alarm_pm);
                    if (i13 > 12) {
                        i13 -= 12;
                    }
                }
                TextView textView2 = aVar3.f28205u.tvTime;
                int i14 = aVar2.f25762f;
                Locale locale2 = m0.f4330a;
                if (locale2 != null) {
                    String format2 = String.format(locale2, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i13), Integer.valueOf(i14)}, 2));
                    gm.l.e(format2, "format(locale, format, *args)");
                    textView2.setText(format2);
                } else {
                    gm.l.l("systemLocale");
                    throw null;
                }
            }
            aVar3.f28205u.tvLabel.setText(aVar2.f25765i);
            aVar3.f28205u.tvRepeat.setText(this.f28202d.a(context, aVar2.f25763g));
            aVar3.f28205u.switchIsEnabled.setOnCheckedChangeListener(null);
            aVar3.f28205u.switchIsEnabled.setChecked(aVar2.d());
            aVar3.f28205u.switchIsEnabled.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: th.i
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    k kVar = k.this;
                    k.a aVar4 = aVar3;
                    rj.a aVar5 = aVar2;
                    gm.l.f(kVar, "this$0");
                    gm.l.f(aVar4, "$holder");
                    gm.l.f(aVar5, "$alarm");
                    k.b bVar = kVar.f28203e;
                    if (bVar != null) {
                        int d10 = aVar4.d();
                        rj.a clone = aVar5.clone();
                        clone.f25764h = z11;
                        tl.l lVar = tl.l.f28297a;
                        bVar.b(d10, clone);
                    }
                }
            });
            aVar3.f28205u.tvDelete.setOnClickListener(new jc.w(this, aVar3, 1));
            aVar3.f28205u.layoutContent.setOnClickListener(new View.OnClickListener() { // from class: th.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k kVar = k.this;
                    k.a aVar4 = aVar3;
                    rj.a aVar5 = aVar2;
                    gm.l.f(kVar, "this$0");
                    gm.l.f(aVar4, "$holder");
                    gm.l.f(aVar5, "$alarm");
                    k.b bVar = kVar.f28203e;
                    if (bVar != null) {
                        bVar.c(aVar4.d(), aVar5);
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "viewGroup");
        ItemAlarmListBinding inflate = ItemAlarmListBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate, "inflate(\n               …roup, false\n            )");
        return new a(inflate);
    }
}
