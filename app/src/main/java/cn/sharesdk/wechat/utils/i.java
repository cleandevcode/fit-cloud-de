package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.SSDKLog;

/* loaded from: classes.dex */
public class i {

    /* loaded from: classes.dex */
    public static final class a extends m {

        /* renamed from: a */
        public String f5574a;

        /* renamed from: b */
        public String f5575b = "";

        /* renamed from: c */
        public int f5576c = 0;

        /* renamed from: d */
        public String f5577d = "";

        @Override // cn.sharesdk.wechat.utils.m
        public final int a() {
            return 19;
        }

        @Override // cn.sharesdk.wechat.utils.m
        public final void b(Bundle bundle) {
            super.b(bundle);
            bundle.putString("_launch_wxminiprogram_username", this.f5574a);
            bundle.putString("_launch_wxminiprogram_path", this.f5575b);
            bundle.putInt("_launch_wxminiprogram_type", this.f5576c);
            bundle.putString("_launch_wxminiprogram_extData", this.f5577d);
        }

        @Override // cn.sharesdk.wechat.utils.m
        public final boolean b() {
            String str = this.f5574a;
            if (str == null || str.length() == 0 || this.f5574a.length() > 10240) {
                SSDKLog.b().a("checkArgs fail, userName is invalid", new Object[0]);
                return false;
            }
            int i10 = this.f5576c;
            if (i10 < 0 || i10 > 2) {
                SSDKLog.b().a("checkArgs fail", "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW");
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends WechatResp {

        /* renamed from: a */
        public String f5578a;

        public b(Bundle bundle) {
            a(bundle);
        }

        @Override // cn.sharesdk.wechat.utils.WechatResp
        public final int a() {
            return 19;
        }

        @Override // cn.sharesdk.wechat.utils.WechatResp
        public final void a(Bundle bundle) {
            super.a(bundle);
            this.f5578a = bundle.getString("_launch_wxminiprogram_ext_msg");
        }

        @Override // cn.sharesdk.wechat.utils.WechatResp
        public final void b(Bundle bundle) {
            super.b(bundle);
            bundle.putString("_launch_wxminiprogram_ext_msg", this.f5578a);
        }
    }
}
