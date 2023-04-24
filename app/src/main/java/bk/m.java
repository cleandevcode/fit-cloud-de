package bk;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.telecom.TelecomManager;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;
import mf.a0;
import p000do.a;
import um.x;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a */
    public static final x f4440a = new x("REMOVED_TASK");

    /* renamed from: b */
    public static final x f4441b = new x("CLOSED_EMPTY");

    public static void a(Context context) {
        gm.l.f(context, "context");
        try {
            if (Build.VERSION.SDK_INT < 28) {
                Object systemService = context.getSystemService("phone");
                gm.l.d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                Method declaredMethod = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getITelephony", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(telephonyManager, new Object[0]);
                Class.forName(invoke.getClass().getName()).getDeclaredMethod("endCall", new Class[0]).invoke(invoke, new Object[0]);
            } else if (y0.a.a(context, "android.permission.ANSWER_PHONE_CALLS") == 0) {
                Object systemService2 = context.getSystemService("telecom");
                gm.l.d(systemService2, "null cannot be cast to non-null type android.telecom.TelecomManager");
                ((TelecomManager) systemService2).endCall();
            }
        } catch (Exception e10) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#TelephonySmsUtil");
            bVar.q(e10);
        }
    }

    public static String b(w1.g gVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(gVar.size());
        for (int i10 = 0; i10 < gVar.size(); i10++) {
            int b10 = gVar.b(i10);
            if (b10 != 34) {
                if (b10 != 39) {
                    if (b10 != 92) {
                        switch (b10) {
                            case 7:
                                str = "\\a";
                                break;
                            case 8:
                                str = "\\b";
                                break;
                            case 9:
                                str = "\\t";
                                break;
                            case 10:
                                str = "\\n";
                                break;
                            case 11:
                                str = "\\v";
                                break;
                            case 12:
                                str = "\\f";
                                break;
                            case 13:
                                str = "\\r";
                                break;
                            default:
                                if (b10 < 32 || b10 > 126) {
                                    sb2.append('\\');
                                    sb2.append((char) (((b10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((b10 >>> 3) & 7) + 48));
                                    b10 = (b10 & 7) + 48;
                                }
                                sb2.append((char) b10);
                                continue;
                                break;
                        }
                    } else {
                        str = "\\\\";
                    }
                } else {
                    str = "\\'";
                }
            } else {
                str = "\\\"";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static String c(Context context, String str) {
        int columnIndex;
        gm.l.f(context, "context");
        gm.l.f(str, "phoneNumber");
        String str2 = null;
        try {
            Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"display_name"}, null, null, null);
            try {
                if (query != null) {
                    try {
                        String string = (!query.moveToFirst() || (columnIndex = query.getColumnIndex("display_name")) == -1) ? null : query.getString(columnIndex);
                        try {
                            tl.l lVar = tl.l.f28297a;
                            a0.d(query, null);
                            return string;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return null;
            } catch (Exception e10) {
                e = e10;
                str2 = "display_name";
                a.b bVar = p000do.a.f13275a;
                bVar.t("Fc#TelephonySmsUtil");
                bVar.r(e, "queryDisplayName error:%s", str);
                return str2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static void d(Context context, Integer num, String str, String str2) {
        SmsManager smsManager;
        Object systemService;
        Object systemService2;
        gm.l.f(context, "context");
        gm.l.f(str2, "content");
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#TelephonySmsUtil");
        bVar.h("send sms:%d %s %s", num, str, str2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 22) {
            if (num == null) {
                if (i10 >= 23) {
                    systemService2 = context.getSystemService(SmsManager.class);
                    smsManager = (SmsManager) systemService2;
                }
            } else if (i10 >= 31) {
                systemService = context.getSystemService(SmsManager.class);
                smsManager = ((SmsManager) systemService).createForSubscriptionId(num.intValue());
            } else {
                smsManager = SmsManager.getSmsManagerForSubscriptionId(num.intValue());
            }
            smsManager.sendTextMessage(str, null, str2, null, null);
        }
        smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(str, null, str2, null, null);
    }
}
