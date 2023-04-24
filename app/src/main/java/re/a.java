package re;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import ke.c;
import ke.d;
import ke.e;
import ke.f;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i */
    public static final ArrayList<a> f25541i;

    /* renamed from: j */
    public static final ArrayList<a> f25542j;

    /* renamed from: a */
    public int f25543a;

    /* renamed from: b */
    public String f25544b;

    /* renamed from: c */
    public int f25545c;

    /* renamed from: d */
    public int f25546d;

    /* renamed from: e */
    public boolean f25547e;

    /* renamed from: f */
    public int f25548f;

    /* renamed from: g */
    public boolean f25549g;

    /* renamed from: h */
    public boolean f25550h;

    static {
        ArrayList<a> arrayList = new ArrayList<>();
        f25541i = arrayList;
        arrayList.add(new a(0, "SOCV Config File", 257, true, 3));
        arrayList.add(new a(1, "System Config", DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, true, 3));
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayList<a> arrayList2 = f25541i;
            int i11 = i10 * 16;
            arrayList2.add(new a(i11 + 2, "OTA Header", 2048, true, 2));
            arrayList2.add(new a(i11 + 3, "Secure Boot Loader", 1792, true, 3));
            arrayList2.add(new a(i11 + 4, "ROM Patch", DfuBaseService.ERROR_REMOTE_TYPE_SECURE, true, 3));
            arrayList2.add(new a(i11 + 5, "App", 768, true, 3));
            arrayList2.add(new a(i11 + 6, "APP Data1 File", 2305, false, 3));
            arrayList2.add(new a(i11 + 7, "APP Data2 File", 2306, false, 3));
            arrayList2.add(new a(i11 + 8, "APP Data3 File", 2307, false, 3));
            arrayList2.add(new a(i11 + 9, "APP Data4 File", 2308, false, 3));
            arrayList2.add(new a(i11 + 10, "APP Data5 File", 2309, false, 3));
            arrayList2.add(new a(i11 + 11, "APP Data6 File", 2310, false, 3));
            arrayList2.add(new a(i11 + 12, "Upper Stack", 2560, true, 3));
        }
        ArrayList<a> arrayList3 = new ArrayList<>();
        f25542j = arrayList3;
        arrayList3.add(new a(0, "SOCV Config File", 257, false, 1));
        arrayList3.add(new a(1, "System Config", DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, true, 1));
        for (int i12 = 0; i12 < 2; i12++) {
            ArrayList<a> arrayList4 = f25542j;
            int i13 = i12 * 16;
            arrayList4.add(new a(i13 + 2, "OTA Header", 10128, 2048, true, 1, false));
            arrayList4.add(new a(i13 + 3, "Secure Boot Loader", 10129, 1792, true, 3, false));
            arrayList4.add(new a(i13 + 4, "ROM Patch", 10130, DfuBaseService.ERROR_REMOTE_TYPE_SECURE, true, 3, false));
            arrayList4.add(new a(i13 + 5, "App", 10131, 768, true, 5, false));
            arrayList4.add(new a(i13 + 6, "DSP System", 10132, 1280, true, 515, false));
            arrayList4.add(new a(i13 + 7, "DSP App", 10133, 1538, true, 515, false));
            arrayList4.add(new a(i13 + 8, "DSP Config", 10135, 1040, true, 514, true));
            arrayList4.add(new a(i13 + 9, "App Config", 10134, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, true, 2, true));
            arrayList4.add(new a(i13 + 10, "Ext Image 0", 10136, 2304, false, 1, true));
            arrayList4.add(new a(i13 + 11, "Ext Image 1", 10137, 2305, false, 1, false));
            arrayList4.add(new a(i13 + 12, "Ext Image 2", 10138, 2306, false, 1, false));
            arrayList4.add(new a(i13 + 13, "Ext Image 3", 10139, 2307, false, 1, false));
            arrayList4.add(new a(i13 + 17, "Sys Patch", 10140, 513, false, 3, false));
            arrayList4.add(new a(i13 + 18, "Stack Patch", 10141, 514, false, 3, false));
            arrayList4.add(new a(i13 + 19, "Upper Stack", 10142, 515, false, 1, false));
            arrayList4.add(new a(i13 + 20, "Framework", 10143, 516, false, 1, false));
        }
        ArrayList<a> arrayList5 = f25542j;
        arrayList5.add(new a(14, "Factory", 2560, false, 1));
        arrayList5.add(new a(15, "Backup Data 1", 2816, false, 1));
        arrayList5.add(new a(16, "Backup Data 2", 2817, false, 1));
        arrayList5.add(new a(24, "Voice Prompt Data", 10148, 520, false, 2, false));
        arrayList5.add(new a(24, "Platform Ext", 10145, 517, false, 3, false));
    }

    public a(int i10, String str, int i11) {
        this.f25545c = -1;
        this.f25543a = i10;
        this.f25544b = str;
        this.f25546d = i11;
        this.f25548f = 3;
        this.f25549g = false;
        this.f25550h = false;
        this.f25547e = false;
    }

    public a(int i10, String str, int i11, int i12, boolean z10, int i13, boolean z11) {
        this.f25543a = i10;
        this.f25544b = str;
        this.f25545c = i11;
        this.f25546d = i12;
        this.f25547e = z10;
        this.f25548f = i13;
        this.f25549g = z11;
        this.f25550h = true;
    }

    public a(int i10, String str, int i11, boolean z10, int i12) {
        this(i10, str, 0, i11, z10, i12, false);
    }

    public static a a(int i10, int i11) {
        if (i10 <= 3) {
            return c.a(i11);
        }
        if (i10 != 5 && i10 != 9 && i10 != 12) {
            if (i10 == 16) {
                Iterator<a> it = e.f18458a.iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    if (next.f25543a == i11) {
                        return next;
                    }
                }
                return null;
            } else if (i10 != 4 && i10 != 6 && i10 != 7 && i10 != 13 && i10 != 8 && i10 != 10 && i10 != 11 && i10 != 14) {
                return null;
            } else {
                Iterator<a> it2 = ke.b.f18455a.iterator();
                while (it2.hasNext()) {
                    a next2 = it2.next();
                    if (next2.f25543a == i11) {
                        return next2;
                    }
                }
                return null;
            }
        }
        Iterator<a> it3 = d.f18457a.iterator();
        while (it3.hasNext()) {
            a next3 = it3.next();
            if (next3.f25543a == i11) {
                return next3;
            }
        }
        return null;
    }

    public static a b(int i10, int i11, int i12) {
        if (i10 == 14) {
            Iterator<a> it = f.f18459a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f25545c == i11) {
                    return next;
                }
            }
            return null;
        } else if (i10 == 16) {
            Iterator<a> it2 = e.f18458a.iterator();
            while (it2.hasNext()) {
                a next2 = it2.next();
                if (next2.f25545c == i11) {
                    return next2;
                }
            }
            return null;
        } else if (i10 != 5 && i10 != 9 && i10 != 12) {
            if (i10 != 4 && i10 != 6 && i10 != 7 && i10 != 8 && i10 != 13 && i10 != 10) {
                if (i10 == 11) {
                    Iterator<a> it3 = ke.a.f18454a.iterator();
                    while (it3.hasNext()) {
                        a next3 = it3.next();
                        if (next3.f25545c == i11) {
                            return next3;
                        }
                    }
                    return null;
                } else if (i10 == 3) {
                    return c.a(i12);
                } else {
                    return c(f25542j, i12);
                }
            }
            return ke.b.b(i11);
        } else {
            return ke.b.b(i11);
        }
    }

    public static a c(ArrayList<a> arrayList, int i10) {
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.f25543a == i10) {
                return next;
            }
        }
        ge.b.n("undefined indicator, bitNumber=" + i10);
        return null;
    }

    public static a d(int i10, int i11) {
        if (i10 == 14) {
            Iterator<a> it = f.f18459a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f25546d == i11) {
                    return next;
                }
            }
            return null;
        } else if (i10 == 16) {
            Iterator<a> it2 = e.f18458a.iterator();
            while (it2.hasNext()) {
                a next2 = it2.next();
                if (next2.f25546d == i11) {
                    return next2;
                }
            }
            return null;
        } else if (i10 != 5 && i10 != 9 && i10 != 12) {
            if (i10 != 4 && i10 != 6 && i10 != 7 && i10 != 8 && i10 != 13 && i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                return ke.a.a(i11);
            }
            return ke.b.a(i11);
        } else {
            Iterator<a> it3 = d.f18457a.iterator();
            while (it3.hasNext()) {
                a next3 = it3.next();
                if (next3.f25546d == i11) {
                    return next3;
                }
            }
            return null;
        }
    }

    public static a e(int i10, int i11) {
        if (i10 == 14) {
            Iterator<a> it = f.f18459a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f25545c == i11) {
                    return next;
                }
            }
            return null;
        } else if (i10 == 16) {
            Iterator<a> it2 = e.f18458a.iterator();
            while (it2.hasNext()) {
                a next2 = it2.next();
                if (next2.f25545c == i11) {
                    return next2;
                }
            }
            return null;
        } else if (i10 != 5 && i10 != 9 && i10 != 12) {
            if (i10 != 4 && i10 != 6 && i10 != 7 && i10 != 8 && i10 != 13 && i10 != 10) {
                if (i10 == 11) {
                    Iterator<a> it3 = ke.a.f18454a.iterator();
                    while (it3.hasNext()) {
                        a next3 = it3.next();
                        if (next3.f25545c == i11) {
                            return next3;
                        }
                    }
                    return null;
                } else if (i10 != 3) {
                    return null;
                } else {
                    Iterator<a> it4 = c.f18456a.iterator();
                    while (it4.hasNext()) {
                        a next4 = it4.next();
                        if (next4.f25545c == i11) {
                            return next4;
                        }
                    }
                    return null;
                }
            }
            return ke.b.b(i11);
        } else {
            return ke.b.b(i11);
        }
    }

    public static boolean f(int i10, int i11) {
        return i10 == -1 || ((i10 >> i11) & 1) != 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Locale locale = Locale.US;
        sb2.append(String.format(locale, "bitNumber=%d, flashLayoutName=%s, supportOta=%b", Integer.valueOf(this.f25543a), this.f25544b, Boolean.valueOf(this.f25550h)));
        sb2.append(this.f25550h ? String.format(locale, ", imageId=0x%04X", Integer.valueOf(this.f25545c)) : String.format(locale, ", imageId=0x%04X, subBinId=0x%04X", Integer.valueOf(this.f25545c), Integer.valueOf(this.f25546d)));
        sb2.append(String.format(locale, ", versionCheckEnabled=%b, versionFormat=0x%04X, isConfigEnabled=%b", Boolean.valueOf(this.f25547e), Integer.valueOf(this.f25548f), Boolean.valueOf(this.f25549g)));
        return sb2.toString();
    }
}
