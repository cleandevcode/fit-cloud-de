package f8;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.k0;
import com.google.android.gms.base.R;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import h8.h1;
import i8.a0;
import i8.x;
import i8.y;
import i8.z;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {v8.d.class, v8.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: c */
    public static final Object f14179c = new Object();

    /* renamed from: d */
    public static final d f14180d = new d();

    public static AlertDialog e(Context context, int i10, a0 a0Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(x.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b10 = x.b(context, i10);
        if (b10 != null) {
            builder.setPositiveButton(b10, a0Var);
        }
        String d10 = x.d(context, i10);
        if (d10 != null) {
            builder.setTitle(d10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.x) {
                k0 J = ((androidx.fragment.app.x) activity).J();
                i iVar = new i();
                if (alertDialog != null) {
                    alertDialog.setOnCancelListener(null);
                    alertDialog.setOnDismissListener(null);
                    iVar.B0 = alertDialog;
                    if (onCancelListener != null) {
                        iVar.C0 = onCancelListener;
                    }
                    iVar.h1(J, str);
                    return;
                }
                throw new NullPointerException("Cannot display null dialog");
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        if (alertDialog != null) {
            alertDialog.setOnCancelListener(null);
            alertDialog.setOnDismissListener(null);
            bVar.f14173a = alertDialog;
            if (onCancelListener != null) {
                bVar.f14174b = onCancelListener;
            }
            bVar.show(fragmentManager, str);
            return;
        }
        throw new NullPointerException("Cannot display null dialog");
    }

    @Override // f8.e
    public final Intent a(Context context, int i10, String str) {
        return super.a(context, i10, str);
    }

    @Override // f8.e
    public final int b(Context context, int i10) {
        return super.b(context, i10);
    }

    @ResultIgnorabilityUnspecified
    public final int c(Context context) {
        return b(context, e.f14181a);
    }

    @ResultIgnorabilityUnspecified
    public final void d(Activity activity, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e10 = e(activity, i10, new y(activity, super.a(activity, i10, "d")), onCancelListener);
        if (e10 == null) {
            return;
        }
        f(activity, e10, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    @TargetApi(20)
    public final void g(Context context, int i10, PendingIntent pendingIntent) {
        String d10;
        String e10;
        boolean z10;
        int i11;
        boolean z11;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (i10 == 6) {
                d10 = x.f(context, "common_google_play_services_resolution_required_title");
            } else {
                d10 = x.d(context, i10);
            }
            if (d10 == null) {
                d10 = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            if (i10 != 6 && i10 != 19) {
                e10 = x.c(context, i10);
            } else {
                e10 = x.e(context, "common_google_play_services_resolution_required_text", x.a(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            i8.p.f(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            x0.s sVar = new x0.s(context, null);
            sVar.f30153o = true;
            sVar.e(16, true);
            sVar.d(d10);
            x0.r rVar = new x0.r();
            rVar.f30138b = x0.s.b(e10);
            sVar.g(rVar);
            PackageManager packageManager = context.getPackageManager();
            if (n8.a.f22197a == null) {
                n8.a.f22197a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (n8.a.f22197a.booleanValue()) {
                sVar.f30158t.icon = context.getApplicationInfo().icon;
                sVar.f30147i = 2;
                if (n8.a.a(context)) {
                    sVar.f30140b.add(new x0.q(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent));
                } else {
                    sVar.f30145g = pendingIntent;
                }
            } else {
                sVar.f30158t.icon = 17301642;
                sVar.f30158t.tickerText = x0.s.b(resources.getString(R.string.common_google_play_services_notification_ticker));
                sVar.f30158t.when = System.currentTimeMillis();
                sVar.f30145g = pendingIntent;
                sVar.c(e10);
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 26) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i12 >= 26) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    synchronized (f14179c) {
                    }
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
                    } else {
                        if (!string.contentEquals(notificationChannel.getName())) {
                            notificationChannel.setName(string);
                        }
                        sVar.f30156r = "com.google.android.gms.availability";
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                    sVar.f30156r = "com.google.android.gms.availability";
                } else {
                    throw new IllegalStateException();
                }
            }
            Notification a10 = sVar.a();
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                i11 = 39789;
            } else {
                com.google.android.gms.common.a.f6043a.set(false);
                i11 = 10436;
            }
            notificationManager.notify(i11, a10);
        }
    }

    @ResultIgnorabilityUnspecified
    public final void h(Activity activity, h8.g gVar, int i10, h1 h1Var) {
        AlertDialog e10 = e(activity, i10, new z(super.a(activity, i10, "d"), gVar), h1Var);
        if (e10 == null) {
            return;
        }
        f(activity, e10, "GooglePlayServicesErrorDialog", h1Var);
    }
}
