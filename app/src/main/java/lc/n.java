package lc;

import java.util.Date;

/* loaded from: classes.dex */
public final class n extends g {

    /* renamed from: a */
    public final int f19437a;

    /* renamed from: b */
    public final Date f19438b;

    public n(int i10) {
        super(a(i10, null));
        this.f19437a = i10;
        this.f19438b = null;
    }

    public n(int i10, Throwable th2) {
        super(a(i10, null), th2);
        this.f19437a = i10;
        this.f19438b = null;
    }

    public n(Date date) {
        super(a(2147483646, date));
        this.f19437a = 2147483646;
        this.f19438b = date;
    }

    public static String a(int i10, Date date) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i10 != 2147483646) {
            switch (i10) {
                case 0:
                    str = "Bluetooth cannot start";
                    break;
                case 1:
                    str = "Bluetooth disabled";
                    break;
                case 2:
                    str = "Bluetooth not available";
                    break;
                case 3:
                    str = "Location Permission missing";
                    break;
                case 4:
                    str = "Location Services disabled";
                    break;
                case 5:
                    str = "Scan failed because it has already started";
                    break;
                case 6:
                    str = "Scan failed because application registration failed";
                    break;
                case 7:
                    str = "Scan failed because of an internal error";
                    break;
                case 8:
                    str = "Scan failed because feature unsupported";
                    break;
                case 9:
                    str = "Scan failed because out of hardware resources";
                    break;
                default:
                    str = "Unknown error";
                    break;
            }
        } else {
            str = "Undocumented scan throttle";
        }
        sb2.append(str);
        sb2.append(" (code ");
        sb2.append(i10);
        sb2.append(")");
        if (date == null) {
            str2 = "";
        } else {
            str2 = ", suggested retry date is " + date;
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
