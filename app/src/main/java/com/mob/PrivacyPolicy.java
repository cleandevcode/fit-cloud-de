package com.mob;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.InnerShareParams;
import com.mob.commons.j;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.ClassKeeper;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.UIHandler;
import java.io.Serializable;
import java.util.Locale;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class PrivacyPolicy implements ClassKeeper, PublicMemberKeeper, Serializable {
    public static final int POLICY_TYPE_TXT = 2;
    public static final int POLICY_TYPE_URL = 1;

    /* renamed from: a */
    private String f8193a;

    /* renamed from: b */
    private String f8194b;

    /* renamed from: c */
    private int f8195c;

    /* renamed from: d */
    private long f8196d;

    /* loaded from: classes.dex */
    public interface OnPolicyListener extends ClassKeeper, PublicMemberKeeper {
        void onComplete(PrivacyPolicy privacyPolicy);

        void onFailure(Throwable th2);
    }

    public PrivacyPolicy() {
    }

    public PrivacyPolicy(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            setTimestamp(jSONObject.optLong(j.a("009b0bcTjgAde<b_bdDjc")));
            setTitle(a(jSONObject.optString(InnerShareParams.TITLE)));
            setContent(a(jSONObject.optString(j.a("0071becabiIbgRbi<b"))));
            String a10 = a(jSONObject.optString("ppVersion"));
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            setPpVersion(Integer.parseInt(a10.trim()));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    private String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String appkey = MobSDK.getAppkey();
            return new String(Data.AES128Decode(Data.rawMD5(appkey + ":" + DH.SyncMtd.getPackageName() + ":" + getTimestamp()), Base64.decode(str, 0)), "UTF-8");
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    public static PrivacyPolicy getPrivacyPolicy(int i10, Locale locale) {
        return null;
    }

    @Deprecated
    public static void getPrivacyPolicyAsync(int i10, OnPolicyListener onPolicyListener) {
        getPrivacyPolicyAsync(i10, null, onPolicyListener);
    }

    @Deprecated
    public static void getPrivacyPolicyAsync(int i10, Locale locale, final OnPolicyListener onPolicyListener) {
        if (onPolicyListener != null) {
            final Throwable th2 = new Throwable("This api is Deprecated, please do not call it");
            try {
                UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.PrivacyPolicy.1
                    @Override // android.os.Handler.Callback
                    public boolean handleMessage(Message message) {
                        onPolicyListener.onFailure(th2);
                        return false;
                    }
                });
            } catch (Throwable th3) {
                MobLog.getInstance().d(th3);
                onPolicyListener.onFailure(th2);
            }
        }
    }

    public String getContent() {
        return this.f8194b;
    }

    public int getPpVersion() {
        return this.f8195c;
    }

    public long getTimestamp() {
        return this.f8196d;
    }

    public String getTitle() {
        return this.f8193a;
    }

    public void setContent(String str) {
        this.f8194b = str;
    }

    public void setPpVersion(int i10) {
        this.f8195c = i10;
    }

    public void setTimestamp(long j10) {
        this.f8196d = j10;
    }

    public void setTitle(String str) {
        this.f8193a = str;
    }
}
