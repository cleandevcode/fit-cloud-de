package cn.sharesdk.framework.a.a;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.utils.SharePrefrenceHelper;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b */
    private static e f5110b;

    /* renamed from: a */
    private SharePrefrenceHelper f5111a;

    private e() {
        SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
        this.f5111a = sharePrefrenceHelper;
        sharePrefrenceHelper.open("share_sdk", 1);
    }

    public static e a() {
        if (f5110b == null) {
            f5110b = new e();
        }
        return f5110b;
    }

    public void a(long j10) {
        this.f5111a.putLong("device_time", Long.valueOf(j10));
    }

    public void a(String str) {
        this.f5111a.putString("trans_short_link", str);
    }

    public void a(String str, int i10) {
        this.f5111a.putInt(str, Integer.valueOf(i10));
    }

    public void a(String str, Long l10) {
        this.f5111a.putLong(str, l10);
    }

    public void a(String str, Object obj) {
        this.f5111a.put(str, obj);
    }

    public void a(boolean z10) {
        this.f5111a.putBoolean("gpp_ver_sent", Boolean.valueOf(z10));
    }

    public long b() {
        return this.f5111a.getLong("service_time");
    }

    public void b(long j10) {
        this.f5111a.putLong("connect_server_time", Long.valueOf(j10));
    }

    public void b(String str) {
        this.f5111a.putString("upload_device_info", str);
    }

    public void b(boolean z10) {
        this.f5111a.putBoolean("no_use_gpp", Boolean.valueOf(z10));
    }

    public void c(String str) {
        this.f5111a.putString("upload_user_info", str);
    }

    public void c(boolean z10) {
        this.f5111a.putBoolean("connect_server", Boolean.valueOf(z10));
    }

    public boolean c() {
        String string = this.f5111a.getString("upload_device_info");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        return Boolean.parseBoolean(string);
    }

    public void d(String str) {
        this.f5111a.putString("upload_share_content", str);
    }

    public void d(boolean z10) {
        this.f5111a.putBoolean("sns_info_buffered", Boolean.valueOf(z10));
    }

    public boolean d() {
        String string = this.f5111a.getString("upload_user_info");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        return Boolean.parseBoolean(string);
    }

    public void e(String str) {
        this.f5111a.putString("open_login_plus", str);
    }

    public boolean e() {
        String string = this.f5111a.getString("trans_short_link");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        return Boolean.parseBoolean(string);
    }

    public int f() {
        String string = this.f5111a.getString("upload_share_content");
        if ("true".equals(string)) {
            return 1;
        }
        return "false".equals(string) ? -1 : 0;
    }

    public void f(String str) {
        this.f5111a.putString("open_sina_link_card", str);
    }

    public String g() {
        SharePrefrenceHelper sharePrefrenceHelper = this.f5111a;
        StringBuilder a10 = android.support.v4.media.d.a("buffered_snsconf_");
        a10.append(MobSDK.getAppkey());
        return sharePrefrenceHelper.getString(a10.toString());
    }

    public Long h() {
        return Long.valueOf(this.f5111a.getLong("device_time"));
    }

    public boolean h(String str) {
        return this.f5111a.getBoolean(str);
    }

    public long i(String str) {
        return this.f5111a.getLong(str);
    }

    public boolean i() {
        return this.f5111a.getBoolean("connect_server");
    }

    public int j(String str) {
        return this.f5111a.getInt(str);
    }

    public Long j() {
        return Long.valueOf(this.f5111a.getLong("connect_server_time"));
    }

    public Object k(String str) {
        return this.f5111a.get(str);
    }

    public boolean k() {
        return this.f5111a.getBoolean("sns_info_buffered");
    }

    public void g(String str) {
        SharePrefrenceHelper sharePrefrenceHelper = this.f5111a;
        StringBuilder a10 = android.support.v4.media.d.a("buffered_snsconf_");
        a10.append(MobSDK.getAppkey());
        sharePrefrenceHelper.putString(a10.toString(), str);
    }
}
