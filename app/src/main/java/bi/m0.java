package bi;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.format.DateFormat;
import android.widget.TextView;
import com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment;
import com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment;
import com.topstep.fitcloud.pro.ui.dialog.TimePickerDialogFragment;
import com.topstep.fitcloudpro.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import pm.g1;
import pm.j1;

/* loaded from: classes2.dex */
public class m0 {

    /* renamed from: a */
    public static Locale f4330a;

    /* renamed from: b */
    public static DecimalFormat f4331b;

    /* renamed from: c */
    public static DecimalFormat f4332c;

    public static final void A(int i10, int i11, Object[] objArr) {
        gm.l.f(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    public static void B(byte[] bArr, int i10, int i11, boolean z10) {
        int i12 = i10 - (i11 / 8);
        int i13 = bArr[i12] & 255;
        int i14 = 1 << (i11 % 8);
        if (z10) {
            bArr[i12] = (byte) ((i14 & i14) | ((~i14) & i13));
            return;
        }
        bArr[i12] = (byte) ((i14 & 0) | ((~i14) & i13));
    }

    public static final void C(int i10, lh.c cVar) {
        gm.l.f(cVar, "<this>");
        int i11 = SelectIntDialogFragment.C0;
        SelectIntDialogFragment.a.a(1, 6, 30, i10, cVar.V0().getString(R.string.ds_interval_time), cVar.V0().getString(R.string.unit_minute)).h1(cVar.h0(), "interval");
    }

    public static final void D(int i10, lh.c cVar) {
        gm.l.f(cVar, "<this>");
        int i11 = TimePickerDialogFragment.B0;
        TimePickerDialogFragment.a.a(i10, cVar.o0(R.string.ds_end_time)).h1(cVar.h0(), "end_time");
    }

    public static final void E(int i10, lh.h hVar) {
        gm.l.f(hVar, "<this>");
        String[] strArr = {hVar.V0().getString(R.string.user_info_sex_male), hVar.V0().getString(R.string.user_info_sex_female)};
        int i11 = ChoiceIntDialogFragment.B0;
        ChoiceIntDialogFragment.a.a(hVar.V0().getString(R.string.user_info_sex), i10, new int[]{0, 1}, strArr).h1(hVar.h0(), "sex");
    }

    public static final void F(int i10, lh.c cVar) {
        gm.l.f(cVar, "<this>");
        int i11 = TimePickerDialogFragment.B0;
        TimePickerDialogFragment.a.a(i10, cVar.o0(R.string.ds_start_time)).h1(cVar.h0(), "start_time");
    }

    public static pm.r a() {
        return new pm.r(null);
    }

    public static j1 b() {
        return new j1(null);
    }

    public static final Object[] c(int i10) {
        if (i10 >= 0) {
            return new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final boolean d(int i10, int i11, int i12, byte[] bArr, byte[] bArr2) {
        gm.l.f(bArr, "a");
        gm.l.f(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment e(lh.c r8, nj.k.d r9, int r10, int r11, int r12) {
        /*
            int[] r0 = r9.a()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            int r3 = r0.length
            if (r3 != 0) goto Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            r3 = r3 ^ r1
            if (r3 != r1) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            r4 = 0
            if (r3 == 0) goto L7d
            if (r11 == 0) goto L55
            if (r11 == r1) goto L3d
            r3 = 2
            if (r11 != r3) goto L37
            int r11 = r0.length
            java.lang.String[] r3 = new java.lang.String[r11]
            r5 = 0
        L22:
            if (r5 >= r11) goto L6c
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r7 = r0[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r2] = r7
            java.lang.String r6 = r8.p0(r10, r6)
            r3[r5] = r6
            int r5 = r5 + 1
            goto L22
        L37:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L3d:
            int r11 = r0.length
            java.lang.String[] r3 = new java.lang.String[r11]
            r0 = 0
        L41:
            if (r0 >= r11) goto L6c
            java.lang.Object[] r5 = new java.lang.Object[r1]
            int r6 = r0 + 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5[r2] = r7
            java.lang.String r5 = r8.p0(r10, r5)
            r3[r0] = r5
            r0 = r6
            goto L41
        L55:
            int r11 = r0.length
            java.lang.String[] r3 = new java.lang.String[r11]
            r0 = 0
        L59:
            if (r0 >= r11) goto L6c
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5[r2] = r6
            java.lang.String r5 = r8.p0(r10, r5)
            r3[r0] = r5
            int r0 = r0 + 1
            goto L59
        L6c:
            int r10 = com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment.B0
            int r9 = r9.f22450d
            android.content.Context r8 = r8.V0()
            java.lang.String r8 = r8.getString(r12)
            com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment r8 = com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment.a.a(r8, r9, r4, r3)
            return r8
        L7d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.m0.e(lh.c, nj.k$d, int, int, int):com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment");
    }

    public static final void f(xl.f fVar, CancellationException cancellationException) {
        int i10 = pm.g1.K;
        pm.g1 g1Var = (pm.g1) fVar.b(g1.b.f24341a);
        if (g1Var != null) {
            g1Var.h(cancellationException);
        }
    }

    public static final void g(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static pn.n h(int i10) {
        return (i10 == 4 || i10 == 5) ? new pn.s(i10) : new pn.n(i10);
    }

    public static String i(float f10) {
        DecimalFormat decimalFormat = f4331b;
        if (decimalFormat == null) {
            gm.l.l("DECIMAL_1_FORMAT");
            throw null;
        }
        String format = decimalFormat.format(Double.parseDouble(String.valueOf(f10)));
        gm.l.e(format, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
        return format;
    }

    public static final void j(xl.f fVar) {
        pm.g1 g1Var = (pm.g1) fVar.b(g1.b.f24341a);
        if (g1Var != null && !g1Var.a()) {
            throw g1Var.v();
        }
    }

    public static SimpleDateFormat k(String str) {
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(r(), str);
        gm.l.e(bestDateTimePattern, "pattern");
        Pattern compile = Pattern.compile(",");
        gm.l.e(compile, "compile(pattern)");
        String replaceAll = compile.matcher(bestDateTimePattern).replaceAll("");
        gm.l.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        Pattern compile2 = Pattern.compile("'à'");
        gm.l.e(compile2, "compile(pattern)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("");
        gm.l.e(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
        Pattern compile3 = Pattern.compile(" {2,}");
        gm.l.e(compile3, "compile(pattern)");
        String replaceAll3 = compile3.matcher(replaceAll2).replaceAll(" ");
        gm.l.e(replaceAll3, "nativePattern.matcher(in…).replaceAll(replacement)");
        return new SimpleDateFormat(replaceAll3, r());
    }

    public static SimpleDateFormat l() {
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(r(), "MM/dd");
        gm.l.e(bestDateTimePattern, "pattern");
        return new SimpleDateFormat(om.h.Y(om.h.Y(bestDateTimePattern, "-", "/"), ".", "/"), r());
    }

    public static SimpleDateFormat m() {
        return k("yyyy-MMM-dd");
    }

    public static SimpleDateFormat n() {
        return k("yyyy-MMM-dd HH:mm");
    }

    public static r o() {
        return new r();
    }

    public static final Class p(mm.b bVar) {
        gm.l.f(bVar, "<this>");
        Class<?> b10 = ((gm.d) bVar).b();
        gm.l.d(b10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return b10;
    }

    public static final Class q(mm.b bVar) {
        gm.l.f(bVar, "<this>");
        Class<?> b10 = ((gm.d) bVar).b();
        if (b10.isPrimitive()) {
            String name = b10.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    return !name.equals("double") ? b10 : Double.class;
                case 104431:
                    return !name.equals("int") ? b10 : Integer.class;
                case 3039496:
                    return !name.equals("byte") ? b10 : Byte.class;
                case 3052374:
                    return !name.equals("char") ? b10 : Character.class;
                case 3327612:
                    return !name.equals("long") ? b10 : Long.class;
                case 3625364:
                    return !name.equals("void") ? b10 : Void.class;
                case 64711720:
                    return !name.equals("boolean") ? b10 : Boolean.class;
                case 97526364:
                    return !name.equals("float") ? b10 : Float.class;
                case 109413500:
                    return !name.equals("short") ? b10 : Short.class;
                default:
                    return b10;
            }
        }
        return b10;
    }

    public static Locale r() {
        Locale locale = f4330a;
        if (locale != null) {
            return locale;
        }
        gm.l.l("systemLocale");
        throw null;
    }

    public static final void s(TextView textView) {
        Context context = textView.getContext();
        gm.l.e(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.colorPrimary});
        gm.l.e(obtainStyledAttributes, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        t(textView, color);
    }

    public static final void t(TextView textView, int i10) {
        gm.l.f(textView, "<this>");
        int a10 = g7.a.a(textView.getContext(), 4.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i10);
        shapeDrawable.setBounds(0, 0, a10, a10);
        textView.setCompoundDrawables(shapeDrawable, textView.getCompoundDrawables()[1], textView.getCompoundDrawables()[2], textView.getCompoundDrawables()[3]);
    }

    public static void u(Locale locale) {
        f4330a = locale;
        p000do.a.f13275a.h("systemLocale:%s,%s,%s", locale.toString(), locale.getCountry(), locale.getLanguage());
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        gm.l.d(numberFormat, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        f4331b = decimalFormat;
        decimalFormat.applyPattern("0.0");
        DecimalFormat decimalFormat2 = f4331b;
        if (decimalFormat2 == null) {
            gm.l.l("DECIMAL_1_FORMAT");
            throw null;
        }
        decimalFormat2.setRoundingMode(RoundingMode.DOWN);
        NumberFormat numberFormat2 = NumberFormat.getInstance(locale);
        gm.l.d(numberFormat2, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormat decimalFormat3 = (DecimalFormat) numberFormat2;
        f4332c = decimalFormat3;
        decimalFormat3.applyPattern("0.00");
        DecimalFormat decimalFormat4 = f4332c;
        if (decimalFormat4 != null) {
            decimalFormat4.setRoundingMode(RoundingMode.DOWN);
        } else {
            gm.l.l("DECIMAL_2_FORMAT");
            throw null;
        }
    }

    public static String v(int i10) {
        return o5.a0.a(new Object[]{Integer.valueOf(i10)}, 1, r(), "%d", "format(locale, format, *args)");
    }

    public static boolean w(int i10, int i11) {
        return (i10 & i11) > 0;
    }

    public static boolean x(byte[] bArr, int i10, int i11) {
        return ((bArr[i10 - (i11 / 8)] & 255) & (1 << (i11 % 8))) > 0;
    }

    public static String y(int i10) {
        return o5.a0.a(new Object[]{Integer.valueOf(i10 / 60), Integer.valueOf(i10 % 60)}, 2, r(), "%d:%02d", "format(locale, format, *args)");
    }

    public static String z(int i10) {
        switch (i10) {
            case 258:
                return "INVALID STATE";
            case 259:
                return "NOT SUPPORTED";
            case 260:
                return "DATA SIZE EXCEEDS LIMIT";
            case 261:
                return "INVALID CRC ERROR";
            case 262:
                return "OPERATION FAILED";
            default:
                return androidx.activity.i.a("UNKNOWN (", i10, ")");
        }
    }
}
