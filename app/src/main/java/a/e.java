package a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import gm.j;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import qa.h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final h f3a = new h();

    /* renamed from: b */
    public final Context f4b;

    /* loaded from: classes.dex */
    public class a implements c4.f {

        /* renamed from: a */
        public final b4.a f5a;

        /* renamed from: b */
        public final c4.d f6b;

        public a(b4.a aVar, c4.d dVar) {
            this.f5a = aVar;
            this.f6b = dVar;
        }
    }

    public e(Context context) {
        this.f4b = context;
    }

    public static void a(d4.c cVar, t3.f fVar) {
        try {
            String substring = cVar.f12623b.substring(4);
            String str = "sourceDat ==> " + substring;
            if (!j.f15503a) {
                Log.d("SobLog", str);
            }
            String str2 = new String(x3.a.b(substring));
            Log.d("DefaultDataHandler", "decodeData string " + str2);
            j.e("DefaultDataHandler", "resData2 ==> " + str2);
            String substring2 = str2.substring(0, 11);
            String substring3 = str2.substring(11);
            String substring4 = substring3.substring(substring3.length() + (-40));
            String substring5 = substring3.substring(0, substring3.length() - 40);
            j.e("DefaultDataHandler", "passWd ==>   " + substring4);
            j.e("DefaultDataHandler", "productKey ==>   " + substring2);
            j.e("DefaultDataHandler", "deviceName ==>   " + substring5);
            if (fVar != null) {
                fVar.a(substring2, substring5, substring4);
            }
        } catch (Exception e10) {
            Log.e("DefaultDataHandler", "处理接收飞鸟盾数据异常");
            e10.printStackTrace();
        }
    }

    public final void b(d4.c cVar, t3.f fVar, b4.a aVar, c4.d dVar) {
        c4.c cVar2;
        c4.c cVar3;
        c4.c cVar4;
        try {
            JSONObject jSONObject = new JSONObject(cVar.f12623b);
            String string = jSONObject.getString("msg_type");
            j.e("DefaultDataHandler", "FGS msg_type:" + string);
            if (string.equals("FGS_MSG_TYPE_START_FGS_RESP")) {
                String string2 = jSONObject.getString("tripplestatus");
                String string3 = jSONObject.getString("sdk_ver");
                this.f4b.getSharedPreferences("deviceAuthInfo", 0).edit().putString("deviceVersion", string3).apply();
                j.e("DefaultDataHandler", "DeviceVersion ==> " + string3);
                Log.d("DefaultDataHandler", "trippleStatus:" + string2);
                String string4 = jSONObject.getString("sidver");
                Log.d("DefaultDataHandler", "sidver:" + string4);
                if (string2.equals("needfetch")) {
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    try {
                        aVar.b(x3.b.c("FGS", new JSONStringer().object().key("msg_type").value("FGS_MSG_TYPE_START_LP_AUTH_REQ").key("timeStamp").value(valueOf).key("sidver").value(1L).key(CrashHianalyticsData.MESSAGE).value("success").endObject().toString()), new a.a(dVar));
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                    o8.b.f22887f = valueOf;
                } else if (dVar != null && (cVar4 = ((t3.a) dVar).f27528d) != null) {
                    cVar4.a();
                }
            }
            if (string.equals("FGS_MSG_TYPE_START_LP_AUTH_RESP")) {
                String string5 = jSONObject.getString("productKey");
                String string6 = jSONObject.getString("deviceName");
                String string7 = jSONObject.getString("timeStamp");
                String string8 = jSONObject.getString("sign");
                jSONObject.getString("signmethod");
                String string9 = jSONObject.getString("sonce");
                jSONObject.getString("ver");
                Log.d("DefaultDataHandler", "productKey " + string5);
                Log.d("DefaultDataHandler", "deviceName " + string6);
                Log.d("DefaultDataHandler", "timestamp " + string7);
                Log.d("DefaultDataHandler", "sign " + string8);
                Log.d("DefaultDataHandler", "sonce " + string9);
                j.e("DefaultDataHandler", "FGSInfoConfig.sDeviceName ==> " + o8.b.f22884c);
                j.e("DefaultDataHandler", "FGSInfoConfig.sDeviceSecret ==> " + o8.b.f22885d);
                j.e("DefaultDataHandler", "FGSInfoConfig.sProductKey ==> " + o8.b.f22886e);
                if (TextUtils.isEmpty(o8.b.f22884c) || !o8.b.f22884c.equals(string6) || TextUtils.isEmpty(o8.b.f22885d) || TextUtils.isEmpty(o8.b.f22886e) || !o8.b.f22886e.equals(string5)) {
                    o8.b.f22884c = "";
                    o8.b.f22885d = "";
                    o8.b.f22886e = "";
                    j.e("DefaultDataHandler", "注册设备...");
                    fVar.b(string5, string6, string8, string7, string9, new a(aVar, dVar));
                } else {
                    j.e("DefaultDataHandler", "有三元组缓存信息，说明已经注册过了，不进行注册，直接返回注册给蓝牙设备");
                    try {
                        aVar.b(o8.b.m(o8.b.f22884c, o8.b.f22885d, o8.b.f22886e, o8.b.f22887f, o8.b.f22888g), new c(dVar));
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                }
            }
            if (string.equals("FGS_MSG_TYPE_DS_DOWNLOAD_RESP")) {
                String string10 = jSONObject.getString(CrashHianalyticsData.MESSAGE);
                String string11 = jSONObject.getString("sidver");
                Log.d("DefaultDataHandler", "message " + string10);
                Log.d("DefaultDataHandler", "sidver " + string11);
                if (string10.equals("success")) {
                    if (dVar != null && (cVar3 = ((t3.a) dVar).f27528d) != null) {
                        cVar3.a();
                    }
                    Log.d("DefaultDataHandler", "device is received deviceSecret, it is " + string10);
                    return;
                }
                Log.d("DefaultDataHandler", "device receive deviceSecret is failed, it is " + string10);
                if (dVar == null || (cVar2 = ((t3.a) dVar).f27528d) == null) {
                    return;
                }
                cVar2.b(0, "device receive deviceSecret is failed");
            }
        } catch (JSONException e12) {
            e12.printStackTrace();
        }
    }
}
