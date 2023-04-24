package m7;

import android.content.Context;
import android.widget.LinearLayout;
import bi.r;
import com.github.kilnn.wheellayout.OneWheelLayout;
import com.github.kilnn.wheelview.WheelView;
import gm.l;
import java.util.Date;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public final class a extends LinearLayout implements n7.d {

    /* renamed from: a */
    public final GregorianCalendar f20393a;

    /* renamed from: b */
    public final OneWheelLayout f20394b;

    /* renamed from: c */
    public final OneWheelLayout f20395c;

    /* renamed from: d */
    public final OneWheelLayout f20396d;

    /* renamed from: e */
    public int f20397e;

    /* renamed from: f */
    public int f20398f;

    /* renamed from: g */
    public int f20399g;

    /* renamed from: h */
    public int f20400h;

    /* renamed from: i */
    public int f20401i;

    /* renamed from: j */
    public int f20402j;

    public a(Context context) {
        super(context, null, 0);
        this.f20393a = new GregorianCalendar();
        setOrientation(0);
        OneWheelLayout b10 = tb.a.b(this);
        b10.f5957a.f5974l.add(this);
        this.f20394b = b10;
        OneWheelLayout b11 = tb.a.b(this);
        b11.f5957a.f5974l.add(this);
        this.f20395c = b11;
        this.f20396d = tb.a.b(this);
    }

    @Override // n7.d
    public final void a(WheelView wheelView) {
        if (l.a(wheelView, this.f20394b.getWheelView())) {
            c();
        } else if (wheelView == this.f20395c.getWheelView()) {
            this.f20396d.setAdapterKey(d(this.f20394b.getValue(), this.f20395c.getValue()));
        }
    }

    @Override // n7.d
    public final void b(WheelView wheelView) {
    }

    public final void c() {
        int value = this.f20394b.getValue();
        this.f20395c.setAdapterKey(e(value));
        this.f20396d.setAdapterKey(d(value, this.f20395c.getValue()));
    }

    public final d d(int i10, int i11) {
        int i12;
        switch (i11) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                i12 = 31;
                break;
            case 2:
                if ((i10 % 4 == 0 && i10 % 100 != 0) || i10 % 400 == 0) {
                    i12 = 29;
                    break;
                } else {
                    i12 = 28;
                    break;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                i12 = 30;
                break;
            default:
                throw new IllegalArgumentException();
        }
        boolean z10 = false;
        if (i10 == this.f20397e && i11 == this.f20399g) {
            int i13 = this.f20401i;
            if (i13 == 1) {
                z10 = true;
            }
            return new d(i13, i12, z10);
        } else if (i10 == this.f20398f && i11 == this.f20400h) {
            int i14 = this.f20402j;
            if (i14 == i12) {
                z10 = true;
            }
            return new d(1, i14, z10);
        } else {
            return new d(1, i12, true);
        }
    }

    public final d e(int i10) {
        if (i10 == this.f20397e) {
            int i11 = this.f20399g;
            return new d(i11, 12, i11 == 1);
        } else if (i10 < this.f20398f) {
            return new d(1, 12, true);
        } else {
            int i12 = this.f20400h;
            return new d(1, i12, i12 == 12);
        }
    }

    public final void f(Date date, Date date2, String str, String str2, String str3, r rVar) {
        boolean z10;
        if (date == null) {
            date = tb.a.r(new int[]{1900, 1, 1}, this.f20393a);
        }
        if (date2 == null) {
            date2 = new Date();
        }
        if (date.compareTo(date2) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int[] s10 = tb.a.s(date, this.f20393a);
            this.f20397e = s10[0];
            this.f20399g = s10[1];
            this.f20401i = s10[2];
            int[] s11 = tb.a.s(date2, this.f20393a);
            int i10 = s11[0];
            this.f20398f = i10;
            this.f20400h = s11[1];
            this.f20402j = s11[2];
            this.f20394b.setConfig(new e(this.f20397e, i10, false, str, rVar));
            OneWheelLayout oneWheelLayout = this.f20395c;
            d e10 = e(this.f20397e);
            oneWheelLayout.setConfig(new e(e10.f20410a, e10.f20411b, e10.f20412c, str2, rVar));
            OneWheelLayout oneWheelLayout2 = this.f20396d;
            d d10 = d(this.f20397e, this.f20399g);
            oneWheelLayout2.setConfig(new e(d10.f20410a, d10.f20411b, d10.f20412c, str3, rVar));
            return;
        }
        throw new IllegalStateException("error:startDate after endData".toString());
    }

    public final void g(int i10, int i11, int i12) {
        this.f20394b.setValue(i10);
        c();
        this.f20395c.setValue(i11);
        this.f20396d.setAdapterKey(d(this.f20394b.getValue(), this.f20395c.getValue()));
        this.f20396d.setValue(i12);
    }

    public final int[] getDate() {
        int value = this.f20394b.getValue();
        int b10 = this.f20395c.b(e(value));
        return new int[]{value, b10, this.f20396d.b(d(value, b10))};
    }
}
