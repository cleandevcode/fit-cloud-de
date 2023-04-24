package com.mob.tools.utils;

import android.os.Build;
import android.text.TextUtils;
import com.mob.commons.i;
import com.mob.tools.MobLog;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private static d f9365a;

    /* renamed from: b */
    private String f9366b;

    /* renamed from: com.mob.tools.utils.d$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9367a;

        static {
            int[] iArr = new int[a.values().length];
            f9367a = iArr;
            try {
                iArr[a.MIUI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9367a[a.EMUI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9367a[a.AMIGO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9367a[a.FLYME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9367a[a.LENOVO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9367a[a.ONEUI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9367a[a.COLOR_OS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9367a[a.FUNTOUCH_OS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9367a[a.EUI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9367a[a.SENSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9367a[a.GOOGLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9367a[a.SMARTISAN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9367a[a.ONEPLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9367a[a.YUNOS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9367a[a.QIHOO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9367a[a.NUBIA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9367a[a.LGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum a {
        MIUI(i.a("006=fnfgfhge(n7fg")),
        EMUI(i.a("006e6fefhhf1kAfg")),
        FLYME(i.a("005nk,fgiefe")),
        ONEUI(i.a("007Vhifh]nWhifefmhh")),
        COLOR_OS(i.a("004^geOgg?ge")),
        FUNTOUCH_OS(i.a("004l3fg-l[ge")),
        EUI(i.a("004:gfJkfl")),
        SENSE(i.a("003efAfi")),
        GOOGLE(i.a("006^hhgegehhgfJk")),
        LENOVO(i.a("006+gf6kMfmgeYlQge")),
        SMARTISAN(i.a("006;fi e<fefgiefg")),
        ONEPLUS(i.a("007Ggefm)kgSgffehi")),
        YUNOS(i.a("005:fkfefmgehi")),
        QIHOO(i.a("005m1fg]eZgege")),
        NUBIA(i.a("005 fmfehefgfh")),
        LGE(i.a("002Bgfhh")),
        AMIGO(i.a("0052jhfgfmgffg")),
        OTHER("");
        

        /* renamed from: s */
        private String f9387s;

        a(String str) {
            this.f9387s = str;
        }

        public String a() {
            return this.f9387s;
        }
    }

    private d() {
    }

    public static d a() {
        if (f9365a == null) {
            synchronized (d.class) {
                if (f9365a == null) {
                    f9365a = new d();
                }
            }
        }
        return f9365a;
    }

    private String a(a aVar) {
        String str;
        String a10;
        switch (AnonymousClass1.f9367a[aVar.ordinal()]) {
            case 1:
                str = "023 fjgegn9n2fgfefggnfefggn0lkAfjhifggefmgnfmfh)nk";
                a10 = a(i.a(str));
                break;
            case 2:
                str = "021MfjgegnhefefggfMj_gn0lkXfjhifggefmgn'knHfefg";
                a10 = a(i.a(str));
                break;
            case 3:
            case 4:
                str = "019EfjgegnhefefggfOj]gn)jLfghiPgYgffhfkgnfg.j";
                a10 = a(i.a(str));
                break;
            case 5:
            case 6:
                str = "028MfjgegnhefefggfNj5gn5lkJfjhifggefmgnfgfmfifjNknk6fm(f%fhgf";
                a10 = a(i.a(str));
                break;
            case 7:
                str = "024(fjgegnhefefggf3jEgnNlk0fjhifggefmgnge8ggWgefjge;n";
                a10 = a(i.a(str));
                break;
            case 8:
                a10 = a(i.a("027*fjgegnAl!fgOl7gegngehignhefefggfNj^gnIjMfghiSg gffhfkgnfg$j"));
                if (TextUtils.isEmpty(a10)) {
                    str = "018-fjgegn[lBfg l+gegngehign1lk)fjhifggefm";
                    a10 = a(i.a(str));
                    break;
                }
                break;
            case 9:
                str = "023Bfjgegngf?kfl:gnfjVkQgfRkOfhhiAk*gnMlk_fjhifggefm";
                a10 = a(i.a(str));
                break;
            case 10:
                str = "0225fjgegnhefefggf^j gnhi7k)fmhi>k(gn,lkQfjhifggefm";
                a10 = a(i.a(str));
                break;
            case 11:
                str = "024-fjgegnhefefggf^jKgn-lk0fjhifggefmgnfj?k_gf_k6fhhiMk";
                a10 = a(i.a(str));
                break;
            case 12:
                str = "020Qfjgegnhi5nYfhfj5f'fghifhfmgn<lk^fjhifggefm";
                a10 = a(i.a(str));
                break;
            case 13:
                str = "014;fjgegnfjge,nBgnOlk3fjhifggefm";
                a10 = a(i.a(str));
                break;
            case 14:
                str = "020@fjgegnfi4f(fhgnfkfefmgehign=lkCfjhifggefm";
                a10 = a(i.a(str));
                break;
            case 15:
                str = "018Ofjgegnhefefggf]j;gnfefg^lk(fjhifggefm";
                a10 = a(i.a(str));
                break;
            case 16:
                a10 = a(i.a("023]fjgegnhefefggf3j)gnfmfehefgfhgnfjgeJn9gnfigeDjk"));
                if (TextUtils.isEmpty(a10)) {
                    str = "015]fjgegnhefefggf jOgnfjge:nWgnfg=j";
                    a10 = a(i.a(str));
                    break;
                }
                break;
            case 17:
                str = "021Ghifkhigngfhh2k<gngfhh>njn.ff[lk;fjhifggefm";
                a10 = a(i.a(str));
                break;
            default:
                str = "019Hfjgegnhefefggf;j*gn[j:fghiXgLgffhfkgnfg;j";
                a10 = a(i.a(str));
                break;
        }
        return TextUtils.isEmpty(a10) ? a(i.a("019HfjgegnhefefggfYjHgnQjKfghiPg3gffhfkgnfgNj")) : a10;
    }

    private String a(String str) {
        try {
            Object invokeStaticMethod = ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(i.a("027[fhfmFj>fjgefgIj3gngehigngjfkhi!fknSijfjgeSgkJfjTf fg4k<hi")), i.a("003Bhh.kf"), str);
            return invokeStaticMethod != null ? String.valueOf(invokeStaticMethod) : "";
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return "";
        }
    }

    private a c() {
        a[] values;
        if (TextUtils.isEmpty(a("ro.miui.ui.version.code")) && TextUtils.isEmpty(a(i.a("023<fjgegn*nTfgfefggnfefggn,lkJfjhifggefmgnfmfh!nk"))) && TextUtils.isEmpty(a("ro.miui.internal.storage"))) {
            if (TextUtils.isEmpty(a(i.a("021HfjgegnhefefggfHjTgn^lkCfjhifggefmgn!kn2fefg"))) && TextUtils.isEmpty(a("ro.build.hw_emui_api_level")) && TextUtils.isEmpty(a("ro.confg.hw_systemversion"))) {
                if (TextUtils.isEmpty(a(i.a("026gk)fjhifghiGfDgnhifkhignfehi3k)gnhjgffkQnkPgnfgfigefm"))) && TextUtils.isEmpty(a(i.a("026Wfjgegn=nk.fgiefegnhi[kf<fe8g>hffgiefhfj<jUgnhjgffk(nk"))) && TextUtils.isEmpty(a(i.a("018Gfjgegnhjgffk=nkPgnFgBfehegffghiPekj")))) {
                    if (TextUtils.isEmpty(a(i.a("024^figeVnKgnhifh0nEhifefmhhgnhi;gk<hhgn*jMfghifhhegf)k"))) && TextUtils.isEmpty(a("init.svc.health-hal-2-1-samsung"))) {
                        if (TextUtils.isEmpty(a(i.a("024.fjgegnhefefggf$j?gn0lk_fjhifggefmgnge.ggGgefjgeWn")))) {
                            if (TextUtils.isEmpty(a(i.a("0272fjgegn)lCfg4l;gegngehignhefefggf=j-gn[jDfghi^gWgffhfkgnfgAj"))) && TextUtils.isEmpty(a(i.a("018%fjgegn2lFfg.l[gegngehign)lk:fjhifggefm")))) {
                                if (TextUtils.isEmpty(a(i.a("023TfjgegngfTkfl6gnfjBkRgf:k-fhhiUk'gn%lkDfjhifggefm")))) {
                                    if (TextUtils.isEmpty(a(i.a("0228fjgegnhefefggfSj<gnhiTkYfmhiLk7gn?lkMfjhifggefm")))) {
                                        if (i.a("014Hfhfm;j2fjgefg_j8jkhhgegehhgf_k").equals(a(i.a("026Sfjgegnfige+nQgnhhgegehhgfHkJgnfigffg_k1fm;fUfg-j hefhhiAk")))) {
                                            return a.GOOGLE;
                                        }
                                        if (TextUtils.isEmpty(a(i.a("020'fjgegnhi'nPfhfj(fLfghifhfmgn9lkYfjhifggefm")))) {
                                            if (TextUtils.isEmpty(a(i.a("014^fjgegnfjgeGn]gnSlkDfjhifggefm")))) {
                                                if (TextUtils.isEmpty(a(i.a("020_fjgegnfi%fBfhgnfkfefmgehignHlk*fjhifggefm")))) {
                                                    if (TextUtils.isEmpty(a(i.a("018;fjgegnhefefggfAjMgnfefg%lkEfjhifggefm")))) {
                                                        if (TextUtils.isEmpty(a(i.a("023BfjgegnhefefggfFjFgnfmfehefgfhgnfjgeVnCgnfige=jk"))) && TextUtils.isEmpty(a(i.a("015CfjgegnhefefggfBjUgnfjge>n,gnfg.j")))) {
                                                            if (TextUtils.isEmpty(a(i.a("021-hifkhigngfhhLkJgngfhhSnjn@ff6lkOfjhifggefm")))) {
                                                                if (TextUtils.isEmpty(a(i.a("019XfjgegnhefefggfQj3gnEjAfghiXgLgffhfkgnfgQj"))) || !a(i.a("019;fjgegnhefefggf[j%gnPj5fghi*g<gffhfkgnfg7j")).matches("amigo([\\d.]+)[a-zA-Z]*")) {
                                                                    for (a aVar : a.values()) {
                                                                        if (aVar.a().equalsIgnoreCase(d())) {
                                                                            return aVar;
                                                                        }
                                                                    }
                                                                    return a.OTHER;
                                                                }
                                                                return a.AMIGO;
                                                            }
                                                            return a.LGE;
                                                        }
                                                        return a.NUBIA;
                                                    }
                                                    return a.QIHOO;
                                                }
                                                return a.YUNOS;
                                            }
                                            return a.ONEPLUS;
                                        }
                                        return a.SMARTISAN;
                                    }
                                    return a.SENSE;
                                }
                                return a.EUI;
                            }
                            return a.FUNTOUCH_OS;
                        }
                        return a.COLOR_OS;
                    }
                    return a.ONEUI;
                }
                return a.FLYME;
            }
            return a.EMUI;
        }
        return a.MIUI;
    }

    private String d() {
        if (TextUtils.isEmpty(this.f9366b)) {
            this.f9366b = Build.MANUFACTURER;
        }
        return this.f9366b;
    }

    public String b() {
        try {
            return a(c());
        } catch (Throwable th2) {
            MobLog.getInstance().e(th2);
            return null;
        }
    }
}
