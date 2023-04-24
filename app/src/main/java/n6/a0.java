package n6;

import android.content.Context;
import android.util.Base64;
import bi.m0;
import com.topstep.fitcloudpro.R;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import pm.e0;

/* loaded from: classes.dex */
public final class a0 {
    public static String a(int i10, int i11) {
        String format;
        if (i11 <= 0) {
            Locale locale = m0.f4330a;
            if (locale != null) {
                format = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            } else {
                gm.l.l("systemLocale");
                throw null;
            }
        } else {
            Locale locale2 = m0.f4330a;
            if (locale2 != null) {
                format = String.format(locale2, "%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}, 2));
            } else {
                gm.l.l("systemLocale");
                throw null;
            }
        }
        gm.l.e(format, "format(locale, format, *args)");
        return format;
    }

    public static String b(Context context, int i10) {
        Object[] objArr = new Object[1];
        Locale locale = m0.f4330a;
        if (locale != null) {
            objArr[0] = o5.a0.a(new Object[]{Integer.valueOf(i10)}, 1, locale, "%d", "format(locale, format, *args)");
            String string = context.getString(R.string.unit_mmhg_param, objArr);
            gm.l.e(string, "context.getString(R.stri… bloodPressureStr(value))");
            return string;
        }
        gm.l.l("systemLocale");
        throw null;
    }

    public static String c(float f10) {
        int i10 = (int) f10;
        Locale locale = m0.f4330a;
        if (locale != null) {
            return o5.a0.a(new Object[]{Integer.valueOf(i10)}, 1, locale, "%d", "format(locale, format, *args)");
        }
        gm.l.l("systemLocale");
        throw null;
    }

    public static String d(float f10, boolean z10) {
        if (!z10) {
            int i10 = hh.b.f16094a;
            f10 *= 0.6213712f;
        }
        if (f10 < 100.0f) {
            DecimalFormat decimalFormat = m0.f4332c;
            if (decimalFormat != null) {
                String format = decimalFormat.format(Double.parseDouble(String.valueOf(f10)));
                gm.l.e(format, "DECIMAL_2_FORMAT.format(…ue.toString().toDouble())");
                return format;
            }
            gm.l.l("DECIMAL_2_FORMAT");
            throw null;
        } else if (f10 <= 999.9d) {
            DecimalFormat decimalFormat2 = m0.f4331b;
            if (decimalFormat2 != null) {
                String format2 = decimalFormat2.format(Double.parseDouble(String.valueOf(f10)));
                gm.l.e(format2, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
                return format2;
            }
            gm.l.l("DECIMAL_1_FORMAT");
            throw null;
        } else {
            int i11 = (int) f10;
            Locale locale = m0.f4330a;
            if (locale != null) {
                return o5.a0.a(new Object[]{Integer.valueOf(i11)}, 1, locale, "%d", "format(locale, format, *args)");
            }
            gm.l.l("systemLocale");
            throw null;
        }
    }

    public static String e(float f10, boolean z10) {
        DecimalFormat decimalFormat;
        if (z10) {
            decimalFormat = m0.f4331b;
            if (decimalFormat == null) {
                gm.l.l("DECIMAL_1_FORMAT");
                throw null;
            }
        } else {
            int i10 = hh.b.f16094a;
            f10 *= 0.6213712f;
            decimalFormat = m0.f4331b;
            if (decimalFormat == null) {
                gm.l.l("DECIMAL_1_FORMAT");
                throw null;
            }
        }
        String format = decimalFormat.format(Double.parseDouble(String.valueOf(f10)));
        gm.l.e(format, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
        return format;
    }

    public static String f(long j10, boolean z10) {
        StringBuilder sb2;
        String str;
        if (j10 <= 0) {
            if (z10) {
                return "0KB";
            }
            return "?.?KB";
        }
        float f10 = (float) j10;
        if (f10 < 102.4f) {
            return "0.1KB";
        }
        if (j10 < 1048576) {
            sb2 = new StringBuilder();
            float f11 = f10 / 1024.0f;
            DecimalFormat decimalFormat = m0.f4331b;
            if (decimalFormat != null) {
                String format = decimalFormat.format(Double.parseDouble(String.valueOf(f11)));
                gm.l.e(format, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
                sb2.append(format);
                str = "KB";
            } else {
                gm.l.l("DECIMAL_1_FORMAT");
                throw null;
            }
        } else if (j10 < 1073741824) {
            sb2 = new StringBuilder();
            float f12 = f10 / ((float) 1048576);
            DecimalFormat decimalFormat2 = m0.f4331b;
            if (decimalFormat2 != null) {
                String format2 = decimalFormat2.format(Double.parseDouble(String.valueOf(f12)));
                gm.l.e(format2, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
                sb2.append(format2);
                str = "MB";
            } else {
                gm.l.l("DECIMAL_1_FORMAT");
                throw null;
            }
        } else {
            int i10 = (j10 > 1099511627776L ? 1 : (j10 == 1099511627776L ? 0 : -1));
            sb2 = new StringBuilder();
            if (i10 < 0) {
                float f13 = f10 / ((float) 1073741824);
                DecimalFormat decimalFormat3 = m0.f4331b;
                if (decimalFormat3 != null) {
                    String format3 = decimalFormat3.format(Double.parseDouble(String.valueOf(f13)));
                    gm.l.e(format3, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
                    sb2.append(format3);
                    str = "GB";
                } else {
                    gm.l.l("DECIMAL_1_FORMAT");
                    throw null;
                }
            } else {
                float f14 = f10 / ((float) 1099511627776L);
                DecimalFormat decimalFormat4 = m0.f4331b;
                if (decimalFormat4 != null) {
                    String format4 = decimalFormat4.format(Double.parseDouble(String.valueOf(f14)));
                    gm.l.e(format4, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
                    sb2.append(format4);
                    str = "TB";
                } else {
                    gm.l.l("DECIMAL_1_FORMAT");
                    throw null;
                }
            }
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static final String g(String str) {
        gm.l.f(str, "codeVerifier");
        if (j(str)) {
            try {
                byte[] bytes = str.getBytes(om.a.f23624b);
                gm.l.e(bytes, "(this as java.lang.String).getBytes(charset)");
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes, 0, bytes.length);
                String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                gm.l.e(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
                return encodeToString;
            } catch (Exception e10) {
                throw new o5.p(e10);
            }
        }
        throw new o5.p("Invalid Code Verifier.");
    }

    public static String h(int i10) {
        Locale locale = m0.f4330a;
        if (locale != null) {
            return o5.a0.a(new Object[]{Integer.valueOf(i10)}, 1, locale, "%d", "format(locale, format, *args)");
        }
        gm.l.l("systemLocale");
        throw null;
    }

    public static String i(Context context, int i10) {
        String string = context.getString(R.string.unit_hour_minute_param, Integer.valueOf(i10 / 3600), Integer.valueOf((i10 % 3600) / 60));
        gm.l.e(string, "context.getString(R.stri…3600, second % 3600 / 60)");
        return string;
    }

    public static final boolean j(String str) {
        boolean z10;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        Pattern compile = Pattern.compile("^[-._~A-Za-z0-9]+$");
        gm.l.e(compile, "compile(pattern)");
        return compile.matcher(str).matches();
    }

    public static String k(int i10) {
        Locale locale = m0.f4330a;
        if (locale != null) {
            return o5.a0.a(new Object[]{Integer.valueOf(i10)}, 1, locale, "%d", "format(locale, format, *args)");
        }
        gm.l.l("systemLocale");
        throw null;
    }

    public static String l(int i10) {
        Locale locale = m0.f4330a;
        if (locale != null) {
            return o5.a0.a(new Object[]{Integer.valueOf(i10 / 60), Integer.valueOf(i10 % 60)}, 2, locale, "%02d' %02d\"", "format(locale, format, *args)");
        }
        gm.l.l("systemLocale");
        throw null;
    }

    public static u1.c m(String str, e0 e0Var) {
        u1.a aVar = u1.a.f28468b;
        gm.l.f(str, "name");
        gm.l.f(e0Var, "scope");
        return new u1.c(str, aVar, e0Var);
    }

    public static String n(int i10) {
        Locale locale = m0.f4330a;
        if (locale != null) {
            return o5.a0.a(new Object[]{Integer.valueOf(i10)}, 1, locale, "%d", "format(locale, format, *args)");
        }
        gm.l.l("systemLocale");
        throw null;
    }

    public static String o(int i10) {
        Locale locale = m0.f4330a;
        if (locale != null) {
            return o5.a0.a(new Object[]{Integer.valueOf(i10)}, 1, locale, "%d", "format(locale, format, *args)");
        }
        gm.l.l("systemLocale");
        throw null;
    }

    public static String p(float f10, boolean z10) {
        if (!z10) {
            f10 = hh.b.e(f10);
        }
        DecimalFormat decimalFormat = m0.f4332c;
        if (decimalFormat == null) {
            gm.l.l("DECIMAL_2_FORMAT");
            throw null;
        }
        String format = decimalFormat.format(Double.parseDouble(String.valueOf(f10)));
        gm.l.e(format, "DECIMAL_2_FORMAT.format(…ue.toString().toDouble())");
        return format;
    }

    public static String q(Context context, float f10, boolean z10) {
        int i10;
        if (z10) {
            i10 = R.string.unit_centigrade_param;
        } else {
            i10 = R.string.unit_fahrenheit_param;
        }
        Object[] objArr = new Object[1];
        DecimalFormat decimalFormat = m0.f4332c;
        if (decimalFormat != null) {
            String format = decimalFormat.format(Double.parseDouble(String.valueOf(f10)));
            gm.l.e(format, "DECIMAL_2_FORMAT.format(…ue.toString().toDouble())");
            objArr[0] = format;
            String string = context.getString(i10, objArr);
            gm.l.e(string, "context.getString(strRes…rUtil.decimal2Str(value))");
            return string;
        }
        gm.l.l("DECIMAL_2_FORMAT");
        throw null;
    }

    public static String r(Context context, float f10, boolean z10) {
        String string;
        String str;
        gm.l.f(context, "context");
        if (z10) {
            int i10 = hh.b.f16094a;
            string = context.getString(R.string.unit_cm_param, Integer.valueOf(ih.v.o(f10)));
            str = "{\n            context.ge…isplayMetric())\n        }";
        } else {
            int i11 = hh.b.f16094a;
            int o10 = ih.v.o(f10 * 0.3937008f);
            int i12 = o10 / 12;
            string = context.getString(R.string.unit_feet_inch_param, Integer.valueOf(i12), Integer.valueOf(new int[]{i12, o10 % 12}[1]));
            str = "{\n            val array …y[0], array[1])\n        }";
        }
        gm.l.e(string, str);
        return string;
    }

    public static String s(Context context, int i10) {
        String string;
        String str;
        if (i10 == 0) {
            string = context.getString(R.string.user_info_sex_male);
            str = "{\n            context.ge…_info_sex_male)\n        }";
        } else {
            string = context.getString(R.string.user_info_sex_female);
            str = "{\n            context.ge…nfo_sex_female)\n        }";
        }
        gm.l.e(string, str);
        return string;
    }

    public static String t(Context context, float f10, boolean z10) {
        String string;
        String str;
        gm.l.f(context, "context");
        if (z10) {
            int i10 = hh.b.f16094a;
            string = context.getString(R.string.unit_kg_param, Float.valueOf(rm.l.t(f10)));
            str = "{\n            context.ge…isplayMetric())\n        }";
        } else {
            int i11 = hh.b.f16094a;
            string = context.getString(R.string.unit_lbs_param, Float.valueOf(rm.l.t(f10 * 2.2046225f)));
            str = "{\n            context.ge…playImperial())\n        }";
        }
        gm.l.e(string, str);
        return string;
    }
}
