package cn.sharesdk.framework;

import android.app.Activity;
import android.os.Handler;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.commons.eventrecoder.EventRecorder;
import com.mob.tools.utils.ResHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {
    public static ArrayList<Platform> a() {
        ArrayList<Platform> d10 = d();
        a(d10);
        return d10;
    }

    public static HashMap<Integer, HashMap<String, Object>> a(HashMap<String, Object> hashMap) {
        int i10;
        HashMap<Integer, HashMap<String, Object>> hashMap2 = null;
        if (hashMap != null && hashMap.size() > 0) {
            ArrayList arrayList = (ArrayList) hashMap.get("fakelist");
            if (arrayList == null) {
                return null;
            }
            hashMap2 = new HashMap<>();
            EventRecorder.addBegin("ShareSDK", "parseDevInfo");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                HashMap<String, Object> hashMap3 = (HashMap) it.next();
                if (hashMap3 != null) {
                    try {
                        i10 = ResHelper.parseInt(String.valueOf(hashMap3.get("snsplat")));
                    } catch (Throwable th2) {
                        SSDKLog.b().b(th2);
                        i10 = -1;
                    }
                    if (i10 != -1) {
                        hashMap2.put(Integer.valueOf(i10), hashMap3);
                    }
                }
            }
            EventRecorder.addEnd("ShareSDK", "parseDevInfo");
        }
        return hashMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(int r2, cn.sharesdk.framework.Platform r3) {
        /*
            cn.sharesdk.framework.a.b.d r0 = new cn.sharesdk.framework.a.b.d
            r0.<init>()
            r1 = 1
            if (r2 == r1) goto L21
            r1 = 2
            if (r2 == r1) goto L1e
            r1 = 3
            if (r2 == r1) goto L1b
            r1 = 4
            if (r2 == r1) goto L18
            r1 = 5
            if (r2 == r1) goto L15
            goto L25
        L15:
            java.lang.String r2 = "SHARESDK_CANCEL_SHARE"
            goto L23
        L18:
            java.lang.String r2 = "SHARESDK_FAILED_SHARE"
            goto L23
        L1b:
            java.lang.String r2 = "SHARESDK_EDIT_SHARE"
            goto L23
        L1e:
            java.lang.String r2 = "SHARESDK_CANCEL_SHAREMENU"
            goto L23
        L21:
            java.lang.String r2 = "SHARESDK_ENTER_SHAREMENU"
        L23:
            r0.f5135a = r2
        L25:
            if (r3 == 0) goto L2d
            int r2 = r3.getPlatformId()
            r0.f5136b = r2
        L2d:
            cn.sharesdk.framework.a.d r2 = cn.sharesdk.framework.a.d.a()
            if (r2 == 0) goto L36
            r2.a(r0)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.sharesdk.framework.h.a(int, cn.sharesdk.framework.Platform):void");
    }

    public static void a(Activity activity) {
        cn.sharesdk.framework.authorize.a c10 = cn.sharesdk.framework.authorize.a.c();
        if (c10 != null) {
            c10.a(activity);
        }
    }

    public static void a(Handler handler) {
        cn.sharesdk.framework.a.d a10 = cn.sharesdk.framework.a.d.a();
        if (a10 != null) {
            a10.a(handler);
            a10.c();
        }
    }

    public static void a(String str, int i10) {
        cn.sharesdk.framework.a.d a10 = cn.sharesdk.framework.a.d.a();
        if (a10 == null) {
            return;
        }
        cn.sharesdk.framework.a.b.a aVar = new cn.sharesdk.framework.a.b.a();
        aVar.f5118b = str;
        aVar.f5117a = i10;
        a10.a(aVar);
    }

    public static void a(ArrayList<Platform> arrayList) {
        if (arrayList == null) {
            return;
        }
        Collections.sort(arrayList, new Comparator<Platform>() { // from class: cn.sharesdk.framework.h.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(Platform platform, Platform platform2) {
                int platformId;
                int platformId2;
                if (platform.getSortId() != platform2.getSortId()) {
                    platformId = platform.getSortId();
                    platformId2 = platform2.getSortId();
                } else {
                    platformId = platform.getPlatformId();
                    platformId2 = platform2.getPlatformId();
                }
                return platformId - platformId2;
            }
        });
    }

    public static void a(boolean z10) {
        cn.sharesdk.framework.authorize.a c10 = cn.sharesdk.framework.authorize.a.c();
        if (c10 != null) {
            c10.a(z10);
        }
    }

    public static Activity b() {
        return cn.sharesdk.framework.authorize.a.c().b();
    }

    public static boolean c() {
        return cn.sharesdk.framework.authorize.a.c().a();
    }

    private static ArrayList<Platform> d() {
        String[] strArr = {"cn.sharesdk.douban.Douban", "cn.sharesdk.evernote.Evernote", "cn.sharesdk.facebook.Facebook", "cn.sharesdk.renren.Renren", "cn.sharesdk.sina.weibo.SinaWeibo", "cn.sharesdk.kaixin.KaiXin", "cn.sharesdk.linkedin.LinkedIn", "cn.sharesdk.system.email.Email", "cn.sharesdk.system.text.ShortMessage", "cn.sharesdk.tencent.qq.QQ", "cn.sharesdk.tencent.qzone.QZone", "cn.sharesdk.tencent.weibo.TencentWeibo", "cn.sharesdk.twitter.Twitter", "cn.sharesdk.wechat.friends.Wechat", "cn.sharesdk.wechat.moments.WechatMoments", "cn.sharesdk.wechat.favorite.WechatFavorite", "cn.sharesdk.youdao.YouDao", "cn.sharesdk.google.GooglePlus", "cn.sharesdk.foursquare.FourSquare", "cn.sharesdk.pinterest.Pinterest", "cn.sharesdk.flickr.Flickr", "cn.sharesdk.tumblr.Tumblr", "cn.sharesdk.dropbox.Dropbox", "cn.sharesdk.vkontakte.VKontakte", "cn.sharesdk.instagram.Instagram", "cn.sharesdk.yixin.friends.Yixin", "cn.sharesdk.yixin.moments.YixinMoments", "cn.sharesdk.mingdao.Mingdao", "cn.sharesdk.line.Line", "cn.sharesdk.kakao.story.KakaoStory", "cn.sharesdk.kakao.talk.KakaoTalk", "cn.sharesdk.whatsapp.WhatsApp", "cn.sharesdk.pocket.Pocket", "cn.sharesdk.instapaper.Instapaper", "cn.sharesdk.facebookmessenger.FacebookMessenger", "cn.sharesdk.alipay.friends.Alipay", "cn.sharesdk.alipay.moments.AlipayMoments", "cn.sharesdk.dingding.friends.Dingding", "cn.sharesdk.youtube.Youtube", "cn.sharesdk.meipai.Meipai", "cn.sharesdk.telegram.Telegram", "cn.sharesdk.cmcc.Cmcc", "cn.sharesdk.reddit.Reddit", "cn.sharesdk.telecom.Telecom", "cn.sharesdk.accountkit.Accountkit", "cn.sharesdk.douyin.Douyin", "cn.sharesdk.wework.Wework", "cn.sharesdk.oasis.Oasis", "cn.sharesdk.hwaccount.HWAccount", "cn.sharesdk.xmaccount.XMAccount", "cn.sharesdk.snapchat.Snapchat", "cn.sharesdk.littleredbook.Littleredbook", "cn.sharesdk.kuaishou.Kuaishou", "cn.sharesdk.watermelonvideo.Watermelonvideo", "cn.sharesdk.tiktok.Tiktok", "cn.sharesdk.taptap.Taptap"};
        ArrayList<Platform> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < 56; i10++) {
            String str = strArr[i10];
            try {
                arrayList.add((Platform) Class.forName(str).newInstance());
            } catch (Throwable unused) {
                SSDKLog.b().a(a.b.b("not found:", str), new Object[0]);
            }
        }
        return arrayList;
    }
}
