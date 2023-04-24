package i8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.base.R;
import f1.j;
import java.util.Locale;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a */
    public static final o0.h f16724a = new o0.h();

    /* renamed from: b */
    public static Locale f16725b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            o8.c a10 = o8.d.a(context);
            return a10.f22890a.getPackageManager().getApplicationLabel(a10.f22890a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context, int i10) {
        return context.getResources().getString(i10 != 1 ? i10 != 2 ? i10 != 3 ? 17039370 : R.string.common_google_play_services_enable_button : R.string.common_google_play_services_update_button : R.string.common_google_play_services_install_button);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 != 1) {
            if (i10 == 2) {
                return n8.a.a(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a10);
            } else if (i10 != 3) {
                if (i10 != 5) {
                    if (i10 != 7) {
                        if (i10 != 9) {
                            if (i10 != 20) {
                                switch (i10) {
                                    case 16:
                                        return e(context, "common_google_play_services_api_unavailable_text", a10);
                                    case 17:
                                        return e(context, "common_google_play_services_sign_in_failed_text", a10);
                                    case 18:
                                        return resources.getString(R.string.common_google_play_services_updating_text, a10);
                                    default:
                                        return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, a10);
                                }
                            }
                            return e(context, "common_google_play_services_restricted_profile_text", a10);
                        }
                        return resources.getString(R.string.common_google_play_services_unsupported_text, a10);
                    }
                    return e(context, "common_google_play_services_network_error_text", a10);
                }
                return e(context, "common_google_play_services_invalid_account_text", a10);
            } else {
                return resources.getString(R.string.common_google_play_services_enable_text, a10);
            }
        }
        return resources.getString(R.string.common_google_play_services_install_text, a10);
    }

    public static String d(Context context, int i10) {
        String str;
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return f(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return f(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                str = "Unexpected error code " + i10;
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return f(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return f(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    public static String e(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String f10 = f(context, str);
        if (f10 == null) {
            f10 = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, f10, str2);
    }

    public static String f(Context context, String str) {
        f1.j jVar;
        Resources resources;
        o0.h hVar = f16724a;
        synchronized (hVar) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    jVar = new f1.j(new f1.m(f1.f.a(configuration)));
                } else {
                    Locale[] localeArr = {configuration.locale};
                    if (i10 >= 24) {
                        int i11 = f1.j.f14033b;
                        jVar = new f1.j(new f1.m(j.a.a(localeArr)));
                    } else {
                        jVar = new f1.j(new f1.k(localeArr));
                    }
                }
                Locale locale = jVar.f14034a.get();
                if (!locale.equals(f16725b)) {
                    hVar.clear();
                    f16725b = locale;
                }
                String str2 = (String) hVar.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                int i12 = f8.g.f14184e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                    return null;
                }
                f16724a.put(str, string);
                return string;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
