package zm;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a */
    public final String f32623a;

    /* renamed from: b */
    public final String f32624b;

    /* renamed from: c */
    public final long f32625c;

    /* renamed from: d */
    public final String f32626d;

    /* renamed from: e */
    public final String f32627e;

    /* renamed from: f */
    public final boolean f32628f;

    /* renamed from: g */
    public final boolean f32629g;

    /* renamed from: h */
    public final boolean f32630h;

    /* renamed from: i */
    public final boolean f32631i;

    /* renamed from: n */
    public static final a f32622n = new a();

    /* renamed from: j */
    public static final Pattern f32618j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f32619k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f32620l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f32621m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* loaded from: classes2.dex */
    public static final class a {
        public static int a(int i10, int i11, String str, boolean z10) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        public static long b(int i10, String str) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            int a10 = a(0, i10, str, false);
            Matcher matcher = i.f32621m.matcher(str);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            while (a10 < i10) {
                int a11 = a(a10 + 1, i10, str, true);
                matcher.region(a10, a11);
                if (i12 == -1 && matcher.usePattern(i.f32621m).matches()) {
                    String group = matcher.group(1);
                    gm.l.e(group, "matcher.group(1)");
                    i12 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    gm.l.e(group2, "matcher.group(2)");
                    i15 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    gm.l.e(group3, "matcher.group(3)");
                    i16 = Integer.parseInt(group3);
                } else if (i13 == -1 && matcher.usePattern(i.f32620l).matches()) {
                    String group4 = matcher.group(1);
                    gm.l.e(group4, "matcher.group(1)");
                    i13 = Integer.parseInt(group4);
                } else {
                    if (i14 == -1) {
                        Pattern pattern = i.f32619k;
                        if (matcher.usePattern(pattern).matches()) {
                            String group5 = matcher.group(1);
                            gm.l.e(group5, "matcher.group(1)");
                            Locale locale = Locale.US;
                            gm.l.e(locale, "Locale.US");
                            String lowerCase = group5.toLowerCase(locale);
                            gm.l.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            String pattern2 = pattern.pattern();
                            gm.l.e(pattern2, "MONTH_PATTERN.pattern()");
                            i14 = om.l.h0(pattern2, lowerCase, 0, false, 6) / 4;
                        }
                    }
                    if (i11 == -1 && matcher.usePattern(i.f32618j).matches()) {
                        String group6 = matcher.group(1);
                        gm.l.e(group6, "matcher.group(1)");
                        i11 = Integer.parseInt(group6);
                    }
                }
                a10 = a(a11 + 1, i10, str, false);
            }
            if (70 <= i11 && 99 >= i11) {
                i11 += 1900;
            }
            if (i11 >= 0 && 69 >= i11) {
                i11 += 2000;
            }
            if (i11 >= 1601) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i14 != -1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (1 <= i13 && 31 >= i13) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        if (i12 >= 0 && 23 >= i12) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            if (i15 >= 0 && 59 >= i15) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                if (i16 >= 0 && 59 >= i16) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(an.c.f638d);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i11);
                                    gregorianCalendar.set(2, i14 - 1);
                                    gregorianCalendar.set(5, i13);
                                    gregorianCalendar.set(11, i12);
                                    gregorianCalendar.set(12, i15);
                                    gregorianCalendar.set(13, i16);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public i(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f32623a = str;
        this.f32624b = str2;
        this.f32625c = j10;
        this.f32626d = str3;
        this.f32627e = str4;
        this.f32628f = z10;
        this.f32629g = z11;
        this.f32630h = z12;
        this.f32631i = z13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (gm.l.a(iVar.f32623a, this.f32623a) && gm.l.a(iVar.f32624b, this.f32624b) && iVar.f32625c == this.f32625c && gm.l.a(iVar.f32626d, this.f32626d) && gm.l.a(iVar.f32627e, this.f32627e) && iVar.f32628f == this.f32628f && iVar.f32629g == this.f32629g && iVar.f32630h == this.f32630h && iVar.f32631i == this.f32631i) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int a10 = i2.t.a(this.f32624b, i2.t.a(this.f32623a, 527, 31), 31);
        long j10 = this.f32625c;
        int a11 = i2.t.a(this.f32627e, i2.t.a(this.f32626d, (a10 + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31);
        int i13 = 1231;
        if (this.f32628f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (a11 + i10) * 31;
        if (this.f32629g) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        if (this.f32630h) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i16 = (i15 + i12) * 31;
        if (!this.f32631i) {
            i13 = 1237;
        }
        return i16 + i13;
    }

    public final String toString() {
        String format;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32623a);
        sb2.append('=');
        sb2.append(this.f32624b);
        if (this.f32630h) {
            if (this.f32625c == Long.MIN_VALUE) {
                format = "; max-age=0";
            } else {
                sb2.append("; expires=");
                format = en.c.f13850a.get().format(new Date(this.f32625c));
                gm.l.e(format, "STANDARD_DATE_FORMAT.get().format(this)");
            }
            sb2.append(format);
        }
        if (!this.f32631i) {
            sb2.append("; domain=");
            sb2.append(this.f32626d);
        }
        sb2.append("; path=");
        sb2.append(this.f32627e);
        if (this.f32628f) {
            sb2.append("; secure");
        }
        if (this.f32629g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        gm.l.e(sb3, "toString()");
        return sb3;
    }
}
