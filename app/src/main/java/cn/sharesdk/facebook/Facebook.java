package cn.sharesdk.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.InnerShareParams;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.ShareSDKFileProvider;
import cn.sharesdk.framework.utils.g;
import com.mob.MobSDK;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o5.f;
import o5.h;
import o5.h0;
import o5.j0;
import o5.v;

/* loaded from: classes.dex */
public class Facebook extends Platform {
    public static final String NAME = "Facebook";
    public static final String PARAMS_HASHTAG = "params_Hashtag";
    public static final String PARAMS_LINKURL = "params_linkurl";
    public static final String PARAMS_QUOTE = "params_Quote";

    /* renamed from: a */
    private String f4979a;

    /* renamed from: b */
    private String f4980b;

    /* renamed from: c */
    private boolean f4981c;

    /* renamed from: d */
    private boolean f4982d;

    /* renamed from: e */
    private boolean f4983e;

    /* renamed from: f */
    private boolean f4984f;

    /* loaded from: classes.dex */
    public static class ShareParams extends Platform.ShareParams {
    }

    private void a(Platform platform, Platform.ShareParams shareParams, PlatformActionListener platformActionListener) {
        try {
            g gVar = new g();
            gVar.a("com.facebook.katana", "com.facebook.composer.shareintent.ImplicitShareIntentHandlerDefaultAlias");
            if (shareParams.getShareType() != 6) {
                gVar.a(shareParams, platform);
            } else if (TextUtils.isEmpty(shareParams.getFilePath())) {
                if (platformActionListener != null) {
                    platformActionListener.onError(platform, 9, new Throwable("Share type is VIDEO, But FilePath is null"));
                    return;
                }
                return;
            } else {
                gVar.a(shareParams.getFilePath(), platform, platformActionListener);
            }
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("ShareParams", shareParams);
            platformActionListener.onComplete(platform, 9, hashMap);
        } catch (Throwable th2) {
            if (platformActionListener != null) {
                platformActionListener.onError(platform, 9, th2);
            }
            SSDKLog.b().a(th2, "Facebook share byPassShare catch ", new Object[0]);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i10, Object obj) {
        SSDKLog b10;
        String str;
        SSDKLog.b().a("Facebook checkAuthorize ");
        SSDKLog b11 = SSDKLog.b();
        StringBuilder a10 = android.support.v4.media.d.a("Facebook checkAuthorize action == ");
        a10.append(String.valueOf(i10));
        b11.a(a10.toString());
        SSDKLog b12 = SSDKLog.b();
        StringBuilder a11 = android.support.v4.media.d.a("Facebook checkAuthorize shareByAppClient == ");
        a11.append(String.valueOf(this.f4981c));
        b12.a(a11.toString());
        SSDKLog b13 = SSDKLog.b();
        StringBuilder a12 = android.support.v4.media.d.a("Facebook checkAuthorize isClientValid == ");
        a12.append(String.valueOf(this.isClientValid));
        b13.a(a12.toString());
        if (i10 == 9 && this.f4981c && this.isClientValid) {
            b10 = SSDKLog.b();
            str = "Facebook checkAuthorize ACTION_SHARE return true";
        } else if (i10 == 6) {
            b10 = SSDKLog.b();
            str = "Facebook checkAuthorize ACTION_FOLLOWING_USER return true";
        } else {
            if (isAuthValid()) {
                SSDKLog.b().a("Facebook checkAuthorize isAuthValid return true");
                d a13 = d.a(this);
                a13.a(this.f4979a);
                String token = this.f5036db.getToken();
                String valueOf = String.valueOf(this.f5036db.getExpiresIn());
                if (token != null && valueOf != null) {
                    a13.a(token, valueOf);
                    if (a13.a()) {
                        return true;
                    }
                }
            } else if ((obj instanceof Platform.ShareParams) && ((Platform.ShareParams) obj).getShareType() == 4) {
                b10 = SSDKLog.b();
                str = "Facebook checkAuthorize SHARE_WEBPAGE return true";
            }
            innerAuthorize(i10, obj);
            SSDKLog.b().a("Facebook checkAuthorize return false");
            return false;
        }
        b10.a(str);
        return true;
    }

    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
        if (!this.f4982d) {
            SSDKLog.b().a("Facebook doAuthorize by origianl");
            final d a10 = d.a(this);
            a10.a(this.f4979a);
            a10.b(this.f4980b);
            a10.a(strArr);
            a10.a(new AuthorizeListener() { // from class: cn.sharesdk.facebook.Facebook.1
                @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                public void onCancel() {
                    if (Facebook.this.listener != null) {
                        Facebook.this.listener.onCancel(Facebook.this, 1);
                    }
                    SSDKLog.b().a("Facebook doAuthorize by origianl onCancel ");
                }

                @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                public void onComplete(Bundle bundle) {
                    SSDKLog.b().a("Facebook doAuthorize by origianl onComplete ");
                    String string = bundle.getString("oauth_token");
                    int i10 = bundle.getInt("oauth_token_expires");
                    if (i10 == 0) {
                        try {
                            i10 = ResHelper.parseInt(String.valueOf(bundle.get(Oauth2AccessToken.KEY_EXPIRES_IN)));
                        } catch (Throwable th2) {
                            SSDKLog.b().a(th2);
                            i10 = 0;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        string = bundle.getString(Oauth2AccessToken.KEY_ACCESS_TOKEN);
                    }
                    Facebook.this.f5036db.putToken(string);
                    Facebook.this.f5036db.putExpiresIn(i10);
                    a10.a(string, String.valueOf(i10));
                    Facebook.this.afterRegister(1, null);
                }

                @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                public void onError(Throwable th2) {
                    if (Facebook.this.listener != null) {
                        Facebook.this.listener.onError(Facebook.this, 1, th2);
                    }
                    SSDKLog b10 = SSDKLog.b();
                    b10.a("Facebook doAuthorize by origianl onError " + th2);
                }
            }, isSSODisable());
            return;
        }
        try {
            SSDKLog.b().a("Facebook doAuthorize by official");
            new FacebookOfficialAuth(this.listener, this).show(MobSDK.getContext(), null);
            SSDKLog.b().a("Facebook doAuthorize ");
        } catch (Throwable th2) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 1, th2);
            }
            SSDKLog b10 = SSDKLog.b();
            b10.a("Facebook doAuthorize catch: " + th2);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void doCustomerProtocol(String str, String str2, int i10, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        try {
            HashMap<String, Object> a10 = d.a(this).a(str, str2, hashMap, hashMap2);
            if (a10 != null && a10.size() > 0) {
                if (!a10.containsKey("error_code") && !a10.containsKey("error")) {
                    PlatformActionListener platformActionListener = this.listener;
                    if (platformActionListener != null) {
                        platformActionListener.onComplete(this, i10, a10);
                        return;
                    }
                    return;
                }
                if (this.listener != null) {
                    this.listener.onError(this, i10, new Throwable(new Hashon().fromHashMap(a10)));
                    return;
                }
                return;
            }
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, i10, new Throwable("response is null"));
            }
        } catch (Throwable th2) {
            PlatformActionListener platformActionListener3 = this.listener;
            if (platformActionListener3 != null) {
                platformActionListener3.onError(this, i10, th2);
            }
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void doShare(final Platform.ShareParams shareParams) {
        SSDKLog b10 = SSDKLog.b();
        StringBuilder a10 = android.support.v4.media.d.a("Facebook doShare with consumerKey:");
        a10.append(this.f4979a);
        a10.append("redirectUrl");
        a10.append(this.f4980b);
        a10.append("official");
        a10.append(this.f4982d);
        int i10 = 0;
        b10.a(a10.toString(), new Object[0]);
        SSDKLog b11 = SSDKLog.b();
        StringBuilder a11 = android.support.v4.media.d.a("FaceBook ShareParams:");
        a11.append(shareParams.toString());
        b11.a(a11.toString(), new Object[0]);
        d a12 = d.a(this);
        a12.a(this.f4979a);
        try {
            String imagePath = shareParams.getImagePath();
            String imageUrl = shareParams.getImageUrl();
            String url = shareParams.getUrl();
            List<String> arrayList = new ArrayList();
            if (shareParams.getImageArray() != null) {
                arrayList = Arrays.asList(shareParams.getImageArray());
            }
            if (this.f4983e) {
                if (this.f4981c) {
                    SSDKLog.b().a("Facebook bypassApproval ", new Object[0]);
                    a(this, shareParams, this.listener);
                    return;
                }
                if (this.listener != null) {
                    this.listener.onError(this, 9, new Throwable("Set share bypassApproval but no client or ShareByAppClient is false"));
                }
                SSDKLog.b().a("Set share bypassApproval but no client or ShareByAppClient is false", new Object[0]);
                return;
            }
            if (this.f4981c) {
                SSDKLog.b().a("Facebook doShare 应用邀请功能");
                if (shareParams.getShareType() == 7) {
                    InviteActivity inviteActivity = new InviteActivity();
                    inviteActivity.setPlatformActionListener(this.listener, this, shareParams);
                    inviteActivity.setInviteParams(this.f4979a);
                    inviteActivity.show(MobSDK.getContext(), null);
                    return;
                } else if (!this.f4982d) {
                    SSDKLog.b().a("Facebook share by primordial", new Object[0]);
                    if (arrayList != null && arrayList.size() > 0) {
                        for (String str : arrayList) {
                            if (str.startsWith("http")) {
                                str = BitmapHelper.downloadBitmap(MobSDK.getContext(), str);
                                arrayList.set(i10, str);
                            }
                            File file = new File(str);
                            if (file.exists() && str.startsWith("/data/")) {
                                arrayList.remove(str);
                                String cachePath = ResHelper.getCachePath(MobSDK.getContext(), "images");
                                File file2 = new File(cachePath, System.currentTimeMillis() + file.getName());
                                String absolutePath = file2.getAbsolutePath();
                                file2.createNewFile();
                                if (ResHelper.copyFile(str, absolutePath)) {
                                    arrayList.add(file.getAbsolutePath());
                                }
                            }
                            i10++;
                        }
                        a12.a(this.listener, shareParams);
                        return;
                    }
                    if (TextUtils.isEmpty(imagePath) || !new File(imagePath).exists()) {
                        Bitmap imageData = shareParams.getImageData();
                        if (imageData != null && !imageData.isRecycled()) {
                            String cachePath2 = ResHelper.getCachePath(MobSDK.getContext(), "images");
                            File file3 = new File(cachePath2, System.currentTimeMillis() + ".png");
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            imageData.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            imagePath = file3.getAbsolutePath();
                            SSDKLog b12 = SSDKLog.b();
                            b12.a("Facebook share by primordial imagepath: " + imagePath, new Object[0]);
                        } else if (!TextUtils.isEmpty(imageUrl)) {
                            imagePath = BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl);
                            SSDKLog b13 = SSDKLog.b();
                            b13.a("Facebook share by primordial dowanload imagepath: " + imagePath, new Object[0]);
                        }
                    }
                    if (!TextUtils.isEmpty(imagePath)) {
                        arrayList.add(imagePath);
                        shareParams.setImageArray((String[]) arrayList.toArray(new String[arrayList.size()]));
                    }
                    a12.a(this.listener, shareParams);
                    return;
                } else {
                    SSDKLog.b().a("Facebook FacebookOfficialHelper shareImageOfficiall");
                    v.k(MobSDK.getContext());
                    if (shareParams.getShareType() == 2) {
                        SSDKLog.b().a("Facebook share by official SHARE_IMAGE", new Object[0]);
                        Bitmap imageData2 = shareParams.getImageData();
                        String hashtag = shareParams.getHashtag();
                        String imagePath2 = shareParams.getImagePath();
                        if (imageData2 != null) {
                            SSDKLog.b().a("Facebook share by official that picImageData", new Object[0]);
                            FacebookOfficialShareImage facebookOfficialShareImage = new FacebookOfficialShareImage(this, this.listener);
                            facebookOfficialShareImage.setBitmapParams(imageData2);
                            facebookOfficialShareImage.setHashTag(hashtag);
                            facebookOfficialShareImage.show(MobSDK.getContext(), null);
                            return;
                        } else if (!TextUtils.isEmpty(imagePath2)) {
                            SSDKLog.b().a("Facebook share by official that ImagePath", new Object[0]);
                            Bitmap decodeStream = BitmapFactory.decodeStream(new FileInputStream(imagePath2));
                            FacebookOfficialShareImage facebookOfficialShareImage2 = new FacebookOfficialShareImage(this, this.listener);
                            facebookOfficialShareImage2.setBitmapParams(decodeStream);
                            facebookOfficialShareImage2.setHashTag(hashtag);
                            facebookOfficialShareImage2.show(MobSDK.getContext(), null);
                            return;
                        } else if (!TextUtils.isEmpty(imageUrl)) {
                            SSDKLog.b().a("Facebook share by official that imageUrl", new Object[0]);
                            try {
                                Bitmap decodeStream2 = BitmapFactory.decodeStream(new FileInputStream(BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl)));
                                FacebookOfficialShareImage facebookOfficialShareImage3 = new FacebookOfficialShareImage(this, this.listener);
                                facebookOfficialShareImage3.setBitmapParams(decodeStream2);
                                facebookOfficialShareImage3.setHashTag(hashtag);
                                facebookOfficialShareImage3.show(MobSDK.getContext(), null);
                                return;
                            } catch (Throwable th2) {
                                if (this.listener != null) {
                                    this.listener.onError(this, 9, new Throwable("Picture download catch: " + th2));
                                    return;
                                }
                                return;
                            }
                        } else if (this.listener != null) {
                            SSDKLog.b().a("Facebook doShare official please set imageData params");
                            this.listener.onError(this, 9, new Throwable("please set imageData or imagePath or imageUrl params"));
                            return;
                        }
                    } else if (shareParams.getShareType() == 6) {
                        SSDKLog.b().a("Facebook share by official that SHARE_VIDEO", new Object[0]);
                        Uri videoUri = shareParams.getVideoUri();
                        if (videoUri == null) {
                            String filePath = shareParams.getFilePath();
                            if (TextUtils.isEmpty(filePath)) {
                                SSDKLog.b().a("filePath file is not exists", new Object[0]);
                            } else {
                                File file4 = new File(filePath);
                                if (file4.exists()) {
                                    Context context = MobSDK.getContext();
                                    videoUri = ShareSDKFileProvider.a(context, MobSDK.getContext().getPackageName() + ".cn.sharesdk.ShareSDKFileProvider", file4);
                                    MobSDK.getContext().grantUriPermission("com.facebook.katana", videoUri, 3);
                                }
                            }
                        }
                        String hashtag2 = shareParams.getHashtag();
                        if (videoUri != null) {
                            FacebookOfficialShareVideo facebookOfficialShareVideo = new FacebookOfficialShareVideo(this, this.listener);
                            facebookOfficialShareVideo.setVideoUri(videoUri);
                            facebookOfficialShareVideo.setHashTag(hashtag2);
                            facebookOfficialShareVideo.show(MobSDK.getContext(), null);
                            return;
                        } else if (this.listener != null) {
                            SSDKLog.b().a("Facebook doShare official please set video uri");
                            this.listener.onError(this, 9, new Throwable("please set video uri"));
                            return;
                        }
                    } else if (shareParams.getShareType() == 4) {
                        SSDKLog.b().a("Facebook share by official that SHARE_WEBPAGE", new Object[0]);
                        String url2 = shareParams.getUrl();
                        String quote = shareParams.getQuote();
                        String hashtag3 = shareParams.getHashtag();
                        if (!TextUtils.isEmpty(url2)) {
                            FacebookOfficialShareWebPage facebookOfficialShareWebPage = new FacebookOfficialShareWebPage(this, this.listener);
                            Intent intent = new Intent();
                            intent.putExtra(PARAMS_LINKURL, url2);
                            intent.putExtra(PARAMS_QUOTE, quote);
                            intent.putExtra(PARAMS_HASHTAG, hashtag3);
                            facebookOfficialShareWebPage.show(MobSDK.getContext(), intent);
                            return;
                        } else if (this.listener != null) {
                            SSDKLog.b().a("Facebook doShare official please set webpage url");
                            this.listener.onError(this, 9, new Throwable("please set webpage url"));
                            return;
                        }
                    } else if (shareParams.getShareType() == 1) {
                        SSDKLog.b().a("Facebook share by official that SHARE_TEXT", new Object[0]);
                        String text = shareParams.getText();
                        if (!TextUtils.isEmpty(text)) {
                            FacebookOfficialShareWebPage facebookOfficialShareWebPage2 = new FacebookOfficialShareWebPage(this, this.listener);
                            Intent intent2 = new Intent();
                            intent2.putExtra(PARAMS_LINKURL, "https://");
                            intent2.putExtra(PARAMS_QUOTE, "");
                            intent2.putExtra(PARAMS_HASHTAG, text);
                            facebookOfficialShareWebPage2.show(MobSDK.getContext(), intent2);
                            return;
                        } else if (this.listener != null) {
                            SSDKLog.b().a("Facebook doShare official please set text");
                            this.listener.onError(this, 9, new Throwable("please set text"));
                            return;
                        }
                    } else if (this.listener != null) {
                        SSDKLog.b().a("Facebook doShare official please set share Type");
                        this.listener.onError(this, 9, new Throwable("please set share Type"));
                        return;
                    }
                }
            }
            if (!TextUtils.isEmpty(url)) {
                if (TextUtils.isEmpty(imageUrl) && !TextUtils.isEmpty(imagePath) && new File(imagePath).exists()) {
                    shareParams.setImageUrl(uploadImageToFileServer(imagePath));
                }
                a12.a(shareParams, new PlatformActionListener() { // from class: cn.sharesdk.facebook.Facebook.2
                    @Override // cn.sharesdk.framework.PlatformActionListener
                    public void onCancel(Platform platform, int i11) {
                        if (Facebook.this.listener != null) {
                            Facebook.this.listener.onCancel(Facebook.this, 9);
                        }
                    }

                    @Override // cn.sharesdk.framework.PlatformActionListener
                    public void onComplete(Platform platform, int i11, HashMap<String, Object> hashMap) {
                        if (Facebook.this.listener != null) {
                            hashMap.put("ShareParams", shareParams);
                            Facebook.this.listener.onComplete(Facebook.this, 9, hashMap);
                        }
                    }

                    @Override // cn.sharesdk.framework.PlatformActionListener
                    public void onError(Platform platform, int i11, Throwable th3) {
                        if (Facebook.this.listener != null) {
                            Facebook.this.listener.onError(Facebook.this, 9, th3);
                        }
                    }
                });
            } else if (!TextUtils.isEmpty(imagePath) && new File(imagePath).exists()) {
                PlatformActionListener platformActionListener = this.listener;
                if (platformActionListener != null) {
                    platformActionListener.onError(this, 9, new Throwable("Please install the facebook client"));
                }
            } else {
                if (!TextUtils.isEmpty(imageUrl)) {
                    PlatformActionListener platformActionListener2 = this.listener;
                    if (platformActionListener2 != null) {
                        platformActionListener2.onError(this, 9, new Throwable("Please install the facebook client"));
                        return;
                    }
                } else if (TextUtils.isEmpty(shareParams.getFilePath())) {
                    PlatformActionListener platformActionListener3 = this.listener;
                    if (platformActionListener3 != null) {
                        platformActionListener3.onError(this, 9, new Throwable("Share parameter error, please check"));
                        return;
                    }
                } else {
                    PlatformActionListener platformActionListener4 = this.listener;
                    if (platformActionListener4 != null) {
                        platformActionListener4.onError(this, 9, new Throwable("Share video only supports facebook client, please install facebook client"));
                        return;
                    }
                }
                PlatformActionListener platformActionListener5 = this.listener;
                if (platformActionListener5 != null) {
                    platformActionListener5.onError(this, 9, new Throwable("response is null"));
                }
            }
        } catch (Throwable th3) {
            PlatformActionListener platformActionListener6 = this.listener;
            if (platformActionListener6 != null) {
                platformActionListener6.onError(this, 9, th3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0232  */
    @Override // cn.sharesdk.framework.Platform
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.HashMap<java.lang.String, java.lang.Object> filterFriendshipInfo(int r24, java.util.HashMap<java.lang.String, java.lang.Object> r25) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.sharesdk.facebook.Facebook.filterFriendshipInfo(int, java.util.HashMap):java.util.HashMap");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    @Override // cn.sharesdk.framework.Platform
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cn.sharesdk.framework.a.b.f.a filterShareContent(cn.sharesdk.framework.Platform.ShareParams r4, java.util.HashMap<java.lang.String, java.lang.Object> r5) {
        /*
            r3 = this;
            cn.sharesdk.framework.a.b.f$a r0 = new cn.sharesdk.framework.a.b.f$a
            r0.<init>()
            java.lang.String r1 = r4.getText()
            r0.f5150b = r1
            if (r5 == 0) goto L56
            java.lang.String r1 = "source"
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L23
            java.util.ArrayList<java.lang.String> r4 = r0.f5152d
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L1f:
            r4.add(r1)
            goto L44
        L23:
            r1 = 4
            int r2 = r4.getShareType()
            if (r1 != r2) goto L44
            java.util.ArrayList<java.lang.String> r1 = r0.f5152d
            java.lang.String r2 = r4.getImageUrl()
            r1.add(r2)
            java.lang.String r1 = r4.getTitleUrl()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L41
            java.lang.String r1 = r4.getUrl()
        L41:
            java.util.ArrayList<java.lang.String> r4 = r0.f5151c
            goto L1f
        L44:
            java.lang.String r4 = "post_id"
            java.lang.Object r4 = r5.get(r4)
            if (r4 != 0) goto L4e
            r4 = 0
            goto L52
        L4e:
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L52:
            r0.f5149a = r4
            r0.f5155g = r5
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.sharesdk.facebook.Facebook.filterShareContent(cn.sharesdk.framework.Platform$ShareParams, java.util.HashMap):cn.sharesdk.framework.a.b.f$a");
    }

    @Override // cn.sharesdk.framework.Platform
    public void follow(String str) {
        PlatformActionListener platformActionListener = this.listener;
        if (platformActionListener != null) {
            platformActionListener.onCancel(this, 7);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getBilaterals(int i10, int i11, String str) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getFollowers(int i10, int i11, String str) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getFollowings(int i10, int i11, String str) {
        try {
            HashMap<String, Object> a10 = d.a(this).a(i10, i11, str);
            if (a10 != null && a10.size() > 0 && !a10.containsKey("error_code") && !a10.containsKey("error")) {
                a10.put("current_limit", Integer.valueOf(i10));
                a10.put("current_cursor", Integer.valueOf(i11));
                return filterFriendshipInfo(2, a10);
            }
            return null;
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return null;
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void getFriendList(int i10, int i11, String str) {
        try {
            HashMap<String, Object> a10 = d.a(this).a(i10, i11 * i10, str);
            if (a10 != null && a10.size() > 0) {
                if (!a10.containsKey("error_code") && !a10.containsKey("error")) {
                    PlatformActionListener platformActionListener = this.listener;
                    if (platformActionListener != null) {
                        platformActionListener.onComplete(this, 2, a10);
                        return;
                    }
                    return;
                }
                if (this.listener != null) {
                    this.listener.onError(this, 2, new Throwable(new Hashon().fromHashMap(a10)));
                    return;
                }
                return;
            }
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, 2, new Throwable("response is null"));
            }
        } catch (Throwable th2) {
            PlatformActionListener platformActionListener3 = this.listener;
            if (platformActionListener3 != null) {
                platformActionListener3.onError(this, 2, th2);
            }
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public String getName() {
        return NAME;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getPlatformId() {
        return 10;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
        return 2;
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
        return true;
    }

    @Override // cn.sharesdk.framework.Platform
    public void initDevInfo(String str) {
        this.f4979a = getDevinfo("ConsumerKey");
        this.f4980b = getDevinfo("RedirectUrl");
        this.f4981c = "true".equals(getDevinfo("ShareByAppClient"));
        this.f4983e = "true".equals(getDevinfo("BypassApproval"));
        SSDKLog b10 = SSDKLog.b();
        StringBuilder a10 = android.support.v4.media.d.a("Facebook initDevInfo ShareByAppClient value is: ");
        a10.append(getDevinfo("ShareByAppClient"));
        b10.a(a10.toString());
        if (!TextUtils.isEmpty(getDevinfo("FaceBookAppType"))) {
            this.f4984f = true;
            SSDKLog b11 = SSDKLog.b();
            StringBuilder a11 = android.support.v4.media.d.a("Facebook AppType is: ");
            a11.append(getDevinfo("Official"));
            b11.a(a11.toString());
        } else {
            this.f4984f = false;
        }
        if (!TextUtils.isEmpty(getDevinfo("OfficialVersion"))) {
            this.f4982d = true;
            SSDKLog b12 = SSDKLog.b();
            StringBuilder a12 = android.support.v4.media.d.a("Facebook Official value is: ");
            a12.append(getDevinfo("Official"));
            b12.a(a12.toString());
            return;
        }
        this.f4982d = false;
    }

    @Override // cn.sharesdk.framework.Platform
    public void isClientValid(ShareSDKCallback<Boolean> shareSDKCallback) {
        try {
            d a10 = d.a(this);
            a10.a(this.f4979a);
            a10.a(shareSDKCallback);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(Boolean.FALSE);
            }
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void removeAccount(boolean z10) {
        super.removeAccount(z10);
        if (this.f4982d) {
            n6.v a10 = n6.v.a();
            Date date = o5.a.f22664l;
            f.f22706f.a().c(null, true);
            h.b.a(null);
            String str = h0.f22744h;
            j0.f22774d.a().a(null, true);
            SharedPreferences.Editor edit = a10.f22176c.edit();
            edit.putBoolean("express_login_allowed", false);
            edit.apply();
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void setNetworkDevinfo() {
        this.f4979a = getNetworkDevinfo("api_key", "ConsumerKey");
        String networkDevinfo = getNetworkDevinfo("redirect_uri", "RedirectUrl");
        this.f4980b = networkDevinfo;
        if (TextUtils.isEmpty(networkDevinfo)) {
            this.f4980b = "fbconnect://success";
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void timeline(int i10, int i11, String str) {
        PlatformActionListener platformActionListener = this.listener;
        if (platformActionListener != null) {
            platformActionListener.onCancel(this, 7);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void userInfor(String str) {
        String str2;
        HashMap hashMap;
        Object obj = "end_date";
        String str3 = "-";
        try {
            HashMap<String, Object> a10 = d.a(this).a(str, Boolean.valueOf(this.f4984f));
            if (a10 != null && a10.size() > 0) {
                if (!a10.containsKey("error_code") && !a10.containsKey("error")) {
                    if (str == null) {
                        this.f5036db.putUserId(String.valueOf(a10.get("id")));
                        Object obj2 = "start_date";
                        this.f5036db.put("nickname", String.valueOf(a10.get("name")));
                        this.f5036db.put("gender", "male".equals(String.valueOf(a10.get("gender"))) ? "0" : "1");
                        this.f5036db.put("token_for_business", (String) a10.get("token_for_business"));
                        HashMap hashMap2 = a10.containsKey("picture") ? (HashMap) a10.get("picture") : null;
                        if (hashMap2 != null && (hashMap = (HashMap) hashMap2.get("data")) != null) {
                            this.f5036db.put("icon", String.valueOf(hashMap.get(InnerShareParams.URL)));
                        }
                        if (a10.containsKey("birthday")) {
                            String[] split = String.valueOf(a10.get("birthday")).split("/");
                            Calendar calendar = Calendar.getInstance();
                            calendar.set(1, ResHelper.parseInt(split[2]));
                            calendar.set(2, ResHelper.parseInt(split[0]) - 1);
                            calendar.set(5, ResHelper.parseInt(split[1]));
                            this.f5036db.put("birthday", String.valueOf(calendar.getTimeInMillis()));
                        }
                        this.f5036db.put("secretType", "true".equals(String.valueOf(a10.get("verified"))) ? "1" : "0");
                        this.f5036db.put("snsUserUrl", String.valueOf(a10.get("link")));
                        this.f5036db.put("resume", String.valueOf(a10.get("link")));
                        ArrayList arrayList = a10.containsKey("education") ? (ArrayList) a10.get("education") : null;
                        if (arrayList != null) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                HashMap hashMap3 = (HashMap) it.next();
                                HashMap hashMap4 = new HashMap();
                                hashMap4.put("school_type", 0);
                                HashMap hashMap5 = hashMap3.containsKey("school") ? (HashMap) hashMap3.get("school") : null;
                                if (hashMap5 != null) {
                                    hashMap4.put("school", String.valueOf(hashMap5.get("name")));
                                }
                                hashMap4.put("year", Integer.valueOf(ResHelper.parseInt(String.valueOf((hashMap3.containsKey("year") ? (HashMap) hashMap3.get("year") : null).get("name")))));
                                hashMap4.put("background", 0);
                                arrayList2.add(hashMap4);
                            }
                            HashMap hashMap6 = new HashMap();
                            hashMap6.put("list", arrayList2);
                            String fromHashMap = new Hashon().fromHashMap(hashMap6);
                            this.f5036db.put("educationJSONArrayStr", fromHashMap.substring(8, fromHashMap.length() - 1));
                        }
                        ArrayList arrayList3 = a10.containsKey("work") ? (ArrayList) a10.get("work") : null;
                        if (arrayList3 != null) {
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                HashMap hashMap7 = (HashMap) it2.next();
                                HashMap hashMap8 = new HashMap();
                                HashMap hashMap9 = (HashMap) hashMap7.get("employer");
                                if (hashMap9 != null) {
                                    hashMap8.put("company", String.valueOf(hashMap9.get("name")));
                                }
                                HashMap hashMap10 = (HashMap) hashMap7.get("position");
                                if (hashMap10 != null) {
                                    hashMap8.put("position", String.valueOf(hashMap10.get("name")));
                                }
                                Object obj3 = obj2;
                                try {
                                    str2 = str3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    str2 = str3;
                                }
                                try {
                                    String[] split2 = String.valueOf(hashMap7.get(obj3)).split(str2);
                                    hashMap8.put(obj3, Integer.valueOf((ResHelper.parseInt(split2[0]) * 100) + ResHelper.parseInt(split2[1])));
                                } catch (Throwable th3) {
                                    th = th3;
                                    SSDKLog.b().a(th);
                                    Object obj4 = obj;
                                    String[] split3 = String.valueOf(hashMap7.get(obj4)).split(str2);
                                    hashMap8.put(obj4, Integer.valueOf((ResHelper.parseInt(split3[0]) * 100) + ResHelper.parseInt(split3[1])));
                                    arrayList4.add(hashMap8);
                                    obj2 = obj3;
                                    str3 = str2;
                                    obj = obj4;
                                }
                                Object obj42 = obj;
                                String[] split32 = String.valueOf(hashMap7.get(obj42)).split(str2);
                                hashMap8.put(obj42, Integer.valueOf((ResHelper.parseInt(split32[0]) * 100) + ResHelper.parseInt(split32[1])));
                                arrayList4.add(hashMap8);
                                obj2 = obj3;
                                str3 = str2;
                                obj = obj42;
                            }
                            HashMap hashMap11 = new HashMap();
                            hashMap11.put("list", arrayList4);
                            String fromHashMap2 = new Hashon().fromHashMap(hashMap11);
                            this.f5036db.put("workJSONArrayStr", fromHashMap2.substring(8, fromHashMap2.length() - 1));
                        }
                    }
                    PlatformActionListener platformActionListener = this.listener;
                    if (platformActionListener != null) {
                        platformActionListener.onComplete(this, 8, a10);
                        return;
                    }
                    return;
                }
                if (this.listener != null) {
                    this.listener.onError(this, 8, new Throwable(new Hashon().fromHashMap(a10)));
                    return;
                }
                return;
            }
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, 8, new Throwable("response is null"));
            }
        } catch (Throwable th4) {
            PlatformActionListener platformActionListener3 = this.listener;
            if (platformActionListener3 != null) {
                platformActionListener3.onError(this, 8, th4);
            }
        }
    }
}
