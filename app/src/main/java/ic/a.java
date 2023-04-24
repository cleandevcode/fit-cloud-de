package ic;

import android.annotation.TargetApi;
import bi.z0;
import ih.v;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import tl.f;
import ul.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final Set<String> f16762a = z0.p("android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.WRITE_SETTINGS", "android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.REQUEST_INSTALL_PACKAGES", "android.permission.POST_NOTIFICATIONS", "android.permission.BODY_SENSORS_BACKGROUND");
    @TargetApi(29)

    /* renamed from: b */
    public static final Map<String, String> f16763b;
    @TargetApi(30)

    /* renamed from: c */
    public static final Map<String, String> f16764c;
    @TargetApi(31)

    /* renamed from: d */
    public static final Map<String, String> f16765d;
    @TargetApi(33)

    /* renamed from: e */
    public static final Map<String, String> f16766e;

    static {
        Map<String, String> D = z.D(new f("android.permission.READ_CALENDAR", "android.permission-group.CALENDAR"), new f("android.permission.WRITE_CALENDAR", "android.permission-group.CALENDAR"), new f("android.permission.READ_CALL_LOG", "android.permission-group.CALL_LOG"), new f("android.permission.WRITE_CALL_LOG", "android.permission-group.CALL_LOG"), new f("android.permission.PROCESS_OUTGOING_CALLS", "android.permission-group.CALL_LOG"), new f("android.permission.CAMERA", "android.permission-group.CAMERA"), new f("android.permission.READ_CONTACTS", "android.permission-group.CONTACTS"), new f("android.permission.WRITE_CONTACTS", "android.permission-group.CONTACTS"), new f("android.permission.GET_ACCOUNTS", "android.permission-group.CONTACTS"), new f("android.permission.ACCESS_FINE_LOCATION", "android.permission-group.LOCATION"), new f("android.permission.ACCESS_COARSE_LOCATION", "android.permission-group.LOCATION"), new f("android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission-group.LOCATION"), new f("android.permission.RECORD_AUDIO", "android.permission-group.MICROPHONE"), new f("android.permission.READ_PHONE_STATE", "android.permission-group.PHONE"), new f("android.permission.READ_PHONE_NUMBERS", "android.permission-group.PHONE"), new f("android.permission.CALL_PHONE", "android.permission-group.PHONE"), new f("android.permission.ANSWER_PHONE_CALLS", "android.permission-group.PHONE"), new f("com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission-group.PHONE"), new f("android.permission.USE_SIP", "android.permission-group.PHONE"), new f("android.permission.ACCEPT_HANDOVER", "android.permission-group.PHONE"), new f("android.permission.BODY_SENSORS", "android.permission-group.SENSORS"), new f("android.permission.ACTIVITY_RECOGNITION", "android.permission-group.ACTIVITY_RECOGNITION"), new f("android.permission.SEND_SMS", "android.permission-group.SMS"), new f("android.permission.RECEIVE_SMS", "android.permission-group.SMS"), new f("android.permission.READ_SMS", "android.permission-group.SMS"), new f("android.permission.RECEIVE_WAP_PUSH", "android.permission-group.SMS"), new f("android.permission.RECEIVE_MMS", "android.permission-group.SMS"), new f("android.permission.READ_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), new f("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), new f("android.permission.ACCESS_MEDIA_LOCATION", "android.permission-group.STORAGE"));
        f16763b = D;
        LinkedHashMap H = z.H(v.k(new f("android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission-group.STORAGE")));
        H.putAll(D);
        Map<String, String> E = z.E(H);
        f16764c = E;
        LinkedHashMap H2 = z.H(z.D(new f("android.permission.BLUETOOTH_SCAN", "android.permission-group.NEARBY_DEVICES"), new f("android.permission.BLUETOOTH_ADVERTISE", "android.permission-group.NEARBY_DEVICES"), new f("android.permission.BLUETOOTH_CONNECT", "android.permission-group.NEARBY_DEVICES")));
        H2.putAll(E);
        Map<String, String> E2 = z.E(H2);
        f16765d = E2;
        LinkedHashMap H3 = z.H(z.D(new f("android.permission.READ_MEDIA_IMAGES", "android.permission-group.READ_MEDIA_VISUAL"), new f("android.permission.READ_MEDIA_VIDEO", "android.permission-group.READ_MEDIA_VISUAL"), new f("android.permission.READ_MEDIA_AUDIO", "android.permission-group.READ_MEDIA_AURAL"), new f("android.permission.POST_NOTIFICATIONS", "android.permission-group.NOTIFICATIONS"), new f("android.permission.NEARBY_WIFI_DEVICES", "android.permission-group.NEARBY_DEVICES"), new f("android.permission.BODY_SENSORS_BACKGROUND", "android.permission-group.SENSORS")));
        H3.putAll(E2);
        f16766e = z.E(H3);
    }
}
