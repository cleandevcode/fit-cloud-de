package r5;

import cn.sharesdk.framework.InnerShareParams;
import d6.c0;
import d6.m0;
import gm.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import o5.g0;
import o5.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qa.p;
import ul.z;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final Map<r5.b, c> f25248a;

    /* renamed from: b */
    public static final Map<k, b> f25249b;

    /* renamed from: c */
    public static final Map<String, h> f25250c;

    /* loaded from: classes.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        OPTIONS("data_processing_options"),
        /* JADX INFO: Fake field, exist only in values array */
        COUNTRY("data_processing_options_country"),
        /* JADX INFO: Fake field, exist only in values array */
        STATE("data_processing_options_state");
        

        /* renamed from: a */
        public final String f25252a;

        a(String str) {
            this.f25252a = str;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            return (a[]) Arrays.copyOf(values(), 3);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public i f25253a;

        /* renamed from: b */
        public g f25254b;

        public b(i iVar, g gVar) {
            this.f25253a = iVar;
            this.f25254b = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f25253a == bVar.f25253a && this.f25254b == bVar.f25254b;
            }
            return false;
        }

        public final int hashCode() {
            i iVar = this.f25253a;
            return this.f25254b.hashCode() + ((iVar == null ? 0 : iVar.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("SectionCustomEventFieldMapping(section=");
            a10.append(this.f25253a);
            a10.append(", field=");
            a10.append(this.f25254b);
            a10.append(')');
            return a10.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public i f25255a;

        /* renamed from: b */
        public j f25256b;

        public c(i iVar, j jVar) {
            this.f25255a = iVar;
            this.f25256b = jVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f25255a == cVar.f25255a && this.f25256b == cVar.f25256b;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f25255a.hashCode() * 31;
            j jVar = this.f25256b;
            return hashCode + (jVar == null ? 0 : jVar.hashCode());
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("SectionFieldMapping(section=");
            a10.append(this.f25255a);
            a10.append(", field=");
            a10.append(this.f25256b);
            a10.append(')');
            return a10.toString();
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        ARRAY,
        BOOL,
        INT;
        

        /* renamed from: a */
        public static final a f25257a = new a();

        /* loaded from: classes.dex */
        public static final class a {
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            return (d[]) Arrays.copyOf(values(), 3);
        }
    }

    static {
        r5.b bVar = r5.b.ANON_ID;
        i iVar = i.USER_DATA;
        r5.b bVar2 = r5.b.ADV_TE;
        i iVar2 = i.APP_DATA;
        f25248a = z.D(new tl.f(bVar, new c(iVar, j.ANON_ID)), new tl.f(r5.b.APP_USER_ID, new c(iVar, j.FB_LOGIN_ID)), new tl.f(r5.b.ADVERTISER_ID, new c(iVar, j.MAD_ID)), new tl.f(r5.b.PAGE_ID, new c(iVar, j.PAGE_ID)), new tl.f(r5.b.PAGE_SCOPED_USER_ID, new c(iVar, j.PAGE_SCOPED_USER_ID)), new tl.f(bVar2, new c(iVar2, j.ADV_TE)), new tl.f(r5.b.APP_TE, new c(iVar2, j.APP_TE)), new tl.f(r5.b.CONSIDER_VIEWS, new c(iVar2, j.CONSIDER_VIEWS)), new tl.f(r5.b.DEVICE_TOKEN, new c(iVar2, j.DEVICE_TOKEN)), new tl.f(r5.b.EXT_INFO, new c(iVar2, j.EXT_INFO)), new tl.f(r5.b.INCLUDE_DWELL_DATA, new c(iVar2, j.INCLUDE_DWELL_DATA)), new tl.f(r5.b.INCLUDE_VIDEO_DATA, new c(iVar2, j.INCLUDE_VIDEO_DATA)), new tl.f(r5.b.INSTALL_REFERRER, new c(iVar2, j.INSTALL_REFERRER)), new tl.f(r5.b.INSTALLER_PACKAGE, new c(iVar2, j.INSTALLER_PACKAGE)), new tl.f(r5.b.RECEIPT_DATA, new c(iVar2, j.RECEIPT_DATA)), new tl.f(r5.b.URL_SCHEMES, new c(iVar2, j.URL_SCHEMES)), new tl.f(r5.b.USER_DATA, new c(iVar, null)));
        k kVar = k.VALUE_TO_SUM;
        i iVar3 = i.CUSTOM_DATA;
        f25249b = z.D(new tl.f(k.EVENT_TIME, new b(null, g.EVENT_TIME)), new tl.f(k.EVENT_NAME, new b(null, g.EVENT_NAME)), new tl.f(kVar, new b(iVar3, g.VALUE_TO_SUM)), new tl.f(k.CONTENT_IDS, new b(iVar3, g.CONTENT_IDS)), new tl.f(k.CONTENTS, new b(iVar3, g.CONTENTS)), new tl.f(k.CONTENT_TYPE, new b(iVar3, g.CONTENT_TYPE)), new tl.f(k.CURRENCY, new b(iVar3, g.CURRENCY)), new tl.f(k.DESCRIPTION, new b(iVar3, g.DESCRIPTION)), new tl.f(k.LEVEL, new b(iVar3, g.LEVEL)), new tl.f(k.MAX_RATING_VALUE, new b(iVar3, g.MAX_RATING_VALUE)), new tl.f(k.NUM_ITEMS, new b(iVar3, g.NUM_ITEMS)), new tl.f(k.PAYMENT_INFO_AVAILABLE, new b(iVar3, g.PAYMENT_INFO_AVAILABLE)), new tl.f(k.REGISTRATION_METHOD, new b(iVar3, g.REGISTRATION_METHOD)), new tl.f(k.SEARCH_STRING, new b(iVar3, g.SEARCH_STRING)), new tl.f(k.SUCCESS, new b(iVar3, g.SUCCESS)), new tl.f(k.ORDER_ID, new b(iVar3, g.ORDER_ID)), new tl.f(k.AD_TYPE, new b(iVar3, g.AD_TYPE)));
        f25250c = z.D(new tl.f("fb_mobile_achievement_unlocked", h.UNLOCKED_ACHIEVEMENT), new tl.f("fb_mobile_activate_app", h.ACTIVATED_APP), new tl.f("fb_mobile_add_payment_info", h.ADDED_PAYMENT_INFO), new tl.f("fb_mobile_add_to_cart", h.ADDED_TO_CART), new tl.f("fb_mobile_add_to_wishlist", h.ADDED_TO_WISHLIST), new tl.f("fb_mobile_complete_registration", h.COMPLETED_REGISTRATION), new tl.f("fb_mobile_content_view", h.VIEWED_CONTENT), new tl.f("fb_mobile_initiated_checkout", h.INITIATED_CHECKOUT), new tl.f("fb_mobile_level_achieved", h.ACHIEVED_LEVEL), new tl.f("fb_mobile_purchase", h.PURCHASED), new tl.f("fb_mobile_rate", h.RATED), new tl.f("fb_mobile_search", h.SEARCHED), new tl.f("fb_mobile_spent_credits", h.SPENT_CREDITS), new tl.f("fb_mobile_tutorial_completion", h.COMPLETED_TUTORIAL));
    }

    public static final Object a(Object obj, String str) {
        d dVar;
        String str2;
        String str3;
        Cloneable g10;
        d.f25257a.getClass();
        if (l.a(str, InnerShareParams.EXT_INFO) || l.a(str, "url_schemes") || l.a(str, "fb_content_id") || l.a(str, "fb_content") || l.a(str, "data_processing_options")) {
            dVar = d.ARRAY;
        } else if (l.a(str, "advertiser_tracking_enabled") || l.a(str, "application_tracking_enabled")) {
            dVar = d.BOOL;
        } else if (l.a(str, "_logTime")) {
            dVar = d.INT;
        } else {
            dVar = null;
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (dVar != null && str2 != null) {
            int ordinal = dVar.ordinal();
            boolean z10 = false;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return om.g.S(obj.toString());
                    }
                    throw new p();
                }
                Integer S = om.g.S(str2);
                if (S == null) {
                    return null;
                }
                if (S.intValue() != 0) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            try {
                m0 m0Var = m0.f12709a;
                ArrayList<String> g11 = m0.g(new JSONArray(str2));
                ArrayList arrayList = new ArrayList();
                for (String str4 : g11) {
                    try {
                        try {
                            m0 m0Var2 = m0.f12709a;
                            g10 = m0.h(new JSONObject(str4));
                        } catch (JSONException unused) {
                            m0 m0Var3 = m0.f12709a;
                            g10 = m0.g(new JSONArray(str3));
                        }
                    } catch (JSONException unused2) {
                    }
                    arrayList.add(g10);
                }
                return arrayList;
            } catch (JSONException unused3) {
                c0.a aVar = c0.f12645d;
                v.i(g0.APP_EVENTS);
                return tl.l.f28297a;
            }
        }
        return obj;
    }
}
