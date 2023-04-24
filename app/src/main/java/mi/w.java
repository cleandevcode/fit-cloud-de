package mi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.ItemSportHistoryRecordBinding;
import com.topstep.fitcloud.pro.databinding.ItemSportHistorySeparatorBinding;
import com.topstep.fitcloud.pro.model.data.SportRecord;
import com.topstep.fitcloud.pro.ui.sport.SportDetailActivity;
import com.topstep.fitcloudpro.R;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import l2.f2;
import mi.z;

/* loaded from: classes2.dex */
public final class w extends f2<z, RecyclerView.b0> {

    /* renamed from: g */
    public final boolean f21868g;

    /* renamed from: h */
    public final SimpleDateFormat f21869h;

    /* renamed from: i */
    public final SimpleDateFormat f21870i;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemSportHistoryRecordBinding f21871u;

        public a(ItemSportHistoryRecordBinding itemSportHistoryRecordBinding) {
            super(itemSportHistoryRecordBinding.getRoot());
            this.f21871u = itemSportHistoryRecordBinding;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemSportHistorySeparatorBinding f21872u;

        public b(ItemSportHistorySeparatorBinding itemSportHistorySeparatorBinding) {
            super(itemSportHistorySeparatorBinding.getRoot());
            this.f21872u = itemSportHistorySeparatorBinding;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.l<View, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ Context f21873b;

        /* renamed from: c */
        public final /* synthetic */ z.a f21874c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, z.a aVar) {
            super(1);
            this.f21873b = context;
            this.f21874c = aVar;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            gm.l.f(view, "it");
            SportDetailActivity.a aVar = SportDetailActivity.B;
            Context context = this.f21873b;
            gm.l.e(context, "context");
            String uuid = this.f21874c.f21875a.f9627a.toString();
            gm.l.e(uuid, "item.record.sportId.toString()");
            aVar.getClass();
            SportDetailActivity.a.a(context, uuid, true);
            return tl.l.f28297a;
        }
    }

    public w(x xVar, boolean z10) {
        super(xVar);
        this.f21868g = z10;
        this.f21869h = bi.m0.k("MMM-dd");
        this.f21870i = new SimpleDateFormat("HH:mm", bi.m0.r());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int g(int i10) {
        z zVar = (z) this.f18885e.f18892f.f19021c.h(i10);
        if (zVar instanceof z.a) {
            return R.layout.item_sport_history_record;
        }
        if (zVar instanceof z.b) {
            return R.layout.item_sport_history_separator;
        }
        if (zVar == null) {
            throw new IllegalStateException("Unknown view");
        }
        throw new qa.p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.b0 b0Var, int i10) {
        DecimalFormat decimalFormat;
        z.a aVar;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        TextView textView;
        DecimalFormat decimalFormat2;
        Context context = b0Var.f2927a.getContext();
        boolean z11 = b0Var instanceof a;
        int i15 = R.string.unit_km;
        if (z11) {
            z A = A(i10);
            gm.l.d(A, "null cannot be cast to non-null type com.topstep.fitcloud.pro.ui.sport.SportHistoryModel.RecordModel");
            z.a aVar2 = (z.a) A;
            a aVar3 = (a) b0Var;
            aVar3.f21871u.tvDate.setText(this.f21869h.format(aVar2.f21875a.f9628b));
            aVar3.f21871u.tvTime.setText(this.f21870i.format(aVar2.f21875a.f9628b));
            int i16 = aVar2.f21875a.f9635i;
            if (i16 <= 0) {
                i12 = 0;
            } else {
                if (i16 <= 0) {
                    i11 = 0;
                } else {
                    i11 = (i16 - 1) % 4;
                }
                i12 = i16 - i11;
            }
            ih.v.c(16);
            String num = Integer.toString(i12, 16);
            gm.l.e(num, "toString(this, checkRadix(radix))");
            if (num.length() == 1) {
                num = '0' + num;
            }
            int identifier = context.getResources().getIdentifier(a.b.b("ic_sport_type_0x", num), "drawable", context.getPackageName());
            if (identifier == 0) {
                aVar3.f21871u.imgSportType.setImageResource(R.drawable.ic_sport_type_0x05);
            } else {
                aVar3.f21871u.imgSportType.setImageResource(identifier);
            }
            int i17 = aVar2.f21875a.f9635i;
            if (i17 <= 0) {
                i13 = 0;
            } else {
                i13 = (i17 - 1) % 4;
            }
            ImageView imageView = aVar3.f21871u.imgFlagWristband;
            gm.l.e(imageView, "holder.viewBind.imgFlagWristband");
            if (i13 != 0 && i13 != 1) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            imageView.setVisibility(i14);
            int a10 = SportRecord.a.a(aVar2.f21875a.f9635i);
            if (a10 != 0) {
                if (a10 != 1) {
                    aVar3.f21871u.imgMainAttr.setImageResource(R.drawable.ic_sport_data_distance);
                    aVar3.f21871u.tvMainAttr.setText("—— ——");
                    aVar3.f21871u.tvMainAttrUnit.setText((CharSequence) null);
                } else {
                    aVar3.f21871u.imgMainAttr.setImageResource(R.drawable.ic_sport_data_freq);
                    TextView textView2 = aVar3.f21871u.tvMainAttr;
                    int i18 = aVar2.f21875a.f9632f;
                    Locale locale = bi.m0.f4330a;
                    if (locale != null) {
                        String format = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i18)}, 1));
                        gm.l.e(format, "format(locale, format, *args)");
                        textView2.setText(format);
                        aVar3.f21871u.tvMainAttrUnit.setText(R.string.unit_step);
                    } else {
                        gm.l.l("systemLocale");
                        throw null;
                    }
                }
            } else {
                aVar3.f21871u.imgMainAttr.setImageResource(R.drawable.ic_sport_data_distance);
                if (this.f21868g) {
                    textView = aVar3.f21871u.tvMainAttrUnit;
                } else {
                    textView = aVar3.f21871u.tvMainAttrUnit;
                    i15 = R.string.unit_mi;
                }
                textView.setText(i15);
                TextView textView3 = aVar3.f21871u.tvMainAttr;
                float f10 = aVar2.f21875a.f9630d;
                if (this.f21868g) {
                    decimalFormat2 = bi.m0.f4331b;
                    if (decimalFormat2 == null) {
                        gm.l.l("DECIMAL_1_FORMAT");
                        throw null;
                    }
                } else {
                    int i19 = hh.b.f16094a;
                    f10 *= 0.6213712f;
                    decimalFormat2 = bi.m0.f4331b;
                    if (decimalFormat2 == null) {
                        gm.l.l("DECIMAL_1_FORMAT");
                        throw null;
                    }
                }
                String format2 = decimalFormat2.format(Double.parseDouble(String.valueOf(f10)));
                gm.l.e(format2, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
                textView3.setText(format2);
            }
            TextView textView4 = aVar3.f21871u.tvDuration;
            int i20 = aVar2.f21875a.f9629c;
            Locale locale2 = bi.m0.f4330a;
            if (locale2 != null) {
                int i21 = i20 % 3600;
                String format3 = String.format(locale2, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i20 / 3600), Integer.valueOf(i21 / 60), Integer.valueOf(i21 % 60)}, 3));
                gm.l.e(format3, "format(locale, format, *args)");
                textView4.setText(format3);
                TextView textView5 = aVar3.f21871u.tvCalories;
                int i22 = (int) aVar2.f21875a.f9631e;
                Locale locale3 = bi.m0.f4330a;
                if (locale3 != null) {
                    String format4 = String.format(locale3, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i22)}, 1));
                    gm.l.e(format4, "format(locale, format, *args)");
                    textView5.setText(format4);
                    p.b.g(b0Var.f2927a, new c(context, aVar2));
                    return;
                }
                gm.l.l("systemLocale");
                throw null;
            }
            gm.l.l("systemLocale");
            throw null;
        } else if (b0Var instanceof b) {
            z A2 = A(i10);
            gm.l.d(A2, "null cannot be cast to non-null type com.topstep.fitcloud.pro.ui.sport.SportHistoryModel.SeparatorModel");
            b bVar = (b) b0Var;
            bVar.f21872u.tvDate.setText(((z.b) A2).f21876a);
            float f11 = 0.0f;
            int i23 = 0;
            for (int i24 = i10 + 1; i24 < e(); i24++) {
                Object h10 = this.f18885e.f18892f.f19021c.h(i24);
                if (h10 instanceof z.a) {
                    aVar = (z.a) h10;
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    break;
                }
                i23++;
                f11 += aVar.f21875a.f9630d;
            }
            bVar.f21872u.tvCount.setText(context.getString(R.string.sport_cumulative_count, Integer.valueOf(i23)));
            if (this.f21868g) {
                bVar.f21872u.tvDistanceUnit.setText(R.string.unit_km);
            } else {
                bVar.f21872u.tvDistanceUnit.setText(R.string.unit_mi);
            }
            TextView textView6 = bVar.f21872u.tvDistance;
            if (this.f21868g) {
                decimalFormat = bi.m0.f4331b;
                if (decimalFormat == null) {
                    gm.l.l("DECIMAL_1_FORMAT");
                    throw null;
                }
            } else {
                int i25 = hh.b.f16094a;
                f11 *= 0.6213712f;
                decimalFormat = bi.m0.f4331b;
                if (decimalFormat == null) {
                    gm.l.l("DECIMAL_1_FORMAT");
                    throw null;
                }
            }
            String format5 = decimalFormat.format(Double.parseDouble(String.valueOf(f11)));
            gm.l.e(format5, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
            textView6.setText(format5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        if (i10 == R.layout.item_sport_history_record) {
            ItemSportHistoryRecordBinding inflate = ItemSportHistoryRecordBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
            gm.l.e(inflate, "inflate(\n               …, false\n                )");
            return new a(inflate);
        }
        ItemSportHistorySeparatorBinding inflate2 = ItemSportHistorySeparatorBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        gm.l.e(inflate2, "inflate(\n               …, false\n                )");
        return new b(inflate2);
    }
}
